/*
 * XML Type:  TaskListType
 * Namespace: http://uicds.org/TaskingService
 * Java type: org.uicds.taskingService.TaskListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.taskingService.impl;
/**
 * An XML TaskListType(@http://uicds.org/TaskingService).
 *
 * This is a complex type.
 */
public class TaskListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.TaskListType
{
    private static final long serialVersionUID = 1L;
    
    public TaskListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTITYID$0 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "entityId");
    private static final javax.xml.namespace.QName TASK$2 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "Task");
    
    
    /**
     * Gets the "entityId" element
     */
    public java.lang.String getEntityId()
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
     * Gets (as xml) the "entityId" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetEntityId()
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
     * True if has "entityId" element
     */
    public boolean isSetEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYID$0) != 0;
        }
    }
    
    /**
     * Sets the "entityId" element
     */
    public void setEntityId(java.lang.String entityId)
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
            target.setStringValue(entityId);
        }
    }
    
    /**
     * Sets (as xml) the "entityId" element
     */
    public void xsetEntityId(org.apache.xmlbeans.XmlAnyURI entityId)
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
            target.set(entityId);
        }
    }
    
    /**
     * Unsets the "entityId" element
     */
    public void unsetEntityId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYID$0, 0);
        }
    }
    
    /**
     * Gets array of all "Task" elements
     */
    public org.uicds.taskingService.TaskType[] getTaskArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TASK$2, targetList);
            org.uicds.taskingService.TaskType[] result = new org.uicds.taskingService.TaskType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Task" element
     */
    public org.uicds.taskingService.TaskType getTaskArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType target = null;
            target = (org.uicds.taskingService.TaskType)get_store().find_element_user(TASK$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Task" element
     */
    public int sizeOfTaskArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TASK$2);
        }
    }
    
    /**
     * Sets array of all "Task" element
     */
    public void setTaskArray(org.uicds.taskingService.TaskType[] taskArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(taskArray, TASK$2);
        }
    }
    
    /**
     * Sets ith "Task" element
     */
    public void setTaskArray(int i, org.uicds.taskingService.TaskType task)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType target = null;
            target = (org.uicds.taskingService.TaskType)get_store().find_element_user(TASK$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(task);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Task" element
     */
    public org.uicds.taskingService.TaskType insertNewTask(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType target = null;
            target = (org.uicds.taskingService.TaskType)get_store().insert_element_user(TASK$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Task" element
     */
    public org.uicds.taskingService.TaskType addNewTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType target = null;
            target = (org.uicds.taskingService.TaskType)get_store().add_element_user(TASK$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Task" element
     */
    public void removeTask(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TASK$2, i);
        }
    }
}
