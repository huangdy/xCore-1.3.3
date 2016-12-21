package com.saic.uicds.core.em.have.endpoint;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.uicds.haveService.EdxlDeMessageErrorType;
import org.uicds.haveService.EdxlDeRequestDocument;
import org.uicds.haveService.EdxlDeResponseDocument;
import org.uicds.haveService.GetHAVEMessagesRequestDocument;
import org.uicds.haveService.GetHAVEMessagesResponseDocument;
import org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument;
import org.uicds.incidentManagementService.IncidentListType;
import org.uicds.workProductService.WorkProductListDocument.WorkProductList;

import x0.oasisNamesTcEmergencyEDXLDE1.ContentObjectType;
import x0.oasisNamesTcEmergencyEDXLDE1.ValueSchemeType;

import com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct;
import com.saic.uicds.core.em.exceptions.SendMessageErrorException;
import com.saic.uicds.core.em.have.service.HAVEService;
import com.saic.uicds.core.em.have.service.impl.HAVEServiceImpl;
import com.saic.uicds.core.em.service.IncidentManagementService;
import com.saic.uicds.core.infrastructure.exceptions.InvalidXpathException;
import com.saic.uicds.core.infrastructure.service.CommunicationsService;
import com.saic.uicds.core.infrastructure.service.ConfigurationService;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

/**
 * 
 * @author roger
 * 
 */
public class HAVEServiceEndpointTest extends AbstractXmldbJpaTests {
	
	private static final String CORE1_NAME = "core1";

	private static final String UICDS_USER = "uicds";

	Logger log = LoggerFactory.getLogger(HAVEServiceEndpointTest.class);

    HaveServiceEndpoint haveServiceEndpoint = new HaveServiceEndpoint();
    
    @Autowired
    HAVEService haveService;

    @Autowired
    ConfigurationService configurationService;

    @Autowired
    WorkProductService workProductService;
    
    @Autowired
    IncidentManagementService incidentManagementService;

    private String incidentID = null;

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/applicationContext-have.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
    
    @Override
    protected void onSetUpInTransaction() throws Exception {
    	haveServiceEndpoint.setHaveService(haveService);
    	if (haveService instanceof HAVEServiceImpl) {
    		((HAVEServiceImpl)haveService).setupDigestTransformation();
    	}
    	
        IncidentListType incidents = incidentManagementService.getListOfIncidents();
        if (incidents.sizeOfIncidentInfoArray() == 0) {
            // create an incident
            CreateIncidentFromCapRequestDocument request = CreateIncidentFromCapRequestDocument.Factory.parse(new File(
                "../testing/data/CreateIncidentFromCap.xml"));
            ProductPublicationStatus response = incidentManagementService.createIncidentFromCap(request.getCreateIncidentFromCapRequest().getAlert());
            Set<String> ids = response.getProduct().getAssociatedInterestGroupIDs();
            if (ids.size() > 0) {
                Iterator<String> itr = ids.iterator();
                incidentID = itr.next();
            }
        }
        // else get the incident id
        else {
            incidentID = incidents.getIncidentInfoArray(0).getId();
        }
    };
    
    @Test
    public void testHAVEServiceCreation() {
        assertNotNull(haveServiceEndpoint);
        assertNotNull(haveServiceEndpoint.getHaveService());
        assertNotNull(workProductService);
        
        try {
        	List<com.saic.uicds.core.infrastructure.model.WorkProduct> list = workProductService.getProductByTypeAndXQuery(HAVEService.HAVE_PRODUCT_TYPE, null, null);
        	assertEquals("wrong number of wps",0,list.size());
        } catch (InvalidXpathException e) {
        	fail("checking that no EDXL-HAVE work product exist");
        }
    }


    @Test
    public void testOneUnassociatedHAVE() throws Exception {
        EdxlDeRequestDocument request = EdxlDeRequestDocument.Factory.parse(new File(
            "src/test/resources/HAVE-EdxlDeRequest.xml"));

        removeExplicitAddresses(request);

        EdxlDeResponseDocument response = haveServiceEndpoint.edxldeRequest(request);

        int numberOfHAVEProducts = 1;
        checkCreateHAVEResponse(response, numberOfHAVEProducts);
        
        GetHAVEMessagesRequestDocument getRequest = GetHAVEMessagesRequestDocument.Factory.newInstance();
        getRequest.addNewGetHAVEMessagesRequest();
        GetHAVEMessagesResponseDocument getResponse = haveServiceEndpoint.getHaveMessages(getRequest);
        
        checkResponseWorkProductList(getResponse, numberOfHAVEProducts);
        
//        System.out.println(getResponse);
    }

    @Test
    public void testOneUnassociatedHAVEWithNoAgreementException() throws Exception {
        EdxlDeRequestDocument request = EdxlDeRequestDocument.Factory.parse(new File(
            "src/test/resources/HAVE-EdxlDeRequest.xml"));

        addExplicitAddresses(request, UICDS_USER + "@" + CORE1_NAME);

        EdxlDeResponseDocument response = haveServiceEndpoint.edxldeRequest(request);

        int numberOfHAVEProducts = 1;
        
        assertEquals("not failure",true,response.getEdxlDeResponse().getErrorExists());
        assertTrue("no failure message",response.getEdxlDeResponse().getErrorString().contains("Failure"));
        assertEquals("no core errors",1,response.getEdxlDeResponse().sizeOfCoreErrorArray());
        EdxlDeMessageErrorType[] coreErrors = response.getEdxlDeResponse().getCoreErrorArray();
        assertEquals("wrong core",CORE1_NAME,coreErrors[0].getCoreName());
        assertEquals("wrong core error",SendMessageErrorException.SEND_MESSAGE_ERROR_TYPE.NO_SHARE_AGREEMENT.toString(),coreErrors[0].getError());
        
        GetHAVEMessagesRequestDocument getRequest = GetHAVEMessagesRequestDocument.Factory.newInstance();
        getRequest.addNewGetHAVEMessagesRequest();
        GetHAVEMessagesResponseDocument getResponse = haveServiceEndpoint.getHaveMessages(getRequest);
        
        checkResponseWorkProductList(getResponse, numberOfHAVEProducts);
        
//        System.out.println(getResponse);
    }

    @Test
    public void testOneAssociatedHAVE() throws Exception {
        EdxlDeRequestDocument request = EdxlDeRequestDocument.Factory.parse(new File(
            "src/test/resources/HAVE-EdxlDeRequest.xml"));

        removeExplicitAddresses(request);
        
        addIncidentID(request,incidentID);

        EdxlDeResponseDocument response = haveServiceEndpoint.edxldeRequest(request);

        int numberOfHAVEProducts = 1;
        checkCreateHAVEResponse(response, numberOfHAVEProducts);
        
        GetHAVEMessagesRequestDocument getRequest = GetHAVEMessagesRequestDocument.Factory.newInstance();
        getRequest.addNewGetHAVEMessagesRequest();
        getRequest.getGetHAVEMessagesRequest().setIncidentID(incidentID);
        GetHAVEMessagesResponseDocument getResponse = haveServiceEndpoint.getHaveMessages(getRequest);
        
        int numberOfWorkProducts = 1;
        checkResponseWorkProductList(getResponse, numberOfWorkProducts);
        
//        System.out.println(getResponse);
    }

    @Test
    public void testOneAssociatedBadIncidentIDHAVE() throws Exception {
        EdxlDeRequestDocument request = EdxlDeRequestDocument.Factory.parse(new File(
            "src/test/resources/HAVE-EdxlDeRequest-BadIncidentID.xml"));

        removeExplicitAddresses(request);
        
        addIncidentID(request,incidentID);

        EdxlDeResponseDocument response = haveServiceEndpoint.edxldeRequest(request);

        int numberOfHAVEProducts = 1;
        checkCreateHAVEResponse(response, numberOfHAVEProducts);
        
        GetHAVEMessagesRequestDocument getRequest = GetHAVEMessagesRequestDocument.Factory.newInstance();
        getRequest.addNewGetHAVEMessagesRequest();
        getRequest.getGetHAVEMessagesRequest().setIncidentID(incidentID);
        GetHAVEMessagesResponseDocument getResponse = haveServiceEndpoint.getHaveMessages(getRequest);
        
        int numberOfWorkProducts = 1;
        checkResponseWorkProductList(getResponse, numberOfWorkProducts);
        
//        System.out.println(getResponse);
    }
    
    @Test
    public void testUpdateHAVE() throws Exception {
    	EdxlDeRequestDocument request = EdxlDeRequestDocument.Factory.parse(new File(
    	"src/test/resources/HAVE-EdxlDeRequest.xml"));

    	removeExplicitAddresses(request);
        addIncidentID(request,incidentID);

    	EdxlDeResponseDocument response = haveServiceEndpoint.edxldeRequest(request);

    	request = EdxlDeRequestDocument.Factory.parse(new File(
            "src/test/resources/HAVE-EdxlDeRequest2.xml"));

        removeExplicitAddresses(request);
        addIncidentID(request,incidentID);

        response = haveServiceEndpoint.edxldeRequest(request);

        GetHAVEMessagesRequestDocument getRequest = GetHAVEMessagesRequestDocument.Factory.newInstance();
        getRequest.addNewGetHAVEMessagesRequest();
        getRequest.getGetHAVEMessagesRequest().setIncidentID(incidentID);
        GetHAVEMessagesResponseDocument getResponse = haveServiceEndpoint.getHaveMessages(getRequest);
        
        // should update the work product so the count is still one
        int numberOfHAVEProducts = 1;
        checkResponseWorkProductList(getResponse, numberOfHAVEProducts);
        
        getAndCheckHAVEMessage();
        
//        System.out.println(getResponse);
    }

	private void getAndCheckHAVEMessage() {
		GetHAVEMessagesRequestDocument request = GetHAVEMessagesRequestDocument.Factory.newInstance();
		request.addNewGetHAVEMessagesRequest();
		request.getGetHAVEMessagesRequest().setIncidentID(incidentID);
		
		GetHAVEMessagesResponseDocument response = haveServiceEndpoint.getHaveMessages(request);
		
		assertNotNull("response is null",response);
		assertNotNull("no content in response",response.getGetHAVEMessagesResponse());
		assertNotNull("no work product list in response",response.getGetHAVEMessagesResponse().getWorkProductList());
		assertEquals("no work product",1,response.getGetHAVEMessagesResponse().getWorkProductList().sizeOfWorkProductArray());
	}

	public void checkCreateHAVEResponse(EdxlDeResponseDocument response,
			int numberOfHAVEProducts) throws InvalidXpathException {
		assertNotNull(response);
        assertFalse("error reported",response.getEdxlDeResponse().getErrorExists());
        assertTrue("have errors",response.getEdxlDeResponse().sizeOfCoreErrorArray() == 0);
        assertNotNull("digest is null",response.getEdxlDeResponse().getDigest());
        
        List<com.saic.uicds.core.infrastructure.model.WorkProduct> list = workProductService.getProductByTypeAndXQuery(HAVEService.HAVE_PRODUCT_TYPE, null, null);
        assertEquals("wrong number of work products",numberOfHAVEProducts,list.size());
	}

	private void addIncidentID(EdxlDeRequestDocument request, String incidentID2) {
		ContentObjectType content = request.getEdxlDeRequest().getEDXLDistribution().getContentObjectArray(0);
		content.setIncidentID(incidentID);
	}

	public void checkResponseWorkProductList(
			GetHAVEMessagesResponseDocument getResponse,
			int numberOfWorkProducts) {
		assertNotNull("get response is null",getResponse);
        assertNotNull("get data is null",getResponse.getGetHAVEMessagesResponse());
        assertNotNull("no work product list",getResponse.getGetHAVEMessagesResponse().getWorkProductList());
        WorkProductList wpList = getResponse.getGetHAVEMessagesResponse().getWorkProductList();
        assertEquals("wrong num work products",numberOfWorkProducts,wpList.sizeOfWorkProductArray());
        for (int i = 0; i < numberOfWorkProducts; i++) {
            WorkProduct wp = wpList.getWorkProductArray(i);
            assertEquals("unexpected playload",0,wp.sizeOfStructuredPayloadArray());
            assertNotNull("no digest",wp.getDigestAbstract());        	
        }
	}

    private void removeExplicitAddresses(EdxlDeRequestDocument request) {
        while (request.getEdxlDeRequest().getEDXLDistribution().sizeOfExplicitAddressArray() > 0) {
            request.getEdxlDeRequest().getEDXLDistribution().removeExplicitAddress(0);
        }
    }
    
    private void addExplicitAddresses(EdxlDeRequestDocument request, String uicdsUser) {
    	ValueSchemeType exAdd = request.getEdxlDeRequest().getEDXLDistribution().addNewExplicitAddress();
    	exAdd.setExplicitAddressScheme(CommunicationsService.UICDSExplicitAddressScheme);
    	exAdd.addExplicitAddressValue(uicdsUser);
    }

}
