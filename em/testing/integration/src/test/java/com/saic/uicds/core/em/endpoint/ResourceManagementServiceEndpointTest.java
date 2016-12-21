package com.saic.uicds.core.em.endpoint;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.uicds.agreementService.CreateAgreementRequestDocument;
import org.uicds.agreementService.CreateAgreementResponseDocument;
import org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument;
import org.uicds.incidentManagementService.IncidentListType;
import org.uicds.resourceManagementService.EdxlDeMessageErrorType;
import org.uicds.resourceManagementService.EdxlDeRequestDocument;
import org.uicds.resourceManagementService.EdxlDeResponseDocument;
import org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument;
import org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument;
import org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument;
import org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument;

import x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution;
import x0.oasisNamesTcEmergencyEDXLRM1.IncidentInformationType;
import x0Msg.oasisNamesTcEmergencyEDXLRM1.CommitResourceDocument.CommitResource;
import x0Msg.oasisNamesTcEmergencyEDXLRM1.RequestResourceDocument.RequestResource;

import com.saic.uicds.core.em.service.IncidentManagementService;
import com.saic.uicds.core.em.service.ResourceManagementService;
import com.saic.uicds.core.infrastructure.endpoint.AgreementServiceEndpoint;
import com.saic.uicds.core.infrastructure.exceptions.AgreementWithCoreExists;
import com.saic.uicds.core.infrastructure.exceptions.MissingConditionInShareRuleException;
import com.saic.uicds.core.infrastructure.exceptions.MissingShareRulesElementException;
import com.saic.uicds.core.infrastructure.service.AgreementService;
import com.saic.uicds.core.infrastructure.service.ConfigurationService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;
import com.saic.uicds.core.infrastructure.util.ValidationUtil;

/**
 * 
 * @author ron
 * 
 */
public class ResourceManagementServiceEndpointTest extends AbstractXmldbJpaTests {

    @Autowired
    ResourceManagementService resourceManagementService;

    @Autowired
    IncidentManagementService incidentManagementService;

    @Autowired
    ConfigurationService configurationService;

    @Autowired
    AgreementService agreementService;

    ResourceManagementServiceEndpoint resourceManagementServiceEndpoint = new ResourceManagementServiceEndpoint();

    AgreementServiceEndpoint agreementServiceEndpoint = new AgreementServiceEndpoint();

    private String incidentID = null;

    private String localJID = "RM@core1.saic.com";
    private String remoteJID = "RM@core2.saic.com";
    private String addressScheme = "uicds:user";

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }

    @Test
    public void testResourceServiceEndpointCreated() {
        assertNotNull(incidentManagementService);
        assertNotNull(incidentManagementService);
        assertNotNull(agreementService);
        assertNotNull(resourceManagementServiceEndpoint);
        assertNotNull(agreementServiceEndpoint);

    }

    // @Override
    protected void onSetUpInTransaction() throws Exception {
        super.onSetUpBeforeTransaction();
        IncidentListType incidents = incidentManagementService.getListOfIncidents();
        if (incidents.sizeOfIncidentInfoArray() == 0) {
            // create an incident
            CreateIncidentFromCapRequestDocument request = CreateIncidentFromCapRequestDocument.Factory.parse(new File(
                "../data/CreateIncidentFromCap.xml"));
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
    }

    @Test
    public void testRequestResource() throws Exception {
        resourceManagementServiceEndpoint.setResourceManagementService(resourceManagementService);
        agreementServiceEndpoint.setAgreementService(agreementService);

        assertNotNull(incidentID);

        EdxlDeRequestDocument request = EdxlDeRequestDocument.Factory.parse(new File(
            "../data/EDXL-RM-RequestResource.1.xml"));

        removeExplicitAddresses(request);

        setIncidentIDOnRequest(request, incidentID);

        EdxlDeResponseDocument response = resourceManagementServiceEndpoint.edxldeRequest(request);

        // System.out.println(response);
        assertNotNull(response);
        assertTrue(response.getEdxlDeResponse().sizeOfCoreErrorArray() == 0);
        assertFalse(response.getEdxlDeResponse().getErrorExists());
        assertNotNull(response.getEdxlDeResponse().getDigest());

        GetRequestedResourcesRequestDocument newRequest = GetRequestedResourcesRequestDocument.Factory.newInstance();
        newRequest.addNewGetRequestedResourcesRequest().setIncidentID(incidentID);
        GetRequestedResourcesResponseDocument newResponse = resourceManagementServiceEndpoint.getRequestedResources(newRequest);

        // Should have one request
        assertNotNull(newResponse);
        assertEquals("wrong number of requests",1,newResponse.getGetRequestedResourcesResponse().getWorkProductList().sizeOfWorkProductArray());
    }

    @Test
    public void testRequestResourceWithNoIncident() throws Exception {
        resourceManagementServiceEndpoint.setResourceManagementService(resourceManagementService);
        agreementServiceEndpoint.setAgreementService(agreementService);

        assertNotNull(incidentID);

        EdxlDeRequestDocument request = EdxlDeRequestDocument.Factory.parse(new File(
            "../data/EDXL-RM-RequestResource.1.xml"));

        removeExplicitAddresses(request);

        removeIncidentIDFromRequest(request, incidentID);

        EdxlDeResponseDocument response = resourceManagementServiceEndpoint.edxldeRequest(request);
        assertNotNull(response);
        assertTrue(response.getEdxlDeResponse().sizeOfCoreErrorArray() == 0);
        assertFalse(response.getEdxlDeResponse().getErrorExists());
        assertNotNull(response.getEdxlDeResponse().getDigest());
    }

    @Test
    public void testRequestResourceWithNoShareRule() throws Exception {
        resourceManagementServiceEndpoint.setResourceManagementService(resourceManagementService);
        agreementServiceEndpoint.setAgreementService(agreementService);

        assertNotNull(incidentID);

        EdxlDeRequestDocument request = EdxlDeRequestDocument.Factory.parse(new File(
            "../data/EDXL-RM-RequestResource.1.xml"));
        request = setJIDDataEDXLRequest(request);
        setIncidentIDOnRequest(request, incidentID);

        // System.out.println(request);
        createAgreement();

        EdxlDeResponseDocument response = resourceManagementServiceEndpoint.edxldeRequest(request);

        assertNotNull(response);
        assertTrue(response.getEdxlDeResponse().getErrorExists());
        assertTrue(response.getEdxlDeResponse().sizeOfCoreErrorArray() > 0);
        boolean foundNoShareRule = false;
        for (EdxlDeMessageErrorType error : response.getEdxlDeResponse().getCoreErrorArray()) {
            if (error.getError().equals("NO_SHARE_RULE_IN_AGREEMENT"))
                foundNoShareRule = true;
        }
        assertTrue(foundNoShareRule);
    }

    @Test
    public void testCommitResource() throws Exception {
        resourceManagementServiceEndpoint.setResourceManagementService(resourceManagementService);
        agreementServiceEndpoint.setAgreementService(agreementService);

        assertNotNull(incidentID);

        EdxlDeRequestDocument request = EdxlDeRequestDocument.Factory.parse(new File(
            "../data/EDXL-RM-CommitResource.1.xml"));

        removeExplicitAddresses(request);

        setIncidentIDOnCommit(request, incidentID);

        EdxlDeResponseDocument response = resourceManagementServiceEndpoint.edxldeRequest(request);

        assertNotNull(response);
        assertTrue(response.getEdxlDeResponse().sizeOfCoreErrorArray() == 0);
        assertFalse(response.getEdxlDeResponse().getErrorExists());
        assertNotNull(response.getEdxlDeResponse().getDigest());

        GetCommittedResourcesRequestDocument newRequest = GetCommittedResourcesRequestDocument.Factory.newInstance();
        newRequest.addNewGetCommittedResourcesRequest().setIncidentID(incidentID);
        GetCommittedResourcesResponseDocument newResponse = resourceManagementServiceEndpoint.getCommittedResources(newRequest);

        assertNotNull(newResponse);
        assertTrue(newResponse.getGetCommittedResourcesResponse().getWorkProductList().sizeOfWorkProductArray() == 1);
    }

    @Test
    public void testCommitResourceWithNoIncident() throws Exception {
        resourceManagementServiceEndpoint.setResourceManagementService(resourceManagementService);
        agreementServiceEndpoint.setAgreementService(agreementService);

        assertNotNull(incidentID);

        EdxlDeRequestDocument request = EdxlDeRequestDocument.Factory.parse(new File(
            "../data/EDXL-RM-CommitResource.1.xml"));
        removeExplicitAddresses(request);

        removeIncidentIDFromCommit(request, incidentID);

        EdxlDeResponseDocument response = resourceManagementServiceEndpoint.edxldeRequest(request);

        assertNotNull(response);
        assertTrue(response.getEdxlDeResponse().sizeOfCoreErrorArray() == 0);
        assertFalse(response.getEdxlDeResponse().getErrorExists());
        assertNotNull(response.getEdxlDeResponse().getDigest());
    }

    private void setIncidentIDOnRequest(EdxlDeRequestDocument request, String ID) {
        request.getEdxlDeRequest().getEDXLDistribution().getContentObjectArray(0).setIncidentID(ID);
        XmlObject reqs[] = request.getEdxlDeRequest().getEDXLDistribution().getContentObjectArray(0).getXmlContent().getEmbeddedXMLContentArray(
            0).selectChildren("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "RequestResource");
        if (reqs.length > 0) {
            RequestResource req = (RequestResource) reqs[0];
            XmlObject[] is = req.selectChildren("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg",
                "IncidentInformation");
            if (is.length > 0) {
                IncidentInformationType i = (IncidentInformationType) is[0];
                i.setIncidentID(ID);
            } else {
                fail("No Incident information in the ResourceRequest");
            }
        } else {
            fail("No ResourceRequest content");
        }
    }

    private void setIncidentIDOnCommit(EdxlDeRequestDocument commit, String ID) {
        commit.getEdxlDeRequest().getEDXLDistribution().getContentObjectArray(0).setIncidentID(ID);
        XmlObject reqs[] = commit.getEdxlDeRequest().getEDXLDistribution().getContentObjectArray(0).getXmlContent().getEmbeddedXMLContentArray(
            0).selectChildren("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "CommitResource");
        if (reqs.length > 0) {
            CommitResource req = (CommitResource) reqs[0];
            XmlObject[] is = req.selectChildren("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg",
                "IncidentInformation");
            if (is.length > 0) {
                IncidentInformationType i = (IncidentInformationType) is[0];
                i.setIncidentID(ID);
            } else {
                fail("No Incident information in the CommitResource");
            }
        } else {
            fail("No CommitResource content");
        }
    }

    private void removeIncidentIDFromRequest(EdxlDeRequestDocument request, String ID) {
        request.getEdxlDeRequest().getEDXLDistribution().getContentObjectArray(0).unsetIncidentID();
        XmlObject reqs[] = request.getEdxlDeRequest().getEDXLDistribution().getContentObjectArray(0).getXmlContent().getEmbeddedXMLContentArray(
            0).selectChildren("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "RequestResource");
        if (reqs.length > 0) {
            RequestResource req = (RequestResource) reqs[0];
            XmlObject[] is = req.selectChildren("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg",
                "IncidentInformation");
            if (is.length > 0) {
                req.removeIncidentInformation(0);
            } else {
                fail("No Incident information in the ResourceRequest");
            }
        } else {
            fail("No ResourceRequest content");
        }
    }

    private void removeIncidentIDFromCommit(EdxlDeRequestDocument request, String ID) {
        request.getEdxlDeRequest().getEDXLDistribution().getContentObjectArray(0).unsetIncidentID();
        XmlObject reqs[] = request.getEdxlDeRequest().getEDXLDistribution().getContentObjectArray(0).getXmlContent().getEmbeddedXMLContentArray(
            0).selectChildren("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg", "CommitResource");
        if (reqs.length > 0) {
            CommitResource req = (CommitResource) reqs[0];
            XmlObject[] is = req.selectChildren("urn:oasis:names:tc:emergency:EDXL:RM:1.0:msg",
                "IncidentInformation");
            if (is.length > 0) {
                req.removeIncidentInformation(0);
            } else {
                fail("No Incident information in the ResourceRequest");
            }
        } else {
            fail("No ResourceRequest content");
        }
    }

    private void removeExplicitAddresses(EdxlDeRequestDocument request) {
        while (request.getEdxlDeRequest().getEDXLDistribution().sizeOfExplicitAddressArray() > 0) {
            request.getEdxlDeRequest().getEDXLDistribution().removeExplicitAddress(0);
        }
    }

    private void createAgreement() {
        try {
            CreateAgreementRequestDocument request = CreateAgreementRequestDocument.Factory.parse(new File(
                "../data/CreateAgreementNoRule.xml"));
            request = setJIDDataAgreementRequest(request);
            try {
                CreateAgreementResponseDocument response = agreementServiceEndpoint.createAgreement(request);
                assertTrue(ValidationUtil.validate(response, true));
                assertTrue(response.getCreateAgreementResponse() != null);
            } catch (MissingConditionInShareRuleException e) {
                fail(e.getMessage());
            } catch (AgreementWithCoreExists e) {
                fail(e.getMessage());
            } catch (MissingShareRulesElementException e) {
            	fail(e.getMessage());
			}
        } catch (XmlException e) {
            fail(e.getMessage());
        } catch (IOException e) {
            fail(e.getMessage());
        }
    }

    private EdxlDeRequestDocument setJIDDataEDXLRequest(EdxlDeRequestDocument request) {
        // set test data
        EDXLDistribution edxl = request.getEdxlDeRequest().getEDXLDistribution();

        // localJID += configurationService.getFullyQualifiedHostName();

        edxl.setSenderID(localJID);
        if (edxl.getExplicitAddressArray().length < 2) {
            fail("Data file has less than two explicit addresses defined");
        }
        String[] localJIDArray = new String[1];
        localJIDArray[0] = localJID;
        edxl.getExplicitAddressArray(0).setExplicitAddressValueArray(localJIDArray);
        localJIDArray[0] = remoteJID;
        edxl.getExplicitAddressArray(1).setExplicitAddressValueArray(localJIDArray);
        return request;
    }

    private CreateAgreementRequestDocument setJIDDataAgreementRequest(
        CreateAgreementRequestDocument request) {

        // localJID += configurationService.getFullyQualifiedHostName();

        request.getCreateAgreementRequest().getAgreement().getPrincipals().getLocalCore().setStringValue(
            localJID);
        request.getCreateAgreementRequest().getAgreement().getPrincipals().getRemoteCore().setStringValue(
            remoteJID);
        return request;

    }
}
