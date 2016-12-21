/*
 * An XML attribute type.
 * Localname: pnvref
 * Namespace: ulex:message:library:1.0
 * Java type: x0.messageLibrary1.PnvrefAttribute
 *
 * Automatically generated - do not modify.
 */
package x0.messageLibrary1.impl;
/**
 * A document containing one pnvref(@ulex:message:library:1.0) attribute.
 *
 * This is a complex type.
 */
public class PnvrefAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageLibrary1.PnvrefAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PnvrefAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PNVREF$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "pnvref");
    
    
    /**
     * Gets the "pnvref" attribute
     */
    public java.lang.String getPnvref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNVREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pnvref" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetPnvref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PNVREF$0);
            return target;
        }
    }
    
    /**
     * True if has "pnvref" attribute
     */
    public boolean isSetPnvref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PNVREF$0) != null;
        }
    }
    
    /**
     * Sets the "pnvref" attribute
     */
    public void setPnvref(java.lang.String pnvref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PNVREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PNVREF$0);
            }
            target.setStringValue(pnvref);
        }
    }
    
    /**
     * Sets (as xml) the "pnvref" attribute
     */
    public void xsetPnvref(org.apache.xmlbeans.XmlNCName pnvref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(PNVREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(PNVREF$0);
            }
            target.set(pnvref);
        }
    }
    
    /**
     * Unsets the "pnvref" attribute
     */
    public void unsetPnvref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PNVREF$0);
        }
    }
}
