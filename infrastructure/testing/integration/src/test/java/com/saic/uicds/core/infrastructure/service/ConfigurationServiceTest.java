package com.saic.uicds.core.infrastructure.service;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 * Unit test for simple CoreConnection
 */
public class ConfigurationServiceTest extends AbstractDependencyInjectionSpringContextTests {

    ConfigurationService configurationService;

    public void setConfigurationService(ConfigurationService c) {
        configurationService = c;
    }

    String localhostName = null;
    String localhostFQN = null;
    String serviceFQN = null;
    String serviceName = null;

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }

    public void onSetUp() {
        try {
            localhostName = InetAddress.getLocalHost().getHostName().toLowerCase();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // log.debug("Host name is: "+localhostName);

        try {
            localhostFQN = InetAddress.getLocalHost().getCanonicalHostName().toLowerCase();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // log.debug("Host FQN is: "+localhostFQN);

        serviceFQN = "urn:uicds:service:" + localhostFQN + "."
            + WorkProductService.PRODUCT_SERVICE_NAME;
        serviceName = "urn:uicds:service:" + WorkProductService.PRODUCT_SERVICE_NAME;
    }

    public void testConfigurationService() {
        assertNotNull(configurationService);
    }

    public void testLocalHostName() {

        // TODO temp. comment out - ddh
        // String configuredHost = configurationService.getHostName();
        // assertTrue(localhostName.equals(configuredHost));
    }

    public void testLocalHostIP() {
        String configuredHostFQN = configurationService.getFullyQualifiedHostName();
        assertTrue(localhostFQN.equals(configuredHostFQN));
    }

    public void testFullyQualifiedServiceName() {
        String type = WorkProductService.PRODUCT_SERVICE_NAME;
        String fqn = configurationService.getFullyQualifiedServiceNameURN(type);
        assertTrue(serviceFQN.equals(fqn));
    }

    public void testServiceName() {
        String type = WorkProductService.PRODUCT_SERVICE_NAME;
        String svcName = configurationService.getServiceNameURN(type);
        assertTrue(serviceName.equals(svcName));

    }

    public void testGetWebServiceURL() {
        String baseURL = "https://localhost/uicds/core/ws/services";
        String fqn = configurationService.getFullyQualifiedHostName();
        baseURL = baseURL.replace("localhost", fqn);
        String url = configurationService.getWebServiceBaseURL();
        assertTrue(baseURL.equals(url));
    }
}
