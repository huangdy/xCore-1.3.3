/*
 * An XML document type.
 * Localname: GeographicCoordinateLatitude
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.GeographicCoordinateLatitudeDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * A document containing one GeographicCoordinateLatitude(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public class GeographicCoordinateLatitudeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.niemCore.x20.GeographicCoordinateLatitudeDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeographicCoordinateLatitudeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICCOORDINATELATITUDE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "GeographicCoordinateLatitude");
    
    
    /**
     * Gets the "GeographicCoordinateLatitude" element
     */
    public gov.niem.niem.niemCore.x20.LatitudeCoordinateType getGeographicCoordinateLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELATITUDE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "GeographicCoordinateLatitude" element
     */
    public boolean isNilGeographicCoordinateLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELATITUDE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "GeographicCoordinateLatitude" element
     */
    public void setGeographicCoordinateLatitude(gov.niem.niem.niemCore.x20.LatitudeCoordinateType geographicCoordinateLatitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELATITUDE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().add_element_user(GEOGRAPHICCOORDINATELATITUDE$0);
            }
            target.set(geographicCoordinateLatitude);
        }
    }
    
    /**
     * Appends and returns a new empty "GeographicCoordinateLatitude" element
     */
    public gov.niem.niem.niemCore.x20.LatitudeCoordinateType addNewGeographicCoordinateLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().add_element_user(GEOGRAPHICCOORDINATELATITUDE$0);
            return target;
        }
    }
    
    /**
     * Nils the "GeographicCoordinateLatitude" element
     */
    public void setNilGeographicCoordinateLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELATITUDE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().add_element_user(GEOGRAPHICCOORDINATELATITUDE$0);
            }
            target.setNil();
        }
    }
}
