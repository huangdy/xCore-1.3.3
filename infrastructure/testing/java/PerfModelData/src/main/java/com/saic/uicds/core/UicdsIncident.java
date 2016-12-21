/**
 * 
 */
package com.saic.uicds.core;

import java.util.HashMap;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.uicds.incident.IncidentDocument;
import org.uicds.incident.UICDSIncidentType;
import org.uicds.incidentManagementService.CreateIncidentRequestDocument;
import org.uicds.incidentManagementService.CreateIncidentResponseDocument;
import org.uicds.incidentManagementService.UpdateIncidentRequestDocument;
import org.uicds.incidentManagementService.UpdateIncidentResponseDocument;
import org.uicds.workProductService.GetAssociatedWorkProductListRequestDocument;
import org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument;
import org.uicds.workProductService.GetProductRequestDocument;
import org.uicds.workProductService.GetProductResponseDocument;
import org.uicds.workProductService.WorkProductSummaryListDocument.WorkProductSummaryList;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.base.ProcessingStateType;
import com.saic.precis.x2009.x06.base.PropertiesType;
import com.saic.precis.x2009.x06.base.ProcessingStateType.Enum;
import com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct;
import com.saic.precis.x2009.x06.structures.WorkProductSummaryDocument.WorkProductSummary;

import x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType;
import x0.oasisNamesTcEmergencyEDXLDE1.ValueListType;
import x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution;

/**
 * @author roger
 *
 */
public class UicdsIncident {
	
	private static final String INCIDENT_SERVICE_NS = "http://uicds.org/incident";
	private static final String INCIDENT_ELEMENT_NAME = "incident";
	private static final String INCIDENT_WP_TYPE = "incident";
	
	private UICDSIncidentType incidentDoc;
	private IdentificationType incidentDocID;
	private String incidentID;
	
	private HashMap<String,UicdsWorkProduct> workProducts = new HashMap<String,UicdsWorkProduct>();
		
    private CoreServiceTemplate coreServiceTemplate;
    
	public void setCoreServiceTemplate(CoreServiceTemplate coreServiceTemplate) {
		this.coreServiceTemplate = coreServiceTemplate;
	}
	
	public CoreServiceTemplate getCoreServiceTemplate() {
		return coreServiceTemplate;
	}
	
	public UicdsIncident() {
	}

	public void setIncidentDocument(UICDSIncidentType doc) {
		incidentDoc = doc;
	}
	
//	public void instantiateFromCore(String workProductID) {
//		incidentDocument = getWorkProduct(workProductID);
//	}
	
	public String createOnCore() {
		String wpid = null;
		CreateIncidentRequestDocument request = CreateIncidentRequestDocument.Factory.newInstance();
		request.addNewCreateIncidentRequest().setIncident(incidentDoc);
		
		CreateIncidentResponseDocument response = (CreateIncidentResponseDocument) coreServiceTemplate
        .marshalSendAndReceive(request);
		
        Enum status = response.getCreateIncidentResponse().getWorkProductPublicationResponse().getWorkProductProcessingStatus().getStatus();
        
        // If the create was accepted then get the id and all the associated documents
        if (status == ProcessingStateType.ACCEPTED) {
        	
        	// Get the incidents work product id
        	IdentificationType workProductID = response.getCreateIncidentResponse().getWorkProductPublicationResponse().getWorkProductSummary().getWorkProductIdentification();        	
    		wpid = workProductID.getIdentifier().getStringValue();
    		
    		// Get the incident id
    		PropertiesType properties = response.getCreateIncidentResponse().getWorkProductPublicationResponse().getWorkProductSummary().getWorkProductProperties();
    		if (properties.getAssociatedGroups().sizeOfIdentifierArray() > 0) {
    			incidentID = properties.getAssociatedGroups().getIdentifierArray(0).getStringValue();
    		}
    		
    		// update all the work products for the incident
    		updateAllWorkProducts();    		
        }

		return wpid;
	}
	
	public void addWorkProduct(String id, WorkProduct workProduct) {
		workProducts.put(id, new UicdsWorkProduct(workProduct));
	}
	
	public void deleteWorkProduct(String id) {
		workProducts.remove(id);
	}

	public HashMap<String, UicdsWorkProduct> getWorkProductMap() {
		return workProducts;
	}
	
//	public HashMap<String, UicdsWorkProduct> get
	
	public void updateAllWorkProducts() {
		GetAssociatedWorkProductListRequestDocument request = GetAssociatedWorkProductListRequestDocument.Factory.newInstance();
		
		request.setGetAssociatedWorkProductListRequest(incidentID);
		
		GetAssociatedWorkProductListResponseDocument response = (GetAssociatedWorkProductListResponseDocument)
			coreServiceTemplate.marshalSendAndReceive(request);
		
		WorkProductSummaryList wpsList = response.getGetAssociatedWorkProductListResponse().getWorkProductSummaryList();
		if (wpsList != null && wpsList.sizeOfWorkProductSummaryArray() > 0) {
			WorkProductSummary[] wpsArray = wpsList.getWorkProductSummaryArray();
			for (WorkProductSummary wps : wpsArray) {
				WorkProduct wp = getWorkProduct(wps.getWorkProductIdentification());
				workProducts.put(wps.getWorkProductIdentification().getIdentifier().getStringValue(), new UicdsWorkProduct(wp));				
				if (wps.getWorkProductIdentification().getType().getStringValue().equalsIgnoreCase(INCIDENT_WP_TYPE)) {
					updateFromWorkProduct(wp);
				}
			}
		}		
	}

	public String getIncidentId() {
		String id = null;
		if (incidentDoc != null && incidentDoc.sizeOfActivityIdentificationArray() > 0) {
			if (incidentDoc.getActivityIdentificationArray(0).sizeOfIdentificationIDArray() > 0) {
				id = incidentDoc.getActivityIdentificationArray(0).getIdentificationIDArray(0).getStringValue();
			}
		}
		else {
//			System.out.println("ERROR: "+incidentDoc);
		}
		return id;
	}
	
	private WorkProduct getWorkProduct(IdentificationType workProductID) {
		GetProductRequestDocument request = GetProductRequestDocument.Factory.newInstance();
		request.addNewGetProductRequest().setWorkProductIdentification(workProductID);
		GetProductResponseDocument response = (GetProductResponseDocument) coreServiceTemplate
			.marshalSendAndReceive(request);
		return response.getGetProductResponse().getWorkProduct();
	}

	public void createFromWorkProduct(IdentificationType workProductID) {
		WorkProduct wp = getWorkProduct(workProductID);
		if (wp.sizeOfStructuredPayloadArray() > 0) {
			updateFromWorkProduct(wp);
		}
		
		// update all the work products for the incident
		updateAllWorkProducts();		
	}

	private void updateFromWorkProduct(WorkProduct wp) {
		IncidentDocument id = null;
		XmlObject[] objects = wp.getStructuredPayloadArray(0).selectChildren(new QName(INCIDENT_SERVICE_NS, INCIDENT_ELEMENT_NAME));
		if (objects.length > 0) {
			try {
				id = IncidentDocument.Factory.parse(objects[0].getDomNode());
			} catch (XmlException e) {
				System.err.println("Error parsing IncidentDocument from payload: "+e.getMessage());
			}
		}
		incidentDoc = id.getIncident();
		
		incidentDocID = UicdsWorkProduct.getIdentificationElement(wp);
//		System.out.println(incidentDocID);
	}

	public void updateIncident() {
		UpdateIncidentRequestDocument request = UpdateIncidentRequestDocument.Factory.newInstance();
		UICDSIncidentType t = incidentDoc;
		if (t.sizeOfIncidentLocationArray() < 1) {
			System.err.println("NO location in the incident");
//			System.out.println(t.xmlText());
		}
		else {
			if (t.getIncidentLocationArray(0).sizeOfLocationAreaArray() < 1) {
				System.err.println("NO location area in incident");
			}
		}
		if (incidentDocID != null) {
			request.addNewUpdateIncidentRequest().setIncident(t);
			request.getUpdateIncidentRequest().addNewWorkProductIdentification().set(incidentDocID);

//			System.out.println("update REQUEST: "+request);
			UpdateIncidentResponseDocument response = (UpdateIncidentResponseDocument) coreServiceTemplate
			.marshalSendAndReceive(request);
		}
		else {
			System.err.println("Incident work product identification element is null");
		}
	}
	
	private UICDSIncidentType getIncidentDocumentFromEDXLDE(EDXLDistribution edxl) 
	{
		UICDSIncidentType t = null;
		
		QName incidentQname = new QName("http://uicds.org/incident","incident");
		XmlObject[] incs = edxl.getContentObjectArray(0).getXmlContent()
		.getEmbeddedXMLContentArray(0).selectChildren(incidentQname);
		if (incs.length > 0) {
			t = (UICDSIncidentType) incs[0];
		}

		return t;
	}
}
