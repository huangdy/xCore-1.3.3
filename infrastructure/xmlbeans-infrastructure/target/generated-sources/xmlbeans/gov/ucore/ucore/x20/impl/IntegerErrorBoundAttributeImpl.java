/*
 * An XML attribute type.
 * Localname: integerErrorBound
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.IntegerErrorBoundAttribute
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one integerErrorBound(@http://ucore.gov/ucore/2.0) attribute.
 *
 * This is a complex type.
 */
public class IntegerErrorBoundAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.IntegerErrorBoundAttribute
{
    private static final long serialVersionUID = 1L;
    
    public IntegerErrorBoundAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTEGERERRORBOUND$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "integerErrorBound");
    
    
    /**
     * Gets the "integerErrorBound" attribute
     */
    public int getIntegerErrorBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTEGERERRORBOUND$0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "integerErrorBound" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetIntegerErrorBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(INTEGERERRORBOUND$0);
            return target;
        }
    }
    
    /**
     * True if has "integerErrorBound" attribute
     */
    public boolean isSetIntegerErrorBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTEGERERRORBOUND$0) != null;
        }
    }
    
    /**
     * Sets the "integerErrorBound" attribute
     */
    public void setIntegerErrorBound(int integerErrorBound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTEGERERRORBOUND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTEGERERRORBOUND$0);
            }
            target.setIntValue(integerErrorBound);
        }
    }
    
    /**
     * Sets (as xml) the "integerErrorBound" attribute
     */
    public void xsetIntegerErrorBound(org.apache.xmlbeans.XmlInt integerErrorBound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(INTEGERERRORBOUND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(INTEGERERRORBOUND$0);
            }
            target.set(integerErrorBound);
        }
    }
    
    /**
     * Unsets the "integerErrorBound" attribute
     */
    public void unsetIntegerErrorBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTEGERERRORBOUND$0);
        }
    }
}
