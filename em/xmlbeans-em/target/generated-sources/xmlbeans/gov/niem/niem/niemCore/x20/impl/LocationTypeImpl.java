/*
 * XML Type:  LocationType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML LocationType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class LocationTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.LocationType
{
    private static final long serialVersionUID = 1L;
    
    public LocationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONADDRESS$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationAddress");
    private static final javax.xml.namespace.QName LOCATIONAREA$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationArea");
    private static final javax.xml.namespace.QName LOCATIONCONTACTINFORMATION$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationContactInformation");
    private static final javax.xml.namespace.QName LOCATIONCROSSSTREET$6 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCrossStreet");
    private static final javax.xml.namespace.QName LOCATIONDESCRIPTIONTEXT$8 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationDescriptionText");
    private static final javax.xml.namespace.QName LOCATIONHIGHWAY$10 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationHighway");
    private static final javax.xml.namespace.QName LOCATIONMAPLOCATION$12 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationMapLocation");
    private static final javax.xml.namespace.QName LOCATIONMGRSCOORDINATE$14 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationMGRSCoordinate");
    private static final javax.xml.namespace.QName LOCATIONNAME$16 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationName");
    private static final javax.xml.namespace.QName LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$18 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationSurroundingAreaDescriptionText");
    private static final javax.xml.namespace.QName LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$20 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationTwoDimensionalGeographicCoordinate");
    private static final javax.xml.namespace.QName LOCATIONUTMCOORDINATE$22 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationUTMCoordinate");
    
    
    /**
     * Gets array of all "LocationAddress" elements
     */
    public gov.niem.niem.niemCore.x20.AddressType[] getLocationAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONADDRESS$0, targetList);
            gov.niem.niem.niemCore.x20.AddressType[] result = new gov.niem.niem.niemCore.x20.AddressType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationAddress" element
     */
    public gov.niem.niem.niemCore.x20.AddressType getLocationAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AddressType target = null;
            target = (gov.niem.niem.niemCore.x20.AddressType)get_store().find_element_user(LOCATIONADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationAddress" element
     */
    public boolean isNilLocationAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AddressType target = null;
            target = (gov.niem.niem.niemCore.x20.AddressType)get_store().find_element_user(LOCATIONADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationAddress" element
     */
    public int sizeOfLocationAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONADDRESS$0);
        }
    }
    
    /**
     * Sets array of all "LocationAddress" element
     */
    public void setLocationAddressArray(gov.niem.niem.niemCore.x20.AddressType[] locationAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationAddressArray, LOCATIONADDRESS$0);
        }
    }
    
    /**
     * Sets ith "LocationAddress" element
     */
    public void setLocationAddressArray(int i, gov.niem.niem.niemCore.x20.AddressType locationAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AddressType target = null;
            target = (gov.niem.niem.niemCore.x20.AddressType)get_store().find_element_user(LOCATIONADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationAddress);
        }
    }
    
    /**
     * Nils the ith "LocationAddress" element
     */
    public void setNilLocationAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AddressType target = null;
            target = (gov.niem.niem.niemCore.x20.AddressType)get_store().find_element_user(LOCATIONADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationAddress" element
     */
    public gov.niem.niem.niemCore.x20.AddressType insertNewLocationAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AddressType target = null;
            target = (gov.niem.niem.niemCore.x20.AddressType)get_store().insert_element_user(LOCATIONADDRESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationAddress" element
     */
    public gov.niem.niem.niemCore.x20.AddressType addNewLocationAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AddressType target = null;
            target = (gov.niem.niem.niemCore.x20.AddressType)get_store().add_element_user(LOCATIONADDRESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationAddress" element
     */
    public void removeLocationAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONADDRESS$0, i);
        }
    }
    
    /**
     * Gets array of all "LocationArea" elements
     */
    public gov.niem.niem.niemCore.x20.AreaType[] getLocationAreaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONAREA$2, targetList);
            gov.niem.niem.niemCore.x20.AreaType[] result = new gov.niem.niem.niemCore.x20.AreaType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationArea" element
     */
    public gov.niem.niem.niemCore.x20.AreaType getLocationAreaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AreaType target = null;
            target = (gov.niem.niem.niemCore.x20.AreaType)get_store().find_element_user(LOCATIONAREA$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationArea" element
     */
    public boolean isNilLocationAreaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AreaType target = null;
            target = (gov.niem.niem.niemCore.x20.AreaType)get_store().find_element_user(LOCATIONAREA$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationArea" element
     */
    public int sizeOfLocationAreaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONAREA$2);
        }
    }
    
    /**
     * Sets array of all "LocationArea" element
     */
    public void setLocationAreaArray(gov.niem.niem.niemCore.x20.AreaType[] locationAreaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationAreaArray, LOCATIONAREA$2);
        }
    }
    
    /**
     * Sets ith "LocationArea" element
     */
    public void setLocationAreaArray(int i, gov.niem.niem.niemCore.x20.AreaType locationArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AreaType target = null;
            target = (gov.niem.niem.niemCore.x20.AreaType)get_store().find_element_user(LOCATIONAREA$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationArea);
        }
    }
    
    /**
     * Nils the ith "LocationArea" element
     */
    public void setNilLocationAreaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AreaType target = null;
            target = (gov.niem.niem.niemCore.x20.AreaType)get_store().find_element_user(LOCATIONAREA$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationArea" element
     */
    public gov.niem.niem.niemCore.x20.AreaType insertNewLocationArea(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AreaType target = null;
            target = (gov.niem.niem.niemCore.x20.AreaType)get_store().insert_element_user(LOCATIONAREA$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationArea" element
     */
    public gov.niem.niem.niemCore.x20.AreaType addNewLocationArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AreaType target = null;
            target = (gov.niem.niem.niemCore.x20.AreaType)get_store().add_element_user(LOCATIONAREA$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationArea" element
     */
    public void removeLocationArea(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONAREA$2, i);
        }
    }
    
    /**
     * Gets array of all "LocationContactInformation" elements
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType[] getLocationContactInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONCONTACTINFORMATION$4, targetList);
            gov.niem.niem.niemCore.x20.ContactInformationType[] result = new gov.niem.niem.niemCore.x20.ContactInformationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationContactInformation" element
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType getLocationContactInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(LOCATIONCONTACTINFORMATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationContactInformation" element
     */
    public boolean isNilLocationContactInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(LOCATIONCONTACTINFORMATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationContactInformation" element
     */
    public int sizeOfLocationContactInformationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONCONTACTINFORMATION$4);
        }
    }
    
    /**
     * Sets array of all "LocationContactInformation" element
     */
    public void setLocationContactInformationArray(gov.niem.niem.niemCore.x20.ContactInformationType[] locationContactInformationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationContactInformationArray, LOCATIONCONTACTINFORMATION$4);
        }
    }
    
    /**
     * Sets ith "LocationContactInformation" element
     */
    public void setLocationContactInformationArray(int i, gov.niem.niem.niemCore.x20.ContactInformationType locationContactInformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(LOCATIONCONTACTINFORMATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationContactInformation);
        }
    }
    
    /**
     * Nils the ith "LocationContactInformation" element
     */
    public void setNilLocationContactInformationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().find_element_user(LOCATIONCONTACTINFORMATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationContactInformation" element
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType insertNewLocationContactInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().insert_element_user(LOCATIONCONTACTINFORMATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationContactInformation" element
     */
    public gov.niem.niem.niemCore.x20.ContactInformationType addNewLocationContactInformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ContactInformationType target = null;
            target = (gov.niem.niem.niemCore.x20.ContactInformationType)get_store().add_element_user(LOCATIONCONTACTINFORMATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationContactInformation" element
     */
    public void removeLocationContactInformation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONCONTACTINFORMATION$4, i);
        }
    }
    
    /**
     * Gets array of all "LocationCrossStreet" elements
     */
    public gov.niem.niem.niemCore.x20.CrossStreetType[] getLocationCrossStreetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONCROSSSTREET$6, targetList);
            gov.niem.niem.niemCore.x20.CrossStreetType[] result = new gov.niem.niem.niemCore.x20.CrossStreetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationCrossStreet" element
     */
    public gov.niem.niem.niemCore.x20.CrossStreetType getLocationCrossStreetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CrossStreetType target = null;
            target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().find_element_user(LOCATIONCROSSSTREET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationCrossStreet" element
     */
    public boolean isNilLocationCrossStreetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CrossStreetType target = null;
            target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().find_element_user(LOCATIONCROSSSTREET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationCrossStreet" element
     */
    public int sizeOfLocationCrossStreetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONCROSSSTREET$6);
        }
    }
    
    /**
     * Sets array of all "LocationCrossStreet" element
     */
    public void setLocationCrossStreetArray(gov.niem.niem.niemCore.x20.CrossStreetType[] locationCrossStreetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationCrossStreetArray, LOCATIONCROSSSTREET$6);
        }
    }
    
    /**
     * Sets ith "LocationCrossStreet" element
     */
    public void setLocationCrossStreetArray(int i, gov.niem.niem.niemCore.x20.CrossStreetType locationCrossStreet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CrossStreetType target = null;
            target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().find_element_user(LOCATIONCROSSSTREET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationCrossStreet);
        }
    }
    
    /**
     * Nils the ith "LocationCrossStreet" element
     */
    public void setNilLocationCrossStreetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CrossStreetType target = null;
            target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().find_element_user(LOCATIONCROSSSTREET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationCrossStreet" element
     */
    public gov.niem.niem.niemCore.x20.CrossStreetType insertNewLocationCrossStreet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CrossStreetType target = null;
            target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().insert_element_user(LOCATIONCROSSSTREET$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationCrossStreet" element
     */
    public gov.niem.niem.niemCore.x20.CrossStreetType addNewLocationCrossStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CrossStreetType target = null;
            target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().add_element_user(LOCATIONCROSSSTREET$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationCrossStreet" element
     */
    public void removeLocationCrossStreet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONCROSSSTREET$6, i);
        }
    }
    
    /**
     * Gets array of all "LocationDescriptionText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getLocationDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONDESCRIPTIONTEXT$8, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getLocationDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONDESCRIPTIONTEXT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationDescriptionText" element
     */
    public boolean isNilLocationDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONDESCRIPTIONTEXT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationDescriptionText" element
     */
    public int sizeOfLocationDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONDESCRIPTIONTEXT$8);
        }
    }
    
    /**
     * Sets array of all "LocationDescriptionText" element
     */
    public void setLocationDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] locationDescriptionTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationDescriptionTextArray, LOCATIONDESCRIPTIONTEXT$8);
        }
    }
    
    /**
     * Sets ith "LocationDescriptionText" element
     */
    public void setLocationDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType locationDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONDESCRIPTIONTEXT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationDescriptionText);
        }
    }
    
    /**
     * Nils the ith "LocationDescriptionText" element
     */
    public void setNilLocationDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONDESCRIPTIONTEXT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewLocationDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(LOCATIONDESCRIPTIONTEXT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewLocationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(LOCATIONDESCRIPTIONTEXT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationDescriptionText" element
     */
    public void removeLocationDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONDESCRIPTIONTEXT$8, i);
        }
    }
    
    /**
     * Gets array of all "LocationHighway" elements
     */
    public gov.niem.niem.niemCore.x20.HighwayType[] getLocationHighwayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONHIGHWAY$10, targetList);
            gov.niem.niem.niemCore.x20.HighwayType[] result = new gov.niem.niem.niemCore.x20.HighwayType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationHighway" element
     */
    public gov.niem.niem.niemCore.x20.HighwayType getLocationHighwayArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.HighwayType target = null;
            target = (gov.niem.niem.niemCore.x20.HighwayType)get_store().find_element_user(LOCATIONHIGHWAY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationHighway" element
     */
    public boolean isNilLocationHighwayArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.HighwayType target = null;
            target = (gov.niem.niem.niemCore.x20.HighwayType)get_store().find_element_user(LOCATIONHIGHWAY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationHighway" element
     */
    public int sizeOfLocationHighwayArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONHIGHWAY$10);
        }
    }
    
    /**
     * Sets array of all "LocationHighway" element
     */
    public void setLocationHighwayArray(gov.niem.niem.niemCore.x20.HighwayType[] locationHighwayArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationHighwayArray, LOCATIONHIGHWAY$10);
        }
    }
    
    /**
     * Sets ith "LocationHighway" element
     */
    public void setLocationHighwayArray(int i, gov.niem.niem.niemCore.x20.HighwayType locationHighway)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.HighwayType target = null;
            target = (gov.niem.niem.niemCore.x20.HighwayType)get_store().find_element_user(LOCATIONHIGHWAY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationHighway);
        }
    }
    
    /**
     * Nils the ith "LocationHighway" element
     */
    public void setNilLocationHighwayArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.HighwayType target = null;
            target = (gov.niem.niem.niemCore.x20.HighwayType)get_store().find_element_user(LOCATIONHIGHWAY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationHighway" element
     */
    public gov.niem.niem.niemCore.x20.HighwayType insertNewLocationHighway(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.HighwayType target = null;
            target = (gov.niem.niem.niemCore.x20.HighwayType)get_store().insert_element_user(LOCATIONHIGHWAY$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationHighway" element
     */
    public gov.niem.niem.niemCore.x20.HighwayType addNewLocationHighway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.HighwayType target = null;
            target = (gov.niem.niem.niemCore.x20.HighwayType)get_store().add_element_user(LOCATIONHIGHWAY$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationHighway" element
     */
    public void removeLocationHighway(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONHIGHWAY$10, i);
        }
    }
    
    /**
     * Gets array of all "LocationMapLocation" elements
     */
    public gov.niem.niem.niemCore.x20.MapLocationType[] getLocationMapLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONMAPLOCATION$12, targetList);
            gov.niem.niem.niemCore.x20.MapLocationType[] result = new gov.niem.niem.niemCore.x20.MapLocationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationMapLocation" element
     */
    public gov.niem.niem.niemCore.x20.MapLocationType getLocationMapLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MapLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().find_element_user(LOCATIONMAPLOCATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationMapLocation" element
     */
    public boolean isNilLocationMapLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MapLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().find_element_user(LOCATIONMAPLOCATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationMapLocation" element
     */
    public int sizeOfLocationMapLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONMAPLOCATION$12);
        }
    }
    
    /**
     * Sets array of all "LocationMapLocation" element
     */
    public void setLocationMapLocationArray(gov.niem.niem.niemCore.x20.MapLocationType[] locationMapLocationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationMapLocationArray, LOCATIONMAPLOCATION$12);
        }
    }
    
    /**
     * Sets ith "LocationMapLocation" element
     */
    public void setLocationMapLocationArray(int i, gov.niem.niem.niemCore.x20.MapLocationType locationMapLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MapLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().find_element_user(LOCATIONMAPLOCATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationMapLocation);
        }
    }
    
    /**
     * Nils the ith "LocationMapLocation" element
     */
    public void setNilLocationMapLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MapLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().find_element_user(LOCATIONMAPLOCATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationMapLocation" element
     */
    public gov.niem.niem.niemCore.x20.MapLocationType insertNewLocationMapLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MapLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().insert_element_user(LOCATIONMAPLOCATION$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationMapLocation" element
     */
    public gov.niem.niem.niemCore.x20.MapLocationType addNewLocationMapLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MapLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().add_element_user(LOCATIONMAPLOCATION$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationMapLocation" element
     */
    public void removeLocationMapLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONMAPLOCATION$12, i);
        }
    }
    
    /**
     * Gets array of all "LocationMGRSCoordinate" elements
     */
    public gov.niem.niem.niemCore.x20.MGRSCoordinateType[] getLocationMGRSCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONMGRSCOORDINATE$14, targetList);
            gov.niem.niem.niemCore.x20.MGRSCoordinateType[] result = new gov.niem.niem.niemCore.x20.MGRSCoordinateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationMGRSCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.MGRSCoordinateType getLocationMGRSCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MGRSCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().find_element_user(LOCATIONMGRSCOORDINATE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationMGRSCoordinate" element
     */
    public boolean isNilLocationMGRSCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MGRSCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().find_element_user(LOCATIONMGRSCOORDINATE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationMGRSCoordinate" element
     */
    public int sizeOfLocationMGRSCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONMGRSCOORDINATE$14);
        }
    }
    
    /**
     * Sets array of all "LocationMGRSCoordinate" element
     */
    public void setLocationMGRSCoordinateArray(gov.niem.niem.niemCore.x20.MGRSCoordinateType[] locationMGRSCoordinateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationMGRSCoordinateArray, LOCATIONMGRSCOORDINATE$14);
        }
    }
    
    /**
     * Sets ith "LocationMGRSCoordinate" element
     */
    public void setLocationMGRSCoordinateArray(int i, gov.niem.niem.niemCore.x20.MGRSCoordinateType locationMGRSCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MGRSCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().find_element_user(LOCATIONMGRSCOORDINATE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationMGRSCoordinate);
        }
    }
    
    /**
     * Nils the ith "LocationMGRSCoordinate" element
     */
    public void setNilLocationMGRSCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MGRSCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().find_element_user(LOCATIONMGRSCOORDINATE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationMGRSCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.MGRSCoordinateType insertNewLocationMGRSCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MGRSCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().insert_element_user(LOCATIONMGRSCOORDINATE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationMGRSCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.MGRSCoordinateType addNewLocationMGRSCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MGRSCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().add_element_user(LOCATIONMGRSCOORDINATE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationMGRSCoordinate" element
     */
    public void removeLocationMGRSCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONMGRSCOORDINATE$14, i);
        }
    }
    
    /**
     * Gets array of all "LocationName" elements
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType[] getLocationNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONNAME$16, targetList);
            gov.niem.niem.niemCore.x20.ProperNameTextType[] result = new gov.niem.niem.niemCore.x20.ProperNameTextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType getLocationNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONNAME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationName" element
     */
    public boolean isNilLocationNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONNAME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationName" element
     */
    public int sizeOfLocationNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONNAME$16);
        }
    }
    
    /**
     * Sets array of all "LocationName" element
     */
    public void setLocationNameArray(gov.niem.niem.niemCore.x20.ProperNameTextType[] locationNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationNameArray, LOCATIONNAME$16);
        }
    }
    
    /**
     * Sets ith "LocationName" element
     */
    public void setLocationNameArray(int i, gov.niem.niem.niemCore.x20.ProperNameTextType locationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONNAME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationName);
        }
    }
    
    /**
     * Nils the ith "LocationName" element
     */
    public void setNilLocationNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(LOCATIONNAME$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType insertNewLocationName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().insert_element_user(LOCATIONNAME$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType addNewLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().add_element_user(LOCATIONNAME$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationName" element
     */
    public void removeLocationName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONNAME$16, i);
        }
    }
    
    /**
     * Gets array of all "LocationSurroundingAreaDescriptionText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getLocationSurroundingAreaDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$18, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationSurroundingAreaDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getLocationSurroundingAreaDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationSurroundingAreaDescriptionText" element
     */
    public boolean isNilLocationSurroundingAreaDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationSurroundingAreaDescriptionText" element
     */
    public int sizeOfLocationSurroundingAreaDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$18);
        }
    }
    
    /**
     * Sets array of all "LocationSurroundingAreaDescriptionText" element
     */
    public void setLocationSurroundingAreaDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] locationSurroundingAreaDescriptionTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationSurroundingAreaDescriptionTextArray, LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$18);
        }
    }
    
    /**
     * Sets ith "LocationSurroundingAreaDescriptionText" element
     */
    public void setLocationSurroundingAreaDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType locationSurroundingAreaDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationSurroundingAreaDescriptionText);
        }
    }
    
    /**
     * Nils the ith "LocationSurroundingAreaDescriptionText" element
     */
    public void setNilLocationSurroundingAreaDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationSurroundingAreaDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewLocationSurroundingAreaDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationSurroundingAreaDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewLocationSurroundingAreaDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationSurroundingAreaDescriptionText" element
     */
    public void removeLocationSurroundingAreaDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONSURROUNDINGAREADESCRIPTIONTEXT$18, i);
        }
    }
    
    /**
     * Gets array of all "LocationTwoDimensionalGeographicCoordinate" elements
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[] getLocationTwoDimensionalGeographicCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$20, targetList);
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[] result = new gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationTwoDimensionalGeographicCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType getLocationTwoDimensionalGeographicCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationTwoDimensionalGeographicCoordinate" element
     */
    public boolean isNilLocationTwoDimensionalGeographicCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationTwoDimensionalGeographicCoordinate" element
     */
    public int sizeOfLocationTwoDimensionalGeographicCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$20);
        }
    }
    
    /**
     * Sets array of all "LocationTwoDimensionalGeographicCoordinate" element
     */
    public void setLocationTwoDimensionalGeographicCoordinateArray(gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[] locationTwoDimensionalGeographicCoordinateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationTwoDimensionalGeographicCoordinateArray, LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$20);
        }
    }
    
    /**
     * Sets ith "LocationTwoDimensionalGeographicCoordinate" element
     */
    public void setLocationTwoDimensionalGeographicCoordinateArray(int i, gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType locationTwoDimensionalGeographicCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationTwoDimensionalGeographicCoordinate);
        }
    }
    
    /**
     * Nils the ith "LocationTwoDimensionalGeographicCoordinate" element
     */
    public void setNilLocationTwoDimensionalGeographicCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationTwoDimensionalGeographicCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType insertNewLocationTwoDimensionalGeographicCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().insert_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationTwoDimensionalGeographicCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType addNewLocationTwoDimensionalGeographicCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().add_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationTwoDimensionalGeographicCoordinate" element
     */
    public void removeLocationTwoDimensionalGeographicCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$20, i);
        }
    }
    
    /**
     * Gets array of all "LocationUTMCoordinate" elements
     */
    public gov.niem.niem.niemCore.x20.UTMCoordinateType[] getLocationUTMCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LOCATIONUTMCOORDINATE$22, targetList);
            gov.niem.niem.niemCore.x20.UTMCoordinateType[] result = new gov.niem.niem.niemCore.x20.UTMCoordinateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LocationUTMCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.UTMCoordinateType getLocationUTMCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.UTMCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().find_element_user(LOCATIONUTMCOORDINATE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LocationUTMCoordinate" element
     */
    public boolean isNilLocationUTMCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.UTMCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().find_element_user(LOCATIONUTMCOORDINATE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LocationUTMCoordinate" element
     */
    public int sizeOfLocationUTMCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONUTMCOORDINATE$22);
        }
    }
    
    /**
     * Sets array of all "LocationUTMCoordinate" element
     */
    public void setLocationUTMCoordinateArray(gov.niem.niem.niemCore.x20.UTMCoordinateType[] locationUTMCoordinateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationUTMCoordinateArray, LOCATIONUTMCOORDINATE$22);
        }
    }
    
    /**
     * Sets ith "LocationUTMCoordinate" element
     */
    public void setLocationUTMCoordinateArray(int i, gov.niem.niem.niemCore.x20.UTMCoordinateType locationUTMCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.UTMCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().find_element_user(LOCATIONUTMCOORDINATE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(locationUTMCoordinate);
        }
    }
    
    /**
     * Nils the ith "LocationUTMCoordinate" element
     */
    public void setNilLocationUTMCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.UTMCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().find_element_user(LOCATIONUTMCOORDINATE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LocationUTMCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.UTMCoordinateType insertNewLocationUTMCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.UTMCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().insert_element_user(LOCATIONUTMCOORDINATE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LocationUTMCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.UTMCoordinateType addNewLocationUTMCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.UTMCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().add_element_user(LOCATIONUTMCOORDINATE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "LocationUTMCoordinate" element
     */
    public void removeLocationUTMCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONUTMCOORDINATE$22, i);
        }
    }
}
