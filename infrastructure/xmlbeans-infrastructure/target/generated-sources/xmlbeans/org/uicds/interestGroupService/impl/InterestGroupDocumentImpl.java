/*
 * An XML document type.
 * Localname: InterestGroup
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.InterestGroupDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one InterestGroup(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class InterestGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.InterestGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public InterestGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERESTGROUP$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroup");
    
    
    /**
     * Gets the "InterestGroup" element
     */
    public com.saic.precis.x2009.x06.structures.InterestGroupType getInterestGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.InterestGroupType target = null;
            target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().find_element_user(INTERESTGROUP$0, 0);
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
            target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().find_element_user(INTERESTGROUP$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().add_element_user(INTERESTGROUP$0);
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
            target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().add_element_user(INTERESTGROUP$0);
            return target;
        }
    }
}
