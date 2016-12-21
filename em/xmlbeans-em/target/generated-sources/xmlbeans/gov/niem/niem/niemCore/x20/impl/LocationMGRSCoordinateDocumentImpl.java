/*
 * An XML document type.
 * Localname: LocationMGRSCoordinate
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationMGRSCoordinateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one LocationMGRSCoordinate(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class LocationMGRSCoordinateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.LocationMGRSCoordinateDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocationMGRSCoordinateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCATIONMGRSCOORDINATE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LocationMGRSCoordinate");
    
    
    /**
     * Gets the "LocationMGRSCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.MGRSCoordinateType getLocationMGRSCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MGRSCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().find_element_user(LOCATIONMGRSCOORDINATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "LocationMGRSCoordinate" element
     */
    public boolean isNilLocationMGRSCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MGRSCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().find_element_user(LOCATIONMGRSCOORDINATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "LocationMGRSCoordinate" element
     */
    public void setLocationMGRSCoordinate(gov.niem.niem.niemCore.x20.MGRSCoordinateType locationMGRSCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MGRSCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().find_element_user(LOCATIONMGRSCOORDINATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().add_element_user(LOCATIONMGRSCOORDINATE$0);
            }
            target.set(locationMGRSCoordinate);
        }
    }
    
    /**
     * Appends and returns a new empty "LocationMGRSCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.MGRSCoordinateType addNewLocationMGRSCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MGRSCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().add_element_user(LOCATIONMGRSCOORDINATE$0);
            return target;
        }
    }
    
    /**
     * Nils the "LocationMGRSCoordinate" element
     */
    public void setNilLocationMGRSCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.MGRSCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().find_element_user(LOCATIONMGRSCOORDINATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.MGRSCoordinateType)get_store().add_element_user(LOCATIONMGRSCOORDINATE$0);
            }
            target.setNil();
        }
    }
}
