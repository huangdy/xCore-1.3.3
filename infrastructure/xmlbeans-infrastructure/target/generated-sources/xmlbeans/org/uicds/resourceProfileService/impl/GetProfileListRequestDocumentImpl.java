/*
 * An XML document type.
 * Localname: GetProfileListRequest
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.GetProfileListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * A document containing one GetProfileListRequest(@http://uicds.org/ResourceProfileService) element.
 *
 * This is a complex type.
 */
public class GetProfileListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.GetProfileListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProfileListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROFILELISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "GetProfileListRequest");
    
    
    /**
     * Gets the "GetProfileListRequest" element
     */
    public org.uicds.resourceProfileService.GetProfileListRequestDocument.GetProfileListRequest getGetProfileListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.GetProfileListRequestDocument.GetProfileListRequest target = null;
            target = (org.uicds.resourceProfileService.GetProfileListRequestDocument.GetProfileListRequest)get_store().find_element_user(GETPROFILELISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProfileListRequest" element
     */
    public void setGetProfileListRequest(org.uicds.resourceProfileService.GetProfileListRequestDocument.GetProfileListRequest getProfileListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.GetProfileListRequestDocument.GetProfileListRequest target = null;
            target = (org.uicds.resourceProfileService.GetProfileListRequestDocument.GetProfileListRequest)get_store().find_element_user(GETPROFILELISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.GetProfileListRequestDocument.GetProfileListRequest)get_store().add_element_user(GETPROFILELISTREQUEST$0);
            }
            target.set(getProfileListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProfileListRequest" element
     */
    public org.uicds.resourceProfileService.GetProfileListRequestDocument.GetProfileListRequest addNewGetProfileListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.GetProfileListRequestDocument.GetProfileListRequest target = null;
            target = (org.uicds.resourceProfileService.GetProfileListRequestDocument.GetProfileListRequest)get_store().add_element_user(GETPROFILELISTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetProfileListRequest(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class GetProfileListRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.GetProfileListRequestDocument.GetProfileListRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetProfileListRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERYSTRING$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "QueryString");
        
        
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
