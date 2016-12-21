/*
 * An XML document type.
 * Localname: WorkProductIdentificationList
 * Namespace: http://www.saic.com/precis/2009/06/structures
 * Java type: com.saic.precis.x2009.x06.structures.WorkProductIdentificationListDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.structures.impl;
/**
 * A document containing one WorkProductIdentificationList(@http://www.saic.com/precis/2009/06/structures) element.
 *
 * This is a complex type.
 */
public class WorkProductIdentificationListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.structures.WorkProductIdentificationListDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkProductIdentificationListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATIONLIST$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentificationList");
    
    
    /**
     * Gets the "WorkProductIdentificationList" element
     */
    public com.saic.precis.x2009.x06.base.IdentificationListType getWorkProductIdentificationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationListType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationListType)get_store().find_element_user(WORKPRODUCTIDENTIFICATIONLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductIdentificationList" element
     */
    public void setWorkProductIdentificationList(com.saic.precis.x2009.x06.base.IdentificationListType workProductIdentificationList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationListType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationListType)get_store().find_element_user(WORKPRODUCTIDENTIFICATIONLIST$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IdentificationListType)get_store().add_element_user(WORKPRODUCTIDENTIFICATIONLIST$0);
            }
            target.set(workProductIdentificationList);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductIdentificationList" element
     */
    public com.saic.precis.x2009.x06.base.IdentificationListType addNewWorkProductIdentificationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationListType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationListType)get_store().add_element_user(WORKPRODUCTIDENTIFICATIONLIST$0);
            return target;
        }
    }
}
