/**
 * 
 */
package com.saic.uicds.xmpp.testbot;

import org.springframework.integration.core.Message;

import com.saic.uicds.core.infrastructure.messages.CoreRosterMessage;

/**
 * @author roger
 *<iq type='set' to='pubsub.clash.saic.com' id='sub1'>
 *  <pubsub xmlns='http://jabber.org/protocol/pubsub'>
 *   <subscribe
 *       node='testbot-responses'
 *       jid='roger@clash.saic.com'/>
 * </pubsub>
 * </iq>
 */
public class TestBotChannelListener {
	
	private TestBotConnection connection;

	public TestBotConnection getConnection() {
		return connection;
	}

	public void setConnection(TestBotConnection connection) {
		this.connection = connection;
	}

	public void messageHandler(Message<?> message) {
		Object payload = message.getPayload();
		if (payload instanceof CoreRosterMessage) {
			System.out.println("Got CoreRosterMessage");
			publishMessageReceived(getMessageTypeXML("CoreRosterMessage"));
		}
		else {
			System.err.println("UNKNOWN payload");
		}
	}
	
	private String getMessageTypeXML(String messageName) {
		StringBuffer sb = new StringBuffer();
		sb.append("<messagetype>");
		sb.append(messageName);
		sb.append("</messagetype>");
		return sb.toString();
	}
	
	private void publishMessageReceived(String xmlText) {
		connection.publishTestBotResponse(xmlText);
	}
}
