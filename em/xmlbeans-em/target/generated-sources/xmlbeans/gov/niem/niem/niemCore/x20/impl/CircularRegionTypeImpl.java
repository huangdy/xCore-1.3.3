/*
 * XML Type:  CircularRegionType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.CircularRegionType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML CircularRegionType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class CircularRegionTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.CircularRegionType
{
    private static final long serialVersionUID = 1L;
    
    public CircularRegionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCULARREGIONCENTERCOORDINATE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CircularRegionCenterCoordinate");
    private static final javax.xml.namespace.QName CIRCULARREGIONRADIUSLENGTHMEASURE$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "CircularRegionRadiusLengthMeasure");
    
    
    /**
     * Gets array of all "CircularRegionCenterCoordinate" elements
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[] getCircularRegionCenterCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CIRCULARREGIONCENTERCOORDINATE$0, targetList);
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[] result = new gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CircularRegionCenterCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType getCircularRegionCenterCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(CIRCULARREGIONCENTERCOORDINATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "CircularRegionCenterCoordinate" element
     */
    public boolean isNilCircularRegionCenterCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(CIRCULARREGIONCENTERCOORDINATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "CircularRegionCenterCoordinate" element
     */
    public int sizeOfCircularRegionCenterCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIRCULARREGIONCENTERCOORDINATE$0);
        }
    }
    
    /**
     * Sets array of all "CircularRegionCenterCoordinate" element
     */
    public void setCircularRegionCenterCoordinateArray(gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[] circularRegionCenterCoordinateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(circularRegionCenterCoordinateArray, CIRCULARREGIONCENTERCOORDINATE$0);
        }
    }
    
    /**
     * Sets ith "CircularRegionCenterCoordinate" element
     */
    public void setCircularRegionCenterCoordinateArray(int i, gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType circularRegionCenterCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(CIRCULARREGIONCENTERCOORDINATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(circularRegionCenterCoordinate);
        }
    }
    
    /**
     * Nils the ith "CircularRegionCenterCoordinate" element
     */
    public void setNilCircularRegionCenterCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(CIRCULARREGIONCENTERCOORDINATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CircularRegionCenterCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType insertNewCircularRegionCenterCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().insert_element_user(CIRCULARREGIONCENTERCOORDINATE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CircularRegionCenterCoordinate" element
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
     * Removes the ith "CircularRegionCenterCoordinate" element
     */
    public void removeCircularRegionCenterCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIRCULARREGIONCENTERCOORDINATE$0, i);
        }
    }
    
    /**
     * Gets array of all "CircularRegionRadiusLengthMeasure" elements
     */
    public gov.niem.niem.niemCore.x20.LengthMeasureType[] getCircularRegionRadiusLengthMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CIRCULARREGIONRADIUSLENGTHMEASURE$2, targetList);
            gov.niem.niem.niemCore.x20.LengthMeasureType[] result = new gov.niem.niem.niemCore.x20.LengthMeasureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CircularRegionRadiusLengthMeasure" element
     */
    public gov.niem.niem.niemCore.x20.LengthMeasureType getCircularRegionRadiusLengthMeasureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LengthMeasureType target = null;
            target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().find_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "CircularRegionRadiusLengthMeasure" element
     */
    public boolean isNilCircularRegionRadiusLengthMeasureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LengthMeasureType target = null;
            target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().find_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "CircularRegionRadiusLengthMeasure" element
     */
    public int sizeOfCircularRegionRadiusLengthMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIRCULARREGIONRADIUSLENGTHMEASURE$2);
        }
    }
    
    /**
     * Sets array of all "CircularRegionRadiusLengthMeasure" element
     */
    public void setCircularRegionRadiusLengthMeasureArray(gov.niem.niem.niemCore.x20.LengthMeasureType[] circularRegionRadiusLengthMeasureArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(circularRegionRadiusLengthMeasureArray, CIRCULARREGIONRADIUSLENGTHMEASURE$2);
        }
    }
    
    /**
     * Sets ith "CircularRegionRadiusLengthMeasure" element
     */
    public void setCircularRegionRadiusLengthMeasureArray(int i, gov.niem.niem.niemCore.x20.LengthMeasureType circularRegionRadiusLengthMeasure)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LengthMeasureType target = null;
            target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().find_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(circularRegionRadiusLengthMeasure);
        }
    }
    
    /**
     * Nils the ith "CircularRegionRadiusLengthMeasure" element
     */
    public void setNilCircularRegionRadiusLengthMeasureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LengthMeasureType target = null;
            target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().find_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CircularRegionRadiusLengthMeasure" element
     */
    public gov.niem.niem.niemCore.x20.LengthMeasureType insertNewCircularRegionRadiusLengthMeasure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LengthMeasureType target = null;
            target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().insert_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CircularRegionRadiusLengthMeasure" element
     */
    public gov.niem.niem.niemCore.x20.LengthMeasureType addNewCircularRegionRadiusLengthMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LengthMeasureType target = null;
            target = (gov.niem.niem.niemCore.x20.LengthMeasureType)get_store().add_element_user(CIRCULARREGIONRADIUSLENGTHMEASURE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "CircularRegionRadiusLengthMeasure" element
     */
    public void removeCircularRegionRadiusLengthMeasure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIRCULARREGIONRADIUSLENGTHMEASURE$2, i);
        }
    }
}
