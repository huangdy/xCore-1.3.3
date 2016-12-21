/*
 * An XML attribute type.
 * Localname: dateOfExemptedSource
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.DateOfExemptedSourceAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one dateOfExemptedSource(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class DateOfExemptedSourceAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.DateOfExemptedSourceAttribute
{
    private static final long serialVersionUID = 1L;
    
    public DateOfExemptedSourceAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATEOFEXEMPTEDSOURCE$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "dateOfExemptedSource");
    
    
    /**
     * Gets the "dateOfExemptedSource" attribute
     */
    public java.util.Calendar getDateOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateOfExemptedSource" attribute
     */
    public usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource xgetDateOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource target = null;
            target = (usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource)get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$0);
            return target;
        }
    }
    
    /**
     * True if has "dateOfExemptedSource" attribute
     */
    public boolean isSetDateOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$0) != null;
        }
    }
    
    /**
     * Sets the "dateOfExemptedSource" attribute
     */
    public void setDateOfExemptedSource(java.util.Calendar dateOfExemptedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATEOFEXEMPTEDSOURCE$0);
            }
            target.setCalendarValue(dateOfExemptedSource);
        }
    }
    
    /**
     * Sets (as xml) the "dateOfExemptedSource" attribute
     */
    public void xsetDateOfExemptedSource(usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource dateOfExemptedSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource target = null;
            target = (usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource)get_store().find_attribute_user(DATEOFEXEMPTEDSOURCE$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource)get_store().add_attribute_user(DATEOFEXEMPTEDSOURCE$0);
            }
            target.set(dateOfExemptedSource);
        }
    }
    
    /**
     * Unsets the "dateOfExemptedSource" attribute
     */
    public void unsetDateOfExemptedSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATEOFEXEMPTEDSOURCE$0);
        }
    }
    /**
     * An XML dateOfExemptedSource(@urn:us:gov:ic:ism:v2).
     *
     * This is an atomic type that is a restriction of usGovIcIsmV2.DateOfExemptedSourceAttribute$DateOfExemptedSource.
     */
    public static class DateOfExemptedSourceImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements usGovIcIsmV2.DateOfExemptedSourceAttribute.DateOfExemptedSource
    {
        private static final long serialVersionUID = 1L;
        
        public DateOfExemptedSourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DateOfExemptedSourceImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
