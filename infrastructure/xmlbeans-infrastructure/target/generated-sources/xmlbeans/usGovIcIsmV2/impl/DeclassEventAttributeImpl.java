/*
 * An XML attribute type.
 * Localname: declassEvent
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.DeclassEventAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one declassEvent(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class DeclassEventAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.DeclassEventAttribute
{
    private static final long serialVersionUID = 1L;
    
    public DeclassEventAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECLASSEVENT$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassEvent");
    
    
    /**
     * Gets the "declassEvent" attribute
     */
    public java.lang.String getDeclassEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSEVENT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "declassEvent" attribute
     */
    public usGovIcIsmV2.DeclassEventAttribute.DeclassEvent xgetDeclassEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassEventAttribute.DeclassEvent target = null;
            target = (usGovIcIsmV2.DeclassEventAttribute.DeclassEvent)get_store().find_attribute_user(DECLASSEVENT$0);
            return target;
        }
    }
    
    /**
     * True if has "declassEvent" attribute
     */
    public boolean isSetDeclassEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLASSEVENT$0) != null;
        }
    }
    
    /**
     * Sets the "declassEvent" attribute
     */
    public void setDeclassEvent(java.lang.String declassEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSEVENT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLASSEVENT$0);
            }
            target.setStringValue(declassEvent);
        }
    }
    
    /**
     * Sets (as xml) the "declassEvent" attribute
     */
    public void xsetDeclassEvent(usGovIcIsmV2.DeclassEventAttribute.DeclassEvent declassEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassEventAttribute.DeclassEvent target = null;
            target = (usGovIcIsmV2.DeclassEventAttribute.DeclassEvent)get_store().find_attribute_user(DECLASSEVENT$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.DeclassEventAttribute.DeclassEvent)get_store().add_attribute_user(DECLASSEVENT$0);
            }
            target.set(declassEvent);
        }
    }
    
    /**
     * Unsets the "declassEvent" attribute
     */
    public void unsetDeclassEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLASSEVENT$0);
        }
    }
    /**
     * An XML declassEvent(@urn:us:gov:ic:ism:v2).
     *
     * This is an atomic type that is a restriction of usGovIcIsmV2.DeclassEventAttribute$DeclassEvent.
     */
    public static class DeclassEventImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements usGovIcIsmV2.DeclassEventAttribute.DeclassEvent
    {
        private static final long serialVersionUID = 1L;
        
        public DeclassEventImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DeclassEventImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
