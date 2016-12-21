/*
 * An XML document type.
 * Localname: Location
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.LocationDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one Location(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class LocationDocumentImpl extends gov.ucore.ucore.x20.impl.ThingAbstractDocumentImpl implements gov.ucore.ucore.x20.LocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATION$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Location");
    
    
    /**
     * Gets the "Location" element
     */
    public gov.ucore.ucore.x20.LocationType getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.LocationType target = null;
            target = (gov.ucore.ucore.x20.LocationType)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Location" element
     */
    public void setLocation(gov.ucore.ucore.x20.LocationType location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.LocationType target = null;
            target = (gov.ucore.ucore.x20.LocationType)get_store().find_element_user(LOCATION$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.LocationType)get_store().add_element_user(LOCATION$0);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "Location" element
     */
    public gov.ucore.ucore.x20.LocationType addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.LocationType target = null;
            target = (gov.ucore.ucore.x20.LocationType)get_store().add_element_user(LOCATION$0);
            return target;
        }
    }
}
