/**
 * 
 */
package com.saic.uicds.core;

import java.util.ArrayList;

import org.w3.x2005.x08.addressing.EndpointReferenceType;

import org.uicds.incidentManagementService.IncidentInfoType;
import org.uicds.profileService.CreateProfileRequestDocument;
import org.uicds.profileService.CreateProfileResponseDocument;
import org.uicds.profileService.GetProfileListRequestDocument;
import org.uicds.profileService.GetProfileListResponseDocument;
import org.uicds.profileService.ProfileType;
import org.uicds.profileService.GetProfileListRequestDocument.GetProfileListRequest;
import org.uicds.profileService.ProfileType.Interfaces;

/**
 * @author roger
 * 
 */
public class UicdsProfile {

    static public String profileQueryString = "";

    private CoreServiceTemplate coreServiceTemplate;

    private ProfileType profile;

    public CoreServiceTemplate getCoreServiceTemplate() {
        return coreServiceTemplate;
    }

    public void setCoreServiceTemplate(CoreServiceTemplate coreServiceTemplate) {
        this.coreServiceTemplate = coreServiceTemplate;
    }

    private void createProfile() {
        // TODO Auto-generated method stub

    }

    public ProfileType getFirstProfile() {
        profile = null;
        if (getProfileList().size() > 0) {
            profile = getProfileList().get(0);
        }
        return profile;
    }

    public ArrayList<ProfileType> getProfileList() {

        ArrayList<ProfileType> profiles = new ArrayList<ProfileType>();

        if (coreServiceTemplate == null) {
            System.err.println("coreServiceTemplate is null");
            return profiles;
        }

        GetProfileListRequestDocument request = GetProfileListRequestDocument.Factory.newInstance();

        GetProfileListRequest getListRequest = request.addNewGetProfileListRequest();
        getListRequest.setQueryString(profileQueryString);

        GetProfileListResponseDocument response = (GetProfileListResponseDocument) coreServiceTemplate.marshalSendAndReceive(request);

        if (response != null && response.getGetProfileListResponse() != null
                && response.getGetProfileListResponse().getProfileList() != null
                && response.getGetProfileListResponse().getProfileList().sizeOfProfileArray() > 0) {
            ProfileType[] profileList = response.getGetProfileListResponse().getProfileList().getProfileArray();
            // Access each profile
            for (int i = 0; i < profileList.length; i++) {
                profiles.add(profileList[i]);
            }

            // set the profile to the first one
            if (profiles.size() > 0) {
                profile = profiles.get(0);
            }
        }

        return profiles;
    }

    public String getPullpointAddressForIncident(String incidentID) {

        // TODO: fix once the profile has a separate end point per incident
        String pullPointAddress = null;

        if (profile != null) {
            Interfaces interfaces = profile.getInterfaces();
            if (interfaces != null && interfaces.sizeOfInterfaceArray() > 0) {

                for (EndpointReferenceType endpoint : interfaces.getInterfaceArray()) {
                    if ((pullPointAddress = endpoint.getAddress().getStringValue()) != null)
                        break;
                }
            }
        }
        return pullPointAddress;
    }

    public void createProfile(CreateProfileRequestDocument createProfileRequest) {
        CreateProfileResponseDocument response = (CreateProfileResponseDocument) coreServiceTemplate.marshalSendAndReceive(createProfileRequest);
    }
}
