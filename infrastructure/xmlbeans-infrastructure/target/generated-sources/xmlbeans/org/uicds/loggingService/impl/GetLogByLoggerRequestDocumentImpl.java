/*
 * An XML document type.
 * Localname: GetLogByLoggerRequest
 * Namespace: http://uicds.org/LoggingService
 * Java type: org.uicds.loggingService.GetLogByLoggerRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.loggingService.impl;
/**
 * A document containing one GetLogByLoggerRequest(@http://uicds.org/LoggingService) element.
 *
 * This is a complex type.
 */
public class GetLogByLoggerRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.loggingService.GetLogByLoggerRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLogByLoggerRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLOGBYLOGGERREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/LoggingService", "GetLogByLoggerRequest");
    
    
    /**
     * Gets the "GetLogByLoggerRequest" element
     */
    public org.uicds.loggingService.GetLogByLoggerRequestDocument.GetLogByLoggerRequest getGetLogByLoggerRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingService.GetLogByLoggerRequestDocument.GetLogByLoggerRequest target = null;
            target = (org.uicds.loggingService.GetLogByLoggerRequestDocument.GetLogByLoggerRequest)get_store().find_element_user(GETLOGBYLOGGERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLogByLoggerRequest" element
     */
    public void setGetLogByLoggerRequest(org.uicds.loggingService.GetLogByLoggerRequestDocument.GetLogByLoggerRequest getLogByLoggerRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingService.GetLogByLoggerRequestDocument.GetLogByLoggerRequest target = null;
            target = (org.uicds.loggingService.GetLogByLoggerRequestDocument.GetLogByLoggerRequest)get_store().find_element_user(GETLOGBYLOGGERREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.loggingService.GetLogByLoggerRequestDocument.GetLogByLoggerRequest)get_store().add_element_user(GETLOGBYLOGGERREQUEST$0);
            }
            target.set(getLogByLoggerRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetLogByLoggerRequest" element
     */
    public org.uicds.loggingService.GetLogByLoggerRequestDocument.GetLogByLoggerRequest addNewGetLogByLoggerRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingService.GetLogByLoggerRequestDocument.GetLogByLoggerRequest target = null;
            target = (org.uicds.loggingService.GetLogByLoggerRequestDocument.GetLogByLoggerRequest)get_store().add_element_user(GETLOGBYLOGGERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetLogByLoggerRequest(@http://uicds.org/LoggingService).
     *
     * This is a complex type.
     */
    public static class GetLogByLoggerRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.loggingService.GetLogByLoggerRequestDocument.GetLogByLoggerRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetLogByLoggerRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOGGER$0 = 
            new javax.xml.namespace.QName("http://uicds.org/LoggingService", "logger");
        
        
        /**
         * Gets the "logger" element
         */
        public java.lang.String getLogger()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGGER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "logger" element
         */
        public org.apache.xmlbeans.XmlString xgetLogger()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGGER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "logger" element
         */
        public void setLogger(java.lang.String logger)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGGER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGGER$0);
                }
                target.setStringValue(logger);
            }
        }
        
        /**
         * Sets (as xml) the "logger" element
         */
        public void xsetLogger(org.apache.xmlbeans.XmlString logger)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOGGER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOGGER$0);
                }
                target.set(logger);
            }
        }
    }
}
