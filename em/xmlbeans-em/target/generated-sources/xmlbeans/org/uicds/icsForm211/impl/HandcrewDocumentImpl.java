/*
 * An XML document type.
 * Localname: Handcrew
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.HandcrewDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211.impl;
/**
 * A document containing one Handcrew(@http://uicds.org/ICSForm211) element.
 *
 * This is a complex type.
 */
public class HandcrewDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm211.HandcrewDocument
{
    private static final long serialVersionUID = 1L;
    
    public HandcrewDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HANDCREW$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Handcrew");
    
    
    /**
     * Gets the "Handcrew" element
     */
    public boolean getHandcrew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HANDCREW$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Handcrew" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHandcrew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HANDCREW$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Handcrew" element
     */
    public void setHandcrew(boolean handcrew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HANDCREW$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HANDCREW$0);
            }
            target.setBooleanValue(handcrew);
        }
    }
    
    /**
     * Sets (as xml) the "Handcrew" element
     */
    public void xsetHandcrew(org.apache.xmlbeans.XmlBoolean handcrew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HANDCREW$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HANDCREW$0);
            }
            target.set(handcrew);
        }
    }
}
