/*
 * An XML document type.
 * Localname: NotificationResultsInfo
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.NotificationResultsInfoDocument
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification.impl;
/**
 * A document containing one NotificationResultsInfo(@http://www.sendwordnow.com/notification) element.
 *
 * This is a complex type.
 */
public class NotificationResultsInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.NotificationResultsInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotificationResultsInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFICATIONRESULTSINFO$0 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "NotificationResultsInfo");
    
    
    /**
     * Gets the "NotificationResultsInfo" element
     */
    public com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo getNotificationResultsInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo)get_store().find_element_user(NOTIFICATIONRESULTSINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NotificationResultsInfo" element
     */
    public void setNotificationResultsInfo(com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo notificationResultsInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo)get_store().find_element_user(NOTIFICATIONRESULTSINFO$0, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo)get_store().add_element_user(NOTIFICATIONRESULTSINFO$0);
            }
            target.set(notificationResultsInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "NotificationResultsInfo" element
     */
    public com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo addNewNotificationResultsInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo)get_store().add_element_user(NOTIFICATIONRESULTSINFO$0);
            return target;
        }
    }
    /**
     * An XML NotificationResultsInfo(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public static class NotificationResultsInfoImpl extends com.sendwordnow.notification.impl.NotificationResultsInfoBaseImpl implements com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo
    {
        private static final long serialVersionUID = 1L;
        
        public NotificationResultsInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RCPTSSTATUS$0 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "rcptsStatus");
        
        
        /**
         * Gets the "rcptsStatus" element
         */
        public com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus getRcptsStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus target = null;
                target = (com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus)get_store().find_element_user(RCPTSSTATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "rcptsStatus" element
         */
        public void setRcptsStatus(com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus rcptsStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus target = null;
                target = (com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus)get_store().find_element_user(RCPTSSTATUS$0, 0);
                if (target == null)
                {
                    target = (com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus)get_store().add_element_user(RCPTSSTATUS$0);
                }
                target.set(rcptsStatus);
            }
        }
        
        /**
         * Appends and returns a new empty "rcptsStatus" element
         */
        public com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus addNewRcptsStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus target = null;
                target = (com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus)get_store().add_element_user(RCPTSSTATUS$0);
                return target;
            }
        }
        /**
         * An XML rcptsStatus(@http://www.sendwordnow.com/notification).
         *
         * This is a complex type.
         */
        public static class RcptsStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.NotificationResultsInfoDocument.NotificationResultsInfo.RcptsStatus
        {
            private static final long serialVersionUID = 1L;
            
            public RcptsStatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RCPTSTATUS$0 = 
                new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "rcptStatus");
            
            
            /**
             * Gets array of all "rcptStatus" elements
             */
            public com.sendwordnow.notification.RcptStatus[] getRcptStatusArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RCPTSTATUS$0, targetList);
                    com.sendwordnow.notification.RcptStatus[] result = new com.sendwordnow.notification.RcptStatus[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "rcptStatus" element
             */
            public com.sendwordnow.notification.RcptStatus getRcptStatusArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.RcptStatus target = null;
                    target = (com.sendwordnow.notification.RcptStatus)get_store().find_element_user(RCPTSTATUS$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "rcptStatus" element
             */
            public int sizeOfRcptStatusArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RCPTSTATUS$0);
                }
            }
            
            /**
             * Sets array of all "rcptStatus" element
             */
            public void setRcptStatusArray(com.sendwordnow.notification.RcptStatus[] rcptStatusArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(rcptStatusArray, RCPTSTATUS$0);
                }
            }
            
            /**
             * Sets ith "rcptStatus" element
             */
            public void setRcptStatusArray(int i, com.sendwordnow.notification.RcptStatus rcptStatus)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.RcptStatus target = null;
                    target = (com.sendwordnow.notification.RcptStatus)get_store().find_element_user(RCPTSTATUS$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(rcptStatus);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "rcptStatus" element
             */
            public com.sendwordnow.notification.RcptStatus insertNewRcptStatus(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.RcptStatus target = null;
                    target = (com.sendwordnow.notification.RcptStatus)get_store().insert_element_user(RCPTSTATUS$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "rcptStatus" element
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
            
            /**
             * Removes the ith "rcptStatus" element
             */
            public void removeRcptStatus(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RCPTSTATUS$0, i);
                }
            }
        }
    }
}
