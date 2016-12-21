/*
 * An XML document type.
 * Localname: LocationCrossStreet
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationCrossStreetDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationCrossStreet(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationCrossStreetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationCrossStreetDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationCrossStreetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONCROSSSTREET$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationCrossStreet");
    
    
    /**
     * Gets the "LocationCrossStreet" element
     */
    public gov.niem.niem.niemCore.x20.CrossStreetType getLocationCrossStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CrossStreetType target = null;
            target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().find_element_user(LOCATIONCROSSSTREET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationCrossStreet" element
     */
    public boolean isNilLocationCrossStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CrossStreetType target = null;
            target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().find_element_user(LOCATIONCROSSSTREET$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationCrossStreet" element
     */
    public void setLocationCrossStreet(gov.niem.niem.niemCore.x20.CrossStreetType locationCrossStreet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CrossStreetType target = null;
            target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().find_element_user(LOCATIONCROSSSTREET$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().add_element_user(LOCATIONCROSSSTREET$0);
            }
            target.set(locationCrossStreet);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationCrossStreet" element
     */
    public gov.niem.niem.niemCore.x20.CrossStreetType addNewLocationCrossStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CrossStreetType target = null;
            target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().add_element_user(LOCATIONCROSSSTREET$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationCrossStreet" element
     */
    public void setNilLocationCrossStreet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CrossStreetType target = null;
            target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().find_element_user(LOCATIONCROSSSTREET$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.CrossStreetType)get_store().add_element_user(LOCATIONCROSSSTREET$0);
            }
            target.setNil();
        }
    }
}
