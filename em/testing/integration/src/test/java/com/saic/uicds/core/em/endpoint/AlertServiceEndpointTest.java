package com.saic.uicds.core.em.endpoint;

import java.io.File;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.soap.SOAPException;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.jpa.AbstractJpaTests;
import org.uicds.alertService.CancelAlertRequestDocument;
import org.uicds.alertService.CancelAlertResponseDocument;
import org.uicds.alertService.CreateAlertRequestDocument;
import org.uicds.alertService.CreateAlertResponseDocument;
import org.uicds.alertService.GetListOfAlertsRequestDocument;
import org.uicds.alertService.GetListOfAlertsResponseDocument;
import org.uicds.workProductService.WorkProductPublicationResponseType;

import com.saic.precis.x2009.x06.base.IdentificationType;
import com.saic.precis.x2009.x06.base.NamespaceMapItemType;
import com.saic.uicds.core.em.service.AlertService;
import com.saic.uicds.core.infrastructure.util.WorkProductHelper;

public class AlertServiceEndpointTest
    extends AbstractJpaTests {

    private static Logger logger = Logger.getLogger(AlertServiceEndpointTest.class);

    @Autowired
    AlertServiceEndpoint alertServiceEndpoint;
    @Autowired
    AlertService alertService;

    @Test
    public void testCancelAlert() {

        IdentificationType identifier = createAlert();
        WorkProductPublicationResponseType response = cancelAlert(identifier);
        response = cancelAlert(identifier);
    }

    @Test
    public void testGetListOfAlert() {

        IdentificationType identifier = createAlert();

        GetListOfAlertsRequestDocument request = GetListOfAlertsRequestDocument.Factory.newInstance();
        NamespaceMapItemType namespace = NamespaceMapItemType.Factory.newInstance();
        request.addNewGetListOfAlertsRequest().addNewNamespaceMap().addNewItem().set(namespace);
        request.getGetListOfAlertsRequest().setQueryString("//incident:junk");
        try {
            GetListOfAlertsResponseDocument response = alertServiceEndpoint.getListOfAlerts(request);
            logger.debug("AlertService.GetListOfAlert:\n");
        } catch (SOAPException e) {
            logger.error("AlertService.GetListOfAlert: " + e.getMessage());
        }
    }

    @Test
    public void testOptionalParametersGetListOfAlert() {

        IdentificationType identifier = createAlert();

        GetListOfAlertsRequestDocument request = GetListOfAlertsRequestDocument.Factory.newInstance();
        // NamespaceMapItemType namespace = NamespaceMapItemType.Factory.newInstance();
        // request.addNewGetListOfAlertsRequest().addNewNamespaceMap().addNewItem().set(namespace);
        // request.getGetListOfAlertsRequest().setQueryString("//incident:junk");
        try {
            GetListOfAlertsResponseDocument response = alertServiceEndpoint.getListOfAlerts(request);
            logger.debug("AlertService.GetListOfAlert:\n");
        } catch (SOAPException e) {
            logger.error("AlertService.GetListOfAlert: " + e.getMessage());
        }
    }

    private WorkProductPublicationResponseType cancelAlert(IdentificationType identifier) {

        CancelAlertRequestDocument cancelAlert = CancelAlertRequestDocument.Factory.newInstance();
        cancelAlert.addNewCancelAlertRequest().addNewWorkProductIdentification().set(identifier);
        CancelAlertResponseDocument responseDoc;
        try {
            responseDoc = alertServiceEndpoint.cancelAlert(cancelAlert);
            return responseDoc.getCancelAlertResponse().getWorkProductPublicationResponse();
        } catch (DatatypeConfigurationException e) {
            // TODO Auto-generated catch block
            logger.error("AlertService.CancelAlert: " + e.getMessage());
            return null;
        }
    }

    private IdentificationType createAlert() {

        CreateAlertRequestDocument request;
        try {
            request = CreateAlertRequestDocument.Factory.parse(new File("../data/CreateAlert.xml"));
            CreateAlertResponseDocument response = alertServiceEndpoint.createAlert(request);
            return WorkProductHelper.getIdentificationElement(response.getCreateAlertResponse().getWorkProductPublicationResponse().getWorkProduct());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/test-dataSrcContext.xml",
            "classpath:contexts/test-spring-ws-em-servlet.xml" };
    }
}
