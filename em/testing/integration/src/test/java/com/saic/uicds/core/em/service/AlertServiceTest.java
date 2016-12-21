package com.saic.uicds.core.em.service;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import x1.oasisNamesTcEmergencyCap1.AlertDocument;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode;

import com.saic.uicds.core.em.service.impl.AlertServiceImpl;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

public class AlertServiceTest
    extends AbstractXmldbJpaTests {

    Logger log = LoggerFactory.getLogger(AlertServiceTest.class);

    @Autowired
    AlertServiceImpl alertService;

    String alertEvent = "a test alert event";
    String alertHeadline = "a test alert headline";
    String alertIdentifier = "identifier";
    String alertSender = "sender";
    Calendar alertSent = new GregorianCalendar();

    @Test
    public void testAlertCreation() {

        assertNotNull(alertService);
    }

    WorkProductService workProductService;

    @Test
    public void testCreateAlert() throws XmlException, IOException {

        Alert alert = createAlertAdapter();
        alertService.createAlert(null, alert);

        WorkProduct wp = alertService.getAlertByAlertId(alertIdentifier);
        AlertDocument theAlert = (AlertDocument) wp.getProduct();
        assertEquals(theAlert.getAlert().getIdentifier(), alertIdentifier);
    }

    private Alert createAlertAdapter() {

        // Create an alert to publish
        Alert alert = Alert.Factory.newInstance();
        alert.setIdentifier(alertIdentifier);
        alert.setSender(alertSender);
        alert.setSent(alertSent);
        alert.setMsgType(Alert.MsgType.ALERT);
        alert.setStatus(Alert.Status.ACTUAL);
        alert.setScope(Alert.Scope.PUBLIC);
        Info info = alert.addNewInfo();
        Alert.Info.Category.Enum categoryArray[] = new Alert.Info.Category.Enum[1];
        categoryArray[0] = Alert.Info.Category.CBRNE;
        info.setCategoryArray(categoryArray);
        info.setEvent(alertEvent);
        EventCode event = info.addNewEventCode();
        event.setValue("value");
        event.setValueName("name");
        info.setSeverity(Alert.Info.Severity.MODERATE);
        info.setCertainty(Alert.Info.Certainty.LIKELY);
        info.setHeadline(alertHeadline);
        info.setUrgency(Alert.Info.Urgency.EXPECTED);

        return alert;
    }

    @Test
    public void testGetAlert() throws XmlException, IOException {

        Alert alert = createAlertAdapter();
        ProductPublicationStatus status = alertService.createAlert(null, alert);

        WorkProduct wp = alertService.getAlert(status.getProduct().getProductID());
        AlertDocument alertDoc = (AlertDocument) wp.getProduct();
        assertNotNull(alert);
        assertNotNull(alertDoc.getAlert());
        assertTrue(alertDoc.getAlert().getIdentifier().equals(alert.getIdentifier()));
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
}
