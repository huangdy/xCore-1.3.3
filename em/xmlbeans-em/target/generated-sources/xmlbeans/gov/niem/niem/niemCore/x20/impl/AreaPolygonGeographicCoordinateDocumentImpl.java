/*
 * An XML document type.
 * Localname: AreaPolygonGeographicCoordinate
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.AreaPolygonGeographicCoordinateDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one AreaPolygonGeographicCoordinate(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class AreaPolygonGeographicCoordinateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.AreaPolygonGeographicCoordinateDocument
{
    private static final long serialVersionUID = 1L;
    
    public AreaPolygonGeographicCoordinateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREAPOLYGONGEOGRAPHICCOORDINATE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AreaPolygonGeographicCoordinate");
    
    
    /**
     * Gets the "AreaPolygonGeographicCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType getAreaPolygonGeographicCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "AreaPolygonGeographicCoordinate" element
     */
    public boolean isNilAreaPolygonGeographicCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "AreaPolygonGeographicCoordinate" element
     */
    public void setAreaPolygonGeographicCoordinate(gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType areaPolygonGeographicCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().add_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$0);
            }
            target.set(areaPolygonGeographicCoordinate);
        }
    }
    
    /**
     * Appends and returns a new empty "AreaPolygonGeographicCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType addNewAreaPolygonGeographicCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().add_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$0);
            return target;
        }
    }
    
    /**
     * Nils the "AreaPolygonGeographicCoordinate" element
     */
    public void setNilAreaPolygonGeographicCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().add_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$0);
            }
            target.setNil();
        }
    }
}
