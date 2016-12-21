/*
 * An XML attribute type.
 * Localname: label
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.LabelAttribute
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one label(@http://ucore.gov/ucore/2.0) attribute.
 *
 * This is a complex type.
 */
public class LabelAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.LabelAttribute
{
    private static final long serialVersionUID = 1L;
    
    public LabelAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABEL$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "label");
    
    
    /**
     * Gets the "label" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(LABEL$0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "label" attribute
     */
    public boolean isSetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LABEL$0) != null;
        }
    }
    
    /**
     * Sets the "label" attribute
     */
    public void setLabel(org.apache.xmlbeans.XmlAnySimpleType label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(LABEL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(LABEL$0);
            }
            target.set(label);
        }
    }
    
    /**
     * Appends and returns a new empty "label" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(LABEL$0);
            return target;
        }
    }
    
    /**
     * Unsets the "label" attribute
     */
    public void unsetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LABEL$0);
        }
    }
}
