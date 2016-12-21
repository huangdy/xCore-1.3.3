/*
 * An XML document type.
 * Localname: ICSForm201
 * Namespace: http://uicds.org/ICSForm201
 * Java type: org.uicds.icsForm201.ICSForm201Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm201.impl;
/**
 * A document containing one ICSForm201(@http://uicds.org/ICSForm201) element.
 *
 * This is a complex type.
 */
public class ICSForm201DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm201.ICSForm201Document
{
    private static final long serialVersionUID = 1L;
    
    public ICSForm201DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ICSFORM201$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "ICSForm201");
    
    
    /**
     * Gets the "ICSForm201" element
     */
    public org.uicds.icsForm201.ICSForm201Document.ICSForm201 getICSForm201()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm201.ICSForm201Document.ICSForm201 target = null;
            target = (org.uicds.icsForm201.ICSForm201Document.ICSForm201)get_store().find_element_user(ICSFORM201$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ICSForm201" element
     */
    public void setICSForm201(org.uicds.icsForm201.ICSForm201Document.ICSForm201 icsForm201)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm201.ICSForm201Document.ICSForm201 target = null;
            target = (org.uicds.icsForm201.ICSForm201Document.ICSForm201)get_store().find_element_user(ICSFORM201$0, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm201.ICSForm201Document.ICSForm201)get_store().add_element_user(ICSFORM201$0);
            }
            target.set(icsForm201);
        }
    }
    
    /**
     * Appends and returns a new empty "ICSForm201" element
     */
    public org.uicds.icsForm201.ICSForm201Document.ICSForm201 addNewICSForm201()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm201.ICSForm201Document.ICSForm201 target = null;
            target = (org.uicds.icsForm201.ICSForm201Document.ICSForm201)get_store().add_element_user(ICSFORM201$0);
            return target;
        }
    }
    /**
     * An XML ICSForm201(@http://uicds.org/ICSForm201).
     *
     * This is a complex type.
     */
    public static class ICSForm201Impl extends org.uicds.icsFormCommon.impl.ICSFormDocumentTypeImpl implements org.uicds.icsForm201.ICSForm201Document.ICSForm201
    {
        private static final long serialVersionUID = 1L;
        
        public ICSForm201Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTNAME$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "IncidentName");
        private static final javax.xml.namespace.QName DATEPREPARED$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "DatePrepared");
        private static final javax.xml.namespace.QName TIMEPREPARED$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "TimePrepared");
        private static final javax.xml.namespace.QName MAPSKETCH$6 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "MapSketch");
        private static final javax.xml.namespace.QName RESOURCESSUMMARY$8 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "ResourcesSummary");
        private static final javax.xml.namespace.QName SUMMARYOFCURRENTACTIONS$10 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "SummaryOfCurrentActions");
        private static final javax.xml.namespace.QName CURRENTORGANIZATION$12 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "CurrentOrganization");
        
        
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
         * Gets the "MapSketch" element
         */
        public org.uicds.icsForm201.MapSketchType getMapSketch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm201.MapSketchType target = null;
                target = (org.uicds.icsForm201.MapSketchType)get_store().find_element_user(MAPSKETCH$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "MapSketch" element
         */
        public void setMapSketch(org.uicds.icsForm201.MapSketchType mapSketch)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm201.MapSketchType target = null;
                target = (org.uicds.icsForm201.MapSketchType)get_store().find_element_user(MAPSKETCH$6, 0);
                if (target == null)
                {
                    target = (org.uicds.icsForm201.MapSketchType)get_store().add_element_user(MAPSKETCH$6);
                }
                target.set(mapSketch);
            }
        }
        
        /**
         * Appends and returns a new empty "MapSketch" element
         */
        public org.uicds.icsForm201.MapSketchType addNewMapSketch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm201.MapSketchType target = null;
                target = (org.uicds.icsForm201.MapSketchType)get_store().add_element_user(MAPSKETCH$6);
                return target;
            }
        }
        
        /**
         * Gets array of all "ResourcesSummary" elements
         */
        public org.uicds.icsForm201.ResourcesSummaryType[] getResourcesSummaryArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESOURCESSUMMARY$8, targetList);
                org.uicds.icsForm201.ResourcesSummaryType[] result = new org.uicds.icsForm201.ResourcesSummaryType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ResourcesSummary" element
         */
        public org.uicds.icsForm201.ResourcesSummaryType getResourcesSummaryArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm201.ResourcesSummaryType target = null;
                target = (org.uicds.icsForm201.ResourcesSummaryType)get_store().find_element_user(RESOURCESSUMMARY$8, i);
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
                return get_store().count_elements(RESOURCESSUMMARY$8);
            }
        }
        
        /**
         * Sets array of all "ResourcesSummary" element
         */
        public void setResourcesSummaryArray(org.uicds.icsForm201.ResourcesSummaryType[] resourcesSummaryArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resourcesSummaryArray, RESOURCESSUMMARY$8);
            }
        }
        
        /**
         * Sets ith "ResourcesSummary" element
         */
        public void setResourcesSummaryArray(int i, org.uicds.icsForm201.ResourcesSummaryType resourcesSummary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm201.ResourcesSummaryType target = null;
                target = (org.uicds.icsForm201.ResourcesSummaryType)get_store().find_element_user(RESOURCESSUMMARY$8, i);
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
        public org.uicds.icsForm201.ResourcesSummaryType insertNewResourcesSummary(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm201.ResourcesSummaryType target = null;
                target = (org.uicds.icsForm201.ResourcesSummaryType)get_store().insert_element_user(RESOURCESSUMMARY$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ResourcesSummary" element
         */
        public org.uicds.icsForm201.ResourcesSummaryType addNewResourcesSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm201.ResourcesSummaryType target = null;
                target = (org.uicds.icsForm201.ResourcesSummaryType)get_store().add_element_user(RESOURCESSUMMARY$8);
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
                get_store().remove_element(RESOURCESSUMMARY$8, i);
            }
        }
        
        /**
         * Gets the "SummaryOfCurrentActions" element
         */
        public java.lang.String getSummaryOfCurrentActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUMMARYOFCURRENTACTIONS$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "SummaryOfCurrentActions" element
         */
        public org.apache.xmlbeans.XmlString xgetSummaryOfCurrentActions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUMMARYOFCURRENTACTIONS$10, 0);
                return target;
            }
        }
        
        /**
         * Sets the "SummaryOfCurrentActions" element
         */
        public void setSummaryOfCurrentActions(java.lang.String summaryOfCurrentActions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUMMARYOFCURRENTACTIONS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUMMARYOFCURRENTACTIONS$10);
                }
                target.setStringValue(summaryOfCurrentActions);
            }
        }
        
        /**
         * Sets (as xml) the "SummaryOfCurrentActions" element
         */
        public void xsetSummaryOfCurrentActions(org.apache.xmlbeans.XmlString summaryOfCurrentActions)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUMMARYOFCURRENTACTIONS$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUMMARYOFCURRENTACTIONS$10);
                }
                target.set(summaryOfCurrentActions);
            }
        }
        
        /**
         * Gets the "CurrentOrganization" element
         */
        public org.uicds.organizationElement.OrganizationElementType getCurrentOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.organizationElement.OrganizationElementType target = null;
                target = (org.uicds.organizationElement.OrganizationElementType)get_store().find_element_user(CURRENTORGANIZATION$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CurrentOrganization" element
         */
        public void setCurrentOrganization(org.uicds.organizationElement.OrganizationElementType currentOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.organizationElement.OrganizationElementType target = null;
                target = (org.uicds.organizationElement.OrganizationElementType)get_store().find_element_user(CURRENTORGANIZATION$12, 0);
                if (target == null)
                {
                    target = (org.uicds.organizationElement.OrganizationElementType)get_store().add_element_user(CURRENTORGANIZATION$12);
                }
                target.set(currentOrganization);
            }
        }
        
        /**
         * Appends and returns a new empty "CurrentOrganization" element
         */
        public org.uicds.organizationElement.OrganizationElementType addNewCurrentOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.organizationElement.OrganizationElementType target = null;
                target = (org.uicds.organizationElement.OrganizationElementType)get_store().add_element_user(CURRENTORGANIZATION$12);
                return target;
            }
        }
    }
}
