/*
 * An XML attribute type.
 * Localname: disseminationControls
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.DisseminationControlsAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one disseminationControls(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class DisseminationControlsAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.DisseminationControlsAttribute
{
    private static final long serialVersionUID = 1L;
    
    public DisseminationControlsAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISSEMINATIONCONTROLS$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "disseminationControls");
    
    
    /**
     * Gets the "disseminationControls" attribute
     */
    public java.util.List getDisseminationControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISSEMINATIONCONTROLS$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "disseminationControls" attribute
     */
    public usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls xgetDisseminationControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls target = null;
            target = (usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls)get_store().find_attribute_user(DISSEMINATIONCONTROLS$0);
            return target;
        }
    }
    
    /**
     * True if has "disseminationControls" attribute
     */
    public boolean isSetDisseminationControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISSEMINATIONCONTROLS$0) != null;
        }
    }
    
    /**
     * Sets the "disseminationControls" attribute
     */
    public void setDisseminationControls(java.util.List disseminationControls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISSEMINATIONCONTROLS$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISSEMINATIONCONTROLS$0);
            }
            target.setListValue(disseminationControls);
        }
    }
    
    /**
     * Sets (as xml) the "disseminationControls" attribute
     */
    public void xsetDisseminationControls(usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls disseminationControls)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls target = null;
            target = (usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls)get_store().find_attribute_user(DISSEMINATIONCONTROLS$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls)get_store().add_attribute_user(DISSEMINATIONCONTROLS$0);
            }
            target.set(disseminationControls);
        }
    }
    
    /**
     * Unsets the "disseminationControls" attribute
     */
    public void unsetDisseminationControls()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISSEMINATIONCONTROLS$0);
        }
    }
    /**
     * An XML disseminationControls(@urn:us:gov:ic:ism:v2).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlNMTOKEN.
     */
    public static class DisseminationControlsImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements usGovIcIsmV2.DisseminationControlsAttribute.DisseminationControls
    {
        private static final long serialVersionUID = 1L;
        
        public DisseminationControlsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DisseminationControlsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
