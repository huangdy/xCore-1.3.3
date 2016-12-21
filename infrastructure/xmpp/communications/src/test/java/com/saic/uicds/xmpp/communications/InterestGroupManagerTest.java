/**
 * 
 */
package com.saic.uicds.xmpp.communications;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.eq;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.isA;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.reset;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.filter.PacketFilter;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Type;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.integration.core.Message;
import org.springframework.integration.core.MessageChannel;

import com.saic.uicds.xmpp.communications.util.XmppUtils;
import com.saic.uicds.xmpp.extensions.pubsub.PubSubIQFactory;
import com.saic.uicds.xmpp.extensions.util.ArbitraryIQ;

/**
 * @author roger
 * 
 */
public class InterestGroupManagerTest {

    private InterestGroupManager interestGroupManager;
    private InterestManager interestManager;
    private DataDrivenCoreConnection coreConnection;

    static private final String CORE1_NAME = "core1.agency.gov";
    static private final String CORE2_NAME = "core2.agency.gov";
    static private final String INTEREST_GROUP_ROOT = "incidents";
    static private final String OWNED_INTEREST_GROUP_ID = "138";
    static private final String OWNED_INTEREST_GROUP_TYPE = "Incident";
    static private final String OWNED_INTEREST_GROUP_OWNER = "uicds@" + CORE1_NAME;
    static private final String JOIN_INTEREST_GROUP_ID = "1380";
    static private final String JOIN_INTEREST_GROUP_TYPE = "Incident";
    static private final String JOIN_INTEREST_GROUP_OWNER = "uicds@" + CORE2_NAME;
    static private final String PUBSUB_SERVICE = "pubsub.";
    static private final String PUBSUB_SERVICE1 = PUBSUB_SERVICE + CORE1_NAME;
    static private final String PUBSUB_SERVICE2 = PUBSUB_SERVICE + CORE2_NAME;

    static private final String INCIDENT_WP = "Incident";

    static private final String INCIDENT_WP_NODE_NAME = INCIDENT_WP + "WorkProductNode";

    private static final String INVALID_XML1 = "<info><id>IG-f6f20e4f-cf09-4ddb-be04-6579832cb476</id><type>Incident</type><name>I95 NB BETWEEN EXIT 69 (BELLS RD) & EXIT 73 (MAURY ST)</name><description>JUST PAST THE BELLS RD EXIT...GREEN VAN ON SIDE OF THE HIGHWAY ON FIRE...NOTIFYING STATE NOW....</description><owningCore>uicds@clash.saic.com</owningCore></info>";

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {

        // Establish core1 as the connection for "this" core
        coreConnection = new DataDrivenCoreConnection();
        coreConnection.setInterestGroupRoot(INTEREST_GROUP_ROOT);
        coreConnection.setPubSubSvc(PUBSUB_SERVICE1);

        interestManager = createMock(InterestManager.class);
        interestManager.setCoreConnection(coreConnection);
        interestManager.addIQListener(isA(InterestGrpGMgmtIQListener.class),
            isA(IQNamespacePacketFilter.class));
        interestManager.addMessageListener(isA(PacketListener.class), isA(PacketFilter.class));
        interestManager.updateSubscriptionMap(coreConnection.getPubSubSvc());
        expect(
            interestManager.addCollection(coreConnection.getPubSubSvc(),
                coreConnection.getInterestGroupRoot())).andReturn(true);

        interestGroupManager = new InterestGroupManager();
        interestGroupManager.setInterestManager(interestManager);
        interestGroupManager.setCoreConnection(coreConnection);

        replay(interestManager);
        interestGroupManager.initialize();
        reset(interestManager);
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testConstruction() {

        assertNotNull(interestGroupManager);
    }

    @Test
    public void testInitializeFailDiscoverNodes() {

        interestManager.addIQListener(isA(InterestGrpGMgmtIQListener.class),
            isA(IQNamespacePacketFilter.class));
        interestManager.addMessageListener(isA(PacketListener.class), isA(PacketFilter.class));
        interestManager.updateSubscriptionMap(coreConnection.getPubSubSvc());
        expect(
            interestManager.addCollection(coreConnection.getPubSubSvc(),
                coreConnection.getInterestGroupRoot())).andReturn(true);

        XMPPError error = new XMPPError(404, Type.CANCEL, "condition", "Remote Server not found",
            null);
        coreConnection.setDiscoverNodeItemsToError(error);

        replay(interestManager);

        interestGroupManager.initialize();

    }

    @Test
    public void testCreateGroup() {

        String id = createCreateInterestGroup();

        assertEquals("Wrong number of owned interest groups", 1,
            interestGroupManager.getOwnedInterestGroups().size());
        assertNotNull("No owned interest groups", interestGroupManager.getOwnedInterestGroup(id));
        assertNull("Have a joined core named core",
            interestGroupManager.getJoinedInterestGroup(id, "core"));
        assertEquals("Have some joined cores", 0,
            interestGroupManager.getJoinedInterestGroups().size());
    }

    @Test
    public void testJoinInterestsGroupOneWorkProductType() {

        createJoinedInterestGroup();
        assertEquals("Wrong number of joined cores", 1,
            interestGroupManager.getJoinedInterestGroups().size());
        verify(interestManager);

        deleteJoinedInterestGroup();
        assertEquals("Joined core was not removed", 0,
            interestGroupManager.getJoinedInterestGroups().size());
    }

    @Test
    public void testRestoreJoinedInterestGroup() {

        String ownerPropString = null;
        ArrayList<String> workProducts = new ArrayList<String>();
        workProducts.add(INCIDENT_WP);
        InterestGroup joiningInterestGroup = createJoiningInterestGroup(workProducts);

        ArrayList<String> messages = new ArrayList<String>();
        messages.add("message");
        try {
            expect(
                interestManager.subscribeToNode(PUBSUB_SERVICE2, INCIDENT_WP + "_"
                    + JOIN_INTEREST_GROUP_ID)).andReturn(messages);
        } catch (XMPPException e) {
            fail("subscribeToNode");
        }

        interestManager.addNodeManager(isA(String.class));

        replay(interestManager);
        interestGroupManager.restoreJoinedInterestGroup(joiningInterestGroup, ownerPropString);
        assertEquals("Wrong number of joined cores", 1,
            interestGroupManager.getJoinedInterestGroups().size());
        verify(interestManager);
    }

    @Test
    public void testErrorSubscribing() {

        IQ iq = PubSubIQFactory.subscribeNode(PUBSUB_SERVICE1, coreConnection.getJIDPlusResource(),
            INCIDENT_WP_NODE_NAME, null);

        XMPPError error = new XMPPError(CoreConnectionImpl.BAD_FORMAT_CODE, XMPPError.Type.MODIFY,
            CoreConnectionImpl.BAD_FORMAT_CONDITION, CoreConnectionImpl.NOT_WELLFORMED_MSG, null);
        IQ errorIQ = ArbitraryIQ.createResultError(iq, error);

        System.out.println(errorIQ);
    }

    // Also tests that the XMPP Packets are well-formed. If they are not then this test should fail
    // when the exception is thrown.
    @Test
    public void testResignFromInterestGroup() {

        createJoinedInterestGroup();
        reset(interestManager);
        interestManager.unsubscribeAllForInterestGroup(PUBSUB_SERVICE2, JOIN_INTEREST_GROUP_ID);
        replay(interestManager);
        interestGroupManager.resignFromInterestGroup(JOIN_INTEREST_GROUP_ID, PUBSUB_SERVICE2, "1",
            INVALID_XML1);
    }

    private void createJoinedInterestGroup() {

        assertEquals("Have some joined cores", 0,
            interestGroupManager.getJoinedInterestGroups().size());
        ArrayList<String> workProducts = new ArrayList<String>();
        workProducts.add(INCIDENT_WP);
        InterestGroup joiningInterestGroup = createJoiningInterestGroup(workProducts);

        MessageChannel joinedCh = createMock(MessageChannel.class);
        expect(joinedCh.send(isA(Message.class))).andReturn(true);
        interestGroupManager.setJoinedInterestGroupNotificationChannel(joinedCh);

        ArrayList<String> messages = new ArrayList<String>();
        messages.add("message");
        try {
            expect(
                interestManager.subscribeToNode(PUBSUB_SERVICE2, INCIDENT_WP + "_"
                    + JOIN_INTEREST_GROUP_ID)).andReturn(messages);
        } catch (XMPPException e) {
            fail("exception during interestManager.subscribeToNode: " + e.getMessage());
        }

        interestManager.addNodeManager(PUBSUB_SERVICE2);
        replay(joinedCh, interestManager);
        try {
            interestGroupManager.joinInterestGroup(joiningInterestGroup, "", "");
        } catch (XMPPException e) {
            fail("exception during joinInterestGroup: " + e.getMessage());
        }
    }

    private void deleteJoinedInterestGroup() {

        MessageChannel deleteCh = createMock(MessageChannel.class);
        expect(deleteCh.send(isA(Message.class))).andReturn(true);
        interestGroupManager.setDeleteJoinedInterestGroupNotificationChannel(deleteCh);

        replay(deleteCh);

        interestGroupManager.deleteJoinedInterestGroup(JOIN_INTEREST_GROUP_ID);

        verify(deleteCh);
    }

    private InterestGroup createJoiningInterestGroup(ArrayList<String> workProducts) {

        InterestGroup interestGroup = new InterestGroup();
        interestGroup.interestGroupID = JOIN_INTEREST_GROUP_ID;
        interestGroup.interestGroupType = JOIN_INTEREST_GROUP_TYPE;
        interestGroup.interestGroupOwner = JOIN_INTEREST_GROUP_OWNER;
        interestGroup.interestGroupPubsubService = XmppUtils.getPubsubServiceFromJID("pubsub",
            JOIN_INTEREST_GROUP_OWNER);
        interestGroup.workProductTypes = new ArrayList<String>();
        interestGroup.workProductTypes.addAll(workProducts);

        return interestGroup;
    }

    private String createCreateInterestGroup() {

        InterestGroup interestGroup = getInterestGroupForCreate();
        interestManager.addNodeManager(PUBSUB_SERVICE1);
        expect(
            interestManager.addFolder(eq(interestGroup.interestGroupPubsubService),
                isA(String.class), isA(String.class))).andReturn("value");
        interestManager.updateSubscriptionMap(interestGroup.interestGroupPubsubService);
        replay(interestManager);
        String id = interestGroupManager.createInterestGroup(interestGroup);
        reset(interestManager);
        return id;
    }

    private InterestGroup getInterestGroupForCreate() {

        InterestGroup interestGroup = new InterestGroup();
        interestGroup.interestGroupID = OWNED_INTEREST_GROUP_ID;
        interestGroup.interestGroupType = OWNED_INTEREST_GROUP_TYPE;
        interestGroup.interestGroupOwner = OWNED_INTEREST_GROUP_OWNER;
        interestGroup.interestGroupPubsubService = XmppUtils.getPubsubServiceFromJID("pubsub",
            OWNED_INTEREST_GROUP_OWNER);
        interestGroup.workProductTypes = new ArrayList<String>();
        return interestGroup;
    }
}
