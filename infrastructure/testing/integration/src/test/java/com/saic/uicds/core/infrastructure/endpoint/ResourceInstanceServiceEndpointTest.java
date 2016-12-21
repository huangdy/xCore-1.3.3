package com.saic.uicds.core.infrastructure.endpoint;

import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument;
import org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument;
import org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument;
import org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument;
import org.uicds.resourceInstanceService.RegisterRequestDocument;
import org.uicds.resourceInstanceService.RegisterResponseDocument;
import org.uicds.resourceInstanceService.ResourceInstance;
import org.uicds.resourceInstanceService.UnregisterRequestDocument;
import org.uicds.resourceInstanceService.UnregisterResponseDocument;
import org.uicds.resourceProfileService.CreateProfileRequestDocument;
import org.uicds.resourceProfileService.CreateProfileResponseDocument;

import com.saic.uicds.core.infrastructure.exceptions.ResourceInstanceDoesNotExist;
import com.saic.uicds.core.infrastructure.exceptions.ResourceProfileDoesNotExist;
import com.saic.uicds.core.infrastructure.util.ValidationUtil;

/**
 * 
 * @author roger
 * 
 */

//@Ignore
public class ResourceInstanceServiceEndpointTest extends AbstractJpaTests {

    private static final String RESOURCE_ID1 = "resourceID1";

	private static final String LOCAL_RESOURCE_ID1 = "localResourceID1";

	private static final String RESOURCE_ID2 = "resourceID2";

	private static final String LOCAL_RESOURCE_ID2 = "localResourceID2";

	private static final String RESOURCE_ID3 = "resourceID3";

	private static final String LOCAL_RESOURCE_ID3 = "localResourceID3";

	@Autowired
    ResourceInstanceServiceEndpoint resourceInstanceServiceEndpoint;
    
    @Autowired
    ResourceProfileServiceEndpoint resourceProfileServiceEndpoint;
    
    private CreateProfileResponseDocument createProfileResponse;

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-ED-dataSrcContext.xml",
            "classpath:contexts/test-spring-ws-infra-servlet.xml" };
    }

    @Test
    public void testResourceProfileServiceEndpointCreated() {
        assertNotNull("Resource instance service endpoint is null",resourceInstanceServiceEndpoint);
        assertNotNull("Resource profile service endpoint is null",resourceProfileServiceEndpoint);
    }
    
    @Test
    public void testRegisterResourceInstance() {
    	createResourceInstance(RESOURCE_ID1, LOCAL_RESOURCE_ID1, true);
    	
    	checkResourceInstance(RESOURCE_ID1);
    	
    	ResourceInstance[] list = getResourceInstanceList();
    	assertEquals("wrong number in list",1,list.length);
    }
    
    @Test(expected = com.saic.uicds.core.infrastructure.exceptions.ResourceProfileDoesNotExist.class)
    public void testRegisterResourceInstanceWithUnknownProfile() {
    	RegisterRequestDocument request = RegisterRequestDocument.Factory.newInstance();
    	request.addNewRegisterRequest().addNewID().setStringValue(RESOURCE_ID1);
    	request.getRegisterRequest().addNewLocalResourceID().setStringValue(LOCAL_RESOURCE_ID1);
    	request.getRegisterRequest().addNewResourceProfileID().setStringValue("UNKOWN");
    	
    	try {
			resourceInstanceServiceEndpoint.register(request);
			fail("exception expected");
		} catch (ResourceProfileDoesNotExist e) {
			;
		}    	
    }

	@Test
    public void testUnregisterResourceInstance() {
    	createResourceInstance(RESOURCE_ID1, LOCAL_RESOURCE_ID1, true);
    	
    	UnregisterRequestDocument request = UnregisterRequestDocument.Factory.newInstance();
    	request.addNewUnregisterRequest().addNewID().setStringValue(RESOURCE_ID1);
    	
    	try {
			UnregisterResponseDocument response = resourceInstanceServiceEndpoint.unregister(request);
			ValidationUtil.validate(response, true);
			assertNotNull("response is null",response);
			assertNotNull("response content is null",response.getUnregisterResponse());
			assertEquals("wrong response",RESOURCE_ID1,response.getUnregisterResponse().getID().getStringValue());
	    	ResourceInstance[] list = getResourceInstanceList();
	    	assertEquals("resource instance still in list",0,list.length);
		} catch (ResourceInstanceDoesNotExist e) {
			fail("unexpected exception: " + e.getMessage());
		}
    }
	
	@Test 
	public void testUnregisterWithMultipleResourceInstancesAndReregister() {
		createResourceInstance(RESOURCE_ID1, LOCAL_RESOURCE_ID1, true);
		createResourceInstance(RESOURCE_ID2, LOCAL_RESOURCE_ID2, false);
		createResourceInstance(RESOURCE_ID3, LOCAL_RESOURCE_ID3, false);
		checkResourceInstance(RESOURCE_ID1);
		checkResourceInstance(RESOURCE_ID2);
		checkResourceInstance(RESOURCE_ID3);
		
    	UnregisterRequestDocument request = UnregisterRequestDocument.Factory.newInstance();
    	request.addNewUnregisterRequest().addNewID().setStringValue(RESOURCE_ID2);
    	
    	try {
			UnregisterResponseDocument response = resourceInstanceServiceEndpoint.unregister(request);
			ValidationUtil.validate(response, true);
			assertNotNull("response is null",response);
			assertNotNull("response content is null",response.getUnregisterResponse());
			assertEquals("wrong response",RESOURCE_ID2,response.getUnregisterResponse().getID().getStringValue());
	    	ResourceInstance[] list = getResourceInstanceList();
	    	assertEquals("wrong number of instances",2,list.length);
		} catch (ResourceInstanceDoesNotExist e) {
			fail("unexpected exception: " + e.getMessage());
		}

		createResourceInstance(RESOURCE_ID2, LOCAL_RESOURCE_ID2, false);
		checkResourceInstance(RESOURCE_ID2);
    	ResourceInstance[] list = getResourceInstanceList();
    	assertEquals("wrong number of instances after reregister",3,list.length);
	}
    
    @Test(expected = com.saic.uicds.core.infrastructure.exceptions.ResourceInstanceDoesNotExist.class)
    public void testUnregisterUnknownResourceInstance() {
    	createResourceInstance(RESOURCE_ID1, LOCAL_RESOURCE_ID1, true);
    	
    	UnregisterRequestDocument request = UnregisterRequestDocument.Factory.newInstance();
    	request.addNewUnregisterRequest().addNewID().setStringValue("Unknown-" + RESOURCE_ID1);
    	
    	try {
			resourceInstanceServiceEndpoint.unregister(request);
			fail("expected exception");
		} catch (ResourceInstanceDoesNotExist e) {
			;
		}
    }

	private ResourceInstance[] getResourceInstanceList() {
		GetResourceInstanceListRequestDocument request = GetResourceInstanceListRequestDocument.Factory.newInstance();
		request.addNewGetResourceInstanceListRequest().setQueryString("");
		GetResourceInstanceListResponseDocument response = resourceInstanceServiceEndpoint.getResourceInstanceList(request);
		ValidationUtil.validate(response, true);
		ResourceInstance[] list = response.getGetResourceInstanceListResponse().getResourceInstanceList().getResourceInstanceArray();
		return list;
	}

	private void createResourceInstance(String identifier, String localIdentifier, boolean createProfile) {
		if (createProfile) {
			createProfileResponse = createProfile();
		}
    	
    	RegisterRequestDocument request = RegisterRequestDocument.Factory.newInstance();
    	request.addNewRegisterRequest().addNewID().setStringValue(identifier);
    	request.getRegisterRequest().addNewLocalResourceID().setStringValue(localIdentifier);
    	request.getRegisterRequest().addNewResourceProfileID().set(createProfileResponse.getCreateProfileResponse().getProfile().getID());
    	
    	try {
			RegisterResponseDocument response = resourceInstanceServiceEndpoint.register(request);
			assertNotNull("register response is null",response);
			assertEquals("wrong resource id",identifier,response.getRegisterResponse().getResourceInstance().getID().getStringValue());
			assertEquals("wrong number of profiles",1,response.getRegisterResponse().getResourceInstance().getProfileIDs().sizeOfProfileIDArray());
			assertEquals("wrong number of endpoints",1,response.getRegisterResponse().getResourceInstance().getEndpoints().sizeOfEndpointArray());
		} catch (ResourceProfileDoesNotExist e) {
			fail("Exception thrown: " + e.getMessage());
		}
	}

    private void checkResourceInstance(String identifier) {
		GetResourceInstanceRequestDocument request = GetResourceInstanceRequestDocument.Factory.newInstance();
		request.addNewGetResourceInstanceRequest().addNewID().setStringValue(identifier);
		GetResourceInstanceResponseDocument response = resourceInstanceServiceEndpoint.getResourceInstance(request);
		ValidationUtil.validate(response, true);
		assertNotNull("null response",response);
		assertNotNull("null response content",response.getGetResourceInstanceResponse());
		assertEquals("wrong id",identifier,response.getGetResourceInstanceResponse().getResourceInstance().getID().getStringValue());
	}

	private CreateProfileResponseDocument createProfile() {

		try {
			CreateProfileRequestDocument request = CreateProfileRequestDocument.Factory.parse(new File(
			    "../data/CreateResourceProfile1.xml"));
	        CreateProfileResponseDocument response = resourceProfileServiceEndpoint.createProfile(request);
	        assertNotNull(response);
	        assertNotNull(response.getCreateProfileResponse());
	        
	        return response;
	        
		} catch (XmlException e) {
			fail("Exception creating profile for test: " + e.getMessage());
		} catch (IOException e) {
			fail("Exception creating profile for test: " + e.getMessage());
		}
		
		return null;
    }

}
