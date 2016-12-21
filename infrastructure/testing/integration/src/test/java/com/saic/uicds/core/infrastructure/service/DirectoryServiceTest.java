package com.saic.uicds.core.infrastructure.service;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.uicds.directoryServiceData.WorkProductTypeListType;
import org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType;
import org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType;
import org.uicds.externalToolConfig.ExternalToolConfigListType;
import org.uicds.externalToolConfig.ExternalToolConfigType;
import org.uicds.serviceConfig.ServiceConfigListType;
import org.uicds.serviceConfig.ServiceConfigType;

import com.saic.uicds.core.infrastructure.exceptions.InvalidProductTypeException;

public class DirectoryServiceTest extends AbstractJpaTests {

    Logger log = LoggerFactory.getLogger(getClass());

    DirectoryService directoryService;

    public void setDirectoryService(DirectoryService ds) {
        directoryService = ds;
    }

    @Autowired
    ConfigurationService cfgService;

    @Test
    public void testConfigurationServiceCreation() {
        assertNotNull(cfgService);
    }

    @Test
    public void testDirectoryServiceCreation() {
        assertNotNull(directoryService);
    }

    @Test
    public void testCleanup() {
        // TBD - should be getting this from CoreConfig table
        String coreName = cfgService.getCoreName();

        // remove previous registration first
        ServiceConfigListType serviceList = directoryService.getServiceList(coreName);
        for (int indx = 0; indx < serviceList.sizeOfServiceArray(); indx++) {
            String serviceName = serviceList.getServiceArray(indx).getServiceName();
            directoryService.unregisterUICDSService(serviceName);
        }

        serviceList = directoryService.getServiceList(coreName);
        assertEquals(0, serviceList.sizeOfServiceArray());
    }

    @Test
    public void testExternalDataSourceRegistration() {
        String urn = "http://uicds.dctd.saic.com/MaidService";

        String coreName = cfgService.getCoreName();

        directoryService.registerExternalDataSource(urn);

        // get list of data source and verify that the one we've just registered is returned in the
        // list
        ExternalDataSourceConfigListType dataSourceList = directoryService.getExternalDataSourceList(coreName);
        assertEquals(1, dataSourceList.sizeOfExternalDataSourceArray());

        ExternalDataSourceConfigType dataSource = dataSourceList.getExternalDataSourceArray(0);
        assertEquals(urn, dataSource.getURN());
        assertEquals(coreName, dataSource.getCoreName());

        directoryService.unregisterExternalDataSource(urn);

        // get list of data source and verify that the one we've just unregistered has been deleted
        // and
        // is not returned in the list
        ExternalDataSourceConfigListType dataSourceList1 = directoryService.getExternalDataSourceList(coreName);
        assertEquals(0, dataSourceList1.sizeOfExternalDataSourceArray());

    }

    @Test
    public void testExternalToolRegistration() {
        String urn = cfgService.getServiceNameURN("AlertService");
        String toolName = "WashingtonFlyer";
        WorkProductTypeListType publishedProducts = WorkProductTypeListType.Factory.newInstance();
        WorkProductTypeListType subscribedProducts = WorkProductTypeListType.Factory.newInstance();

        String coreName = cfgService.getCoreName();

        publishedProducts.addProductType("Alert");
        subscribedProducts.addProductType("Alert");
        subscribedProducts.addProductType("Incident");

        directoryService.registerExternalTool(urn, toolName, publishedProducts, subscribedProducts);

        ExternalToolConfigListType toolList = directoryService.getExternalToolList(coreName);
        assertEquals(1, toolList.sizeOfExternalToolArray());

        ExternalToolConfigType tool = toolList.getExternalToolArray(0);
        assertEquals(urn, tool.getURN());
        assertEquals(toolName, tool.getToolName());
        assertEquals(coreName, tool.getCoreName());
        assertEquals(publishedProducts.sizeOfProductTypeArray(),
            tool.getPublishedProducts().sizeOfProductTypeArray());
        assertEquals(subscribedProducts.sizeOfProductTypeArray(),
            tool.getSubscribedProducts().sizeOfProductTypeArray());

        WorkProductTypeListType pubTypeList = directoryService.getPublishedProductTypeList();
        assertEquals(1, pubTypeList.sizeOfProductTypeArray());

        WorkProductTypeListType subTypeList = directoryService.getSubscribedProductTypeList();
        assertEquals(2, subTypeList.sizeOfProductTypeArray());

        directoryService.unregisterExternalTool(urn);

        // get list of external tools and verify that the one we've just unregistered has been
        // deleted and
        // is not returned in the list
        toolList = directoryService.getExternalToolList(coreName);
        assertEquals(0, toolList.sizeOfExternalToolArray());

        pubTypeList = directoryService.getPublishedProductTypeList();
        assertEquals(0, pubTypeList.sizeOfProductTypeArray());

        subTypeList = directoryService.getSubscribedProductTypeList();
        assertEquals(0, subTypeList.sizeOfProductTypeArray());

    }

    @Test
    public void testUICDSServiceRegistration() {

        String coreName = cfgService.getCoreName();
        String serviceName = "AlertService";

        String urn = cfgService.getServiceNameURN(serviceName);
        WorkProductTypeListType publishedProducts = WorkProductTypeListType.Factory.newInstance();
        WorkProductTypeListType subscribedProducts = WorkProductTypeListType.Factory.newInstance();

        publishedProducts.addProductType("Alert");
        subscribedProducts.addProductType("Alert");
        subscribedProducts.addProductType("Incident");

        directoryService.registerUICDSService(urn, serviceName, publishedProducts,
            subscribedProducts);

        ServiceConfigListType serviceList = directoryService.getServiceList(coreName);
        assertEquals(1, serviceList.sizeOfServiceArray());

        ServiceConfigType service = serviceList.getServiceArray(0);
        assertEquals(urn, service.getURN());
        assertEquals(serviceName, service.getServiceName());
        assertEquals(coreName, service.getCoreName());
        assertEquals(publishedProducts.sizeOfProductTypeArray(),
            service.getPublishedProducts().sizeOfProductTypeArray());
        assertEquals(subscribedProducts.sizeOfProductTypeArray(),
            service.getSubscribedProducts().sizeOfProductTypeArray());

        WorkProductTypeListType pubTypeList = directoryService.getPublishedProductTypeList();
        assertEquals(1, pubTypeList.sizeOfProductTypeArray());

        WorkProductTypeListType subTypeList = directoryService.getSubscribedProductTypeList();
        assertEquals(2, subTypeList.sizeOfProductTypeArray());

        directoryService.unregisterUICDSService(serviceName);

        // get list of external tools and verify that the one we've just unregistered has been
        // deleted and
        // is not returned in the list
        serviceList = directoryService.getServiceList(coreName);
        assertEquals(0, serviceList.sizeOfServiceArray());

        pubTypeList = directoryService.getPublishedProductTypeList();
        assertEquals(0, pubTypeList.sizeOfProductTypeArray());

        subTypeList = directoryService.getSubscribedProductTypeList();
        assertEquals(0, subTypeList.sizeOfProductTypeArray());

    }

    @Test
    public void testUICDSServiceRegistrationWithNoProducts() {

        String coreName = cfgService.getCoreName();

        String serviceName = "AlertService";
        String urn = cfgService.getServiceNameURN(serviceName);

        WorkProductTypeListType publishedProducts = WorkProductTypeListType.Factory.newInstance();
        WorkProductTypeListType subscribedProducts = WorkProductTypeListType.Factory.newInstance();

        log.debug("testUICDSServiceRegistrationWithNoProducts: register service with no pusub products");
        directoryService.registerUICDSService(urn, serviceName, publishedProducts,
            subscribedProducts);

        ServiceConfigListType serviceList = directoryService.getServiceList(coreName);
        log.debug("testUICDSServiceRegistrationWithNoProducts: numRegisteredServices:"
            + serviceList.sizeOfServiceArray());
        assertEquals(1, serviceList.sizeOfServiceArray());

        WorkProductTypeListType pubTypeList = directoryService.getPublishedProductTypeList();
        log.debug("testUICDSServiceRegistrationWithNoProducts: numofPubProducts:"
            + pubTypeList.sizeOfProductTypeArray());
        assertEquals(0, pubTypeList.sizeOfProductTypeArray());

        WorkProductTypeListType subTypeList = directoryService.getSubscribedProductTypeList();
        log.debug("testUICDSServiceRegistrationWithNoProducts: numofSubProducts:"
            + subTypeList.sizeOfProductTypeArray());
        assertEquals(0, subTypeList.sizeOfProductTypeArray());

        directoryService.unregisterUICDSService(serviceName);

        // get list of external tools and verify that the one we've just unregistered has been
        // deleted and
        // is not returned in the list
        serviceList = directoryService.getServiceList(coreName);
        assertEquals(0, serviceList.sizeOfServiceArray());

    }

    @Test
    public void testMultipleRegistrations() {

        String coreName = cfgService.getCoreName();

        String serviceName = "AlertService";
        String urn = cfgService.getServiceNameURN(serviceName);

        WorkProductTypeListType publishedProducts = WorkProductTypeListType.Factory.newInstance();
        WorkProductTypeListType subscribedProducts = WorkProductTypeListType.Factory.newInstance();

        publishedProducts.addProductType("AlertService");
        publishedProducts.addProductType("Feature");
        subscribedProducts.addProductType("Alert");
        subscribedProducts.addProductType("MapViewContext");
        subscribedProducts.addProductType("LayerViewContext");
        directoryService.registerUICDSService(urn, serviceName, publishedProducts,
            subscribedProducts);

        ServiceConfigListType serviceList = directoryService.getServiceList(coreName);
        assertEquals(1, serviceList.sizeOfServiceArray());

        WorkProductTypeListType pubTypeList = directoryService.getPublishedProductTypeList();
        assertEquals(2, pubTypeList.sizeOfProductTypeArray());

        WorkProductTypeListType subTypeList = directoryService.getSubscribedProductTypeList();
        assertEquals(3, subTypeList.sizeOfProductTypeArray());

        WorkProductTypeListType publishedProducts1 = WorkProductTypeListType.Factory.newInstance();
        WorkProductTypeListType subscribedProducts1 = WorkProductTypeListType.Factory.newInstance();

        publishedProducts1.addProductType("Alert");
        subscribedProducts1.addProductType("MapViewContext");
        subscribedProducts1.addProductType("Incident");

        directoryService.registerUICDSService(urn, serviceName, publishedProducts1,
            subscribedProducts1);

        serviceList = directoryService.getServiceList(coreName);
        assertEquals(1, serviceList.sizeOfServiceArray());

        pubTypeList = directoryService.getPublishedProductTypeList();

        subTypeList = directoryService.getSubscribedProductTypeList();
        assertEquals(2, subTypeList.sizeOfProductTypeArray());

    }

    @Test
    public void testGetPublishedProductTypeList() {
        String alertServiceName = "AlertService";
        String urn = cfgService.getServiceNameURN(alertServiceName);

        WorkProductTypeListType publishedProducts = WorkProductTypeListType.Factory.newInstance();
        WorkProductTypeListType subscribedProducts = WorkProductTypeListType.Factory.newInstance();

        String coreName = cfgService.getCoreName();

        publishedProducts.addProductType("Alert");
        subscribedProducts.addProductType("Alert");
        subscribedProducts.addProductType("Incident");

        directoryService.registerUICDSService(urn, alertServiceName, publishedProducts,
            subscribedProducts);

        ServiceConfigListType serviceList = directoryService.getServiceList(coreName);
        assertEquals(1, serviceList.sizeOfServiceArray());

        WorkProductTypeListType pubTypeList = directoryService.getPublishedProductTypeList();
        assertEquals(1, pubTypeList.sizeOfProductTypeArray());

        String mapServiceName = " MapService";
        String urn1 = cfgService.getServiceNameURN(mapServiceName);

        WorkProductTypeListType publishedProducts1 = WorkProductTypeListType.Factory.newInstance();
        WorkProductTypeListType subscribedProducts1 = WorkProductTypeListType.Factory.newInstance();

        publishedProducts1.addProductType("MapViewContext");
        subscribedProducts1.addProductType("ICS");
        subscribedProducts1.addProductType("MACST");

        directoryService.registerUICDSService(urn1, mapServiceName, publishedProducts1,
            subscribedProducts1);

        serviceList = directoryService.getServiceList(coreName);
        assertEquals(2, serviceList.sizeOfServiceArray());

        pubTypeList = directoryService.getPublishedProductTypeList();
        assertEquals(2, pubTypeList.sizeOfProductTypeArray());

    }

    @Test
    public void testGetServiceNameByPublishedProductType() {
        String alertServiceName = "AlertService";
        String urn = cfgService.getServiceNameURN(alertServiceName);

        WorkProductTypeListType publishedProducts = WorkProductTypeListType.Factory.newInstance();
        WorkProductTypeListType subscribedProducts = WorkProductTypeListType.Factory.newInstance();

        publishedProducts.addProductType("Alert");
        subscribedProducts.addProductType("Alert");
        subscribedProducts.addProductType("Incident");

        directoryService.registerUICDSService(urn, alertServiceName, publishedProducts,
            subscribedProducts);

        String mapServiceName = "MapService";
        String urn1 = cfgService.getServiceNameURN(mapServiceName);

        WorkProductTypeListType publishedProducts1 = WorkProductTypeListType.Factory.newInstance();
        WorkProductTypeListType subscribedProducts1 = WorkProductTypeListType.Factory.newInstance();

        publishedProducts1.addProductType("MapViewContext");
        subscribedProducts1.addProductType("ICS");
        subscribedProducts1.addProductType("Incident");

        directoryService.registerUICDSService(urn1, mapServiceName, publishedProducts1,
            subscribedProducts1);

        String svcName = null;
        try {
            svcName = directoryService.getServiceNameByPublishedProductType("Alert");
        } catch (InvalidProductTypeException ex) {
            fail("Caught InvalidProductTypeException");
        }
        assertTrue(alertServiceName.equals(svcName));

        try {
            svcName = directoryService.getServiceNameByPublishedProductType("MapViewContext");
        } catch (InvalidProductTypeException ex) {
            fail("Caught InvalidProductTypeException");
        }
        assertTrue(mapServiceName.equals(svcName));
    }

    @Test
    public void testGetSubscribedProductTypeList() {
        String alertServiceName = "AlertService";
        String urn = cfgService.getServiceNameURN(alertServiceName);

        WorkProductTypeListType publishedProducts = WorkProductTypeListType.Factory.newInstance();
        WorkProductTypeListType subscribedProducts = WorkProductTypeListType.Factory.newInstance();

        String coreName = cfgService.getCoreName();

        publishedProducts.addProductType("Alert");
        subscribedProducts.addProductType("Alert");
        subscribedProducts.addProductType("Incident");

        directoryService.registerUICDSService(urn, alertServiceName, publishedProducts,
            subscribedProducts);

        ServiceConfigListType serviceList = directoryService.getServiceList(coreName);
        assertEquals(1, serviceList.sizeOfServiceArray());

        WorkProductTypeListType subTypeList = directoryService.getSubscribedProductTypeList();
        assertEquals(2, subTypeList.sizeOfProductTypeArray());

        String mapServiceName = "MapService";
        String urn1 = cfgService.getServiceNameURN(mapServiceName);

        WorkProductTypeListType publishedProducts1 = WorkProductTypeListType.Factory.newInstance();
        WorkProductTypeListType subscribedProducts1 = WorkProductTypeListType.Factory.newInstance();

        publishedProducts1.addProductType("MapViewContext");
        subscribedProducts1.addProductType("Incident");
        subscribedProducts1.addProductType("MACS");

        directoryService.registerUICDSService(urn1, mapServiceName, publishedProducts1,
            subscribedProducts1);

        serviceList = directoryService.getServiceList(coreName);
        assertEquals(2, serviceList.sizeOfServiceArray());

        subTypeList = directoryService.getSubscribedProductTypeList();
        for (int indx = 0; indx < subTypeList.sizeOfProductTypeArray(); indx++) {
            if (log.isDebugEnabled()) {
                log.debug("Getting idx:" + indx + " type=" + subTypeList.getProductTypeArray(indx));
            }
        }

        assertEquals(3, subTypeList.sizeOfProductTypeArray());
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
}
