/*
 * An XML attribute type.
 * Localname: releasableTo
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.ReleasableToAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one releasableTo(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class ReleasableToAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.ReleasableToAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ReleasableToAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELEASABLETO$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "releasableTo");
    
    
    /**
     * Gets the "releasableTo" attribute
     */
    public java.util.List getReleasableTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELEASABLETO$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "releasableTo" attribute
     */
    public usGovIcIsmV2.ReleasableToAttribute.ReleasableTo xgetReleasableTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ReleasableToAttribute.ReleasableTo target = null;
            target = (usGovIcIsmV2.ReleasableToAttribute.ReleasableTo)get_store().find_attribute_user(RELEASABLETO$0);
            return target;
        }
    }
    
    /**
     * True if has "releasableTo" attribute
     */
    public boolean isSetReleasableTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELEASABLETO$0) != null;
        }
    }
    
    /**
     * Sets the "releasableTo" attribute
     */
    public void setReleasableTo(java.util.List releasableTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELEASABLETO$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELEASABLETO$0);
            }
            target.setListValue(releasableTo);
        }
    }
    
    /**
     * Sets (as xml) the "releasableTo" attribute
     */
    public void xsetReleasableTo(usGovIcIsmV2.ReleasableToAttribute.ReleasableTo releasableTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.ReleasableToAttribute.ReleasableTo target = null;
            target = (usGovIcIsmV2.ReleasableToAttribute.ReleasableTo)get_store().find_attribute_user(RELEASABLETO$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.ReleasableToAttribute.ReleasableTo)get_store().add_attribute_user(RELEASABLETO$0);
            }
            target.set(releasableTo);
        }
    }
    
    /**
     * Unsets the "releasableTo" attribute
     */
    public void unsetReleasableTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELEASABLETO$0);
        }
    }
    /**
     * An XML releasableTo(@urn:us:gov:ic:ism:v2).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlNMTOKEN.
     */
    public static class ReleasableToImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements usGovIcIsmV2.ReleasableToAttribute.ReleasableTo
    {
        private static final long serialVersionUID = 1L;
        
        public ReleasableToImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ReleasableToImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
