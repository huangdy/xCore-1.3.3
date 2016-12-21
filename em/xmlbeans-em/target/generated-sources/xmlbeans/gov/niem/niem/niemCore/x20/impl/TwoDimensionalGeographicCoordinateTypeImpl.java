/*
 * XML Type:  TwoDimensionalGeographicCoordinateType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML TwoDimensionalGeographicCoordinateType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class TwoDimensionalGeographicCoordinateTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType
{
    private static final long serialVersionUID = 1L;
    
    public TwoDimensionalGeographicCoordinateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOGRAPHICDATUMCODE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "GeographicDatumCode");
    private static final javax.xml.namespace.QName GEOGRAPHICCOORDINATELATITUDE$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "GeographicCoordinateLatitude");
    private static final javax.xml.namespace.QName GEOGRAPHICCOORDINATELONGITUDE$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "GeographicCoordinateLongitude");
    
    
    /**
     * Gets the "GeographicDatumCode" element
     */
    public gov.niem.niem.nga.x20.DatumCodeType getGeographicDatumCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.nga.x20.DatumCodeType target = null;
            target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().find_element_user(GEOGRAPHICDATUMCODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "GeographicDatumCode" element
     */
    public boolean isNilGeographicDatumCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.nga.x20.DatumCodeType target = null;
            target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().find_element_user(GEOGRAPHICDATUMCODE$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "GeographicDatumCode" element
     */
    public boolean isSetGeographicDatumCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOGRAPHICDATUMCODE$0) != 0;
        }
    }
    
    /**
     * Sets the "GeographicDatumCode" element
     */
    public void setGeographicDatumCode(gov.niem.niem.nga.x20.DatumCodeType geographicDatumCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.nga.x20.DatumCodeType target = null;
            target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().find_element_user(GEOGRAPHICDATUMCODE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().add_element_user(GEOGRAPHICDATUMCODE$0);
            }
            target.set(geographicDatumCode);
        }
    }
    
    /**
     * Appends and returns a new empty "GeographicDatumCode" element
     */
    public gov.niem.niem.nga.x20.DatumCodeType addNewGeographicDatumCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.nga.x20.DatumCodeType target = null;
            target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().add_element_user(GEOGRAPHICDATUMCODE$0);
            return target;
        }
    }
    
    /**
     * Nils the "GeographicDatumCode" element
     */
    public void setNilGeographicDatumCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.nga.x20.DatumCodeType target = null;
            target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().find_element_user(GEOGRAPHICDATUMCODE$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.nga.x20.DatumCodeType)get_store().add_element_user(GEOGRAPHICDATUMCODE$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "GeographicDatumCode" element
     */
    public void unsetGeographicDatumCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOGRAPHICDATUMCODE$0, 0);
        }
    }
    
    /**
     * Gets the "GeographicCoordinateLatitude" element
     */
    public gov.niem.niem.niemCore.x20.LatitudeCoordinateType getGeographicCoordinateLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELATITUDE$2, 0);
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
            target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELATITUDE$2, 0);
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
            target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELATITUDE$2, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().add_element_user(GEOGRAPHICCOORDINATELATITUDE$2);
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
            target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().add_element_user(GEOGRAPHICCOORDINATELATITUDE$2);
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
            target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELATITUDE$2, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LatitudeCoordinateType)get_store().add_element_user(GEOGRAPHICCOORDINATELATITUDE$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "GeographicCoordinateLongitude" element
     */
    public gov.niem.niem.niemCore.x20.LongitudeCoordinateType getGeographicCoordinateLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELONGITUDE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "GeographicCoordinateLongitude" element
     */
    public boolean isNilGeographicCoordinateLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELONGITUDE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "GeographicCoordinateLongitude" element
     */
    public void setGeographicCoordinateLongitude(gov.niem.niem.niemCore.x20.LongitudeCoordinateType geographicCoordinateLongitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELONGITUDE$4, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LongitudeCoordinateType)get_store().add_element_user(GEOGRAPHICCOORDINATELONGITUDE$4);
            }
            target.set(geographicCoordinateLongitude);
        }
    }
    
    /**
     * Appends and returns a new empty "GeographicCoordinateLongitude" element
     */
    public gov.niem.niem.niemCore.x20.LongitudeCoordinateType addNewGeographicCoordinateLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeCoordinateType)get_store().add_element_user(GEOGRAPHICCOORDINATELONGITUDE$4);
            return target;
        }
    }
    
    /**
     * Nils the "GeographicCoordinateLongitude" element
     */
    public void setNilGeographicCoordinateLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeCoordinateType)get_store().find_element_user(GEOGRAPHICCOORDINATELONGITUDE$4, 0);
            if (target == null)
            {
                target = (gov.niem.niem.niemCore.x20.LongitudeCoordinateType)get_store().add_element_user(GEOGRAPHICCOORDINATELONGITUDE$4);
            }
            target.setNil();
        }
    }
}
