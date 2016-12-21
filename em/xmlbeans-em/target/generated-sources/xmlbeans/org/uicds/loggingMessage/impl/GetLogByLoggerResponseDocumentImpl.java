/*
 * An XML document type.
 * Localname: GetLogByLoggerResponse
 * Namespace: http://uicds.org/LoggingMessage
 * Java type: org.uicds.loggingMessage.GetLogByLoggerResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.loggingMessage.impl;
/**
 * A document containing one GetLogByLoggerResponse(@http://uicds.org/LoggingMessage) element.
 *
 * This is a complex type.
 */
public class GetLogByLoggerResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.loggingMessage.GetLogByLoggerResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLogByLoggerResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLOGBYLOGGERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/LoggingMessage", "GetLogByLoggerResponse");
    
    
    /**
     * Gets the "GetLogByLoggerResponse" element
     */
    public org.uicds.loggingMessage.GetLogByLoggerResponseDocument.GetLogByLoggerResponse getGetLogByLoggerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingMessage.GetLogByLoggerResponseDocument.GetLogByLoggerResponse target = null;
            target = (org.uicds.loggingMessage.GetLogByLoggerResponseDocument.GetLogByLoggerResponse)get_store().find_element_user(GETLOGBYLOGGERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLogByLoggerResponse" element
     */
    public void setGetLogByLoggerResponse(org.uicds.loggingMessage.GetLogByLoggerResponseDocument.GetLogByLoggerResponse getLogByLoggerResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingMessage.GetLogByLoggerResponseDocument.GetLogByLoggerResponse target = null;
            target = (org.uicds.loggingMessage.GetLogByLoggerResponseDocument.GetLogByLoggerResponse)get_store().find_element_user(GETLOGBYLOGGERRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.loggingMessage.GetLogByLoggerResponseDocument.GetLogByLoggerResponse)get_store().add_element_user(GETLOGBYLOGGERRESPONSE$0);
            }
            target.set(getLogByLoggerResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetLogByLoggerResponse" element
     */
    public org.uicds.loggingMessage.GetLogByLoggerResponseDocument.GetLogByLoggerResponse addNewGetLogByLoggerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingMessage.GetLogByLoggerResponseDocument.GetLogByLoggerResponse target = null;
            target = (org.uicds.loggingMessage.GetLogByLoggerResponseDocument.GetLogByLoggerResponse)get_store().add_element_user(GETLOGBYLOGGERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetLogByLoggerResponse(@http://uicds.org/LoggingMessage).
     *
     * This is a complex type.
     */
    public static class GetLogByLoggerResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.loggingMessage.GetLogByLoggerResponseDocument.GetLogByLoggerResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetLogByLoggerResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LOGGER$0 = 
            new javax.xml.namespace.QName("http://uicds.org/LoggingMessage", "logger");
        private static final javax.xml.namespace.QName NUMBEROFRECORDS$2 = 
            new javax.xml.namespace.QName("http://uicds.org/LoggingMessage", "numberOfRecords");
        private static final javax.xml.namespace.QName LOGRECORD$4 = 
            new javax.xml.namespace.QName("http://uicds.org/LoggingMessage", "logRecord");
        
        
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
        
        /**
         * Gets the "numberOfRecords" element
         */
        public int getNumberOfRecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFRECORDS$2, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "numberOfRecords" element
         */
        public org.apache.xmlbeans.XmlInt xgetNumberOfRecords()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFRECORDS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numberOfRecords" element
         */
        public void setNumberOfRecords(int numberOfRecords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBEROFRECORDS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBEROFRECORDS$2);
                }
                target.setIntValue(numberOfRecords);
            }
        }
        
        /**
         * Sets (as xml) the "numberOfRecords" element
         */
        public void xsetNumberOfRecords(org.apache.xmlbeans.XmlInt numberOfRecords)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBEROFRECORDS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBEROFRECORDS$2);
                }
                target.set(numberOfRecords);
            }
        }
        
        /**
         * Gets array of all "logRecord" elements
         */
        public org.uicds.loggingMessage.LogType[] getLogRecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LOGRECORD$4, targetList);
                org.uicds.loggingMessage.LogType[] result = new org.uicds.loggingMessage.LogType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "logRecord" element
         */
        public org.uicds.loggingMessage.LogType getLogRecordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.loggingMessage.LogType target = null;
                target = (org.uicds.loggingMessage.LogType)get_store().find_element_user(LOGRECORD$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "logRecord" element
         */
        public int sizeOfLogRecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOGRECORD$4);
            }
        }
        
        /**
         * Sets array of all "logRecord" element
         */
        public void setLogRecordArray(org.uicds.loggingMessage.LogType[] logRecordArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(logRecordArray, LOGRECORD$4);
            }
        }
        
        /**
         * Sets ith "logRecord" element
         */
        public void setLogRecordArray(int i, org.uicds.loggingMessage.LogType logRecord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.loggingMessage.LogType target = null;
                target = (org.uicds.loggingMessage.LogType)get_store().find_element_user(LOGRECORD$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(logRecord);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "logRecord" element
         */
        public org.uicds.loggingMessage.LogType insertNewLogRecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.loggingMessage.LogType target = null;
                target = (org.uicds.loggingMessage.LogType)get_store().insert_element_user(LOGRECORD$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "logRecord" element
         */
        public org.uicds.loggingMessage.LogType addNewLogRecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.loggingMessage.LogType target = null;
                target = (org.uicds.loggingMessage.LogType)get_store().add_element_user(LOGRECORD$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "logRecord" element
         */
        public void removeLogRecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOGRECORD$4, i);
            }
        }
    }
}
