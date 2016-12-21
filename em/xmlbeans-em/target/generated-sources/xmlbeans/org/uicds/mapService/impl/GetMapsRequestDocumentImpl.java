/*
 * An XML document type.
 * Localname: GetMapsRequest
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.GetMapsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one GetMapsRequest(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class GetMapsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetMapsRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMapsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMAPSREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "GetMapsRequest");
    
    
    /**
     * Gets the "GetMapsRequest" element
     */
    public org.uicds.mapService.GetMapsRequestDocument.GetMapsRequest getGetMapsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetMapsRequestDocument.GetMapsRequest target = null;
            target = (org.uicds.mapService.GetMapsRequestDocument.GetMapsRequest)get_store().find_element_user(GETMAPSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMapsRequest" element
     */
    public void setGetMapsRequest(org.uicds.mapService.GetMapsRequestDocument.GetMapsRequest getMapsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetMapsRequestDocument.GetMapsRequest target = null;
            target = (org.uicds.mapService.GetMapsRequestDocument.GetMapsRequest)get_store().find_element_user(GETMAPSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.GetMapsRequestDocument.GetMapsRequest)get_store().add_element_user(GETMAPSREQUEST$0);
            }
            target.set(getMapsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMapsRequest" element
     */
    public org.uicds.mapService.GetMapsRequestDocument.GetMapsRequest addNewGetMapsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetMapsRequestDocument.GetMapsRequest target = null;
            target = (org.uicds.mapService.GetMapsRequestDocument.GetMapsRequest)get_store().add_element_user(GETMAPSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetMapsRequest(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class GetMapsRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetMapsRequestDocument.GetMapsRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetMapsRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/MapService", "IncidentId");
        
        
        /**
         * Gets the "IncidentId" element
         */
        public java.lang.String getIncidentId()
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
         * Gets (as xml) the "IncidentId" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentId()
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
         * Sets the "IncidentId" element
         */
        public void setIncidentId(java.lang.String incidentId)
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
                target.setStringValue(incidentId);
            }
        }
        
        /**
         * Sets (as xml) the "IncidentId" element
         */
        public void xsetIncidentId(org.apache.xmlbeans.XmlString incidentId)
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
                target.set(incidentId);
            }
        }
    }
}
