/*
 * An XML document type.
 * Localname: LastUpdatedBy
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.LastUpdatedByDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one LastUpdatedBy(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class LastUpdatedByDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.LastUpdatedByDocument
{
    private static final long serialVersionUID = 1L;
    
    public LastUpdatedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LASTUPDATEDBY$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "LastUpdatedBy");
    
    
    /**
     * Gets the "LastUpdatedBy" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType getLastUpdatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(LASTUPDATEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LastUpdatedBy" element
     */
    public void setLastUpdatedBy(com.saic.precis.x2009.x06.base.IdentifierType lastUpdatedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(LASTUPDATEDBY$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(LASTUPDATEDBY$0);
            }
            target.set(lastUpdatedBy);
        }
    }
    
    /**
     * Appends and returns a new empty "LastUpdatedBy" element
     */
    public com.saic.precis.x2009.x06.base.IdentifierType addNewLastUpdatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentifierType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(LASTUPDATEDBY$0);
            return target;
        }
    }
}
