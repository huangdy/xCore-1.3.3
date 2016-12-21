package com.saic.uicds.core.em.service;

import gov.niem.niem.niemCore.x20.TextType;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.uicds.incident.IncidentDocument;
import org.uicds.incidentManagementService.IncidentInfoType;
import org.uicds.incidentManagementService.IncidentListType;

import x1.oasisNamesTcEmergencyCap1.AlertDocument;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.structures.WorkProductDocument;
import com.saic.uicds.core.em.messages.IncidentStateNotificationMessage;
import com.saic.uicds.core.em.service.impl.IncidentManagementServiceImpl;
import com.saic.uicds.core.infrastructure.messages.InterestGroupStateNotificationMessage;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;
import com.saic.uicds.core.infrastructure.util.ValidationUtil;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;

@Ignore
public class IncidentManagementServiceIntegrationTest
    extends AbstractXmldbJpaTests {

    private static final String UPDATED_ACTIVITYNAME = "UPDATED NAME";

    Logger log = LoggerFactory.getLogger(IncidentManagementServiceIntegrationTest.class);

    private String incidentID = UUID.randomUUID().toString();

    @Autowired
    IncidentManagementServiceImpl incidentManagementService;

    @Autowired
    AlertService alertService;

    @Autowired
    WorkProductService workProductService;

    @Autowired
    MessageReceiver messageReceiver;

    String alertEvent = "a test alert event";
    String alertHeadline = "a test alert headline";
    String alertIdentifier = "identifier";
    String alertSender = "sender";
    String alertAddress = "Mile marker 138";
    Calendar alertSent = new GregorianCalendar();

    // @Test
    // public void testTicket_580() throws Exception {
    //
    // // create the incident
    // IncidentDocument incidentDoc = IncidentDocument.Factory.parse(new File(
    // "./src/test/resources/CBRNE-Incident.xml"));
    //
    // if (!ValidationUtil.validate(incidentDoc, true)) {
    // log.error("invalid input: " + incidentDoc);
    // }
    //
    // ProductPublicationStatus status =
    // incidentManagementService.createIncident(incidentDoc.getIncident());
    // if (status.getStatus().equals(ProductPublicationStatus.SuccessStatus) == false) {
    // fail("Create Incident failed");
    // }
    //
    // IdentificationType id = WorkProductHelper.getWorkProductIdentification(status.getProduct());
    // WorkProduct wp = workProductService.getProduct(id);
    // WorkProductDocument.WorkProduct theWorkProduct = WorkProductHelper.toWorkProduct(wp);
    //
    // XmlObject content = getContent(theWorkProduct, IncidentManagementServiceImpl.NS_Incident,
    // "Incident");
    // assertNotNull("content not found from create response", content);
    //
    // // update the incident document to have two versions of the incident work product
    // ProductPublicationStatus updateStatus = updateIncident(status, UPDATED_ACTIVITYNAME);
    // assertNotNull("update failed", updateStatus);
    // checkUpdatedName(updateStatus, UPDATED_ACTIVITYNAME);
    //
    // // ticket 580 states that after a work product is updated the namespace is wrong on the
    // // returned document when using the WorkProductService endpoint. So this code emulates what
    // // the WorkProductService endpoint getProduct returns
    // id = WorkProductHelper.getWorkProductIdentification(updateStatus.getProduct());
    // wp = workProductService.getProduct(id);
    // theWorkProduct = WorkProductHelper.toWorkProduct(wp);
    //
    // content = getContent(theWorkProduct, IncidentManagementServiceImpl.NS_Incident, "Incident");
    // assertNotNull("content not found from service response", content);
    //
    // // build the response document like the endpoint
    // if (theWorkProduct != null) {
    // GetProductResponseDocument response = GetProductResponseDocument.Factory.newInstance();
    // response.addNewGetProductResponse().setWorkProduct(theWorkProduct);
    // content = getContent(response.getGetProductResponse().getWorkProduct(),
    // IncidentManagementServiceImpl.NS_Incident, "Incident");
    // assertNotNull("content not found in endpoint response", content);
    // } else {
    // fail("Work Product does not exist");
    // }
    // }

    private XmlObject getContent(WorkProductDocument.WorkProduct workProduct, String namespace,
        String elementName) {

        XmlObject[] objects = workProduct.getStructuredPayloadArray(0).selectChildren(
            new QName(namespace, elementName));
        if (objects.length > 0) {
            return objects[0];
        }
        return null;
    }

    @Test
    public void testTicket_489() throws Exception {

        IncidentDocument incidentDocument = IncidentDocument.Factory.parse(new File(
            "./src/test/resources/incidentWithoutLocation.xml"));
        ProductPublicationStatus status = incidentManagementService.createIncident(incidentDocument.getIncident());

        assertEquals(ProductPublicationStatus.SuccessStatus, status.getStatus());
    }

    @Test
    public void testTicket_308() throws Exception {

        // create the incident
        IncidentDocument incidentDoc = IncidentDocument.Factory.parse(new File(
            "./src/test/resources/incident.xml"));

        if (!ValidationUtil.validate(incidentDoc, true)) {
            log.error("invalid input: " + incidentDoc);
        }

        ProductPublicationStatus status = incidentManagementService.createIncident(incidentDoc.getIncident());
        if (status.getStatus().equals(ProductPublicationStatus.SuccessStatus) == false) {
            fail("Create Incident failed");
        }

        // update the incident document to have two versions of the incident work product
        ProductPublicationStatus updateStatus = updateIncident(status, UPDATED_ACTIVITYNAME);
        assertNotNull("update failed", updateStatus);

        checkUpdatedName(updateStatus, UPDATED_ACTIVITYNAME);
    }

    private void checkUpdatedName(ProductPublicationStatus updateStatus, String expectedName) {

        IncidentDocument incidentDoc;
        incidentDoc = (IncidentDocument) updateStatus.getProduct().getProduct();
        TextType[] names = incidentDoc.getIncident().getActivityNameArray();
        String newName = null;
        if (names.length > 0) {
            newName = names[0].getStringValue();
        }

        assertEquals("names do not match", expectedName, newName);
    }

    private ProductPublicationStatus updateIncident(ProductPublicationStatus status,
        String updatedActivityName) {

        IncidentDocument incidentDoc;
        WorkProduct wp = status.getProduct();

        incidentDoc = (IncidentDocument) wp.getProduct();

        TextType[] names = incidentDoc.getIncident().getActivityNameArray();
        if (names.length > 0) {
            names[0].setStringValue(updatedActivityName);
        }

        incidentDoc.getIncident().setActivityNameArray(names);
        if (!ValidationUtil.validate(incidentDoc, true)) {
            log.error("invalid output: " + incidentDoc);
        }

        ProductPublicationStatus updateStatus = incidentManagementService.updateIncident(
            incidentDoc.getIncident(), WorkProductHelper.getWorkProductIdentification(wp));

        if (updateStatus.getStatus().equals(ProductPublicationStatus.SuccessStatus) == false) {
            log.error("Update failed for ticket 308");
            return null;
        }
        return updateStatus;
    }

    @Test
    public void testIncidentManagementCreation() {

        assertNotNull(incidentManagementService);
    }

    @Test
    public void testCreateIncidentFromCap() throws XmlException, IOException {

        ProductPublicationStatus status = incidentManagementService.createIncidentFromCap(createAlert());
        assertEquals("incident creation failed", ProductPublicationStatus.SuccessStatus,
            status.getStatus());

        WorkProduct wp = workProductService.getProduct(status.getProduct().getProductID());
        checkWorkProductMetadata(wp);

        ProductPublicationStatus alertStatus = alertService.createAlert(null, createAlert());
        workProductService.associateWorkProductToInterestGroup(
            alertStatus.getProduct().getProductID(), wp.getFirstAssociatedInterestGroupID());
        wp = workProductService.getProduct(alertStatus.getProduct().getProductID());
        AlertDocument alertDoc = (AlertDocument) wp.getProduct();
        assertEquals(alertDoc.getAlert().getIdentifier(), alertIdentifier);
    }

    @Test
    public void testIncidentStateObservable() {

        assertNotNull(messageReceiver);
        messageReceiver.gotIt = false;
        messageReceiver.setGotIncidentStateChange(0);

        IncidentStateNotificationMessage message = new IncidentStateNotificationMessage();
        message.setState(InterestGroupStateNotificationMessage.State.NEW);
        IncidentInfoType incidentInfo = IncidentInfoType.Factory.newInstance();
        incidentInfo.setId(incidentID);
        incidentInfo.setName(alertIdentifier);

        IdentificationType identification = IdentificationType.Factory.newInstance();
        identification.addNewChecksum().setStringValue("123");
        identification.addNewIdentifier().setStringValue("WPID");
        identification.addNewType().setStringValue(IncidentManagementService.Type);
        identification.addNewVersion().setStringValue("1");
        incidentInfo.setWorkProductIdentification(identification);

        message.setIncidentInfo(incidentInfo);

        incidentManagementService.notifyOfIncidentStateChange(message);

        assertTrue("state notification not sent on message channel", messageReceiver.gotIt);
        assertEquals("got more than one message", 1, messageReceiver.getGotIncidentStateChange());
    }

    @Test
    public void testIncidentList() {

        // List<String> incidents = incidentManagementService.getIncidentList();
        // assertTrue(incidents.size() == 1);
    }

    @Test
    public void testCloseIncident() throws Exception {

        // create the incident
        IncidentDocument incidentDoc = IncidentDocument.Factory.parse(new File(
            "./src/test/resources/incident.xml"));

        if (!ValidationUtil.validate(incidentDoc, true)) {
            fail("invalid input: " + incidentDoc);
        }

        ProductPublicationStatus status = incidentManagementService.createIncident(incidentDoc.getIncident());
        assertEquals("incident creation failed", ProductPublicationStatus.SuccessStatus,
            status.getStatus());

        String incidentWPID = status.getProduct().getProductID();
        String incidentID = null;
        Set<String> incidentIDSet = status.getProduct().getAssociatedInterestGroupIDs();
        Iterator<String> iterator = incidentIDSet.iterator();
        while (incidentID == null || iterator.hasNext()) {
            incidentID = iterator.next();
        }

        // all the associated products
        WorkProduct[] products = workProductService.getAssociatedWorkProductList(incidentID);

        // update the incident document to have two version of the incident work product
        WorkProduct wp = workProductService.getProduct(incidentWPID);
        checkWorkProductMetadata(wp);
        incidentDoc = (IncidentDocument) wp.getProduct();

        TextType[] names = incidentDoc.getIncident().getActivityNameArray();
        if (names.length > 0) {
            names[0].setStringValue("Update: " + names[0].getStringValue());
        }
        incidentDoc.getIncident().setActivityNameArray(names);
        if (!ValidationUtil.validate(incidentDoc, true)) {
            fail("invalid output: " + incidentDoc);
        }

        status = incidentManagementService.updateIncident(incidentDoc.getIncident(),
            WorkProductHelper.getWorkProductIdentification(wp));

        if (status.getStatus().equals(ProductPublicationStatus.SuccessStatus) == false) {
            fail("Update failed for testing close");
        }

        // ask IncidentManagementService for all the available incidents and close them all
        IncidentListType incidentList = incidentManagementService.getListOfIncidents();
        if (incidentList.sizeOfIncidentInfoArray() > 0) {
            IncidentInfoType[] incidentInfos = incidentList.getIncidentInfoArray();
            for (IncidentInfoType incidentInfo : incidentInfos) {
                // System.out.println("Incident: " + incidentInfo.getId() + " is alive so far ...");
                // delete the incident and all associated work products
                ProductPublicationStatus closeStatus = incidentManagementService.closeIncident(incidentInfo.getId());
                assertEquals("close failed", ProductPublicationStatus.SuccessStatus,
                    closeStatus.getStatus());
            }
        } else {
            fail("no incidents were found to close");
        }

        // try to update incident with IncidentManagementService
        status = incidentManagementService.updateIncident(incidentDoc.getIncident(),
            WorkProductHelper.getWorkProductIdentification(wp));

        // Update should fail because incident is closed
        assertEquals("update after close did not fail", ProductPublicationStatus.FailureStatus,
            status.getStatus());
        assertTrue("message is incorrect" + status.getReasonForFailure(),
            status.getReasonForFailure().contains("inactive"));

        // Updating work products associated with the incident should fail also
        for (WorkProduct product : products) {
            status = workProductService.publishProduct(product);
            assertEquals("update of wp did not faile", ProductPublicationStatus.FailureStatus,
                status.getStatus());
        }

        // the incident should be in the list of closed incidents
        String[] closedIncidentIDs = incidentManagementService.getListOfClosedIncident();
        boolean found = false;
        for (String iid : closedIncidentIDs) {
            if (iid.equals(incidentID))
                found = true;
        }
        assertTrue("did not find in closed incident list", found);
    }

    private void checkWorkProductMetadata(WorkProduct wp) {

        assertNotNull("work product is null", wp);
        assertTrue("work product is not active", wp.getActive());
        assertTrue("no associated interest groups", wp.getAssociatedInterestGroupIDs().size() > 0);
        assertNotNull("checksum is null", wp.getChecksum());
        // there is no context to get a user to fill out created by during unit testing
        // assertNotNull("created by is null",wp.getCreatedBy());
        // assertNotNull("created date is null",wp.getCreatedDate());
        assertNotNull("digest is null", wp.getDigest());
        assertNotNull("first associated IG ID is null", wp.getFirstAssociatedInterestGroupID());
        assertNotNull("product is null", wp.getProduct());
        assertNotNull("product id is null", wp.getProductID());
        assertNotNull("product type is null", wp.getProductType());
        assertNotNull("product version is null", wp.getProductVersion());
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml",
            "classpath:contexts/test-msgRcvrContext-em.xml" };
    }

    private Alert createAlert() {

        // Create an alert to publish
        Alert alert = Alert.Factory.newInstance();
        alert.setIdentifier(alertIdentifier);
        alert.setSender(alertSender);
        alert.setSent(alertSent);
        alert.setMsgType(Alert.MsgType.ALERT);
        alert.setStatus(Alert.Status.ACTUAL);
        alert.setScope(Alert.Scope.PUBLIC);
        alert.setAddresses(alertAddress);
        Info info = alert.addNewInfo();
        Alert.Info.Category.Enum categoryArray[] = new Alert.Info.Category.Enum[1];
        categoryArray[0] = Alert.Info.Category.CBRNE;
        info.setCategoryArray(categoryArray);
        info.setEvent(alertEvent);
        EventCode event = info.addNewEventCode();
        event.setValue("value");
        event.setValueName("name");
        info.setSeverity(Alert.Info.Severity.MODERATE);
        info.setCertainty(Alert.Info.Certainty.LIKELY);
        info.setHeadline(alertHeadline);
        info.setUrgency(Alert.Info.Urgency.EXPECTED);

        return alert;
    }
}
