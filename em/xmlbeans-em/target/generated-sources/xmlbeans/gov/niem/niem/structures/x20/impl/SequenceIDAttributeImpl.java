/*
 * An XML attribute type.
 * Localname: sequenceID
 * Namespace: http://niem.gov/niem/structures/2.0
 * Java type: gov.niem.niem.structures.x20.SequenceIDAttribute
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.structures.x20.impl;
/**
 * A document containing one sequenceID(@http://niem.gov/niem/structures/2.0) attribute.
 *
 * This is a complex type.
 */
public class SequenceIDAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.structures.x20.SequenceIDAttribute
{
    private static final long serialVersionUID = 1L;
    
    public SequenceIDAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEQUENCEID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/structures/2.0", "sequenceID");
    
    
    /**
     * Gets the "sequenceID" attribute
     */
    public java.math.BigInteger getSequenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEQUENCEID$0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "sequenceID" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetSequenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SEQUENCEID$0);
            return target;
        }
    }
    
    /**
     * True if has "sequenceID" attribute
     */
    public boolean isSetSequenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SEQUENCEID$0) != null;
        }
    }
    
    /**
     * Sets the "sequenceID" attribute
     */
    public void setSequenceID(java.math.BigInteger sequenceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SEQUENCEID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SEQUENCEID$0);
            }
            target.setBigIntegerValue(sequenceID);
        }
    }
    
    /**
     * Sets (as xml) the "sequenceID" attribute
     */
    public void xsetSequenceID(org.apache.xmlbeans.XmlInteger sequenceID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(SEQUENCEID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(SEQUENCEID$0);
            }
            target.set(sequenceID);
        }
    }
    
    /**
     * Unsets the "sequenceID" attribute
     */
    public void unsetSequenceID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SEQUENCEID$0);
        }
    }
}
