/*
 * An XML document type.
 * Localname: NotificationMessage
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.NotificationMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one NotificationMessage(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class NotificationMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.NotificationMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotificationMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFICATIONMESSAGE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "NotificationMessage");
    
    
    /**
     * Gets the "NotificationMessage" element
     */
    public org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType getNotificationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType)get_store().find_element_user(NOTIFICATIONMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NotificationMessage" element
     */
    public void setNotificationMessage(org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType notificationMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType)get_store().find_element_user(NOTIFICATIONMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType)get_store().add_element_user(NOTIFICATIONMESSAGE$0);
            }
            target.set(notificationMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "NotificationMessage" element
     */
    public org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType addNewNotificationMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType)get_store().add_element_user(NOTIFICATIONMESSAGE$0);
            return target;
        }
    }
}
