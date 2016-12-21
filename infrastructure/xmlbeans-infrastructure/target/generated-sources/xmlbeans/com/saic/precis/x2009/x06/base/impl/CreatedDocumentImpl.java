/*
 * An XML document type.
 * Localname: Created
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.CreatedDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one Created(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class CreatedDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.CreatedDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreatedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATED$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Created");
    
    
    /**
     * Gets the "Created" element
     */
    public com.saic.precis.x2009.x06.base.DateTimeType getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.DateTimeType target = null;
            target = (com.saic.precis.x2009.x06.base.DateTimeType)get_store().find_element_user(CREATED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Created" element
     */
    public void setCreated(com.saic.precis.x2009.x06.base.DateTimeType created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.DateTimeType target = null;
            target = (com.saic.precis.x2009.x06.base.DateTimeType)get_store().find_element_user(CREATED$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.DateTimeType)get_store().add_element_user(CREATED$0);
            }
            target.set(created);
        }
    }
    
    /**
     * Appends and returns a new empty "Created" element
     */
    public com.saic.precis.x2009.x06.base.DateTimeType addNewCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.DateTimeType target = null;
            target = (com.saic.precis.x2009.x06.base.DateTimeType)get_store().add_element_user(CREATED$0);
            return target;
        }
    }
}
