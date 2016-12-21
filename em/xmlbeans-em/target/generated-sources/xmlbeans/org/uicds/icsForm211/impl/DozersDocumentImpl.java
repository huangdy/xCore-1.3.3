/*
 * An XML document type.
 * Localname: Dozers
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.DozersDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211.impl;
/**
 * A document containing one Dozers(@http://uicds.org/ICSForm211) element.
 *
 * This is a complex type.
 */
public class DozersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm211.DozersDocument
{
    private static final long serialVersionUID = 1L;
    
    public DozersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOZERS$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Dozers");
    
    
    /**
     * Gets the "Dozers" element
     */
    public boolean getDozers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOZERS$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Dozers" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetDozers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DOZERS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Dozers" element
     */
    public void setDozers(boolean dozers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOZERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOZERS$0);
            }
            target.setBooleanValue(dozers);
        }
    }
    
    /**
     * Sets (as xml) the "Dozers" element
     */
    public void xsetDozers(org.apache.xmlbeans.XmlBoolean dozers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DOZERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DOZERS$0);
            }
            target.set(dozers);
        }
    }
}
