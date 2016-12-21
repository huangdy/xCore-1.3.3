package com.saic.uicds.xmpp.testbot;

import com.saic.uicds.xmpp.communications.XmppConnection;

public interface TestBotConnection extends XmppConnection {

	public boolean publishTestBotResponse(String xmlText);
	
	public void cleanupNodes();
}