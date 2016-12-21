/*
 * An XML document type.
 * Localname: Personnel
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.PersonnelDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211.impl;
/**
 * A document containing one Personnel(@http://uicds.org/ICSForm211) element.
 *
 * This is a complex type.
 */
public class PersonnelDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm211.PersonnelDocument
{
    private static final long serialVersionUID = 1L;
    
    public PersonnelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONNEL$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Personnel");
    
    
    /**
     * Gets the "Personnel" element
     */
    public boolean getPersonnel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONNEL$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Personnel" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPersonnel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PERSONNEL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Personnel" element
     */
    public void setPersonnel(boolean personnel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERSONNEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERSONNEL$0);
            }
            target.setBooleanValue(personnel);
        }
    }
    
    /**
     * Sets (as xml) the "Personnel" element
     */
    public void xsetPersonnel(org.apache.xmlbeans.XmlBoolean personnel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PERSONNEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PERSONNEL$0);
            }
            target.set(personnel);
        }
    }
}
