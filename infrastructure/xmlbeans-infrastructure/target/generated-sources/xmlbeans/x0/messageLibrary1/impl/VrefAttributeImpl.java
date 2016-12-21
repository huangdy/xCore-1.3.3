/*
 * An XML attribute type.
 * Localname: vref
 * Namespace: ulex:message:library:1.0
 * Java type: x0.messageLibrary1.VrefAttribute
 *
 * Automatically generated - do not modify.
 */
package x0.messageLibrary1.impl;
/**
 * A document containing one vref(@ulex:message:library:1.0) attribute.
 *
 * This is a complex type.
 */
public class VrefAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageLibrary1.VrefAttribute
{
    private static final long serialVersionUID = 1L;
    
    public VrefAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VREF$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "vref");
    
    
    /**
     * Gets the "vref" attribute
     */
    public java.lang.String getVref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "vref" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetVref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(VREF$0);
            return target;
        }
    }
    
    /**
     * True if has "vref" attribute
     */
    public boolean isSetVref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VREF$0) != null;
        }
    }
    
    /**
     * Sets the "vref" attribute
     */
    public void setVref(java.lang.String vref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VREF$0);
            }
            target.setStringValue(vref);
        }
    }
    
    /**
     * Sets (as xml) the "vref" attribute
     */
    public void xsetVref(org.apache.xmlbeans.XmlIDREF vref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(VREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(VREF$0);
            }
            target.set(vref);
        }
    }
    
    /**
     * Unsets the "vref" attribute
     */
    public void unsetVref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VREF$0);
        }
    }
}
