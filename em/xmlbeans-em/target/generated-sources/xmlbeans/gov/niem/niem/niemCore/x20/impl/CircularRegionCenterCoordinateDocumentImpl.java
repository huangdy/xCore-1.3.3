/*
 * An XML document type.
 * Localname: CircularRegionCenterCoordinate
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.CircularRegionCenterCoordinateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one CircularRegionCenterCoordinate(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class CircularRegionCenterCoordinateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.CircularRegionCenterCoordinateDocument
{
    private static final long serialVersionUID = 1L;
    
    public CircularRegionCenterCoordinateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCULARREGIONCENTERCOORDINATE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CircularRegionCenterCoordinate");
    
    
    /**
     * Gets the "CircularRegionCenterCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType getCircularRegionCenterCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(CIRCULARREGIONCENTERCOORDINATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "CircularRegionCenterCoordinate" element
     */
    public boolean isNilCircularRegionCenterCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(CIRCULARREGIONCENTERCOORDINATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "CircularRegionCenterCoordinate" element
     */
    public void setCircularRegionCenterCoordinate(gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType circularRegionCenterCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(CIRCULARREGIONCENTERCOORDINATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().add_element_user(CIRCULARREGIONCENTERCOORDINATE$0);
            }
            target.set(circularRegionCenterCoordinate);
        }
    }
    
    /**
     * Appends and returns a new empty "CircularRegionCenterCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType addNewCircularRegionCenterCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().add_element_user(CIRCULARREGIONCENTERCOORDINATE$0);
            return target;
        }
    }
    
    /**
     * Nils the "CircularRegionCenterCoordinate" element
     */
    public void setNilCircularRegionCenterCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(CIRCULARREGIONCENTERCOORDINATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().add_element_user(CIRCULARREGIONCENTERCOORDINATE$0);
            }
            target.setNil();
        }
    }
}
