package com.saic.uicds.core.infrastructure.endpoint;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.uicds.directoryService.GetCoreListRequestDocument;
import org.uicds.directoryService.GetCoreListResponseDocument;
import org.uicds.directoryService.GetExternalDataSourceListRequestDocument;
import org.uicds.directoryService.GetExternalDataSourceListResponseDocument;
import org.uicds.directoryService.GetExternalToolListRequestDocument;
import org.uicds.directoryService.GetExternalToolListResponseDocument;
import org.uicds.directoryService.GetIncidentListRequestDocument;
import org.uicds.directoryService.GetIncidentListResponseDocument;
import org.uicds.directoryService.GetSOSListRequestDocument;
import org.uicds.directoryService.GetSOSListResponseDocument;
import org.uicds.directoryService.GetServiceListRequestDocument;
import org.uicds.directoryService.GetServiceListResponseDocument;
import org.uicds.directoryService.RegisterExternalDataSourceRequestDocument;
import org.uicds.directoryService.RegisterExternalToolRequestDocument;
import org.uicds.directoryService.RegisterUICDSServiceRequestDocument;
import org.uicds.directoryService.UnregisterExternalDataSourceRequestDocument;
import org.uicds.directoryService.UnregisterExternalToolRequestDocument;
import org.uicds.directoryService.UnregisterUICDSServiceRequestDocument;
import org.uicds.directoryServiceData.WorkProductTypeListType;
import org.uicds.externalToolConfig.ExternalToolConfigType;
import org.uicds.serviceConfig.ServiceConfigType;

import com.saic.uicds.core.infrastructure.service.ConfigurationService;

public class DirectoryServiceEndpointTest extends AbstractJpaTests {

    @Autowired
    DirectoryServiceEndpoint dsEndpoint;

    private String incidentID = null;

    @Test
    public void testEndpointCreated() {

        assertNotNull(dsEndpoint);
    }

    @Autowired
    ConfigurationService cfgService;

    @Test
    public void testConfigurationServiceCreation() {

        assertNotNull(cfgService);
    }

    @Test
    public void testGetCoreList() {

        GetCoreListRequestDocument requestDoc = GetCoreListRequestDocument.Factory.newInstance();
        GetCoreListResponseDocument responseDoc = dsEndpoint.GetCoreList(requestDoc);
        assertNotNull(responseDoc);
    }

    @Test
    public void testGetIncidentList() {

        GetIncidentListRequestDocument requestDoc = GetIncidentListRequestDocument.Factory.newInstance();
        GetIncidentListResponseDocument responseDoc = dsEndpoint.GetIncidentList(requestDoc);
        assertNotNull(responseDoc);
    }

    @Test
    public void testGetExternalToolList() {

        GetExternalToolListRequestDocument requestDoc = GetExternalToolListRequestDocument.Factory.newInstance();
        requestDoc.addNewGetExternalToolListRequest().setCoreName(cfgService.getHostName());
        GetExternalToolListResponseDocument responseDoc = dsEndpoint.GetExternalToolList(requestDoc);
        assertNotNull(responseDoc);
    }

    @Test
    public void testGetExternalDataSourceList() {

        GetExternalDataSourceListRequestDocument requestDoc = GetExternalDataSourceListRequestDocument.Factory.newInstance();
        requestDoc.addNewGetExternalDataSourceListRequest().setCoreName(cfgService.getHostName());
        GetExternalDataSourceListResponseDocument responseDoc = dsEndpoint.GetExternalDataSourceList(requestDoc);
        assertNotNull(responseDoc);
    }

    @Test
    public void testGetSOSList() {

        GetSOSListRequestDocument requestDoc = GetSOSListRequestDocument.Factory.newInstance();
        GetSOSListResponseDocument responseDoc = dsEndpoint.GetSOSList(requestDoc);
        assertNotNull(responseDoc);
    }

    @Test
    public void testGetServiceList() {

        GetServiceListRequestDocument requestDoc = GetServiceListRequestDocument.Factory.newInstance();
        requestDoc.addNewGetServiceListRequest().setCoreName(cfgService.getHostName());
        GetServiceListResponseDocument responseDoc = dsEndpoint.GetServiceList(requestDoc);
        assertNotNull(responseDoc);
    }

    @Test
    public void testRegisterExternalDataSource() {

        RegisterExternalDataSourceRequestDocument requestDoc = RegisterExternalDataSourceRequestDocument.Factory.newInstance();
        requestDoc.addNewRegisterExternalDataSourceRequest().setURN(
            cfgService.getServiceNameURN("AlertService"));
        dsEndpoint.RegisterExternalDataSource(requestDoc);
    }

    @Test
    public void testRegisterExternalTool() {

        RegisterExternalToolRequestDocument requestDoc = RegisterExternalToolRequestDocument.Factory.newInstance();
        ExternalToolConfigType tool = requestDoc.addNewRegisterExternalToolRequest().addNewExternalTool();
        tool.setURN(cfgService.getServiceNameURN("AlertService"));
        tool.setToolName("Tool");
        WorkProductTypeListType subProdTypes = tool.addNewSubscribedProducts();
        WorkProductTypeListType pubProdTypes = tool.addNewPublishedProducts();
        subProdTypes.addProductType("Alert");
        pubProdTypes.addProductType("Alert");
        dsEndpoint.RegisterExternalTool(requestDoc);
    }

    @Test
    public void testRegisterUICDSService() {

        RegisterUICDSServiceRequestDocument requestDoc = RegisterUICDSServiceRequestDocument.Factory.newInstance();
        ServiceConfigType service = requestDoc.addNewRegisterUICDSServiceRequest().addNewService();;
        service.setServiceName("AlertService");
        service.setURN(cfgService.getServiceNameURN("AlertService"));
        WorkProductTypeListType subProdTypes = service.addNewSubscribedProducts();
        WorkProductTypeListType pubProdTypes = service.addNewPublishedProducts();
        subProdTypes.addProductType("Alert");
        pubProdTypes.addProductType("Alert");
        dsEndpoint.RegisterUICDSService(requestDoc);
    }

    @Test
    public void testUnregisterExternalDataSource() {

        UnregisterExternalDataSourceRequestDocument requestDoc = UnregisterExternalDataSourceRequestDocument.Factory.newInstance();
        requestDoc.addNewUnregisterExternalDataSourceRequest().setURN(
            cfgService.getServiceNameURN("AlertService"));
        dsEndpoint.UnregisterExternalDataSource(requestDoc);
    }

    @Test
    public void testUnregisterExternalTool() {

        UnregisterExternalToolRequestDocument requestDoc = UnregisterExternalToolRequestDocument.Factory.newInstance();
        requestDoc.addNewUnregisterExternalToolRequest().setURN(
            cfgService.getServiceNameURN("AlertService"));
        dsEndpoint.UnregisterExternalTool(requestDoc);
    }

    @Test
    public void testUnregisterUICDSService() {

        UnregisterUICDSServiceRequestDocument requestDoc = UnregisterUICDSServiceRequestDocument.Factory.newInstance();
        requestDoc.addNewUnregisterUICDSServiceRequest().setServiceName("AlertService");
        dsEndpoint.UnregisterUICDSService(requestDoc);
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-ED-dataSrcContext.xml",
            "classpath:contexts/test-spring-ws-infra-servlet.xml"
        };
    }

}
