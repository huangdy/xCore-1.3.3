/*
 * XML Type:  SendNotificationInfoBase
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.SendNotificationInfoBase
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification.impl;
/**
 * An XML SendNotificationInfoBase(@http://www.sendwordnow.com/notification).
 *
 * This is a complex type.
 */
public class SendNotificationInfoBaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.SendNotificationInfoBase
{
    private static final long serialVersionUID = 1L;
    
    public SendNotificationInfoBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "id");
    private static final javax.xml.namespace.QName CUSTSENTTIMESTAMP$2 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "custSentTimestamp");
    private static final javax.xml.namespace.QName SENDER$4 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "sender");
    private static final javax.xml.namespace.QName NOTIFICATION$6 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "notification");
    private static final javax.xml.namespace.QName CONFCALL$8 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "confCall");
    private static final javax.xml.namespace.QName DEVICE$10 = 
        new javax.xml.namespace.QName("", "device");
    
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public com.sendwordnow.notification.SendNotificationInfoBase.Id xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.Id target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.Id)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(com.sendwordnow.notification.SendNotificationInfoBase.Id id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.Id target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.Id)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.SendNotificationInfoBase.Id)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "custSentTimestamp" element
     */
    public java.util.Calendar getCustSentTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSENTTIMESTAMP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "custSentTimestamp" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCustSentTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CUSTSENTTIMESTAMP$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "custSentTimestamp" element
     */
    public void setCustSentTimestamp(java.util.Calendar custSentTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTSENTTIMESTAMP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTSENTTIMESTAMP$2);
            }
            target.setCalendarValue(custSentTimestamp);
        }
    }
    
    /**
     * Sets (as xml) the "custSentTimestamp" element
     */
    public void xsetCustSentTimestamp(org.apache.xmlbeans.XmlDateTime custSentTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CUSTSENTTIMESTAMP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CUSTSENTTIMESTAMP$2);
            }
            target.set(custSentTimestamp);
        }
    }
    
    /**
     * Gets the "sender" element
     */
    public com.sendwordnow.notification.SendNotificationInfoBase.Sender getSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.Sender target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.Sender)get_store().find_element_user(SENDER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sender" element
     */
    public boolean isSetSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDER$4) != 0;
        }
    }
    
    /**
     * Sets the "sender" element
     */
    public void setSender(com.sendwordnow.notification.SendNotificationInfoBase.Sender sender)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.Sender target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.Sender)get_store().find_element_user(SENDER$4, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.SendNotificationInfoBase.Sender)get_store().add_element_user(SENDER$4);
            }
            target.set(sender);
        }
    }
    
    /**
     * Appends and returns a new empty "sender" element
     */
    public com.sendwordnow.notification.SendNotificationInfoBase.Sender addNewSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.Sender target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.Sender)get_store().add_element_user(SENDER$4);
            return target;
        }
    }
    
    /**
     * Unsets the "sender" element
     */
    public void unsetSender()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDER$4, 0);
        }
    }
    
    /**
     * Gets the "notification" element
     */
    public com.sendwordnow.notification.SendNotificationInfoBase.Notification getNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.Notification target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.Notification)get_store().find_element_user(NOTIFICATION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "notification" element
     */
    public void setNotification(com.sendwordnow.notification.SendNotificationInfoBase.Notification notification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.Notification target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.Notification)get_store().find_element_user(NOTIFICATION$6, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.SendNotificationInfoBase.Notification)get_store().add_element_user(NOTIFICATION$6);
            }
            target.set(notification);
        }
    }
    
    /**
     * Appends and returns a new empty "notification" element
     */
    public com.sendwordnow.notification.SendNotificationInfoBase.Notification addNewNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.Notification target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.Notification)get_store().add_element_user(NOTIFICATION$6);
            return target;
        }
    }
    
    /**
     * Gets the "confCall" element
     */
    public com.sendwordnow.notification.SendNotificationInfoBase.ConfCall getConfCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.ConfCall target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.ConfCall)get_store().find_element_user(CONFCALL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "confCall" element
     */
    public boolean isSetConfCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFCALL$8) != 0;
        }
    }
    
    /**
     * Sets the "confCall" element
     */
    public void setConfCall(com.sendwordnow.notification.SendNotificationInfoBase.ConfCall confCall)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.ConfCall target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.ConfCall)get_store().find_element_user(CONFCALL$8, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.SendNotificationInfoBase.ConfCall)get_store().add_element_user(CONFCALL$8);
            }
            target.set(confCall);
        }
    }
    
    /**
     * Appends and returns a new empty "confCall" element
     */
    public com.sendwordnow.notification.SendNotificationInfoBase.ConfCall addNewConfCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.ConfCall target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.ConfCall)get_store().add_element_user(CONFCALL$8);
            return target;
        }
    }
    
    /**
     * Unsets the "confCall" element
     */
    public void unsetConfCall()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFCALL$8, 0);
        }
    }
    
    /**
     * Gets the "device" attribute
     */
    public com.sendwordnow.notification.SendNotificationInfoBase.Device.Enum getDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVICE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DEVICE$10);
            }
            if (target == null)
            {
                return null;
            }
            return (com.sendwordnow.notification.SendNotificationInfoBase.Device.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "device" attribute
     */
    public com.sendwordnow.notification.SendNotificationInfoBase.Device xgetDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.Device target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.Device)get_store().find_attribute_user(DEVICE$10);
            if (target == null)
            {
                target = (com.sendwordnow.notification.SendNotificationInfoBase.Device)get_default_attribute_value(DEVICE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "device" attribute
     */
    public boolean isSetDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEVICE$10) != null;
        }
    }
    
    /**
     * Sets the "device" attribute
     */
    public void setDevice(com.sendwordnow.notification.SendNotificationInfoBase.Device.Enum device)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEVICE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEVICE$10);
            }
            target.setEnumValue(device);
        }
    }
    
    /**
     * Sets (as xml) the "device" attribute
     */
    public void xsetDevice(com.sendwordnow.notification.SendNotificationInfoBase.Device device)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.SendNotificationInfoBase.Device target = null;
            target = (com.sendwordnow.notification.SendNotificationInfoBase.Device)get_store().find_attribute_user(DEVICE$10);
            if (target == null)
            {
                target = (com.sendwordnow.notification.SendNotificationInfoBase.Device)get_store().add_attribute_user(DEVICE$10);
            }
            target.set(device);
        }
    }
    
    /**
     * Unsets the "device" attribute
     */
    public void unsetDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEVICE$10);
        }
    }
    /**
     * An XML id(@http://www.sendwordnow.com/notification).
     *
     * This is an atomic type that is a restriction of com.sendwordnow.notification.SendNotificationInfoBase$Id.
     */
    public static class IdImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sendwordnow.notification.SendNotificationInfoBase.Id
    {
        private static final long serialVersionUID = 1L;
        
        public IdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected IdImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML sender(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public static class SenderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.SendNotificationInfoBase.Sender
    {
        private static final long serialVersionUID = 1L;
        
        public SenderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTRONAME$0 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "introName");
        private static final javax.xml.namespace.QName INTROORGANIZATION$2 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "introOrganization");
        private static final javax.xml.namespace.QName PHONE$4 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "phone");
        private static final javax.xml.namespace.QName EMAIL$6 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "email");
        
        
        /**
         * Gets the "introName" element
         */
        public java.lang.String getIntroName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRONAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "introName" element
         */
        public org.apache.xmlbeans.XmlString xgetIntroName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRONAME$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "introName" element
         */
        public boolean isSetIntroName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTRONAME$0) != 0;
            }
        }
        
        /**
         * Sets the "introName" element
         */
        public void setIntroName(java.lang.String introName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTRONAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTRONAME$0);
                }
                target.setStringValue(introName);
            }
        }
        
        /**
         * Sets (as xml) the "introName" element
         */
        public void xsetIntroName(org.apache.xmlbeans.XmlString introName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTRONAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTRONAME$0);
                }
                target.set(introName);
            }
        }
        
        /**
         * Unsets the "introName" element
         */
        public void unsetIntroName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTRONAME$0, 0);
            }
        }
        
        /**
         * Gets the "introOrganization" element
         */
        public java.lang.String getIntroOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTROORGANIZATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "introOrganization" element
         */
        public org.apache.xmlbeans.XmlString xgetIntroOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTROORGANIZATION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "introOrganization" element
         */
        public boolean isSetIntroOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INTROORGANIZATION$2) != 0;
            }
        }
        
        /**
         * Sets the "introOrganization" element
         */
        public void setIntroOrganization(java.lang.String introOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTROORGANIZATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTROORGANIZATION$2);
                }
                target.setStringValue(introOrganization);
            }
        }
        
        /**
         * Sets (as xml) the "introOrganization" element
         */
        public void xsetIntroOrganization(org.apache.xmlbeans.XmlString introOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTROORGANIZATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTROORGANIZATION$2);
                }
                target.set(introOrganization);
            }
        }
        
        /**
         * Unsets the "introOrganization" element
         */
        public void unsetIntroOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INTROORGANIZATION$2, 0);
            }
        }
        
        /**
         * Gets the "phone" element
         */
        public java.lang.String getPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "phone" element
         */
        public org.apache.xmlbeans.XmlString xgetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "phone" element
         */
        public boolean isSetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PHONE$4) != 0;
            }
        }
        
        /**
         * Sets the "phone" element
         */
        public void setPhone(java.lang.String phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$4);
                }
                target.setStringValue(phone);
            }
        }
        
        /**
         * Sets (as xml) the "phone" element
         */
        public void xsetPhone(org.apache.xmlbeans.XmlString phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$4);
                }
                target.set(phone);
            }
        }
        
        /**
         * Unsets the "phone" element
         */
        public void unsetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PHONE$4, 0);
            }
        }
        
        /**
         * Gets the "email" element
         */
        public java.lang.String getEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "email" element
         */
        public org.apache.xmlbeans.XmlString xgetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "email" element
         */
        public boolean isSetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EMAIL$6) != 0;
            }
        }
        
        /**
         * Sets the "email" element
         */
        public void setEmail(java.lang.String email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$6);
                }
                target.setStringValue(email);
            }
        }
        
        /**
         * Sets (as xml) the "email" element
         */
        public void xsetEmail(org.apache.xmlbeans.XmlString email)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$6);
                }
                target.set(email);
            }
        }
        
        /**
         * Unsets the "email" element
         */
        public void unsetEmail()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EMAIL$6, 0);
            }
        }
    }
    /**
     * An XML notification(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public static class NotificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.SendNotificationInfoBase.Notification
    {
        private static final long serialVersionUID = 1L;
        
        public NotificationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBJECT$0 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "subject");
        private static final javax.xml.namespace.QName BODY$2 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "body");
        
        
        /**
         * Gets the "subject" element
         */
        public java.lang.String getSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "subject" element
         */
        public org.apache.xmlbeans.XmlString xgetSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "subject" element
         */
        public boolean isSetSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBJECT$0) != 0;
            }
        }
        
        /**
         * Sets the "subject" element
         */
        public void setSubject(java.lang.String subject)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBJECT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBJECT$0);
                }
                target.setStringValue(subject);
            }
        }
        
        /**
         * Sets (as xml) the "subject" element
         */
        public void xsetSubject(org.apache.xmlbeans.XmlString subject)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBJECT$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBJECT$0);
                }
                target.set(subject);
            }
        }
        
        /**
         * Unsets the "subject" element
         */
        public void unsetSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBJECT$0, 0);
            }
        }
        
        /**
         * Gets the "body" element
         */
        public java.lang.String getBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BODY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "body" element
         */
        public org.apache.xmlbeans.XmlString xgetBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "body" element
         */
        public void setBody(java.lang.String body)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BODY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BODY$2);
                }
                target.setStringValue(body);
            }
        }
        
        /**
         * Sets (as xml) the "body" element
         */
        public void xsetBody(org.apache.xmlbeans.XmlString body)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BODY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BODY$2);
                }
                target.set(body);
            }
        }
    }
    /**
     * An XML confCall(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public static class ConfCallImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.SendNotificationInfoBase.ConfCall
    {
        private static final long serialVersionUID = 1L;
        
        public ConfCallImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "id");
        private static final javax.xml.namespace.QName PHONE$2 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "phone");
        private static final javax.xml.namespace.QName ISCONFCALL$4 = 
            new javax.xml.namespace.QName("", "isConfCall");
        
        
        /**
         * Gets the "id" element
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id target = null;
                target = (com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id)get_store().find_element_user(ID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "id" element
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ID$0) != 0;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id target = null;
                target = (com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" element
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ID$0, 0);
            }
        }
        
        /**
         * Gets the "phone" element
         */
        public java.lang.String getPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "phone" element
         */
        public org.apache.xmlbeans.XmlString xgetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "phone" element
         */
        public boolean isSetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PHONE$2) != 0;
            }
        }
        
        /**
         * Sets the "phone" element
         */
        public void setPhone(java.lang.String phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$2);
                }
                target.setStringValue(phone);
            }
        }
        
        /**
         * Sets (as xml) the "phone" element
         */
        public void xsetPhone(org.apache.xmlbeans.XmlString phone)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$2);
                }
                target.set(phone);
            }
        }
        
        /**
         * Unsets the "phone" element
         */
        public void unsetPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PHONE$2, 0);
            }
        }
        
        /**
         * Gets the "isConfCall" attribute
         */
        public boolean getIsConfCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCONFCALL$4);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "isConfCall" attribute
         */
        public org.apache.xmlbeans.XmlBoolean xgetIsConfCall()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCONFCALL$4);
                return target;
            }
        }
        
        /**
         * Sets the "isConfCall" attribute
         */
        public void setIsConfCall(boolean isConfCall)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCONFCALL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISCONFCALL$4);
                }
                target.setBooleanValue(isConfCall);
            }
        }
        
        /**
         * Sets (as xml) the "isConfCall" attribute
         */
        public void xsetIsConfCall(org.apache.xmlbeans.XmlBoolean isConfCall)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCONFCALL$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISCONFCALL$4);
                }
                target.set(isConfCall);
            }
        }
        /**
         * An XML id(@http://www.sendwordnow.com/notification).
         *
         * This is an atomic type that is a restriction of com.sendwordnow.notification.SendNotificationInfoBase$ConfCall$Id.
         */
        public static class IdImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sendwordnow.notification.SendNotificationInfoBase.ConfCall.Id
        {
            private static final long serialVersionUID = 1L;
            
            public IdImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected IdImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML device(@).
     *
     * This is an atomic type that is a restriction of com.sendwordnow.notification.SendNotificationInfoBase$Device.
     */
    public static class DeviceImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.sendwordnow.notification.SendNotificationInfoBase.Device
    {
        private static final long serialVersionUID = 1L;
        
        public DeviceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DeviceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
