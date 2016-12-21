/*
 * XML Type:  InterestGroupListInfoType
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.InterestGroupListInfoType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * An XML InterestGroupListInfoType(@http://uicds.org/InterestGroupService).
 *
 * This is a complex type.
 */
public class InterestGroupListInfoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.InterestGroupListInfoType
{
    private static final long serialVersionUID = 1L;
    
    public InterestGroupListInfoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "Id");
    private static final javax.xml.namespace.QName INTERESTGROUP$2 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroup");
    
    
    /**
     * Gets the "Id" element
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
     * Gets (as xml) the "Id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Id" element
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
     * Sets (as xml) the "Id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "InterestGroup" element
     */
    public com.saic.precis.x2009.x06.structures.InterestGroupType getInterestGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.InterestGroupType target = null;
            target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().find_element_user(INTERESTGROUP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InterestGroup" element
     */
    public void setInterestGroup(com.saic.precis.x2009.x06.structures.InterestGroupType interestGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.InterestGroupType target = null;
            target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().find_element_user(INTERESTGROUP$2, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().add_element_user(INTERESTGROUP$2);
            }
            target.set(interestGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "InterestGroup" element
     */
    public com.saic.precis.x2009.x06.structures.InterestGroupType addNewInterestGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.InterestGroupType target = null;
            target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().add_element_user(INTERESTGROUP$2);
            return target;
        }
    }
}
