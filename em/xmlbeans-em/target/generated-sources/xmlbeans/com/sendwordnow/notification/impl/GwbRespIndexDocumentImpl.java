/*
 * An XML document type.
 * Localname: gwbRespIndex
 * Namespace: http://www.sendwordnow.com/notification
 * Java type: com.sendwordnow.notification.GwbRespIndexDocument
 *
 * Automatically generated - do not modify.
 */
package com.sendwordnow.notification.impl;
/**
 * A document containing one gwbRespIndex(@http://www.sendwordnow.com/notification) element.
 *
 * This is a complex type.
 */
public class GwbRespIndexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.sendwordnow.notification.GwbRespIndexDocument
{
    private static final long serialVersionUID = 1L;
    
    public GwbRespIndexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GWBRESPINDEX$0 = 
        new javax.xml.namespace.QName("http://www.sendwordnow.com/notification", "gwbRespIndex");
    
    
    /**
     * Gets the "gwbRespIndex" element
     */
    public java.math.BigInteger getGwbRespIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GWBRESPINDEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "gwbRespIndex" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetGwbRespIndex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(GWBRESPINDEX$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "gwbRespIndex" element
     */
    public void setGwbRespIndex(java.math.BigInteger gwbRespIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GWBRESPINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GWBRESPINDEX$0);
            }
            target.setBigIntegerValue(gwbRespIndex);
        }
    }
    
    /**
     * Sets (as xml) the "gwbRespIndex" element
     */
    public void xsetGwbRespIndex(org.apache.xmlbeans.XmlNonNegativeInteger gwbRespIndex)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(GWBRESPINDEX$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(GWBRESPINDEX$0);
            }
            target.set(gwbRespIndex);
        }
    }
}
