/**
 * 
 */
package com.saic.uicds.xmpp.testbot;

import java.util.HashSet;
import java.util.Set;

import org.jivesoftware.smack.PacketListener;
import org.jivesoftware.smack.packet.Packet;

/**
 * @author roger
 *
 */
public class TestBotMessageListener implements PacketListener {
	
	HashSet<Packet> packets = new HashSet<Packet>();

	/* (non-Javadoc)
	 * @see org.jivesoftware.smack.PacketListener#processPacket(org.jivesoftware.smack.packet.Packet)
	 */
	@Override
	public void processPacket(Packet packet) {
		packets.add(packet);
	}

	public Set<Packet> getPackets() {
		return packets;
	}
	
	public void clearPackets() {
		packets.clear();
	}
}
