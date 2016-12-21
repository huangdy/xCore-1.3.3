/*
 * An XML attribute type.
 * Localname: derivedFrom
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.DerivedFromAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one derivedFrom(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class DerivedFromAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.DerivedFromAttribute
{
    private static final long serialVersionUID = 1L;
    
    public DerivedFromAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDFROM$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "derivedFrom");
    
    
    /**
     * Gets the "derivedFrom" attribute
     */
    public java.lang.String getDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVEDFROM$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "derivedFrom" attribute
     */
    public usGovIcIsmV2.DerivedFromAttribute.DerivedFrom xgetDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DerivedFromAttribute.DerivedFrom target = null;
            target = (usGovIcIsmV2.DerivedFromAttribute.DerivedFrom)get_store().find_attribute_user(DERIVEDFROM$0);
            return target;
        }
    }
    
    /**
     * True if has "derivedFrom" attribute
     */
    public boolean isSetDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DERIVEDFROM$0) != null;
        }
    }
    
    /**
     * Sets the "derivedFrom" attribute
     */
    public void setDerivedFrom(java.lang.String derivedFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DERIVEDFROM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DERIVEDFROM$0);
            }
            target.setStringValue(derivedFrom);
        }
    }
    
    /**
     * Sets (as xml) the "derivedFrom" attribute
     */
    public void xsetDerivedFrom(usGovIcIsmV2.DerivedFromAttribute.DerivedFrom derivedFrom)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DerivedFromAttribute.DerivedFrom target = null;
            target = (usGovIcIsmV2.DerivedFromAttribute.DerivedFrom)get_store().find_attribute_user(DERIVEDFROM$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.DerivedFromAttribute.DerivedFrom)get_store().add_attribute_user(DERIVEDFROM$0);
            }
            target.set(derivedFrom);
        }
    }
    
    /**
     * Unsets the "derivedFrom" attribute
     */
    public void unsetDerivedFrom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DERIVEDFROM$0);
        }
    }
    /**
     * An XML derivedFrom(@urn:us:gov:ic:ism:v2).
     *
     * This is an atomic type that is a restriction of usGovIcIsmV2.DerivedFromAttribute$DerivedFrom.
     */
    public static class DerivedFromImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements usGovIcIsmV2.DerivedFromAttribute.DerivedFrom
    {
        private static final long serialVersionUID = 1L;
        
        public DerivedFromImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DerivedFromImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
