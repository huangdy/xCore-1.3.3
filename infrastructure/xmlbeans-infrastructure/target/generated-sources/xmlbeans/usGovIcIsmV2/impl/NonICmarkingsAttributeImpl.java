/*
 * An XML attribute type.
 * Localname: nonICmarkings
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.NonICmarkingsAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one nonICmarkings(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class NonICmarkingsAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.NonICmarkingsAttribute
{
    private static final long serialVersionUID = 1L;
    
    public NonICmarkingsAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NONICMARKINGS$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "nonICmarkings");
    
    
    /**
     * Gets the "nonICmarkings" attribute
     */
    public java.util.List getNonICmarkings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NONICMARKINGS$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "nonICmarkings" attribute
     */
    public usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings xgetNonICmarkings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings target = null;
            target = (usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings)get_store().find_attribute_user(NONICMARKINGS$0);
            return target;
        }
    }
    
    /**
     * True if has "nonICmarkings" attribute
     */
    public boolean isSetNonICmarkings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NONICMARKINGS$0) != null;
        }
    }
    
    /**
     * Sets the "nonICmarkings" attribute
     */
    public void setNonICmarkings(java.util.List nonICmarkings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NONICMARKINGS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NONICMARKINGS$0);
            }
            target.setListValue(nonICmarkings);
        }
    }
    
    /**
     * Sets (as xml) the "nonICmarkings" attribute
     */
    public void xsetNonICmarkings(usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings nonICmarkings)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings target = null;
            target = (usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings)get_store().find_attribute_user(NONICMARKINGS$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings)get_store().add_attribute_user(NONICMARKINGS$0);
            }
            target.set(nonICmarkings);
        }
    }
    
    /**
     * Unsets the "nonICmarkings" attribute
     */
    public void unsetNonICmarkings()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NONICMARKINGS$0);
        }
    }
    /**
     * An XML nonICmarkings(@urn:us:gov:ic:ism:v2).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlNMTOKEN.
     */
    public static class NonICmarkingsImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements usGovIcIsmV2.NonICmarkingsAttribute.NonICmarkings
    {
        private static final long serialVersionUID = 1L;
        
        public NonICmarkingsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NonICmarkingsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
