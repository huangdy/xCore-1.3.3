package com.saic.uicds.xmpp.communications;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;


/**
 * Unit test for simple CoreConnection
 */
public class InterestManagerIntegrationTest extends AbstractDependencyInjectionSpringContextTests {

    InterestManager interestManager;

    public void setInterestManager(InterestManager man) {
        interestManager = man;
    }

    public void testInterestManagerCreation() {
        assertNotNull(interestManager);
        assertTrue(interestManager.isInitialized());
    }

    // This must be the last test executed
    // @Test
    // public void testCoreDisconnect() {
    // coreConnection.disconnect();
    // assertFalse(coreConnection.isConnected());
    // }

    @Override
    protected String[] getConfigLocations() {
        return new String[] { "classpath:contexts/test-applicationContext.xml" };
    }
}
