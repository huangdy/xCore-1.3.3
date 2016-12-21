/*
 * An XML document type.
 * Localname: Helicopters
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.HelicoptersDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211.impl;
/**
 * A document containing one Helicopters(@http://uicds.org/ICSForm211) element.
 *
 * This is a complex type.
 */
public class HelicoptersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm211.HelicoptersDocument
{
    private static final long serialVersionUID = 1L;
    
    public HelicoptersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HELICOPTERS$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Helicopters");
    
    
    /**
     * Gets the "Helicopters" element
     */
    public boolean getHelicopters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HELICOPTERS$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Helicopters" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHelicopters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HELICOPTERS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Helicopters" element
     */
    public void setHelicopters(boolean helicopters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HELICOPTERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HELICOPTERS$0);
            }
            target.setBooleanValue(helicopters);
        }
    }
    
    /**
     * Sets (as xml) the "Helicopters" element
     */
    public void xsetHelicopters(org.apache.xmlbeans.XmlBoolean helicopters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HELICOPTERS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HELICOPTERS$0);
            }
            target.set(helicopters);
        }
    }
}
