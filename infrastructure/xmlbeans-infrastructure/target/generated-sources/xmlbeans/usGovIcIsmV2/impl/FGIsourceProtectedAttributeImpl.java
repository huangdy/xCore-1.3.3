/*
 * An XML attribute type.
 * Localname: FGIsourceProtected
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.FGIsourceProtectedAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one FGIsourceProtected(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class FGIsourceProtectedAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.FGIsourceProtectedAttribute
{
    private static final long serialVersionUID = 1L;
    
    public FGIsourceProtectedAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FGISOURCEPROTECTED$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "FGIsourceProtected");
    
    
    /**
     * Gets the "FGIsourceProtected" attribute
     */
    public java.util.List getFGIsourceProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FGISOURCEPROTECTED$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "FGIsourceProtected" attribute
     */
    public usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected xgetFGIsourceProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected target = null;
            target = (usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected)get_store().find_attribute_user(FGISOURCEPROTECTED$0);
            return target;
        }
    }
    
    /**
     * True if has "FGIsourceProtected" attribute
     */
    public boolean isSetFGIsourceProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FGISOURCEPROTECTED$0) != null;
        }
    }
    
    /**
     * Sets the "FGIsourceProtected" attribute
     */
    public void setFGIsourceProtected(java.util.List fgIsourceProtected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FGISOURCEPROTECTED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FGISOURCEPROTECTED$0);
            }
            target.setListValue(fgIsourceProtected);
        }
    }
    
    /**
     * Sets (as xml) the "FGIsourceProtected" attribute
     */
    public void xsetFGIsourceProtected(usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected fgIsourceProtected)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected target = null;
            target = (usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected)get_store().find_attribute_user(FGISOURCEPROTECTED$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected)get_store().add_attribute_user(FGISOURCEPROTECTED$0);
            }
            target.set(fgIsourceProtected);
        }
    }
    
    /**
     * Unsets the "FGIsourceProtected" attribute
     */
    public void unsetFGIsourceProtected()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FGISOURCEPROTECTED$0);
        }
    }
    /**
     * An XML FGIsourceProtected(@urn:us:gov:ic:ism:v2).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlNMTOKEN.
     */
    public static class FGIsourceProtectedImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements usGovIcIsmV2.FGIsourceProtectedAttribute.FGIsourceProtected
    {
        private static final long serialVersionUID = 1L;
        
        public FGIsourceProtectedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FGIsourceProtectedImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
