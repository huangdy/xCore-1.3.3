package com.saic.uicds.core.em.integration;

import gov.niem.niem.niemCore.x20.TextType;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;
import org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.uicds.incident.IncidentDocument;
import org.uicds.incidentManagementService.IncidentInfoType;
import org.uicds.incidentManagementService.IncidentListType;
import org.uicds.resourceProfileService.ResourceProfile;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.base.IdentifierType;
import com.saic.precis.x2009.x06.base.StateType;
import com.saic.uicds.core.em.service.impl.IncidentManagementServiceImpl;
import com.saic.uicds.core.infrastructure.exceptions.ResourceProfileDoesNotExist;
import com.saic.uicds.core.infrastructure.model.ResourceInstanceModel;
import com.saic.uicds.core.infrastructure.model.ResourceProfileModel;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.NotificationService;
import com.saic.uicds.core.infrastructure.service.ResourceInstanceService;
import com.saic.uicds.core.infrastructure.service.ResourceProfileService;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;
import com.saic.uicds.core.infrastructure.util.ValidationUtil;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;

/**
 * @author roger
 * 
 */
public class IncidentLifecycleNotifications
    extends AbstractXmldbJpaTests {

    private static final String RESOURCE_ID = "resourceID";

    private static final String INCIDENT_TOPIC_EXPRESSION = "Incident";

    private static final String PROFILE_ID = "IncidentProfile";

    Logger log = LoggerFactory.getLogger(IncidentLifecycleNotifications.class);

    @Autowired
    IncidentManagementServiceImpl incidentManagementService;

    @Autowired
    WorkProductService workProductService;

    @Autowired
    ResourceProfileService resourceProfileService;

    @Autowired
    ResourceInstanceService resourceInstanceService;

    @Autowired
    NotificationService notificationService;

    @Test
    public void testLifeCycle() throws Exception {

        // Create a profile interested in incidents
        createResourceProfile();

        // Create a resource instance based on that profile
        createResourceInstance();

        // create the incident
        IncidentDocument incidentDoc = getInitialIncidentRequest();
        ProductPublicationStatus status = incidentManagementService.createIncident(incidentDoc.getIncident());
        assertEquals("incident creation failed", ProductPublicationStatus.SuccessStatus,
            status.getStatus());

        String incidentID = getIncidentIDFromStatus(status);

        // Check work product
        WorkProduct wp = getIncidentWorkProduct(status);
        checkWorkProductMetadata(wp);

        // update the incident document to have three versions of the incident work product
        incidentDoc = getIncidentUpdateDocument(wp);
        status = updateIncident(incidentDoc, wp);

        wp = getIncidentWorkProduct(status);
        updateIncident(incidentDoc, wp);

        // Check what notifications we get
        getNotificationsAfterUpdate();

        // update again before close (version = 4)
        wp = getIncidentWorkProduct(status);
        updateIncident(incidentDoc, wp);

        // Close all the incidents (version = 5)
        closeAllIncidents();

        // Archive the incident
        archiveIncident(incidentID);

        // Check what notifications we get
        getNotificationsAfterArchive();
    }

    /**
     * After an update, closing, and archiving the incident we should get only a notification that
     * version 5 was the inactive work product and one notifcation of a deleted work product.
     */
    private void getNotificationsAfterArchive() {

        NotificationMessageHolderType[] m = notificationService.getMessages(RESOURCE_ID, 1);
        assertTrue("no messages", m.length > 0);
        assertEquals("wrong number of message", 2, m.length);
        try {
            com.saic.precis.x2009.x06.structures.WorkProductDocument workProduct = com.saic.precis.x2009.x06.structures.WorkProductDocument.Factory.parse(m[0].getMessage().toString());
            IdentificationType id = WorkProductHelper.getIdentificationElement(workProduct.getWorkProduct());
            assertEquals("wrong version", "5", id.getVersion().getStringValue());
            assertEquals("wrong state", StateType.INACTIVE, id.getState());

            org.uicds.notificationService.WorkProductDeletedNotificationDocument wpDeleted = org.uicds.notificationService.WorkProductDeletedNotificationDocument.Factory.parse(m[1].getMessage().toString());
            assertEquals(
                "wrong type deleted",
                "Incident",
                wpDeleted.getWorkProductDeletedNotification().getWorkProductIdentification().getType().getStringValue());
        } catch (XmlException e) {
            fail("message is not a work product notification");
        }
    }

    /**
     * After creating an incident and one update it is expected that there should be one
     * notification message with the work product version = 2
     */
    private void getNotificationsAfterUpdate() {

        NotificationMessageHolderType[] m = notificationService.getMessages(RESOURCE_ID, 1);
        assertTrue("no messages", m.length > 0);
        assertEquals("wrong number of message", 1, m.length);
        try {
            com.saic.precis.x2009.x06.structures.WorkProductDocument workProduct = com.saic.precis.x2009.x06.structures.WorkProductDocument.Factory.parse(m[0].getMessage().toString());
            IdentificationType id = WorkProductHelper.getIdentificationElement(workProduct.getWorkProduct());
            assertEquals("wrong version", "3", id.getVersion().getStringValue());
        } catch (XmlException e) {
            fail("message is not a work product notification");
        }
    }

    private ProductPublicationStatus updateIncident(IncidentDocument incidentDoc, WorkProduct wp) {

        ProductPublicationStatus status;
        status = incidentManagementService.updateIncident(incidentDoc.getIncident(),
            WorkProductHelper.getWorkProductIdentification(wp));

        if (status.getStatus().equals(ProductPublicationStatus.SuccessStatus) == false) {
            fail("Update failed for testing close: " + status.getReasonForFailure());
        }

        return status;
    }

    private void createResourceInstance() {

        IdentifierType resid = IdentifierType.Factory.newInstance();
        resid.setStringValue(RESOURCE_ID);
        IdentifierType localid = IdentifierType.Factory.newInstance();
        localid.setStringValue("localID");
        IdentifierType profid = IdentifierType.Factory.newInstance();
        profid.setStringValue(PROFILE_ID);
        try {
            ResourceInstanceModel r = resourceInstanceService.register(resid, localid, profid);
            assertNotNull("create resource instance failed", r);
            assertTrue("no endpoints", r.getEndpoints().size() > 0);
            String e = r.getEndpoints().iterator().next();
            assertNotNull("endpoint is null", e);
            assertFalse("endpoint is empty", e.isEmpty());
        } catch (ResourceProfileDoesNotExist e) {
            fail("profile not found creating instance");
        }
    }

    private void createResourceProfile() {

        ResourceProfile request = ResourceProfile.Factory.newInstance();
        request.addNewID().setStringValue(PROFILE_ID);
        request.addNewInterests().addNewInterest().setTopicExpression(INCIDENT_TOPIC_EXPRESSION);
        ResourceProfileModel resourceModel = resourceProfileService.createProfile(request);
        assertNotNull("create profile failed", resourceModel);
    }

    private void archiveIncident(String incidentID) {

        ProductPublicationStatus status;
        status = incidentManagementService.archiveIncident(incidentID);
        assertEquals("archive failed", ProductPublicationStatus.SuccessStatus, status.getStatus());
    }

    private void closeAllIncidents() {

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
    }

    private IncidentDocument getIncidentUpdateDocument(WorkProduct wp) throws XmlException {

        IncidentDocument incidentDoc = (IncidentDocument) wp.getProduct();

        TextType[] names = incidentDoc.getIncident().getActivityNameArray();
        if (names.length > 0) {
            names[0].setStringValue("Update: " + names[0].getStringValue());
        }
        incidentDoc.getIncident().setActivityNameArray(names);
        if (!ValidationUtil.validate(incidentDoc, true)) {
            fail("invalid output: " + incidentDoc);
        }
        return incidentDoc;
    }

    private WorkProduct getIncidentWorkProduct(ProductPublicationStatus status) {

        String incidentWPID = status.getProduct().getProductID();
        WorkProduct wp = workProductService.getProduct(incidentWPID);
        return wp;
    }

    private String getIncidentIDFromStatus(ProductPublicationStatus status) {

        String incidentID = null;
        Set<String> incidentIDSet = status.getProduct().getAssociatedInterestGroupIDs();
        Iterator<String> iterator = incidentIDSet.iterator();
        while (incidentID == null || iterator.hasNext()) {
            incidentID = iterator.next();
        }
        return incidentID;
    }

    private IncidentDocument getInitialIncidentRequest() throws XmlException, IOException {

        IncidentDocument incidentDoc = IncidentDocument.Factory.parse(new File(
            "./src/test/resources/incident.xml"));

        if (!ValidationUtil.validate(incidentDoc, true)) {
            fail("invalid input: " + incidentDoc);
        }
        return incidentDoc;
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

}
