/*
 * XML Type:  AreaType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.AreaType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML AreaType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class AreaTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.AreaType
{
    private static final long serialVersionUID = 1L;
    
    public AreaTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AREAPOLYGONDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AreaPolygonDescriptionText");
    private static final javax.xml.namespace.QName AREAPOLYGONGEOGRAPHICCOORDINATE$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AreaPolygonGeographicCoordinate");
    private static final javax.xml.namespace.QName AREACIRCULARDESCRIPTIONTEXT$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AreaCircularDescriptionText");
    private static final javax.xml.namespace.QName AREACIRCULARREGION$6 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "AreaCircularRegion");
    
    
    /**
     * Gets array of all "AreaPolygonDescriptionText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getAreaPolygonDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AREAPOLYGONDESCRIPTIONTEXT$0, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AreaPolygonDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getAreaPolygonDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREAPOLYGONDESCRIPTIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AreaPolygonDescriptionText" element
     */
    public boolean isNilAreaPolygonDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREAPOLYGONDESCRIPTIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AreaPolygonDescriptionText" element
     */
    public int sizeOfAreaPolygonDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AREAPOLYGONDESCRIPTIONTEXT$0);
        }
    }
    
    /**
     * Sets array of all "AreaPolygonDescriptionText" element
     */
    public void setAreaPolygonDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] areaPolygonDescriptionTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(areaPolygonDescriptionTextArray, AREAPOLYGONDESCRIPTIONTEXT$0);
        }
    }
    
    /**
     * Sets ith "AreaPolygonDescriptionText" element
     */
    public void setAreaPolygonDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType areaPolygonDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREAPOLYGONDESCRIPTIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(areaPolygonDescriptionText);
        }
    }
    
    /**
     * Nils the ith "AreaPolygonDescriptionText" element
     */
    public void setNilAreaPolygonDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREAPOLYGONDESCRIPTIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AreaPolygonDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewAreaPolygonDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(AREAPOLYGONDESCRIPTIONTEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AreaPolygonDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewAreaPolygonDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(AREAPOLYGONDESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AreaPolygonDescriptionText" element
     */
    public void removeAreaPolygonDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AREAPOLYGONDESCRIPTIONTEXT$0, i);
        }
    }
    
    /**
     * Gets array of all "AreaPolygonGeographicCoordinate" elements
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[] getAreaPolygonGeographicCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AREAPOLYGONGEOGRAPHICCOORDINATE$2, targetList);
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[] result = new gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AreaPolygonGeographicCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType getAreaPolygonGeographicCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AreaPolygonGeographicCoordinate" element
     */
    public boolean isNilAreaPolygonGeographicCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AreaPolygonGeographicCoordinate" element
     */
    public int sizeOfAreaPolygonGeographicCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AREAPOLYGONGEOGRAPHICCOORDINATE$2);
        }
    }
    
    /**
     * Sets array of all "AreaPolygonGeographicCoordinate" element
     */
    public void setAreaPolygonGeographicCoordinateArray(gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[] areaPolygonGeographicCoordinateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(areaPolygonGeographicCoordinateArray, AREAPOLYGONGEOGRAPHICCOORDINATE$2);
        }
    }
    
    /**
     * Sets ith "AreaPolygonGeographicCoordinate" element
     */
    public void setAreaPolygonGeographicCoordinateArray(int i, gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType areaPolygonGeographicCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(areaPolygonGeographicCoordinate);
        }
    }
    
    /**
     * Nils the ith "AreaPolygonGeographicCoordinate" element
     */
    public void setNilAreaPolygonGeographicCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().find_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AreaPolygonGeographicCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType insertNewAreaPolygonGeographicCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().insert_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AreaPolygonGeographicCoordinate" element
     */
    public gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType addNewAreaPolygonGeographicCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType target = null;
            target = (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType)get_store().add_element_user(AREAPOLYGONGEOGRAPHICCOORDINATE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "AreaPolygonGeographicCoordinate" element
     */
    public void removeAreaPolygonGeographicCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AREAPOLYGONGEOGRAPHICCOORDINATE$2, i);
        }
    }
    
    /**
     * Gets array of all "AreaCircularDescriptionText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getAreaCircularDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AREACIRCULARDESCRIPTIONTEXT$4, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AreaCircularDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getAreaCircularDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREACIRCULARDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AreaCircularDescriptionText" element
     */
    public boolean isNilAreaCircularDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREACIRCULARDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AreaCircularDescriptionText" element
     */
    public int sizeOfAreaCircularDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AREACIRCULARDESCRIPTIONTEXT$4);
        }
    }
    
    /**
     * Sets array of all "AreaCircularDescriptionText" element
     */
    public void setAreaCircularDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] areaCircularDescriptionTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(areaCircularDescriptionTextArray, AREACIRCULARDESCRIPTIONTEXT$4);
        }
    }
    
    /**
     * Sets ith "AreaCircularDescriptionText" element
     */
    public void setAreaCircularDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType areaCircularDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREACIRCULARDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(areaCircularDescriptionText);
        }
    }
    
    /**
     * Nils the ith "AreaCircularDescriptionText" element
     */
    public void setNilAreaCircularDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(AREACIRCULARDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AreaCircularDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewAreaCircularDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(AREACIRCULARDESCRIPTIONTEXT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AreaCircularDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewAreaCircularDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(AREACIRCULARDESCRIPTIONTEXT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "AreaCircularDescriptionText" element
     */
    public void removeAreaCircularDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AREACIRCULARDESCRIPTIONTEXT$4, i);
        }
    }
    
    /**
     * Gets array of all "AreaCircularRegion" elements
     */
    public gov.niem.niem.niemCore.x20.CircularRegionType[] getAreaCircularRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AREACIRCULARREGION$6, targetList);
            gov.niem.niem.niemCore.x20.CircularRegionType[] result = new gov.niem.niem.niemCore.x20.CircularRegionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AreaCircularRegion" element
     */
    public gov.niem.niem.niemCore.x20.CircularRegionType getAreaCircularRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CircularRegionType target = null;
            target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().find_element_user(AREACIRCULARREGION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "AreaCircularRegion" element
     */
    public boolean isNilAreaCircularRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CircularRegionType target = null;
            target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().find_element_user(AREACIRCULARREGION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "AreaCircularRegion" element
     */
    public int sizeOfAreaCircularRegionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AREACIRCULARREGION$6);
        }
    }
    
    /**
     * Sets array of all "AreaCircularRegion" element
     */
    public void setAreaCircularRegionArray(gov.niem.niem.niemCore.x20.CircularRegionType[] areaCircularRegionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(areaCircularRegionArray, AREACIRCULARREGION$6);
        }
    }
    
    /**
     * Sets ith "AreaCircularRegion" element
     */
    public void setAreaCircularRegionArray(int i, gov.niem.niem.niemCore.x20.CircularRegionType areaCircularRegion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CircularRegionType target = null;
            target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().find_element_user(AREACIRCULARREGION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(areaCircularRegion);
        }
    }
    
    /**
     * Nils the ith "AreaCircularRegion" element
     */
    public void setNilAreaCircularRegionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CircularRegionType target = null;
            target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().find_element_user(AREACIRCULARREGION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AreaCircularRegion" element
     */
    public gov.niem.niem.niemCore.x20.CircularRegionType insertNewAreaCircularRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CircularRegionType target = null;
            target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().insert_element_user(AREACIRCULARREGION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AreaCircularRegion" element
     */
    public gov.niem.niem.niemCore.x20.CircularRegionType addNewAreaCircularRegion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CircularRegionType target = null;
            target = (gov.niem.niem.niemCore.x20.CircularRegionType)get_store().add_element_user(AREACIRCULARREGION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "AreaCircularRegion" element
     */
    public void removeAreaCircularRegion(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AREACIRCULARREGION$6, i);
        }
    }
}
