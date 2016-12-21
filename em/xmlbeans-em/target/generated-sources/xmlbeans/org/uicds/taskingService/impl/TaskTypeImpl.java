/*
 * XML Type:  TaskType
 * Namespace: http://uicds.org/TaskingService
 * Java type: org.uicds.taskingService.TaskType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.taskingService.impl;
/**
 * An XML TaskType(@http://uicds.org/TaskingService).
 *
 * This is a complex type.
 */
public class TaskTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.TaskType
{
    private static final long serialVersionUID = 1L;
    
    public TaskTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TASKID$0 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "taskID");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "description");
    private static final javax.xml.namespace.QName PRIORITY$4 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "priority");
    private static final javax.xml.namespace.QName ASSIGNEDTO$6 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "assignedTo");
    private static final javax.xml.namespace.QName ASSIGNEDBY$8 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "assignedBy");
    private static final javax.xml.namespace.QName STATUS$10 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "status");
    private static final javax.xml.namespace.QName DUEDATE$12 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "dueDate");
    
    
    /**
     * Gets the "taskID" element
     */
    public java.lang.String getTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "taskID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTaskID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TASKID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "taskID" element
     */
    public void setTaskID(java.lang.String taskID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKID$0);
            }
            target.setStringValue(taskID);
        }
    }
    
    /**
     * Sets (as xml) the "taskID" element
     */
    public void xsetTaskID(org.apache.xmlbeans.XmlAnyURI taskID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TASKID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(TASKID$0);
            }
            target.set(taskID);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "priority" element
     */
    public int getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "priority" element
     */
    public org.apache.xmlbeans.XmlInt xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIORITY$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "priority" element
     */
    public void setPriority(int priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$4);
            }
            target.setIntValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "priority" element
     */
    public void xsetPriority(org.apache.xmlbeans.XmlInt priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIORITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRIORITY$4);
            }
            target.set(priority);
        }
    }
    
    /**
     * Gets the "assignedTo" element
     */
    public org.uicds.taskingService.TaskType.AssignedTo getAssignedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType.AssignedTo target = null;
            target = (org.uicds.taskingService.TaskType.AssignedTo)get_store().find_element_user(ASSIGNEDTO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "assignedTo" element
     */
    public void setAssignedTo(org.uicds.taskingService.TaskType.AssignedTo assignedTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType.AssignedTo target = null;
            target = (org.uicds.taskingService.TaskType.AssignedTo)get_store().find_element_user(ASSIGNEDTO$6, 0);
            if (target == null)
            {
                target = (org.uicds.taskingService.TaskType.AssignedTo)get_store().add_element_user(ASSIGNEDTO$6);
            }
            target.set(assignedTo);
        }
    }
    
    /**
     * Appends and returns a new empty "assignedTo" element
     */
    public org.uicds.taskingService.TaskType.AssignedTo addNewAssignedTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType.AssignedTo target = null;
            target = (org.uicds.taskingService.TaskType.AssignedTo)get_store().add_element_user(ASSIGNEDTO$6);
            return target;
        }
    }
    
    /**
     * Gets the "assignedBy" element
     */
    public org.uicds.taskingService.TaskType.AssignedBy getAssignedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType.AssignedBy target = null;
            target = (org.uicds.taskingService.TaskType.AssignedBy)get_store().find_element_user(ASSIGNEDBY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "assignedBy" element
     */
    public void setAssignedBy(org.uicds.taskingService.TaskType.AssignedBy assignedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType.AssignedBy target = null;
            target = (org.uicds.taskingService.TaskType.AssignedBy)get_store().find_element_user(ASSIGNEDBY$8, 0);
            if (target == null)
            {
                target = (org.uicds.taskingService.TaskType.AssignedBy)get_store().add_element_user(ASSIGNEDBY$8);
            }
            target.set(assignedBy);
        }
    }
    
    /**
     * Appends and returns a new empty "assignedBy" element
     */
    public org.uicds.taskingService.TaskType.AssignedBy addNewAssignedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType.AssignedBy target = null;
            target = (org.uicds.taskingService.TaskType.AssignedBy)get_store().add_element_user(ASSIGNEDBY$8);
            return target;
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.uicds.taskingService.TaskType.Status getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType.Status target = null;
            target = (org.uicds.taskingService.TaskType.Status)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.uicds.taskingService.TaskType.Status status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType.Status target = null;
            target = (org.uicds.taskingService.TaskType.Status)get_store().find_element_user(STATUS$10, 0);
            if (target == null)
            {
                target = (org.uicds.taskingService.TaskType.Status)get_store().add_element_user(STATUS$10);
            }
            target.set(status);
        }
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.uicds.taskingService.TaskType.Status addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.TaskType.Status target = null;
            target = (org.uicds.taskingService.TaskType.Status)get_store().add_element_user(STATUS$10);
            return target;
        }
    }
    
    /**
     * Gets the "dueDate" element
     */
    public java.util.Calendar getDueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DUEDATE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dueDate" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDueDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DUEDATE$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dueDate" element
     */
    public void setDueDate(java.util.Calendar dueDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DUEDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DUEDATE$12);
            }
            target.setCalendarValue(dueDate);
        }
    }
    
    /**
     * Sets (as xml) the "dueDate" element
     */
    public void xsetDueDate(org.apache.xmlbeans.XmlDateTime dueDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DUEDATE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DUEDATE$12);
            }
            target.set(dueDate);
        }
    }
    /**
     * An XML assignedTo(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public static class AssignedToImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.TaskType.AssignedTo
    {
        private static final long serialVersionUID = 1L;
        
        public AssignedToImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/TaskingService", "id");
        private static final javax.xml.namespace.QName ASSIGNED$2 = 
            new javax.xml.namespace.QName("http://uicds.org/TaskingService", "assigned");
        private static final javax.xml.namespace.QName ACCEPTED$4 = 
            new javax.xml.namespace.QName("http://uicds.org/TaskingService", "accepted");
        
        
        /**
         * Gets the "id" element
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.apache.xmlbeans.XmlAnyURI id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "assigned" element
         */
        public java.util.Calendar getAssigned()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNED$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "assigned" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetAssigned()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ASSIGNED$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "assigned" element
         */
        public void setAssigned(java.util.Calendar assigned)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNED$2);
                }
                target.setCalendarValue(assigned);
            }
        }
        
        /**
         * Sets (as xml) the "assigned" element
         */
        public void xsetAssigned(org.apache.xmlbeans.XmlDateTime assigned)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ASSIGNED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ASSIGNED$2);
                }
                target.set(assigned);
            }
        }
        
        /**
         * Gets the "accepted" element
         */
        public java.util.Calendar getAccepted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCEPTED$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "accepted" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetAccepted()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ACCEPTED$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "accepted" element
         */
        public void setAccepted(java.util.Calendar accepted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCEPTED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCEPTED$4);
                }
                target.setCalendarValue(accepted);
            }
        }
        
        /**
         * Sets (as xml) the "accepted" element
         */
        public void xsetAccepted(org.apache.xmlbeans.XmlDateTime accepted)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ACCEPTED$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ACCEPTED$4);
                }
                target.set(accepted);
            }
        }
    }
    /**
     * An XML assignedBy(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public static class AssignedByImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.TaskType.AssignedBy
    {
        private static final long serialVersionUID = 1L;
        
        public AssignedByImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/TaskingService", "id");
        private static final javax.xml.namespace.QName ASSIGNED$2 = 
            new javax.xml.namespace.QName("http://uicds.org/TaskingService", "assigned");
        
        
        /**
         * Gets the "id" element
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "id" element
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" element
         */
        public void xsetId(org.apache.xmlbeans.XmlAnyURI id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Gets the "assigned" element
         */
        public java.util.Calendar getAssigned()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNED$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "assigned" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetAssigned()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ASSIGNED$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "assigned" element
         */
        public void setAssigned(java.util.Calendar assigned)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNED$2);
                }
                target.setCalendarValue(assigned);
            }
        }
        
        /**
         * Sets (as xml) the "assigned" element
         */
        public void xsetAssigned(org.apache.xmlbeans.XmlDateTime assigned)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ASSIGNED$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ASSIGNED$2);
                }
                target.set(assigned);
            }
        }
    }
    /**
     * An XML status(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public static class StatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.TaskType.Status
    {
        private static final long serialVersionUID = 1L;
        
        public StatusImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STATUS$0 = 
            new javax.xml.namespace.QName("http://uicds.org/TaskingService", "Status");
        
        
        /**
         * Gets array of all "Status" elements
         */
        public org.apache.xmlbeans.XmlObject[] getStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(STATUS$0, targetList);
                org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Status" element
         */
        public org.apache.xmlbeans.XmlObject getStatusArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(STATUS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Status" element
         */
        public int sizeOfStatusArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STATUS$0);
            }
        }
        
        /**
         * Sets array of all "Status" element
         */
        public void setStatusArray(org.apache.xmlbeans.XmlObject[] statusArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(statusArray, STATUS$0);
            }
        }
        
        /**
         * Sets ith "Status" element
         */
        public void setStatusArray(int i, org.apache.xmlbeans.XmlObject status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(STATUS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(status);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Status" element
         */
        public org.apache.xmlbeans.XmlObject insertNewStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(STATUS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Status" element
         */
        public org.apache.xmlbeans.XmlObject addNewStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(STATUS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Status" element
         */
        public void removeStatus(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STATUS$0, i);
            }
        }
    }
}
