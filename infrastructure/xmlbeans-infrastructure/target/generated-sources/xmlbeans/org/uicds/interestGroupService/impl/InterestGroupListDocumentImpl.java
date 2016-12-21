/*
 * An XML document type.
 * Localname: InterestGroupList
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.InterestGroupListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one InterestGroupList(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class InterestGroupListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.InterestGroupListDocument
{
    private static final long serialVersionUID = 1L;
    
    public InterestGroupListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERESTGROUPLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroupList");
    
    
    /**
     * Gets the "InterestGroupList" element
     */
    public org.uicds.interestGroupService.InterestGroupListType getInterestGroupList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.InterestGroupListType target = null;
            target = (org.uicds.interestGroupService.InterestGroupListType)get_store().find_element_user(INTERESTGROUPLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InterestGroupList" element
     */
    public void setInterestGroupList(org.uicds.interestGroupService.InterestGroupListType interestGroupList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.InterestGroupListType target = null;
            target = (org.uicds.interestGroupService.InterestGroupListType)get_store().find_element_user(INTERESTGROUPLIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.InterestGroupListType)get_store().add_element_user(INTERESTGROUPLIST$0);
            }
            target.set(interestGroupList);
        }
    }
    
    /**
     * Appends and returns a new empty "InterestGroupList" element
     */
    public org.uicds.interestGroupService.InterestGroupListType addNewInterestGroupList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.InterestGroupListType target = null;
            target = (org.uicds.interestGroupService.InterestGroupListType)get_store().add_element_user(INTERESTGROUPLIST$0);
            return target;
        }
    }
}
