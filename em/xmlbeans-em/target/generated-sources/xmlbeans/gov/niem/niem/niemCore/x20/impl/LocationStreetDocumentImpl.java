/*
 * An XML document type.
 * Localname: LocationStreet
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationStreetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationStreet(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationStreetDocumentImpl extends gov.niem.niem.niemCore.x20.impl.AddressDeliveryPointDocumentImpl implements gov.niem.niem.niemCore.x20.LocationStreetDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationStreetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONSTREET$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationStreet");
    
    
    /**
     * Gets the "LocationStreet" element
     */
    public gov.niem.niem.niemCore.x20.StreetType getLocationStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StreetType target = null;
            target = (gov.niem.niem.niemCore.x20.StreetType)get_store().find_element_user(LOCATIONSTREET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationStreet" element
     */
    public boolean isNilLocationStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StreetType target = null;
            target = (gov.niem.niem.niemCore.x20.StreetType)get_store().find_element_user(LOCATIONSTREET$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationStreet" element
     */
    public void setLocationStreet(gov.niem.niem.niemCore.x20.StreetType locationStreet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StreetType target = null;
            target = (gov.niem.niem.niemCore.x20.StreetType)get_store().find_element_user(LOCATIONSTREET$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.StreetType)get_store().add_element_user(LOCATIONSTREET$0);
            }
            target.set(locationStreet);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationStreet" element
     */
    public gov.niem.niem.niemCore.x20.StreetType addNewLocationStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StreetType target = null;
            target = (gov.niem.niem.niemCore.x20.StreetType)get_store().add_element_user(LOCATIONSTREET$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationStreet" element
     */
    public void setNilLocationStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StreetType target = null;
            target = (gov.niem.niem.niemCore.x20.StreetType)get_store().find_element_user(LOCATIONSTREET$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.StreetType)get_store().add_element_user(LOCATIONSTREET$0);
            }
            target.setNil();
        }
    }
}
