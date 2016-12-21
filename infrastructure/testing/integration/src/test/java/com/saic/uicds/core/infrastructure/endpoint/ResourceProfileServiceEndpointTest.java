package com.saic.uicds.core.infrastructure.endpoint;

import java.io.File;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.uicds.resourceProfileService.CreateProfileRequestDocument;
import org.uicds.resourceProfileService.CreateProfileResponseDocument;
import org.uicds.resourceProfileService.GetProfileRequestDocument;
import org.uicds.resourceProfileService.GetProfileResponseDocument;

/**
 * 
 * @author roger
 * 
 */
public class ResourceProfileServiceEndpointTest extends AbstractJpaTests {

    @Autowired
    ResourceProfileServiceEndpoint resourceProfileServiceEndpoint;

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-ED-dataSrcContext.xml",
            "classpath:contexts/test-spring-ws-infra-servlet.xml" };
    }

    @Test
    public void testResourceProfileServiceEndpointCreated() {
        assertNotNull(resourceProfileServiceEndpoint);
    }

    @Test
    public void testCreateProfile() throws Exception {

        CreateProfileRequestDocument request = CreateProfileRequestDocument.Factory.parse(new File(
            "../data/CreateResourceProfile1.xml"));

        CreateProfileResponseDocument response = resourceProfileServiceEndpoint.createProfile(request);
        assertNotNull(response);
        assertNotNull(response.getCreateProfileResponse());
        assertTrue(response.getCreateProfileResponse().getProfile().getInterests().sizeOfInterestArray() == 2);
        assertTrue(response.getCreateProfileResponse().getProfile().getResourceTyping().sizeOfTypeArray() == 4);
        // System.out.println(response);

        GetProfileRequestDocument getRequest = GetProfileRequestDocument.Factory.newInstance();
        getRequest.addNewGetProfileRequest().addNewID().setStringValue(
            request.getCreateProfileRequest().getProfile().getID().getStringValue());

        GetProfileResponseDocument getResponse = resourceProfileServiceEndpoint.getProfile(getRequest);
        assertNotNull(getResponse);
        assertNotNull(getResponse.getGetProfileResponse());
        assertNotNull(getResponse.getGetProfileResponse().getProfile());
        assertTrue(getResponse.getGetProfileResponse().getProfile().getInterests().sizeOfInterestArray() == 2);
        assertTrue(getResponse.getGetProfileResponse().getProfile().getResourceTyping().sizeOfTypeArray() == 4);
        // System.out.println(getResponse);
    }

}
