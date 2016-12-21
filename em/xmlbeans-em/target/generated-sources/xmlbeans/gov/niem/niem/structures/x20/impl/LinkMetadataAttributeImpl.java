/*
 * An XML attribute type.
 * Localname: linkMetadata
 * Namespace: http://niem.gov/niem/structures/2.0
 * Java type: gov.niem.niem.structures.x20.LinkMetadataAttribute
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.structures.x20.impl;
/**
 * A document containing one linkMetadata(@http://niem.gov/niem/structures/2.0) attribute.
 *
 * This is a complex type.
 */
public class LinkMetadataAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.structures.x20.LinkMetadataAttribute
{
    private static final long serialVersionUID = 1L;
    
    public LinkMetadataAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKMETADATA$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/structures/2.0", "linkMetadata");
    
    
    /**
     * Gets the "linkMetadata" attribute
     */
    public java.util.List getLinkMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKMETADATA$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "linkMetadata" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetLinkMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(LINKMETADATA$0);
            return target;
        }
    }
    
    /**
     * True if has "linkMetadata" attribute
     */
    public boolean isSetLinkMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINKMETADATA$0) != null;
        }
    }
    
    /**
     * Sets the "linkMetadata" attribute
     */
    public void setLinkMetadata(java.util.List linkMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKMETADATA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINKMETADATA$0);
            }
            target.setListValue(linkMetadata);
        }
    }
    
    /**
     * Sets (as xml) the "linkMetadata" attribute
     */
    public void xsetLinkMetadata(org.apache.xmlbeans.XmlIDREFS linkMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(LINKMETADATA$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(LINKMETADATA$0);
            }
            target.set(linkMetadata);
        }
    }
    
    /**
     * Unsets the "linkMetadata" attribute
     */
    public void unsetLinkMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINKMETADATA$0);
        }
    }
}
