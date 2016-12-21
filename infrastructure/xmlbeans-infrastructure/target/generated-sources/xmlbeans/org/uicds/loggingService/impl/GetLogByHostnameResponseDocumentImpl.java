/*
 * An XML document type.
 * Localname: GetLogByHostnameResponse
 * Namespace: http://uicds.org/LoggingService
 * Java type: org.uicds.loggingService.GetLogByHostnameResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.loggingService.impl;
/**
 * A document containing one GetLogByHostnameResponse(@http://uicds.org/LoggingService) element.
 *
 * This is a complex type.
 */
public class GetLogByHostnameResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.loggingService.GetLogByHostnameResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLogByHostnameResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLOGBYHOSTNAMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/LoggingService", "GetLogByHostnameResponse");
    
    
    /**
     * Gets the "GetLogByHostnameResponse" element
     */
    public org.uicds.loggingService.GetLogByHostnameResponseDocument.GetLogByHostnameResponse getGetLogByHostnameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingService.GetLogByHostnameResponseDocument.GetLogByHostnameResponse target = null;
            target = (org.uicds.loggingService.GetLogByHostnameResponseDocument.GetLogByHostnameResponse)get_store().find_element_user(GETLOGBYHOSTNAMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLogByHostnameResponse" element
     */
    public void setGetLogByHostnameResponse(org.uicds.loggingService.GetLogByHostnameResponseDocument.GetLogByHostnameResponse getLogByHostnameResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingService.GetLogByHostnameResponseDocument.GetLogByHostnameResponse target = null;
            target = (org.uicds.loggingService.GetLogByHostnameResponseDocument.GetLogByHostnameResponse)get_store().find_element_user(GETLOGBYHOSTNAMERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.loggingService.GetLogByHostnameResponseDocument.GetLogByHostnameResponse)get_store().add_element_user(GETLOGBYHOSTNAMERESPONSE$0);
            }
            target.set(getLogByHostnameResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetLogByHostnameResponse" element
     */
    public org.uicds.loggingService.GetLogByHostnameResponseDocument.GetLogByHostnameResponse addNewGetLogByHostnameResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.loggingService.GetLogByHostnameResponseDocument.GetLogByHostnameResponse target = null;
            target = (org.uicds.loggingService.GetLogByHostnameResponseDocument.GetLogByHostnameResponse)get_store().add_element_user(GETLOGBYHOSTNAMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetLogByHostnameResponse(@http://uicds.org/LoggingService).
     *
     * This is a complex type.
     */
    public static class GetLogByHostnameResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.loggingService.GetLogByHostnameResponseDocument.GetLogByHostnameResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetLogByHostnameResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HOSTNAME$0 = 
            new javax.xml.namespace.QName("http://uicds.org/LoggingService", "hostname");
        private static final javax.xml.namespace.QName NUMBEROFRECORDS$2 = 
            new javax.xml.namespace.QName("http://uicds.org/LoggingService", "numberOfRecords");
        private static final javax.xml.namespace.QName LOGRECORD$4 = 
            new javax.xml.namespace.QName("http://uicds.org/LoggingService", "logRecord");
        
        
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
        public org.uicds.loggingService.LogType[] getLogRecordArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LOGRECORD$4, targetList);
                org.uicds.loggingService.LogType[] result = new org.uicds.loggingService.LogType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "logRecord" element
         */
        public org.uicds.loggingService.LogType getLogRecordArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.loggingService.LogType target = null;
                target = (org.uicds.loggingService.LogType)get_store().find_element_user(LOGRECORD$4, i);
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
        public void setLogRecordArray(org.uicds.loggingService.LogType[] logRecordArray)
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
        public void setLogRecordArray(int i, org.uicds.loggingService.LogType logRecord)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.loggingService.LogType target = null;
                target = (org.uicds.loggingService.LogType)get_store().find_element_user(LOGRECORD$4, i);
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
        public org.uicds.loggingService.LogType insertNewLogRecord(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.loggingService.LogType target = null;
                target = (org.uicds.loggingService.LogType)get_store().insert_element_user(LOGRECORD$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "logRecord" element
         */
        public org.uicds.loggingService.LogType addNewLogRecord()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.loggingService.LogType target = null;
                target = (org.uicds.loggingService.LogType)get_store().add_element_user(LOGRECORD$4);
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
