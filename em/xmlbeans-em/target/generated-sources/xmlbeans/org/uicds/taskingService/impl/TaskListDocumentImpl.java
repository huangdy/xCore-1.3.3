/*
 * An XML document type.
 * Localname: TaskList
 * Namespace: http://uicds.org/TaskingService
 * Java type: org.uicds.taskingService.TaskListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.taskingService.impl;
/**
 * A document containing one TaskList(@http://uicds.org/TaskingService) element.
 *
 * This is a complex type.
 */
public class TaskListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.TaskListDocument
{
    private static final long serialVersionUID = 1L;
    
    public TaskListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASKLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "TaskList");
    
    
    /**
     * Gets the "TaskList" element
     */
    public org.uicds.taskingService.TaskListType getTaskList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskListType target = null;
            target = (org.uicds.taskingService.TaskListType)get_store().find_element_user(TASKLIST$0, 0);
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
            target = (org.uicds.taskingService.TaskListType)get_store().find_element_user(TASKLIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.taskingService.TaskListType)get_store().add_element_user(TASKLIST$0);
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
            target = (org.uicds.taskingService.TaskListType)get_store().add_element_user(TASKLIST$0);
            return target;
        }
    }
}
