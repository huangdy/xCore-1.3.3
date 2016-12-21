/*
 * An XML document type.
 * Localname: Aircraft
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.AircraftDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211.impl;
/**
 * A document containing one Aircraft(@http://uicds.org/ICSForm211) element.
 *
 * This is a complex type.
 */
public class AircraftDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm211.AircraftDocument
{
    private static final long serialVersionUID = 1L;
    
    public AircraftDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AIRCRAFT$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Aircraft");
    
    
    /**
     * Gets the "Aircraft" element
     */
    public boolean getAircraft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFT$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Aircraft" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAircraft()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AIRCRAFT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Aircraft" element
     */
    public void setAircraft(boolean aircraft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AIRCRAFT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AIRCRAFT$0);
            }
            target.setBooleanValue(aircraft);
        }
    }
    
    /**
     * Sets (as xml) the "Aircraft" element
     */
    public void xsetAircraft(org.apache.xmlbeans.XmlBoolean aircraft)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AIRCRAFT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AIRCRAFT$0);
            }
            target.set(aircraft);
        }
    }
}
