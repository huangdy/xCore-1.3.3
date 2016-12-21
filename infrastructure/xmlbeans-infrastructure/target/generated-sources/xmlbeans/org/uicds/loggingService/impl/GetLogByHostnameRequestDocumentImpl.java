/*
 * An XML document type.
 * Localname: GetLogByHostnameRequest
 * Namespace: http://uicds.org/LoggingService
 * Java type: org.uicds.loggingService.GetLogByHostnameRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.loggingService.impl;
/**
 * A document containing one GetLogByHostnameRequest(@http://uicds.org/LoggingService) element.
 *
 * This is a complex type.
 */
public class GetLogByHostnameRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.loggingService.GetLogByHostnameRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLogByHostnameRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLOGBYHOSTNAMEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/LoggingService", "GetLogByHostnameRequest");
    
    
    /**
     * Gets the "GetLogByHostnameRequest" element
     */
    public org.uicds.loggingService.GetLogByHostnameRequestDocument.GetLogByHostnameRequest getGetLogByHostnameRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingService.GetLogByHostnameRequestDocument.GetLogByHostnameRequest target = null;
            target = (org.uicds.loggingService.GetLogByHostnameRequestDocument.GetLogByHostnameRequest)get_store().find_element_user(GETLOGBYHOSTNAMEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLogByHostnameRequest" element
     */
    public void setGetLogByHostnameRequest(org.uicds.loggingService.GetLogByHostnameRequestDocument.GetLogByHostnameRequest getLogByHostnameRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingService.GetLogByHostnameRequestDocument.GetLogByHostnameRequest target = null;
            target = (org.uicds.loggingService.GetLogByHostnameRequestDocument.GetLogByHostnameRequest)get_store().find_element_user(GETLOGBYHOSTNAMEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.loggingService.GetLogByHostnameRequestDocument.GetLogByHostnameRequest)get_store().add_element_user(GETLOGBYHOSTNAMEREQUEST$0);
            }
            target.set(getLogByHostnameRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetLogByHostnameRequest" element
     */
    public org.uicds.loggingService.GetLogByHostnameRequestDocument.GetLogByHostnameRequest addNewGetLogByHostnameRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingService.GetLogByHostnameRequestDocument.GetLogByHostnameRequest target = null;
            target = (org.uicds.loggingService.GetLogByHostnameRequestDocument.GetLogByHostnameRequest)get_store().add_element_user(GETLOGBYHOSTNAMEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetLogByHostnameRequest(@http://uicds.org/LoggingService).
     *
     * This is a complex type.
     */
    public static class GetLogByHostnameRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.loggingService.GetLogByHostnameRequestDocument.GetLogByHostnameRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetLogByHostnameRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HOSTNAME$0 = 
            new javax.xml.namespace.QName("http://uicds.org/LoggingService", "hostname");
        
        
        /**
         * Gets the "hostname" element
         */
        public java.lang.String getHostname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSTNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "hostname" element
         */
        public org.apache.xmlbeans.XmlString xgetHostname()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOSTNAME$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "hostname" element
         */
        public void setHostname(java.lang.String hostname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOSTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOSTNAME$0);
                }
                target.setStringValue(hostname);
            }
        }
        
        /**
         * Sets (as xml) the "hostname" element
         */
        public void xsetHostname(org.apache.xmlbeans.XmlString hostname)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOSTNAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOSTNAME$0);
                }
                target.set(hostname);
            }
        }
    }
}
