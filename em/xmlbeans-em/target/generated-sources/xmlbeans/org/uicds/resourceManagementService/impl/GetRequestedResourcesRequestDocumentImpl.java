/*
 * An XML document type.
 * Localname: GetRequestedResourcesRequest
 * Namespace: http://uicds.org/ResourceManagementService
 * Java type: org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceManagementService.impl;
/**
 * A document containing one GetRequestedResourcesRequest(@http://uicds.org/ResourceManagementService) element.
 *
 * This is a complex type.
 */
public class GetRequestedResourcesRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRequestedResourcesRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETREQUESTEDRESOURCESREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceManagementService", "GetRequestedResourcesRequest");
    
    
    /**
     * Gets the "GetRequestedResourcesRequest" element
     */
    public org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument.GetRequestedResourcesRequest getGetRequestedResourcesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument.GetRequestedResourcesRequest target = null;
            target = (org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument.GetRequestedResourcesRequest)get_store().find_element_user(GETREQUESTEDRESOURCESREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetRequestedResourcesRequest" element
     */
    public void setGetRequestedResourcesRequest(org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument.GetRequestedResourcesRequest getRequestedResourcesRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument.GetRequestedResourcesRequest target = null;
            target = (org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument.GetRequestedResourcesRequest)get_store().find_element_user(GETREQUESTEDRESOURCESREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument.GetRequestedResourcesRequest)get_store().add_element_user(GETREQUESTEDRESOURCESREQUEST$0);
            }
            target.set(getRequestedResourcesRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetRequestedResourcesRequest" element
     */
    public org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument.GetRequestedResourcesRequest addNewGetRequestedResourcesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument.GetRequestedResourcesRequest target = null;
            target = (org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument.GetRequestedResourcesRequest)get_store().add_element_user(GETREQUESTEDRESOURCESREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetRequestedResourcesRequest(@http://uicds.org/ResourceManagementService).
     *
     * This is a complex type.
     */
    public static class GetRequestedResourcesRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceManagementService.GetRequestedResourcesRequestDocument.GetRequestedResourcesRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetRequestedResourcesRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceManagementService", "incidentID");
        
        
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
