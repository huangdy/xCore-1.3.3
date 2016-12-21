/**
 * 
 */
package com.saic.uicds.xmpp.testbot;

import org.apache.log4j.Logger;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.PacketCollector;
import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.filter.PacketFilter;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Packet;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smackx.FormField;
import org.jivesoftware.smackx.ServiceDiscoveryManager;
import org.jivesoftware.smackx.packet.DataForm;
import org.jivesoftware.smackx.packet.DiscoverInfo;
import org.jivesoftware.smackx.packet.DiscoverItems;

import com.saic.uicds.xmpp.communications.CommandWithReply;
import com.saic.uicds.xmpp.communications.CommandWithReplyImpl;
import com.saic.uicds.xmpp.extensions.pubsub.PubSubConstants;
import com.saic.uicds.xmpp.extensions.pubsub.PubSubIQFactory;

/**
 * @author roger
 * 
 */
public class TestBotConnectionImpl
    implements TestBotConnection {

    private Logger logger = Logger.getLogger(this.getClass());

    private XMPPConnection xmppConnection;

    private String username;
    private String password;
    private String resource;
    private String server;
    private String pubSubSvc;
    private int port;
    private boolean debug;

    private int packetID = 0;

    static final String NODE_NAME = "testbot-responses";

    private ConnectionConfiguration config;

    private ServiceDiscoveryManager discoManager;

    public XMPPConnection getXmppConnection() {

        return xmppConnection;
    }

    public void setXmppConnection(XMPPConnection xmppConnection) {

        this.xmppConnection = xmppConnection;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getResource() {

        return resource;
    }

    public void setResource(String resource) {

        this.resource = resource;
    }

    public boolean isDebug() {

        return debug;
    }

    public void setDebug(boolean debug) {

        this.debug = debug;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.apps.TestBotConnectionIface#initialize()
     */
    public void initialize() {

        connect();
        if (!createResponseNode()) {
            logger.error("creating response node");
        }

        // Obtain the ServiceDiscoveryManager associated with my XMPPConnection
        discoManager = ServiceDiscoveryManager.getInstanceFor(xmppConnection);
    }

    public String getServer() {

        return server;
    }

    public void setServer(String server) {

        this.server = server;
    }

    @Override
    public String getPubSubSvc() {

        return pubSubSvc;
    }

    @Override
    public void setPubSubSvc(String pubSubSvc) {

        this.pubSubSvc = pubSubSvc;
    }

    public int getPort() {

        return port;
    }

    public void setPort(int port) {

        this.port = port;
    }

    @Override
    public void connect() {

        XMPPConnection.DEBUG_ENABLED = this.isDebug();

        config = new ConnectionConfiguration(this.getServer(), this.getPort());

        // If xmppConnection is not created yet then create one. This may have been
        // configured via Spring or during testing setup.
        xmppConnection = new XMPPConnection(config);

        try {
            xmppConnection.connect();

            logger.info("===> login as userName=" + this.getUsername() + " passwd=" +
                this.getPassword() + " resource=" + this.getResource());
            xmppConnection.login(this.getUsername(), this.getPassword(), this.getResource());

        } catch (XMPPException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    @Override
    public void cleanupNodes() {
    	IQ iq = PubSubIQFactory.deleteNode(pubSubSvc, NODE_NAME);
        CommandWithReply command = createCommandWithReply(iq);
        if (command.waitForSuccessOrFailure()) {

        } else {
        	logger.error("Error deleting node " + NODE_NAME);
        	logger.error("  message: " + command.getErrorMessage());
        	logger.error("     code: " + command.getErrorCode());
        	logger.error("     type: " + command.getErrorType());
        	logger.error("condition: " + command.getErrorCondition());
        }

    }

    private boolean createResponseNode() {

        boolean created = false;

        DataForm dataForm = new DataForm("submit");
        FormField formTypeField = new FormField("FORM_TYPE");
        formTypeField.setType("hidden");
        formTypeField.addValue("http://jabber.org/protocol/pubsub#node_config");
        dataForm.addField(formTypeField);

        FormField persistItemsField = new FormField("pubsub#persist_items");
        persistItemsField.addValue("1");
        dataForm.addField(persistItemsField);

        FormField sendItemsOnSubField = new FormField("pubsub#send_item_subscribe");
        sendItemsOnSubField.addValue("0");
        dataForm.addField(sendItemsOnSubField);

        FormField maxItemsField = new FormField("pubsub#max_items");
        maxItemsField.addValue(Short.toString(Short.MAX_VALUE));
        dataForm.addField(maxItemsField);

        // Add leaf node
        IQ iq = PubSubIQFactory.createNode(pubSubSvc, NODE_NAME, PubSubConstants.LEAF_NODE,
            dataForm);

        // logger.info("addNode: requestIQ[\n\n****\n" + iq.toXML() + "\n]****\n");

        CommandWithReply command = createCommandWithReply(iq);
        if (command.waitForSuccessOrFailure()) {
            // logger.info("Creating node " + topic);
            // logger.info("replyIQ:" + gisdataCmd.result.toXML());
            created = true;

        } else {
            if ((command.getErrorCode() == 409)) {
                logger.debug("response node exists");
                if (purgeAllItems()) {
                    logger.info("response node purged");
                } else {
                    logger.error("reponse node could not be purged");
                }
                created = true;
            } else {
                logger.error("Error creating node " + NODE_NAME);
                logger.error("  message: " + command.getErrorMessage());
                logger.error("     code: " + command.getErrorCode());
                logger.error("     type: " + command.getErrorType());
                logger.error("condition: " + command.getErrorCondition());
            }
        }

        return created;
    }

    private boolean purgeAllItems() {

        boolean purged = false;
        IQ iq = PubSubIQFactory.purgeItems(pubSubSvc, NODE_NAME);
        CommandWithReply command = createCommandWithReply(iq);
        if (command.waitForSuccessOrFailure()) {
            purged = true;

        } else {
            if ((command.getErrorCode() == 409)) {
                logger.debug("response node exists");
                purgeAllItems();
                purged = true;
            } else {
                logger.error("Error creating node " + NODE_NAME);
                logger.error("  message: " + command.getErrorMessage());
                logger.error("     code: " + command.getErrorCode());
                logger.error("     type: " + command.getErrorType());
                logger.error("condition: " + command.getErrorCondition());
            }
        }
        return purged;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.apps.TestBotConnectionIface#isConnected()
     */
    @Override
    public boolean isConnected() {

        return xmppConnection.isConnected();
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.apps.TestBotConnection#addPacketListener(org.jivesoftware.smack.
     * PacketListener, org.jivesoftware.smack.filter.PacketFilter)
     */
    @Override
    public void addPacketListener(PacketListener packetListener, PacketFilter packetFilter) {

        xmppConnection.addPacketListener(packetListener, packetFilter);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.apps.TestBotConnection#removePacketListener(org.jivesoftware.smack.
     * PacketListener)
     */
    @Override
    public void removePacketListener(PacketListener packetListener) {

        xmppConnection.removePacketListener(packetListener);
    }

    @Override
    public void addRosterEntry(String coreJID, String name) {

        logger.error("Roster not supported");
    }

    @Override
    public CommandWithReply createCommandWithReply(Packet packet) {

        return new CommandWithReplyImpl(this, packet);
    }

    @Override
    public PacketCollector createPacketCollector(PacketFilter packetFilter) {

        return xmppConnection.createPacketCollector(packetFilter);
    }

    @Override
    public void deleteRosterEntry(String coreJID) {

        logger.error("Roster not supported");
    }

    @Override
    public void disconnect() {

        xmppConnection.disconnect();
    }

    @Override
    public String getJID() {

        return xmppConnection.getConnectionID();
    }

    @Override
    public void sendPacket(Packet packet) {

        xmppConnection.sendPacket(packet);
    }

    @Override
    public boolean publishTestBotResponse(String xmlText) {

        // Create an item element with the xmlText
        String xmlItem = PubSubIQFactory.createItemXML(xmlText, Integer.toString(packetID++));

        // Create the publish stanza
        IQ iq = PubSubIQFactory.publishItem(getPubSubSvc(), NODE_NAME, xmlItem);

        CommandWithReply command = createCommandWithReply(iq);
        boolean success = command.waitForSuccessOrFailure();
        if (!success) {
            System.err.println(iq.toXML());
            System.err.println("  message: " + command.getErrorMessage());
            // Don't use logger because one of the appenders calls this method
            // and it will cause an infinite loop
            // logger.error("  message: " + command.getErrorMessage());
            // logger.error("     code: " + command.getErrorCode());
            // logger.error("     type: " + command.getErrorType());
            // logger.error("condition: " + command.getErrorCondition());
            // if (command.getErrorType() == XMPPError.Type.AUTH) {
            // logger.error("   Not authorized for this action.");
            // }
        }
        return success;
    }

    @Override
    public DiscoverInfo discoverNodeInfo(String node) {

        if (discoManager != null) {
            try {
                return discoManager.discoverInfo(pubSubSvc, node);
            } catch (XMPPException e) {
                XMPPError err = e.getXMPPError();
                if (err.getCode() == 404) {
                    if (!isConnected()) {
                        logger.error("XMPP Server not found (not connected)");
                    }
                } else {
                    logger.error("discovering items for \"\"");
                    logger.error("  message: " + err.getMessage());
                    logger.error("     code: " + err.getCode());
                    logger.error("     type: " + err.getType());

                }
            }
        }
        return null;
    }

    @Override
    public DiscoverItems discoverNodeItems(String node) {

        if (discoManager != null) {
            try {
                return discoManager.discoverItems(pubSubSvc, node);
            } catch (XMPPException e) {
                XMPPError err = e.getXMPPError();
                if (err.getCode() == 404) {
                    if (!isConnected()) {
                        logger.error("XMPP Server not found (not connected)");
                    }
                } else {
                    logger.error("discovering items for \"\"");
                    logger.error("  message: " + err.getMessage());
                    logger.error("     code: " + err.getCode());
                    logger.error("     type: " + err.getType());

                }
            }
        }
        return null;
    }

    @Override
    public int getWaitTimeInSeconds() {

        return 5;
    }
}
