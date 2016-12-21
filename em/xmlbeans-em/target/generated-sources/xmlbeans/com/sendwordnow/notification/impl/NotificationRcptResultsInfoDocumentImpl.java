/*
 * An XML document type.
 * Localname: NotificationRcptResultsInfo
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.NotificationRcptResultsInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification.impl;
/**
 * A document containing one NotificationRcptResultsInfo(@http://www.sendwordnow.com/notification) element.
 *
 * This is a complex type.
 */
public class NotificationRcptResultsInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.NotificationRcptResultsInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotificationRcptResultsInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFICATIONRCPTRESULTSINFO$0 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "NotificationRcptResultsInfo");
    
    
    /**
     * Gets the "NotificationRcptResultsInfo" element
     */
    public com.sendwordnow.notification.NotificationRcptResultsInfoDocument.NotificationRcptResultsInfo getNotificationRcptResultsInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationRcptResultsInfoDocument.NotificationRcptResultsInfo target = null;
            target = (com.sendwordnow.notification.NotificationRcptResultsInfoDocument.NotificationRcptResultsInfo)get_store().find_element_user(NOTIFICATIONRCPTRESULTSINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NotificationRcptResultsInfo" element
     */
    public void setNotificationRcptResultsInfo(com.sendwordnow.notification.NotificationRcptResultsInfoDocument.NotificationRcptResultsInfo notificationRcptResultsInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationRcptResultsInfoDocument.NotificationRcptResultsInfo target = null;
            target = (com.sendwordnow.notification.NotificationRcptResultsInfoDocument.NotificationRcptResultsInfo)get_store().find_element_user(NOTIFICATIONRCPTRESULTSINFO$0, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.NotificationRcptResultsInfoDocument.NotificationRcptResultsInfo)get_store().add_element_user(NOTIFICATIONRCPTRESULTSINFO$0);
            }
            target.set(notificationRcptResultsInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "NotificationRcptResultsInfo" element
     */
    public com.sendwordnow.notification.NotificationRcptResultsInfoDocument.NotificationRcptResultsInfo addNewNotificationRcptResultsInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationRcptResultsInfoDocument.NotificationRcptResultsInfo target = null;
            target = (com.sendwordnow.notification.NotificationRcptResultsInfoDocument.NotificationRcptResultsInfo)get_store().add_element_user(NOTIFICATIONRCPTRESULTSINFO$0);
            return target;
        }
    }
    /**
     * An XML NotificationRcptResultsInfo(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public static class NotificationRcptResultsInfoImpl extends com.sendwordnow.notification.impl.NotificationResultsInfoBaseImpl implements com.sendwordnow.notification.NotificationRcptResultsInfoDocument.NotificationRcptResultsInfo
    {
        private static final long serialVersionUID = 1L;
        
        public NotificationRcptResultsInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RCPTSTATUS$0 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "rcptStatus");
        
        
        /**
         * Gets the "rcptStatus" element
         */
        public com.sendwordnow.notification.RcptStatus getRcptStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.RcptStatus target = null;
                target = (com.sendwordnow.notification.RcptStatus)get_store().find_element_user(RCPTSTATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "rcptStatus" element
         */
        public void setRcptStatus(com.sendwordnow.notification.RcptStatus rcptStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.RcptStatus target = null;
                target = (com.sendwordnow.notification.RcptStatus)get_store().find_element_user(RCPTSTATUS$0, 0);
                if (target == null)
                {
                    target = (com.sendwordnow.notification.RcptStatus)get_store().add_element_user(RCPTSTATUS$0);
                }
                target.set(rcptStatus);
            }
        }
        
        /**
         * Appends and returns a new empty "rcptStatus" element
         */
        public com.sendwordnow.notification.RcptStatus addNewRcptStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.RcptStatus target = null;
                target = (com.sendwordnow.notification.RcptStatus)get_store().add_element_user(RCPTSTATUS$0);
                return target;
            }
        }
    }
}
