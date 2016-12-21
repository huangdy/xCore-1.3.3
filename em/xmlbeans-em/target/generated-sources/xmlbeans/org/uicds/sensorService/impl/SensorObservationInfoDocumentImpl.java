/*
 * An XML document type.
 * Localname: SensorObservationInfo
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorService.SensorObservationInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorService.impl;
/**
 * A document containing one SensorObservationInfo(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public class SensorObservationInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.SensorObservationInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public SensorObservationInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENSOROBSERVATIONINFO$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SensorService", "SensorObservationInfo");
    
    
    /**
     * Gets the "SensorObservationInfo" element
     */
    public org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo getSensorObservationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo target = null;
            target = (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo)get_store().find_element_user(SENSOROBSERVATIONINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SensorObservationInfo" element
     */
    public void setSensorObservationInfo(org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo sensorObservationInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo target = null;
            target = (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo)get_store().find_element_user(SENSOROBSERVATIONINFO$0, 0);
            if (target == null)
            {
                target = (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo)get_store().add_element_user(SENSOROBSERVATIONINFO$0);
            }
            target.set(sensorObservationInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "SensorObservationInfo" element
     */
    public org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo addNewSensorObservationInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo target = null;
            target = (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo)get_store().add_element_user(SENSOROBSERVATIONINFO$0);
            return target;
        }
    }
    /**
     * An XML SensorObservationInfo(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public static class SensorObservationInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo
    {
        private static final long serialVersionUID = 1L;
        
        public SensorObservationInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOSURN$0 = 
            new javax.xml.namespace.QName("http://uicds.org/SensorService", "sosURN");
        private static final javax.xml.namespace.QName SENSORINFO$2 = 
            new javax.xml.namespace.QName("http://uicds.org/SensorService", "SensorInfo");
        
        
        /**
         * Gets the "sosURN" element
         */
        public java.lang.String getSosURN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOSURN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "sosURN" element
         */
        public org.apache.xmlbeans.XmlString xgetSosURN()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOSURN$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "sosURN" element
         */
        public void setSosURN(java.lang.String sosURN)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOSURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOSURN$0);
                }
                target.setStringValue(sosURN);
            }
        }
        
        /**
         * Sets (as xml) the "sosURN" element
         */
        public void xsetSosURN(org.apache.xmlbeans.XmlString sosURN)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOSURN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOSURN$0);
                }
                target.set(sosURN);
            }
        }
        
        /**
         * Gets array of all "SensorInfo" elements
         */
        public org.uicds.sensorService.SensorInfoDocument.SensorInfo[] getSensorInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(SENSORINFO$2, targetList);
                org.uicds.sensorService.SensorInfoDocument.SensorInfo[] result = new org.uicds.sensorService.SensorInfoDocument.SensorInfo[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "SensorInfo" element
         */
        public org.uicds.sensorService.SensorInfoDocument.SensorInfo getSensorInfoArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.sensorService.SensorInfoDocument.SensorInfo target = null;
                target = (org.uicds.sensorService.SensorInfoDocument.SensorInfo)get_store().find_element_user(SENSORINFO$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "SensorInfo" element
         */
        public int sizeOfSensorInfoArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SENSORINFO$2);
            }
        }
        
        /**
         * Sets array of all "SensorInfo" element
         */
        public void setSensorInfoArray(org.uicds.sensorService.SensorInfoDocument.SensorInfo[] sensorInfoArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(sensorInfoArray, SENSORINFO$2);
            }
        }
        
        /**
         * Sets ith "SensorInfo" element
         */
        public void setSensorInfoArray(int i, org.uicds.sensorService.SensorInfoDocument.SensorInfo sensorInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.sensorService.SensorInfoDocument.SensorInfo target = null;
                target = (org.uicds.sensorService.SensorInfoDocument.SensorInfo)get_store().find_element_user(SENSORINFO$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(sensorInfo);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SensorInfo" element
         */
        public org.uicds.sensorService.SensorInfoDocument.SensorInfo insertNewSensorInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.sensorService.SensorInfoDocument.SensorInfo target = null;
                target = (org.uicds.sensorService.SensorInfoDocument.SensorInfo)get_store().insert_element_user(SENSORINFO$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SensorInfo" element
         */
        public org.uicds.sensorService.SensorInfoDocument.SensorInfo addNewSensorInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.sensorService.SensorInfoDocument.SensorInfo target = null;
                target = (org.uicds.sensorService.SensorInfoDocument.SensorInfo)get_store().add_element_user(SENSORINFO$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "SensorInfo" element
         */
        public void removeSensorInfo(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SENSORINFO$2, i);
            }
        }
    }
}
