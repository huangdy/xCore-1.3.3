/*
 * An XML document type.
 * Localname: UpdateTaskListRequest
 * Namespace: http://uicds.org/TaskingService
 * Java type: org.uicds.taskingService.UpdateTaskListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.taskingService.impl;
/**
 * A document containing one UpdateTaskListRequest(@http://uicds.org/TaskingService) element.
 *
 * This is a complex type.
 */
public class UpdateTaskListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.UpdateTaskListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateTaskListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATETASKLISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "UpdateTaskListRequest");
    
    
    /**
     * Gets the "UpdateTaskListRequest" element
     */
    public org.uicds.taskingService.UpdateTaskListRequestDocument.UpdateTaskListRequest getUpdateTaskListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.UpdateTaskListRequestDocument.UpdateTaskListRequest target = null;
            target = (org.uicds.taskingService.UpdateTaskListRequestDocument.UpdateTaskListRequest)get_store().find_element_user(UPDATETASKLISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateTaskListRequest" element
     */
    public void setUpdateTaskListRequest(org.uicds.taskingService.UpdateTaskListRequestDocument.UpdateTaskListRequest updateTaskListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.UpdateTaskListRequestDocument.UpdateTaskListRequest target = null;
            target = (org.uicds.taskingService.UpdateTaskListRequestDocument.UpdateTaskListRequest)get_store().find_element_user(UPDATETASKLISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.taskingService.UpdateTaskListRequestDocument.UpdateTaskListRequest)get_store().add_element_user(UPDATETASKLISTREQUEST$0);
            }
            target.set(updateTaskListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateTaskListRequest" element
     */
    public org.uicds.taskingService.UpdateTaskListRequestDocument.UpdateTaskListRequest addNewUpdateTaskListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.UpdateTaskListRequestDocument.UpdateTaskListRequest target = null;
            target = (org.uicds.taskingService.UpdateTaskListRequestDocument.UpdateTaskListRequest)get_store().add_element_user(UPDATETASKLISTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UpdateTaskListRequest(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public static class UpdateTaskListRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.UpdateTaskListRequestDocument.UpdateTaskListRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateTaskListRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        private static final javax.xml.namespace.QName TASKLIST$2 = 
            new javax.xml.namespace.QName("http://uicds.org/TaskingService", "TaskList");
        
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductIdentification" element
         */
        public void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                }
                target.set(workProductIdentification);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                return target;
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
                target = (org.uicds.taskingService.TaskListType)get_store().find_element_user(TASKLIST$2, 0);
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
                target = (org.uicds.taskingService.TaskListType)get_store().find_element_user(TASKLIST$2, 0);
                if (target == null)
                {
                    target = (org.uicds.taskingService.TaskListType)get_store().add_element_user(TASKLIST$2);
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
                target = (org.uicds.taskingService.TaskListType)get_store().add_element_user(TASKLIST$2);
                return target;
            }
        }
    }
}
