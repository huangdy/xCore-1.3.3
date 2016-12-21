/*
 * An XML document type.
 * Localname: GetSOIListRequest
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorService.GetSOIListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorService.impl;
/**
 * A document containing one GetSOIListRequest(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public class GetSOIListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.GetSOIListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSOIListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSOILISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SensorService", "GetSOIListRequest");
    
    
    /**
     * Gets the "GetSOIListRequest" element
     */
    public org.uicds.sensorService.GetSOIListRequestDocument.GetSOIListRequest getGetSOIListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.GetSOIListRequestDocument.GetSOIListRequest target = null;
            target = (org.uicds.sensorService.GetSOIListRequestDocument.GetSOIListRequest)get_store().find_element_user(GETSOILISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSOIListRequest" element
     */
    public void setGetSOIListRequest(org.uicds.sensorService.GetSOIListRequestDocument.GetSOIListRequest getSOIListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.GetSOIListRequestDocument.GetSOIListRequest target = null;
            target = (org.uicds.sensorService.GetSOIListRequestDocument.GetSOIListRequest)get_store().find_element_user(GETSOILISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.sensorService.GetSOIListRequestDocument.GetSOIListRequest)get_store().add_element_user(GETSOILISTREQUEST$0);
            }
            target.set(getSOIListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetSOIListRequest" element
     */
    public org.uicds.sensorService.GetSOIListRequestDocument.GetSOIListRequest addNewGetSOIListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.GetSOIListRequestDocument.GetSOIListRequest target = null;
            target = (org.uicds.sensorService.GetSOIListRequestDocument.GetSOIListRequest)get_store().add_element_user(GETSOILISTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetSOIListRequest(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public static class GetSOIListRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.GetSOIListRequestDocument.GetSOIListRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetSOIListRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/SensorService", "incidentID");
        
        
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
    }
}
