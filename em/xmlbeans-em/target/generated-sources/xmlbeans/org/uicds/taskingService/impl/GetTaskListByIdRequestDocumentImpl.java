/*
 * An XML document type.
 * Localname: GetTaskListByIdRequest
 * Namespace: http://uicds.org/TaskingService
 * Java type: org.uicds.taskingService.GetTaskListByIdRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.taskingService.impl;
/**
 * A document containing one GetTaskListByIdRequest(@http://uicds.org/TaskingService) element.
 *
 * This is a complex type.
 */
public class GetTaskListByIdRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.GetTaskListByIdRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTaskListByIdRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKLISTBYIDREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "GetTaskListByIdRequest");
    
    
    /**
     * Gets the "GetTaskListByIdRequest" element
     */
    public org.uicds.taskingService.GetTaskListByIdRequestDocument.GetTaskListByIdRequest getGetTaskListByIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.GetTaskListByIdRequestDocument.GetTaskListByIdRequest target = null;
            target = (org.uicds.taskingService.GetTaskListByIdRequestDocument.GetTaskListByIdRequest)get_store().find_element_user(GETTASKLISTBYIDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetTaskListByIdRequest" element
     */
    public void setGetTaskListByIdRequest(org.uicds.taskingService.GetTaskListByIdRequestDocument.GetTaskListByIdRequest getTaskListByIdRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.GetTaskListByIdRequestDocument.GetTaskListByIdRequest target = null;
            target = (org.uicds.taskingService.GetTaskListByIdRequestDocument.GetTaskListByIdRequest)get_store().find_element_user(GETTASKLISTBYIDREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.taskingService.GetTaskListByIdRequestDocument.GetTaskListByIdRequest)get_store().add_element_user(GETTASKLISTBYIDREQUEST$0);
            }
            target.set(getTaskListByIdRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetTaskListByIdRequest" element
     */
    public org.uicds.taskingService.GetTaskListByIdRequestDocument.GetTaskListByIdRequest addNewGetTaskListByIdRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.GetTaskListByIdRequestDocument.GetTaskListByIdRequest target = null;
            target = (org.uicds.taskingService.GetTaskListByIdRequestDocument.GetTaskListByIdRequest)get_store().add_element_user(GETTASKLISTBYIDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetTaskListByIdRequest(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public static class GetTaskListByIdRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.GetTaskListByIdRequestDocument.GetTaskListByIdRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetTaskListByIdRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/TaskingService", "entityID");
        private static final javax.xml.namespace.QName INCIDENTID$2 = 
            new javax.xml.namespace.QName("http://uicds.org/TaskingService", "incidentId");
        
        
        /**
         * Gets the "entityID" element
         */
        public java.lang.String getEntityID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "entityID" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetEntityID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENTITYID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "entityID" element
         */
        public void setEntityID(java.lang.String entityID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTITYID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTITYID$0);
                }
                target.setStringValue(entityID);
            }
        }
        
        /**
         * Sets (as xml) the "entityID" element
         */
        public void xsetEntityID(org.apache.xmlbeans.XmlAnyURI entityID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENTITYID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ENTITYID$0);
                }
                target.set(entityID);
            }
        }
        
        /**
         * Gets the "incidentId" element
         */
        public java.lang.String getIncidentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "incidentId" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "incidentId" element
         */
        public void setIncidentId(java.lang.String incidentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTID$2);
                }
                target.setStringValue(incidentId);
            }
        }
        
        /**
         * Sets (as xml) the "incidentId" element
         */
        public void xsetIncidentId(org.apache.xmlbeans.XmlString incidentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTID$2);
                }
                target.set(incidentId);
            }
        }
    }
}
