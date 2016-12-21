/*
 * XML Type:  DivisionGroupType
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.DivisionGroupType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203.impl;
/**
 * An XML DivisionGroupType(@http://uicds.org/ICSForm203).
 *
 * This is a complex type.
 */
public class DivisionGroupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm203.DivisionGroupType
{
    private static final long serialVersionUID = 1L;
    
    public DivisionGroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIVISION$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Division");
    private static final javax.xml.namespace.QName GROUP$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Group");
    
    
    /**
     * Gets the "Division" element
     */
    public java.lang.String getDivision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIVISION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Division" element
     */
    public org.apache.xmlbeans.XmlString xgetDivision()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIVISION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Division" element
     */
    public void setDivision(java.lang.String division)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIVISION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIVISION$0);
            }
            target.setStringValue(division);
        }
    }
    
    /**
     * Sets (as xml) the "Division" element
     */
    public void xsetDivision(org.apache.xmlbeans.XmlString division)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DIVISION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DIVISION$0);
            }
            target.set(division);
        }
    }
    
    /**
     * Gets the "Group" element
     */
    public java.lang.String getGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUP$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Group" element
     */
    public org.apache.xmlbeans.XmlString xgetGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUP$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Group" element
     */
    public void setGroup(java.lang.String group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GROUP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GROUP$2);
            }
            target.setStringValue(group);
        }
    }
    
    /**
     * Sets (as xml) the "Group" element
     */
    public void xsetGroup(org.apache.xmlbeans.XmlString group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GROUP$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GROUP$2);
            }
            target.set(group);
        }
    }
}
