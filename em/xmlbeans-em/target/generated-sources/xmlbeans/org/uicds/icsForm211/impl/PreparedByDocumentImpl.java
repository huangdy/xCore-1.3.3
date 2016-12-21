/*
 * An XML document type.
 * Localname: PreparedBy
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.PreparedByDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211.impl;
/**
 * A document containing one PreparedBy(@http://uicds.org/ICSForm211) element.
 *
 * This is a complex type.
 */
public class PreparedByDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm211.PreparedByDocument
{
    private static final long serialVersionUID = 1L;
    
    public PreparedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREPAREDBY$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "PreparedBy");
    
    
    /**
     * Gets the "PreparedBy" element
     */
    public java.lang.String getPreparedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PreparedBy" element
     */
    public org.apache.xmlbeans.XmlString xgetPreparedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PreparedBy" element
     */
    public void setPreparedBy(java.lang.String preparedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREPAREDBY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREPAREDBY$0);
            }
            target.setStringValue(preparedBy);
        }
    }
    
    /**
     * Sets (as xml) the "PreparedBy" element
     */
    public void xsetPreparedBy(org.apache.xmlbeans.XmlString preparedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREPAREDBY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREPAREDBY$0);
            }
            target.set(preparedBy);
        }
    }
}
