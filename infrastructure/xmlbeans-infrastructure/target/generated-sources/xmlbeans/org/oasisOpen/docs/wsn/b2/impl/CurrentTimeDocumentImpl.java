/*
 * An XML document type.
 * Localname: CurrentTime
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.CurrentTimeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one CurrentTime(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class CurrentTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.CurrentTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurrentTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURRENTTIME$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "CurrentTime");
    
    
    /**
     * Gets the "CurrentTime" element
     */
    public java.util.Calendar getCurrentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CurrentTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCurrentTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CURRENTTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CurrentTime" element
     */
    public void setCurrentTime(java.util.Calendar currentTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTTIME$0);
            }
            target.setCalendarValue(currentTime);
        }
    }
    
    /**
     * Sets (as xml) the "CurrentTime" element
     */
    public void xsetCurrentTime(org.apache.xmlbeans.XmlDateTime currentTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CURRENTTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CURRENTTIME$0);
            }
            target.set(currentTime);
        }
    }
}
