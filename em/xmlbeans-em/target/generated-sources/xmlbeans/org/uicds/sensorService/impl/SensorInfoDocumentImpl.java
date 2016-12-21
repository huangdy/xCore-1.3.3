/*
 * An XML document type.
 * Localname: SensorInfo
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorService.SensorInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorService.impl;
/**
 * A document containing one SensorInfo(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public class SensorInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.SensorInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public SensorInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENSORINFO$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SensorService", "SensorInfo");
    
    
    /**
     * Gets the "SensorInfo" element
     */
    public org.uicds.sensorService.SensorInfoDocument.SensorInfo getSensorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.SensorInfoDocument.SensorInfo target = null;
            target = (org.uicds.sensorService.SensorInfoDocument.SensorInfo)get_store().find_element_user(SENSORINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SensorInfo" element
     */
    public void setSensorInfo(org.uicds.sensorService.SensorInfoDocument.SensorInfo sensorInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.SensorInfoDocument.SensorInfo target = null;
            target = (org.uicds.sensorService.SensorInfoDocument.SensorInfo)get_store().find_element_user(SENSORINFO$0, 0);
            if (target == null)
            {
                target = (org.uicds.sensorService.SensorInfoDocument.SensorInfo)get_store().add_element_user(SENSORINFO$0);
            }
            target.set(sensorInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "SensorInfo" element
     */
    public org.uicds.sensorService.SensorInfoDocument.SensorInfo addNewSensorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.SensorInfoDocument.SensorInfo target = null;
            target = (org.uicds.sensorService.SensorInfoDocument.SensorInfo)get_store().add_element_user(SENSORINFO$0);
            return target;
        }
    }
    /**
     * An XML SensorInfo(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public static class SensorInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.SensorInfoDocument.SensorInfo
    {
        private static final long serialVersionUID = 1L;
        
        public SensorInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://uicds.org/SensorService", "name");
        private static final javax.xml.namespace.QName DESCRIPTION$2 = 
            new javax.xml.namespace.QName("http://uicds.org/SensorService", "description");
        private static final javax.xml.namespace.QName LATITUDE$4 = 
            new javax.xml.namespace.QName("http://uicds.org/SensorService", "latitude");
        private static final javax.xml.namespace.QName LONGITUDE$6 = 
            new javax.xml.namespace.QName("http://uicds.org/SensorService", "longitude");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "name" element
         */
        public org.apache.xmlbeans.XmlString xgetName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "name" element
         */
        public void setName(java.lang.String name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                }
                target.setStringValue(name);
            }
        }
        
        /**
         * Sets (as xml) the "name" element
         */
        public void xsetName(org.apache.xmlbeans.XmlString name)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
        
        /**
         * Gets the "description" element
         */
        public java.lang.String getDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "description" element
         */
        public org.apache.xmlbeans.XmlString xgetDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "description" element
         */
        public void setDescription(java.lang.String description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
                }
                target.setStringValue(description);
            }
        }
        
        /**
         * Sets (as xml) the "description" element
         */
        public void xsetDescription(org.apache.xmlbeans.XmlString description)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
                }
                target.set(description);
            }
        }
        
        /**
         * Gets the "latitude" element
         */
        public double getLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$4, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "latitude" element
         */
        public org.apache.xmlbeans.XmlDouble xgetLatitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LATITUDE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "latitude" element
         */
        public void setLatitude(double latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$4);
                }
                target.setDoubleValue(latitude);
            }
        }
        
        /**
         * Sets (as xml) the "latitude" element
         */
        public void xsetLatitude(org.apache.xmlbeans.XmlDouble latitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LATITUDE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LATITUDE$4);
                }
                target.set(latitude);
            }
        }
        
        /**
         * Gets the "longitude" element
         */
        public double getLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$6, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "longitude" element
         */
        public org.apache.xmlbeans.XmlDouble xgetLongitude()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LONGITUDE$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "longitude" element
         */
        public void setLongitude(double longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$6);
                }
                target.setDoubleValue(longitude);
            }
        }
        
        /**
         * Sets (as xml) the "longitude" element
         */
        public void xsetLongitude(org.apache.xmlbeans.XmlDouble longitude)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(LONGITUDE$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(LONGITUDE$6);
                }
                target.set(longitude);
            }
        }
    }
}
