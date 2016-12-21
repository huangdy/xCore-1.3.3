/*
 * An XML document type.
 * Localname: ICSForm202
 * Namespace: http://uicds.org/ICSForm202
 * Java type: org.uicds.icsForm202.ICSForm202Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm202.impl;
/**
 * A document containing one ICSForm202(@http://uicds.org/ICSForm202) element.
 *
 * This is a complex type.
 */
public class ICSForm202DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm202.ICSForm202Document
{
    private static final long serialVersionUID = 1L;
    
    public ICSForm202DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ICSFORM202$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "ICSForm202");
    
    
    /**
     * Gets the "ICSForm202" element
     */
    public org.uicds.icsForm202.ICSForm202Document.ICSForm202 getICSForm202()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm202.ICSForm202Document.ICSForm202 target = null;
            target = (org.uicds.icsForm202.ICSForm202Document.ICSForm202)get_store().find_element_user(ICSFORM202$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ICSForm202" element
     */
    public void setICSForm202(org.uicds.icsForm202.ICSForm202Document.ICSForm202 icsForm202)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm202.ICSForm202Document.ICSForm202 target = null;
            target = (org.uicds.icsForm202.ICSForm202Document.ICSForm202)get_store().find_element_user(ICSFORM202$0, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm202.ICSForm202Document.ICSForm202)get_store().add_element_user(ICSFORM202$0);
            }
            target.set(icsForm202);
        }
    }
    
    /**
     * Appends and returns a new empty "ICSForm202" element
     */
    public org.uicds.icsForm202.ICSForm202Document.ICSForm202 addNewICSForm202()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm202.ICSForm202Document.ICSForm202 target = null;
            target = (org.uicds.icsForm202.ICSForm202Document.ICSForm202)get_store().add_element_user(ICSFORM202$0);
            return target;
        }
    }
    /**
     * An XML ICSForm202(@http://uicds.org/ICSForm202).
     *
     * This is a complex type.
     */
    public static class ICSForm202Impl extends org.uicds.icsFormCommon.impl.ICSFormDocumentTypeImpl implements org.uicds.icsForm202.ICSForm202Document.ICSForm202
    {
        private static final long serialVersionUID = 1L;
        
        public ICSForm202Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTNAME$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "IncidentName");
        private static final javax.xml.namespace.QName DATEPREPARED$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "DatePrepared");
        private static final javax.xml.namespace.QName TIMEPREPARED$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "TimePrepared");
        private static final javax.xml.namespace.QName OPERATIONALPERIOD$6 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "OperationalPeriod");
        private static final javax.xml.namespace.QName CONTRACTOROBJECTIVES$8 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "ContractorObjectives");
        private static final javax.xml.namespace.QName WEATHERFORECAST$10 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "WeatherForecast");
        private static final javax.xml.namespace.QName GENERALSAFETYMESSAGE$12 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "GeneralSafetyMessage");
        private static final javax.xml.namespace.QName ATTACHMENTLIST$14 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "AttachmentList");
        private static final javax.xml.namespace.QName PREPAREDBY$16 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "PreparedBy");
        private static final javax.xml.namespace.QName APPROVEDBY$18 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "ApprovedBy");
        
        
        /**
         * Gets the "IncidentName" element
         */
        public java.lang.String getIncidentName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IncidentName" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "IncidentName" element
         */
        public void setIncidentName(java.lang.String incidentName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTNAME$0);
                }
                target.setStringValue(incidentName);
            }
        }
        
        /**
         * Sets (as xml) the "IncidentName" element
         */
        public void xsetIncidentName(org.apache.xmlbeans.XmlString incidentName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTNAME$0);
                }
                target.set(incidentName);
            }
        }
        
        /**
         * Gets the "DatePrepared" element
         */
        public java.util.Calendar getDatePrepared()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEPREPARED$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DatePrepared" element
         */
        public org.apache.xmlbeans.XmlDate xgetDatePrepared()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEPREPARED$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DatePrepared" element
         */
        public void setDatePrepared(java.util.Calendar datePrepared)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEPREPARED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEPREPARED$2);
                }
                target.setCalendarValue(datePrepared);
            }
        }
        
        /**
         * Sets (as xml) the "DatePrepared" element
         */
        public void xsetDatePrepared(org.apache.xmlbeans.XmlDate datePrepared)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATEPREPARED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATEPREPARED$2);
                }
                target.set(datePrepared);
            }
        }
        
        /**
         * Gets the "TimePrepared" element
         */
        public java.util.Calendar getTimePrepared()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEPREPARED$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "TimePrepared" element
         */
        public org.apache.xmlbeans.XmlTime xgetTimePrepared()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIMEPREPARED$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TimePrepared" element
         */
        public void setTimePrepared(java.util.Calendar timePrepared)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEPREPARED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEPREPARED$4);
                }
                target.setCalendarValue(timePrepared);
            }
        }
        
        /**
         * Sets (as xml) the "TimePrepared" element
         */
        public void xsetTimePrepared(org.apache.xmlbeans.XmlTime timePrepared)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIMEPREPARED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(TIMEPREPARED$4);
                }
                target.set(timePrepared);
            }
        }
        
        /**
         * Gets the "OperationalPeriod" element
         */
        public java.util.Calendar getOperationalPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONALPERIOD$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "OperationalPeriod" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetOperationalPeriod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(OPERATIONALPERIOD$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OperationalPeriod" element
         */
        public void setOperationalPeriod(java.util.Calendar operationalPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONALPERIOD$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONALPERIOD$6);
                }
                target.setCalendarValue(operationalPeriod);
            }
        }
        
        /**
         * Sets (as xml) the "OperationalPeriod" element
         */
        public void xsetOperationalPeriod(org.apache.xmlbeans.XmlDateTime operationalPeriod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(OPERATIONALPERIOD$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(OPERATIONALPERIOD$6);
                }
                target.set(operationalPeriod);
            }
        }
        
        /**
         * Gets the "ContractorObjectives" element
         */
        public java.lang.String getContractorObjectives()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTOROBJECTIVES$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ContractorObjectives" element
         */
        public org.apache.xmlbeans.XmlString xgetContractorObjectives()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRACTOROBJECTIVES$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ContractorObjectives" element
         */
        public void setContractorObjectives(java.lang.String contractorObjectives)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRACTOROBJECTIVES$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTRACTOROBJECTIVES$8);
                }
                target.setStringValue(contractorObjectives);
            }
        }
        
        /**
         * Sets (as xml) the "ContractorObjectives" element
         */
        public void xsetContractorObjectives(org.apache.xmlbeans.XmlString contractorObjectives)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRACTOROBJECTIVES$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTRACTOROBJECTIVES$8);
                }
                target.set(contractorObjectives);
            }
        }
        
        /**
         * Gets the "WeatherForecast" element
         */
        public java.lang.String getWeatherForecast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEATHERFORECAST$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "WeatherForecast" element
         */
        public org.apache.xmlbeans.XmlString xgetWeatherForecast()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEATHERFORECAST$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "WeatherForecast" element
         */
        public void setWeatherForecast(java.lang.String weatherForecast)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEATHERFORECAST$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEATHERFORECAST$10);
                }
                target.setStringValue(weatherForecast);
            }
        }
        
        /**
         * Sets (as xml) the "WeatherForecast" element
         */
        public void xsetWeatherForecast(org.apache.xmlbeans.XmlString weatherForecast)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(WEATHERFORECAST$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(WEATHERFORECAST$10);
                }
                target.set(weatherForecast);
            }
        }
        
        /**
         * Gets the "GeneralSafetyMessage" element
         */
        public java.lang.String getGeneralSafetyMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALSAFETYMESSAGE$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "GeneralSafetyMessage" element
         */
        public org.apache.xmlbeans.XmlString xgetGeneralSafetyMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERALSAFETYMESSAGE$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "GeneralSafetyMessage" element
         */
        public void setGeneralSafetyMessage(java.lang.String generalSafetyMessage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENERALSAFETYMESSAGE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENERALSAFETYMESSAGE$12);
                }
                target.setStringValue(generalSafetyMessage);
            }
        }
        
        /**
         * Sets (as xml) the "GeneralSafetyMessage" element
         */
        public void xsetGeneralSafetyMessage(org.apache.xmlbeans.XmlString generalSafetyMessage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GENERALSAFETYMESSAGE$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GENERALSAFETYMESSAGE$12);
                }
                target.set(generalSafetyMessage);
            }
        }
        
        /**
         * Gets the "AttachmentList" element
         */
        public org.uicds.icsForm202.Attachments getAttachmentList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm202.Attachments target = null;
                target = (org.uicds.icsForm202.Attachments)get_store().find_element_user(ATTACHMENTLIST$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "AttachmentList" element
         */
        public void setAttachmentList(org.uicds.icsForm202.Attachments attachmentList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm202.Attachments target = null;
                target = (org.uicds.icsForm202.Attachments)get_store().find_element_user(ATTACHMENTLIST$14, 0);
                if (target == null)
                {
                    target = (org.uicds.icsForm202.Attachments)get_store().add_element_user(ATTACHMENTLIST$14);
                }
                target.set(attachmentList);
            }
        }
        
        /**
         * Appends and returns a new empty "AttachmentList" element
         */
        public org.uicds.icsForm202.Attachments addNewAttachmentList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm202.Attachments target = null;
                target = (org.uicds.icsForm202.Attachments)get_store().add_element_user(ATTACHMENTLIST$14);
                return target;
            }
        }
        
        /**
         * Gets the "PreparedBy" element
         */
        public java.lang.String getPreparedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PreparedBy" element
         */
        public org.apache.xmlbeans.XmlString xgetPreparedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PreparedBy" element
         */
        public void setPreparedBy(java.lang.String preparedBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREPAREDBY$16);
                }
                target.setStringValue(preparedBy);
            }
        }
        
        /**
         * Sets (as xml) the "PreparedBy" element
         */
        public void xsetPreparedBy(org.apache.xmlbeans.XmlString preparedBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREPAREDBY$16);
                }
                target.set(preparedBy);
            }
        }
        
        /**
         * Gets the "ApprovedBy" element
         */
        public java.lang.String getApprovedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVEDBY$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ApprovedBy" element
         */
        public org.apache.xmlbeans.XmlString xgetApprovedBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVEDBY$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ApprovedBy" element
         */
        public void setApprovedBy(java.lang.String approvedBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVEDBY$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVEDBY$18);
                }
                target.setStringValue(approvedBy);
            }
        }
        
        /**
         * Sets (as xml) the "ApprovedBy" element
         */
        public void xsetApprovedBy(org.apache.xmlbeans.XmlString approvedBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVEDBY$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVEDBY$18);
                }
                target.set(approvedBy);
            }
        }
    }
}
