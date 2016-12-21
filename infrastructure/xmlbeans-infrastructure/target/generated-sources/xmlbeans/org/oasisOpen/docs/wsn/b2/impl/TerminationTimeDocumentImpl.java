/*
 * An XML document type.
 * Localname: TerminationTime
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.TerminationTimeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one TerminationTime(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class TerminationTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.TerminationTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TerminationTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERMINATIONTIME$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TerminationTime");
    
    
    /**
     * Gets the "TerminationTime" element
     */
    public java.util.Calendar getTerminationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERMINATIONTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "TerminationTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetTerminationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "TerminationTime" element
     */
    public boolean isNilTerminationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "TerminationTime" element
     */
    public void setTerminationTime(java.util.Calendar terminationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERMINATIONTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERMINATIONTIME$0);
            }
            target.setCalendarValue(terminationTime);
        }
    }
    
    /**
     * Sets (as xml) the "TerminationTime" element
     */
    public void xsetTerminationTime(org.apache.xmlbeans.XmlDateTime terminationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TERMINATIONTIME$0);
            }
            target.set(terminationTime);
        }
    }
    
    /**
     * Nils the "TerminationTime" element
     */
    public void setNilTerminationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TERMINATIONTIME$0);
            }
            target.setNil();
        }
    }
}
