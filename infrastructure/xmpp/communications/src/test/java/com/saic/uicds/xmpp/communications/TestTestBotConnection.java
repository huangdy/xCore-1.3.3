/**
 * 
 */
package com.saic.uicds.xmpp.communications;

import static org.junit.Assert.assertTrue;

import java.net.InetAddress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.saic.uicds.xmpp.testbot.TestBotConnectionImpl;

/**
 * @author roger
 * 
 */
public class TestTestBotConnection {

    private TestBotConnectionImpl testBotConnection;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {

        testBotConnection = new TestBotConnectionImpl();
        testBotConnection.setDebug(true);
        testBotConnection.setPassword("uicds.1549");
        testBotConnection.setUsername("uicds");
        testBotConnection.setResource("test");
        testBotConnection.setServer(InetAddress.getLocalHost().getCanonicalHostName());
        testBotConnection.setPort(5222);
        testBotConnection.initialize();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {

    }

    /**
     * Test method for {@link com.saic.uicds.xmpp.testbot.TestBotConnectionImpl#initialize()}.
     */
    @Test
    public void testInitialize() {

        assertTrue("Not connected", testBotConnection.isConnected());
    }

}
