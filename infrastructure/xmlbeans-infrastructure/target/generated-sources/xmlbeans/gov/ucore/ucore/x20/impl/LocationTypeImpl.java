/*
 * XML Type:  LocationType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.LocationType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML LocationType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class LocationTypeImpl extends gov.ucore.ucore.x20.impl.ThingTypeImpl implements gov.ucore.ucore.x20.LocationType
{
    private static final long serialVersionUID = 1L;
    
    public LocationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CYBERADDRESS$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "CyberAddress");
    private static final javax.xml.namespace.QName GEOLOCATION$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "GeoLocation");
    private static final javax.xml.namespace.QName PHYSICALADDRESS$4 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PhysicalAddress");
    
    
    /**
     * Gets array of all "CyberAddress" elements
     */
    public gov.ucore.ucore.x20.CyberAddressType[] getCyberAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CYBERADDRESS$0, targetList);
            gov.ucore.ucore.x20.CyberAddressType[] result = new gov.ucore.ucore.x20.CyberAddressType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CyberAddress" element
     */
    public gov.ucore.ucore.x20.CyberAddressType getCyberAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.CyberAddressType target = null;
            target = (gov.ucore.ucore.x20.CyberAddressType)get_store().find_element_user(CYBERADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CyberAddress" element
     */
    public int sizeOfCyberAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CYBERADDRESS$0);
        }
    }
    
    /**
     * Sets array of all "CyberAddress" element
     */
    public void setCyberAddressArray(gov.ucore.ucore.x20.CyberAddressType[] cyberAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cyberAddressArray, CYBERADDRESS$0);
        }
    }
    
    /**
     * Sets ith "CyberAddress" element
     */
    public void setCyberAddressArray(int i, gov.ucore.ucore.x20.CyberAddressType cyberAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.CyberAddressType target = null;
            target = (gov.ucore.ucore.x20.CyberAddressType)get_store().find_element_user(CYBERADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cyberAddress);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CyberAddress" element
     */
    public gov.ucore.ucore.x20.CyberAddressType insertNewCyberAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.CyberAddressType target = null;
            target = (gov.ucore.ucore.x20.CyberAddressType)get_store().insert_element_user(CYBERADDRESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CyberAddress" element
     */
    public gov.ucore.ucore.x20.CyberAddressType addNewCyberAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.CyberAddressType target = null;
            target = (gov.ucore.ucore.x20.CyberAddressType)get_store().add_element_user(CYBERADDRESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "CyberAddress" element
     */
    public void removeCyberAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CYBERADDRESS$0, i);
        }
    }
    
    /**
     * Gets array of all "GeoLocation" elements
     */
    public gov.ucore.ucore.x20.GeoLocationType[] getGeoLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GEOLOCATION$2, targetList);
            gov.ucore.ucore.x20.GeoLocationType[] result = new gov.ucore.ucore.x20.GeoLocationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "GeoLocation" element
     */
    public gov.ucore.ucore.x20.GeoLocationType getGeoLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.GeoLocationType target = null;
            target = (gov.ucore.ucore.x20.GeoLocationType)get_store().find_element_user(GEOLOCATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "GeoLocation" element
     */
    public int sizeOfGeoLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOLOCATION$2);
        }
    }
    
    /**
     * Sets array of all "GeoLocation" element
     */
    public void setGeoLocationArray(gov.ucore.ucore.x20.GeoLocationType[] geoLocationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(geoLocationArray, GEOLOCATION$2);
        }
    }
    
    /**
     * Sets ith "GeoLocation" element
     */
    public void setGeoLocationArray(int i, gov.ucore.ucore.x20.GeoLocationType geoLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.GeoLocationType target = null;
            target = (gov.ucore.ucore.x20.GeoLocationType)get_store().find_element_user(GEOLOCATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geoLocation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GeoLocation" element
     */
    public gov.ucore.ucore.x20.GeoLocationType insertNewGeoLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.GeoLocationType target = null;
            target = (gov.ucore.ucore.x20.GeoLocationType)get_store().insert_element_user(GEOLOCATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GeoLocation" element
     */
    public gov.ucore.ucore.x20.GeoLocationType addNewGeoLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.GeoLocationType target = null;
            target = (gov.ucore.ucore.x20.GeoLocationType)get_store().add_element_user(GEOLOCATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "GeoLocation" element
     */
    public void removeGeoLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOLOCATION$2, i);
        }
    }
    
    /**
     * Gets array of all "PhysicalAddress" elements
     */
    public gov.ucore.ucore.x20.PhysicalAddressType[] getPhysicalAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PHYSICALADDRESS$4, targetList);
            gov.ucore.ucore.x20.PhysicalAddressType[] result = new gov.ucore.ucore.x20.PhysicalAddressType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PhysicalAddress" element
     */
    public gov.ucore.ucore.x20.PhysicalAddressType getPhysicalAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PhysicalAddressType target = null;
            target = (gov.ucore.ucore.x20.PhysicalAddressType)get_store().find_element_user(PHYSICALADDRESS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PhysicalAddress" element
     */
    public int sizeOfPhysicalAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHYSICALADDRESS$4);
        }
    }
    
    /**
     * Sets array of all "PhysicalAddress" element
     */
    public void setPhysicalAddressArray(gov.ucore.ucore.x20.PhysicalAddressType[] physicalAddressArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(physicalAddressArray, PHYSICALADDRESS$4);
        }
    }
    
    /**
     * Sets ith "PhysicalAddress" element
     */
    public void setPhysicalAddressArray(int i, gov.ucore.ucore.x20.PhysicalAddressType physicalAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PhysicalAddressType target = null;
            target = (gov.ucore.ucore.x20.PhysicalAddressType)get_store().find_element_user(PHYSICALADDRESS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(physicalAddress);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PhysicalAddress" element
     */
    public gov.ucore.ucore.x20.PhysicalAddressType insertNewPhysicalAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PhysicalAddressType target = null;
            target = (gov.ucore.ucore.x20.PhysicalAddressType)get_store().insert_element_user(PHYSICALADDRESS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PhysicalAddress" element
     */
    public gov.ucore.ucore.x20.PhysicalAddressType addNewPhysicalAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PhysicalAddressType target = null;
            target = (gov.ucore.ucore.x20.PhysicalAddressType)get_store().add_element_user(PHYSICALADDRESS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "PhysicalAddress" element
     */
    public void removePhysicalAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHYSICALADDRESS$4, i);
        }
    }
}
