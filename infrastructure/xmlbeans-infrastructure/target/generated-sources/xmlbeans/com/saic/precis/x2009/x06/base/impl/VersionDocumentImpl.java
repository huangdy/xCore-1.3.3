/*
 * An XML document type.
 * Localname: Version
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.VersionDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one Version(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class VersionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.VersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public VersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Version");
    
    
    /**
     * Gets the "Version" element
     */
    public com.saic.precis.x2009.x06.base.VersionType getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.VersionType target = null;
            target = (com.saic.precis.x2009.x06.base.VersionType)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Version" element
     */
    public void setVersion(com.saic.precis.x2009.x06.base.VersionType version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.VersionType target = null;
            target = (com.saic.precis.x2009.x06.base.VersionType)get_store().find_element_user(VERSION$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.VersionType)get_store().add_element_user(VERSION$0);
            }
            target.set(version);
        }
    }
    
    /**
     * Appends and returns a new empty "Version" element
     */
    public com.saic.precis.x2009.x06.base.VersionType addNewVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.VersionType target = null;
            target = (com.saic.precis.x2009.x06.base.VersionType)get_store().add_element_user(VERSION$0);
            return target;
        }
    }
}
