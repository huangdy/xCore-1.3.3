/*
 * An XML document type.
 * Localname: LocationTwoDimensionalGeographicCoordinate
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationTwoDimensionalGeographicCoordinateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationTwoDimensionalGeographicCoordinate(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationTwoDimensionalGeographicCoordinateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationTwoDimensionalGeographicCoordinateDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationTwoDimensionalGeographicCoordinateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationTwoDimensionalGeographicCoordinate");
    
    
    /**
     * Gets the "LocationTwoDimensionalGeographicCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType getLocationTwoDimensionalGeographicCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationTwoDimensionalGeographicCoordinate" element
     */
    public boolean isNilLocationTwoDimensionalGeographicCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationTwoDimensionalGeographicCoordinate" element
     */
    public void setLocationTwoDimensionalGeographicCoordinate(gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType locationTwoDimensionalGeographicCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().add_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$0);
            }
            target.set(locationTwoDimensionalGeographicCoordinate);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationTwoDimensionalGeographicCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType addNewLocationTwoDimensionalGeographicCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().add_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationTwoDimensionalGeographicCoordinate" element
     */
    public void setNilLocationTwoDimensionalGeographicCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().add_element_user(LOCATIONTWODIMENSIONALGEOGRAPHICCOORDINATE$0);
            }
            target.setNil();
        }
    }
}
