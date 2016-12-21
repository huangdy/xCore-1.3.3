package com.saic.uicds.core.em.processes.agreements;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.uicds.agreementService.AgreementListType;
import org.uicds.agreementService.AgreementType;
import org.uicds.agreementService.AgreementType.ShareRules;
import org.uicds.incident.IncidentDocument;
import org.uicds.incidentManagementService.IncidentInfoType;
import org.uicds.incidentManagementService.IncidentListType;
import org.uicds.incidentManagementService.ShareIncidentRequestDocument.ShareIncidentRequest;

import x0.messageStructure1.StructuredPayloadType;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.structures.WorkProductDocument;
import com.saic.uicds.core.em.messages.IncidentStateNotificationMessage;
import com.saic.uicds.core.em.service.IncidentManagementService;
import com.saic.uicds.core.infrastructure.exceptions.InvalidInterestGroupIDException;
import com.saic.uicds.core.infrastructure.exceptions.LocalCoreNotOnlineException;
import com.saic.uicds.core.infrastructure.exceptions.NoShareAgreementException;
import com.saic.uicds.core.infrastructure.exceptions.NoShareRuleInAgreementException;
import com.saic.uicds.core.infrastructure.exceptions.RemoteCoreUnavailableException;
import com.saic.uicds.core.infrastructure.exceptions.UICDSException;
import com.saic.uicds.core.infrastructure.exceptions.XMPPComponentException;
import com.saic.uicds.core.infrastructure.messages.CoreStatusUpdateMessage;
import com.saic.uicds.core.infrastructure.messages.InterestGroupStateNotificationMessage;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.AgreementService;
import com.saic.uicds.core.infrastructure.service.ConfigurationService;
import com.saic.uicds.core.infrastructure.service.InterestGroupManagementComponent;
import com.saic.uicds.core.infrastructure.util.AgreementTestUtils;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;
import com.saic.uicds.core.infrastructure.util.XmlUtil;

public class TestAgreements {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    AutoShareIncidents autoShareIncidents;

    // mock objects
    IncidentManagementService incidentManagementService;
    AgreementService agreementService;
    ConfigurationService configurationService;

    static private final String INCIDENT_DOC_WPID = "1";
    static private final String INCIDENT_ID = "222";
    static private final String INCIDENT_TYPE = "Geo";
    static private final String OTHER_INCIDENT_TYPE = "CBRNE";
    static private final String INCIDENT_NAME = "IncidentName";

    static private final String OWNING_CORE_FQN = "uicds@uicds-test1.saic.com";
    static private final String SHARE_CORE_FQN = "uicds@uicds-test2.saic.com";
    static private final String ANOTHER_SHARE_CORE_FQN = "uicds@uicds-test3.saic.com";

    static private final String SHARE_CORE_FULL_JID = SHARE_CORE_FQN + "/CoreConnection";
    static private final String OWNING_CORE_FULL_JID = OWNING_CORE_FQN + "/CoreConnection";

    static private final String AVAILABLE = "available";
    static private final String UNAVAILABLE = "unavailable";
    static private final String UNSUBSCRIBED = "unsubscribed";

    private AgreementType agreement;

    private AgreementListType agreementList;

    IncidentDocument incidentDoc;
    WorkProduct incidentWP;

    org.easymock.Capture<ShareIncidentRequest> shareIncidentRequest;

    public void setAgreementsMonitor(AutoShareIncidents agreementsMonitor) {

        this.autoShareIncidents = agreementsMonitor;
    }

    @Before
    public void onSetUp() {

        autoShareIncidents = new AutoShareIncidents();

        // log.debug("\nCall: \n onSetUp\n");
        incidentManagementService = EasyMock.createMock(IncidentManagementService.class);
        autoShareIncidents.setIncidentManagementService(incidentManagementService);

        agreementService = EasyMock.createMock(AgreementService.class);
        autoShareIncidents.setAgreementService(agreementService);

        configurationService = EasyMock.createMock(ConfigurationService.class);
        autoShareIncidents.setConfigurationService(configurationService);

        // Create a simple agreement to test with
        agreement = AgreementTestUtils.createAgreement(OWNING_CORE_FQN, SHARE_CORE_FQN);

        agreementList = AgreementListType.Factory.newInstance();
        // System.out.println(agreement);
        addAgreementToList(agreement);

        // Create a test incident document
        incidentDoc = IncidentDocument.Factory.newInstance();
        incidentDoc.addNewIncident().addNewActivityCategoryText().setStringValue(INCIDENT_TYPE);
        incidentDoc.getIncident().addNewActivityName().setStringValue(INCIDENT_NAME);
        createIncidentWP();

        shareIncidentRequest = new org.easymock.Capture<ShareIncidentRequest>();
    }

    /**
     * @throws java.lang.Exception
     */
    @Test
    public void testSetup() {

        assertNotNull(autoShareIncidents);
    }

    /**
     * Test the sharing of an incident when it gets created when the default agreement is in place
     */
    @Test
    public void testShareIncident() {

        log.error("ERROR");

        setupMocksForShare(1);

        IncidentStateNotificationMessage msg = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);

        assertEquals("Wrong incident IG in share request", INCIDENT_ID,
            shareIncidentRequest.getValue().getIncidentID());

        // Create a test incident document without a category (incident type)
        // that should still get shared
        createIncidentDocument();
        createIncidentWP();

        setupMocksForShare(1);

        IncidentStateNotificationMessage msg2 = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg2);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);

        assertEquals("Wrong incident IG in share request", msg2.getIncidentInfo().getId(),
            shareIncidentRequest.getValue().getIncidentID());

    }

    public void createIncidentDocument() {

        incidentDoc = IncidentDocument.Factory.newInstance();
        incidentDoc.addNewIncident().addNewActivityName().setStringValue(INCIDENT_NAME);
    }

    /**
     * Test that incidents are not shared if the share rules are disabled
     */
    @Test
    public void testNoShareWithShareRulesDisabled() {

        disableShareRules(agreement);
        // System.out.println(agreementList);

        setupMocksForNoShare();

        IncidentStateNotificationMessage msg = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    /**
     * Test that the incident is shared based on a specific share rule
     */
    @Test
    public void testShareBasedOnShareRule() {

        EasyMock.reset(agreementService, incidentManagementService, configurationService);

        // Add an explicit share rule
        addShareRule(AutoShareIncidents.INTEREST_GROUP_CODESPACE, INCIDENT_TYPE, "1", true);

        // System.out.println(agreementList);

        setupMocksForShare(1);

        IncidentStateNotificationMessage msg = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);

        assertEquals("Wrong incident IG in share request", INCIDENT_ID,
            shareIncidentRequest.getValue().getIncidentID());

        createIncidentDocument();
        createIncidentWP();

        setupMocksForNoShare();

        IncidentStateNotificationMessage msg2 = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg2);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    /**
     * Test that incidents are not shared if the share rules are disabled
     */
    @Test
    public void testNoShareWithShareRuleAndShareRulesDisabled() {

        // Add an explicit share rule
        addShareRule(AutoShareIncidents.INTEREST_GROUP_CODESPACE, INCIDENT_TYPE, "1", true);

        disableShareRules(agreement);
        // System.out.println(agreementList);

        setupMocksForNoShare();

        IncidentStateNotificationMessage msg = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    /**
     * Test that incidents are shared if there are share rules but they are all disabled
     */
    @Test
    public void testShareWithAllShareRuleDisabled() {

        // Add an explicit share rule
        addShareRule(AutoShareIncidents.INTEREST_GROUP_CODESPACE, INCIDENT_TYPE, "1", false);
        addShareRule(AutoShareIncidents.INTEREST_GROUP_CODESPACE, OTHER_INCIDENT_TYPE, "1", false);

        // System.out.println(agreementList);

        setupMocksForShare(1);

        IncidentStateNotificationMessage msg = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);

        assertEquals("Wrong incident IG in share request", INCIDENT_ID,
            shareIncidentRequest.getValue().getIncidentID());

        createIncidentDocument();
        createIncidentWP();

        setupMocksForShare(1);

        IncidentStateNotificationMessage msg2 = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg2);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);

        assertEquals("Wrong incident IG in share request", msg2.getIncidentInfo().getId(),
            shareIncidentRequest.getValue().getIncidentID());

    }

    /**
     * Test that incidents are not shared if the specific share rule is disabled
     */
    @Test
    public void testShareWithOneShareRuleDisabled() {

        // Add an explicit share rule
        addShareRule(AutoShareIncidents.INTEREST_GROUP_CODESPACE, INCIDENT_TYPE, "1", true);
        addShareRule(AutoShareIncidents.INTEREST_GROUP_CODESPACE, OTHER_INCIDENT_TYPE, "1", false);

        // System.out.println(agreementList);

        setupMocksForShare(1);

        IncidentStateNotificationMessage msg = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);

        assertEquals("Wrong incident IG in share request", INCIDENT_ID,
            shareIncidentRequest.getValue().getIncidentID());

        createIncidentDocument();
        createIncidentWP();

        setupMocksForNoShare();

        IncidentStateNotificationMessage msg2 = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg2);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);

    }

    /**
     * Test that the incident does not get shared when it gets created with the wrong type
     */
    @Test
    public void testNotShareIncidentWrongType() {

        // Add an explicit share rule
        addShareRule(AutoShareIncidents.INTEREST_GROUP_CODESPACE, OTHER_INCIDENT_TYPE, "1", true);

        // System.out.println(agreementList);

        setupMocksForNoShare();

        IncidentStateNotificationMessage msg = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    /**
     * Test that the incident does not get shared when there is only one rule and it is the Manual
     * share rule
     */
    @Test
    public void testNotShareIncidentManualRule() {

        // Add an explicit share rule
        addShareRule(InterestGroupManagementComponent.MANUAL_CODE_SPACE, Boolean.TRUE.toString(),
            "1", true);

        // System.out.println(agreementList);

        setupMocksForNoShare();

        IncidentStateNotificationMessage msg = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    /**
     * Test the sharing of an incident with multiple agreements
     */
    @Test
    public void testShareIncidentToMultiple() {

        // Add another core to the agreement
        AgreementType a = AgreementTestUtils.createAgreement(OWNING_CORE_FQN, SHARE_CORE_FQN);
        addAgreementToList(a);

        setupMocksForShare(2);

        IncidentStateNotificationMessage msg = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);

        assertEquals("Wrong incident IG in share request", INCIDENT_ID,
            shareIncidentRequest.getValue().getIncidentID());

    }

    /**
     * Test the sharing of an incident with only 1 of multiple agreements
     */
    @Test
    public void testShareIncidentToOneOfMultiple() {

        // Add another core to the agreement
        AgreementType a = AgreementTestUtils.createAgreement(OWNING_CORE_FQN, SHARE_CORE_FQN);
        addShareRule(AutoShareIncidents.INTEREST_GROUP_CODESPACE, OTHER_INCIDENT_TYPE, "1", true);

        addAgreementToList(a);

        setupMocksForShare(1);

        IncidentStateNotificationMessage msg = createIncidentNotificationMessage();

        autoShareIncidents.handleIncidentState(msg);

        // verifying incidentManagementService verifies this test since we want
        // incidentManagementService.shareIncident to get called.
        EasyMock.verify(agreementService, incidentManagementService, configurationService);

        assertEquals("Wrong incident IG in share request", INCIDENT_ID,
            shareIncidentRequest.getValue().getIncidentID());

    }

    /**
     * Test handling of an unsubscribe message from a core
     * 
     * @return
     */
    @Test
    public void testOnlineMessageForOwningCore() {

        EasyMock.expect(configurationService.getCoreName()).andReturn(OWNING_CORE_FQN);

        // Nothing should be called on the dependencies
        EasyMock.replay(agreementService, incidentManagementService, configurationService);

        CoreStatusUpdateMessage message = createCoreRosterMessage(OWNING_CORE_FULL_JID,
            UNSUBSCRIBED);
        autoShareIncidents.coreStatusUpdateHandler(message);

        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    /**
     * Test handling of an unsubscribe message from a core
     * 
     * @return
     */
    @Test
    public void testUnsubscribedMessage() {

        EasyMock.expect(configurationService.getCoreName()).andReturn(OWNING_CORE_FQN);

        // Nothing should be called on the dependencies
        EasyMock.replay(agreementService, incidentManagementService, configurationService);

        CoreStatusUpdateMessage message = createCoreRosterMessage(SHARE_CORE_FULL_JID, UNSUBSCRIBED);
        autoShareIncidents.coreStatusUpdateHandler(message);

        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    /**
     * Test handling of an unavailable message from a core
     * 
     * @return
     */
    @Test
    public void testUnavailableMessage() {

        EasyMock.expect(configurationService.getCoreName()).andReturn(OWNING_CORE_FQN);

        // Nothing should be called on the dependencies
        EasyMock.replay(agreementService, incidentManagementService, configurationService);

        CoreStatusUpdateMessage message = createCoreRosterMessage(SHARE_CORE_FULL_JID, UNAVAILABLE);
        autoShareIncidents.coreStatusUpdateHandler(message);

        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    /**
     * Test handling of an available message from a core with no incidents
     * 
     * @return
     * @throws UICDSException
     * @throws NoShareRuleInAgreementException
     * @throws NoShareAgreementException
     * @throws XMPPComponentException
     * @throws RemoteCoreUnavailableException
     * @throws LocalCoreNotOnlineException
     * @throws InvalidInterestGroupIDException
     */
    @Test
    public void testAvailableMessageNoIncidents() throws InvalidInterestGroupIDException,
        LocalCoreNotOnlineException, RemoteCoreUnavailableException, XMPPComponentException,
        NoShareAgreementException, NoShareRuleInAgreementException, UICDSException {

        EasyMock.expect(configurationService.getCoreName()).andReturn(OWNING_CORE_FQN).anyTimes();

        // IncidentListType list = IncidentListType.Factory.newInstance();
        // list.addNewIncidentInfo();
        EasyMock.expect(incidentManagementService.getListOfIncidents()).andReturn(null);

        // Nothing should be called on the dependencies
        EasyMock.replay(agreementService, incidentManagementService, configurationService);

        CoreStatusUpdateMessage message = createCoreRosterMessage(SHARE_CORE_FULL_JID, AVAILABLE);
        autoShareIncidents.coreStatusUpdateHandler(message);

        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    /**
     * Test handling of an available message from a core with no incidents that need to be shared
     * because the agreement is disabled
     * 
     * @return
     */
    @Test
    public void testAvailableMessageNoShareAgreementDisabled() {

        setupMocksForNoShareDuringCoreStatusUpdate(false);

        CoreStatusUpdateMessage message = createCoreRosterMessage(SHARE_CORE_FULL_JID, AVAILABLE);

        autoShareIncidents.coreStatusUpdateHandler(message);

        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    /**
     * Test handling of an available message from a core with an incident that need to be shared
     * 
     * @return
     * @throws UICDSException
     * @throws NoShareRuleInAgreementException
     * @throws NoShareAgreementException
     * @throws XMPPComponentException
     * @throws RemoteCoreUnavailableException
     * @throws LocalCoreNotOnlineException
     * @throws InvalidInterestGroupIDException
     */
    @Test
    public void testAvailableMessageShareEnabledNoRules() throws InvalidInterestGroupIDException,
        LocalCoreNotOnlineException, RemoteCoreUnavailableException, XMPPComponentException,
        NoShareAgreementException, NoShareRuleInAgreementException, UICDSException {

        setupMocksForShareDuringCoreStatusUpdate(1, false, SHARE_CORE_FQN);

        CoreStatusUpdateMessage message = createCoreRosterMessage(SHARE_CORE_FULL_JID, AVAILABLE);

        autoShareIncidents.coreStatusUpdateHandler(message);

        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    /**
     * Test handling of an available message from a core with no incidents that need to be shared
     * because it is already shared to that core
     * 
     * @return
     */
    @Test
    public void testAvailableMessageNoShareAlreadyShared() {

        setupMocksForNoShareDuringCoreStatusUpdate(true);

        CoreStatusUpdateMessage message = createCoreRosterMessage(SHARE_CORE_FULL_JID, AVAILABLE);

        autoShareIncidents.coreStatusUpdateHandler(message);

        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    /**
     * Test handling of an available message from a core with an incident that need to be shared
     * because it is not already shared, there are cores in the shared list, and the incident does
     * match an agreement
     * 
     * @return
     */
    @Test
    public void testAvailableMessageShareNotAlreadySharedAndMatchingAgreement() {

        setupMocksForShareDuringCoreStatusUpdate(1, true, "other.domain.com");

        CoreStatusUpdateMessage message = createCoreRosterMessage(SHARE_CORE_FULL_JID, AVAILABLE);

        autoShareIncidents.coreStatusUpdateHandler(message);

        EasyMock.verify(agreementService, incidentManagementService, configurationService);
    }

    private CoreStatusUpdateMessage createCoreRosterMessage(String core, String status) {

        CoreStatusUpdateMessage message = new CoreStatusUpdateMessage(core, status, "38.922429", "-77.233468");
        return message;
    }

    private IncidentStateNotificationMessage createIncidentNotificationMessage() {

        IncidentStateNotificationMessage msg = createIncidentStateNotificationMessage(InterestGroupStateNotificationMessage.State.NEW);
        IncidentInfoType info = msg.getIncidentInfo();
        info.setOwningCore(OWNING_CORE_FQN);
        info.setId(INCIDENT_ID);
        msg.setIncidentInfo(info);
        return msg;
    }

    private void setupMocksForShare(int numShares) {

        EasyMock.reset(agreementService, incidentManagementService, configurationService);

        EasyMock.expect(agreementService.getAgreementList()).andReturn(agreementList);

        EasyMock.expect(configurationService.getCoreName()).andReturn(OWNING_CORE_FQN);

        for (int i = 0; i < numShares; i++) {
            try {
                EasyMock.expect(
                    incidentManagementService.shareIncidentAgreementChecked(EasyMock.and(
                        EasyMock.isA(ShareIncidentRequest.class),
                        EasyMock.capture(shareIncidentRequest)))).andReturn(true);
            } catch (InvalidInterestGroupIDException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (LocalCoreNotOnlineException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (RemoteCoreUnavailableException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (XMPPComponentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoShareAgreementException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoShareRuleInAgreementException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (UICDSException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        EasyMock.expect(incidentManagementService.getIncident(INCIDENT_DOC_WPID)).andReturn(
            incidentWP);

        EasyMock.replay(agreementService, incidentManagementService, configurationService);
    }

    private void setupMocksForShareDuringCoreStatusUpdate(int numShares, boolean alreadyShared,
        String sharedToCore) {

        EasyMock.reset(agreementService, incidentManagementService, configurationService);

        EasyMock.expect(configurationService.getCoreName()).andReturn(OWNING_CORE_FQN).anyTimes();

        IncidentListType list = IncidentListType.Factory.newInstance();
        IncidentInfoType incidentInfo = list.addNewIncidentInfo();
        incidentInfo.addNewWorkProductIdentification().set(
            WorkProductHelper.getWorkProductIdentification(incidentWP));
        incidentInfo.setOwningCore(OWNING_CORE_FQN);
        incidentInfo.setId(INCIDENT_ID);

        if (alreadyShared) {
            incidentDoc.getIncident().addSharedCoreName(sharedToCore);
            updateIncidentWP();
        }

        EasyMock.expect(incidentManagementService.getListOfIncidents()).andReturn(list);

        EasyMock.expect(incidentManagementService.getIncident(EasyMock.isA(String.class))).andReturn(
            incidentWP);
        EasyMock.expect(incidentManagementService.getIncident(EasyMock.isA(String.class))).andReturn(
            incidentWP);

        EasyMock.expect(agreementService.getAgreementList()).andReturn(agreementList);

        for (int i = 0; i < numShares; i++) {
            try {
                EasyMock.expect(
                    incidentManagementService.shareIncidentAgreementChecked(EasyMock.isA(ShareIncidentRequest.class))).andReturn(
                    true);
            } catch (InvalidInterestGroupIDException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (LocalCoreNotOnlineException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (RemoteCoreUnavailableException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (XMPPComponentException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoShareAgreementException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (NoShareRuleInAgreementException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (UICDSException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        EasyMock.replay(agreementService, incidentManagementService, configurationService);
    }

    private void setupMocksForNoShare() {

        EasyMock.reset(agreementService, incidentManagementService, configurationService);

        EasyMock.expect(agreementService.getAgreementList()).andReturn(agreementList);

        EasyMock.expect(configurationService.getCoreName()).andReturn(OWNING_CORE_FQN);

        EasyMock.expect(incidentManagementService.getIncident(INCIDENT_DOC_WPID)).andReturn(
            incidentWP);

        EasyMock.replay(agreementService, incidentManagementService, configurationService);
    }

    private void setupMocksForNoShareDuringCoreStatusUpdate(boolean alreadyShared) {

        EasyMock.reset(agreementService, incidentManagementService, configurationService);

        EasyMock.expect(configurationService.getCoreName()).andReturn(OWNING_CORE_FQN).anyTimes();

        IncidentListType list = IncidentListType.Factory.newInstance();
        IncidentInfoType incidentInfo = list.addNewIncidentInfo();
        incidentInfo.addNewWorkProductIdentification().set(
            WorkProductHelper.getWorkProductIdentification(incidentWP));
        incidentInfo.setId(INCIDENT_ID);
        incidentInfo.setOwningCore(OWNING_CORE_FQN);

        if (alreadyShared) {
            incidentDoc.getIncident().addSharedCoreName(SHARE_CORE_FQN);
            updateIncidentWP();
        } else {
            agreement.getShareRules().setEnabled(false);
            updateAgreementInAgreementList(agreement);
            EasyMock.expect(agreementService.getAgreementList()).andReturn(agreementList);
            EasyMock.expect(incidentManagementService.getIncident(EasyMock.isA(String.class))).andReturn(
                incidentWP);
        }
        EasyMock.expect(incidentManagementService.getIncident(EasyMock.isA(String.class))).andReturn(
            incidentWP);

        EasyMock.expect(incidentManagementService.getListOfIncidents()).andReturn(list);

        EasyMock.replay(agreementService, incidentManagementService, configurationService);
    }

    private void addAgreementToList(AgreementType agreement) {

        AgreementType[] list = agreementList.getAgreementArray();
        ArrayList<AgreementType> newList = new ArrayList<AgreementType>();
        for (AgreementType a : list) {
            newList.add(a);
        }
        newList.add(agreement);
        agreementList.setAgreementArray((AgreementType[]) newList.toArray(new AgreementType[newList.size()]));
    }

    private void addShareRule(String codespace, String incidentType, String ruleID, boolean enabled) {

        AgreementTestUtils.addShareRule(agreement, codespace, incidentType, ruleID, enabled);

        updateAgreementInAgreementList(agreement);
    }

    private void updateAgreementInAgreementList(AgreementType newAgreement) {

        for (int i = 0; i < agreementList.sizeOfAgreementArray(); i++) {
            AgreementType a = agreementList.getAgreementArray(i);
            if (a.getPrincipals().getRemoteCore().getStringValue().equals(
                newAgreement.getPrincipals().getRemoteCore().getStringValue())) {
                agreementList.setAgreementArray(i, newAgreement);
            }
        }
    }

    private void disableShareRules(AgreementType agreement2) {

        ShareRules shareRules = agreement.getShareRules();
        if (shareRules == null) {
            shareRules = agreement.addNewShareRules();
        }
        shareRules.setEnabled(false);
        updateAgreementInAgreementList(agreement);
    }

    private void createIncidentWP() {

        WorkProductDocument wpd = WorkProductDocument.Factory.newInstance();
        wpd.addNewWorkProduct();
        wpd.getWorkProduct().addNewPackageMetadata().addNewPackageMetadataExtensionAbstract();
        StructuredPayloadType payload = wpd.getWorkProduct().addNewStructuredPayload();
        payload.set(incidentDoc);
        payload.addNewStructuredPayloadMetadata().setCommunityURI(
            IncidentDocument.type.getDocumentElementName().getNamespaceURI());
        payload.getStructuredPayloadMetadata().setCommunityVersion("0.1");

        IdentificationType wpid = getWorkProductIdentification();

        // WorkProductIdentification
        XmlUtil.substitute(
            wpd.getWorkProduct().getPackageMetadata().getPackageMetadataExtensionAbstractArray(0),
            WorkProductHelper.NS_PRECIS_STRUCTURES, WorkProductHelper.S_PACKAGE_IDENTIFICATION,
            IdentificationType.type, wpid);

        // System.out.println(wpd);

        incidentWP = WorkProductHelper.toModel(wpd.getWorkProduct());
        incidentWP.setProduct(incidentDoc);
    }

    private void updateIncidentWP() {

        incidentWP.setProduct(incidentDoc);
    }

    private IncidentStateNotificationMessage createIncidentStateNotificationMessage(
        InterestGroupStateNotificationMessage.State state) {

        IncidentStateNotificationMessage msg = new IncidentStateNotificationMessage();
        IncidentInfoType incidentInfo = IncidentInfoType.Factory.newInstance();

        IdentificationType identification = getWorkProductIdentification();
        incidentInfo.setWorkProductIdentification(identification);
        incidentInfo.setId(INCIDENT_ID);
        msg.setIncidentInfo(incidentInfo);
        msg.setState(state);
        return msg;
    }

    public IdentificationType getWorkProductIdentification() {

        IdentificationType identification = IdentificationType.Factory.newInstance();
        identification.addNewChecksum().setStringValue("123");
        identification.addNewIdentifier().setStringValue(INCIDENT_DOC_WPID);
        identification.addNewType().setStringValue(IncidentManagementService.Type);
        identification.addNewVersion().setStringValue("1");
        return identification;
    }

}
