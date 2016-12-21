/*
 * An XML attribute type.
 * Localname: declassDate
 * Namespace: urn:us:gov:ic:ism:v2
 * Java type: usGovIcIsmV2.DeclassDateAttribute
 *
 * Automatically generated - do not modify.
 */
package usGovIcIsmV2.impl;
/**
 * A document containing one declassDate(@urn:us:gov:ic:ism:v2) attribute.
 *
 * This is a complex type.
 */
public class DeclassDateAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements usGovIcIsmV2.DeclassDateAttribute
{
    private static final long serialVersionUID = 1L;
    
    public DeclassDateAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DECLASSDATE$0 = 
        new javax.xml.namespace.QName("urn:us:gov:ic:ism:v2", "declassDate");
    
    
    /**
     * Gets the "declassDate" attribute
     */
    public java.util.Calendar getDeclassDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSDATE$0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "declassDate" attribute
     */
    public usGovIcIsmV2.DeclassDateAttribute.DeclassDate xgetDeclassDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassDateAttribute.DeclassDate target = null;
            target = (usGovIcIsmV2.DeclassDateAttribute.DeclassDate)get_store().find_attribute_user(DECLASSDATE$0);
            return target;
        }
    }
    
    /**
     * True if has "declassDate" attribute
     */
    public boolean isSetDeclassDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DECLASSDATE$0) != null;
        }
    }
    
    /**
     * Sets the "declassDate" attribute
     */
    public void setDeclassDate(java.util.Calendar declassDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DECLASSDATE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DECLASSDATE$0);
            }
            target.setCalendarValue(declassDate);
        }
    }
    
    /**
     * Sets (as xml) the "declassDate" attribute
     */
    public void xsetDeclassDate(usGovIcIsmV2.DeclassDateAttribute.DeclassDate declassDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            usGovIcIsmV2.DeclassDateAttribute.DeclassDate target = null;
            target = (usGovIcIsmV2.DeclassDateAttribute.DeclassDate)get_store().find_attribute_user(DECLASSDATE$0);
            if (target == null)
            {
                target = (usGovIcIsmV2.DeclassDateAttribute.DeclassDate)get_store().add_attribute_user(DECLASSDATE$0);
            }
            target.set(declassDate);
        }
    }
    
    /**
     * Unsets the "declassDate" attribute
     */
    public void unsetDeclassDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DECLASSDATE$0);
        }
    }
    /**
     * An XML declassDate(@urn:us:gov:ic:ism:v2).
     *
     * This is an atomic type that is a restriction of usGovIcIsmV2.DeclassDateAttribute$DeclassDate.
     */
    public static class DeclassDateImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements usGovIcIsmV2.DeclassDateAttribute.DeclassDate
    {
        private static final long serialVersionUID = 1L;
        
        public DeclassDateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected DeclassDateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
