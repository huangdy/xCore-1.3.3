/*
 * XML Type:  ResourceInstanceListType
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.ResourceInstanceListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * An XML ResourceInstanceListType(@http://uicds.org/ResourceInstanceService).
 *
 * This is a complex type.
 */
public class ResourceInstanceListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.ResourceInstanceListType
{
    private static final long serialVersionUID = 1L;
    
    public ResourceInstanceListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEINSTANCE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ResourceInstance");
    
    
    /**
     * Gets array of all "ResourceInstance" elements
     */
    public org.uicds.resourceInstanceService.ResourceInstance[] getResourceInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEINSTANCE$0, targetList);
            org.uicds.resourceInstanceService.ResourceInstance[] result = new org.uicds.resourceInstanceService.ResourceInstance[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ResourceInstance" element
     */
    public org.uicds.resourceInstanceService.ResourceInstance getResourceInstanceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance)get_store().find_element_user(RESOURCEINSTANCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ResourceInstance" element
     */
    public int sizeOfResourceInstanceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEINSTANCE$0);
        }
    }
    
    /**
     * Sets array of all "ResourceInstance" element
     */
    public void setResourceInstanceArray(org.uicds.resourceInstanceService.ResourceInstance[] resourceInstanceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceInstanceArray, RESOURCEINSTANCE$0);
        }
    }
    
    /**
     * Sets ith "ResourceInstance" element
     */
    public void setResourceInstanceArray(int i, org.uicds.resourceInstanceService.ResourceInstance resourceInstance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance)get_store().find_element_user(RESOURCEINSTANCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceInstance);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResourceInstance" element
     */
    public org.uicds.resourceInstanceService.ResourceInstance insertNewResourceInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance)get_store().insert_element_user(RESOURCEINSTANCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResourceInstance" element
     */
    public org.uicds.resourceInstanceService.ResourceInstance addNewResourceInstance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.ResourceInstance target = null;
            target = (org.uicds.resourceInstanceService.ResourceInstance)get_store().add_element_user(RESOURCEINSTANCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ResourceInstance" element
     */
    public void removeResourceInstance(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEINSTANCE$0, i);
        }
    }
}
