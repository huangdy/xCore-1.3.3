/*
 * An XML attribute type.
 * Localname: decimalErrorBound
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.DecimalErrorBoundAttribute
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one decimalErrorBound(@http://ucore.gov/ucore/2.0) attribute.
 *
 * This is a complex type.
 */
public class DecimalErrorBoundAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.DecimalErrorBoundAttribute
{
    private static final long serialVersionUID = 1L;
    
    public DecimalErrorBoundAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECIMALERRORBOUND$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "decimalErrorBound");
    
    
    /**
     * Gets the "decimalErrorBound" attribute
     */
    public java.math.BigDecimal getDecimalErrorBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMALERRORBOUND$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "decimalErrorBound" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetDecimalErrorBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(DECIMALERRORBOUND$0);
            return target;
        }
    }
    
    /**
     * True if has "decimalErrorBound" attribute
     */
    public boolean isSetDecimalErrorBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECIMALERRORBOUND$0) != null;
        }
    }
    
    /**
     * Sets the "decimalErrorBound" attribute
     */
    public void setDecimalErrorBound(java.math.BigDecimal decimalErrorBound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECIMALERRORBOUND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECIMALERRORBOUND$0);
            }
            target.setBigDecimalValue(decimalErrorBound);
        }
    }
    
    /**
     * Sets (as xml) the "decimalErrorBound" attribute
     */
    public void xsetDecimalErrorBound(org.apache.xmlbeans.XmlDecimal decimalErrorBound)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(DECIMALERRORBOUND$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(DECIMALERRORBOUND$0);
            }
            target.set(decimalErrorBound);
        }
    }
    
    /**
     * Unsets the "decimalErrorBound" attribute
     */
    public void unsetDecimalErrorBound()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECIMALERRORBOUND$0);
        }
    }
}
