/*
 * An XML document type.
 * Localname: GetLayersRequest
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.GetLayersRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one GetLayersRequest(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class GetLayersRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetLayersRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLayersRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLAYERSREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "GetLayersRequest");
    
    
    /**
     * Gets the "GetLayersRequest" element
     */
    public org.uicds.mapService.GetLayersRequestDocument.GetLayersRequest getGetLayersRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetLayersRequestDocument.GetLayersRequest target = null;
            target = (org.uicds.mapService.GetLayersRequestDocument.GetLayersRequest)get_store().find_element_user(GETLAYERSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLayersRequest" element
     */
    public void setGetLayersRequest(org.uicds.mapService.GetLayersRequestDocument.GetLayersRequest getLayersRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetLayersRequestDocument.GetLayersRequest target = null;
            target = (org.uicds.mapService.GetLayersRequestDocument.GetLayersRequest)get_store().find_element_user(GETLAYERSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.GetLayersRequestDocument.GetLayersRequest)get_store().add_element_user(GETLAYERSREQUEST$0);
            }
            target.set(getLayersRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetLayersRequest" element
     */
    public org.uicds.mapService.GetLayersRequestDocument.GetLayersRequest addNewGetLayersRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.GetLayersRequestDocument.GetLayersRequest target = null;
            target = (org.uicds.mapService.GetLayersRequestDocument.GetLayersRequest)get_store().add_element_user(GETLAYERSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetLayersRequest(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class GetLayersRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.GetLayersRequestDocument.GetLayersRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetLayersRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
