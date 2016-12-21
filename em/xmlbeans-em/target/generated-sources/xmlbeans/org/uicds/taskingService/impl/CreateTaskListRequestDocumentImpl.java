/*
 * An XML document type.
 * Localname: CreateTaskListRequest
 * Namespace: http://uicds.org/TaskingService
 * Java type: org.uicds.taskingService.CreateTaskListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.taskingService.impl;
/**
 * A document containing one CreateTaskListRequest(@http://uicds.org/TaskingService) element.
 *
 * This is a complex type.
 */
public class CreateTaskListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.CreateTaskListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateTaskListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATETASKLISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "CreateTaskListRequest");
    
    
    /**
     * Gets the "CreateTaskListRequest" element
     */
    public org.uicds.taskingService.CreateTaskListRequestDocument.CreateTaskListRequest getCreateTaskListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.CreateTaskListRequestDocument.CreateTaskListRequest target = null;
            target = (org.uicds.taskingService.CreateTaskListRequestDocument.CreateTaskListRequest)get_store().find_element_user(CREATETASKLISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateTaskListRequest" element
     */
    public void setCreateTaskListRequest(org.uicds.taskingService.CreateTaskListRequestDocument.CreateTaskListRequest createTaskListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.CreateTaskListRequestDocument.CreateTaskListRequest target = null;
            target = (org.uicds.taskingService.CreateTaskListRequestDocument.CreateTaskListRequest)get_store().find_element_user(CREATETASKLISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.taskingService.CreateTaskListRequestDocument.CreateTaskListRequest)get_store().add_element_user(CREATETASKLISTREQUEST$0);
            }
            target.set(createTaskListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateTaskListRequest" element
     */
    public org.uicds.taskingService.CreateTaskListRequestDocument.CreateTaskListRequest addNewCreateTaskListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.CreateTaskListRequestDocument.CreateTaskListRequest target = null;
            target = (org.uicds.taskingService.CreateTaskListRequestDocument.CreateTaskListRequest)get_store().add_element_user(CREATETASKLISTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateTaskListRequest(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public static class CreateTaskListRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.CreateTaskListRequestDocument.CreateTaskListRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CreateTaskListRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ENTITYID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/TaskingService", "entityID");
        private static final javax.xml.namespace.QName INCIDENTID$2 = 
            new javax.xml.namespace.QName("http://uicds.org/TaskingService", "incidentId");
        private static final javax.xml.namespace.QName TASKLIST$4 = 
            new javax.xml.namespace.QName("http://uicds.org/TaskingService", "TaskList");
        
        
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
         * True if has "entityID" element
         */
        public boolean isSetEntityID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ENTITYID$0) != 0;
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
         * Unsets the "entityID" element
         */
        public void unsetEntityID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ENTITYID$0, 0);
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
        
        /**
         * Gets the "TaskList" element
         */
        public org.uicds.taskingService.TaskListType getTaskList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.taskingService.TaskListType target = null;
                target = (org.uicds.taskingService.TaskListType)get_store().find_element_user(TASKLIST$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "TaskList" element
         */
        public void setTaskList(org.uicds.taskingService.TaskListType taskList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.taskingService.TaskListType target = null;
                target = (org.uicds.taskingService.TaskListType)get_store().find_element_user(TASKLIST$4, 0);
                if (target == null)
                {
                    target = (org.uicds.taskingService.TaskListType)get_store().add_element_user(TASKLIST$4);
                }
                target.set(taskList);
            }
        }
        
        /**
         * Appends and returns a new empty "TaskList" element
         */
        public org.uicds.taskingService.TaskListType addNewTaskList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.taskingService.TaskListType target = null;
                target = (org.uicds.taskingService.TaskListType)get_store().add_element_user(TASKLIST$4);
                return target;
            }
        }
    }
}
