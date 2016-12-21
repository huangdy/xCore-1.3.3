/*
 * An XML attribute type.
 * Localname: pedigreeNumber
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PedigreeNumberAttribute
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one pedigreeNumber(@ulex:message:structure:1.0) attribute.
 *
 * This is a complex type.
 */
public class PedigreeNumberAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.PedigreeNumberAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PedigreeNumberAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PEDIGREENUMBER$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "pedigreeNumber");
    
    
    /**
     * Gets the "pedigreeNumber" attribute
     */
    public java.math.BigInteger getPedigreeNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEDIGREENUMBER$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "pedigreeNumber" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetPedigreeNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PEDIGREENUMBER$0);
            return target;
        }
    }
    
    /**
     * True if has "pedigreeNumber" attribute
     */
    public boolean isSetPedigreeNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PEDIGREENUMBER$0) != null;
        }
    }
    
    /**
     * Sets the "pedigreeNumber" attribute
     */
    public void setPedigreeNumber(java.math.BigInteger pedigreeNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PEDIGREENUMBER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PEDIGREENUMBER$0);
            }
            target.setBigIntegerValue(pedigreeNumber);
        }
    }
    
    /**
     * Sets (as xml) the "pedigreeNumber" attribute
     */
    public void xsetPedigreeNumber(org.apache.xmlbeans.XmlInteger pedigreeNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(PEDIGREENUMBER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(PEDIGREENUMBER$0);
            }
            target.set(pedigreeNumber);
        }
    }
    
    /**
     * Unsets the "pedigreeNumber" attribute
     */
    public void unsetPedigreeNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PEDIGREENUMBER$0);
        }
    }
}
