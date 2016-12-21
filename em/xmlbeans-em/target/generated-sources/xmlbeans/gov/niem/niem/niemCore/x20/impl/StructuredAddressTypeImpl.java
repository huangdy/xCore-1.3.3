/*
 * XML Type:  StructuredAddressType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.StructuredAddressType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML StructuredAddressType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class StructuredAddressTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.StructuredAddressType
{
    private static final long serialVersionUID = 1L;
    
    public StructuredAddressTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSRECIPIENTNAME$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AddressRecipientName");
    private static final javax.xml.namespace.QName ADDRESSDELIVERYPOINT$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AddressDeliveryPoint");
    private static final org.apache.xmlbeans.QNameSet ADDRESSDELIVERYPOINT$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AddressDeliveryPoint"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationStreet"),
    });
    private static final javax.xml.namespace.QName LOCATIONCITYNAME$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCityName");
    private static final javax.xml.namespace.QName LOCATIONCOUNTY$6 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCounty");
    private static final org.apache.xmlbeans.QNameSet LOCATIONCOUNTY$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCountyName"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCounty"),
    });
    private static final javax.xml.namespace.QName LOCATIONSTATE$8 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationState");
    private static final org.apache.xmlbeans.QNameSet LOCATIONSTATE$9 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationStateUSPostalServiceCode"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationState"),
    });
    private static final javax.xml.namespace.QName LOCATIONCOUNTRY$10 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCountry");
    private static final org.apache.xmlbeans.QNameSet LOCATIONCOUNTRY$11 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCountry"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCountryISO3166Alpha2Code"),
    });
    private static final javax.xml.namespace.QName LOCATIONPOSTALCODE$12 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationPostalCode");
    
    
    /**
     * Gets array of all "AddressRecipientName" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getAddressRecipientNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESSRECIPIENTNAME$0, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AddressRecipientName" element
     */
    public gov.niem.niem.niemCore.x20.TextType getAddressRecipientNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ADDRESSRECIPIENTNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AddressRecipientName" element
     */
    public boolean isNilAddressRecipientNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ADDRESSRECIPIENTNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AddressRecipientName" element
     */
    public int sizeOfAddressRecipientNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSRECIPIENTNAME$0);
        }
    }
    
    /**
     * Sets array of all "AddressRecipientName" element
     */
    public void setAddressRecipientNameArray(gov.niem.niem.niemCore.x20.TextType[] addressRecipientNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressRecipientNameArray, ADDRESSRECIPIENTNAME$0);
        }
    }
    
    /**
     * Sets ith "AddressRecipientName" element
     */
    public void setAddressRecipientNameArray(int i, gov.niem.niem.niemCore.x20.TextType addressRecipientName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ADDRESSRECIPIENTNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(addressRecipientName);
        }
    }
    
    /**
     * Nils the ith "AddressRecipientName" element
     */
    public void setNilAddressRecipientNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ADDRESSRECIPIENTNAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AddressRecipientName" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewAddressRecipientName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(ADDRESSRECIPIENTNAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AddressRecipientName" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewAddressRecipientName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ADDRESSRECIPIENTNAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AddressRecipientName" element
     */
    public void removeAddressRecipientName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSRECIPIENTNAME$0, i);
        }
    }
    
    /**
     * Gets array of all "AddressDeliveryPoint" elements
     */
    public org.apache.xmlbeans.XmlObject[] getAddressDeliveryPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESSDELIVERYPOINT$3, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AddressDeliveryPoint" element
     */
    public org.apache.xmlbeans.XmlObject getAddressDeliveryPointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ADDRESSDELIVERYPOINT$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AddressDeliveryPoint" element
     */
    public int sizeOfAddressDeliveryPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSDELIVERYPOINT$3);
        }
    }
    
    /**
     * Sets array of all "AddressDeliveryPoint" element
     */
    public void setAddressDeliveryPointArray(org.apache.xmlbeans.XmlObject[] addressDeliveryPointArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(addressDeliveryPointArray, ADDRESSDELIVERYPOINT$2, ADDRESSDELIVERYPOINT$3);
        }
    }
    
    /**
     * Sets ith "AddressDeliveryPoint" element
     */
    public void setAddressDeliveryPointArray(int i, org.apache.xmlbeans.XmlObject addressDeliveryPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ADDRESSDELIVERYPOINT$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(addressDeliveryPoint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AddressDeliveryPoint" element
     */
    public org.apache.xmlbeans.XmlObject insertNewAddressDeliveryPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ADDRESSDELIVERYPOINT$3, ADDRESSDELIVERYPOINT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AddressDeliveryPoint" element
     */
    public org.apache.xmlbeans.XmlObject addNewAddressDeliveryPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ADDRESSDELIVERYPOINT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "AddressDeliveryPoint" element
     */
    public void removeAddressDeliveryPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSDELIVERYPOINT$3, i);
        }
    }
    
    /**
     * Gets array of all "LocationCityName" elements
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType[] getLocationCityNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONCITYNAME$4, targetList);
            gov.niem.niem.niemCore.x20.ProperNameTextType[] result = new gov.niem.niem.niemCore.x20.ProperNameTextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationCityName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType getLocationCityNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONCITYNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationCityName" element
     */
    public boolean isNilLocationCityNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONCITYNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationCityName" element
     */
    public int sizeOfLocationCityNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONCITYNAME$4);
        }
    }
    
    /**
     * Sets array of all "LocationCityName" element
     */
    public void setLocationCityNameArray(gov.niem.niem.niemCore.x20.ProperNameTextType[] locationCityNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationCityNameArray, LOCATIONCITYNAME$4);
        }
    }
    
    /**
     * Sets ith "LocationCityName" element
     */
    public void setLocationCityNameArray(int i, gov.niem.niem.niemCore.x20.ProperNameTextType locationCityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONCITYNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationCityName);
        }
    }
    
    /**
     * Nils the ith "LocationCityName" element
     */
    public void setNilLocationCityNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONCITYNAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationCityName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType insertNewLocationCityName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().insert_element_user(LOCATIONCITYNAME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationCityName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType addNewLocationCityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().add_element_user(LOCATIONCITYNAME$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationCityName" element
     */
    public void removeLocationCityName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONCITYNAME$4, i);
        }
    }
    
    /**
     * Gets array of all "LocationCounty" elements
     */
    public org.apache.xmlbeans.XmlObject[] getLocationCountyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONCOUNTY$7, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationCounty" element
     */
    public org.apache.xmlbeans.XmlObject getLocationCountyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LOCATIONCOUNTY$7, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LocationCounty" element
     */
    public int sizeOfLocationCountyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONCOUNTY$7);
        }
    }
    
    /**
     * Sets array of all "LocationCounty" element
     */
    public void setLocationCountyArray(org.apache.xmlbeans.XmlObject[] locationCountyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationCountyArray, LOCATIONCOUNTY$6, LOCATIONCOUNTY$7);
        }
    }
    
    /**
     * Sets ith "LocationCounty" element
     */
    public void setLocationCountyArray(int i, org.apache.xmlbeans.XmlObject locationCounty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LOCATIONCOUNTY$7, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationCounty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationCounty" element
     */
    public org.apache.xmlbeans.XmlObject insertNewLocationCounty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(LOCATIONCOUNTY$7, LOCATIONCOUNTY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationCounty" element
     */
    public org.apache.xmlbeans.XmlObject addNewLocationCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LOCATIONCOUNTY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationCounty" element
     */
    public void removeLocationCounty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONCOUNTY$7, i);
        }
    }
    
    /**
     * Gets array of all "LocationState" elements
     */
    public org.apache.xmlbeans.XmlObject[] getLocationStateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONSTATE$9, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationState" element
     */
    public org.apache.xmlbeans.XmlObject getLocationStateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LOCATIONSTATE$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LocationState" element
     */
    public int sizeOfLocationStateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONSTATE$9);
        }
    }
    
    /**
     * Sets array of all "LocationState" element
     */
    public void setLocationStateArray(org.apache.xmlbeans.XmlObject[] locationStateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationStateArray, LOCATIONSTATE$8, LOCATIONSTATE$9);
        }
    }
    
    /**
     * Sets ith "LocationState" element
     */
    public void setLocationStateArray(int i, org.apache.xmlbeans.XmlObject locationState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LOCATIONSTATE$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationState);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationState" element
     */
    public org.apache.xmlbeans.XmlObject insertNewLocationState(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(LOCATIONSTATE$9, LOCATIONSTATE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationState" element
     */
    public org.apache.xmlbeans.XmlObject addNewLocationState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LOCATIONSTATE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationState" element
     */
    public void removeLocationState(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONSTATE$9, i);
        }
    }
    
    /**
     * Gets array of all "LocationCountry" elements
     */
    public org.apache.xmlbeans.XmlObject[] getLocationCountryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONCOUNTRY$11, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationCountry" element
     */
    public org.apache.xmlbeans.XmlObject getLocationCountryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LOCATIONCOUNTRY$11, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "LocationCountry" element
     */
    public int sizeOfLocationCountryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONCOUNTRY$11);
        }
    }
    
    /**
     * Sets array of all "LocationCountry" element
     */
    public void setLocationCountryArray(org.apache.xmlbeans.XmlObject[] locationCountryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationCountryArray, LOCATIONCOUNTRY$10, LOCATIONCOUNTRY$11);
        }
    }
    
    /**
     * Sets ith "LocationCountry" element
     */
    public void setLocationCountryArray(int i, org.apache.xmlbeans.XmlObject locationCountry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LOCATIONCOUNTRY$11, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationCountry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationCountry" element
     */
    public org.apache.xmlbeans.XmlObject insertNewLocationCountry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(LOCATIONCOUNTRY$11, LOCATIONCOUNTRY$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationCountry" element
     */
    public org.apache.xmlbeans.XmlObject addNewLocationCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LOCATIONCOUNTRY$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationCountry" element
     */
    public void removeLocationCountry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONCOUNTRY$11, i);
        }
    }
    
    /**
     * Gets array of all "LocationPostalCode" elements
     */
    public gov.niem.niem.proxy.xsd.x20.String[] getLocationPostalCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONPOSTALCODE$12, targetList);
            gov.niem.niem.proxy.xsd.x20.String[] result = new gov.niem.niem.proxy.xsd.x20.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationPostalCode" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getLocationPostalCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(LOCATIONPOSTALCODE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationPostalCode" element
     */
    public boolean isNilLocationPostalCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(LOCATIONPOSTALCODE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationPostalCode" element
     */
    public int sizeOfLocationPostalCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONPOSTALCODE$12);
        }
    }
    
    /**
     * Sets array of all "LocationPostalCode" element
     */
    public void setLocationPostalCodeArray(gov.niem.niem.proxy.xsd.x20.String[] locationPostalCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationPostalCodeArray, LOCATIONPOSTALCODE$12);
        }
    }
    
    /**
     * Sets ith "LocationPostalCode" element
     */
    public void setLocationPostalCodeArray(int i, gov.niem.niem.proxy.xsd.x20.String locationPostalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(LOCATIONPOSTALCODE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationPostalCode);
        }
    }
    
    /**
     * Nils the ith "LocationPostalCode" element
     */
    public void setNilLocationPostalCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(LOCATIONPOSTALCODE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationPostalCode" element
     */
    public gov.niem.niem.proxy.xsd.x20.String insertNewLocationPostalCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(LOCATIONPOSTALCODE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationPostalCode" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewLocationPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(LOCATIONPOSTALCODE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationPostalCode" element
     */
    public void removeLocationPostalCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONPOSTALCODE$12, i);
        }
    }
}
