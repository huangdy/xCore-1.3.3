/*
 * An XML document type.
 * Localname: LogRequest
 * Namespace: http://uicds.org/LoggingService
 * Java type: org.uicds.loggingService.LogRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.loggingService.impl;
/**
 * A document containing one LogRequest(@http://uicds.org/LoggingService) element.
 *
 * This is a complex type.
 */
public class LogRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.loggingService.LogRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public LogRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOGREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/LoggingService", "LogRequest");
    
    
    /**
     * Gets the "LogRequest" element
     */
    public org.uicds.loggingService.LogType getLogRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingService.LogType target = null;
            target = (org.uicds.loggingService.LogType)get_store().find_element_user(LOGREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LogRequest" element
     */
    public void setLogRequest(org.uicds.loggingService.LogType logRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingService.LogType target = null;
            target = (org.uicds.loggingService.LogType)get_store().find_element_user(LOGREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.loggingService.LogType)get_store().add_element_user(LOGREQUEST$0);
            }
            target.set(logRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "LogRequest" element
     */
    public org.uicds.loggingService.LogType addNewLogRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingService.LogType target = null;
            target = (org.uicds.loggingService.LogType)get_store().add_element_user(LOGREQUEST$0);
            return target;
        }
    }
}
