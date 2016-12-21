package com.saic.uicds.core.em.integration;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.namespace.QName;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uicds.incident.IncidentDocument;

import x1.oasisNamesTcEmergencyCap1.AlertDocument;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode;

import com.saic.uicds.core.em.service.impl.IncidentManagementServiceImpl;
import com.saic.uicds.core.infrastructure.model.WorkProduct;
import com.saic.uicds.core.infrastructure.service.WorkProductService;
import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;
import com.saic.uicds.core.infrastructure.test.util.AbstractXmldbJpaTests;

public class CreateIncidentFromCAPTest
    extends AbstractXmldbJpaTests {
    Logger log = LoggerFactory.getLogger(CreateIncidentFromCAPTest.class);

    private static final String GEORSS_NS = "http://www.georss.org/georss";
    private static final String GML_NS = "http://www.opengis.net/gml";
    private String alertEvent = "a test alert event";
    private String alertHeadline = "a test alert headline";
    private String alertIdentifier = "UICDS-Client-1";
    private String alertAddress = "Mile marker 138";
    private String alertDescription = "Test CAP Alert";

    private static String personFullName = "Incident Commander";
    private static String coreName = "core1.saic.com";
    private static String personEntity = "IncidentCommander";
    private static String personEntityID = personEntity + "@" + coreName;

    private Calendar alertSent = new GregorianCalendar();

    IncidentManagementServiceImpl incidentManagementService;

    WorkProductService workProductService;

    public WorkProductService getWorkProductService() {

        return workProductService;
    }

    public void setWorkProductService(WorkProductService workProductService) {

        this.workProductService = workProductService;
    }

    public IncidentManagementServiceImpl getIncidentManagementService() {

        return incidentManagementService;
    }

    public void setIncidentManagementService(IncidentManagementServiceImpl incidentManagementService) {

        this.incidentManagementService = incidentManagementService;
    }

    @Test
    public void testInit() {

        assertNotNull(incidentManagementService);
    }

    @Test
    public void testCreateIncidentFromCAP() throws XmlException, IOException {

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
        info.setDescription(alertDescription);
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

        ProductPublicationStatus status = incidentManagementService.createIncidentFromCap(alert);

        WorkProduct wp = workProductService.getProduct(status.getProduct().getProductID());
        IncidentDocument incident = (IncidentDocument) wp.getProduct();

        assertFalse(incident.isNil());
        logger.debug("Incident:\n\n[" + incident + "]\n\n");

        Pattern pattern = Pattern.compile("<[a-z0-9]+:ActivityName>" + alertEvent
            + "</[a-z0-9]+:ActivityName>");
        Matcher matcher = pattern.matcher(incident.toString());
        assertTrue(matcher.find());

        pattern = Pattern.compile("<[a-z0-9]+:ActivityCategoryText>Transport</[a-z0-9]+:ActivityCategoryText>");
        matcher = pattern.matcher(incident.toString());
        assertTrue(matcher.find());

        pattern = Pattern.compile("<[a-z0-9]+:AddressFullText>" + alertAddress
            + "</[a-z0-9]+:AddressFullText>");
        matcher = pattern.matcher(incident.toString());
        assertTrue(matcher.find());
    }

    @Override
    protected String[] getConfigLocations() {

        return new String[] {
            "classpath:contexts/applicationContext-infra.xml",
            "classpath:contexts/applicationContext-em.xml",
            "classpath:contexts/test-dataSrcContext.xml" };
    }
}
