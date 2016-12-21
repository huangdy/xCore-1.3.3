package com.saic.uicds.core.em.integration;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.XmlCursor;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import x1.oasisNamesTcEmergencyCap1.AlertDocument;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode;

import com.saic.uicds.core.em.service.impl.AlertServiceImpl;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

public class CreateAlertTest
    extends AbstractXmldbJpaTests {

    Logger log = LoggerFactory.getLogger(CreateAlertTest.class);

    private static final String GEORSS_NS = "http://www.georss.org/georss";
    private static final String GML_NS = "http://www.opengis.net/gml";
    private String alertEvent = "a test alert event";
    private String alertHeadline = "a test alert headline";
    private String alertIdentifier = "UICDS-Client-1";
    private String alertAddress = "Mile marker 138";

    private static String personFullName = "Incident Commander";
    private static String coreName = "core1.saic.com";
    private static String personEntity = "IncidentCommander";
    private static String personEntityID = personEntity + "@" + coreName;

    private Calendar alertSent = new GregorianCalendar();

    AlertServiceImpl alertService;

    public AlertServiceImpl getAlertService() {

        return alertService;
    }

    public void setAlertService(AlertServiceImpl alertService) {

        this.alertService = alertService;
    }

    @Test
    public void testInit() {

        assertNotNull(alertService);
    }

    @Test
    public void testCreateAlertAdapter() {

        AlertDocument alertDoc = AlertDocument.Factory.newInstance();
        XmlCursor xc = alertDoc.newCursor();
        xc.toNextToken();
        xc.insertNamespace("georss", GEORSS_NS);
        xc.insertNamespace("gml", GML_NS);
        xc.dispose();

        Alert alert = alertDoc.addNewAlert();
        alert.setIdentifier(alertIdentifier);
        alert.setSender(personEntityID);
        alert.setSent(alertSent);
        alert.setMsgType(Alert.MsgType.ALERT);
        alert.setStatus(Alert.Status.ACTUAL);
        alert.setScope(Alert.Scope.PUBLIC);
        alert.setAddresses(alertAddress);
        Info info = alert.addNewInfo();
        info.setSenderName(personFullName);
        Alert.Info.Category.Enum categoryArray[] = new Alert.Info.Category.Enum[1];
        categoryArray[0] = Alert.Info.Category.TRANSPORT;
        info.setCategoryArray(categoryArray);
        info.setEvent(alertEvent);
        EventCode event = info.addNewEventCode();
        event.setValue("value");
        event.setValueName("name");
        info.setSeverity(Alert.Info.Severity.MODERATE);
        info.setCertainty(Alert.Info.Certainty.OBSERVED);
        info.setHeadline(alertHeadline);
        info.setUrgency(Alert.Info.Urgency.EXPECTED);
        XmlCursor ac = info.addNewArea().newCursor();
        QName whereQName = new QName(GEORSS_NS, "where");
        ac.beginElement(whereQName);
        QName pointQName = new QName(GML_NS, "Point");
        ac.beginElement(pointQName);
        QName aq = new QName(GML_NS, "coordinates");
        ac.insertElementWithText(aq, "-77.193577, 38.9555590");
        ac.dispose();

        logger.debug("alert=\n\n[" + alertDoc + "]\n\n");

        try {
            alertService.createAlert(null, alert);
        } catch (Throwable exception) {
            exception.printStackTrace();
            fail("Caught an unexpected exception");
        }

        WorkProduct product = alertService.getAlertByAlertId(alertIdentifier);

        // System.out.println(product.getProduct().toString());
        Alert retAlert = null;
        try {
            AlertDocument alertDocument = (AlertDocument) product.getProduct();
            retAlert = alertDocument.getAlert();
        } catch (Throwable exception) {
            exception.printStackTrace();
            fail("Caught an unexpected exception");
        }
        logger.debug("retAlert=\n\n[" + retAlert + "]\n\n");

        assertTrue(alertDoc.getAlert().valueEquals(retAlert));
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
}
