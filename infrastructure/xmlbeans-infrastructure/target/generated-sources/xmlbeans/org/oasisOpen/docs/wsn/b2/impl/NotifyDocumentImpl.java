/*
 * An XML document type.
 * Localname: Notify
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.NotifyDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one Notify(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class NotifyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.NotifyDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotifyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFY$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "Notify");
    
    
    /**
     * Gets the "Notify" element
     */
    public org.oasisOpen.docs.wsn.b2.NotifyDocument.Notify getNotify()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotifyDocument.Notify target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotifyDocument.Notify)get_store().find_element_user(NOTIFY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Notify" element
     */
    public void setNotify(org.oasisOpen.docs.wsn.b2.NotifyDocument.Notify notify)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotifyDocument.Notify target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotifyDocument.Notify)get_store().find_element_user(NOTIFY$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.NotifyDocument.Notify)get_store().add_element_user(NOTIFY$0);
            }
            target.set(notify);
        }
    }
    
    /**
     * Appends and returns a new empty "Notify" element
     */
    public org.oasisOpen.docs.wsn.b2.NotifyDocument.Notify addNewNotify()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotifyDocument.Notify target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotifyDocument.Notify)get_store().add_element_user(NOTIFY$0);
            return target;
        }
    }
    /**
     * An XML Notify(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class NotifyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.NotifyDocument.Notify
    {
        private static final long serialVersionUID = 1L;
        
        public NotifyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NOTIFICATIONMESSAGE$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "NotificationMessage");
        
        
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
