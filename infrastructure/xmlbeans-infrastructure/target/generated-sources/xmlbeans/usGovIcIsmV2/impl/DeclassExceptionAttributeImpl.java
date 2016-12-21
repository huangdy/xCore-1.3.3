/*
 * An XML attribute type.
 * Localname: declassException
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.DeclassExceptionAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one declassException(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class DeclassExceptionAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.DeclassExceptionAttribute
{
    private static final long serialVersionUID = 1L;
    
    public DeclassExceptionAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECLASSEXCEPTION$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassException");
    
    
    /**
     * Gets the "declassException" attribute
     */
    public java.util.List getDeclassException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSEXCEPTION$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "declassException" attribute
     */
    public usGovIcIsmV2.DeclassExceptionAttribute.DeclassException xgetDeclassException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassExceptionAttribute.DeclassException target = null;
            target = (usGovIcIsmV2.DeclassExceptionAttribute.DeclassException)get_store().find_attribute_user(DECLASSEXCEPTION$0);
            return target;
        }
    }
    
    /**
     * True if has "declassException" attribute
     */
    public boolean isSetDeclassException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLASSEXCEPTION$0) != null;
        }
    }
    
    /**
     * Sets the "declassException" attribute
     */
    public void setDeclassException(java.util.List declassException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSEXCEPTION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLASSEXCEPTION$0);
            }
            target.setListValue(declassException);
        }
    }
    
    /**
     * Sets (as xml) the "declassException" attribute
     */
    public void xsetDeclassException(usGovIcIsmV2.DeclassExceptionAttribute.DeclassException declassException)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassExceptionAttribute.DeclassException target = null;
            target = (usGovIcIsmV2.DeclassExceptionAttribute.DeclassException)get_store().find_attribute_user(DECLASSEXCEPTION$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.DeclassExceptionAttribute.DeclassException)get_store().add_attribute_user(DECLASSEXCEPTION$0);
            }
            target.set(declassException);
        }
    }
    
    /**
     * Unsets the "declassException" attribute
     */
    public void unsetDeclassException()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLASSEXCEPTION$0);
        }
    }
    /**
     * An XML declassException(@urn:us:gov:ic:ism:v2).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlNMTOKEN.
     */
    public static class DeclassExceptionImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements usGovIcIsmV2.DeclassExceptionAttribute.DeclassException
    {
        private static final long serialVersionUID = 1L;
        
        public DeclassExceptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DeclassExceptionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
