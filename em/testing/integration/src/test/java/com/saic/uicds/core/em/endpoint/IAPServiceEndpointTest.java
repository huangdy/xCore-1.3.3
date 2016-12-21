package com.saic.uicds.core.em.endpoint;

import java.io.File;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.uicds.iapService.CreateIAPRequestDocument;
import org.uicds.iapService.CreateIAPResponseDocument;
import org.uicds.iapService.GetApprovedIAPRequestDocument;
import org.uicds.iapService.GetApprovedIAPResponseDocument;
import org.uicds.iapService.GetIAPRequestDocument;
import org.uicds.iapService.GetIAPResponseDocument;
import org.uicds.iapService.IncidentActionPlanDocument;
import org.uicds.iapService.IncidentActionPlanType;
import org.uicds.iapService.SetApprovedIAPRequestDocument;
import org.uicds.iapService.SetApprovedIAPResponseDocument;
import org.uicds.iapService.UpdateIAPRequestDocument;
import org.uicds.iapService.UpdateIAPResponseDocument;
import org.uicds.incidentManagementService.CreateIncidentRequestDocument;
import org.uicds.incidentManagementService.CreateIncidentResponseDocument;
import org.uicds.workProductService.WorkProductPublicationResponseType;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.base.ProcessingStateType;
import com.saic.precis.x2009.x06.base.ProcessingStatusType;
import com.saic.precis.x2009.x06.base.PropertiesType;
import com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct;
import com.saic.uicds.core.em.service.IAPService;
import com.saic.uicds.core.infrastructure.exceptions.InvalidProductIDException;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;

public class IAPServiceEndpointTest
    extends AbstractXmldbJpaTests {

    private static final String EXPIRATION_DATE_2 = "01/03/2010";
    private static final String EFFECTIVE_DATE_2 = "01/02/2010";
    private static final String EXPIRATION_DATE_1 = EFFECTIVE_DATE_2;
    private static final String EFFECTIVE_DATE_1 = "01/01/2010";
    private static final String IAP_DESCRIPTION_1 = "IAP description 1";
    private static final String IAP_NAME_1 = "IAP Test";

    private PropertiesType incidentProperties;
    private String incidentID;

    @Autowired
    IAPServiceEndpoint iapServiceEndpoint;

    @Autowired
    IncidentManagementServiceEndpoint imsEndpoint;

    @Autowired
    WorkProductService workProductService;


    @Test
    public void testIAPServiceEndpoint() {

        createIncident();

        // ** Create an initial draft IAP
        CreateIAPResponseDocument createIAPResponse = createIAP();

        // v1
        IdentificationType iapID = WorkProductHelper.getIdentificationElement(createIAPResponse.getCreateIAPResponse().getWorkProductPublicationResponse().getWorkProduct());
        assertEquals("wrong version", "1", iapID.getVersion().getStringValue());
        getAndCheckIAP(iapID);

        // ** Approve that IAP
        SetApprovedIAPResponseDocument activateResponse = setActiveIAP(iapID);

        // still v1 of draft and now v1 of new active IAP
        WorkProductPublicationResponseType response = activateResponse.getSetApprovedIAPResponse().getWorkProductPublicationResponse();
        assertTrue("failed set active",
            ProcessingStateType.ACCEPTED == response.getWorkProductProcessingStatus().getStatus());
        IdentificationType activeIAP = WorkProductHelper.getIdentificationElement(activateResponse.getSetApprovedIAPResponse().getWorkProductPublicationResponse().getWorkProduct());
        assertEquals("wrong version", "1", activeIAP.getVersion().getStringValue());
        assertTrue(
            "no new WP for active IAP",
            !iapID.getIdentifier().getStringValue().equals(
                activeIAP.getIdentifier().getStringValue()));
        GetApprovedIAPResponseDocument getResponse = getAndCheckActiveIAP(incidentID, activeIAP);

        // ** Update the draft version of the IAP
        UpdateIAPResponseDocument updateResponse = updateIAP(iapID);

        // v2 of draft and v1 of active
        iapID = WorkProductHelper.getIdentificationElement(updateResponse.getUpdateIAPResponse().getWorkProductPublicationResponse().getWorkProduct());
        assertEquals("wrong version", "2", iapID.getVersion().getStringValue());
        getResponse = getAndCheckActiveIAP(incidentID, activeIAP);

        // System.out.println("setting active iap " + iapID);

        // ** Set v2 of draft IAP to the active IAP
        activateResponse = setActiveIAP(iapID);

        // v2 of draft v2 of approved work product
        activeIAP = WorkProductHelper.getIdentificationElement(activateResponse.getSetApprovedIAPResponse().getWorkProductPublicationResponse().getWorkProduct());
        assertEquals("wrong version", "2", activeIAP.getVersion().getStringValue());

        getResponse = getAndCheckActiveIAP(incidentID, activeIAP);
        WorkProduct workProduct = getResponse.getGetApprovedIAPResponse().getWorkProduct();

        IncidentActionPlanDocument iapPlan = getIncidentActionPlanDocumentFromWorkProduct(workProduct);

        assertEquals("wrong effective date", EFFECTIVE_DATE_2,
            iapPlan.getIncidentActionPlan().getDocumentEffectiveDate());
        assertEquals("wrong expiration date", EXPIRATION_DATE_2,
            iapPlan.getIncidentActionPlan().getDocumentExpirationDate());

        // ** update the draft again
        updateResponse = updateIAP(iapID);

        // v3 of draft and same version (2) of approved IAP
        iapID = WorkProductHelper.getIdentificationElement(updateResponse.getUpdateIAPResponse().getWorkProductPublicationResponse().getWorkProduct());
        assertEquals("wrong version", "3", iapID.getVersion().getStringValue());

        // should be same active IAP
        getResponse = getAndCheckActiveIAP(incidentID, activeIAP);
        workProduct = getResponse.getGetApprovedIAPResponse().getWorkProduct();
        iapID = WorkProductHelper.getIdentificationElement(workProduct);
        assertEquals("wrong version", "2", iapID.getVersion().getStringValue());

        iapPlan = getIncidentActionPlanDocumentFromWorkProduct(workProduct);

        assertEquals("wrong effective date", EFFECTIVE_DATE_2,
            iapPlan.getIncidentActionPlan().getDocumentEffectiveDate());
        assertEquals("wrong expiration date", EXPIRATION_DATE_2,
            iapPlan.getIncidentActionPlan().getDocumentExpirationDate());

        // Should only be two IAP work products for this incident (draft and approved)
        List<com.saic.uicds.core.infrastructure.model.WorkProduct> wps = workProductService.findByInterestGroupAndType(
            incidentID, IAPService.IAP_WORKPRODUCT_TYPE);
        assertEquals("wrong # of IAP WPs", 2, wps.size());
    }

    private UpdateIAPResponseDocument updateIAP(IdentificationType iapID) {

        GetIAPRequestDocument requestDoc = GetIAPRequestDocument.Factory.newInstance();
        requestDoc.addNewGetIAPRequest().setWorkProductIdentification(iapID);
        GetIAPResponseDocument requestRes = iapServiceEndpoint.getIAP(requestDoc);
        WorkProduct workProduct = requestRes.getGetIAPResponse().getWorkProduct();
        IdentificationType wpid = WorkProductHelper.getIdentificationElement(workProduct);
        IncidentActionPlanDocument iapPlan = getIncidentActionPlanDocumentFromWorkProduct(workProduct);
        assertNotNull("IAP not parsed", iapPlan);

        iapPlan.getIncidentActionPlan().setDocumentEffectiveDate(EFFECTIVE_DATE_2);
        iapPlan.getIncidentActionPlan().setDocumentExpirationDate(EXPIRATION_DATE_2);

        UpdateIAPRequestDocument request = UpdateIAPRequestDocument.Factory.newInstance();
        request.addNewUpdateIAPRequest().addNewIncidentActionPlan().set(
            iapPlan.getIncidentActionPlan());
        request.getUpdateIAPRequest().addNewWorkProductIdentification().set(wpid);

        UpdateIAPResponseDocument response = iapServiceEndpoint.updateIAP(request);

        assertNotNull("resonse is null", response);
        assertNotNull("update response is null", response.getUpdateIAPResponse());
        ProcessingStatusType status = response.getUpdateIAPResponse().getWorkProductPublicationResponse().getWorkProductProcessingStatus();
        assertEquals("update not accepted", ProcessingStateType.ACCEPTED, status.getStatus());

        IdentificationType newID = WorkProductHelper.getIdentificationElement(response.getUpdateIAPResponse().getWorkProductPublicationResponse().getWorkProduct());
        com.saic.uicds.core.infrastructure.model.WorkProduct wp = workProductService.getProduct(newID);
        iapPlan = getIncidentActionPlanDocumentFromWorkProduct(WorkProductHelper.toWorkProduct(wp));
        assertEquals("wrong effective date", EFFECTIVE_DATE_2,
            iapPlan.getIncidentActionPlan().getDocumentEffectiveDate());
        assertEquals("wrong expiration date", EXPIRATION_DATE_2,
            iapPlan.getIncidentActionPlan().getDocumentExpirationDate());

        return response;
    }

    private GetApprovedIAPResponseDocument getAndCheckActiveIAP(String incidentID,
        IdentificationType iapID) {

        GetApprovedIAPRequestDocument request = GetApprovedIAPRequestDocument.Factory.newInstance();
        request.addNewGetApprovedIAPRequest().setIncidentId(incidentID);

        GetApprovedIAPResponseDocument response = null;
        try {
            response = iapServiceEndpoint.getApprovedIAP(request);
        } catch (InvalidProductIDException e) {
            fail("invalid product id");
        }

        assertNotNull("response is null", response);
        assertNotNull("GetActiveIAPResponse is null", response.getGetApprovedIAPResponse());
        assertNotNull("missing work product", response.getGetApprovedIAPResponse().getWorkProduct());
        IdentificationType gotID = WorkProductHelper.getIdentificationElement(response.getGetApprovedIAPResponse().getWorkProduct());
        assertEquals("wrong id", iapID.getIdentifier().getStringValue(),
            gotID.getIdentifier().getStringValue());
        assertEquals("wrong checksum", iapID.getChecksum().getStringValue(),
            gotID.getChecksum().getStringValue());
        assertEquals("wrong version", iapID.getVersion().getStringValue(),
            gotID.getVersion().getStringValue());
        assertEquals("wrong type", iapID.getType().getStringValue(),
            gotID.getType().getStringValue());
        assertEquals("wrong ", iapID.getState(), gotID.getState());
        return response;
    }

    private SetApprovedIAPResponseDocument setActiveIAP(IdentificationType id) {

        SetApprovedIAPRequestDocument request = SetApprovedIAPRequestDocument.Factory.newInstance();
        request.addNewSetApprovedIAPRequest().addNewWorkProductIdentification().set(id);
        request.getSetApprovedIAPRequest().setIncidentId(incidentID);

        SetApprovedIAPResponseDocument response = iapServiceEndpoint.setApprovedIAP(request);

        ProcessingStatusType status = response.getSetApprovedIAPResponse().getWorkProductPublicationResponse().getWorkProductProcessingStatus();

        assertEquals("IAP activate not accepted", ProcessingStateType.ACCEPTED, status.getStatus());
        assertNotNull(
            "missing work product",
            response.getSetApprovedIAPResponse().getWorkProductPublicationResponse().getWorkProduct());
        return response;
    }

    private void getAndCheckIAP(IdentificationType id) {

        GetIAPRequestDocument getIAPRequest = GetIAPRequestDocument.Factory.newInstance();
        getIAPRequest.addNewGetIAPRequest().addNewWorkProductIdentification().set(id);
        GetIAPResponseDocument getIAPResponse = iapServiceEndpoint.getIAP(getIAPRequest);
        WorkProduct workProduct = getIAPResponse.getGetIAPResponse().getWorkProduct();
        IncidentActionPlanDocument iapPlan = getIncidentActionPlanDocumentFromWorkProduct(workProduct);
        assertNotNull("IAP not parsed", iapPlan);
        assertEquals("wrong name", IAP_NAME_1, iapPlan.getIncidentActionPlan().getName());
        assertEquals("wrong description", IAP_DESCRIPTION_1,
            iapPlan.getIncidentActionPlan().getDescriptionText());
        assertEquals("wrong effective date", EFFECTIVE_DATE_1,
            iapPlan.getIncidentActionPlan().getDocumentEffectiveDate());
        assertEquals("wrong expiration date", EXPIRATION_DATE_1,
            iapPlan.getIncidentActionPlan().getDocumentExpirationDate());
    }

    private IncidentActionPlanDocument getIncidentActionPlanDocumentFromWorkProduct(
        WorkProduct workProduct) {

        try {
            IncidentActionPlanDocument iapPlan = (IncidentActionPlanDocument) WorkProductHelper.getPayload(workProduct.getStructuredPayloadArray(0));
            return iapPlan;
        } catch (Throwable e) {
            fail("parsing IAP work product");
        }
        return null;
    }

    private CreateIncidentResponseDocument createIncident() {

        CreateIncidentRequestDocument request = null;
        CreateIncidentResponseDocument response = null;
        try {
            request = CreateIncidentRequestDocument.Factory.parse(new File(
                "../data/CreateIncident.xml"));
            response = imsEndpoint.createIncident(request);
            assertNotNull(response);
            assertNotNull(response.getCreateIncidentResponse());
            assertEquals(
                "incident not created",
                ProcessingStateType.ACCEPTED,
                response.getCreateIncidentResponse().getWorkProductPublicationResponse().getWorkProductProcessingStatus().getStatus());
            incidentProperties = WorkProductHelper.getPropertiesElement(response.getCreateIncidentResponse().getWorkProductPublicationResponse().getWorkProduct());
            incidentID = incidentProperties.getAssociatedGroups().getIdentifierArray(0).getStringValue();
        } catch (Exception e) {
            fail("exception thrown when creating incident: " + e.getMessage());
        }
        return response;
    }

    private CreateIAPResponseDocument createIAP() {

        CreateIAPRequestDocument createIAPRequest = CreateIAPRequestDocument.Factory.newInstance();
        IncidentActionPlanType plan = createIAPRequest.addNewCreateIAPRequest().addNewIncidentActionPlan();
        plan.setDescriptionText(IAP_DESCRIPTION_1);
        plan.setDocumentEffectiveDate(EFFECTIVE_DATE_1);
        plan.setDocumentExpirationDate(EXPIRATION_DATE_1);
        plan.setIncidentID(incidentID);
        plan.setName(IAP_NAME_1);
        CreateIAPResponseDocument response = iapServiceEndpoint.createIAP(createIAPRequest);

        ProcessingStatusType status = response.getCreateIAPResponse().getWorkProductPublicationResponse().getWorkProductProcessingStatus();
        assertEquals("IAP not accepted", ProcessingStateType.ACCEPTED, status.getStatus());
        assertNotNull("missing work product",
            response.getCreateIAPResponse().getWorkProductPublicationResponse().getWorkProduct());

        return response;
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-dataSrcContext.xml",
            "classpath:contexts/test-spring-ws-em-servlet.xml" };
    }
}
