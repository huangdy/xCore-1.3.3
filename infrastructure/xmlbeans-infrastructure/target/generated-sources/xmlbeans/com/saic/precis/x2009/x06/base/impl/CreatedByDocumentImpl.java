/*
 * An XML document type.
 * Localname: CreatedBy
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.CreatedByDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one CreatedBy(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class CreatedByDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.CreatedByDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreatedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEDBY$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "CreatedBy");
    
    
    /**
     * Gets the "CreatedBy" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType getCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(CREATEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreatedBy" element
     */
    public void setCreatedBy(com.saic.precis.x2009.x06.base.IdentifierType createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(CREATEDBY$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(CREATEDBY$0);
            }
            target.set(createdBy);
        }
    }
    
    /**
     * Appends and returns a new empty "CreatedBy" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType addNewCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(CREATEDBY$0);
            return target;
        }
    }
}
