package com.saic.uicds.testWS.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.saic.uicds.testWS.service.NotificationService;

public class NotificationServiceImpl implements NotificationService {

    Logger log = LoggerFactory.getLogger(NotificationServiceImpl.class);

    private Map<String, List<NotificationMessageHolderType>> mapNotifications = new HashMap<String, List<NotificationMessageHolderType>>();

    /*
     * (non-Javadoc)
     * 
     * @see com.saic.dctd.uicds.core.service.PullPoint#getMessages(int)
     */
    public synchronized NotificationMessageHolderType[] getMessages(String entityID, int num) {
        NotificationMessageHolderType[] response = null;

        // if messages exist for the entityID
        if (mapNotifications.containsKey(entityID)) {
            List<NotificationMessageHolderType> messages = mapNotifications.get(entityID);

            response = new NotificationMessageHolderType[messages.size()];
            response = messages.toArray(response);
        } else {
            log.error(entityID + " not found in subscription map");
        }

        log.debug("getMessages called");

        return response;
    }

    public void notify(String entityID, NotificationMessageHolderType[] notifications) {
        // find Notification for desired entityID
        log.debug("Notify entityID: " + entityID);

        // Notification notification = notificationDAO.findByEntityId(entityID);
        // if (notification != null) {

        log.debug("notifications to add: " + notifications.length);
        // // for each notify message add it to the list of notification messages
        for (NotificationMessageHolderType notf : notifications) {
            NotificationMessageHolderType.Message msg = notf.getMessage();
            if (msg != null) {
                // if map does not contain list of msgs for entityID, create new one
                if (!mapNotifications.containsKey(entityID)) {
                    ArrayList<NotificationMessageHolderType> list = new ArrayList<NotificationMessageHolderType>();
                    list.add(notf);
                    mapNotifications.put(entityID, list);
                } else {
                    // find msgs for entityID and append new msg to it
                    mapNotifications.get(entityID).add(notf);
                }
            }
        }
    }
}
