/*
 * An XML document type.
 * Localname: CreateSOIRequest
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorService.CreateSOIRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorService.impl;
/**
 * A document containing one CreateSOIRequest(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public class CreateSOIRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.CreateSOIRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateSOIRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATESOIREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SensorService", "CreateSOIRequest");
    
    
    /**
     * Gets the "CreateSOIRequest" element
     */
    public org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest getCreateSOIRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest target = null;
            target = (org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest)get_store().find_element_user(CREATESOIREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateSOIRequest" element
     */
    public void setCreateSOIRequest(org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest createSOIRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest target = null;
            target = (org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest)get_store().find_element_user(CREATESOIREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest)get_store().add_element_user(CREATESOIREQUEST$0);
            }
            target.set(createSOIRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateSOIRequest" element
     */
    public org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest addNewCreateSOIRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest target = null;
            target = (org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest)get_store().add_element_user(CREATESOIREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateSOIRequest(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public static class CreateSOIRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CreateSOIRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/SensorService", "incidentID");
        private static final javax.xml.namespace.QName SENSOROBSERVATIONINFO$2 = 
            new javax.xml.namespace.QName("http://uicds.org/SensorService", "SensorObservationInfo");
        
        
        /**
         * Gets the "incidentID" element
         */
        public java.lang.String getIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "incidentID" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "incidentID" element
         */
        public boolean isSetIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTID$0) != 0;
            }
        }
        
        /**
         * Sets the "incidentID" element
         */
        public void setIncidentID(java.lang.String incidentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTID$0);
                }
                target.setStringValue(incidentID);
            }
        }
        
        /**
         * Sets (as xml) the "incidentID" element
         */
        public void xsetIncidentID(org.apache.xmlbeans.XmlString incidentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTID$0);
                }
                target.set(incidentID);
            }
        }
        
        /**
         * Unsets the "incidentID" element
         */
        public void unsetIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTID$0, 0);
            }
        }
        
        /**
         * Gets the "SensorObservationInfo" element
         */
        public org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo getSensorObservationInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo target = null;
                target = (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo)get_store().find_element_user(SENSOROBSERVATIONINFO$2, 0);
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
                target = (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo)get_store().find_element_user(SENSOROBSERVATIONINFO$2, 0);
                if (target == null)
                {
                    target = (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo)get_store().add_element_user(SENSOROBSERVATIONINFO$2);
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
                target = (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo)get_store().add_element_user(SENSOROBSERVATIONINFO$2);
                return target;
            }
        }
    }
}
