/*
 * An XML document type.
 * Localname: NotifyRequest
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.NotifyRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService.impl;
/**
 * A document containing one NotifyRequest(@http://uicds.org/NotificationService) element.
 *
 * This is a complex type.
 */
public class NotifyRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.NotifyRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotifyRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFYREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/NotificationService", "NotifyRequest");
    
    
    /**
     * Gets the "NotifyRequest" element
     */
    public org.uicds.notificationService.NotifyRequestDocument.NotifyRequest getNotifyRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.NotifyRequestDocument.NotifyRequest target = null;
            target = (org.uicds.notificationService.NotifyRequestDocument.NotifyRequest)get_store().find_element_user(NOTIFYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NotifyRequest" element
     */
    public void setNotifyRequest(org.uicds.notificationService.NotifyRequestDocument.NotifyRequest notifyRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.NotifyRequestDocument.NotifyRequest target = null;
            target = (org.uicds.notificationService.NotifyRequestDocument.NotifyRequest)get_store().find_element_user(NOTIFYREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.notificationService.NotifyRequestDocument.NotifyRequest)get_store().add_element_user(NOTIFYREQUEST$0);
            }
            target.set(notifyRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "NotifyRequest" element
     */
    public org.uicds.notificationService.NotifyRequestDocument.NotifyRequest addNewNotifyRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.NotifyRequestDocument.NotifyRequest target = null;
            target = (org.uicds.notificationService.NotifyRequestDocument.NotifyRequest)get_store().add_element_user(NOTIFYREQUEST$0);
            return target;
        }
    }
    /**
     * An XML NotifyRequest(@http://uicds.org/NotificationService).
     *
     * This is a complex type.
     */
    public static class NotifyRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.NotifyRequestDocument.NotifyRequest
    {
        private static final long serialVersionUID = 1L;
        
        public NotifyRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOTIFICATIONMESSAGE$0 = 
            new javax.xml.namespace.QName("http://uicds.org/NotificationService", "NotificationMessage");
        
        
        /**
         * Gets array of all "NotificationMessage" elements
         */
        public org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType[] getNotificationMessageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(NOTIFICATIONMESSAGE$0, targetList);
                org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType[] result = new org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "NotificationMessage" element
         */
        public org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType getNotificationMessageArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType target = null;
                target = (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType)get_store().find_element_user(NOTIFICATIONMESSAGE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "NotificationMessage" element
         */
        public int sizeOfNotificationMessageArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NOTIFICATIONMESSAGE$0);
            }
        }
        
        /**
         * Sets array of all "NotificationMessage" element
         */
        public void setNotificationMessageArray(org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType[] notificationMessageArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(notificationMessageArray, NOTIFICATIONMESSAGE$0);
            }
        }
        
        /**
         * Sets ith "NotificationMessage" element
         */
        public void setNotificationMessageArray(int i, org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType notificationMessage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType target = null;
                target = (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType)get_store().find_element_user(NOTIFICATIONMESSAGE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(notificationMessage);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "NotificationMessage" element
         */
        public org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType insertNewNotificationMessage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType target = null;
                target = (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType)get_store().insert_element_user(NOTIFICATIONMESSAGE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "NotificationMessage" element
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
        
        /**
         * Removes the ith "NotificationMessage" element
         */
        public void removeNotificationMessage(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NOTIFICATIONMESSAGE$0, i);
            }
        }
    }
}
