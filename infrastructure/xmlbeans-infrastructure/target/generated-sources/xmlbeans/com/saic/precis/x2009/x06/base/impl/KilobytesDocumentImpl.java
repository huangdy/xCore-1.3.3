/*
 * An XML document type.
 * Localname: Kilobytes
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.KilobytesDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one Kilobytes(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class KilobytesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.KilobytesDocument
{
    private static final long serialVersionUID = 1L;
    
    public KilobytesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KILOBYTES$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Kilobytes");
    
    
    /**
     * Gets the "Kilobytes" element
     */
    public com.saic.precis.x2009.x06.base.IntegerType getKilobytes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IntegerType target = null;
            target = (com.saic.precis.x2009.x06.base.IntegerType)get_store().find_element_user(KILOBYTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Kilobytes" element
     */
    public void setKilobytes(com.saic.precis.x2009.x06.base.IntegerType kilobytes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IntegerType target = null;
            target = (com.saic.precis.x2009.x06.base.IntegerType)get_store().find_element_user(KILOBYTES$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IntegerType)get_store().add_element_user(KILOBYTES$0);
            }
            target.set(kilobytes);
        }
    }
    
    /**
     * Appends and returns a new empty "Kilobytes" element
     */
    public com.saic.precis.x2009.x06.base.IntegerType addNewKilobytes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IntegerType target = null;
            target = (com.saic.precis.x2009.x06.base.IntegerType)get_store().add_element_user(KILOBYTES$0);
            return target;
        }
    }
}
