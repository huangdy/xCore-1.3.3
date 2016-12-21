package com.saic.uicds.testWS.service;

import org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType;

/**
 * The UICDS system Notification Service provides a WS-Notification (WSN) compliant service
 * interface to provide pull based notifications to UICDS Notification Consumers (UICDS clients).
 * The UICDS Clients may receive notification for the following events:
 * 
 * @author Nathan Lewnes
 * @ssdd
 */
public interface NotificationService {

    public static final String NOTIFICATION_SERVICE_NAME = "NotificationService";

    /**
     * Send a directed notify message to a desired client with the specified array of notifications
     * 
     * @param entityID is the name of the client you want to notify
     * @param notifications to be delivered to endpoint when notified
     */
    public void notify(String entityID, NotificationMessageHolderType[] notifications);// throws

    public NotificationMessageHolderType[] getMessages(String entityID, int num);

}
