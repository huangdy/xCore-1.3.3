/*
 * XML Type:  InterestGroupListType
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.InterestGroupListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * An XML InterestGroupListType(@http://uicds.org/InterestGroupService).
 *
 * This is a complex type.
 */
public class InterestGroupListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.InterestGroupListType
{
    private static final long serialVersionUID = 1L;
    
    public InterestGroupListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERESTGROUPLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroupList");
    
    
    /**
     * Gets array of all "InterestGroupList" elements
     */
    public org.uicds.interestGroupService.InterestGroupListInfoType[] getInterestGroupListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERESTGROUPLIST$0, targetList);
            org.uicds.interestGroupService.InterestGroupListInfoType[] result = new org.uicds.interestGroupService.InterestGroupListInfoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "InterestGroupList" element
     */
    public org.uicds.interestGroupService.InterestGroupListInfoType getInterestGroupListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.InterestGroupListInfoType target = null;
            target = (org.uicds.interestGroupService.InterestGroupListInfoType)get_store().find_element_user(INTERESTGROUPLIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "InterestGroupList" element
     */
    public int sizeOfInterestGroupListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERESTGROUPLIST$0);
        }
    }
    
    /**
     * Sets array of all "InterestGroupList" element
     */
    public void setInterestGroupListArray(org.uicds.interestGroupService.InterestGroupListInfoType[] interestGroupListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(interestGroupListArray, INTERESTGROUPLIST$0);
        }
    }
    
    /**
     * Sets ith "InterestGroupList" element
     */
    public void setInterestGroupListArray(int i, org.uicds.interestGroupService.InterestGroupListInfoType interestGroupList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.InterestGroupListInfoType target = null;
            target = (org.uicds.interestGroupService.InterestGroupListInfoType)get_store().find_element_user(INTERESTGROUPLIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(interestGroupList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InterestGroupList" element
     */
    public org.uicds.interestGroupService.InterestGroupListInfoType insertNewInterestGroupList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.InterestGroupListInfoType target = null;
            target = (org.uicds.interestGroupService.InterestGroupListInfoType)get_store().insert_element_user(INTERESTGROUPLIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InterestGroupList" element
     */
    public org.uicds.interestGroupService.InterestGroupListInfoType addNewInterestGroupList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.InterestGroupListInfoType target = null;
            target = (org.uicds.interestGroupService.InterestGroupListInfoType)get_store().add_element_user(INTERESTGROUPLIST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "InterestGroupList" element
     */
    public void removeInterestGroupList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERESTGROUPLIST$0, i);
        }
    }
}
