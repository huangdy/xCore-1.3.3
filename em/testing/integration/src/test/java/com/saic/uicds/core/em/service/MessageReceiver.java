package com.saic.uicds.core.em.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.saic.uicds.core.em.messages.IncidentStateNotificationMessage;
import com.saic.uicds.core.infrastructure.messages.ProductChangeNotificationMessage;

//import org.springframework.integration.annotation.Subscriber;
//import org.springframework.stereotype.Component;

//@Component

public class MessageReceiver {

    Logger log = LoggerFactory.getLogger(MessageReceiver.class);

    public boolean gotIt = false;

    public String name;

    public void setName(String n) {

        name = n;
    }

    private int gotIncidentStateChange = 0;
    private int gotIncidentWPCount = 0;
    private int gotAlertWPCount = 0;
    private int gotMapWPCount = 0;
    private int gotICSWPCount = 0;

    public int getGotIncidentWPCount() {

        return gotIncidentWPCount;
    }

    public void setGotIncidentWPCount(int gotIncidentWPCount) {

        this.gotIncidentWPCount = gotIncidentWPCount;
    }

    public int getGotAlertWPCount() {

        return gotAlertWPCount;
    }

    public void setGotAlertWPCount(int gotAlertWPCount) {

        this.gotAlertWPCount = gotAlertWPCount;
    }

    public int getGotMapWPCount() {

        return gotMapWPCount;
    }

    public void setGotMapWPCount(int gotMapWPCount) {

        this.gotMapWPCount = gotMapWPCount;
    }

    public int getGotICSWPCount() {

        return gotICSWPCount;
    }

    public void setGotICSWPCount(int gotICSWPCount) {

        this.gotICSWPCount = gotICSWPCount;
    }

    public int getGotIncidentStateChange() {

        return gotIncidentStateChange;
    }

    public void setGotIncidentStateChange(int gotIncidentStateChange) {

        this.gotIncidentStateChange = gotIncidentStateChange;
    }

    // @Subscriber(channel="incidentStateChannel")
    public void handleProductChange(ProductChangeNotificationMessage notification) {

        if (log.isDebugEnabled()) {
            log.debug(name + " GOT IT: " + notification.getProductID());
        }
        gotIt = true;
    }

    public void handleIncidentState(IncidentStateNotificationMessage notification) {

        if (log.isDebugEnabled()) {
            log.debug(name
                + " GOT IT: "
                + notification.getIncidentInfo().getWorkProductIdentification().getIdentifier().getStringValue());
        }
        gotIt = true;
        gotIncidentStateChange++;
    }

}
