/*
 * An XML attribute type.
 * Localname: metadata
 * Namespace: http://niem.gov/niem/structures/2.0
 * Java type: gov.niem.niem.structures.x20.MetadataAttribute
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.structures.x20.impl;
/**
 * A document containing one metadata(@http://niem.gov/niem/structures/2.0) attribute.
 *
 * This is a complex type.
 */
public class MetadataAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.structures.x20.MetadataAttribute
{
    private static final long serialVersionUID = 1L;
    
    public MetadataAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATA$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/structures/2.0", "metadata");
    
    
    /**
     * Gets the "metadata" attribute
     */
    public java.util.List getMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METADATA$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "metadata" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(METADATA$0);
            return target;
        }
    }
    
    /**
     * True if has "metadata" attribute
     */
    public boolean isSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METADATA$0) != null;
        }
    }
    
    /**
     * Sets the "metadata" attribute
     */
    public void setMetadata(java.util.List metadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METADATA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METADATA$0);
            }
            target.setListValue(metadata);
        }
    }
    
    /**
     * Sets (as xml) the "metadata" attribute
     */
    public void xsetMetadata(org.apache.xmlbeans.XmlIDREFS metadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(METADATA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(METADATA$0);
            }
            target.set(metadata);
        }
    }
    
    /**
     * Unsets the "metadata" attribute
     */
    public void unsetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METADATA$0);
        }
    }
}
