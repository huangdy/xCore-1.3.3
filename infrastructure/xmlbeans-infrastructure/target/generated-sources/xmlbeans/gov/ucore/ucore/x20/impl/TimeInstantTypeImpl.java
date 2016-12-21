/*
 * XML Type:  TimeInstantType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.TimeInstantType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML TimeInstantType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class TimeInstantTypeImpl extends gov.ucore.ucore.x20.impl.TimeValueTypeImpl implements gov.ucore.ucore.x20.TimeInstantType
{
    private static final long serialVersionUID = 1L;
    
    public TimeInstantTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNCERTAINTYINTERVAL$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "UncertaintyInterval");
    
    
    /**
     * Gets the "UncertaintyInterval" element
     */
    public org.apache.xmlbeans.GDuration getUncertaintyInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNCERTAINTYINTERVAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getGDurationValue();
        }
    }
    
    /**
     * Gets (as xml) the "UncertaintyInterval" element
     */
    public org.apache.xmlbeans.XmlDuration xgetUncertaintyInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(UNCERTAINTYINTERVAL$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "UncertaintyInterval" element
     */
    public boolean isSetUncertaintyInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNCERTAINTYINTERVAL$0) != 0;
        }
    }
    
    /**
     * Sets the "UncertaintyInterval" element
     */
    public void setUncertaintyInterval(org.apache.xmlbeans.GDuration uncertaintyInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNCERTAINTYINTERVAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNCERTAINTYINTERVAL$0);
            }
            target.setGDurationValue(uncertaintyInterval);
        }
    }
    
    /**
     * Sets (as xml) the "UncertaintyInterval" element
     */
    public void xsetUncertaintyInterval(org.apache.xmlbeans.XmlDuration uncertaintyInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDuration target = null;
            target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(UNCERTAINTYINTERVAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(UNCERTAINTYINTERVAL$0);
            }
            target.set(uncertaintyInterval);
        }
    }
    
    /**
     * Unsets the "UncertaintyInterval" element
     */
    public void unsetUncertaintyInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNCERTAINTYINTERVAL$0, 0);
        }
    }
}
