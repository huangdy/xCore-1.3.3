/*
 * An XML attribute type.
 * Localname: FGIsourceOpen
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.FGIsourceOpenAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one FGIsourceOpen(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class FGIsourceOpenAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.FGIsourceOpenAttribute
{
    private static final long serialVersionUID = 1L;
    
    public FGIsourceOpenAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FGISOURCEOPEN$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "FGIsourceOpen");
    
    
    /**
     * Gets the "FGIsourceOpen" attribute
     */
    public java.util.List getFGIsourceOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FGISOURCEOPEN$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "FGIsourceOpen" attribute
     */
    public usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen xgetFGIsourceOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen target = null;
            target = (usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen)get_store().find_attribute_user(FGISOURCEOPEN$0);
            return target;
        }
    }
    
    /**
     * True if has "FGIsourceOpen" attribute
     */
    public boolean isSetFGIsourceOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FGISOURCEOPEN$0) != null;
        }
    }
    
    /**
     * Sets the "FGIsourceOpen" attribute
     */
    public void setFGIsourceOpen(java.util.List fgIsourceOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FGISOURCEOPEN$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FGISOURCEOPEN$0);
            }
            target.setListValue(fgIsourceOpen);
        }
    }
    
    /**
     * Sets (as xml) the "FGIsourceOpen" attribute
     */
    public void xsetFGIsourceOpen(usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen fgIsourceOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen target = null;
            target = (usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen)get_store().find_attribute_user(FGISOURCEOPEN$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen)get_store().add_attribute_user(FGISOURCEOPEN$0);
            }
            target.set(fgIsourceOpen);
        }
    }
    
    /**
     * Unsets the "FGIsourceOpen" attribute
     */
    public void unsetFGIsourceOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FGISOURCEOPEN$0);
        }
    }
    /**
     * An XML FGIsourceOpen(@urn:us:gov:ic:ism:v2).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlNMTOKEN.
     */
    public static class FGIsourceOpenImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements usGovIcIsmV2.FGIsourceOpenAttribute.FGIsourceOpen
    {
        private static final long serialVersionUID = 1L;
        
        public FGIsourceOpenImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FGIsourceOpenImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
