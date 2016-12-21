package com.saic.uicds.core.em.endpoint;

import java.util.List;

import org.apache.xmlbeans.XmlObject;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument;
import org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest;
import org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument;
import org.uicds.incidentCommandStructureService.GetCommandStructureRequestDocument;
import org.uicds.incidentCommandStructureService.GetCommandStructureResponseDocument;
import org.uicds.incidentCommandStructureService.UpdateCommandStructureRequestDocument;
import org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument;
import org.uicds.organizationElement.OrganizationElementDocument;
import org.uicds.organizationElement.OrganizationElementType;

import x0.messageStructure1.StructuredPayloadType;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.base.ProcessingStateType;
import com.saic.uicds.core.em.service.IncidentCommandService;
import com.saic.uicds.core.infrastructure.exceptions.InvalidXpathException;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;

public class IncidentCommandServiceEndpointTest
    extends AbstractJpaTests {

    Logger log = LoggerFactory.getLogger(IncidentCommandServiceEndpointTest.class);

    @Autowired
    IncidentCommandServiceEndpoint icsEndpoint;

    @Autowired
    WorkProductService workProductService;

    private UpdateCommandStructureResponseDocument updateOrgResponse;

    @Override
    protected void onSetUpInTransaction() throws Exception {

        updateOrgResponse = createInitialMACS();
    }

    @Test
    public void testCreateStructureRequest() {

        CreateCommandStructureRequestDocument request = CreateCommandStructureRequestDocument.Factory.newInstance();
        CreateCommandStructureRequest cmdRequest = request.addNewCreateCommandStructureRequest();
        cmdRequest.addNewOrganizationElement().set(createICS());

        CreateCommandStructureResponseDocument response = icsEndpoint.createCommandStructure(request);
        // System.out.println(response);
    }

    @Test
    public void testCreateMACSOrganization() {

        // System.out.println(request);

        assertTrue(
            "not accepted",
            updateOrgResponse.getUpdateCommandStructureResponse().getWorkProductPublicationResponse().getWorkProductProcessingStatus().getStatus() == ProcessingStateType.ACCEPTED);

        IdentificationType wpidDoc = WorkProductHelper.getIdentificationElement(updateOrgResponse.getUpdateCommandStructureResponse().getWorkProductPublicationResponse().getWorkProduct());

        // Get the work product that was just published
        com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct = getICS(wpidDoc);

        // System.out.println(workProduct);

        // Get the current work product payload
        OrganizationElementDocument returnedOrg = getOrgElementWorkProductFromPayload(workProduct);

        assertNotNull("no person in charge",
            returnedOrg.getOrganizationElement().getPersonInCharge());
        assertEquals("wrong person in charge", "Person",
            returnedOrg.getOrganizationElement().getPersonInCharge().getPersonProfileRef());
    }

    private UpdateCommandStructureResponseDocument createInitialMACS() {

        UpdateCommandStructureRequestDocument request = UpdateCommandStructureRequestDocument.Factory.newInstance();
        request.addNewUpdateCommandStructureRequest();
        OrganizationElementType org = request.getUpdateCommandStructureRequest().addNewOrganizationElement();
        org.addNewPersonInCharge().setPersonProfileRef("Person");
        org.getPersonInCharge().setRoleProfileRef("Role");

        UpdateCommandStructureResponseDocument updateOrgResponse = icsEndpoint.updateCommandStructure(request);
        return updateOrgResponse;
    }

    private OrganizationElementType createICS() {

        OrganizationElementType org = OrganizationElementType.Factory.newInstance();
        org.addNewPersonInCharge().setPersonProfileRef(("Joe"));
        org.getPersonInCharge().setRoleProfileRef(IncidentCommandService.IncidentCommanderRole);
        return org;
    }

    @Test
    public void testUpdateMACSOrganization() throws InvalidXpathException {

        List<WorkProduct> list = workProductService.getProductByTypeAndXQuery("MACS", null, null);
        int numOfMACS = list.size();
        list = workProductService.getProductByTypeAndXQuery("ICS", null, null);
        int numOfICS = list.size();

        assertTrue(updateOrgResponse.getUpdateCommandStructureResponse().getWorkProductPublicationResponse().getWorkProductProcessingStatus().getStatus() == ProcessingStateType.ACCEPTED);

        UpdateCommandStructureRequestDocument updateOrgRequest = getUpdateForInitialICS();

        // System.out.println(updateOrgRequest);

        UpdateCommandStructureResponseDocument updateOrgResponse = icsEndpoint.updateCommandStructure(updateOrgRequest);

        // System.out.println("UpdateOrganizationResponse:\n" + updateOrgResponse);

        assertTrue(
            "not accepted",
            updateOrgResponse.getUpdateCommandStructureResponse().getWorkProductPublicationResponse().getWorkProductProcessingStatus().getStatus() == ProcessingStateType.ACCEPTED);
        IdentificationType wpidDoc = WorkProductHelper.getIdentificationElement(updateOrgResponse.getUpdateCommandStructureResponse().getWorkProductPublicationResponse().getWorkProduct());
        assertEquals("wrong version", "2", wpidDoc.getVersion().getStringValue());

        // Get the initial ICS
        com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct = getICS(wpidDoc);

        // Get work product from payload
        assertTrue("no stuctured payload", workProduct.sizeOfStructuredPayloadArray() > 0);
        OrganizationElementDocument returnedOrg = getOrgElementWorkProductFromPayload(workProduct);

        // System.out.println(returnedOrg);

        // check a few of the top level values
        assertNotNull("parse failed", returnedOrg);
        assertNotNull("no org element", returnedOrg.getOrganizationElement());
        assertNotNull("no person in charge element",
            returnedOrg.getOrganizationElement().getPersonInCharge());
        assertNotNull("no person profile in person in charge",
            returnedOrg.getOrganizationElement().getPersonInCharge().getPersonProfileRef());
        assertEquals("wrong person in charge",
            returnedOrg.getOrganizationElement().getPersonInCharge().getPersonProfileRef(),
            "ANOTHER");
        assertNotNull("no role profile in person in charge",
            returnedOrg.getOrganizationElement().getPersonInCharge().getRoleProfileRef());
        assertEquals("wrong person in charge role",
            returnedOrg.getOrganizationElement().getPersonInCharge().getRoleProfileRef(),
            "Incident Commander");
        // System.out.println(organizationDocument);

        // Check that there are two levels of organization elements
        assertTrue("no organization elements",
            returnedOrg.getOrganizationElement().sizeOfOrganizationElementArray() > 0);
        OrganizationElementType level1OrgElements = returnedOrg.getOrganizationElement().getOrganizationElementArray(
            0);
        assertTrue("no sub organization elements",
            level1OrgElements.sizeOfOrganizationElementArray() > 0);

        list = workProductService.getProductByTypeAndXQuery("MACS", null, null);
        assertEquals("wrong number of MACS work products", numOfMACS, list.size());

        list = workProductService.getProductByTypeAndXQuery("ICS", null, null);
        assertEquals("wrong number of ICS work products", numOfICS, list.size());
    }

    private UpdateCommandStructureRequestDocument getUpdateForInitialICS() {

        IdentificationType wpid = WorkProductHelper.getIdentificationElement(updateOrgResponse.getUpdateCommandStructureResponse().getWorkProductPublicationResponse().getWorkProduct());
        com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct ics = getICS(wpid);

        // System.out.println(ics);

        UpdateCommandStructureRequestDocument updateOrgRequest = UpdateCommandStructureRequestDocument.Factory.newInstance();

        OrganizationElementDocument orgDoc = getOrgElementWorkProductFromPayload(ics);
        orgDoc.getOrganizationElement().getPersonInCharge().setPersonProfileRef("ANOTHER");
        orgDoc.getOrganizationElement().getPersonInCharge().setRoleProfileRef("Incident Commander");

        orgDoc.getOrganizationElement().addNewOrganizationElement().addNewOrganizationElement();

        updateOrgRequest.addNewUpdateCommandStructureRequest().setWorkProductIdentification(wpid);
        updateOrgRequest.getUpdateCommandStructureRequest().addNewOrganizationElement().set(
            orgDoc.getOrganizationElement());

        return updateOrgRequest;
    }

    private com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct getICS(
        IdentificationType wpidDoc) {

        GetCommandStructureRequestDocument getRequest = GetCommandStructureRequestDocument.Factory.newInstance();
        getRequest.addNewGetCommandStructureRequest().addNewWorkProductIdentification().set(wpidDoc);
        GetCommandStructureResponseDocument getResponse = icsEndpoint.getCommandStructure(getRequest);
        com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct = getResponse.getGetCommandStructureResponse().getWorkProduct();
        return workProduct;
    }

    private OrganizationElementDocument getOrgElementWorkProductFromPayload(
        com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct) {

        // Get the payload
        assertTrue("no stuctured payload", workProduct.sizeOfStructuredPayloadArray() > 0);
        StructuredPayloadType payload = workProduct.getStructuredPayloadArray(0);
        // System.out.println(payload);
        XmlObject structuredPayload = WorkProductHelper.getPayload(payload);
        assertNotNull("payload is null", structuredPayload);

        // Parse the payload to the work product type
        OrganizationElementDocument returnedOrg = null;

        XmlObject obj;
        try {
            XmlObject[] orgs = structuredPayload.selectChildren(
                "http://uicds.org/OrganizationElement", "OrganizationElement");
            // System.out.println(obj);
            assertTrue("can't find any OrganizationElement elements", orgs.length > 0);
            returnedOrg = OrganizationElementDocument.Factory.parse(orgs[0].getDomNode());
            // System.out.println(returnedOrg);
            assertNotNull("returned org is null", returnedOrg);
            // System.out.println(returnedOrg);

        } catch (Exception e) {
            fail("can't parse:" + e.getMessage());
        }

        return returnedOrg;
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
