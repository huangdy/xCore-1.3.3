/*
 * An XML document type.
 * Localname: ICSForm207
 * Namespace: http://uicds.org/ICSForm207
 * Java type: org.uicds.icsForm207.ICSForm207Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm207.impl;
/**
 * A document containing one ICSForm207(@http://uicds.org/ICSForm207) element.
 *
 * This is a complex type.
 */
public class ICSForm207DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm207.ICSForm207Document
{
    private static final long serialVersionUID = 1L;
    
    public ICSForm207DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ICSFORM207$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "ICSForm207");
    
    
    /**
     * Gets the "ICSForm207" element
     */
    public org.uicds.icsForm207.ICSForm207Document.ICSForm207 getICSForm207()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm207.ICSForm207Document.ICSForm207 target = null;
            target = (org.uicds.icsForm207.ICSForm207Document.ICSForm207)get_store().find_element_user(ICSFORM207$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ICSForm207" element
     */
    public void setICSForm207(org.uicds.icsForm207.ICSForm207Document.ICSForm207 icsForm207)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm207.ICSForm207Document.ICSForm207 target = null;
            target = (org.uicds.icsForm207.ICSForm207Document.ICSForm207)get_store().find_element_user(ICSFORM207$0, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm207.ICSForm207Document.ICSForm207)get_store().add_element_user(ICSFORM207$0);
            }
            target.set(icsForm207);
        }
    }
    
    /**
     * Appends and returns a new empty "ICSForm207" element
     */
    public org.uicds.icsForm207.ICSForm207Document.ICSForm207 addNewICSForm207()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm207.ICSForm207Document.ICSForm207 target = null;
            target = (org.uicds.icsForm207.ICSForm207Document.ICSForm207)get_store().add_element_user(ICSFORM207$0);
            return target;
        }
    }
    /**
     * An XML ICSForm207(@http://uicds.org/ICSForm207).
     *
     * This is a complex type.
     */
    public static class ICSForm207Impl extends org.uicds.icsFormCommon.impl.ICSFormDocumentTypeImpl implements org.uicds.icsForm207.ICSForm207Document.ICSForm207
    {
        private static final long serialVersionUID = 1L;
        
        public ICSForm207Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BRANCH$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "Branch");
        private static final javax.xml.namespace.QName DIVISIONGROUP$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "DivisionGroup");
        private static final javax.xml.namespace.QName INCIDENTNAME$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "IncidentName");
        private static final javax.xml.namespace.QName OPERATIONALPERIODDATE$6 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "OperationalPeriodDate");
        private static final javax.xml.namespace.QName OPERATIONALPERIODTIME$8 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "OperationalPeriodTime");
        private static final javax.xml.namespace.QName OPERATIONSCHIEF$10 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "OperationsChief");
        private static final javax.xml.namespace.QName BRANCHDIRECTOR$12 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "BranchDirector");
        private static final javax.xml.namespace.QName DIVISIONGROUPSUPERVISOR$14 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "DivisionGroupSupervisor");
        private static final javax.xml.namespace.QName AIRTACTICALGROUPSUPERVISOR$16 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "AirTacticalGroupSupervisor");
        private static final javax.xml.namespace.QName RESOURCESSUMMARY$18 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "ResourcesSummary");
        private static final javax.xml.namespace.QName CONTROLOPERATIONS$20 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "ControlOperations");
        private static final javax.xml.namespace.QName SPECIALINSTRUCTIONS$22 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "SpecialInstructions");
        private static final javax.xml.namespace.QName PREPAREDBY$24 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "PreparedBy");
        private static final javax.xml.namespace.QName APPROVEDBY$26 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm207", "ApprovedBy");
        
        
        /**
         * Gets the "Branch" element
         */
        public java.lang.String getBranch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANCH$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "Branch" element
         */
        public org.apache.xmlbeans.XmlString xgetBranch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANCH$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "Branch" element
         */
        public void setBranch(java.lang.String branch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANCH$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANCH$0);
                }
                target.setStringValue(branch);
            }
        }
        
        /**
         * Sets (as xml) the "Branch" element
         */
        public void xsetBranch(org.apache.xmlbeans.XmlString branch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANCH$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANCH$0);
                }
                target.set(branch);
            }
        }
        
        /**
         * Gets the "DivisionGroup" element
         */
        public java.lang.String getDivisionGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIVISIONGROUP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DivisionGroup" element
         */
        public org.apache.xmlbeans.XmlString xgetDivisionGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIVISIONGROUP$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DivisionGroup" element
         */
        public void setDivisionGroup(java.lang.String divisionGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIVISIONGROUP$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIVISIONGROUP$2);
                }
                target.setStringValue(divisionGroup);
            }
        }
        
        /**
         * Sets (as xml) the "DivisionGroup" element
         */
        public void xsetDivisionGroup(org.apache.xmlbeans.XmlString divisionGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIVISIONGROUP$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIVISIONGROUP$2);
                }
                target.set(divisionGroup);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNAME$4, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNAME$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTNAME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNAME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTNAME$4);
                }
                target.set(incidentName);
            }
        }
        
        /**
         * Gets the "OperationalPeriodDate" element
         */
        public java.util.Calendar getOperationalPeriodDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONALPERIODDATE$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "OperationalPeriodDate" element
         */
        public org.apache.xmlbeans.XmlDate xgetOperationalPeriodDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(OPERATIONALPERIODDATE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OperationalPeriodDate" element
         */
        public void setOperationalPeriodDate(java.util.Calendar operationalPeriodDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONALPERIODDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONALPERIODDATE$6);
                }
                target.setCalendarValue(operationalPeriodDate);
            }
        }
        
        /**
         * Sets (as xml) the "OperationalPeriodDate" element
         */
        public void xsetOperationalPeriodDate(org.apache.xmlbeans.XmlDate operationalPeriodDate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDate target = null;
                target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(OPERATIONALPERIODDATE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(OPERATIONALPERIODDATE$6);
                }
                target.set(operationalPeriodDate);
            }
        }
        
        /**
         * Gets the "OperationalPeriodTime" element
         */
        public java.util.Calendar getOperationalPeriodTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONALPERIODTIME$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "OperationalPeriodTime" element
         */
        public org.apache.xmlbeans.XmlTime xgetOperationalPeriodTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(OPERATIONALPERIODTIME$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OperationalPeriodTime" element
         */
        public void setOperationalPeriodTime(java.util.Calendar operationalPeriodTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONALPERIODTIME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONALPERIODTIME$8);
                }
                target.setCalendarValue(operationalPeriodTime);
            }
        }
        
        /**
         * Sets (as xml) the "OperationalPeriodTime" element
         */
        public void xsetOperationalPeriodTime(org.apache.xmlbeans.XmlTime operationalPeriodTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlTime target = null;
                target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(OPERATIONALPERIODTIME$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(OPERATIONALPERIODTIME$8);
                }
                target.set(operationalPeriodTime);
            }
        }
        
        /**
         * Gets the "OperationsChief" element
         */
        public java.lang.String getOperationsChief()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSCHIEF$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OperationsChief" element
         */
        public org.apache.xmlbeans.XmlString xgetOperationsChief()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONSCHIEF$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OperationsChief" element
         */
        public void setOperationsChief(java.lang.String operationsChief)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONSCHIEF$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONSCHIEF$10);
                }
                target.setStringValue(operationsChief);
            }
        }
        
        /**
         * Sets (as xml) the "OperationsChief" element
         */
        public void xsetOperationsChief(org.apache.xmlbeans.XmlString operationsChief)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONSCHIEF$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATIONSCHIEF$10);
                }
                target.set(operationsChief);
            }
        }
        
        /**
         * Gets the "BranchDirector" element
         */
        public java.lang.String getBranchDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANCHDIRECTOR$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "BranchDirector" element
         */
        public org.apache.xmlbeans.XmlString xgetBranchDirector()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANCHDIRECTOR$12, 0);
                return target;
            }
        }
        
        /**
         * Sets the "BranchDirector" element
         */
        public void setBranchDirector(java.lang.String branchDirector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANCHDIRECTOR$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANCHDIRECTOR$12);
                }
                target.setStringValue(branchDirector);
            }
        }
        
        /**
         * Sets (as xml) the "BranchDirector" element
         */
        public void xsetBranchDirector(org.apache.xmlbeans.XmlString branchDirector)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BRANCHDIRECTOR$12, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BRANCHDIRECTOR$12);
                }
                target.set(branchDirector);
            }
        }
        
        /**
         * Gets the "DivisionGroupSupervisor" element
         */
        public java.lang.String getDivisionGroupSupervisor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIVISIONGROUPSUPERVISOR$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DivisionGroupSupervisor" element
         */
        public org.apache.xmlbeans.XmlString xgetDivisionGroupSupervisor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIVISIONGROUPSUPERVISOR$14, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DivisionGroupSupervisor" element
         */
        public void setDivisionGroupSupervisor(java.lang.String divisionGroupSupervisor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIVISIONGROUPSUPERVISOR$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIVISIONGROUPSUPERVISOR$14);
                }
                target.setStringValue(divisionGroupSupervisor);
            }
        }
        
        /**
         * Sets (as xml) the "DivisionGroupSupervisor" element
         */
        public void xsetDivisionGroupSupervisor(org.apache.xmlbeans.XmlString divisionGroupSupervisor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIVISIONGROUPSUPERVISOR$14, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIVISIONGROUPSUPERVISOR$14);
                }
                target.set(divisionGroupSupervisor);
            }
        }
        
        /**
         * Gets the "AirTacticalGroupSupervisor" element
         */
        public java.lang.String getAirTacticalGroupSupervisor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRTACTICALGROUPSUPERVISOR$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "AirTacticalGroupSupervisor" element
         */
        public org.apache.xmlbeans.XmlString xgetAirTacticalGroupSupervisor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIRTACTICALGROUPSUPERVISOR$16, 0);
                return target;
            }
        }
        
        /**
         * Sets the "AirTacticalGroupSupervisor" element
         */
        public void setAirTacticalGroupSupervisor(java.lang.String airTacticalGroupSupervisor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRTACTICALGROUPSUPERVISOR$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRTACTICALGROUPSUPERVISOR$16);
                }
                target.setStringValue(airTacticalGroupSupervisor);
            }
        }
        
        /**
         * Sets (as xml) the "AirTacticalGroupSupervisor" element
         */
        public void xsetAirTacticalGroupSupervisor(org.apache.xmlbeans.XmlString airTacticalGroupSupervisor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AIRTACTICALGROUPSUPERVISOR$16, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AIRTACTICALGROUPSUPERVISOR$16);
                }
                target.set(airTacticalGroupSupervisor);
            }
        }
        
        /**
         * Gets array of all "ResourcesSummary" elements
         */
        public org.uicds.icsForm207.ResourcesSummaryType[] getResourcesSummaryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESOURCESSUMMARY$18, targetList);
                org.uicds.icsForm207.ResourcesSummaryType[] result = new org.uicds.icsForm207.ResourcesSummaryType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ResourcesSummary" element
         */
        public org.uicds.icsForm207.ResourcesSummaryType getResourcesSummaryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm207.ResourcesSummaryType target = null;
                target = (org.uicds.icsForm207.ResourcesSummaryType)get_store().find_element_user(RESOURCESSUMMARY$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ResourcesSummary" element
         */
        public int sizeOfResourcesSummaryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCESSUMMARY$18);
            }
        }
        
        /**
         * Sets array of all "ResourcesSummary" element
         */
        public void setResourcesSummaryArray(org.uicds.icsForm207.ResourcesSummaryType[] resourcesSummaryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resourcesSummaryArray, RESOURCESSUMMARY$18);
            }
        }
        
        /**
         * Sets ith "ResourcesSummary" element
         */
        public void setResourcesSummaryArray(int i, org.uicds.icsForm207.ResourcesSummaryType resourcesSummary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm207.ResourcesSummaryType target = null;
                target = (org.uicds.icsForm207.ResourcesSummaryType)get_store().find_element_user(RESOURCESSUMMARY$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(resourcesSummary);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ResourcesSummary" element
         */
        public org.uicds.icsForm207.ResourcesSummaryType insertNewResourcesSummary(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm207.ResourcesSummaryType target = null;
                target = (org.uicds.icsForm207.ResourcesSummaryType)get_store().insert_element_user(RESOURCESSUMMARY$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ResourcesSummary" element
         */
        public org.uicds.icsForm207.ResourcesSummaryType addNewResourcesSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm207.ResourcesSummaryType target = null;
                target = (org.uicds.icsForm207.ResourcesSummaryType)get_store().add_element_user(RESOURCESSUMMARY$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "ResourcesSummary" element
         */
        public void removeResourcesSummary(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCESSUMMARY$18, i);
            }
        }
        
        /**
         * Gets the "ControlOperations" element
         */
        public java.lang.String getControlOperations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTROLOPERATIONS$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ControlOperations" element
         */
        public org.apache.xmlbeans.XmlString xgetControlOperations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTROLOPERATIONS$20, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ControlOperations" element
         */
        public void setControlOperations(java.lang.String controlOperations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTROLOPERATIONS$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTROLOPERATIONS$20);
                }
                target.setStringValue(controlOperations);
            }
        }
        
        /**
         * Sets (as xml) the "ControlOperations" element
         */
        public void xsetControlOperations(org.apache.xmlbeans.XmlString controlOperations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTROLOPERATIONS$20, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTROLOPERATIONS$20);
                }
                target.set(controlOperations);
            }
        }
        
        /**
         * Gets the "SpecialInstructions" element
         */
        public java.lang.String getSpecialInstructions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIALINSTRUCTIONS$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SpecialInstructions" element
         */
        public org.apache.xmlbeans.XmlString xgetSpecialInstructions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPECIALINSTRUCTIONS$22, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SpecialInstructions" element
         */
        public void setSpecialInstructions(java.lang.String specialInstructions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPECIALINSTRUCTIONS$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPECIALINSTRUCTIONS$22);
                }
                target.setStringValue(specialInstructions);
            }
        }
        
        /**
         * Sets (as xml) the "SpecialInstructions" element
         */
        public void xsetSpecialInstructions(org.apache.xmlbeans.XmlString specialInstructions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPECIALINSTRUCTIONS$22, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPECIALINSTRUCTIONS$22);
                }
                target.set(specialInstructions);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$24, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$24, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREPAREDBY$24);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$24, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREPAREDBY$24);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVEDBY$26, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVEDBY$26, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPROVEDBY$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPROVEDBY$26);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPROVEDBY$26, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPROVEDBY$26);
                }
                target.set(approvedBy);
            }
        }
    }
}
