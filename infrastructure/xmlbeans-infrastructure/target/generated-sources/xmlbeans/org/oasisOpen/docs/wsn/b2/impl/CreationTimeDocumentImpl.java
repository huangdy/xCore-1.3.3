/*
 * An XML document type.
 * Localname: CreationTime
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.CreationTimeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one CreationTime(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class CreationTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.CreationTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreationTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATIONTIME$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "CreationTime");
    
    
    /**
     * Gets the "CreationTime" element
     */
    public java.util.Calendar getCreationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreationTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CreationTime" element
     */
    public void setCreationTime(java.util.Calendar creationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATIONTIME$0);
            }
            target.setCalendarValue(creationTime);
        }
    }
    
    /**
     * Sets (as xml) the "CreationTime" element
     */
    public void xsetCreationTime(org.apache.xmlbeans.XmlDateTime creationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATIONTIME$0);
            }
            target.set(creationTime);
        }
    }
}
