package com.saic.uicds.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import net.opengis.context.ViewContextDocument;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.uicds.incident.IncidentDocument;
import org.uicds.incident.UICDSIncidentType;
import org.uicds.incidentManagementService.CreateIncidentRequestDocument;
import org.uicds.incidentManagementService.CreateIncidentResponseDocument;
import org.uicds.incidentManagementService.IncidentInfoType;
import org.uicds.incidentManagementService.UpdateIncidentRequestDocument;
import org.uicds.incidentManagementService.UpdateIncidentResponseDocument;
import org.uicds.profileService.GetProfileListRequestDocument;
import org.uicds.profileService.GetProfileListResponseDocument;
import org.uicds.profileService.ProfileType;
import org.uicds.workProductService.GetAssociatedWorkProductListRequestDocument;
import org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument;
import org.uicds.workProductService.GetProductRequestDocument;
import org.uicds.workProductService.GetProductResponseDocument;
import org.w3.x2005.x08.addressing.EndpointReferenceType;

import com.saic.precis.x2009.x06.base.ProcessingStateType;
import com.saic.precis.x2009.x06.base.ProcessingStatusType;
import com.saic.precis.x2009.x06.base.PropertiesType;
import com.saic.precis.x2009.x06.base.StateType;
import com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct;
import com.saic.precis.x2009.x06.structures.WorkProductSummaryDocument.WorkProductSummary;

import x0.messageStructure1.StructuredPayloadType;
import x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType;
import x0.oasisNamesTcEmergencyEDXLDE1.ValueListType;

public class CoreServiceTemplateTestImpl implements CoreServiceTemplate {

    public static final String PULL_POINT = "http://clash.us.saic.com:8080/uicds/ws/IncidentCommander@core1.saic.com";
    public static final String INCIDENT_ID = "138";
    public static final String INCIDENT_NAME = "fire";
    public static final String INCIDENT_WORK_PRODUCT_TYPE = "Incident";
    public static final String INCIDENT_WORK_PRODUCT_ID = INCIDENT_WORK_PRODUCT_TYPE + "-22";
    public static final String MAP_WORK_PRODUCT_TYPE = "Map";
    public static final String MAP_WORK_PRODUCT_ID = MAP_WORK_PRODUCT_TYPE + "-767";
    private XmlObject incidentDocument = null;
    private XmlObject mapDocument = null;

    public void setIncidentDocument(XmlObject obj) {
        incidentDocument = obj;
    }

    public void setMapDocument(XmlObject obj) {
        mapDocument = obj;
    }

    void setup() {
        incidentDocument = getIncidentSample();
        mapDocument = getMapSample();
    }

    @Override
    public XmlObject marshalSendAndReceive(XmlObject request) {
        XmlObject response = null;

        // Profile Request
        if (request instanceof GetProfileListRequestDocument) {
            GetProfileListResponseDocument r = GetProfileListResponseDocument.Factory.newInstance();
            r.addNewGetProfileListResponse().addNewProfileList();
            ProfileType profile = r.getGetProfileListResponse().getProfileList().addNewProfile();

            // Add a pull point
            EndpointReferenceType endpoint = profile.addNewInterfaces().addNewInterface();
            endpoint.addNewAddress().setStringValue(PULL_POINT);

            // Add an incident
            IncidentInfoType incident = IncidentInfoType.Factory.newInstance();
            incident.setId(INCIDENT_ID);
            incident.setName(INCIDENT_NAME);
            incident.setWorkProductId(INCIDENT_WORK_PRODUCT_ID);

            response = r;
        }

        else if (request instanceof CreateIncidentRequestDocument) {
            CreateIncidentResponseDocument r = CreateIncidentResponseDocument.Factory.newInstance();
            
            // set the create as accepted
            ProcessingStatusType status = r.addNewCreateIncidentResponse().addNewWorkProductPublicationResponse().addNewWorkProductProcessingStatus();
            status.setStatus(ProcessingStateType.ACCEPTED);
            
            // Add a simple summary
            WorkProductSummary summary = r.getCreateIncidentResponse().getWorkProductPublicationResponse().addNewWorkProductSummary();
            summary.addNewWorkProductIdentification().addNewIdentifier().setStringValue(INCIDENT_WORK_PRODUCT_ID);
            summary.getWorkProductIdentification().addNewType().setStringValue(INCIDENT_WORK_PRODUCT_TYPE);
            summary.getWorkProductIdentification().setState(StateType.ACTIVE);
            
            summary.addNewWorkProductProperties().addNewAssociatedGroups().addNewIdentifier().setStringValue(INCIDENT_ID);

            response = r;
        }

        else if (request instanceof GetAssociatedWorkProductListRequestDocument) {
            GetAssociatedWorkProductListResponseDocument r = GetAssociatedWorkProductListResponseDocument.Factory.newInstance();

            // Add incident id
            WorkProductSummary iwps = r.addNewGetAssociatedWorkProductListResponse().addNewWorkProductSummaryList().addNewWorkProductSummary();
            iwps.addNewWorkProductIdentification().addNewIdentifier().setStringValue(INCIDENT_WORK_PRODUCT_ID);
            iwps.getWorkProductIdentification().addNewType().setStringValue(INCIDENT_WORK_PRODUCT_TYPE);            
            iwps.addNewWorkProductProperties().addNewAssociatedGroups().addNewIdentifier().setStringValue(INCIDENT_ID);

            // Add map product id
            WorkProductSummary mwps = r.getGetAssociatedWorkProductListResponse().getWorkProductSummaryList().addNewWorkProductSummary();
            mwps.addNewWorkProductIdentification().addNewIdentifier().setStringValue(MAP_WORK_PRODUCT_ID);
            mwps.getWorkProductIdentification().addNewType().setStringValue(MAP_WORK_PRODUCT_TYPE);
            mwps.addNewWorkProductProperties().addNewAssociatedGroups().addNewIdentifier().setStringValue(INCIDENT_ID);

            response = r;
        }

        else if (request instanceof GetProductRequestDocument) {
        	
        	// Get the request
            GetProductRequestDocument d = (GetProductRequestDocument) request;

            // Create a response
            GetProductResponseDocument r = GetProductResponseDocument.Factory.newInstance();
            r.addNewGetProductResponse().addNewWorkProduct().addNewPackageMetadata();
            
            // Set id
            UicdsWorkProduct.setIdentifierElement(r.getGetProductResponse().getWorkProduct().getPackageMetadata().addNewPackageMetadataExtensionAbstract(),
            		d.getGetProductRequest().getWorkProductIdentification());
           
            // Set the content and properties
            if (d.getGetProductRequest().getWorkProductIdentification().getType().getStringValue().startsWith(INCIDENT_WORK_PRODUCT_TYPE)) {
                setIncidentDataContent(r.getGetProductResponse().getWorkProduct());
            } else if (d.getGetProductRequest().getWorkProductIdentification().getType().getStringValue().startsWith(MAP_WORK_PRODUCT_TYPE)) {
                setMapContent(r.getGetProductResponse().getWorkProduct());
            }

            response = r;
        }

        else if (request instanceof UpdateIncidentRequestDocument) {
            UpdateIncidentResponseDocument r = UpdateIncidentResponseDocument.Factory.newInstance();
//            ContentObjectType content = r.addNewUpdateIncidentResponse().addNewEDXLDistribution().addNewContentObject();
//            setIncidentDataContent(content);
            response = r;
        }

        return response;
    }

    private void setIncidentDataContent(WorkProduct workProduct) {
    	// Set the properties
    	PropertiesType properties = PropertiesType.Factory.newInstance();
    	properties.addNewAssociatedGroups().addNewIdentifier().setStringValue(INCIDENT_ID);
    	
    	if (workProduct.getPackageMetadata() == null) {
    		workProduct.addNewPackageMetadata();
    	}
    	UicdsWorkProduct.setPropertiesElement(workProduct.getPackageMetadata().addNewPackageMetadataExtensionAbstract(), properties);
    	
    	if (incidentDocument instanceof UICDSIncidentType) {
    		((UICDSIncidentType)incidentDocument).setId(INCIDENT_ID);
    	}
    	workProduct.addNewStructuredPayload().set(incidentDocument);
    	
    	workProduct.getStructuredPayloadArray(0).addNewStructuredPayloadMetadata().addNewCommunityPedigreeURI().setStringValue("URI");
//    	System.out.println("HERE: "+incidentDocument);
    }

    private void setMapContent(WorkProduct workProduct) {
    	// Set the properties
    	PropertiesType properties = PropertiesType.Factory.newInstance();
    	properties.addNewAssociatedGroups().addNewIdentifier().setStringValue(INCIDENT_ID);
    	
    	if (workProduct.getPackageMetadata() == null) {
    		workProduct.addNewPackageMetadata();
    	}
    	UicdsWorkProduct.setPropertiesElement(workProduct.getPackageMetadata().addNewPackageMetadataExtensionAbstract(), properties);
    	
    	workProduct.addNewStructuredPayload().set(mapDocument);
    }

    public IncidentDocument getIncidentSample() {
        try {
            InputStream in = new FileInputStream(
                    "src/test/resources/workproduct/IncidentSample.xml");
            IncidentDocument incidentDoc = IncidentDocument.Factory.parse(in);
//            UICDSIncidentType incidentType = UICDSIncidentType.Factory.parse(in);
            UICDSIncidentType incidentType = incidentDoc.getIncident();
            incidentType.addNewActivityIdentification().addNewIdentificationID().setStringValue(INCIDENT_ID);
            incidentType.setId(INCIDENT_ID);
//            System.out.println(incidentType);
            return incidentDoc;
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (XmlException e) {
            System.err.println("error parsing files");
        } catch (IOException e) {
            System.err.println("File not found");
        }
        return null;
    }

    public ViewContextDocument getMapSample() {
        try {
            InputStream in = new FileInputStream("src/test/resources/workproduct/ViewContext.xml");
            ViewContextDocument viewContext = ViewContextDocument.Factory.parse(in);
            return viewContext;
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (XmlException e) {
            System.err.println("error parsing files");
        } catch (IOException e) {
            System.err.println("File not found");
        }
        return null;
    }

    @Override
    public void setWebServiceTemplate(WebServiceTemplate webServiceTemplate) {

    }

}
