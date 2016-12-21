/*
 * An XML document type.
 * Localname: GetResourceInstanceListRequest
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one GetResourceInstanceListRequest(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class GetResourceInstanceListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetResourceInstanceListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRESOURCEINSTANCELISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "GetResourceInstanceListRequest");
    
    
    /**
     * Gets the "GetResourceInstanceListRequest" element
     */
    public org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument.GetResourceInstanceListRequest getGetResourceInstanceListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument.GetResourceInstanceListRequest target = null;
            target = (org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument.GetResourceInstanceListRequest)get_store().find_element_user(GETRESOURCEINSTANCELISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetResourceInstanceListRequest" element
     */
    public void setGetResourceInstanceListRequest(org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument.GetResourceInstanceListRequest getResourceInstanceListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument.GetResourceInstanceListRequest target = null;
            target = (org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument.GetResourceInstanceListRequest)get_store().find_element_user(GETRESOURCEINSTANCELISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument.GetResourceInstanceListRequest)get_store().add_element_user(GETRESOURCEINSTANCELISTREQUEST$0);
            }
            target.set(getResourceInstanceListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetResourceInstanceListRequest" element
     */
    public org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument.GetResourceInstanceListRequest addNewGetResourceInstanceListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument.GetResourceInstanceListRequest target = null;
            target = (org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument.GetResourceInstanceListRequest)get_store().add_element_user(GETRESOURCEINSTANCELISTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetResourceInstanceListRequest(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class GetResourceInstanceListRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.GetResourceInstanceListRequestDocument.GetResourceInstanceListRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetResourceInstanceListRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERYSTRING$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "QueryString");
        
        
        /**
         * Gets the "QueryString" element
         */
        public java.lang.String getQueryString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYSTRING$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "QueryString" element
         */
        public org.apache.xmlbeans.XmlString xgetQueryString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYSTRING$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "QueryString" element
         */
        public void setQueryString(java.lang.String queryString)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYSTRING$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYSTRING$0);
                }
                target.setStringValue(queryString);
            }
        }
        
        /**
         * Sets (as xml) the "QueryString" element
         */
        public void xsetQueryString(org.apache.xmlbeans.XmlString queryString)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUERYSTRING$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUERYSTRING$0);
                }
                target.set(queryString);
            }
        }
    }
}
