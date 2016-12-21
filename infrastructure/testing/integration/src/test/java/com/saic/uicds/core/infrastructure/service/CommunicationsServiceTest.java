package com.saic.uicds.core.infrastructure.service;

import org.easymock.Capture;


import org.junit.Test;
import org.springframework.integration.core.Message;
import org.springframework.integration.core.MessageChannel;
import org.springframework.test.jpa.AbstractJpaTests;

import static org.easymock.EasyMock.*;

import com.saic.uicds.core.infrastructure.exceptions.LocalCoreNotOnlineException;
import com.saic.uicds.core.infrastructure.exceptions.NoShareAgreementException;
import com.saic.uicds.core.infrastructure.exceptions.NoShareRuleInAgreementException;
import com.saic.uicds.core.infrastructure.exceptions.RemoteCoreUnavailableException;
import com.saic.uicds.core.infrastructure.exceptions.RemoteCoreUnknownException;
import com.saic.uicds.core.infrastructure.messages.Core2CoreMessage;
import com.saic.uicds.core.infrastructure.service.CommunicationsService.CORE2CORE_MESSAGE_TYPE;
import com.saic.uicds.core.infrastructure.service.impl.CommunicationsServiceImpl;

/**
 * Unit test for simple CoreConnection
 */
public class CommunicationsServiceTest extends AbstractJpaTests {

    private static final String XMPP_JID = "rwuerfel@jabber.org";

    private static final String MESSAGE_BODY = "something";
    private static final String MESSAGE_XHTML = "<p>something</p>";
    private static final String MESSAGE_XML = "<something><something/>";
	
	CommunicationsServiceImpl communicationsServiceImpl;

    MessageChannel core2CoreMessageChannel;
    
    public void setCommunicationsServiceImpl(CommunicationsServiceImpl communicationsServiceImpl) {
        this.communicationsServiceImpl = communicationsServiceImpl;
    }

    @Override
    public void onSetUp() {

        if (core2CoreMessageChannel == null) {
        	core2CoreMessageChannel = org.easymock.EasyMock.createMock(MessageChannel.class);
        	communicationsServiceImpl.setCore2CoreMessageChannel(core2CoreMessageChannel);
        }
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-dataSrcContext.xml"};
    }
    
    @Test
    public void testConfigurationService() {
        assertNotNull(communicationsServiceImpl);

    }

    @Test
    public void testSendXMPPMessage() {
    	
    	Capture<Message> capturedMessage = new Capture<Message>();
    	
    	reset(core2CoreMessageChannel);
    	expect(core2CoreMessageChannel.send(and(isA(Message.class),capture(capturedMessage)))).andReturn(true);
    	replay(core2CoreMessageChannel);
    	
    	try {
			communicationsServiceImpl.sendXMPPMessage(MESSAGE_BODY, MESSAGE_XHTML, MESSAGE_XML, XMPP_JID);
		} catch (IllegalArgumentException e) {
			fail(e.getMessage());
		} 
		
		verify(core2CoreMessageChannel);
		assertNotNull("message is null",capturedMessage.getValue());
		assertTrue("not Message",capturedMessage.getValue() instanceof Message);
		assertTrue("not Core2CoreMessage",capturedMessage.getValue().getPayload() instanceof Core2CoreMessage);
		Core2CoreMessage msg = (Core2CoreMessage)capturedMessage.getValue().getPayload();
		assertEquals("wrong JID",XMPP_JID,msg.getToCore());
		assertEquals("wrong type","XMPP_MESSAGE",msg.getMessageType());
		System.out.println(msg.getMessageType());
		assertEquals("wrong body",MESSAGE_BODY,msg.getBody());
		assertEquals("wrong xhtml",MESSAGE_XHTML,msg.getXhtml());
		assertEquals("wrong xml",MESSAGE_XML,msg.getMessage());
    }
}
