/*
 * XML Type:  NameType
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.NameType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3.impl;
/**
 * An XML NameType(@urn:oasis:names:tc:ciq:xal:3).
 *
 * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.NameType.
 */
public class NameTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXal3.NameType
{
    private static final long serialVersionUID = 1L;
    
    public NameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected NameTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ABBREVIATION$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "Abbreviation");
    
    
    /**
     * Gets the "Abbreviation" attribute
     */
    public boolean getAbbreviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Abbreviation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAbbreviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$0);
            return target;
        }
    }
    
    /**
     * True if has "Abbreviation" attribute
     */
    public boolean isSetAbbreviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ABBREVIATION$0) != null;
        }
    }
    
    /**
     * Sets the "Abbreviation" attribute
     */
    public void setAbbreviation(boolean abbreviation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABBREVIATION$0);
            }
            target.setBooleanValue(abbreviation);
        }
    }
    
    /**
     * Sets (as xml) the "Abbreviation" attribute
     */
    public void xsetAbbreviation(org.apache.xmlbeans.XmlBoolean abbreviation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABBREVIATION$0);
            }
            target.set(abbreviation);
        }
    }
    
    /**
     * Unsets the "Abbreviation" attribute
     */
    public void unsetAbbreviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ABBREVIATION$0);
        }
    }
}
