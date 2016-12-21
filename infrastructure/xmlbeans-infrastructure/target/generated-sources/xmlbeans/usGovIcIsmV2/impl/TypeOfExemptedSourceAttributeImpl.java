/*
 * An XML attribute type.
 * Localname: typeOfExemptedSource
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.TypeOfExemptedSourceAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one typeOfExemptedSource(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class TypeOfExemptedSourceAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.TypeOfExemptedSourceAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TypeOfExemptedSourceAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPEOFEXEMPTEDSOURCE$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "typeOfExemptedSource");
    
    
    /**
     * Gets the "typeOfExemptedSource" attribute
     */
    public java.util.List getTypeOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeOfExemptedSource" attribute
     */
    public usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource xgetTypeOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource target = null;
            target = (usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource)get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$0);
            return target;
        }
    }
    
    /**
     * True if has "typeOfExemptedSource" attribute
     */
    public boolean isSetTypeOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$0) != null;
        }
    }
    
    /**
     * Sets the "typeOfExemptedSource" attribute
     */
    public void setTypeOfExemptedSource(java.util.List typeOfExemptedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPEOFEXEMPTEDSOURCE$0);
            }
            target.setListValue(typeOfExemptedSource);
        }
    }
    
    /**
     * Sets (as xml) the "typeOfExemptedSource" attribute
     */
    public void xsetTypeOfExemptedSource(usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource typeOfExemptedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource target = null;
            target = (usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource)get_store().find_attribute_user(TYPEOFEXEMPTEDSOURCE$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource)get_store().add_attribute_user(TYPEOFEXEMPTEDSOURCE$0);
            }
            target.set(typeOfExemptedSource);
        }
    }
    
    /**
     * Unsets the "typeOfExemptedSource" attribute
     */
    public void unsetTypeOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPEOFEXEMPTEDSOURCE$0);
        }
    }
    /**
     * An XML typeOfExemptedSource(@urn:us:gov:ic:ism:v2).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlNMTOKEN.
     */
    public static class TypeOfExemptedSourceImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements usGovIcIsmV2.TypeOfExemptedSourceAttribute.TypeOfExemptedSource
    {
        private static final long serialVersionUID = 1L;
        
        public TypeOfExemptedSourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeOfExemptedSourceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
