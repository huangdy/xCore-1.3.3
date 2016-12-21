/*
 * An XML document type.
 * Localname: Checksum
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.ChecksumDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one Checksum(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class ChecksumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.ChecksumDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChecksumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKSUM$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Checksum");
    
    
    /**
     * Gets the "Checksum" element
     */
    public com.saic.precis.x2009.x06.base.ChecksumType getChecksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ChecksumType target = null;
            target = (com.saic.precis.x2009.x06.base.ChecksumType)get_store().find_element_user(CHECKSUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Checksum" element
     */
    public void setChecksum(com.saic.precis.x2009.x06.base.ChecksumType checksum)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ChecksumType target = null;
            target = (com.saic.precis.x2009.x06.base.ChecksumType)get_store().find_element_user(CHECKSUM$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.ChecksumType)get_store().add_element_user(CHECKSUM$0);
            }
            target.set(checksum);
        }
    }
    
    /**
     * Appends and returns a new empty "Checksum" element
     */
    public com.saic.precis.x2009.x06.base.ChecksumType addNewChecksum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ChecksumType target = null;
            target = (com.saic.precis.x2009.x06.base.ChecksumType)get_store().add_element_user(CHECKSUM$0);
            return target;
        }
    }
}
