package com.saic.uicds.core;

import java.util.ArrayList;

import org.junit.Test;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import org.uicds.incidentManagementService.IncidentInfoType;
import org.uicds.profileService.ProfileType;

public class UicdsProfileTest extends AbstractDependencyInjectionSpringContextTests {

    private UicdsProfile uicdsProfile;

    public void setUicdsProfile(UicdsProfile uicdsProfile) {
        this.uicdsProfile = uicdsProfile;
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "classpath:contexts/test-application.xml" };
    }

    @Test
    public void testSetWebServiceTemplate() {
        assertTrue(uicdsProfile != null);
        assertTrue(uicdsProfile.getCoreServiceTemplate() != null);
    }

    @Test
    public void testGetProfileList() {
        ArrayList<ProfileType> profiles = uicdsProfile.getProfileList();
        assertTrue("Array is empty", profiles.size() > 0);
    }

    @Test
    public void testGetProfile() {
        ProfileType profile = uicdsProfile.getFirstProfile();
        assertTrue("Profile is null", profile != null);
    }

    @Test
    public void testGetPullpoint() {
        String pullPoint = uicdsProfile.getPullpointAddressForIncident("");
        assertTrue("pull point is null", pullPoint != null);
        assertTrue("pull point is wrong " + pullPoint,
                pullPoint.equals(CoreServiceTemplateTestImpl.PULL_POINT));
        System.out.println(pullPoint);
    }
}
