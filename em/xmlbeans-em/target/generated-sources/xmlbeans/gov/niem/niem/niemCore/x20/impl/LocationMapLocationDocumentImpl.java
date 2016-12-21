/*
 * An XML document type.
 * Localname: LocationMapLocation
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationMapLocationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationMapLocation(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationMapLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationMapLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationMapLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONMAPLOCATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationMapLocation");
    
    
    /**
     * Gets the "LocationMapLocation" element
     */
    public gov.niem.niem.niemCore.x20.MapLocationType getLocationMapLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MapLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().find_element_user(LOCATIONMAPLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationMapLocation" element
     */
    public boolean isNilLocationMapLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MapLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().find_element_user(LOCATIONMAPLOCATION$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationMapLocation" element
     */
    public void setLocationMapLocation(gov.niem.niem.niemCore.x20.MapLocationType locationMapLocation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MapLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().find_element_user(LOCATIONMAPLOCATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().add_element_user(LOCATIONMAPLOCATION$0);
            }
            target.set(locationMapLocation);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationMapLocation" element
     */
    public gov.niem.niem.niemCore.x20.MapLocationType addNewLocationMapLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MapLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().add_element_user(LOCATIONMAPLOCATION$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationMapLocation" element
     */
    public void setNilLocationMapLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MapLocationType target = null;
            target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().find_element_user(LOCATIONMAPLOCATION$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.MapLocationType)get_store().add_element_user(LOCATIONMAPLOCATION$0);
            }
            target.setNil();
        }
    }
}
