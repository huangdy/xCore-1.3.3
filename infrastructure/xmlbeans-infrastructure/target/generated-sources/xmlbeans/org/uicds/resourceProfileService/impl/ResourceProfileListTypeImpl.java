/*
 * XML Type:  ResourceProfileListType
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.ResourceProfileListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * An XML ResourceProfileListType(@http://uicds.org/ResourceProfileService).
 *
 * This is a complex type.
 */
public class ResourceProfileListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.ResourceProfileListType
{
    private static final long serialVersionUID = 1L;
    
    public ResourceProfileListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEPROFILE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "ResourceProfile");
    
    
    /**
     * Gets array of all "ResourceProfile" elements
     */
    public org.uicds.resourceProfileService.ResourceProfile[] getResourceProfileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEPROFILE$0, targetList);
            org.uicds.resourceProfileService.ResourceProfile[] result = new org.uicds.resourceProfileService.ResourceProfile[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ResourceProfile" element
     */
    public org.uicds.resourceProfileService.ResourceProfile getResourceProfileArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfile target = null;
            target = (org.uicds.resourceProfileService.ResourceProfile)get_store().find_element_user(RESOURCEPROFILE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ResourceProfile" element
     */
    public int sizeOfResourceProfileArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEPROFILE$0);
        }
    }
    
    /**
     * Sets array of all "ResourceProfile" element
     */
    public void setResourceProfileArray(org.uicds.resourceProfileService.ResourceProfile[] resourceProfileArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceProfileArray, RESOURCEPROFILE$0);
        }
    }
    
    /**
     * Sets ith "ResourceProfile" element
     */
    public void setResourceProfileArray(int i, org.uicds.resourceProfileService.ResourceProfile resourceProfile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfile target = null;
            target = (org.uicds.resourceProfileService.ResourceProfile)get_store().find_element_user(RESOURCEPROFILE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceProfile);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ResourceProfile" element
     */
    public org.uicds.resourceProfileService.ResourceProfile insertNewResourceProfile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfile target = null;
            target = (org.uicds.resourceProfileService.ResourceProfile)get_store().insert_element_user(RESOURCEPROFILE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ResourceProfile" element
     */
    public org.uicds.resourceProfileService.ResourceProfile addNewResourceProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.ResourceProfile target = null;
            target = (org.uicds.resourceProfileService.ResourceProfile)get_store().add_element_user(RESOURCEPROFILE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ResourceProfile" element
     */
    public void removeResourceProfile(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEPROFILE$0, i);
        }
    }
}
