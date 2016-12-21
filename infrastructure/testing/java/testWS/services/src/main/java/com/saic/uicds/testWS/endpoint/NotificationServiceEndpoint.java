package com.saic.uicds.testWS.endpoint;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.uicds.notificationService.GetMessagesRequestDocument;
import org.uicds.notificationService.GetMessagesResponseDocument;
import org.uicds.notificationService.NotifyRequestDocument;

import com.saic.uicds.testWS.service.NotificationService;

/**
 * 
 * @author Nathan Lewnes
 * @see <a href="wsdl/NotificationService.wsdl">Appendix: NotificationService.wsdl
 * @idd
 */
@Endpoint
public class NotificationServiceEndpoint {

    @Autowired
    NotificationService notificationService;

    public void setNotificationService(NotificationService p) {
        notificationService = p;
    }

    Logger log = LoggerFactory.getLogger(NotificationServiceEndpoint.class);

    /**
     * Retrieve queued notifications from an entity.
     * 
     * @param GetMessagesRequestDocument
     * @see GetMessagesRequestDocument
     * 
     * @return GetMessagesResponseDocument
     * @see GetMessagesResponseDocument
     * @idd
     */
    @PayloadRoot(namespace = "http://uicds.org/NotificationService", localPart = "GetMessagesRequest")
    public GetMessagesResponseDocument GetMessages(GetMessagesRequestDocument request) {
        if (log.isDebugEnabled()) {
            log.debug("GetMessages: " + request);
        }

        GetMessagesResponseDocument response = GetMessagesResponseDocument.Factory.newInstance();
        response.addNewGetMessagesResponse();

        // get the entity id from the to element
        XmlObject[] to = request.getGetMessagesRequest().selectChildren(
                "http://www.w3.org/2005/08/addressing", "To");
        if (to.length > 0) {
            // log.debug("found "+to[0].toString());
            XmlCursor cursor = to[0].newCursor();
            // log.debug("token type: "+cursor.currentTokenType());
            String entityID = "";
            while (cursor.currentTokenType() != XmlCursor.TokenType.ENDDOC) {
                // log.debug("token type: "+cursor.currentTokenType());
                if (cursor.currentTokenType() == XmlCursor.TokenType.TEXT) {
                    // log.debug("chars: "+cursor.getChars());
                    entityID = cursor.getChars().substring(cursor.getChars().lastIndexOf("/") + 1);
                    break;
                }
                cursor.toNextToken();
            }
            cursor.dispose();

            NotificationMessageHolderType[] notificationMessageArray = notificationService
                    .getMessages(entityID, 1);
            if (notificationMessageArray != null && notificationMessageArray.length > 0) {
                response.getGetMessagesResponse().setNotificationMessageArray(
                        notificationMessageArray);
            }
        }

        return response;
    }

    /**
     * Notify an entity with notification messages
     * 
     * @param NotifyRequestDocument
     * @see NotifyRequestDocument
     * 
     * @idd
     */
    @PayloadRoot(namespace = "http://uicds.org/NotificationService", localPart = "NotifyRequest")
    public void Notify(NotifyRequestDocument request) {
        log.debug("Notify: ");

        // NotifyRequestDocument response = NotifyRequestDocument.Factory.newInstance();
        // response.addNewNotifyRequest();

        // get the entity id from the to element
        XmlObject[] to = request.getNotifyRequest().selectChildren(
                "http://www.w3.org/2005/08/addressing", "To");
        if (to.length > 0) {
            // log.debug("found "+to[0].toString());
            XmlCursor cursor = to[0].newCursor();
            // log.debug("token type: "+cursor.currentTokenType());
            String entityID = "";
            while (cursor.currentTokenType() != XmlCursor.TokenType.ENDDOC) {
                // log.debug("token type: "+cursor.currentTokenType());
                if (cursor.currentTokenType() == XmlCursor.TokenType.TEXT) {
                    // log.debug("chars: "+cursor.getChars());
                    entityID = cursor.getChars().substring(cursor.getChars().lastIndexOf("/") + 1);
                    break;
                }
                cursor.toNextToken();
            }
            cursor.dispose();

            NotificationMessageHolderType[] msgArray = request.getNotifyRequest()
                    .getNotificationMessageArray();
            log.debug("msgArray size: " + msgArray.length);

            // send notification messages to entityID
            notificationService.notify(entityID, msgArray);
        }

    }

}
