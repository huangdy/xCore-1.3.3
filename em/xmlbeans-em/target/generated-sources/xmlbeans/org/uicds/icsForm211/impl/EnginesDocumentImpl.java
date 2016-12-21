/*
 * An XML document type.
 * Localname: Engines
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.EnginesDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211.impl;
/**
 * A document containing one Engines(@http://uicds.org/ICSForm211) element.
 *
 * This is a complex type.
 */
public class EnginesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm211.EnginesDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnginesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENGINES$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Engines");
    
    
    /**
     * Gets the "Engines" element
     */
    public boolean getEngines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENGINES$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Engines" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetEngines()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENGINES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Engines" element
     */
    public void setEngines(boolean engines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENGINES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENGINES$0);
            }
            target.setBooleanValue(engines);
        }
    }
    
    /**
     * Sets (as xml) the "Engines" element
     */
    public void xsetEngines(org.apache.xmlbeans.XmlBoolean engines)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ENGINES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ENGINES$0);
            }
            target.set(engines);
        }
    }
}
