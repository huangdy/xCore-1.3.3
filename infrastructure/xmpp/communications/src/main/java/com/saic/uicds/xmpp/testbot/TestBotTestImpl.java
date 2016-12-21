/**
 * 
 */
package com.saic.uicds.xmpp.testbot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Appender;
import org.apache.log4j.Logger;
import org.jivesoftware.smack.filter.PacketTypeFilter;
import org.jivesoftware.smack.packet.DefaultPacketExtension;
import org.jivesoftware.smack.packet.Packet;
import org.jivesoftware.smack.packet.PacketExtension;
import org.springframework.integration.core.Message;
import org.springframework.integration.core.MessageChannel;
import org.springframework.integration.message.GenericMessage;

import com.saic.uicds.core.infrastructure.messages.AgreementRosterMessage;
import com.saic.uicds.core.infrastructure.messages.NewInterestGroupCreatedMessage;
import com.saic.uicds.core.infrastructure.messages.ProductPublicationMessage;
import com.saic.uicds.core.infrastructure.messages.ShareInterestGroupMessage;
import com.saic.uicds.xmpp.communications.XmppConnection;

/**
 * Processes incoming test command messages which are dispatched to Spring
 * Message channels based on the namespace of the packet extension. The Smack
 * DefautlPacketExtension packet extension is used to parse the message bodies.
 * 
 * Future: Look into using XMPP Adhoc commands instead of the
 * DefaultPacketExtension. This would require more code to encode all parameters
 * into a DataForm.
 * 
 * Example command to send to the testbot <message id="6"
 * to="testbot@clash.saic.com" > <testbot-command xmlns="http://uicds.us">
 * <command>share</command> <core>danzig.saic.com</core> </testbot-command>
 * </message>
 * 
 * @author roger
 * 
 */
public class TestBotTestImpl implements TestBotTest {

	private Logger log = Logger.getLogger(this.getClass());

	private XmppConnection connection;

	private TestBotMessageListener messageListener;
	
	private boolean running = true;

	private MessageChannel newInterestGroupCreatedChannel;
	private MessageChannel systemInitializedChannel;
	private MessageChannel productPublicationChannel;
	private MessageChannel agreementRosterChannel;
	private MessageChannel shareInterestGroupChannel;

    // XML tags used in formatting out-bound data
    private static final String interestGroupIDOpenTag = "<id>";
    private static final String interestGroupTypeOpenTag = "<type>";
    private static final String nameOpenTag = "<name>";
    private static final String descriptionOpenTag = "<description>";
    private static final String owningCoreOpenTag = "<owningCore>";
    private static final String detailedInfoOpenTag = "<detailedInfo>";

    private static final String interestGroupIDCloseTag = "</id>";
    private static final String interestGroupTypeCloseTag = "</type>";
    private static final String nameCloseTag = "</name>";
    private static final String descriptionCloseTag = "</description>";
    private static final String owningCoreCloseTag = "</owningCore>";
    private static final String detailedInfoCloseTag = "</detailedInfo>";

    public XmppConnection getConnection() {
		return connection;
	}

	public void setConnection(XmppConnection connection) {
		this.connection = connection;
	}

	public MessageChannel getNewInterestGroupCreatedChannel() {
		return newInterestGroupCreatedChannel;
	}

	public void setNewInterestGroupCreatedChannel(
			MessageChannel newInterestGroupCreatedChannel) {
		this.newInterestGroupCreatedChannel = newInterestGroupCreatedChannel;
	}

	public MessageChannel getSystemInitializedChannel() {
		return systemInitializedChannel;
	}

	public void setSystemInitializedChannel(
			MessageChannel systemInitializedChannel) {
		this.systemInitializedChannel = systemInitializedChannel;
	}

	public MessageChannel getProductPublicationChannel() {
		return productPublicationChannel;
	}

	public void setProductPublicationChannel(
			MessageChannel productPublicationChannel) {
		this.productPublicationChannel = productPublicationChannel;
	}

	public MessageChannel getAgreementRosterChannel() {
		return agreementRosterChannel;
	}

	public void setAgreementRosterChannel(MessageChannel agreementRosterChannel) {
		this.agreementRosterChannel = agreementRosterChannel;
	}

	public MessageChannel getShareInterestGroupChannel() {
		return shareInterestGroupChannel;
	}

	public void setShareInterestGroupChannel(
			MessageChannel shareInterestGroupChannel) {
		this.shareInterestGroupChannel = shareInterestGroupChannel;
	}

	public void initialize() {
		// Setup listener for XMPP messages
		messageListener = new TestBotMessageListener();
		PacketTypeFilter messageFilter = new PacketTypeFilter(
				org.jivesoftware.smack.packet.Message.class);
		connection.addPacketListener(messageListener, messageFilter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.saic.uicds.xmpp.apps.TestBotTestIface#run()
	 */
	public void run() {
		while (running) {
			try {
				Thread.sleep(1000);
				Set<Packet> packets = messageListener.getPackets();
				// printPackets(packets);
				processPackets(packets);
				messageListener.clearPackets();
			} catch (InterruptedException e) {
				log.error(e.getMessage());
			}
		}
	}

	private void processPackets(Set<Packet> packets) {
		for (Packet packet : packets) {
			Collection<PacketExtension> extensions = packet.getExtensions();
			for (PacketExtension extension : extensions) {
				if (extension.getElementName().equals("testbot-command")
						&& extension.getNamespace().startsWith(
								"http://uicds.us")) {
					processCommand(extension);
				}
			}
		}
	}

	private void processCommand(PacketExtension extension) {
		if (extension instanceof DefaultPacketExtension) {
			DefaultPacketExtension defaultExtension = (DefaultPacketExtension) extension;
			log.info("Processing: " + defaultExtension.getNamespace());
			if (defaultExtension.getNamespace().endsWith(
					"newInterestGroupCreated")) {
				if (!sendNewInterestGroup(defaultExtension)) {
					log.error("sending newInterestGroupCreated");
				}
			} else if (defaultExtension.getNamespace().endsWith(
					"systemInitialized")) {
				if (!sendSystemInitialized(defaultExtension)) {
					log.error("sending systemInitialize");
				}
			} else if (defaultExtension.getNamespace().endsWith(
					"productPublication")) {
				if (!sendProductPublicationChannel(defaultExtension)) {
					log.error("sending productPublication");
				}
			} else if (defaultExtension.getNamespace().endsWith(
					"agreementRoster")) {
				if (!sendAgreementRoster(defaultExtension)) {
					log.error("sending agreementRoster");
				}
			} else if (defaultExtension.getNamespace().endsWith(
					"shareInterestGroup")) {
				if (!sendShareInterestGroup(defaultExtension)) {
					log.error("sending shareInterestGroup");
				}
			} else if (defaultExtension.getNamespace().endsWith(
			        "shutdown")) {
				setShutdown(defaultExtension);
			}
		}
	}

	@SuppressWarnings("unused")
	private void printPackets(Set<Packet> packets) {
		for (Packet packet : packets) {
			log.debug(packet.getFrom() + ": " + packet.toXML());
			Collection<PacketExtension> exts = packet.getExtensions();
			for (PacketExtension ext : exts) {
				log.debug("Extension name: " + ext.getElementName());
				log.debug("Extension ns  : " + ext.getNamespace());
				if (ext instanceof DefaultPacketExtension) {
					printDefaultPacketExtension(ext);
				}
			}
		}
	}

	private void printDefaultPacketExtension(PacketExtension ext) {
		DefaultPacketExtension df = (DefaultPacketExtension) ext;
		log.debug("Name: " + ext.getElementName());
		log.debug("Namespace: " + ext.getNamespace());
		for (String name : df.getNames()) {
			log.debug("name: " + name + " value: " + df.getValue(name));
		}
	}
	
	/**
	 * Shuts down the testbot.  If cleanup is set true then
	 * all pubsub nodes owned by testbot are removed.
	 * 
	 * extension namespace : "http://uicds.us#shutdown"
	 * 
	 * <pre>
	 * cleanup : String ["true" or "false"]
	 * </pre>
	 * 
	 * Example command: <message id="6" to="testbot@clash.saic.com" >
	 * <testbot-command xmlns="http://uicds.us#shutdown">
	 * <cleanup>true</cleanup>
	 * </testbot-command> </message>
	 * 
	 * @param defaultExtension
	 * @return true if sucessful send
	 */
	private boolean setShutdown(DefaultPacketExtension defaultExtension) {
		boolean cleanup = Boolean.parseBoolean(defaultExtension.getValue("cleanup"));
		running = false;
		boolean success = false;
		if (cleanup) {
			Logger rootLogger = Logger.getRootLogger();
			Appender appender = rootLogger.getAppender(TestBotAppender.TESTBOT_XMPP_APPENDER);
			if (appender != null && appender instanceof TestBotAppender) {
				rootLogger.removeAppender(appender);
				((TestBotAppender)appender).getConnection().cleanupNodes();
				success = true;
			}
			else {
				log.error("Error finding TestBotAppender");
			}
		}
		return success;
	}

	/**
	 * extension namespace : "http://uicds.us#newInterestGroupCreated"
	 * 
	 * <pre>
	 * id      : String 
	 * type    : String 
	 * restore : String ["true" or "false"]
	 * owner   : String 
	 * cores   : String or String,String,...
	 * </pre>
	 * 
	 * Example command: <message id="6" to="testbot@clash.saic.com" >
	 * <testbot-command xmlns="http://uicds.us#newInterestGroupCreated">
	 * <id>IG-1234</id> <type>Interest</type>
	 * <owner>uicds@clash.saic.com</owner> <cores>danzig.saic.com</cores>
	 * </testbot-command> </message>
	 * 
	 * @param defaultExtension
	 * @return true if sucessful send
	 */
	private boolean sendNewInterestGroup(DefaultPacketExtension defaultExtension) {
		NewInterestGroupCreatedMessage request = new NewInterestGroupCreatedMessage();
		request.setInterestGroupID(defaultExtension.getValue("id"));
		request.setInterestGroupType(defaultExtension.getValue("type"));
		request.setOwningCore(defaultExtension.getValue("owner"));
//		HashSet<String> coreList = new HashSet<String>();
//		String[] cores = defaultExtension.getValue("cores").split(",");
//		if (cores.length > 0) {
//			for (String core : cores) {
//				if (!core.contains(",")) {
//					coreList.add(core);
//				}
//			}
//		}
		Set<String> coreList = new HashSet<String>(Arrays.asList(defaultExtension.getValue("cores").split(",")));
		request.setSharedCoreList(coreList);
		request.setRestored(Boolean.getBoolean(defaultExtension.getValue("restore")));
		request.setSharingStatus("true");
		Message<NewInterestGroupCreatedMessage> message = (Message<NewInterestGroupCreatedMessage>) new GenericMessage<NewInterestGroupCreatedMessage>(
				request);
		return newInterestGroupCreatedChannel.send(message);
	}

	/**
	 * extension namespace : "http://uicds.us#systemInitialized"
	 * 
	 * @param defaultExtension
	 * @return true if sucessful send
	 */
	private boolean sendSystemInitialized(
			DefaultPacketExtension defaultExtension) {
		Message<String> message = new GenericMessage<String>("");
		return systemInitializedChannel.send(message);
	}

	/**
	 * extension namespace : "http://uicds.us#productPublication"
	 * 
	 * <pre>
	 * igId      : String
	 * productId : String
	 * type      : String
	 * product   : String
	 * </pre>
	 * 
	 * @param defaultExtension
	 * @return true if sucessful send
	 */
	private boolean sendProductPublicationChannel(
			DefaultPacketExtension defaultExtension) {
		// printDefaultPacketExtension(defaultExtension);
		ProductPublicationMessage request = new ProductPublicationMessage(
				ProductPublicationMessage.PublicationType.Publish,
				defaultExtension.getValue("igId"), defaultExtension
						.getValue("productId"), defaultExtension
						.getValue("type"), defaultExtension.getValue("product"));
		Message<ProductPublicationMessage> message = (Message<ProductPublicationMessage>) new GenericMessage<ProductPublicationMessage>(
				request);
		return productPublicationChannel.send(message);
	}

	/**
	 * extension namespace : "http://uicds.us#agreementRoster"
	 * 
	 * <pre>
	 * core : String
	 * state : String in [CREATE, AMEND, RESCIND]
	 * </pre>
	 * 
	 * @param defaultExtension
	 * @return
	 */
	private boolean sendAgreementRoster(DefaultPacketExtension defaultExtension) {
		Map<String, AgreementRosterMessage.State> cores = new HashMap<String, AgreementRosterMessage.State>();

		AgreementRosterMessage.State state;
		if (defaultExtension.getValue("state").equals("AMEND")) {
			state = AgreementRosterMessage.State.AMEND;
		} else if (defaultExtension.getValue("state").equals("RESCIND")) {
			state = AgreementRosterMessage.State.RESCIND;
		} else {
			state = AgreementRosterMessage.State.CREATE;
		}

		cores.put(defaultExtension.getValue("core"), state);

		AgreementRosterMessage request = new AgreementRosterMessage(
				defaultExtension.getValue("core"), cores);

		Message<AgreementRosterMessage> message = new GenericMessage<AgreementRosterMessage>(
				request);

		return agreementRosterChannel.send(message);
	}

	/**
	 * extension namespace : "http://uicds.us#shareInterestGroup"
	 * 
	 * <pre>
	 * igId      : String
	 * igName    : String
	 * igType    : String
	 * igDesc    : String
	 * igOwner   : String
	 * igDetails : String
	 * core      : String
	 * products  : String or String,String, ....
	 * </pre>
	 * 
	 * @param defaultExtension
	 * @return
	 */
	private boolean sendShareInterestGroup(
			DefaultPacketExtension defaultExtension) {
		ShareInterestGroupMessage request = new ShareInterestGroupMessage();
		
		request.setInterestGroupID(defaultExtension.getValue("igId"));
		request.setRemoteCore(defaultExtension.getValue("core"));
		request.setInterestGroupInfo(getInterestGroupInfoString(defaultExtension));
		List<String> products = new ArrayList<String>(Arrays.asList(defaultExtension.getValue("products").split(",")));
		request.setWorkProductTypesToShare(products);
		
		Message<ShareInterestGroupMessage> message = new GenericMessage<ShareInterestGroupMessage>(
				request);

		return shareInterestGroupChannel.send(message);
	}
	
    private String getInterestGroupInfoString(DefaultPacketExtension defaultExtension) {
        StringBuffer sb = new StringBuffer();
        sb.append(interestGroupIDOpenTag + defaultExtension.getValue("igId")
                + interestGroupIDCloseTag);
        sb.append(interestGroupTypeOpenTag + defaultExtension.getValue("igType")
                + interestGroupTypeCloseTag);
        sb.append(nameOpenTag + defaultExtension.getValue("igName") + nameCloseTag);
        sb.append(descriptionOpenTag + defaultExtension.getValue("igDesc") + descriptionCloseTag);
        sb.append(owningCoreOpenTag + defaultExtension.getValue("igOwner") + owningCoreCloseTag);
        sb.append(detailedInfoOpenTag + defaultExtension.getValue("igDetails") + detailedInfoCloseTag);
        return sb.toString();
    }
}
