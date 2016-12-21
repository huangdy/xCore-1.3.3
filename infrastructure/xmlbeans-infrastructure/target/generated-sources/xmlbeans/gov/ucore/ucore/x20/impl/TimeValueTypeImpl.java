/*
 * XML Type:  TimeValueType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.TimeValueType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML TimeValueType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class TimeValueTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.TimeValueType
{
    private static final long serialVersionUID = 1L;
    
    public TimeValueTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Value");
    
    
    /**
     * Gets the "Value" element
     */
    public java.util.Calendar getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Value" element
     */
    public gov.ucore.ucore.x20.TimeValueType.Value xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeValueType.Value target = null;
            target = (gov.ucore.ucore.x20.TimeValueType.Value)get_store().find_element_user(VALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Value" element
     */
    public void setValue(java.util.Calendar value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$0);
            }
            target.setCalendarValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "Value" element
     */
    public void xsetValue(gov.ucore.ucore.x20.TimeValueType.Value value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeValueType.Value target = null;
            target = (gov.ucore.ucore.x20.TimeValueType.Value)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.TimeValueType.Value)get_store().add_element_user(VALUE$0);
            }
            target.set(value);
        }
    }
    /**
     * An XML Value(@http://ucore.gov/ucore/2.0).
     *
     * This is a union type. Instances are of one of the following types:
     *     org.apache.xmlbeans.XmlDate
     *     org.apache.xmlbeans.XmlTime
     *     org.apache.xmlbeans.XmlDateTime
     *     org.apache.xmlbeans.XmlGDay
     *     org.apache.xmlbeans.XmlGMonth
     *     org.apache.xmlbeans.XmlGMonthDay
     *     org.apache.xmlbeans.XmlGYear
     *     org.apache.xmlbeans.XmlGYearMonth
     */
    public static class ValueImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements gov.ucore.ucore.x20.TimeValueType.Value, org.apache.xmlbeans.XmlDate, org.apache.xmlbeans.XmlTime, org.apache.xmlbeans.XmlDateTime, org.apache.xmlbeans.XmlGDay, org.apache.xmlbeans.XmlGMonth, org.apache.xmlbeans.XmlGMonthDay, org.apache.xmlbeans.XmlGYear, org.apache.xmlbeans.XmlGYearMonth
    {
        private static final long serialVersionUID = 1L;
        
        public ValueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
