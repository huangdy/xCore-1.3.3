/*
 * An XML document type.
 * Localname: WorkProductInterestGroup
 * Namespace: http://www.saic.com/precis/2009/06/structures
 * Java type: com.saic.precis.x2009.x06.structures.WorkProductInterestGroupDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.structures.impl;
/**
 * A document containing one WorkProductInterestGroup(@http://www.saic.com/precis/2009/06/structures) element.
 *
 * This is a complex type.
 */
public class WorkProductInterestGroupDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.structures.WorkProductInterestGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkProductInterestGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCTINTERESTGROUP$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductInterestGroup");
    
    
    /**
     * Gets the "WorkProductInterestGroup" element
     */
    public com.saic.precis.x2009.x06.structures.InterestGroupType getWorkProductInterestGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.InterestGroupType target = null;
            target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().find_element_user(WORKPRODUCTINTERESTGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductInterestGroup" element
     */
    public void setWorkProductInterestGroup(com.saic.precis.x2009.x06.structures.InterestGroupType workProductInterestGroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.InterestGroupType target = null;
            target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().find_element_user(WORKPRODUCTINTERESTGROUP$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().add_element_user(WORKPRODUCTINTERESTGROUP$0);
            }
            target.set(workProductInterestGroup);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductInterestGroup" element
     */
    public com.saic.precis.x2009.x06.structures.InterestGroupType addNewWorkProductInterestGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.InterestGroupType target = null;
            target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().add_element_user(WORKPRODUCTINTERESTGROUP$0);
            return target;
        }
    }
}
