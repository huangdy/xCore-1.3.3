/**
 * 
 */
package com.saic.uicds.xmpp.communications;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.PacketCollector;
import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.filter.PacketFilter;
import org.jivesoftware.smack.packet.Packet;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smackx.packet.DiscoverInfo;
import org.jivesoftware.smackx.packet.DiscoverItems;

import com.saic.uicds.xmpp.communications.util.XmppUtils;
import com.saic.uicds.xmpp.extensions.util.ArbitraryIQ;

/**
 * @author roger
 * 
 */
public class DataDrivenCoreConnection
    implements CoreConnection {

    public static final String PUBSUBSVC = "pubsub";

    private String interestGroupRoot = "incidents";
    private String JID;

    CommandWithReply commandWithReply;
    HashMap<String, CommandWithReply> replyMap;
    private Packet packet;

    // Disco data key = node name, values = list of sub nodes
    HashMap<String, Set<String>> nodeMap;

    public String lastRosterCoreJIDAdded;
    public String lastRosterCoreNameAdded;
    public String lastRosterCoreJIDRemoved;

    private XMPPError xmppError;

    private boolean throwDiscoverError;

    /**
	 * 
	 */
    public DataDrivenCoreConnection() {

        ArbitraryIQ.usingIncrementalIDs = true;
        ArbitraryIQ.resetIncrementalID();
        replyMap = new HashMap<String, CommandWithReply>();
        nodeMap = new HashMap<String, Set<String>>();
    }

    // public CommandWithReply getCommandWithReply() {
    // return commandWithReply;
    // }
    //
    // public void setCommandWithReply(CommandWithReply commandWithReply) {
    // this.commandWithReply = commandWithReply;
    // }

    public void addReply(CommandWithReply reply) {

        // System.out.println("adding reply: "+reply.getResult().toXML());
        replyMap.put(reply.getResult().getPacketID(), reply);
    }

    public void clearReplies() {

        replyMap.clear();
    }

    public CommandWithReply getReply(String messageID) {

        return replyMap.get(messageID);
    }

    @Override
    public CommandWithReply createCommandWithReply(Packet packet) {

        // System.out.println("getting cmd: "+packet.toXML());
        this.packet = packet;
        return replyMap.get(packet.getPacketID());
    }

    public Packet getLastPacket() {

        return packet;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.saic.uicds.xmpp.communications.CoreConnection#addPacketListener(org.jivesoftware.smack
     * .PacketListener, org.jivesoftware.smack.filter.PacketFilter)
     */
    @Override
    public void addPacketListener(PacketListener listener, PacketFilter packetFilter) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#addRosterEntry(java.lang.String,
     * java.lang.String)
     */
    @Override
    public void addRosterEntry(String coreJID, String name) {

        lastRosterCoreJIDAdded = coreJID;
        lastRosterCoreNameAdded = name;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#configure()
     */
    @Override
    public void configure() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#connect()
     */
    @Override
    public void connect() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.saic.uicds.xmpp.communications.CoreConnection#createPacketCollector(org.jivesoftware.
     * smack.filter.PacketFilter)
     */
    @Override
    public PacketCollector createPacketCollector(PacketFilter packetFilter) {

        // DataDrivenPacketCollector c = new DataDrivenPacketCollector();
        // return c;
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#`Entry(java.lang.String)
     */
    @Override
    public void deleteRosterEntry(String coreJID) {

        lastRosterCoreJIDRemoved = coreJID;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#disconnect()
     */
    @Override
    public void disconnect() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getConfiguration()
     */
    @Override
    public ConnectionConfiguration getConfiguration() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getCoreNameFromJID(java.lang.String)
     */
    @Override
    public String getCoreNameFromJID(String coreJID) {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getDebug()
     */
    @Override
    public String getDebug() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getDebugBoolean()
     */
    @Override
    public boolean getDebugBoolean() {

        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getFileManager()
     */
    @Override
    public InterestGroupFileManager getFileManager() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getInterestGroupRoot()
     */
    @Override
    public String getInterestGroupRoot() {

        return interestGroupRoot;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getJID()
     */
    @Override
    public String getJID() {

        return JID;
    }

    public void setJID(String jid) {

        JID = jid;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getJIDFromCoreName(java.lang.String)
     */
    @Override
    public String getJIDFromCoreName(String coreName) {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getJIDPlusResource()
     */
    @Override
    public String getJIDPlusResource() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.saic.uicds.xmpp.communications.CoreConnection#getJIDPlusResourceFromCoreName(java.lang
     * .String)
     */
    @Override
    public String getJIDPlusResourceFromCoreName(String coreName) {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getName()
     */
    @Override
    public String getName() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getPassword()
     */
    @Override
    public String getPassword() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getPort()
     */
    @Override
    public String getPort() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getPortInt()
     */
    @Override
    public int getPortInt() {

        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getPubSubSvc()
     */
    @Override
    public String getPubSubSvc() {

        return XmppUtils.getPubsubServiceFromJID(PUBSUBSVC, JID);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getResource()
     */
    @Override
    public String getResource() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getRosterByName()
     */
    @Override
    public Map<String, String> getRosterByName() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getRosterStatus()
     */
    @Override
    public Map<String, String> getRosterStatus() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getServer()
     */
    @Override
    public String getServer() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getServername()
     */
    @Override
    public String getServername() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#getUsername()
     */
    @Override
    public String getUsername() {

        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#initialize()
     */
    @Override
    public void initialize() {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#isConnected()
     */
    @Override
    public boolean isConnected() {

        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#isCoreInRoster(java.lang.String)
     */
    @Override
    public boolean isCoreInRoster(String coreName) {

        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#isCoreOnline(java.lang.String)
     */
    @Override
    public boolean isCoreOnline(String coreName) {

        return false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.saic.uicds.xmpp.communications.CoreConnection#removePacketListener(org.jivesoftware.smack
     * .PacketListener)
     */
    @Override
    public void removePacketListener(PacketListener listener) {

    }

    @Override
    public void sendPacketCheckWellFormed(Packet packet) throws XMPPException {

        if (!XmppUtils.isWellFormed(packet.toXML())) {
            XMPPError error = new XMPPError(CoreConnectionImpl.BAD_FORMAT_CODE,
                XMPPError.Type.MODIFY, CoreConnectionImpl.BAD_FORMAT_CONDITION,
                CoreConnectionImpl.NOT_WELLFORMED_MSG, null);
            throw new XMPPException(error);
        }
        this.packet = packet;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.saic.uicds.xmpp.communications.CoreConnection#sendPacket(org.jivesoftware.smack.packet
     * .Packet)
     */
    @Override
    public void sendPacket(Packet packet) {

        if (!XmppUtils.isWellFormed(packet.toXML())) {
            XMPPError error = new XMPPError(CoreConnectionImpl.BAD_FORMAT_CODE,
                XMPPError.Type.MODIFY, CoreConnectionImpl.BAD_FORMAT_CONDITION,
                CoreConnectionImpl.NOT_WELLFORMED_MSG, null);
            throw new IllegalArgumentException(error.getMessage());
        }
        this.packet = packet;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#setDebug(java.lang.String)
     */
    @Override
    public void setDebug(String value) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#setInterestGroupRoot(java.lang.String)
     */
    @Override
    public void setInterestGroupRoot(String interestGroupRoot) {

        this.interestGroupRoot = interestGroupRoot;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#setName(java.lang.String)
     */
    @Override
    public void setName(String value) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#setPassword(java.lang.String)
     */
    @Override
    public void setPassword(String value) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#setPort(java.lang.String)
     */
    @Override
    public void setPort(String value) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#setPubSubSvc(java.lang.String)
     */
    @Override
    public void setPubSubSvc(String value) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#setResource(java.lang.String)
     */
    @Override
    public void setResource(String value) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#setServer(java.lang.String)
     */
    @Override
    public void setServer(String value) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#setServername(java.lang.String)
     */
    @Override
    public void setServername(String value) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.uicds.xmpp.communications.CoreConnection#setUsername(java.lang.String)
     */
    @Override
    public void setUsername(String value) {

    }

    @Override
    public DiscoverInfo discoverNodeInfo(String node) {

        DiscoverInfo items = new DiscoverInfo();

        return items;
    }

    public void addNodesForDiscoverNodeItems(String node, Set<String> subnodes) {

        nodeMap.put(node, subnodes);
    }

    public void clearNodesForDiscoverNodeItems() {

        nodeMap.clear();
    }

    public void setDiscoverNodeItemsToError(XMPPError error) {

        xmppError = error;
        throwDiscoverError = true;
    }

    public void resetDiscoverNodeItemsToError() {

        xmppError = null;
        throwDiscoverError = false;
    }

    @Override
    public DiscoverItems discoverNodeItems(String node) {

        DiscoverItems items = null;

        if (throwDiscoverError) {
            return items;
        }

        if (items == null) {
            items = new DiscoverItems();
        }

        items.setNode(node);
        if (nodeMap.containsKey(node)) {
            for (String subnode : nodeMap.get(node)) {
                DiscoverItems.Item item = new DiscoverItems.Item(PUBSUBSVC);
                item.setNode(subnode);
                items.addItem(item);
            }
        }
        return items;
    }

    @Override
    public int getWaitTimeInSeconds() {

        return 0;
    }

    @Override
    public void checkRoster() {

        // TODO Auto-generated method stub

    }

    @Override
    public void sendHeartBeat() {

        // TODO Auto-generated method stub

    }
}
