package com.saic.uicds.xmpp.communications;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Packet;
import org.jivesoftware.smack.packet.PacketExtension;
import org.jivesoftware.smackx.packet.XHTMLExtension;
import org.junit.Test;
import org.junit.internal.runners.OldTestClassRunner;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import com.saic.uicds.core.infrastructure.messages.AgreementRosterMessage;
import com.saic.uicds.core.infrastructure.messages.AgreementRosterMessage.State;
import com.saic.uicds.core.infrastructure.messages.Core2CoreMessage;
import com.saic.uicds.core.infrastructure.messages.NewInterestGroupCreatedMessage;
import com.saic.uicds.xmpp.extensions.notification.NotificationExtensionFactory;
import com.saic.uicds.xmpp.extensions.util.ArbitraryPacketExtension;

public class CommunicationsServiceXmppTest extends AbstractDependencyInjectionSpringContextTests {

    private static final String NOTIFICATION_BODY = "UICDS Work Product Notification";
	private static final String NOTIFICATION = "<WorkProduct xmlns=\"http://www.saic.com/precis/2009/06/structures\"></WorkProduct>";
	private static final String NOTIFICATION_XHTML = "<p><A HREF=\"https://uicds.core/123/\">UICDS Work Product</A></p>";
	private static final String UICDS_REMOTE_CORE_COM = "uicds@remote.core.com";
    private static final String MESSAGE_TO = "user@xmppserver.com";
    
    
	private CommunicationsServiceXmppImpl communicationsServiceXmppImpl;

    public void setCommunicationsServiceXmppImpl(
            CommunicationsServiceXmppImpl communicationsServiceXmppImpl) {
        this.communicationsServiceXmppImpl = communicationsServiceXmppImpl;
    }

    private XmppMessageReceiver xmppMessageReceiver;

    public void setXmppMessageReceiver(XmppMessageReceiver xmppMessageReceiver) {
        this.xmppMessageReceiver = xmppMessageReceiver;
    }

    private static String INTEREST_GROUP_ID = "UUID-01";
    private static String INTEREST_GROUP_TYPE = "Incident";
    
    @Override
    protected void onTearDown() throws Exception {
    }

    @Test
    public void init() {
        xmppMessageReceiver.clear();
        
    }


    @Test
    public void testCommunicationsServiceXmppImplCreation() {
        assertNotNull(communicationsServiceXmppImpl);
    }
    
    @Test
    public void testNewInterestGroupCreatedHandler() {
    	NewInterestGroupCreatedMessage message = new NewInterestGroupCreatedMessage();
    	
        message.setInterestGroupID(INTEREST_GROUP_ID);
        message.setInterestGroupType(INTEREST_GROUP_TYPE);
        message.setOwningCore(communicationsServiceXmppImpl.getInterestGroupManager().getCoreConnection().getJID());
        List<String> workproductTypesList = new ArrayList<String>();
        workproductTypesList.add(INTEREST_GROUP_TYPE);
        workproductTypesList.add("ICS");
		message.setJoinedWPTYpes(workproductTypesList);

		communicationsServiceXmppImpl.newInterestGroupCreatedHandler(message);
		
		Map<String, InterestGroup> list = communicationsServiceXmppImpl.getInterestGroupManager().getInterestGroupList();
		assertTrue("interest group not found",list.containsKey(INTEREST_GROUP_ID));

    	communicationsServiceXmppImpl.getInterestGroupManager().deleteInterestGroup(INTEREST_GROUP_ID);
    }


    /**
     * 
     */
    @Test
    public void testHandleXmppMessage() {
    	Core2CoreMessage message = new Core2CoreMessage();
    	message.setToCore(MESSAGE_TO);
    	message.setMessage(NOTIFICATION);
    	message.setMessageType("XMPP_MESSAGE");
    	message.setBody(NOTIFICATION_BODY);
    	message.setXhtml(NOTIFICATION_XHTML);
    	
    	CoreConnection liveConnection = communicationsServiceXmppImpl.getInterestGroupManager().getCoreConnection();
    	
    	DataDrivenCoreConnection dataDrivenCoreConnection = new DataDrivenCoreConnection();
		communicationsServiceXmppImpl.getInterestGroupManager().setCoreConnection(dataDrivenCoreConnection );
		
		communicationsServiceXmppImpl.core2CoreMessageHandler(message);
        
		assertNotNull("no packet sent",dataDrivenCoreConnection.getLastPacket());
		Packet packet = dataDrivenCoreConnection.getLastPacket();
		if (packet instanceof org.jivesoftware.smack.packet.Message) {
			org.jivesoftware.smack.packet.Message msg = (org.jivesoftware.smack.packet.Message)packet;
			assertEquals("wrong # bodies",1,msg.getBodies().size());
			assertEquals("wrong body",NOTIFICATION_BODY,msg.getBody());
			checkXHTMLExtensionContent(msg);
			checkNotificationExtensionContent(msg);
			
		}
		else {
			fail("packet is not message");
		}
		assertEquals("wrong to",MESSAGE_TO,packet.getTo());
		System.out.println("sent message: " + packet.toXML());
		PacketExtension ext = packet.getExtension(NotificationExtensionFactory.NAMESPACE);
		assertNotNull("missing extension",ext);
		
        communicationsServiceXmppImpl.getInterestGroupManager().setCoreConnection(liveConnection);
    }

	private void checkNotificationExtensionContent(Message msg) {
		PacketExtension ext1 = msg.getExtension(NotificationExtensionFactory.NAMESPACE);
		assertNotNull("no notify ext",ext1);
		assertTrue("not notify ext",ext1 instanceof ArbitraryPacketExtension);
		ArbitraryPacketExtension arbExt = (ArbitraryPacketExtension)ext1;
		try {
			XmlObject xml = XmlObject.Factory.parse(arbExt.toXML());
			XmlObject[] elements = xml.selectChildren(NotificationExtensionFactory.NAMESPACE, NotificationExtensionFactory.ELEMENT_NAME);
			assertEquals("no notify elements",1,elements.length);
			XmlCursor cursor = elements[0].newCursor();
			cursor.toFirstChild();
			System.out.println(cursor.getName());
			assertEquals("wrong namespace","http://www.saic.com/precis/2009/06/structures",cursor.getName().getNamespaceURI());
			assertEquals("wrong local name","WorkProduct",cursor.getName().getLocalPart());
			cursor.dispose();
		} catch (XmlException e) {
			fail("Can't parse notify ext");
		}
		
	}

	private void checkXHTMLExtensionContent(org.jivesoftware.smack.packet.Message msg) {
		XHTMLExtension xext = new XHTMLExtension();
		PacketExtension ext1 = msg.getExtension(xext.getNamespace());
		assertNotNull("no xhtml",ext1);
		assertTrue("not XHTML",ext1 instanceof XHTMLExtension);
		xext = (XHTMLExtension)ext1;
		assertEquals("no xhtml body",1,xext.getBodiesCount());
		assertEquals("wrong xhtml body",NOTIFICATION_XHTML,xext.getBodies().next());
	}
    
    @Test
    public void testHandleAddRoster() {
    	HashMap<String, State> cores = new HashMap<String, State>();
    	cores.put(UICDS_REMOTE_CORE_COM, AgreementRosterMessage.State.CREATE);
    	AgreementRosterMessage message = new AgreementRosterMessage(UICDS_REMOTE_CORE_COM,cores);
    	
    	CoreConnection liveConnection = communicationsServiceXmppImpl.getInterestGroupManager().getCoreConnection();
    	
    	DataDrivenCoreConnection dataDrivenCoreConnection = new DataDrivenCoreConnection();
    	dataDrivenCoreConnection.lastRosterCoreJIDAdded = "";
    	dataDrivenCoreConnection.lastRosterCoreNameAdded = "";
		communicationsServiceXmppImpl.getInterestGroupManager().setCoreConnection(dataDrivenCoreConnection );
		
		communicationsServiceXmppImpl.agreementRosterHandler(message);
        assertEquals("wrong JID added",UICDS_REMOTE_CORE_COM,dataDrivenCoreConnection.lastRosterCoreJIDAdded);
        
        communicationsServiceXmppImpl.getInterestGroupManager().setCoreConnection(liveConnection);
    }
    
    @Test
    public void testHandleDeleteRoster() {
    	HashMap<String, State> cores = new HashMap<String, State>();
    	cores.put(UICDS_REMOTE_CORE_COM, AgreementRosterMessage.State.RESCIND);
    	AgreementRosterMessage message = new AgreementRosterMessage(UICDS_REMOTE_CORE_COM,cores);
    	
    	CoreConnection liveConnection = communicationsServiceXmppImpl.getInterestGroupManager().getCoreConnection();
    	
    	DataDrivenCoreConnection dataDrivenCoreConnection = new DataDrivenCoreConnection();
    	dataDrivenCoreConnection.lastRosterCoreJIDRemoved = "";
		communicationsServiceXmppImpl.getInterestGroupManager().setCoreConnection(dataDrivenCoreConnection );
		
		communicationsServiceXmppImpl.agreementRosterHandler(message);
        assertEquals("wrong JID added",UICDS_REMOTE_CORE_COM,dataDrivenCoreConnection.lastRosterCoreJIDRemoved);
        
        communicationsServiceXmppImpl.getInterestGroupManager().setCoreConnection(liveConnection);
    }
    
    /* 
    * public void testShareBadInterestGroupHandler() { init();
    * 
    * boolean exceptionCaught = false;
    * 
    * // notify Communication Service XMPP of a new interestGroup String[] workProductIDs = new
    * String[0]; ShareInterestGroupMessage notification = new ShareInterestGroupMessage(incidentID + ".bad",
    * remoteCore, workProductIDs); try {
    * communicationsServiceXmppImpl.shareIncidentHandler(notification); } catch
    * (IllegalArgumentException exception) { exceptionCaught = true; }
    * 
    * assertTrue(exceptionCaught);
    * 
    * }
    * 
    * public void testShareIncidentWithUnknownCoreHandler() { init();
    * 
    * boolean exceptionCaught = false;
    * 
    * // notify Communication Service XMPP of a new incident String[] workProductIDs = new
    * String[0]; ShareIncidentMessage notification = new ShareIncidentMessage(incidentID,
    * remoteCore + ".Unknown", workProductIDs); try {
    * communicationsServiceXmppImpl.shareIncidentHandler(notification); } catch
    * (IllegalStateException exception) { exceptionCaught = true; }
    * 
    * assertTrue(exceptionCaught);
    * 
    * }
    */

    /*
    public void testShareIncidentHandler() {
        init();

        boolean exceptionCaught = false;

        // notify Communication Service XMPP of a new incident
        String[] workProductIDs = new String[0];
        ShareIncidentMessage notification = new ShareIncidentMessage(incidentID, remoteCore,
                workProductIDs);
        try {
            communicationsServiceXmppImpl.shareIncidentHandler(notification);
        } catch (IllegalStateException exception) {
            exceptionCaught = true;
        }

        // assertTrue(exceptionCaught);

    }
    */

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "classpath:contexts/test-applicationContext.xml" };
    }
}
