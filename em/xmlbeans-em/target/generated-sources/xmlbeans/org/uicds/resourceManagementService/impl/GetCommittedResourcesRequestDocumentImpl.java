/*
 * An XML document type.
 * Localname: GetCommittedResourcesRequest
 * Namespace: http://uicds.org/ResourceManagementService
 * Java type: org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceManagementService.impl;
/**
 * A document containing one GetCommittedResourcesRequest(@http://uicds.org/ResourceManagementService) element.
 *
 * This is a complex type.
 */
public class GetCommittedResourcesRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCommittedResourcesRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOMMITTEDRESOURCESREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceManagementService", "GetCommittedResourcesRequest");
    
    
    /**
     * Gets the "GetCommittedResourcesRequest" element
     */
    public org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument.GetCommittedResourcesRequest getGetCommittedResourcesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument.GetCommittedResourcesRequest target = null;
            target = (org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument.GetCommittedResourcesRequest)get_store().find_element_user(GETCOMMITTEDRESOURCESREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCommittedResourcesRequest" element
     */
    public void setGetCommittedResourcesRequest(org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument.GetCommittedResourcesRequest getCommittedResourcesRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument.GetCommittedResourcesRequest target = null;
            target = (org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument.GetCommittedResourcesRequest)get_store().find_element_user(GETCOMMITTEDRESOURCESREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument.GetCommittedResourcesRequest)get_store().add_element_user(GETCOMMITTEDRESOURCESREQUEST$0);
            }
            target.set(getCommittedResourcesRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCommittedResourcesRequest" element
     */
    public org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument.GetCommittedResourcesRequest addNewGetCommittedResourcesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument.GetCommittedResourcesRequest target = null;
            target = (org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument.GetCommittedResourcesRequest)get_store().add_element_user(GETCOMMITTEDRESOURCESREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetCommittedResourcesRequest(@http://uicds.org/ResourceManagementService).
     *
     * This is a complex type.
     */
    public static class GetCommittedResourcesRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceManagementService.GetCommittedResourcesRequestDocument.GetCommittedResourcesRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetCommittedResourcesRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
