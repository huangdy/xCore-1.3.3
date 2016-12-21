/*
 * An XML attribute type.
 * Localname: nvref
 * Namespace: ulex:message:library:1.0
 * Java type: x0.messageLibrary1.NvrefAttribute
 *
 * Automatically generated - do not modify.
 */
package x0.messageLibrary1.impl;
/**
 * A document containing one nvref(@ulex:message:library:1.0) attribute.
 *
 * This is a complex type.
 */
public class NvrefAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageLibrary1.NvrefAttribute
{
    private static final long serialVersionUID = 1L;
    
    public NvrefAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NVREF$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "nvref");
    
    
    /**
     * Gets the "nvref" attribute
     */
    public java.lang.String getNvref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NVREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nvref" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetNvref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NVREF$0);
            return target;
        }
    }
    
    /**
     * True if has "nvref" attribute
     */
    public boolean isSetNvref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NVREF$0) != null;
        }
    }
    
    /**
     * Sets the "nvref" attribute
     */
    public void setNvref(java.lang.String nvref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NVREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NVREF$0);
            }
            target.setStringValue(nvref);
        }
    }
    
    /**
     * Sets (as xml) the "nvref" attribute
     */
    public void xsetNvref(org.apache.xmlbeans.XmlNCName nvref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NVREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NVREF$0);
            }
            target.set(nvref);
        }
    }
    
    /**
     * Unsets the "nvref" attribute
     */
    public void unsetNvref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NVREF$0);
        }
    }
}
