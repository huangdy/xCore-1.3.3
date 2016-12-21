package com.saic.uicds.xmpp.communications;

//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import com.saic.uicds.xmpp.apps.ConnectionChecker;

/**
 * Unit test for simple CoreConnection
 */
public class CoreConnectionTest
    extends AbstractDependencyInjectionSpringContextTests {

    @Autowired
    XmppConnection coreConnection;

    @Autowired
    ConnectionChecker connectionChecker;

    boolean serverIsAvailable = false;

    @Override
    protected void onTearDown() throws Exception {

        coreConnection.disconnect();
    }

    @Test
    public void testCoreConnectionCreation() {

        assertNotNull("core connection is null", coreConnection);
        assertTrue("not connected", coreConnection.isConnected());
    }

    @Test
    public void testCoreDisconnect() {

        coreConnection.disconnect();
        assertFalse("not disconnected", coreConnection.isConnected());

        assertNotNull("null checker", connectionChecker);
        connectionChecker.checkConnection();

        assertTrue("not reconnected", coreConnection.isConnected());
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] { "contexts/test-applicationContext.xml" };
    }
}
