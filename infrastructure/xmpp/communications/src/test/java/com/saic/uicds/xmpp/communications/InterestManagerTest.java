/**
 * 
 */
package com.saic.uicds.xmpp.communications;


import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.reset;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.integration.core.MessageChannel;

/**
 * @author roger
 *
 */
public class InterestManagerTest {
	
	private static final String PRODUCT_STATUS = "ACTIVE";

	private static final String PRODUCT_TYPE = "Incident";

	private static final String PRODUCT_ID1 = "Incident-1";

	private static final String IG_ID = "IG-1";

	private static final String UICDS_COREID = "uicds@core";

	private InterestManagerImpl interestManager;
	
	private NodeManager nodeManager;
	private DataDrivenCoreConnection coreConnection;
	private MessageChannel owningChannel;

	static private final String INTEREST_GROUP_ROOT = "incidents";
	static private final String PUBSUB_SERVICE_JID = "pubsub.host.com";
	
	private static final String NODE1_NAME = PRODUCT_TYPE;
	
	private static final String ITEM_TEXT1 = "<stuff>this</stuff>";
	private static final String ITEM_ID1 = "9";
	
	private static final String INVALID_XML1 = "<info><id>IG-f6f20e4f-cf09-4ddb-be04-6579832cb476</id><type>Incident</type><name>I95 NB BETWEEN EXIT 69 (BELLS RD) & EXIT 73 (MAURY ST)</name><description>JUST PAST THE BELLS RD EXIT...GREEN VAN ON SIDE OF THE HIGHWAY ON FIRE...NOTIFYING STATE NOW....</description><owningCore>uicds@clash.saic.com</owningCore></info>";

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		interestManager = new InterestManagerImpl();
        
        nodeManager = createMock(NodeManager.class);
        nodeManager.updateSubscriptionMap();
        expect(nodeManager.getPubsubService()).andReturn(PUBSUB_SERVICE_JID);
        
        coreConnection = new DataDrivenCoreConnection();
        coreConnection.setInterestGroupRoot(INTEREST_GROUP_ROOT);
        coreConnection.setPubSubSvc(PUBSUB_SERVICE_JID);
        
        owningChannel = createMock(MessageChannel.class);
        
        replay(nodeManager);
        interestManager.setCoreConnection(coreConnection);
        interestManager.setNodeManager(nodeManager);
        interestManager.setOwningCoreWorkProductNotificationChannel(owningChannel);
        interestManager.initialize();
        
        reset(nodeManager);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testIsInitialized() {
		assertTrue("Not initialized",interestManager.isInitialized());
	}
	
	@Test
	public void testPublishToNode() {
		expect(nodeManager.publishToNode(NODE1_NAME, ITEM_TEXT1)).andReturn(true);
		
		replay(nodeManager);
		boolean result = interestManager.publishToNode(PUBSUB_SERVICE_JID, NODE1_NAME, ITEM_TEXT1);
		
		assertTrue("publish returned false",result);
		verify(nodeManager);
	}

	@Test
	public void testRemoveNode() {
		expect(nodeManager.removeNode(NODE1_NAME, ITEM_ID1)).andReturn(true);
		
		replay(nodeManager);
		boolean result = interestManager.removeNode(PUBSUB_SERVICE_JID, NODE1_NAME, ITEM_ID1);
		
		assertTrue("remove returned false",result);
		verify(nodeManager);
	}

	// Tests that the XMPP Packets are well-formed.  If they are not then this test should fail
	// when the exception is thrown.
	@Test
	public void testSendPackets() {
		List<String> workProductTypesToShare = new ArrayList<String>();
		workProductTypesToShare.add(PRODUCT_TYPE);
		InterestGroup interestGroup = new InterestGroup();
		interestManager.sendJoinMessage(UICDS_COREID, interestGroup, INVALID_XML1	, workProductTypesToShare);	
		interestManager.sendDeleteJoinedInterestGroupMessage(UICDS_COREID, IG_ID);
		interestManager.sendDeleteJoinedProductMessage(UICDS_COREID, PRODUCT_ID1);
		interestManager.sendJoinedPublishProductRequestMessage(IG_ID, UICDS_COREID, PRODUCT_ID1, PRODUCT_TYPE, "act", UICDS_COREID, INVALID_XML1);
		interestManager.sendProductPublicationStatusMessage(UICDS_COREID, UICDS_COREID, PRODUCT_STATUS);
		interestManager.sendResignMessage(UICDS_COREID, IG_ID);
		interestManager.sendResignRequestMessage(UICDS_COREID, IG_ID, UICDS_COREID);
		interestManager.sendUpdateJoinMessage(UICDS_COREID, IG_ID, PRODUCT_TYPE);
	}
}
