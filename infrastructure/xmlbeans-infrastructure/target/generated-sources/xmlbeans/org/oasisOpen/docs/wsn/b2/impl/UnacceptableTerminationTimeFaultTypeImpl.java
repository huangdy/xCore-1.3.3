/*
 * XML Type:  UnacceptableTerminationTimeFaultType
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * An XML UnacceptableTerminationTimeFaultType(@http://docs.oasis-open.org/wsn/b-2).
 *
 * This is a complex type.
 */
public class UnacceptableTerminationTimeFaultTypeImpl extends org.oasisOpen.docs.wsrf.bf2.impl.BaseFaultTypeImpl implements org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultType
{
    private static final long serialVersionUID = 1L;
    
    public UnacceptableTerminationTimeFaultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINIMUMTIME$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "MinimumTime");
    private static final javax.xml.namespace.QName MAXIMUMTIME$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "MaximumTime");
    
    
    /**
     * Gets the "MinimumTime" element
     */
    public java.util.Calendar getMinimumTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "MinimumTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetMinimumTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MINIMUMTIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MinimumTime" element
     */
    public void setMinimumTime(java.util.Calendar minimumTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINIMUMTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINIMUMTIME$0);
            }
            target.setCalendarValue(minimumTime);
        }
    }
    
    /**
     * Sets (as xml) the "MinimumTime" element
     */
    public void xsetMinimumTime(org.apache.xmlbeans.XmlDateTime minimumTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MINIMUMTIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(MINIMUMTIME$0);
            }
            target.set(minimumTime);
        }
    }
    
    /**
     * Gets the "MaximumTime" element
     */
    public java.util.Calendar getMaximumTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMTIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "MaximumTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetMaximumTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MAXIMUMTIME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "MaximumTime" element
     */
    public boolean isSetMaximumTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MAXIMUMTIME$2) != 0;
        }
    }
    
    /**
     * Sets the "MaximumTime" element
     */
    public void setMaximumTime(java.util.Calendar maximumTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMUMTIME$2);
            }
            target.setCalendarValue(maximumTime);
        }
    }
    
    /**
     * Sets (as xml) the "MaximumTime" element
     */
    public void xsetMaximumTime(org.apache.xmlbeans.XmlDateTime maximumTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MAXIMUMTIME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(MAXIMUMTIME$2);
            }
            target.set(maximumTime);
        }
    }
    
    /**
     * Unsets the "MaximumTime" element
     */
    public void unsetMaximumTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MAXIMUMTIME$2, 0);
        }
    }
}
