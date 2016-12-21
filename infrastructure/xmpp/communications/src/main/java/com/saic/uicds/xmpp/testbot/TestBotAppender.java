package com.saic.uicds.xmpp.testbot;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.Level;
import org.apache.log4j.spi.LoggingEvent;


public class TestBotAppender extends AppenderSkeleton {
	
	public static final String TESTBOT_XMPP_APPENDER = "XMPPpubsubAppender";

	private Level level = Level.ERROR;

	private TestBotConnection connection;
	
	private String lastLocationFullInfo;
	
	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public TestBotConnection getConnection() {
		return connection;
	}

	public void setConnection(TestBotConnection connection) {
		this.connection = connection;
	}

	public TestBotAppender() {
		setName(TESTBOT_XMPP_APPENDER);
		setThreshold(Level.ERROR);
	}
	
	@Override
	protected void append(LoggingEvent event) {
		// try not to start a infinite loop reporting errors publishing to the node
		if (event.getLocationInformation().getClassName().contains("Connection")  ||
			event.getLocationInformation().fullInfo.equalsIgnoreCase(lastLocationFullInfo)) {
			System.err.println("ERROR from an connection class");
		}
		else {
//			System.err.println(event.getLoggerName());
//			System.err.println(event.getMessage());
//			System.err.println(event.getRenderedMessage());
//			System.err.println(event.getThreadName());
//			System.err.println(event.getLevel().toString());
//			System.err.println(event.getLocationInformation().fullInfo);
//			System.err.println(event.getLocationInformation().getFileName());
//			System.err.println(event.getLocationInformation().getClassName());
//			System.err.println(event.getLocationInformation().getLineNumber());
//			System.err.println(event.getLocationInformation().getMethodName());
			publishMessageReceived(getMessageTypeXML(event));
		}
		
		// Dealing with location information is noted as being slow in the Log4j
		// documentation but it is better than getting into an infinite loop
		lastLocationFullInfo = event.getLocationInformation().fullInfo;
	}

	@Override
	public void close() {
	}

	@Override
	public boolean requiresLayout() {
		// TODO Auto-generated method stub
		return false;
	}
	private String getMessageTypeXML(LoggingEvent event) {
		StringBuffer sb = new StringBuffer();
		sb.append("<log4j xmlns='http://uicds.us/log4j'>");
		sb.append("<level>");
		sb.append(event.getLevel().toString());
		sb.append("</level>");
		sb.append("<class>");
		sb.append(event.getLocationInformation().getClassName());
		sb.append("</class>");
		sb.append("<method>");
		sb.append(event.getLocationInformation().getMethodName());
		sb.append("</method>");
		// TODO: should XML encode the message text
		sb.append("<message>");
		sb.append(event.getRenderedMessage());
		sb.append("</message>");
		sb.append("</log4j>");
		return sb.toString();
	}
	
	private void publishMessageReceived(String xmlText) {
		connection.publishTestBotResponse(xmlText);
	}

}
