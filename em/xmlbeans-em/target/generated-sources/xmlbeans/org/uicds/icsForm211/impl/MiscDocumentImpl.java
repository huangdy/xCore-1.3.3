/*
 * An XML document type.
 * Localname: Misc
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.MiscDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211.impl;
/**
 * A document containing one Misc(@http://uicds.org/ICSForm211) element.
 *
 * This is a complex type.
 */
public class MiscDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm211.MiscDocument
{
    private static final long serialVersionUID = 1L;
    
    public MiscDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MISC$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Misc");
    
    
    /**
     * Gets the "Misc" element
     */
    public boolean getMisc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISC$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Misc" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMisc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MISC$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Misc" element
     */
    public void setMisc(boolean misc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MISC$0);
            }
            target.setBooleanValue(misc);
        }
    }
    
    /**
     * Sets (as xml) the "Misc" element
     */
    public void xsetMisc(org.apache.xmlbeans.XmlBoolean misc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MISC$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MISC$0);
            }
            target.set(misc);
        }
    }
}
