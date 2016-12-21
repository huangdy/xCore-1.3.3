/*
 * XML Type:  AddressType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.AddressType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML AddressType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class AddressTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.AddressType
{
    private static final long serialVersionUID = 1L;
    
    public AddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSTYPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "AddressType");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Address");
    private static final javax.xml.namespace.QName CITY$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "City");
    private static final javax.xml.namespace.QName STATEORPROVINCE$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "StateOrProvince");
    private static final javax.xml.namespace.QName POSTCODE$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "PostCode");
    private static final javax.xml.namespace.QName COUNTRY$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Country");
    
    
    /**
     * Gets the "AddressType" element
     */
    public java.lang.String getAddressType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AddressType" element
     */
    public org.apache.xmlbeans.XmlString xgetAddressType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "AddressType" element
     */
    public boolean isSetAddressType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "AddressType" element
     */
    public void setAddressType(java.lang.String addressType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESSTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESSTYPE$0);
            }
            target.setStringValue(addressType);
        }
    }
    
    /**
     * Sets (as xml) the "AddressType" element
     */
    public void xsetAddressType(org.apache.xmlbeans.XmlString addressType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESSTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESSTYPE$0);
            }
            target.set(addressType);
        }
    }
    
    /**
     * Unsets the "AddressType" element
     */
    public void unsetAddressType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public java.lang.String getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Address" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Address" element
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$2) != 0;
        }
    }
    
    /**
     * Sets the "Address" element
     */
    public void setAddress(java.lang.String address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$2);
            }
            target.setStringValue(address);
        }
    }
    
    /**
     * Sets (as xml) the "Address" element
     */
    public void xsetAddress(org.apache.xmlbeans.XmlString address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$2);
            }
            target.set(address);
        }
    }
    
    /**
     * Unsets the "Address" element
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$2, 0);
        }
    }
    
    /**
     * Gets the "City" element
     */
    public java.lang.String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "City" element
     */
    public org.apache.xmlbeans.XmlString xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "City" element
     */
    public boolean isSetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$4) != 0;
        }
    }
    
    /**
     * Sets the "City" element
     */
    public void setCity(java.lang.String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$4);
            }
            target.setStringValue(city);
        }
    }
    
    /**
     * Sets (as xml) the "City" element
     */
    public void xsetCity(org.apache.xmlbeans.XmlString city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$4);
            }
            target.set(city);
        }
    }
    
    /**
     * Unsets the "City" element
     */
    public void unsetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$4, 0);
        }
    }
    
    /**
     * Gets the "StateOrProvince" element
     */
    public java.lang.String getStateOrProvince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATEORPROVINCE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StateOrProvince" element
     */
    public org.apache.xmlbeans.XmlString xgetStateOrProvince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATEORPROVINCE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "StateOrProvince" element
     */
    public boolean isSetStateOrProvince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATEORPROVINCE$6) != 0;
        }
    }
    
    /**
     * Sets the "StateOrProvince" element
     */
    public void setStateOrProvince(java.lang.String stateOrProvince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATEORPROVINCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATEORPROVINCE$6);
            }
            target.setStringValue(stateOrProvince);
        }
    }
    
    /**
     * Sets (as xml) the "StateOrProvince" element
     */
    public void xsetStateOrProvince(org.apache.xmlbeans.XmlString stateOrProvince)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATEORPROVINCE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATEORPROVINCE$6);
            }
            target.set(stateOrProvince);
        }
    }
    
    /**
     * Unsets the "StateOrProvince" element
     */
    public void unsetStateOrProvince()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATEORPROVINCE$6, 0);
        }
    }
    
    /**
     * Gets the "PostCode" element
     */
    public java.lang.String getPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PostCode" element
     */
    public org.apache.xmlbeans.XmlString xgetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCODE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "PostCode" element
     */
    public boolean isSetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTCODE$8) != 0;
        }
    }
    
    /**
     * Sets the "PostCode" element
     */
    public void setPostCode(java.lang.String postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$8);
            }
            target.setStringValue(postCode);
        }
    }
    
    /**
     * Sets (as xml) the "PostCode" element
     */
    public void xsetPostCode(org.apache.xmlbeans.XmlString postCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(POSTCODE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(POSTCODE$8);
            }
            target.set(postCode);
        }
    }
    
    /**
     * Unsets the "PostCode" element
     */
    public void unsetPostCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTCODE$8, 0);
        }
    }
    
    /**
     * Gets the "Country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$10) != 0;
        }
    }
    
    /**
     * Sets the "Country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$10);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "Country" element
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$10);
            }
            target.set(country);
        }
    }
    
    /**
     * Unsets the "Country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$10, 0);
        }
    }
}
