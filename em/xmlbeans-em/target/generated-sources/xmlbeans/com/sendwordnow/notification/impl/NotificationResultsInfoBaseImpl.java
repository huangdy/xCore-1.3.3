/*
 * XML Type:  NotificationResultsInfoBase
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.NotificationResultsInfoBase
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification.impl;
/**
 * An XML NotificationResultsInfoBase(@http://www.sendwordnow.com/notification).
 *
 * This is a complex type.
 */
public class NotificationResultsInfoBaseImpl extends com.sendwordnow.notification.impl.SendNotificationInfoBaseImpl implements com.sendwordnow.notification.NotificationResultsInfoBase
{
    private static final long serialVersionUID = 1L;
    
    public NotificationResultsInfoBaseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENTTIMESTAMP$0 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "sentTimestamp");
    private static final javax.xml.namespace.QName STATISTICS$2 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "statistics");
    private static final javax.xml.namespace.QName GWBSTATISTICS$4 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "gwbStatistics");
    private static final javax.xml.namespace.QName CONFCALLSTATISTICS$6 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "confCallStatistics");
    private static final javax.xml.namespace.QName RESULTGENERATEDTIMESTAMP$8 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "resultGeneratedTimestamp");
    private static final javax.xml.namespace.QName STATUS$10 = 
        new javax.xml.namespace.QName("", "status");
    
    
    /**
     * Gets the "sentTimestamp" element
     */
    public java.util.Calendar getSentTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTTIMESTAMP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "sentTimestamp" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetSentTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SENTTIMESTAMP$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sentTimestamp" element
     */
    public void setSentTimestamp(java.util.Calendar sentTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTTIMESTAMP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENTTIMESTAMP$0);
            }
            target.setCalendarValue(sentTimestamp);
        }
    }
    
    /**
     * Sets (as xml) the "sentTimestamp" element
     */
    public void xsetSentTimestamp(org.apache.xmlbeans.XmlDateTime sentTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(SENTTIMESTAMP$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(SENTTIMESTAMP$0);
            }
            target.set(sentTimestamp);
        }
    }
    
    /**
     * Gets the "statistics" element
     */
    public com.sendwordnow.notification.NotificationResultsInfoBase.Statistics getStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoBase.Statistics target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoBase.Statistics)get_store().find_element_user(STATISTICS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "statistics" element
     */
    public void setStatistics(com.sendwordnow.notification.NotificationResultsInfoBase.Statistics statistics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoBase.Statistics target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoBase.Statistics)get_store().find_element_user(STATISTICS$2, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.NotificationResultsInfoBase.Statistics)get_store().add_element_user(STATISTICS$2);
            }
            target.set(statistics);
        }
    }
    
    /**
     * Appends and returns a new empty "statistics" element
     */
    public com.sendwordnow.notification.NotificationResultsInfoBase.Statistics addNewStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoBase.Statistics target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoBase.Statistics)get_store().add_element_user(STATISTICS$2);
            return target;
        }
    }
    
    /**
     * Gets the "gwbStatistics" element
     */
    public com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics getGwbStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics)get_store().find_element_user(GWBSTATISTICS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "gwbStatistics" element
     */
    public boolean isSetGwbStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GWBSTATISTICS$4) != 0;
        }
    }
    
    /**
     * Sets the "gwbStatistics" element
     */
    public void setGwbStatistics(com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics gwbStatistics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics)get_store().find_element_user(GWBSTATISTICS$4, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics)get_store().add_element_user(GWBSTATISTICS$4);
            }
            target.set(gwbStatistics);
        }
    }
    
    /**
     * Appends and returns a new empty "gwbStatistics" element
     */
    public com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics addNewGwbStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics)get_store().add_element_user(GWBSTATISTICS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "gwbStatistics" element
     */
    public void unsetGwbStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GWBSTATISTICS$4, 0);
        }
    }
    
    /**
     * Gets the "confCallStatistics" element
     */
    public com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics getConfCallStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics)get_store().find_element_user(CONFCALLSTATISTICS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "confCallStatistics" element
     */
    public boolean isSetConfCallStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONFCALLSTATISTICS$6) != 0;
        }
    }
    
    /**
     * Sets the "confCallStatistics" element
     */
    public void setConfCallStatistics(com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics confCallStatistics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics)get_store().find_element_user(CONFCALLSTATISTICS$6, 0);
            if (target == null)
            {
                target = (com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics)get_store().add_element_user(CONFCALLSTATISTICS$6);
            }
            target.set(confCallStatistics);
        }
    }
    
    /**
     * Appends and returns a new empty "confCallStatistics" element
     */
    public com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics addNewConfCallStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics)get_store().add_element_user(CONFCALLSTATISTICS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "confCallStatistics" element
     */
    public void unsetConfCallStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONFCALLSTATISTICS$6, 0);
        }
    }
    
    /**
     * Gets the "resultGeneratedTimestamp" element
     */
    public java.util.Calendar getResultGeneratedTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTGENERATEDTIMESTAMP$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "resultGeneratedTimestamp" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetResultGeneratedTimestamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(RESULTGENERATEDTIMESTAMP$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "resultGeneratedTimestamp" element
     */
    public void setResultGeneratedTimestamp(java.util.Calendar resultGeneratedTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTGENERATEDTIMESTAMP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULTGENERATEDTIMESTAMP$8);
            }
            target.setCalendarValue(resultGeneratedTimestamp);
        }
    }
    
    /**
     * Sets (as xml) the "resultGeneratedTimestamp" element
     */
    public void xsetResultGeneratedTimestamp(org.apache.xmlbeans.XmlDateTime resultGeneratedTimestamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(RESULTGENERATEDTIMESTAMP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(RESULTGENERATEDTIMESTAMP$8);
            }
            target.set(resultGeneratedTimestamp);
        }
    }
    
    /**
     * Gets the "status" attribute
     */
    public com.sendwordnow.notification.NotificationResultsInfoBase.Status.Enum getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$10);
            if (target == null)
            {
                return null;
            }
            return (com.sendwordnow.notification.NotificationResultsInfoBase.Status.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "status" attribute
     */
    public com.sendwordnow.notification.NotificationResultsInfoBase.Status xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoBase.Status target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoBase.Status)get_store().find_attribute_user(STATUS$10);
            return target;
        }
    }
    
    /**
     * Sets the "status" attribute
     */
    public void setStatus(com.sendwordnow.notification.NotificationResultsInfoBase.Status.Enum status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STATUS$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STATUS$10);
            }
            target.setEnumValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "status" attribute
     */
    public void xsetStatus(com.sendwordnow.notification.NotificationResultsInfoBase.Status status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.sendwordnow.notification.NotificationResultsInfoBase.Status target = null;
            target = (com.sendwordnow.notification.NotificationResultsInfoBase.Status)get_store().find_attribute_user(STATUS$10);
            if (target == null)
            {
                target = (com.sendwordnow.notification.NotificationResultsInfoBase.Status)get_store().add_attribute_user(STATUS$10);
            }
            target.set(status);
        }
    }
    /**
     * An XML statistics(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public static class StatisticsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.NotificationResultsInfoBase.Statistics
    {
        private static final long serialVersionUID = 1L;
        
        public StatisticsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NBRRCPTS$0 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "nbrRcpts");
        private static final javax.xml.namespace.QName NBRCONTACTPNTS$2 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "nbrContactPnts");
        private static final javax.xml.namespace.QName NBRVOICECONTACTPNTS$4 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "nbrVoiceContactPnts");
        private static final javax.xml.namespace.QName NBREMAILANDTEXTCONTACTPNTS$6 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "nbrEmailAndTextContactPnts");
        
        
        /**
         * Gets the "nbrRcpts" element
         */
        public java.math.BigInteger getNbrRcpts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBRRCPTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "nbrRcpts" element
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetNbrRcpts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NBRRCPTS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nbrRcpts" element
         */
        public void setNbrRcpts(java.math.BigInteger nbrRcpts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBRRCPTS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NBRRCPTS$0);
                }
                target.setBigIntegerValue(nbrRcpts);
            }
        }
        
        /**
         * Sets (as xml) the "nbrRcpts" element
         */
        public void xsetNbrRcpts(org.apache.xmlbeans.XmlNonNegativeInteger nbrRcpts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NBRRCPTS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NBRRCPTS$0);
                }
                target.set(nbrRcpts);
            }
        }
        
        /**
         * Gets the "nbrContactPnts" element
         */
        public java.math.BigInteger getNbrContactPnts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBRCONTACTPNTS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "nbrContactPnts" element
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetNbrContactPnts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NBRCONTACTPNTS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nbrContactPnts" element
         */
        public void setNbrContactPnts(java.math.BigInteger nbrContactPnts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBRCONTACTPNTS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NBRCONTACTPNTS$2);
                }
                target.setBigIntegerValue(nbrContactPnts);
            }
        }
        
        /**
         * Sets (as xml) the "nbrContactPnts" element
         */
        public void xsetNbrContactPnts(org.apache.xmlbeans.XmlNonNegativeInteger nbrContactPnts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NBRCONTACTPNTS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NBRCONTACTPNTS$2);
                }
                target.set(nbrContactPnts);
            }
        }
        
        /**
         * Gets the "nbrVoiceContactPnts" element
         */
        public java.math.BigInteger getNbrVoiceContactPnts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBRVOICECONTACTPNTS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "nbrVoiceContactPnts" element
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetNbrVoiceContactPnts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NBRVOICECONTACTPNTS$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nbrVoiceContactPnts" element
         */
        public void setNbrVoiceContactPnts(java.math.BigInteger nbrVoiceContactPnts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBRVOICECONTACTPNTS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NBRVOICECONTACTPNTS$4);
                }
                target.setBigIntegerValue(nbrVoiceContactPnts);
            }
        }
        
        /**
         * Sets (as xml) the "nbrVoiceContactPnts" element
         */
        public void xsetNbrVoiceContactPnts(org.apache.xmlbeans.XmlNonNegativeInteger nbrVoiceContactPnts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NBRVOICECONTACTPNTS$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NBRVOICECONTACTPNTS$4);
                }
                target.set(nbrVoiceContactPnts);
            }
        }
        
        /**
         * Gets the "nbrEmailAndTextContactPnts" element
         */
        public java.math.BigInteger getNbrEmailAndTextContactPnts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBREMAILANDTEXTCONTACTPNTS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "nbrEmailAndTextContactPnts" element
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetNbrEmailAndTextContactPnts()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NBREMAILANDTEXTCONTACTPNTS$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nbrEmailAndTextContactPnts" element
         */
        public void setNbrEmailAndTextContactPnts(java.math.BigInteger nbrEmailAndTextContactPnts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBREMAILANDTEXTCONTACTPNTS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NBREMAILANDTEXTCONTACTPNTS$6);
                }
                target.setBigIntegerValue(nbrEmailAndTextContactPnts);
            }
        }
        
        /**
         * Sets (as xml) the "nbrEmailAndTextContactPnts" element
         */
        public void xsetNbrEmailAndTextContactPnts(org.apache.xmlbeans.XmlNonNegativeInteger nbrEmailAndTextContactPnts)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NBREMAILANDTEXTCONTACTPNTS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NBREMAILANDTEXTCONTACTPNTS$6);
                }
                target.set(nbrEmailAndTextContactPnts);
            }
        }
    }
    /**
     * An XML gwbStatistics(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public static class GwbStatisticsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics
    {
        private static final long serialVersionUID = 1L;
        
        public GwbStatisticsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName GWB$0 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "gwb");
        
        
        /**
         * Gets array of all "gwb" elements
         */
        public com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb[] getGwbArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(GWB$0, targetList);
                com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb[] result = new com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "gwb" element
         */
        public com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb getGwbArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb target = null;
                target = (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb)get_store().find_element_user(GWB$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "gwb" element
         */
        public int sizeOfGwbArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GWB$0);
            }
        }
        
        /**
         * Sets array of all "gwb" element
         */
        public void setGwbArray(com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb[] gwbArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(gwbArray, GWB$0);
            }
        }
        
        /**
         * Sets ith "gwb" element
         */
        public void setGwbArray(int i, com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb gwb)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb target = null;
                target = (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb)get_store().find_element_user(GWB$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(gwb);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "gwb" element
         */
        public com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb insertNewGwb(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb target = null;
                target = (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb)get_store().insert_element_user(GWB$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "gwb" element
         */
        public com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb addNewGwb()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb target = null;
                target = (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb)get_store().add_element_user(GWB$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "gwb" element
         */
        public void removeGwb(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GWB$0, i);
            }
        }
        /**
         * An XML gwb(@http://www.sendwordnow.com/notification).
         *
         * This is a complex type.
         */
        public static class GwbImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb
        {
            private static final long serialVersionUID = 1L;
            
            public GwbImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName INDEX$0 = 
                new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "index");
            private static final javax.xml.namespace.QName GWBTEXT$2 = 
                new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "gwbText");
            private static final javax.xml.namespace.QName NBRRESPONSES$4 = 
                new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "nbrResponses");
            
            
            /**
             * Gets the "index" element
             */
            public java.math.BigInteger getIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDEX$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "index" element
             */
            public org.apache.xmlbeans.XmlPositiveInteger xgetIndex()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlPositiveInteger target = null;
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(INDEX$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "index" element
             */
            public void setIndex(java.math.BigInteger index)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDEX$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDEX$0);
                    }
                    target.setBigIntegerValue(index);
                }
            }
            
            /**
             * Sets (as xml) the "index" element
             */
            public void xsetIndex(org.apache.xmlbeans.XmlPositiveInteger index)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlPositiveInteger target = null;
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(INDEX$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(INDEX$0);
                    }
                    target.set(index);
                }
            }
            
            /**
             * Gets the "gwbText" element
             */
            public java.lang.String getGwbText()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GWBTEXT$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "gwbText" element
             */
            public com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText xgetGwbText()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText target = null;
                    target = (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText)get_store().find_element_user(GWBTEXT$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "gwbText" element
             */
            public void setGwbText(java.lang.String gwbText)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GWBTEXT$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GWBTEXT$2);
                    }
                    target.setStringValue(gwbText);
                }
            }
            
            /**
             * Sets (as xml) the "gwbText" element
             */
            public void xsetGwbText(com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText gwbText)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText target = null;
                    target = (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText)get_store().find_element_user(GWBTEXT$2, 0);
                    if (target == null)
                    {
                      target = (com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText)get_store().add_element_user(GWBTEXT$2);
                    }
                    target.set(gwbText);
                }
            }
            
            /**
             * Gets the "nbrResponses" element
             */
            public java.math.BigInteger getNbrResponses()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBRRESPONSES$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getBigIntegerValue();
                }
            }
            
            /**
             * Gets (as xml) the "nbrResponses" element
             */
            public org.apache.xmlbeans.XmlNonNegativeInteger xgetNbrResponses()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NBRRESPONSES$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "nbrResponses" element
             */
            public void setNbrResponses(java.math.BigInteger nbrResponses)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBRRESPONSES$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NBRRESPONSES$4);
                    }
                    target.setBigIntegerValue(nbrResponses);
                }
            }
            
            /**
             * Sets (as xml) the "nbrResponses" element
             */
            public void xsetNbrResponses(org.apache.xmlbeans.XmlNonNegativeInteger nbrResponses)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NBRRESPONSES$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NBRRESPONSES$4);
                    }
                    target.set(nbrResponses);
                }
            }
            /**
             * An XML gwbText(@http://www.sendwordnow.com/notification).
             *
             * This is an atomic type that is a restriction of com.sendwordnow.notification.NotificationResultsInfoBase$GwbStatistics$Gwb$GwbText.
             */
            public static class GwbTextImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.sendwordnow.notification.NotificationResultsInfoBase.GwbStatistics.Gwb.GwbText
            {
                private static final long serialVersionUID = 1L;
                
                public GwbTextImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected GwbTextImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
    }
    /**
     * An XML confCallStatistics(@http://www.sendwordnow.com/notification).
     *
     * This is a complex type.
     */
    public static class ConfCallStatisticsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.NotificationResultsInfoBase.ConfCallStatistics
    {
        private static final long serialVersionUID = 1L;
        
        public ConfCallStatisticsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDUSED$0 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "idUsed");
        private static final javax.xml.namespace.QName NBRRCPTSJOINED$2 = 
            new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "nbrRcptsJoined");
        
        
        /**
         * Gets the "idUsed" element
         */
        public java.math.BigInteger getIdUsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDUSED$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "idUsed" element
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetIdUsed()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(IDUSED$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "idUsed" element
         */
        public void setIdUsed(java.math.BigInteger idUsed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDUSED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDUSED$0);
                }
                target.setBigIntegerValue(idUsed);
            }
        }
        
        /**
         * Sets (as xml) the "idUsed" element
         */
        public void xsetIdUsed(org.apache.xmlbeans.XmlNonNegativeInteger idUsed)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(IDUSED$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(IDUSED$0);
                }
                target.set(idUsed);
            }
        }
        
        /**
         * Gets the "nbrRcptsJoined" element
         */
        public java.math.BigInteger getNbrRcptsJoined()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBRRCPTSJOINED$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "nbrRcptsJoined" element
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetNbrRcptsJoined()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NBRRCPTSJOINED$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "nbrRcptsJoined" element
         */
        public void setNbrRcptsJoined(java.math.BigInteger nbrRcptsJoined)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NBRRCPTSJOINED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NBRRCPTSJOINED$2);
                }
                target.setBigIntegerValue(nbrRcptsJoined);
            }
        }
        
        /**
         * Sets (as xml) the "nbrRcptsJoined" element
         */
        public void xsetNbrRcptsJoined(org.apache.xmlbeans.XmlNonNegativeInteger nbrRcptsJoined)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(NBRRCPTSJOINED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(NBRRCPTSJOINED$2);
                }
                target.set(nbrRcptsJoined);
            }
        }
    }
    /**
     * An XML status(@).
     *
     * This is an atomic type that is a restriction of com.sendwordnow.notification.NotificationResultsInfoBase$Status.
     */
    public static class StatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.sendwordnow.notification.NotificationResultsInfoBase.Status
    {
        private static final long serialVersionUID = 1L;
        
        public StatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected StatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
