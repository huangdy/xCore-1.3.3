package com.saic.uicds.core.em.endpoint;

import gov.ucore.ucore.x20.DigestType;

import java.io.File;
import java.io.IOException;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument;
import org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument;
import org.uicds.incidentManagementService.CreateIncidentRequestDocument;
import org.uicds.incidentManagementService.CreateIncidentResponseDocument;
import org.uicds.incidentManagementService.GetIncidentCurrentVersionRequestDocument.GetIncidentCurrentVersionRequest;
import org.uicds.incidentManagementService.GetIncidentCurrentVersionResponseDocument;
import org.uicds.incidentManagementService.GetIncidentListRequestDocument;
import org.uicds.incidentManagementService.GetIncidentListResponseDocument;
import org.uicds.incidentManagementService.GetIncidentRequestDocument;
import org.uicds.incidentManagementService.GetIncidentResponseDocument;
import org.uicds.incidentManagementService.UpdateIncidentRequestDocument;
import org.uicds.incidentManagementService.UpdateIncidentResponseDocument;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.base.IdentifierType;
import com.saic.precis.x2009.x06.base.ProcessingStateType;
import com.saic.precis.x2009.x06.base.PropertiesType;
import com.saic.precis.x2009.x06.base.StateType;
import com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct;
import com.saic.uicds.core.em.service.IncidentManagementService;
import com.saic.uicds.core.em.testing.util.IncidentManagementTestUtils;
import com.saic.uicds.core.em.util.DigestTester;
import com.saic.uicds.core.infrastructure.exceptions.InvalidProductIDException;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;
import com.saic.uicds.core.infrastructure.util.ValidationUtil;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;

public class IncidentManagementServiceEndpointTest
    extends AbstractXmldbJpaTests {

    Logger log = LoggerFactory.getLogger(getClass());

    @Autowired
    IncidentManagementService ims;

    @Autowired
    WorkProductService productService;

    IncidentManagementServiceEndpoint imsEndpoint = new IncidentManagementServiceEndpoint();

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }

    @Override
    protected void onSetUpBeforeTransaction() throws Exception {

        imsEndpoint.setIncidentManagementService(ims);
        imsEndpoint.setWorkProductService(productService);
    }

    @Test
    public void testCreateIncidentFromCap() throws Exception {

        CreateIncidentFromCapRequestDocument request = CreateIncidentFromCapRequestDocument.Factory.parse(new File(
            "../data/CreateIncidentFromCap.xml"));

        assertTrue(ValidationUtil.validate(request, true));

        CreateIncidentFromCapResponseDocument response = imsEndpoint.createIncidentFromCap(request);

        assertTrue(ValidationUtil.validate(response, true));
        assertEquals(
            "create not accepted",
            ProcessingStateType.ACCEPTED,
            response.getCreateIncidentFromCapResponse().getWorkProductPublicationResponse().getWorkProductProcessingStatus().getStatus());
        assertNotNull(
            "null work product",
            response.getCreateIncidentFromCapResponse().getWorkProductPublicationResponse().getWorkProduct());
        IdentificationType id = WorkProductHelper.getIdentificationElement(response.getCreateIncidentFromCapResponse().getWorkProductPublicationResponse().getWorkProduct());

        try {
            WorkProduct wp = getIncident(id);
            checkIsActiveFirstVersionIncidentWP(wp);
        } catch (InvalidProductIDException e) {
            fail("unable to get work product for incident");
        }

        checkIncidentIsInList(WorkProductHelper.getPropertiesElement(response.getCreateIncidentFromCapResponse().getWorkProductPublicationResponse().getWorkProduct()));
    }

    @Test
    public void testCreateThenGetIncident() throws DatatypeConfigurationException, XmlException,
        IOException {

        CreateIncidentResponseDocument response = null;
        CreateIncidentRequestDocument request = IncidentManagementTestUtils.getCreateIncidentRequest("../data/CreateIncident.xml");
        assertTrue(ValidationUtil.validate(request, true));

        response = imsEndpoint.createIncident(request);

        DigestType digest = WorkProductHelper.getDigestElement(response.getCreateIncidentResponse().getWorkProductPublicationResponse().getWorkProduct());
        // System.out.println(digest);
        assertTrue(DigestTester.checkLocationGMLCircle(digest, "4.5", "SMI"));

        assertTrue(ValidationUtil.validate(response, true));

        IdentificationType id = WorkProductHelper.getIdentificationElement(response.getCreateIncidentResponse().getWorkProductPublicationResponse().getWorkProduct());
        try {
            WorkProduct wp = getIncident(id);
            checkIsActiveFirstVersionIncidentWP(wp);
        } catch (InvalidProductIDException e) {
            fail("unable to get work product for incident");
        }

        checkIncidentIsInList(WorkProductHelper.getPropertiesElement(response.getCreateIncidentResponse().getWorkProductPublicationResponse().getWorkProduct()));
    }

    @Test
    public void testCreateUpdateGetIncident() throws DatatypeConfigurationException, XmlException,
        IOException, InvalidProductIDException {

        CreateIncidentRequestDocument createRequest = IncidentManagementTestUtils.getCreateIncidentRequest("../data/CreateIncident.xml");
        assertTrue(ValidationUtil.validate(createRequest, true));

        CreateIncidentResponseDocument createResponse = imsEndpoint.createIncident(createRequest);

        DigestType digest = WorkProductHelper.getDigestElement(createResponse.getCreateIncidentResponse().getWorkProductPublicationResponse().getWorkProduct());
        assertTrue("wrong radius", DigestTester.checkLocationGMLCircle(digest, "4.5", "SMI"));
        // assertTrue("invalid create response", ValidationUtil.validate(createResponse, true));

        IdentificationType wpid = WorkProductHelper.getIdentificationElement(createResponse.getCreateIncidentResponse().getWorkProductPublicationResponse().getWorkProduct());
        try {
            WorkProduct wp = getIncident(wpid);
            checkIsActiveFirstVersionIncidentWP(wp);
        } catch (InvalidProductIDException e) {
            fail("unable to get work product for incident");
        }

        checkIncidentIsInList(WorkProductHelper.getPropertiesElement(createResponse.getCreateIncidentResponse().getWorkProductPublicationResponse().getWorkProduct()));

        // Update the incident from the create reseponse
        WorkProduct wp = createResponse.getCreateIncidentResponse().getWorkProductPublicationResponse().getWorkProduct();
        wpid = WorkProductHelper.getIdentificationElement(wp);

        WorkProduct incidentWorkProduct = getIncident(wpid);

        UpdateIncidentRequestDocument updateRequest = IncidentManagementTestUtils.getUpdateIncidentRequest(
            wpid, incidentWorkProduct);

        UpdateIncidentResponseDocument updateResponse = imsEndpoint.updateIncident(updateRequest);
        assertNotNull("null update response", updateResponse);
        // assertTrue("invalid create response", ValidationUtil.validate(updateResponse, true));

        // check that we can get just the most recent version of the incident
        IdentificationType updateWPID = WorkProductHelper.getIdentificationElement(updateResponse.getUpdateIncidentResponse().getWorkProductPublicationResponse().getWorkProduct());
        String id = updateWPID.getIdentifier().getStringValue();
        String expectedVersion = "2";

        checkGetIncidentCurrentVersion(id, expectedVersion);

        // Update the incident from the update reseponse
        wp = updateResponse.getUpdateIncidentResponse().getWorkProductPublicationResponse().getWorkProduct();
        wpid = WorkProductHelper.getIdentificationElement(wp);

        incidentWorkProduct = getIncident(wpid);

        updateRequest = IncidentManagementTestUtils.getUpdateIncidentRequest(wpid,
            incidentWorkProduct);

        updateResponse = imsEndpoint.updateIncident(updateRequest);
        assertNotNull("null update response", updateResponse);
        // assertTrue("invalid create response", ValidationUtil.validate(updateResponse, true));

        // check that we can get just the most recent version of the incident
        updateWPID = WorkProductHelper.getIdentificationElement(updateResponse.getUpdateIncidentResponse().getWorkProductPublicationResponse().getWorkProduct());
        id = updateWPID.getIdentifier().getStringValue();
        expectedVersion = "3";

        checkGetIncidentCurrentVersion(id, expectedVersion);
    }

    private void checkGetIncidentCurrentVersion(String id, String expectedVersion)
        throws InvalidProductIDException, DatatypeConfigurationException {

        GetIncidentCurrentVersionRequest getRequest = GetIncidentCurrentVersionRequest.Factory.newInstance();
        getRequest.addNewIdentifier().setStringValue(id);

        GetIncidentCurrentVersionResponseDocument getResponse = imsEndpoint.getIncidentCurrentVersion(getRequest);
        assertNotNull("null get response", getResponse);
        WorkProduct getWP = getResponse.getGetIncidentCurrentVersionResponse().getWorkProduct();
        IdentificationType getWPID = WorkProductHelper.getIdentificationElement(getWP);
        assertEquals("wrong version", expectedVersion, getWPID.getVersion().getStringValue());
    }

    @Test(expected = com.saic.uicds.core.infrastructure.exceptions.InvalidProductIDException.class)
    public void testRequestUnknownIncident() {

        // Trac 370
        GetIncidentRequestDocument request = GetIncidentRequestDocument.Factory.newInstance();
        IdentificationType wpid = request.addNewGetIncidentRequest().addNewWorkProductIdentification();
        wpid.addNewChecksum().setStringValue("checksum");
        wpid.addNewIdentifier().setStringValue("identifier");
        wpid.addNewType().setStringValue("type");
        wpid.addNewVersion().setStringValue("1");
        wpid.setState(StateType.ACTIVE);

		assertTrue("invalid request",ValidationUtil.validate(request, true));
        assertNotNull(request.getGetIncidentRequest().getWorkProductIdentification());

        WorkProduct wp;
        try {
            wp = getIncident(wpid);
            fail("expected an exception");
        } catch (InvalidProductIDException e) {
            ;
        }
    }

    private void checkIncidentIsInList(PropertiesType propertiesElement) {

        assertNotNull("no properties", propertiesElement);
        assertTrue("no associated group",
            propertiesElement.getAssociatedGroups().sizeOfIdentifierArray() > 0);
        IdentifierType incidentID = propertiesElement.getAssociatedGroups().getIdentifierArray(0);
        GetIncidentListRequestDocument request = GetIncidentListRequestDocument.Factory.newInstance();
        request.addNewGetIncidentListRequest();

        GetIncidentListResponseDocument response;
        try {
            response = imsEndpoint.getIncidentList(request);
            assertNotNull("get incident list response is null", response);
            assertNotNull("get incident list is null", response.getGetIncidentListResponse());
            assertNotNull("work product list is null",
                response.getGetIncidentListResponse().getWorkProductList());
            boolean found = false;
            for (WorkProduct wp : response.getGetIncidentListResponse().getWorkProductList().getWorkProductArray()) {
                PropertiesType props = WorkProductHelper.getPropertiesElement(wp);
                assertTrue("no associated groups",
                    props.getAssociatedGroups().sizeOfIdentifierArray() > 0);
                if (incidentID.getStringValue().equals(
                    props.getAssociatedGroups().getIdentifierArray(0).getStringValue())) {
                    found = true;
                }
            }
            assertTrue("incident not found", found);
        } catch (DatatypeConfigurationException e) {
            fail("exception thrown getting incident list " + e.getMessage());
        }
    }

    private void checkIsActiveFirstVersionIncidentWP(WorkProduct wp) {

        assertNotNull(wp);
        IdentificationType returnedID = WorkProductHelper.getIdentificationElement(wp);
        assertEquals("work product not active", StateType.ACTIVE, returnedID.getState());
        assertEquals("not first version", "1", returnedID.getVersion().getStringValue());
        assertEquals("not the correct type", "Incident", returnedID.getType().getStringValue());
    }

    private WorkProduct getIncident(IdentificationType id) throws InvalidProductIDException {

        GetIncidentRequestDocument request = GetIncidentRequestDocument.Factory.newInstance();
        IdentificationType wpid = request.addNewGetIncidentRequest().addNewWorkProductIdentification();
        wpid.set(id);

        GetIncidentResponseDocument response = null;
        try {
            response = imsEndpoint.getIncident(request);
        } catch (DatatypeConfigurationException e) {
            fail("exception thrown getting incident " + e.getMessage());
        }
        assertNotNull(response);
        if (!ValidationUtil.validate(response, false)) {
            System.out.println(response);
        }
		assertTrue("invalid response",ValidationUtil.validate(response, true));
        if (response == null) {
            fail("null resposne getting incident work product");
        }
        assertNotNull(response.getGetIncidentResponse());
        assertNotNull(response.getGetIncidentResponse().getWorkProduct());

        return response.getGetIncidentResponse().getWorkProduct();
    }
}