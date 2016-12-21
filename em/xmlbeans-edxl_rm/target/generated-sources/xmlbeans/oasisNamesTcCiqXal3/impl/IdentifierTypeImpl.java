/*
 * XML Type:  IdentifierType
 * Namespace: urn:oasis:names:tc:ciq:xal:3
 * Java type: oasisNamesTcCiqXal3.IdentifierType
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXal3.impl;
/**
 * An XML IdentifierType(@urn:oasis:names:tc:ciq:xal:3).
 *
 * This is an atomic type that is a restriction of oasisNamesTcCiqXal3.IdentifierType.
 */
public class IdentifierTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements oasisNamesTcCiqXal3.IdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public IdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected IdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:xal:3", "Type");
    private static final javax.xml.namespace.QName ABBREVIATION$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:ciq:ct:3", "Abbreviation");
    
    
    /**
     * Gets the "Type" attribute
     */
    public oasisNamesTcCiqXal3.IdentifierElementTypeList.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (oasisNamesTcCiqXal3.IdentifierElementTypeList.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Type" attribute
     */
    public oasisNamesTcCiqXal3.IdentifierElementTypeList xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.IdentifierElementTypeList target = null;
            target = (oasisNamesTcCiqXal3.IdentifierElementTypeList)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * True if has "Type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$0) != null;
        }
    }
    
    /**
     * Sets the "Type" attribute
     */
    public void setType(oasisNamesTcCiqXal3.IdentifierElementTypeList.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "Type" attribute
     */
    public void xsetType(oasisNamesTcCiqXal3.IdentifierElementTypeList type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.IdentifierElementTypeList target = null;
            target = (oasisNamesTcCiqXal3.IdentifierElementTypeList)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.IdentifierElementTypeList)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "Type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$0);
        }
    }
    
    /**
     * Gets the "Abbreviation" attribute
     */
    public boolean getAbbreviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$2);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$2);
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
            return get_store().find_attribute_user(ABBREVIATION$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBREVIATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABBREVIATION$2);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABBREVIATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABBREVIATION$2);
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
            get_store().remove_attribute(ABBREVIATION$2);
        }
    }
}
