package com.saic.uicds.core.em.adminconsole.client;

import junit.framework.Assert;

import com.google.gwt.junit.client.GWTTestCase;

public class GwtTestSample extends GWTTestCase {

    public String getModuleName() {
        return "com.saic.uicds.core.adminconsole.AdminConsole";
    }

    public void testSomething() {
        // Not much to actually test in this sample app
        // Ideally you would test your Controller here (NOT YOUR UI)
        // (Make calls to RPC services, test client side model objects, test client side logic, etc)
        Assert.assertTrue(true);
    }
}