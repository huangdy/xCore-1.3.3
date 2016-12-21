/*
 * An XML document type.
 * Localname: ICSForm209
 * Namespace: http://uicds.org/ICSForm209
 * Java type: org.uicds.icsForm209.ICSForm209Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm209.impl;
/**
 * A document containing one ICSForm209(@http://uicds.org/ICSForm209) element.
 *
 * This is a complex type.
 */
public class ICSForm209DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm209.ICSForm209Document
{
    private static final long serialVersionUID = 1L;
    
    public ICSForm209DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ICSFORM209$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "ICSForm209");
    
    
    /**
     * Gets the "ICSForm209" element
     */
    public org.uicds.icsForm209.ICSForm209Document.ICSForm209 getICSForm209()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm209.ICSForm209Document.ICSForm209 target = null;
            target = (org.uicds.icsForm209.ICSForm209Document.ICSForm209)get_store().find_element_user(ICSFORM209$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ICSForm209" element
     */
    public void setICSForm209(org.uicds.icsForm209.ICSForm209Document.ICSForm209 icsForm209)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm209.ICSForm209Document.ICSForm209 target = null;
            target = (org.uicds.icsForm209.ICSForm209Document.ICSForm209)get_store().find_element_user(ICSFORM209$0, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm209.ICSForm209Document.ICSForm209)get_store().add_element_user(ICSFORM209$0);
            }
            target.set(icsForm209);
        }
    }
    
    /**
     * Appends and returns a new empty "ICSForm209" element
     */
    public org.uicds.icsForm209.ICSForm209Document.ICSForm209 addNewICSForm209()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm209.ICSForm209Document.ICSForm209 target = null;
            target = (org.uicds.icsForm209.ICSForm209Document.ICSForm209)get_store().add_element_user(ICSFORM209$0);
            return target;
        }
    }
    /**
     * An XML ICSForm209(@http://uicds.org/ICSForm209).
     *
     * This is a complex type.
     */
    public static class ICSForm209Impl extends org.uicds.icsFormCommon.impl.ICSFormDocumentTypeImpl implements org.uicds.icsForm209.ICSForm209Document.ICSForm209
    {
        private static final long serialVersionUID = 1L;
        
        public ICSForm209Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTDATETIME$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "IncidentDateTime");
        private static final javax.xml.namespace.QName INITIAL$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "Initial");
        private static final javax.xml.namespace.QName UPDATE$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "Update");
        private static final javax.xml.namespace.QName FINAL$6 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "Final");
        private static final javax.xml.namespace.QName INCIDENTNAME$8 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "IncidentName");
        private static final javax.xml.namespace.QName INCIDENTNUMBER$10 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "IncidentNumber");
        private static final javax.xml.namespace.QName INCIDENTCOMMANDER$12 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "IncidentCommander");
        private static final javax.xml.namespace.QName JURISDICTION$14 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "Jurisdiction");
        private static final javax.xml.namespace.QName COUNTY$16 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "County");
        private static final javax.xml.namespace.QName TYPEINCIDENT$18 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "TypeIncident");
        private static final javax.xml.namespace.QName LOCATION$20 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "Location");
        private static final javax.xml.namespace.QName STARTEDDATETIME$22 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "StartedDateTime");
        private static final javax.xml.namespace.QName CAUSE$24 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "Cause");
        private static final javax.xml.namespace.QName AREAINVOLVED$26 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "AreaInvolved");
        private static final javax.xml.namespace.QName PERCENTCONTROLLED$28 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "PercentControlled");
        private static final javax.xml.namespace.QName EXPECTEDCONTAINMENTDATETIME$30 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "ExpectedContainmentDateTime");
        private static final javax.xml.namespace.QName ESTIMATEDCONTROLLEDDATETIME$32 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "EstimatedControlledDateTime");
        private static final javax.xml.namespace.QName DECLAREDCONTROLLEDDATETIME$34 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "DeclaredControlledDateTime");
        private static final javax.xml.namespace.QName CURRENTTHREAT$36 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "CurrentThreat");
        private static final javax.xml.namespace.QName CONTROLPROBLEMS$38 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "ControlProblems");
        private static final javax.xml.namespace.QName ESTLOSS$40 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "EstLoss");
        private static final javax.xml.namespace.QName ESTSAVINGS$42 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "EstSavings");
        private static final javax.xml.namespace.QName INJURIES$44 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "Injuries");
        private static final javax.xml.namespace.QName DEATHS$46 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "Deaths");
        private static final javax.xml.namespace.QName LINEBUILT$48 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "LineBuilt");
        private static final javax.xml.namespace.QName LINETOBUILD$50 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "LineToBuild");
        private static final javax.xml.namespace.QName CURRENTWEATHERWS$52 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "CurrentWeatherWS");
        private static final javax.xml.namespace.QName CURRENTWEATHERWD$54 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "CurrentWeatherWD");
        private static final javax.xml.namespace.QName CURRENTWEATHERTEMP$56 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "CurrentWeatherTemp");
        private static final javax.xml.namespace.QName CURRENTWEATHERRH$58 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "CurrentWeatherRH");
        private static final javax.xml.namespace.QName PREDICTEDWEATHERWS$60 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "PredictedWeatherWS");
        private static final javax.xml.namespace.QName PREDICTEDWEATHERWD$62 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "PredictedWeatherWD");
        private static final javax.xml.namespace.QName PREDICTEDWEATHERTEMP$64 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "PredictedWeatherTemp");
        private static final javax.xml.namespace.QName PREDICTEDWEATHERRH$66 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "PredictedWeatherRH");
        private static final javax.xml.namespace.QName COSTTODATE$68 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "CostToDate");
        private static final javax.xml.namespace.QName ESTTOTALCOST$70 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "EstTotalCost");
        private static final javax.xml.namespace.QName COOPERATINGAGENCIES$72 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "CooperatingAgencies");
        private static final javax.xml.namespace.QName REMARKS$74 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "Remarks");
        private static final javax.xml.namespace.QName PREPAREDBY$76 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "PreparedBy");
        private static final javax.xml.namespace.QName APPROVEDBY$78 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "ApprovedBy");
        private static final javax.xml.namespace.QName SENTTODATE$80 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "SentToDate");
        private static final javax.xml.namespace.QName SENTTOTIME$82 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "SentToTime");
        private static final javax.xml.namespace.QName SENTTOBY$84 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm209", "SentToBy");
        
        
        /**
         * Gets the "IncidentDateTime" element
         */
        public java.util.Calendar getIncidentDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTDATETIME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "IncidentDateTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetIncidentDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(INCIDENTDATETIME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "IncidentDateTime" element
         */
        public void setIncidentDateTime(java.util.Calendar incidentDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTDATETIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTDATETIME$0);
                }
                target.setCalendarValue(incidentDateTime);
            }
        }
        
        /**
         * Sets (as xml) the "IncidentDateTime" element
         */
        public void xsetIncidentDateTime(org.apache.xmlbeans.XmlDateTime incidentDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(INCIDENTDATETIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(INCIDENTDATETIME$0);
                }
                target.set(incidentDateTime);
            }
        }
        
        /**
         * Gets the "Initial" element
         */
        public boolean getInitial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIAL$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Initial" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetInitial()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INITIAL$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Initial" element
         */
        public void setInitial(boolean initial)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIAL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INITIAL$2);
                }
                target.setBooleanValue(initial);
            }
        }
        
        /**
         * Sets (as xml) the "Initial" element
         */
        public void xsetInitial(org.apache.xmlbeans.XmlBoolean initial)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INITIAL$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INITIAL$2);
                }
                target.set(initial);
            }
        }
        
        /**
         * Gets the "Update" element
         */
        public boolean getUpdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATE$4, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Update" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetUpdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UPDATE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Update" element
         */
        public void setUpdate(boolean update)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UPDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UPDATE$4);
                }
                target.setBooleanValue(update);
            }
        }
        
        /**
         * Sets (as xml) the "Update" element
         */
        public void xsetUpdate(org.apache.xmlbeans.XmlBoolean update)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(UPDATE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(UPDATE$4);
                }
                target.set(update);
            }
        }
        
        /**
         * Gets the "Final" element
         */
        public boolean getFinal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINAL$6, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "Final" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetFinal()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FINAL$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Final" element
         */
        public void setFinal(boolean xfinal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINAL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINAL$6);
                }
                target.setBooleanValue(xfinal);
            }
        }
        
        /**
         * Sets (as xml) the "Final" element
         */
        public void xsetFinal(org.apache.xmlbeans.XmlBoolean xfinal)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FINAL$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FINAL$6);
                }
                target.set(xfinal);
            }
        }
        
        /**
         * Gets the "IncidentName" element
         */
        public java.lang.String getIncidentName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNAME$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNAME$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNAME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTNAME$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNAME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTNAME$8);
                }
                target.set(incidentName);
            }
        }
        
        /**
         * Gets the "IncidentNumber" element
         */
        public java.lang.String getIncidentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNUMBER$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IncidentNumber" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNUMBER$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "IncidentNumber" element
         */
        public void setIncidentNumber(java.lang.String incidentNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNUMBER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTNUMBER$10);
                }
                target.setStringValue(incidentNumber);
            }
        }
        
        /**
         * Sets (as xml) the "IncidentNumber" element
         */
        public void xsetIncidentNumber(org.apache.xmlbeans.XmlString incidentNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNUMBER$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTNUMBER$10);
                }
                target.set(incidentNumber);
            }
        }
        
        /**
         * Gets the "IncidentCommander" element
         */
        public java.lang.String getIncidentCommander()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTCOMMANDER$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "IncidentCommander" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentCommander()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTCOMMANDER$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "IncidentCommander" element
         */
        public void setIncidentCommander(java.lang.String incidentCommander)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTCOMMANDER$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTCOMMANDER$12);
                }
                target.setStringValue(incidentCommander);
            }
        }
        
        /**
         * Sets (as xml) the "IncidentCommander" element
         */
        public void xsetIncidentCommander(org.apache.xmlbeans.XmlString incidentCommander)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTCOMMANDER$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTCOMMANDER$12);
                }
                target.set(incidentCommander);
            }
        }
        
        /**
         * Gets the "Jurisdiction" element
         */
        public java.lang.String getJurisdiction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JURISDICTION$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Jurisdiction" element
         */
        public org.apache.xmlbeans.XmlString xgetJurisdiction()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JURISDICTION$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Jurisdiction" element
         */
        public void setJurisdiction(java.lang.String jurisdiction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JURISDICTION$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JURISDICTION$14);
                }
                target.setStringValue(jurisdiction);
            }
        }
        
        /**
         * Sets (as xml) the "Jurisdiction" element
         */
        public void xsetJurisdiction(org.apache.xmlbeans.XmlString jurisdiction)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JURISDICTION$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JURISDICTION$14);
                }
                target.set(jurisdiction);
            }
        }
        
        /**
         * Gets the "County" element
         */
        public java.lang.String getCounty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "County" element
         */
        public org.apache.xmlbeans.XmlString xgetCounty()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTY$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "County" element
         */
        public void setCounty(java.lang.String county)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTY$16);
                }
                target.setStringValue(county);
            }
        }
        
        /**
         * Sets (as xml) the "County" element
         */
        public void xsetCounty(org.apache.xmlbeans.XmlString county)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTY$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTY$16);
                }
                target.set(county);
            }
        }
        
        /**
         * Gets the "TypeIncident" element
         */
        public java.lang.String getTypeIncident()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEINCIDENT$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "TypeIncident" element
         */
        public org.apache.xmlbeans.XmlString xgetTypeIncident()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEINCIDENT$18, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TypeIncident" element
         */
        public void setTypeIncident(java.lang.String typeIncident)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPEINCIDENT$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPEINCIDENT$18);
                }
                target.setStringValue(typeIncident);
            }
        }
        
        /**
         * Sets (as xml) the "TypeIncident" element
         */
        public void xsetTypeIncident(org.apache.xmlbeans.XmlString typeIncident)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPEINCIDENT$18, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPEINCIDENT$18);
                }
                target.set(typeIncident);
            }
        }
        
        /**
         * Gets the "Location" element
         */
        public java.lang.String getLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Location" element
         */
        public org.apache.xmlbeans.XmlString xgetLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Location" element
         */
        public void setLocation(java.lang.String location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATION$20);
                }
                target.setStringValue(location);
            }
        }
        
        /**
         * Sets (as xml) the "Location" element
         */
        public void xsetLocation(org.apache.xmlbeans.XmlString location)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATION$20);
                }
                target.set(location);
            }
        }
        
        /**
         * Gets the "StartedDateTime" element
         */
        public java.util.Calendar getStartedDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTEDDATETIME$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "StartedDateTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetStartedDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTEDDATETIME$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "StartedDateTime" element
         */
        public void setStartedDateTime(java.util.Calendar startedDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTEDDATETIME$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTEDDATETIME$22);
                }
                target.setCalendarValue(startedDateTime);
            }
        }
        
        /**
         * Sets (as xml) the "StartedDateTime" element
         */
        public void xsetStartedDateTime(org.apache.xmlbeans.XmlDateTime startedDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(STARTEDDATETIME$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(STARTEDDATETIME$22);
                }
                target.set(startedDateTime);
            }
        }
        
        /**
         * Gets the "Cause" element
         */
        public java.lang.String getCause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAUSE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Cause" element
         */
        public org.apache.xmlbeans.XmlString xgetCause()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAUSE$24, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Cause" element
         */
        public void setCause(java.lang.String cause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAUSE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAUSE$24);
                }
                target.setStringValue(cause);
            }
        }
        
        /**
         * Sets (as xml) the "Cause" element
         */
        public void xsetCause(org.apache.xmlbeans.XmlString cause)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAUSE$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAUSE$24);
                }
                target.set(cause);
            }
        }
        
        /**
         * Gets the "AreaInvolved" element
         */
        public java.lang.String getAreaInvolved()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREAINVOLVED$26, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AreaInvolved" element
         */
        public org.apache.xmlbeans.XmlString xgetAreaInvolved()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREAINVOLVED$26, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AreaInvolved" element
         */
        public void setAreaInvolved(java.lang.String areaInvolved)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AREAINVOLVED$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AREAINVOLVED$26);
                }
                target.setStringValue(areaInvolved);
            }
        }
        
        /**
         * Sets (as xml) the "AreaInvolved" element
         */
        public void xsetAreaInvolved(org.apache.xmlbeans.XmlString areaInvolved)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AREAINVOLVED$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AREAINVOLVED$26);
                }
                target.set(areaInvolved);
            }
        }
        
        /**
         * Gets the "PercentControlled" element
         */
        public java.lang.String getPercentControlled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTCONTROLLED$28, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PercentControlled" element
         */
        public org.apache.xmlbeans.XmlString xgetPercentControlled()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERCENTCONTROLLED$28, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PercentControlled" element
         */
        public void setPercentControlled(java.lang.String percentControlled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTCONTROLLED$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERCENTCONTROLLED$28);
                }
                target.setStringValue(percentControlled);
            }
        }
        
        /**
         * Sets (as xml) the "PercentControlled" element
         */
        public void xsetPercentControlled(org.apache.xmlbeans.XmlString percentControlled)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PERCENTCONTROLLED$28, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PERCENTCONTROLLED$28);
                }
                target.set(percentControlled);
            }
        }
        
        /**
         * Gets the "ExpectedContainmentDateTime" element
         */
        public java.util.Calendar getExpectedContainmentDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPECTEDCONTAINMENTDATETIME$30, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "ExpectedContainmentDateTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetExpectedContainmentDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPECTEDCONTAINMENTDATETIME$30, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ExpectedContainmentDateTime" element
         */
        public void setExpectedContainmentDateTime(java.util.Calendar expectedContainmentDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPECTEDCONTAINMENTDATETIME$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPECTEDCONTAINMENTDATETIME$30);
                }
                target.setCalendarValue(expectedContainmentDateTime);
            }
        }
        
        /**
         * Sets (as xml) the "ExpectedContainmentDateTime" element
         */
        public void xsetExpectedContainmentDateTime(org.apache.xmlbeans.XmlDateTime expectedContainmentDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EXPECTEDCONTAINMENTDATETIME$30, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EXPECTEDCONTAINMENTDATETIME$30);
                }
                target.set(expectedContainmentDateTime);
            }
        }
        
        /**
         * Gets the "EstimatedControlledDateTime" element
         */
        public java.util.Calendar getEstimatedControlledDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEDCONTROLLEDDATETIME$32, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "EstimatedControlledDateTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetEstimatedControlledDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ESTIMATEDCONTROLLEDDATETIME$32, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EstimatedControlledDateTime" element
         */
        public void setEstimatedControlledDateTime(java.util.Calendar estimatedControlledDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTIMATEDCONTROLLEDDATETIME$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTIMATEDCONTROLLEDDATETIME$32);
                }
                target.setCalendarValue(estimatedControlledDateTime);
            }
        }
        
        /**
         * Sets (as xml) the "EstimatedControlledDateTime" element
         */
        public void xsetEstimatedControlledDateTime(org.apache.xmlbeans.XmlDateTime estimatedControlledDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ESTIMATEDCONTROLLEDDATETIME$32, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ESTIMATEDCONTROLLEDDATETIME$32);
                }
                target.set(estimatedControlledDateTime);
            }
        }
        
        /**
         * Gets the "DeclaredControlledDateTime" element
         */
        public java.util.Calendar getDeclaredControlledDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECLAREDCONTROLLEDDATETIME$34, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DeclaredControlledDateTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetDeclaredControlledDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DECLAREDCONTROLLEDDATETIME$34, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DeclaredControlledDateTime" element
         */
        public void setDeclaredControlledDateTime(java.util.Calendar declaredControlledDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DECLAREDCONTROLLEDDATETIME$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DECLAREDCONTROLLEDDATETIME$34);
                }
                target.setCalendarValue(declaredControlledDateTime);
            }
        }
        
        /**
         * Sets (as xml) the "DeclaredControlledDateTime" element
         */
        public void xsetDeclaredControlledDateTime(org.apache.xmlbeans.XmlDateTime declaredControlledDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DECLAREDCONTROLLEDDATETIME$34, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DECLAREDCONTROLLEDDATETIME$34);
                }
                target.set(declaredControlledDateTime);
            }
        }
        
        /**
         * Gets the "CurrentThreat" element
         */
        public java.lang.String getCurrentThreat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTTHREAT$36, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CurrentThreat" element
         */
        public org.apache.xmlbeans.XmlString xgetCurrentThreat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENTTHREAT$36, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CurrentThreat" element
         */
        public void setCurrentThreat(java.lang.String currentThreat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTTHREAT$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTTHREAT$36);
                }
                target.setStringValue(currentThreat);
            }
        }
        
        /**
         * Sets (as xml) the "CurrentThreat" element
         */
        public void xsetCurrentThreat(org.apache.xmlbeans.XmlString currentThreat)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENTTHREAT$36, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENTTHREAT$36);
                }
                target.set(currentThreat);
            }
        }
        
        /**
         * Gets the "ControlProblems" element
         */
        public java.lang.String getControlProblems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTROLPROBLEMS$38, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ControlProblems" element
         */
        public org.apache.xmlbeans.XmlString xgetControlProblems()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTROLPROBLEMS$38, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ControlProblems" element
         */
        public void setControlProblems(java.lang.String controlProblems)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTROLPROBLEMS$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTROLPROBLEMS$38);
                }
                target.setStringValue(controlProblems);
            }
        }
        
        /**
         * Sets (as xml) the "ControlProblems" element
         */
        public void xsetControlProblems(org.apache.xmlbeans.XmlString controlProblems)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTROLPROBLEMS$38, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTROLPROBLEMS$38);
                }
                target.set(controlProblems);
            }
        }
        
        /**
         * Gets the "EstLoss" element
         */
        public java.lang.String getEstLoss()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTLOSS$40, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EstLoss" element
         */
        public org.apache.xmlbeans.XmlString xgetEstLoss()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTLOSS$40, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EstLoss" element
         */
        public void setEstLoss(java.lang.String estLoss)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTLOSS$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTLOSS$40);
                }
                target.setStringValue(estLoss);
            }
        }
        
        /**
         * Sets (as xml) the "EstLoss" element
         */
        public void xsetEstLoss(org.apache.xmlbeans.XmlString estLoss)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTLOSS$40, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTLOSS$40);
                }
                target.set(estLoss);
            }
        }
        
        /**
         * Gets the "EstSavings" element
         */
        public java.lang.String getEstSavings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTSAVINGS$42, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EstSavings" element
         */
        public org.apache.xmlbeans.XmlString xgetEstSavings()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTSAVINGS$42, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EstSavings" element
         */
        public void setEstSavings(java.lang.String estSavings)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTSAVINGS$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTSAVINGS$42);
                }
                target.setStringValue(estSavings);
            }
        }
        
        /**
         * Sets (as xml) the "EstSavings" element
         */
        public void xsetEstSavings(org.apache.xmlbeans.XmlString estSavings)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTSAVINGS$42, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTSAVINGS$42);
                }
                target.set(estSavings);
            }
        }
        
        /**
         * Gets the "Injuries" element
         */
        public java.lang.String getInjuries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INJURIES$44, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Injuries" element
         */
        public org.apache.xmlbeans.XmlString xgetInjuries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INJURIES$44, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Injuries" element
         */
        public void setInjuries(java.lang.String injuries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INJURIES$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INJURIES$44);
                }
                target.setStringValue(injuries);
            }
        }
        
        /**
         * Sets (as xml) the "Injuries" element
         */
        public void xsetInjuries(org.apache.xmlbeans.XmlString injuries)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INJURIES$44, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INJURIES$44);
                }
                target.set(injuries);
            }
        }
        
        /**
         * Gets the "Deaths" element
         */
        public java.lang.String getDeaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEATHS$46, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Deaths" element
         */
        public org.apache.xmlbeans.XmlString xgetDeaths()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEATHS$46, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Deaths" element
         */
        public void setDeaths(java.lang.String deaths)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEATHS$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEATHS$46);
                }
                target.setStringValue(deaths);
            }
        }
        
        /**
         * Sets (as xml) the "Deaths" element
         */
        public void xsetDeaths(org.apache.xmlbeans.XmlString deaths)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEATHS$46, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEATHS$46);
                }
                target.set(deaths);
            }
        }
        
        /**
         * Gets the "LineBuilt" element
         */
        public java.lang.String getLineBuilt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINEBUILT$48, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LineBuilt" element
         */
        public org.apache.xmlbeans.XmlString xgetLineBuilt()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINEBUILT$48, 0);
                return target;
            }
        }
        
        /**
         * Sets the "LineBuilt" element
         */
        public void setLineBuilt(java.lang.String lineBuilt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINEBUILT$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINEBUILT$48);
                }
                target.setStringValue(lineBuilt);
            }
        }
        
        /**
         * Sets (as xml) the "LineBuilt" element
         */
        public void xsetLineBuilt(org.apache.xmlbeans.XmlString lineBuilt)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINEBUILT$48, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINEBUILT$48);
                }
                target.set(lineBuilt);
            }
        }
        
        /**
         * Gets the "LineToBuild" element
         */
        public java.lang.String getLineToBuild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINETOBUILD$50, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "LineToBuild" element
         */
        public org.apache.xmlbeans.XmlString xgetLineToBuild()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINETOBUILD$50, 0);
                return target;
            }
        }
        
        /**
         * Sets the "LineToBuild" element
         */
        public void setLineToBuild(java.lang.String lineToBuild)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LINETOBUILD$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LINETOBUILD$50);
                }
                target.setStringValue(lineToBuild);
            }
        }
        
        /**
         * Sets (as xml) the "LineToBuild" element
         */
        public void xsetLineToBuild(org.apache.xmlbeans.XmlString lineToBuild)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LINETOBUILD$50, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LINETOBUILD$50);
                }
                target.set(lineToBuild);
            }
        }
        
        /**
         * Gets the "CurrentWeatherWS" element
         */
        public java.lang.String getCurrentWeatherWS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTWEATHERWS$52, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CurrentWeatherWS" element
         */
        public org.apache.xmlbeans.XmlString xgetCurrentWeatherWS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENTWEATHERWS$52, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CurrentWeatherWS" element
         */
        public void setCurrentWeatherWS(java.lang.String currentWeatherWS)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTWEATHERWS$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTWEATHERWS$52);
                }
                target.setStringValue(currentWeatherWS);
            }
        }
        
        /**
         * Sets (as xml) the "CurrentWeatherWS" element
         */
        public void xsetCurrentWeatherWS(org.apache.xmlbeans.XmlString currentWeatherWS)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENTWEATHERWS$52, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENTWEATHERWS$52);
                }
                target.set(currentWeatherWS);
            }
        }
        
        /**
         * Gets the "CurrentWeatherWD" element
         */
        public java.lang.String getCurrentWeatherWD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTWEATHERWD$54, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CurrentWeatherWD" element
         */
        public org.apache.xmlbeans.XmlString xgetCurrentWeatherWD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENTWEATHERWD$54, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CurrentWeatherWD" element
         */
        public void setCurrentWeatherWD(java.lang.String currentWeatherWD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTWEATHERWD$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTWEATHERWD$54);
                }
                target.setStringValue(currentWeatherWD);
            }
        }
        
        /**
         * Sets (as xml) the "CurrentWeatherWD" element
         */
        public void xsetCurrentWeatherWD(org.apache.xmlbeans.XmlString currentWeatherWD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENTWEATHERWD$54, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENTWEATHERWD$54);
                }
                target.set(currentWeatherWD);
            }
        }
        
        /**
         * Gets the "CurrentWeatherTemp" element
         */
        public java.lang.String getCurrentWeatherTemp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTWEATHERTEMP$56, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CurrentWeatherTemp" element
         */
        public org.apache.xmlbeans.XmlString xgetCurrentWeatherTemp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENTWEATHERTEMP$56, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CurrentWeatherTemp" element
         */
        public void setCurrentWeatherTemp(java.lang.String currentWeatherTemp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTWEATHERTEMP$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTWEATHERTEMP$56);
                }
                target.setStringValue(currentWeatherTemp);
            }
        }
        
        /**
         * Sets (as xml) the "CurrentWeatherTemp" element
         */
        public void xsetCurrentWeatherTemp(org.apache.xmlbeans.XmlString currentWeatherTemp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENTWEATHERTEMP$56, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENTWEATHERTEMP$56);
                }
                target.set(currentWeatherTemp);
            }
        }
        
        /**
         * Gets the "CurrentWeatherRH" element
         */
        public java.lang.String getCurrentWeatherRH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTWEATHERRH$58, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CurrentWeatherRH" element
         */
        public org.apache.xmlbeans.XmlString xgetCurrentWeatherRH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENTWEATHERRH$58, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CurrentWeatherRH" element
         */
        public void setCurrentWeatherRH(java.lang.String currentWeatherRH)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTWEATHERRH$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTWEATHERRH$58);
                }
                target.setStringValue(currentWeatherRH);
            }
        }
        
        /**
         * Sets (as xml) the "CurrentWeatherRH" element
         */
        public void xsetCurrentWeatherRH(org.apache.xmlbeans.XmlString currentWeatherRH)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CURRENTWEATHERRH$58, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CURRENTWEATHERRH$58);
                }
                target.set(currentWeatherRH);
            }
        }
        
        /**
         * Gets the "PredictedWeatherWS" element
         */
        public java.lang.String getPredictedWeatherWS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREDICTEDWEATHERWS$60, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PredictedWeatherWS" element
         */
        public org.apache.xmlbeans.XmlString xgetPredictedWeatherWS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREDICTEDWEATHERWS$60, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PredictedWeatherWS" element
         */
        public void setPredictedWeatherWS(java.lang.String predictedWeatherWS)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREDICTEDWEATHERWS$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREDICTEDWEATHERWS$60);
                }
                target.setStringValue(predictedWeatherWS);
            }
        }
        
        /**
         * Sets (as xml) the "PredictedWeatherWS" element
         */
        public void xsetPredictedWeatherWS(org.apache.xmlbeans.XmlString predictedWeatherWS)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREDICTEDWEATHERWS$60, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREDICTEDWEATHERWS$60);
                }
                target.set(predictedWeatherWS);
            }
        }
        
        /**
         * Gets the "PredictedWeatherWD" element
         */
        public java.lang.String getPredictedWeatherWD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREDICTEDWEATHERWD$62, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PredictedWeatherWD" element
         */
        public org.apache.xmlbeans.XmlString xgetPredictedWeatherWD()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREDICTEDWEATHERWD$62, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PredictedWeatherWD" element
         */
        public void setPredictedWeatherWD(java.lang.String predictedWeatherWD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREDICTEDWEATHERWD$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREDICTEDWEATHERWD$62);
                }
                target.setStringValue(predictedWeatherWD);
            }
        }
        
        /**
         * Sets (as xml) the "PredictedWeatherWD" element
         */
        public void xsetPredictedWeatherWD(org.apache.xmlbeans.XmlString predictedWeatherWD)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREDICTEDWEATHERWD$62, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREDICTEDWEATHERWD$62);
                }
                target.set(predictedWeatherWD);
            }
        }
        
        /**
         * Gets the "PredictedWeatherTemp" element
         */
        public java.lang.String getPredictedWeatherTemp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREDICTEDWEATHERTEMP$64, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PredictedWeatherTemp" element
         */
        public org.apache.xmlbeans.XmlString xgetPredictedWeatherTemp()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREDICTEDWEATHERTEMP$64, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PredictedWeatherTemp" element
         */
        public void setPredictedWeatherTemp(java.lang.String predictedWeatherTemp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREDICTEDWEATHERTEMP$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREDICTEDWEATHERTEMP$64);
                }
                target.setStringValue(predictedWeatherTemp);
            }
        }
        
        /**
         * Sets (as xml) the "PredictedWeatherTemp" element
         */
        public void xsetPredictedWeatherTemp(org.apache.xmlbeans.XmlString predictedWeatherTemp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREDICTEDWEATHERTEMP$64, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREDICTEDWEATHERTEMP$64);
                }
                target.set(predictedWeatherTemp);
            }
        }
        
        /**
         * Gets the "PredictedWeatherRH" element
         */
        public java.lang.String getPredictedWeatherRH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREDICTEDWEATHERRH$66, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "PredictedWeatherRH" element
         */
        public org.apache.xmlbeans.XmlString xgetPredictedWeatherRH()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREDICTEDWEATHERRH$66, 0);
                return target;
            }
        }
        
        /**
         * Sets the "PredictedWeatherRH" element
         */
        public void setPredictedWeatherRH(java.lang.String predictedWeatherRH)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREDICTEDWEATHERRH$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREDICTEDWEATHERRH$66);
                }
                target.setStringValue(predictedWeatherRH);
            }
        }
        
        /**
         * Sets (as xml) the "PredictedWeatherRH" element
         */
        public void xsetPredictedWeatherRH(org.apache.xmlbeans.XmlString predictedWeatherRH)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREDICTEDWEATHERRH$66, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREDICTEDWEATHERRH$66);
                }
                target.set(predictedWeatherRH);
            }
        }
        
        /**
         * Gets the "CostToDate" element
         */
        public java.lang.String getCostToDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COSTTODATE$68, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CostToDate" element
         */
        public org.apache.xmlbeans.XmlString xgetCostToDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COSTTODATE$68, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CostToDate" element
         */
        public void setCostToDate(java.lang.String costToDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COSTTODATE$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COSTTODATE$68);
                }
                target.setStringValue(costToDate);
            }
        }
        
        /**
         * Sets (as xml) the "CostToDate" element
         */
        public void xsetCostToDate(org.apache.xmlbeans.XmlString costToDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COSTTODATE$68, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COSTTODATE$68);
                }
                target.set(costToDate);
            }
        }
        
        /**
         * Gets the "EstTotalCost" element
         */
        public java.lang.String getEstTotalCost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTTOTALCOST$70, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "EstTotalCost" element
         */
        public org.apache.xmlbeans.XmlString xgetEstTotalCost()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTTOTALCOST$70, 0);
                return target;
            }
        }
        
        /**
         * Sets the "EstTotalCost" element
         */
        public void setEstTotalCost(java.lang.String estTotalCost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTTOTALCOST$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTTOTALCOST$70);
                }
                target.setStringValue(estTotalCost);
            }
        }
        
        /**
         * Sets (as xml) the "EstTotalCost" element
         */
        public void xsetEstTotalCost(org.apache.xmlbeans.XmlString estTotalCost)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTTOTALCOST$70, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTTOTALCOST$70);
                }
                target.set(estTotalCost);
            }
        }
        
        /**
         * Gets the "CooperatingAgencies" element
         */
        public java.lang.String getCooperatingAgencies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COOPERATINGAGENCIES$72, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CooperatingAgencies" element
         */
        public org.apache.xmlbeans.XmlString xgetCooperatingAgencies()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COOPERATINGAGENCIES$72, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CooperatingAgencies" element
         */
        public void setCooperatingAgencies(java.lang.String cooperatingAgencies)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COOPERATINGAGENCIES$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COOPERATINGAGENCIES$72);
                }
                target.setStringValue(cooperatingAgencies);
            }
        }
        
        /**
         * Sets (as xml) the "CooperatingAgencies" element
         */
        public void xsetCooperatingAgencies(org.apache.xmlbeans.XmlString cooperatingAgencies)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COOPERATINGAGENCIES$72, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COOPERATINGAGENCIES$72);
                }
                target.set(cooperatingAgencies);
            }
        }
        
        /**
         * Gets the "Remarks" element
         */
        public java.lang.String getRemarks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMARKS$74, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Remarks" element
         */
        public org.apache.xmlbeans.XmlString xgetRemarks()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REMARKS$74, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Remarks" element
         */
        public void setRemarks(java.lang.String remarks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMARKS$74, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REMARKS$74);
                }
                target.setStringValue(remarks);
            }
        }
        
        /**
         * Sets (as xml) the "Remarks" element
         */
        public void xsetRemarks(org.apache.xmlbeans.XmlString remarks)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REMARKS$74, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REMARKS$74);
                }
                target.set(remarks);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$76, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$76, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$76, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREPAREDBY$76);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$76, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREPAREDBY$76);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVEDBY$78, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVEDBY$78, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVEDBY$78, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVEDBY$78);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVEDBY$78, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVEDBY$78);
                }
                target.set(approvedBy);
            }
        }
        
        /**
         * Gets the "SentToDate" element
         */
        public java.lang.String getSentToDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTTODATE$80, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SentToDate" element
         */
        public org.apache.xmlbeans.XmlString xgetSentToDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENTTODATE$80, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SentToDate" element
         */
        public void setSentToDate(java.lang.String sentToDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTTODATE$80, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENTTODATE$80);
                }
                target.setStringValue(sentToDate);
            }
        }
        
        /**
         * Sets (as xml) the "SentToDate" element
         */
        public void xsetSentToDate(org.apache.xmlbeans.XmlString sentToDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENTTODATE$80, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENTTODATE$80);
                }
                target.set(sentToDate);
            }
        }
        
        /**
         * Gets the "SentToTime" element
         */
        public java.lang.String getSentToTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTTOTIME$82, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SentToTime" element
         */
        public org.apache.xmlbeans.XmlString xgetSentToTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENTTOTIME$82, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SentToTime" element
         */
        public void setSentToTime(java.lang.String sentToTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTTOTIME$82, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENTTOTIME$82);
                }
                target.setStringValue(sentToTime);
            }
        }
        
        /**
         * Sets (as xml) the "SentToTime" element
         */
        public void xsetSentToTime(org.apache.xmlbeans.XmlString sentToTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENTTOTIME$82, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENTTOTIME$82);
                }
                target.set(sentToTime);
            }
        }
        
        /**
         * Gets the "SentToBy" element
         */
        public java.lang.String getSentToBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTTOBY$84, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SentToBy" element
         */
        public org.apache.xmlbeans.XmlString xgetSentToBy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENTTOBY$84, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SentToBy" element
         */
        public void setSentToBy(java.lang.String sentToBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENTTOBY$84, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENTTOBY$84);
                }
                target.setStringValue(sentToBy);
            }
        }
        
        /**
         * Sets (as xml) the "SentToBy" element
         */
        public void xsetSentToBy(org.apache.xmlbeans.XmlString sentToBy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENTTOBY$84, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENTTOBY$84);
                }
                target.set(sentToBy);
            }
        }
    }
}
