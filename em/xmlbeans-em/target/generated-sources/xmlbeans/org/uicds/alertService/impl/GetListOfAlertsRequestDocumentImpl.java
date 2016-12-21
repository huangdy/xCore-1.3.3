/*
 * An XML document type.
 * Localname: GetListOfAlertsRequest
 * Namespace: http://uicds.org/AlertService
 * Java type: org.uicds.alertService.GetListOfAlertsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.alertService.impl;
/**
 * A document containing one GetListOfAlertsRequest(@http://uicds.org/AlertService) element.
 *
 * This is a complex type.
 */
public class GetListOfAlertsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.GetListOfAlertsRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListOfAlertsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTOFALERTSREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AlertService", "GetListOfAlertsRequest");
    
    
    /**
     * Gets the "GetListOfAlertsRequest" element
     */
    public org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest getGetListOfAlertsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest target = null;
            target = (org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest)get_store().find_element_user(GETLISTOFALERTSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListOfAlertsRequest" element
     */
    public void setGetListOfAlertsRequest(org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest getListOfAlertsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest target = null;
            target = (org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest)get_store().find_element_user(GETLISTOFALERTSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest)get_store().add_element_user(GETLISTOFALERTSREQUEST$0);
            }
            target.set(getListOfAlertsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetListOfAlertsRequest" element
     */
    public org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest addNewGetListOfAlertsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest target = null;
            target = (org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest)get_store().add_element_user(GETLISTOFALERTSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetListOfAlertsRequest(@http://uicds.org/AlertService).
     *
     * This is a complex type.
     */
    public static class GetListOfAlertsRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetListOfAlertsRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUERYSTRING$0 = 
            new javax.xml.namespace.QName("http://uicds.org/AlertService", "QueryString");
        private static final javax.xml.namespace.QName NAMESPACEMAP$2 = 
            new javax.xml.namespace.QName("http://uicds.org/AlertService", "NamespaceMap");
        
        
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
         * True if has "QueryString" element
         */
        public boolean isSetQueryString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUERYSTRING$0) != 0;
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
        
        /**
         * Unsets the "QueryString" element
         */
        public void unsetQueryString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUERYSTRING$0, 0);
            }
        }
        
        /**
         * Gets the "NamespaceMap" element
         */
        public com.saic.precis.x2009.x06.base.NamespaceMapType getNamespaceMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.NamespaceMapType target = null;
                target = (com.saic.precis.x2009.x06.base.NamespaceMapType)get_store().find_element_user(NAMESPACEMAP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "NamespaceMap" element
         */
        public boolean isSetNamespaceMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAMESPACEMAP$2) != 0;
            }
        }
        
        /**
         * Sets the "NamespaceMap" element
         */
        public void setNamespaceMap(com.saic.precis.x2009.x06.base.NamespaceMapType namespaceMap)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.NamespaceMapType target = null;
                target = (com.saic.precis.x2009.x06.base.NamespaceMapType)get_store().find_element_user(NAMESPACEMAP$2, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.NamespaceMapType)get_store().add_element_user(NAMESPACEMAP$2);
                }
                target.set(namespaceMap);
            }
        }
        
        /**
         * Appends and returns a new empty "NamespaceMap" element
         */
        public com.saic.precis.x2009.x06.base.NamespaceMapType addNewNamespaceMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.NamespaceMapType target = null;
                target = (com.saic.precis.x2009.x06.base.NamespaceMapType)get_store().add_element_user(NAMESPACEMAP$2);
                return target;
            }
        }
        
        /**
         * Unsets the "NamespaceMap" element
         */
        public void unsetNamespaceMap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAMESPACEMAP$2, 0);
            }
        }
    }
}
