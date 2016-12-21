/*
 * XML Type:  LocationType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:RM:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLRM1.LocationType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLRM1.impl;
/**
 * An XML LocationType(@urn:oasis:names:tc:emergency:EDXL:RM:1.0).
 *
 * This is a complex type.
 */
public class LocationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.oasisNamesTcEmergencyEDXLRM1.LocationType
{
    private static final long serialVersionUID = 1L;
    
    public LocationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONDESCRIPTION$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "LocationDescription");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "Address");
    private static final javax.xml.namespace.QName TARGETAREA$4 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:RM:1.0", "TargetArea");
    
    
    /**
     * Gets the "LocationDescription" element
     */
    public java.lang.String getLocationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONDESCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocationDescription" element
     */
    public x0.oasisNamesTcEmergencyEDXLRM1.LocationDescriptionType xgetLocationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.LocationDescriptionType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.LocationDescriptionType)get_store().find_element_user(LOCATIONDESCRIPTION$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "LocationDescription" element
     */
    public boolean isSetLocationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATIONDESCRIPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "LocationDescription" element
     */
    public void setLocationDescription(java.lang.String locationDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONDESCRIPTION$0);
            }
            target.setStringValue(locationDescription);
        }
    }
    
    /**
     * Sets (as xml) the "LocationDescription" element
     */
    public void xsetLocationDescription(x0.oasisNamesTcEmergencyEDXLRM1.LocationDescriptionType locationDescription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.oasisNamesTcEmergencyEDXLRM1.LocationDescriptionType target = null;
            target = (x0.oasisNamesTcEmergencyEDXLRM1.LocationDescriptionType)get_store().find_element_user(LOCATIONDESCRIPTION$0, 0);
            if (target == null)
            {
                target = (x0.oasisNamesTcEmergencyEDXLRM1.LocationDescriptionType)get_store().add_element_user(LOCATIONDESCRIPTION$0);
            }
            target.set(locationDescription);
        }
    }
    
    /**
     * Unsets the "LocationDescription" element
     */
    public void unsetLocationDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATIONDESCRIPTION$0, 0);
        }
    }
    
    /**
     * Gets the "Address" element
     */
    public oasisNamesTcCiqXal3.AddressType getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType target = null;
            target = (oasisNamesTcCiqXal3.AddressType)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                return null;
            }
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
    public void setAddress(oasisNamesTcCiqXal3.AddressType address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType target = null;
            target = (oasisNamesTcCiqXal3.AddressType)get_store().find_element_user(ADDRESS$2, 0);
            if (target == null)
            {
                target = (oasisNamesTcCiqXal3.AddressType)get_store().add_element_user(ADDRESS$2);
            }
            target.set(address);
        }
    }
    
    /**
     * Appends and returns a new empty "Address" element
     */
    public oasisNamesTcCiqXal3.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            oasisNamesTcCiqXal3.AddressType target = null;
            target = (oasisNamesTcCiqXal3.AddressType)get_store().add_element_user(ADDRESS$2);
            return target;
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
     * Gets the "TargetArea" element
     */
    public x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType getTargetArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType)get_store().find_element_user(TARGETAREA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TargetArea" element
     */
    public boolean isSetTargetArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETAREA$4) != 0;
        }
    }
    
    /**
     * Sets the "TargetArea" element
     */
    public void setTargetArea(x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType targetArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType)get_store().find_element_user(TARGETAREA$4, 0);
            if (target == null)
            {
                target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType)get_store().add_element_user(TARGETAREA$4);
            }
            target.set(targetArea);
        }
    }
    
    /**
     * Appends and returns a new empty "TargetArea" element
     */
    public x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType addNewTargetArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType)get_store().add_element_user(TARGETAREA$4);
            return target;
        }
    }
    
    /**
     * Unsets the "TargetArea" element
     */
    public void unsetTargetArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETAREA$4, 0);
        }
    }
}
