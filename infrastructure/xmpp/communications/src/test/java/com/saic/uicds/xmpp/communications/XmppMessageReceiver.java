package com.saic.uicds.xmpp.communications;

import com.saic.uicds.core.infrastructure.messages.CoreRosterMessage;
import com.saic.uicds.core.infrastructure.messages.CoreStatusUpdateMessage;
import com.saic.uicds.core.infrastructure.messages.PublishProductMessage;

public class XmppMessageReceiver {
    private int getInterestGroupDocumentRequestMessagesReceived;

    public int getGetInterestGroupDocumentRequestMessagesReceived() {
        return getInterestGroupDocumentRequestMessagesReceived;
    }

    public void setGetInterestGroupDocumentRequestMessagesReceived(
        int getInterestGroupDocumentRequestMessagesReceived) {
        this.getInterestGroupDocumentRequestMessagesReceived = getInterestGroupDocumentRequestMessagesReceived;
    }

    private int getProductRequestMessagesReceived;

    public int getGetProductRequestMessagesReceived() {
        return getProductRequestMessagesReceived;
    }

    public void setGetProductRequestMessagesReceived(int getProductRequestMessagesReceived) {
        this.getProductRequestMessagesReceived = getProductRequestMessagesReceived;
    }

    private int CoreRosterMessagesReceived;

    public int getCoreRosterMessagesReceived() {
        return CoreRosterMessagesReceived;
    }

    public void setCoreRosterMessagesReceived(int coreRosterMessagesReceived) {
        CoreRosterMessagesReceived = coreRosterMessagesReceived;
    }

    private int CoreStatusUpdateMessagesReceived;

    public int getCoreStatusUpdateMessagesReceived() {
        return CoreStatusUpdateMessagesReceived;
    }

    public void setCoreStatusUpdateMessagesReceived(int coreStatusUpdateMessagesReceived) {
        CoreStatusUpdateMessagesReceived = coreStatusUpdateMessagesReceived;
    }

    private int publishProductMessagesReceived;

    public int getPublishProductMessagesReceived() {
        return publishProductMessagesReceived;
    }

    public void setPublishProductMessagesReceived(int publishProductMessagesReceived) {
        this.publishProductMessagesReceived = publishProductMessagesReceived;
    }

    public XmppMessageReceiver() {
        clear();
    }

    public void clear() {
        setGetInterestGroupDocumentRequestMessagesReceived(0);
        setGetProductRequestMessagesReceived(0);
        setCoreRosterMessagesReceived(0);
        setCoreStatusUpdateMessagesReceived(0);
        setPublishProductMessagesReceived(0);
    }

    public void coreRosterHandler(CoreRosterMessage message) {
        setCoreRosterMessagesReceived(this.CoreRosterMessagesReceived + 1);
    }

    public void coreStatusUpdateHandler(CoreStatusUpdateMessage message) {
        setCoreStatusUpdateMessagesReceived(this.CoreStatusUpdateMessagesReceived + 1);
    }

    public void publishProductHandler(PublishProductMessage msg) {
        setPublishProductMessagesReceived(this.publishProductMessagesReceived + 1);
    }
}
