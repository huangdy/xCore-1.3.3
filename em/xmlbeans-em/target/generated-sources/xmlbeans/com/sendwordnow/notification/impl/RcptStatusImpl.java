/*
 * XML Type:  RcptStatus
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.RcptStatus
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification.impl;
/**
 * An XML RcptStatus(@http://www.sendwordnow.com/notification).
 *
 * This is a complex type.
 */
public class RcptStatusImpl extends com.sendwordnow.notification.impl.RcptInfoBaseImpl implements com.sendwordnow.notification.RcptStatus
{
    private static final long serialVersionUID = 1L;
    
    public RcptStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTPNTSSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "contactPntsStatus");
    private static final javax.xml.namespace.QName GWBRESPINDEX$2 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "gwbRespIndex");
    
    
    /**
     * Gets the "contactPntsStatus" element
     */
    public com.sendwordnow.notification.RcptStatus.ContactPntsStatus getContactPntsStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.RcptStatus.ContactPntsStatus target = null;
            target = (com.sendwordnow.notification.RcptStatus.ContactPntsStatus)get_store().find_element_user(CONTACTPNTSSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contactPntsStatus" element
     */
    public void setContactPntsStatus(com.sendwordnow.notification.RcptStatus.ContactPntsStatus contactPntsStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.RcptStatus.ContactPntsStatus target = null;
            target = (com.sendwordnow.notification.RcptStatus.ContactPntsStatus)get_store().find_element_user(CONTACTPNTSSTATUS$0, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.RcptStatus.ContactPntsStatus)get_store().add_element_user(CONTACTPNTSSTATUS$0);
            }
            target.set(contactPntsStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "contactPntsStatus" element
     */
    public com.sendwordnow.notification.RcptStatus.ContactPntsStatus addNewContactPntsStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.RcptStatus.ContactPntsStatus target = null;
            target = (com.sendwordnow.notification.RcptStatus.ContactPntsStatus)get_store().add_element_user(CONTACTPNTSSTATUS$0);
            return target;
        }
    }
    
    /**
     * Gets the "gwbRespIndex" element
     */
    public java.math.BigInteger getGwbRespIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GWBRESPINDEX$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "gwbRespIndex" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetGwbRespIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(GWBRESPINDEX$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "gwbRespIndex" element
     */
    public void setGwbRespIndex(java.math.BigInteger gwbRespIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GWBRESPINDEX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GWBRESPINDEX$2);
            }
            target.setBigIntegerValue(gwbRespIndex);
        }
    }
    
    /**
     * Sets (as xml) the "gwbRespIndex" element
     */
    public void xsetGwbRespIndex(org.apache.xmlbeans.XmlNonNegativeInteger gwbRespIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(GWBRESPINDEX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(GWBRESPINDEX$2);
            }
            target.set(gwbRespIndex);
        }
    }
    /**
     * An XML contactPntsStatus(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public static class ContactPntsStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.RcptStatus.ContactPntsStatus
    {
        private static final long serialVersionUID = 1L;
        
        public ContactPntsStatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTACTPNTSTATUS$0 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "contactPntStatus");
        
        
        /**
         * Gets array of all "contactPntStatus" elements
         */
        public com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus[] getContactPntStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTACTPNTSTATUS$0, targetList);
                com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus[] result = new com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "contactPntStatus" element
         */
        public com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus getContactPntStatusArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus target = null;
                target = (com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus)get_store().find_element_user(CONTACTPNTSTATUS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "contactPntStatus" element
         */
        public int sizeOfContactPntStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTACTPNTSTATUS$0);
            }
        }
        
        /**
         * Sets array of all "contactPntStatus" element
         */
        public void setContactPntStatusArray(com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus[] contactPntStatusArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contactPntStatusArray, CONTACTPNTSTATUS$0);
            }
        }
        
        /**
         * Sets ith "contactPntStatus" element
         */
        public void setContactPntStatusArray(int i, com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus contactPntStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus target = null;
                target = (com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus)get_store().find_element_user(CONTACTPNTSTATUS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(contactPntStatus);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "contactPntStatus" element
         */
        public com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus insertNewContactPntStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus target = null;
                target = (com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus)get_store().insert_element_user(CONTACTPNTSTATUS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "contactPntStatus" element
         */
        public com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus addNewContactPntStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus target = null;
                target = (com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus)get_store().add_element_user(CONTACTPNTSTATUS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "contactPntStatus" element
         */
        public void removeContactPntStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTACTPNTSTATUS$0, i);
            }
        }
        /**
         * An XML contactPntStatus(@http://www.sendwordnow.com/notification).
         *
         * This is a complex type.
         */
        public static class ContactPntStatusImpl extends com.sendwordnow.notification.impl.ContactPntImpl implements com.sendwordnow.notification.RcptStatus.ContactPntsStatus.ContactPntStatus
        {
            private static final long serialVersionUID = 1L;
            
            public ContactPntStatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DELIVERYTIMESTAMP$0 = 
                new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "deliveryTimestamp");
            private static final javax.xml.namespace.QName GWBRESPINDEX$2 = 
                new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "gwbRespIndex");
            private static final javax.xml.namespace.QName STATUS$4 = 
                new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "status");
            
            
            /**
             * Gets the "deliveryTimestamp" element
             */
            public java.util.Calendar getDeliveryTimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYTIMESTAMP$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getCalendarValue();
                }
            }
            
            /**
             * Gets (as xml) the "deliveryTimestamp" element
             */
            public org.apache.xmlbeans.XmlDateTime xgetDeliveryTimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DELIVERYTIMESTAMP$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "deliveryTimestamp" element
             */
            public boolean isSetDeliveryTimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DELIVERYTIMESTAMP$0) != 0;
                }
            }
            
            /**
             * Sets the "deliveryTimestamp" element
             */
            public void setDeliveryTimestamp(java.util.Calendar deliveryTimestamp)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYTIMESTAMP$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYTIMESTAMP$0);
                    }
                    target.setCalendarValue(deliveryTimestamp);
                }
            }
            
            /**
             * Sets (as xml) the "deliveryTimestamp" element
             */
            public void xsetDeliveryTimestamp(org.apache.xmlbeans.XmlDateTime deliveryTimestamp)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlDateTime target = null;
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DELIVERYTIMESTAMP$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DELIVERYTIMESTAMP$0);
                    }
                    target.set(deliveryTimestamp);
                }
            }
            
            /**
             * Unsets the "deliveryTimestamp" element
             */
            public void unsetDeliveryTimestamp()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DELIVERYTIMESTAMP$0, 0);
                }
            }
            
            /**
             * Gets the "gwbRespIndex" element
             */
            public java.math.BigInteger getGwbRespIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GWBRESPINDEX$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "gwbRespIndex" element
             */
            public org.apache.xmlbeans.XmlNonNegativeInteger xgetGwbRespIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(GWBRESPINDEX$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "gwbRespIndex" element
             */
            public boolean isSetGwbRespIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GWBRESPINDEX$2) != 0;
                }
            }
            
            /**
             * Sets the "gwbRespIndex" element
             */
            public void setGwbRespIndex(java.math.BigInteger gwbRespIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GWBRESPINDEX$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GWBRESPINDEX$2);
                    }
                    target.setBigIntegerValue(gwbRespIndex);
                }
            }
            
            /**
             * Sets (as xml) the "gwbRespIndex" element
             */
            public void xsetGwbRespIndex(org.apache.xmlbeans.XmlNonNegativeInteger gwbRespIndex)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(GWBRESPINDEX$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(GWBRESPINDEX$2);
                    }
                    target.set(gwbRespIndex);
                }
            }
            
            /**
             * Unsets the "gwbRespIndex" element
             */
            public void unsetGwbRespIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GWBRESPINDEX$2, 0);
                }
            }
            
            /**
             * Gets the "status" attribute
             */
            public java.lang.String getStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "status" attribute
             */
            public com.sendwordnow.notification.StatusAttribute.Status xgetStatus()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.StatusAttribute.Status target = null;
                    target = (com.sendwordnow.notification.StatusAttribute.Status)get_store().find_attribute_user(STATUS$4);
                    return target;
                }
            }
            
            /**
             * Sets the "status" attribute
             */
            public void setStatus(java.lang.String status)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$4);
                    }
                    target.setStringValue(status);
                }
            }
            
            /**
             * Sets (as xml) the "status" attribute
             */
            public void xsetStatus(com.sendwordnow.notification.StatusAttribute.Status status)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.StatusAttribute.Status target = null;
                    target = (com.sendwordnow.notification.StatusAttribute.Status)get_store().find_attribute_user(STATUS$4);
                    if (target == null)
                    {
                      target = (com.sendwordnow.notification.StatusAttribute.Status)get_store().add_attribute_user(STATUS$4);
                    }
                    target.set(status);
                }
            }
        }
    }
}
