package com.saic.uicds.core.em.scenarios;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

import x1.oasisNamesTcEmergencyCap1.AlertDocument;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info;
import x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert.Info.EventCode;

import com.saic.uicds.core.infrastructure.service.impl.ProductPublicationStatus;

public class ScenarioA extends Scenario {

    ProductPublicationStatus alertStatus;
    ProductPublicationStatus incidentStatus;

    protected String createIncidentFromAlert() throws Exception {

        String alertEvent = "a test alert event";
        String alertHeadline = "a test alert headline";
        String alertIdentifier = "identifier";
        String alertSender = "sender";
        String alertAddress = "Mile marker 138";
        Calendar alertSent = new GregorianCalendar();

        AlertDocument alertDoc = AlertDocument.Factory.newInstance();
        // Create an alert to publish
        Alert alert = alertDoc.addNewAlert();
        alert.setIdentifier(alertIdentifier);
        alert.setSender(alertSender);
        alert.setSent(alertSent);
        alert.setMsgType(Alert.MsgType.ALERT);
        alert.setStatus(Alert.Status.ACTUAL);
        alert.setScope(Alert.Scope.PUBLIC);
        alert.setAddresses(alertAddress);
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

        ProductPublicationStatus status = createIncident(alertDoc);
        return status.getProduct().getFirstAssociatedInterestGroupID();
    }

    public ProductPublicationStatus getAlertStatus() {
        return alertStatus;
    }

    public ProductPublicationStatus getIncidentStatus() {
        return incidentStatus;
    }

    public void initialize() throws Exception {
        incidentStatus = createIncident(new File("src/test/resources/scenarios/A/Incident.xml"));
        assert ("Success".equals(incidentStatus));
        alertStatus = createAlert(
            incidentStatus.getProduct().getAssociatedInterestGroupIDs().iterator().next(),
            new File("src/test/resources/scenarios/A/Alert.xml"));
        assert ("Success".equals(alertStatus));
    }

}
