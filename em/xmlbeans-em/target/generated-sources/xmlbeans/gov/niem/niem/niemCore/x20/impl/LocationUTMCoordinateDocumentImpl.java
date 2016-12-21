/*
 * An XML document type.
 * Localname: LocationUTMCoordinate
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationUTMCoordinateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationUTMCoordinate(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationUTMCoordinateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationUTMCoordinateDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationUTMCoordinateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONUTMCOORDINATE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationUTMCoordinate");
    
    
    /**
     * Gets the "LocationUTMCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.UTMCoordinateType getLocationUTMCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.UTMCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().find_element_user(LOCATIONUTMCOORDINATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationUTMCoordinate" element
     */
    public boolean isNilLocationUTMCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.UTMCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().find_element_user(LOCATIONUTMCOORDINATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationUTMCoordinate" element
     */
    public void setLocationUTMCoordinate(gov.niem.niem.niemCore.x20.UTMCoordinateType locationUTMCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.UTMCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().find_element_user(LOCATIONUTMCOORDINATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().add_element_user(LOCATIONUTMCOORDINATE$0);
            }
            target.set(locationUTMCoordinate);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationUTMCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.UTMCoordinateType addNewLocationUTMCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.UTMCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().add_element_user(LOCATIONUTMCOORDINATE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationUTMCoordinate" element
     */
    public void setNilLocationUTMCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.UTMCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().find_element_user(LOCATIONUTMCOORDINATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.UTMCoordinateType)get_store().add_element_user(LOCATIONUTMCOORDINATE$0);
            }
            target.setNil();
        }
    }
}
