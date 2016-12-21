/*
 * An XML document type.
 * Localname: ICSForm205
 * Namespace: http://uicds.org/ICSForm205
 * Java type: org.uicds.icsForm205.ICSForm205Document
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm205.impl;
/**
 * A document containing one ICSForm205(@http://uicds.org/ICSForm205) element.
 *
 * This is a complex type.
 */
public class ICSForm205DocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm205.ICSForm205Document
{
    private static final long serialVersionUID = 1L;
    
    public ICSForm205DocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ICSFORM205$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm205", "ICSForm205");
    
    
    /**
     * Gets the "ICSForm205" element
     */
    public org.uicds.icsForm205.ICSForm205Document.ICSForm205 getICSForm205()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm205.ICSForm205Document.ICSForm205 target = null;
            target = (org.uicds.icsForm205.ICSForm205Document.ICSForm205)get_store().find_element_user(ICSFORM205$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ICSForm205" element
     */
    public void setICSForm205(org.uicds.icsForm205.ICSForm205Document.ICSForm205 icsForm205)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm205.ICSForm205Document.ICSForm205 target = null;
            target = (org.uicds.icsForm205.ICSForm205Document.ICSForm205)get_store().find_element_user(ICSFORM205$0, 0);
            if (target == null)
            {
                target = (org.uicds.icsForm205.ICSForm205Document.ICSForm205)get_store().add_element_user(ICSFORM205$0);
            }
            target.set(icsForm205);
        }
    }
    
    /**
     * Appends and returns a new empty "ICSForm205" element
     */
    public org.uicds.icsForm205.ICSForm205Document.ICSForm205 addNewICSForm205()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.icsForm205.ICSForm205Document.ICSForm205 target = null;
            target = (org.uicds.icsForm205.ICSForm205Document.ICSForm205)get_store().add_element_user(ICSFORM205$0);
            return target;
        }
    }
    /**
     * An XML ICSForm205(@http://uicds.org/ICSForm205).
     *
     * This is a complex type.
     */
    public static class ICSForm205Impl extends org.uicds.icsFormCommon.impl.ICSFormDocumentTypeImpl implements org.uicds.icsForm205.ICSForm205Document.ICSForm205
    {
        private static final long serialVersionUID = 1L;
        
        public ICSForm205Impl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTNAME$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm205", "IncidentName");
        private static final javax.xml.namespace.QName DATETIMEPREPARED$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm205", "DateTimePrepared");
        private static final javax.xml.namespace.QName OPERATIONALPERIODDATETIME$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm205", "OperationalPeriodDateTime");
        private static final javax.xml.namespace.QName BASICRADIOCHANNELUTILIZATION$6 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm205", "BasicRadioChannelUtilization");
        private static final javax.xml.namespace.QName PREPAREDBY$8 = 
            new javax.xml.namespace.QName("http://uicds.org/ICSForm205", "PreparedBy");
        
        
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
         * Gets the "DateTimePrepared" element
         */
        public java.util.Calendar getDateTimePrepared()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEPREPARED$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "DateTimePrepared" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetDateTimePrepared()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIMEPREPARED$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DateTimePrepared" element
         */
        public void setDateTimePrepared(java.util.Calendar dateTimePrepared)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEPREPARED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIMEPREPARED$2);
                }
                target.setCalendarValue(dateTimePrepared);
            }
        }
        
        /**
         * Sets (as xml) the "DateTimePrepared" element
         */
        public void xsetDateTimePrepared(org.apache.xmlbeans.XmlDateTime dateTimePrepared)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATETIMEPREPARED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATETIMEPREPARED$2);
                }
                target.set(dateTimePrepared);
            }
        }
        
        /**
         * Gets the "OperationalPeriodDateTime" element
         */
        public java.util.Calendar getOperationalPeriodDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONALPERIODDATETIME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "OperationalPeriodDateTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetOperationalPeriodDateTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(OPERATIONALPERIODDATETIME$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OperationalPeriodDateTime" element
         */
        public void setOperationalPeriodDateTime(java.util.Calendar operationalPeriodDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONALPERIODDATETIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONALPERIODDATETIME$4);
                }
                target.setCalendarValue(operationalPeriodDateTime);
            }
        }
        
        /**
         * Sets (as xml) the "OperationalPeriodDateTime" element
         */
        public void xsetOperationalPeriodDateTime(org.apache.xmlbeans.XmlDateTime operationalPeriodDateTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(OPERATIONALPERIODDATETIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(OPERATIONALPERIODDATETIME$4);
                }
                target.set(operationalPeriodDateTime);
            }
        }
        
        /**
         * Gets array of all "BasicRadioChannelUtilization" elements
         */
        public org.uicds.icsForm205.BasicRadioChannelUtilizationType[] getBasicRadioChannelUtilizationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(BASICRADIOCHANNELUTILIZATION$6, targetList);
                org.uicds.icsForm205.BasicRadioChannelUtilizationType[] result = new org.uicds.icsForm205.BasicRadioChannelUtilizationType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "BasicRadioChannelUtilization" element
         */
        public org.uicds.icsForm205.BasicRadioChannelUtilizationType getBasicRadioChannelUtilizationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm205.BasicRadioChannelUtilizationType target = null;
                target = (org.uicds.icsForm205.BasicRadioChannelUtilizationType)get_store().find_element_user(BASICRADIOCHANNELUTILIZATION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "BasicRadioChannelUtilization" element
         */
        public int sizeOfBasicRadioChannelUtilizationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BASICRADIOCHANNELUTILIZATION$6);
            }
        }
        
        /**
         * Sets array of all "BasicRadioChannelUtilization" element
         */
        public void setBasicRadioChannelUtilizationArray(org.uicds.icsForm205.BasicRadioChannelUtilizationType[] basicRadioChannelUtilizationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(basicRadioChannelUtilizationArray, BASICRADIOCHANNELUTILIZATION$6);
            }
        }
        
        /**
         * Sets ith "BasicRadioChannelUtilization" element
         */
        public void setBasicRadioChannelUtilizationArray(int i, org.uicds.icsForm205.BasicRadioChannelUtilizationType basicRadioChannelUtilization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm205.BasicRadioChannelUtilizationType target = null;
                target = (org.uicds.icsForm205.BasicRadioChannelUtilizationType)get_store().find_element_user(BASICRADIOCHANNELUTILIZATION$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(basicRadioChannelUtilization);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BasicRadioChannelUtilization" element
         */
        public org.uicds.icsForm205.BasicRadioChannelUtilizationType insertNewBasicRadioChannelUtilization(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm205.BasicRadioChannelUtilizationType target = null;
                target = (org.uicds.icsForm205.BasicRadioChannelUtilizationType)get_store().insert_element_user(BASICRADIOCHANNELUTILIZATION$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BasicRadioChannelUtilization" element
         */
        public org.uicds.icsForm205.BasicRadioChannelUtilizationType addNewBasicRadioChannelUtilization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsForm205.BasicRadioChannelUtilizationType target = null;
                target = (org.uicds.icsForm205.BasicRadioChannelUtilizationType)get_store().add_element_user(BASICRADIOCHANNELUTILIZATION$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "BasicRadioChannelUtilization" element
         */
        public void removeBasicRadioChannelUtilization(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BASICRADIOCHANNELUTILIZATION$6, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$8, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$8, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREPAREDBY$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREPAREDBY$8);
                }
                target.set(preparedBy);
            }
        }
    }
}
