/*
 * An XML attribute type.
 * Localname: SARIdentifier
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.SARIdentifierAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one SARIdentifier(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class SARIdentifierAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.SARIdentifierAttribute
{
    private static final long serialVersionUID = 1L;
    
    public SARIdentifierAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SARIDENTIFIER$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "SARIdentifier");
    
    
    /**
     * Gets the "SARIdentifier" attribute
     */
    public java.util.List getSARIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SARIDENTIFIER$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "SARIdentifier" attribute
     */
    public usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier xgetSARIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier target = null;
            target = (usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier)get_store().find_attribute_user(SARIDENTIFIER$0);
            return target;
        }
    }
    
    /**
     * True if has "SARIdentifier" attribute
     */
    public boolean isSetSARIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SARIDENTIFIER$0) != null;
        }
    }
    
    /**
     * Sets the "SARIdentifier" attribute
     */
    public void setSARIdentifier(java.util.List sarIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SARIDENTIFIER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SARIDENTIFIER$0);
            }
            target.setListValue(sarIdentifier);
        }
    }
    
    /**
     * Sets (as xml) the "SARIdentifier" attribute
     */
    public void xsetSARIdentifier(usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier sarIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier target = null;
            target = (usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier)get_store().find_attribute_user(SARIDENTIFIER$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier)get_store().add_attribute_user(SARIDENTIFIER$0);
            }
            target.set(sarIdentifier);
        }
    }
    
    /**
     * Unsets the "SARIdentifier" attribute
     */
    public void unsetSARIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SARIDENTIFIER$0);
        }
    }
    /**
     * An XML SARIdentifier(@urn:us:gov:ic:ism:v2).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlNMTOKEN.
     */
    public static class SARIdentifierImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements usGovIcIsmV2.SARIdentifierAttribute.SARIdentifier
    {
        private static final long serialVersionUID = 1L;
        
        public SARIdentifierImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SARIdentifierImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
