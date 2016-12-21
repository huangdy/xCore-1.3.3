/*
 * An XML document type.
 * Localname: ACT
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.ACTDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one ACT(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class ACTDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.ACTDocument
{
    private static final long serialVersionUID = 1L;
    
    public ACTDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACT$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "ACT");
    
    
    /**
     * Gets the "ACT" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType getACT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(ACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ACT" element
     */
    public void setACT(com.saic.precis.x2009.x06.base.IdentifierType act)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(ACT$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(ACT$0);
            }
            target.set(act);
        }
    }
    
    /**
     * Appends and returns a new empty "ACT" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType addNewACT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(ACT$0);
            return target;
        }
    }
}
