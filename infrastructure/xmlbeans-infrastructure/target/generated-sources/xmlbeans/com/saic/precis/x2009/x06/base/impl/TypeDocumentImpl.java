/*
 * An XML document type.
 * Localname: Type
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.TypeDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one Type(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class TypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.TypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Type");
    
    
    /**
     * Gets the "Type" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Type" element
     */
    public void setType(com.saic.precis.x2009.x06.base.CodespaceValueType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "Type" element
     */
    public com.saic.precis.x2009.x06.base.CodespaceValueType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.CodespaceValueType target = null;
            target = (com.saic.precis.x2009.x06.base.CodespaceValueType)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
}
