/**
 * 
 */
package com.saic.uicds.xmpp.communications;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.isA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import javax.xml.namespace.QName;

import junitx.util.PrivateAccessor;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Packet;
import org.jivesoftware.smack.packet.IQ.Type;
import org.jivesoftware.smackx.packet.DiscoverItems;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.saic.uicds.xmpp.communications.NodeManagerImpl.NodeSubscriptionInfo;
import com.saic.uicds.xmpp.communications.NodeManagerImpl.SubscriptionPacketFilter;
import com.saic.uicds.xmpp.extensions.util.ArbitraryIQ;
import com.saic.uicds.xmpp.extensions.util.PubSubIQ;
import com.saic.uicds.xmpp.utils.MockCommandWithReply;

/**
 * @author roger
 *
 */
public class NodeManagerTest {
	
	private DataDrivenCoreConnection coreConnection;
	private NodeManagerImpl nodeManager;
	
	private static final String PUBSUB_SERVICE_JID = "pubsub.host.com";
	private static final String OTHER_PUBSUB_SERVICE_JID = "pubsub.otherhost.com";
	private static final String CORE_JID = "francisco@denmark.lit";
	private static final String UUID_1 = "uuid1";
	private static final String NODE1_NAME = "Incident";
	private static final String SUBNODE1 = "subnode1";
	private static final String SUBNODE2 = "subnode2";
	private static final String ITEMID1 = "itemID1";
	private static final String TEST_NS = "urn:test";
	private static final String ITEM_CONTENT = "<workProduct xmlns=\"" + TEST_NS + "\"><alert>alert</alert></workProduct>";
	private static final String PUBSUB_NS = "http://jabber.org/protocol/pubsub";
	private static final String PUBSUB_ELEMENT = "pubsub";
	
	private static int packetID = 0;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
        coreConnection = new DataDrivenCoreConnection();
        coreConnection.setJID(CORE_JID);
        
        MockCommandWithReply commandWithReply = new MockCommandWithReply();
        commandWithReply.setSuccess(true);
        
        packetID = 1;
        IQ result = new ArbitraryIQ(packetID++);
        commandWithReply.setResult(result);

        coreConnection.addReply(commandWithReply);

        nodeManager = new NodeManagerImpl(coreConnection);
        nodeManager.setPubsubService(PUBSUB_SERVICE_JID);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#NodeManagerImpl()}.
	 */
	@Test
	public void testNodeManagerImpl() {	
		assertNotNull(nodeManager);
		
		// should be no subscriptions
		checkSubscriptionMapSize(0);
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#getPubsubService()}.
	 */
	@Test
	public void testGetPubsubService() {
		assertEquals("Wrong pubsub service",PUBSUB_SERVICE_JID,nodeManager.getPubsubService());
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#isInitialized()}.
	 */
	@Test
	public void testIsInitialized() {
		assertTrue("Not initialized",nodeManager.isInitialized());
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#updateSubscriptionMap()}.
	 */
	@Test
	public void testUpdateSubscriptionMap() {
		// Mock results of a current subscription
		ArbitraryIQ result = getRetrieveSubscriptionsResultWithOneSubscription(null);	
		MockCommandWithReply commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);
        
        nodeManager.updateSubscriptionMap();

		checkSubscriptionMapSize(1);
	}

	private ArbitraryIQ getRetrieveSubscriptionsResultWithOneSubscription(String from) {
		ArbitraryIQ result = new ArbitraryIQ(packetID++);
		result.setType(Type.RESULT);
		if (from != null) {
			result.setFrom(from);
		}
		else {
			result.setFrom(nodeManager.getPubsubService());
		}
		StringBuffer b = new StringBuffer();
		b.append("<pubsub xmlns=\"http://jabber.org/protocol/pubsub\">");
		b.append("<subscriptions>");
		b.append("<subscription node=\"");
		b.append(getNode1Name());
		b.append("\" jid=\"francisco@denmark.lit\" subid=\"1\" subscription=\"subscribed\"/>");
		b.append("</subscriptions>");
		b.append("</pubsub>");
        result.setChildElementXML(b.toString());
		return result;
	}

	private ArbitraryIQ getRetrieveItemResult() {
		PubSubIQ result = new PubSubIQ(packetID++);
		result.setType(Type.RESULT);
		result.addItem(ITEM_CONTENT);
//		StringBuffer b = new StringBuffer();
//		b.append("<pubsub xmlns=\"http://jabber.org/protocol/pubsub\">");
//		b.append("<items node=\"");
//		b.append(getNode1Name());
//		b.append("\">");
//		b.append("<item id=\"");
//		b.append(ITEMID1);
//		b.append("\">");
//		b.append(ITEM_CONTENT);
//		b.append("</item>");
//		b.append("</items>");
//		b.append("</pubsub>");
//        result.setChildElementXML(b.toString());
		return result;
	}

	private StringBuffer getNode1Name() {
		StringBuffer b = new StringBuffer();
		b.append(coreConnection.getInterestGroupRoot());
		b.append("/");
		b.append(UUID_1);
		b.append("/");
		b.append(NODE1_NAME);
		return b;
	}

	private ArbitraryIQ getRetrieveSubscriptionsResultWithNoSubscriptions() {
		ArbitraryIQ result = new ArbitraryIQ(packetID++);
		result.setType(Type.RESULT);
		StringBuffer b = new StringBuffer();
		b.append("<pubsub xmlns=\"http://jabber.org/protocol/pubsub\">");
		b.append("<subscriptions/>");
		b.append("</pubsub>");
        result.setChildElementXML(b.toString());
		return result;
	}

	private MockCommandWithReply getSuccessfulCommandWithReplyWithResult(
			ArbitraryIQ result) {
		MockCommandWithReply commandWithReply = new MockCommandWithReply();
		commandWithReply.setSuccess(true);
        commandWithReply.setResult(result);
		return commandWithReply;
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#unsubscribeAll()}.
	 */
	@Test
	public void testUnsubscribeAll() {
		// Mock results of a current subscription
		ArbitraryIQ result = getRetrieveSubscriptionsResultWithOneSubscription(null);	
		MockCommandWithReply commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);
        
        nodeManager.updateSubscriptionMap();

		checkSubscriptionMapSize(1);

		// Mock results with no subscriptions (twice because unsubscribeAll does an updateSubscriptionMap)
		result = getRetrieveSubscriptionsResultWithNoSubscriptions();
		commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);

        result.setPacketID(Integer.toString(packetID++));
		commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);
        
		nodeManager.unsubscribeAll();

		checkSubscriptionMapSize(0);
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#unsubscribeAll(java.lang.String)}.
	 */
	@Test
	public void testUnsubscribeAllString() {
		// Mock results of a current subscription
		ArbitraryIQ result = getRetrieveSubscriptionsResultWithOneSubscription(null);	
		MockCommandWithReply commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);
        
        nodeManager.updateSubscriptionMap();

		checkSubscriptionMapSize(1);

		// Mock results with no subscriptions (twice because unsubscribeAll does an updateSubscriptionMap)
		result = getRetrieveSubscriptionsResultWithNoSubscriptions();	
		commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);
        
        result.setPacketID(Integer.toString(packetID++));
		commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);
        
		nodeManager.unsubscribeAll(UUID_1);
		
		checkSubscriptionMapSize(0);
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#isSubscribedTo(java.lang.String)}.
	 */
	@Test
	public void testIsSubscribedTo() {
		// Mock results of a current subscription
		ArbitraryIQ result = getRetrieveSubscriptionsResultWithOneSubscription(null);	
		MockCommandWithReply commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);
        
        nodeManager.updateSubscriptionMap();

		checkSubscriptionMapSize(1);

		assertTrue("Not subscribed to node1",nodeManager.isSubscribedTo(getNode1Name().toString()));
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#subscribeToNode(java.lang.String, org.jivesoftware.smack.PacketListener)}.
	 */
	@Test
	public void testSubscribeToNode() {
		// Mock results for call to update subscriptions at start of subscribe to Node
		ArbitraryIQ result = getRetrieveSubscriptionsResultWithNoSubscriptions();	
		MockCommandWithReply commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);
        
        // Create mock XMPP subscription request with one subscription response
		result = getRetrieveSubscriptionsResultWithOneSubscription(null);	
		commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);
        
        PacketListener listener = createMock(PacketListener.class);
        listener.processPacket(isA(Packet.class));
        
		try {
			nodeManager.subscribeToNode(NODE1_NAME, listener);
		} catch (XMPPException e) {
			fail("exception from subscribe: " + e.getXMPPError().getMessage());
		}
		
		checkSubscriptionMapSize(1);
	}
	
	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#ppublishToNode(java.lang.String, java.lang.String)}.
	 */
	// TODO: create a correct result message
	@Test
	public void testPublishToNodesStringString() {
		ArbitraryIQ result = getRetrieveSubscriptionsResultWithNoSubscriptions();	
		MockCommandWithReply commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);

        String content = "here";
        assertTrue("publish failed",nodeManager.publishToNode(NODE1_NAME, "<s>"+content+"</s>"));
        Packet packet = coreConnection.getLastPacket();
        assertNotNull(packet);
        assertEquals("Wrong pubsub service",PUBSUB_SERVICE_JID,packet.getTo());
        if (packet instanceof ArbitraryIQ) {
        	ArbitraryIQ arb = (ArbitraryIQ)packet;
        	String pubsubCommand = "publish";
        	String contentElementName = "s";
        	checkPacket(content, arb, pubsubCommand, contentElementName, null);
        }
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#removeItem(java.lang.String, java.lang.String)}.
	 */
	// TODO: create a correct result message
	@Test
	public void testRemoveItemStringString() {
		ArbitraryIQ result = getRetrieveSubscriptionsResultWithNoSubscriptions();	
		MockCommandWithReply commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);

		String itemUUID = "9";
		assertTrue("remove item failed",nodeManager.removeItem(NODE1_NAME, itemUUID));
        Packet packet = coreConnection.getLastPacket();
        assertNotNull(packet);
        assertEquals("Wrong pubsub service",PUBSUB_SERVICE_JID,packet.getTo());
        if (packet instanceof ArbitraryIQ) {
        	ArbitraryIQ arb = (ArbitraryIQ)packet;
        	String pubsubCommand = "retract";
        	String contentElementName = "item";
        	checkPacket("", arb, pubsubCommand, contentElementName, itemUUID);
        }
	}


	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#getChildrenNodes(java.lang.String)}.
	 */
	@Test
	public void testGetChildrenNodes() {
		HashSet<String> subnodes = new HashSet<String>();
		subnodes.add(SUBNODE1);
		subnodes.add(SUBNODE2);
		coreConnection.addNodesForDiscoverNodeItems(NODE1_NAME, subnodes);
		
		DiscoverItems items = nodeManager.getChildrenNodes(NODE1_NAME);
		Iterator<DiscoverItems.Item> iterator = items.getItems();
		assertTrue("no children nodes",iterator.hasNext());
		int count = 0;
		while (iterator.hasNext()) {
			count++;
			iterator.next();
		}
		assertEquals("wrong number of children nodes",2,count);
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#retrieveNodeItem(java.lang.String, java.lang.String)}.
	 */
	@Test (expected=IllegalArgumentException.class)
	public void testRetrieveNodeItemWithoutSubscription() {
		nodeManager.retrieveNodeItem(NODE1_NAME, ITEMID1);
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#retrieveNodeItem(java.lang.String, java.lang.String)}.
	 */
	@Test (expected=IllegalStateException.class)
	public void testRetrieveNodeItemWithNullNode() {
		nodeManager.retrieveNodeItem(null, ITEMID1);
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#retrieveNodeItem(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testRetrieveNodeItemWithSubscription() {
		// Mock results of a current subscription
		ArbitraryIQ result = getRetrieveSubscriptionsResultWithOneSubscription(null);	
		MockCommandWithReply commandWithReply = getSuccessfulCommandWithReplyWithResult(result);
        coreConnection.addReply(commandWithReply);
        
        nodeManager.updateSubscriptionMap();
        
        // Mock results of retrieve item
        ArbitraryIQ retrieveResult = getRetrieveItemResult();
        MockCommandWithReply retrieveCommand = getSuccessfulCommandWithReplyWithResult(retrieveResult);
        coreConnection.addReply(retrieveCommand);
		
		String item = nodeManager.retrieveNodeItem(getNode1Name().toString(), ITEMID1);
		assertNotNull("items is null",item);
		assertEquals("item content is wrong",ITEM_CONTENT,item);
	}

	// TODO: Implement the rest of the tests for the NodeManagerImpl
	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#getAllNodeItems(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testGetAllNodeItems() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#addNode(java.lang.String, java.lang.String, com.saic.uicds.xmpp.communications.NodeManagerImpl.NODE_ITEM_TYPE, java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testAddNode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#removeNode(java.lang.String, java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testRemoveNodeStringString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#removeNode(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testRemoveNodeString() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#addFolder(java.lang.String, java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testAddFolder() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.saic.uicds.xmpp.communications.NodeManagerImpl#addCollection(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testAddCollection() {
		fail("Not yet implemented");
	}

//	private void checkRetrievedItemWithOneItemExpected(String item) {
//		XmlObject xmlItem;
//		System.out.println(item);
//		try {
//			xmlItem = XmlObject.Factory.parse(item);
//			assertNotNull("xmlitem is null",xmlItem);
//			System.out.println(xmlItem);
//			XmlObject[] nss = xmlItem.selectChildren(PUBSUB_NS, PUBSUB_ELEMENT);
//			assertNotNull("no pubsub elements found",nss);
//			assertEquals("wrong number of pubsub elements found",1,nss.length);
//			
//			XmlObject[] itemsElements = nss[0].selectChildren(PUBSUB_NS, "items");
//			assertNotNull("no items element found",itemsElements);
//			assertEquals("wrong number of items elements found",1,itemsElements.length);
//			
//			XmlObject[] itemElements = itemsElements[0].selectChildren(PUBSUB_NS, "item");
//			assertNotNull("no item element found",itemElements);
//			assertEquals("wrong number of item elements found",1,itemElements.length);
//			
//			XmlObject[] contents = itemElements[0].selectChildren(TEST_NS, "workProduct");
//			assertNotNull("no workProduct element found",contents);
//			assertEquals("wrong number of workProduct elements found",1,contents.length);
//			
//			XmlOptions xo = new XmlOptions();
//			xo.setSaveOuter();
//			assertEquals("workproduct is wrong",ITEM_CONTENT,contents[0].xmlText(xo));
//			
//		} catch (XmlException e) {
//			fail("unable to parse retrieved item");
//		}
//	}

	private void checkPacket(String content, ArbitraryIQ arb,
			String pubsubCommand, String contentElementName,
			String contentElementID) {
		try {
			XmlObject obj = XmlObject.Factory.parse(arb.getChildElementXML());
//			System.out.println(obj);
			XmlCursor xc = obj.newCursor();
			xc.toNextToken();
			assertTrue("No START token",xc.isStart());
			QName element = xc.getName();
			assertEquals("Wrong starting element","pubsub",element.getLocalPart());
			assertEquals("Wrong starting element namespace","http://jabber.org/protocol/pubsub",element.getNamespaceURI());
			xc.toChild(0);
			element = xc.getName();
			assertEquals("Missing publish element",pubsubCommand,element.getLocalPart());
			xc.toChild(0);
//			System.out.println(xc.xmlText());
			element = xc.getName();
			assertEquals("Wrong content top level element name",contentElementName,element.getLocalPart());
			assertEquals("Wrong content",content,xc.getTextValue());
			if (contentElementID != null) {
				assertEquals("content id not found",xc.getAttributeText(new QName("","id")),contentElementID);
			}
//			System.out.println(xc.currentTokenType().toString());
//			System.out.println(xc.xmlText());
			xc.dispose();
		} catch (XmlException e) {
			fail(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	private void checkSubscriptionMapSize(int size) {
		try {
			HashMap<String, NodeSubscriptionInfo> subscriptions = 
				(HashMap<String, NodeSubscriptionInfo>)
				PrivateAccessor.getField(nodeManager, "subscriptions");	
//			for (String key : subscriptions.keySet()) {
//				System.out.println(key);
//			}
			assertEquals("Subscription map not empty",size,subscriptions.size());
		} catch (NoSuchFieldException e) {
			fail("subscription field not found");
		}
	}
}
