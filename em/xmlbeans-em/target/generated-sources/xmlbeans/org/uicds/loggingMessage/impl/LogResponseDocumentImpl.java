/*
 * An XML document type.
 * Localname: LogResponse
 * Namespace: http://uicds.org/LoggingMessage
 * Java type: org.uicds.loggingMessage.LogResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.loggingMessage.impl;
/**
 * A document containing one LogResponse(@http://uicds.org/LoggingMessage) element.
 *
 * This is a complex type.
 */
public class LogResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.loggingMessage.LogResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public LogResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/LoggingMessage", "LogResponse");
    
    
    /**
     * Gets the "LogResponse" element
     */
    public org.uicds.loggingMessage.LogResponseDocument.LogResponse getLogResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingMessage.LogResponseDocument.LogResponse target = null;
            target = (org.uicds.loggingMessage.LogResponseDocument.LogResponse)get_store().find_element_user(LOGRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LogResponse" element
     */
    public void setLogResponse(org.uicds.loggingMessage.LogResponseDocument.LogResponse logResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingMessage.LogResponseDocument.LogResponse target = null;
            target = (org.uicds.loggingMessage.LogResponseDocument.LogResponse)get_store().find_element_user(LOGRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.loggingMessage.LogResponseDocument.LogResponse)get_store().add_element_user(LOGRESPONSE$0);
            }
            target.set(logResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "LogResponse" element
     */
    public org.uicds.loggingMessage.LogResponseDocument.LogResponse addNewLogResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingMessage.LogResponseDocument.LogResponse target = null;
            target = (org.uicds.loggingMessage.LogResponseDocument.LogResponse)get_store().add_element_user(LOGRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML LogResponse(@http://uicds.org/LoggingMessage).
     *
     * This is a complex type.
     */
    public static class LogResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.loggingMessage.LogResponseDocument.LogResponse
    {
        private static final long serialVersionUID = 1L;
        
        public LogResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESPONSE$0 = 
            new javax.xml.namespace.QName("http://uicds.org/LoggingMessage", "response");
        
        
        /**
         * Gets the "response" element
         */
        public org.uicds.loggingMessage.LogResponseType.Enum getResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return (org.uicds.loggingMessage.LogResponseType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "response" element
         */
        public org.uicds.loggingMessage.LogResponseType xgetResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.loggingMessage.LogResponseType target = null;
                target = (org.uicds.loggingMessage.LogResponseType)get_store().find_element_user(RESPONSE$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "response" element
         */
        public void setResponse(org.uicds.loggingMessage.LogResponseType.Enum response)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESPONSE$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESPONSE$0);
                }
                target.setEnumValue(response);
            }
        }
        
        /**
         * Sets (as xml) the "response" element
         */
        public void xsetResponse(org.uicds.loggingMessage.LogResponseType response)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.loggingMessage.LogResponseType target = null;
                target = (org.uicds.loggingMessage.LogResponseType)get_store().find_element_user(RESPONSE$0, 0);
                if (target == null)
                {
                    target = (org.uicds.loggingMessage.LogResponseType)get_store().add_element_user(RESPONSE$0);
                }
                target.set(response);
            }
        }
    }
}