/*
 * An XML document type.
 * Localname: ICSForm203
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.ICSForm203Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203.impl;
/**
 * A document containing one ICSForm203(@http://uicds.org/ICSForm203) element.
 *
 * This is a complex type.
 */
public class ICSForm203DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm203.ICSForm203Document
{
    private static final long serialVersionUID = 1L;
    
    public ICSForm203DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ICSFORM203$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "ICSForm203");
    
    
    /**
     * Gets the "ICSForm203" element
     */
    public org.uicds.icsForm203.ICSForm203Document.ICSForm203 getICSForm203()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.ICSForm203Document.ICSForm203 target = null;
            target = (org.uicds.icsForm203.ICSForm203Document.ICSForm203)get_store().find_element_user(ICSFORM203$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ICSForm203" element
     */
    public void setICSForm203(org.uicds.icsForm203.ICSForm203Document.ICSForm203 icsForm203)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.ICSForm203Document.ICSForm203 target = null;
            target = (org.uicds.icsForm203.ICSForm203Document.ICSForm203)get_store().find_element_user(ICSFORM203$0, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm203.ICSForm203Document.ICSForm203)get_store().add_element_user(ICSFORM203$0);
            }
            target.set(icsForm203);
        }
    }
    
    /**
     * Appends and returns a new empty "ICSForm203" element
     */
    public org.uicds.icsForm203.ICSForm203Document.ICSForm203 addNewICSForm203()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm203.ICSForm203Document.ICSForm203 target = null;
            target = (org.uicds.icsForm203.ICSForm203Document.ICSForm203)get_store().add_element_user(ICSFORM203$0);
            return target;
        }
    }
    /**
     * An XML ICSForm203(@http://uicds.org/ICSForm203).
     *
     * This is a complex type.
     */
    public static class ICSForm203Impl extends org.uicds.icsFormCommon.impl.ICSFormDocumentTypeImpl implements org.uicds.icsForm203.ICSForm203Document.ICSForm203
    {
        private static final long serialVersionUID = 1L;
        
        public ICSForm203Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTNAME$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "IncidentName");
        private static final javax.xml.namespace.QName DATEPREPARED$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "DatePrepared");
        private static final javax.xml.namespace.QName TIMEPREPARED$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "TimePrepared");
        private static final javax.xml.namespace.QName OPERATIONALPERIOD$6 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "OperationalPeriod");
        private static final javax.xml.namespace.QName INCIDENTCOMMANDANDSTAFF$8 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "IncidentCommandAndStaff");
        private static final javax.xml.namespace.QName AGENCYREPRESENTATIVES$10 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "AgencyRepresentatives");
        private static final javax.xml.namespace.QName PLANNINGSECTION$12 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "PlanningSection");
        private static final javax.xml.namespace.QName LOGISTICSSECTION$14 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "LogisticsSection");
        private static final javax.xml.namespace.QName OPERATIONSSECTION$16 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "OperationsSection");
        private static final javax.xml.namespace.QName FINANCEADMINISTRATIONSECTION$18 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "FinanceAdministrationSection");
        private static final javax.xml.namespace.QName PREPAREDBY$20 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "PreparedBy");
        
        
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
         * Gets the "IncidentCommandAndStaff" element
         */
        public org.uicds.icsForm203.IncidentCommandAndStaffType getIncidentCommandAndStaff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.IncidentCommandAndStaffType target = null;
                target = (org.uicds.icsForm203.IncidentCommandAndStaffType)get_store().find_element_user(INCIDENTCOMMANDANDSTAFF$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "IncidentCommandAndStaff" element
         */
        public void setIncidentCommandAndStaff(org.uicds.icsForm203.IncidentCommandAndStaffType incidentCommandAndStaff)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.IncidentCommandAndStaffType target = null;
                target = (org.uicds.icsForm203.IncidentCommandAndStaffType)get_store().find_element_user(INCIDENTCOMMANDANDSTAFF$8, 0);
                if (target == null)
                {
                    target = (org.uicds.icsForm203.IncidentCommandAndStaffType)get_store().add_element_user(INCIDENTCOMMANDANDSTAFF$8);
                }
                target.set(incidentCommandAndStaff);
            }
        }
        
        /**
         * Appends and returns a new empty "IncidentCommandAndStaff" element
         */
        public org.uicds.icsForm203.IncidentCommandAndStaffType addNewIncidentCommandAndStaff()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.IncidentCommandAndStaffType target = null;
                target = (org.uicds.icsForm203.IncidentCommandAndStaffType)get_store().add_element_user(INCIDENTCOMMANDANDSTAFF$8);
                return target;
            }
        }
        
        /**
         * Gets array of all "AgencyRepresentatives" elements
         */
        public org.uicds.icsForm203.AgencyRepresentativeType[] getAgencyRepresentativesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(AGENCYREPRESENTATIVES$10, targetList);
                org.uicds.icsForm203.AgencyRepresentativeType[] result = new org.uicds.icsForm203.AgencyRepresentativeType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "AgencyRepresentatives" element
         */
        public org.uicds.icsForm203.AgencyRepresentativeType getAgencyRepresentativesArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.AgencyRepresentativeType target = null;
                target = (org.uicds.icsForm203.AgencyRepresentativeType)get_store().find_element_user(AGENCYREPRESENTATIVES$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "AgencyRepresentatives" element
         */
        public int sizeOfAgencyRepresentativesArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(AGENCYREPRESENTATIVES$10);
            }
        }
        
        /**
         * Sets array of all "AgencyRepresentatives" element
         */
        public void setAgencyRepresentativesArray(org.uicds.icsForm203.AgencyRepresentativeType[] agencyRepresentativesArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(agencyRepresentativesArray, AGENCYREPRESENTATIVES$10);
            }
        }
        
        /**
         * Sets ith "AgencyRepresentatives" element
         */
        public void setAgencyRepresentativesArray(int i, org.uicds.icsForm203.AgencyRepresentativeType agencyRepresentatives)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.AgencyRepresentativeType target = null;
                target = (org.uicds.icsForm203.AgencyRepresentativeType)get_store().find_element_user(AGENCYREPRESENTATIVES$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(agencyRepresentatives);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "AgencyRepresentatives" element
         */
        public org.uicds.icsForm203.AgencyRepresentativeType insertNewAgencyRepresentatives(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.AgencyRepresentativeType target = null;
                target = (org.uicds.icsForm203.AgencyRepresentativeType)get_store().insert_element_user(AGENCYREPRESENTATIVES$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "AgencyRepresentatives" element
         */
        public org.uicds.icsForm203.AgencyRepresentativeType addNewAgencyRepresentatives()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.AgencyRepresentativeType target = null;
                target = (org.uicds.icsForm203.AgencyRepresentativeType)get_store().add_element_user(AGENCYREPRESENTATIVES$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "AgencyRepresentatives" element
         */
        public void removeAgencyRepresentatives(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(AGENCYREPRESENTATIVES$10, i);
            }
        }
        
        /**
         * Gets the "PlanningSection" element
         */
        public org.uicds.icsForm203.PlanningSectionType getPlanningSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.PlanningSectionType target = null;
                target = (org.uicds.icsForm203.PlanningSectionType)get_store().find_element_user(PLANNINGSECTION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "PlanningSection" element
         */
        public void setPlanningSection(org.uicds.icsForm203.PlanningSectionType planningSection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.PlanningSectionType target = null;
                target = (org.uicds.icsForm203.PlanningSectionType)get_store().find_element_user(PLANNINGSECTION$12, 0);
                if (target == null)
                {
                    target = (org.uicds.icsForm203.PlanningSectionType)get_store().add_element_user(PLANNINGSECTION$12);
                }
                target.set(planningSection);
            }
        }
        
        /**
         * Appends and returns a new empty "PlanningSection" element
         */
        public org.uicds.icsForm203.PlanningSectionType addNewPlanningSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.PlanningSectionType target = null;
                target = (org.uicds.icsForm203.PlanningSectionType)get_store().add_element_user(PLANNINGSECTION$12);
                return target;
            }
        }
        
        /**
         * Gets the "LogisticsSection" element
         */
        public org.uicds.icsForm203.LogisticsSectionType getLogisticsSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.LogisticsSectionType target = null;
                target = (org.uicds.icsForm203.LogisticsSectionType)get_store().find_element_user(LOGISTICSSECTION$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "LogisticsSection" element
         */
        public void setLogisticsSection(org.uicds.icsForm203.LogisticsSectionType logisticsSection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.LogisticsSectionType target = null;
                target = (org.uicds.icsForm203.LogisticsSectionType)get_store().find_element_user(LOGISTICSSECTION$14, 0);
                if (target == null)
                {
                    target = (org.uicds.icsForm203.LogisticsSectionType)get_store().add_element_user(LOGISTICSSECTION$14);
                }
                target.set(logisticsSection);
            }
        }
        
        /**
         * Appends and returns a new empty "LogisticsSection" element
         */
        public org.uicds.icsForm203.LogisticsSectionType addNewLogisticsSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.LogisticsSectionType target = null;
                target = (org.uicds.icsForm203.LogisticsSectionType)get_store().add_element_user(LOGISTICSSECTION$14);
                return target;
            }
        }
        
        /**
         * Gets the "OperationsSection" element
         */
        public org.uicds.icsForm203.OperationsSectionType getOperationsSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.OperationsSectionType target = null;
                target = (org.uicds.icsForm203.OperationsSectionType)get_store().find_element_user(OPERATIONSSECTION$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "OperationsSection" element
         */
        public void setOperationsSection(org.uicds.icsForm203.OperationsSectionType operationsSection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.OperationsSectionType target = null;
                target = (org.uicds.icsForm203.OperationsSectionType)get_store().find_element_user(OPERATIONSSECTION$16, 0);
                if (target == null)
                {
                    target = (org.uicds.icsForm203.OperationsSectionType)get_store().add_element_user(OPERATIONSSECTION$16);
                }
                target.set(operationsSection);
            }
        }
        
        /**
         * Appends and returns a new empty "OperationsSection" element
         */
        public org.uicds.icsForm203.OperationsSectionType addNewOperationsSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.OperationsSectionType target = null;
                target = (org.uicds.icsForm203.OperationsSectionType)get_store().add_element_user(OPERATIONSSECTION$16);
                return target;
            }
        }
        
        /**
         * Gets the "FinanceAdministrationSection" element
         */
        public org.uicds.icsForm203.FinanceAdministrationSectionType getFinanceAdministrationSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.FinanceAdministrationSectionType target = null;
                target = (org.uicds.icsForm203.FinanceAdministrationSectionType)get_store().find_element_user(FINANCEADMINISTRATIONSECTION$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "FinanceAdministrationSection" element
         */
        public void setFinanceAdministrationSection(org.uicds.icsForm203.FinanceAdministrationSectionType financeAdministrationSection)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.FinanceAdministrationSectionType target = null;
                target = (org.uicds.icsForm203.FinanceAdministrationSectionType)get_store().find_element_user(FINANCEADMINISTRATIONSECTION$18, 0);
                if (target == null)
                {
                    target = (org.uicds.icsForm203.FinanceAdministrationSectionType)get_store().add_element_user(FINANCEADMINISTRATIONSECTION$18);
                }
                target.set(financeAdministrationSection);
            }
        }
        
        /**
         * Appends and returns a new empty "FinanceAdministrationSection" element
         */
        public org.uicds.icsForm203.FinanceAdministrationSectionType addNewFinanceAdministrationSection()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm203.FinanceAdministrationSectionType target = null;
                target = (org.uicds.icsForm203.FinanceAdministrationSectionType)get_store().add_element_user(FINANCEADMINISTRATIONSECTION$18);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$20, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$20, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREPAREDBY$20);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREPAREDBY$20);
                }
                target.set(preparedBy);
            }
        }
    }
}
