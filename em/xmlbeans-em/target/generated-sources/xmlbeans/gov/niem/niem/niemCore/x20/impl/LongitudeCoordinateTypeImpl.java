/*
 * XML Type:  LongitudeCoordinateType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LongitudeCoordinateType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML LongitudeCoordinateType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class LongitudeCoordinateTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.LongitudeCoordinateType
{
    private static final long serialVersionUID = 1L;
    
    public LongitudeCoordinateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LONGITUDEDEGREEVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LongitudeDegreeValue");
    private static final javax.xml.namespace.QName LONGITUDEMINUTEVALUE$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LongitudeMinuteValue");
    private static final javax.xml.namespace.QName LONGITUDESECONDVALUE$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LongitudeSecondValue");
    
    
    /**
     * Gets array of all "LongitudeDegreeValue" elements
     */
    public gov.niem.niem.niemCore.x20.LongitudeDegreeType[] getLongitudeDegreeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LONGITUDEDEGREEVALUE$0, targetList);
            gov.niem.niem.niemCore.x20.LongitudeDegreeType[] result = new gov.niem.niem.niemCore.x20.LongitudeDegreeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LongitudeDegreeValue" element
     */
    public gov.niem.niem.niemCore.x20.LongitudeDegreeType getLongitudeDegreeValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().find_element_user(LONGITUDEDEGREEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LongitudeDegreeValue" element
     */
    public boolean isNilLongitudeDegreeValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().find_element_user(LONGITUDEDEGREEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LongitudeDegreeValue" element
     */
    public int sizeOfLongitudeDegreeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LONGITUDEDEGREEVALUE$0);
        }
    }
    
    /**
     * Sets array of all "LongitudeDegreeValue" element
     */
    public void setLongitudeDegreeValueArray(gov.niem.niem.niemCore.x20.LongitudeDegreeType[] longitudeDegreeValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(longitudeDegreeValueArray, LONGITUDEDEGREEVALUE$0);
        }
    }
    
    /**
     * Sets ith "LongitudeDegreeValue" element
     */
    public void setLongitudeDegreeValueArray(int i, gov.niem.niem.niemCore.x20.LongitudeDegreeType longitudeDegreeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().find_element_user(LONGITUDEDEGREEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(longitudeDegreeValue);
        }
    }
    
    /**
     * Nils the ith "LongitudeDegreeValue" element
     */
    public void setNilLongitudeDegreeValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().find_element_user(LONGITUDEDEGREEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongitudeDegreeValue" element
     */
    public gov.niem.niem.niemCore.x20.LongitudeDegreeType insertNewLongitudeDegreeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().insert_element_user(LONGITUDEDEGREEVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LongitudeDegreeValue" element
     */
    public gov.niem.niem.niemCore.x20.LongitudeDegreeType addNewLongitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LongitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LongitudeDegreeType)get_store().add_element_user(LONGITUDEDEGREEVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "LongitudeDegreeValue" element
     */
    public void removeLongitudeDegreeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LONGITUDEDEGREEVALUE$0, i);
        }
    }
    
    /**
     * Gets array of all "LongitudeMinuteValue" elements
     */
    public gov.niem.niem.niemCore.x20.AngularMinuteType[] getLongitudeMinuteValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LONGITUDEMINUTEVALUE$2, targetList);
            gov.niem.niem.niemCore.x20.AngularMinuteType[] result = new gov.niem.niem.niemCore.x20.AngularMinuteType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LongitudeMinuteValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularMinuteType getLongitudeMinuteValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LONGITUDEMINUTEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LongitudeMinuteValue" element
     */
    public boolean isNilLongitudeMinuteValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LONGITUDEMINUTEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LongitudeMinuteValue" element
     */
    public int sizeOfLongitudeMinuteValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LONGITUDEMINUTEVALUE$2);
        }
    }
    
    /**
     * Sets array of all "LongitudeMinuteValue" element
     */
    public void setLongitudeMinuteValueArray(gov.niem.niem.niemCore.x20.AngularMinuteType[] longitudeMinuteValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(longitudeMinuteValueArray, LONGITUDEMINUTEVALUE$2);
        }
    }
    
    /**
     * Sets ith "LongitudeMinuteValue" element
     */
    public void setLongitudeMinuteValueArray(int i, gov.niem.niem.niemCore.x20.AngularMinuteType longitudeMinuteValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LONGITUDEMINUTEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(longitudeMinuteValue);
        }
    }
    
    /**
     * Nils the ith "LongitudeMinuteValue" element
     */
    public void setNilLongitudeMinuteValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LONGITUDEMINUTEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongitudeMinuteValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularMinuteType insertNewLongitudeMinuteValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().insert_element_user(LONGITUDEMINUTEVALUE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LongitudeMinuteValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularMinuteType addNewLongitudeMinuteValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().add_element_user(LONGITUDEMINUTEVALUE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "LongitudeMinuteValue" element
     */
    public void removeLongitudeMinuteValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LONGITUDEMINUTEVALUE$2, i);
        }
    }
    
    /**
     * Gets array of all "LongitudeSecondValue" elements
     */
    public gov.niem.niem.niemCore.x20.AngularSecondType[] getLongitudeSecondValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LONGITUDESECONDVALUE$4, targetList);
            gov.niem.niem.niemCore.x20.AngularSecondType[] result = new gov.niem.niem.niemCore.x20.AngularSecondType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LongitudeSecondValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularSecondType getLongitudeSecondValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LONGITUDESECONDVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LongitudeSecondValue" element
     */
    public boolean isNilLongitudeSecondValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LONGITUDESECONDVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LongitudeSecondValue" element
     */
    public int sizeOfLongitudeSecondValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LONGITUDESECONDVALUE$4);
        }
    }
    
    /**
     * Sets array of all "LongitudeSecondValue" element
     */
    public void setLongitudeSecondValueArray(gov.niem.niem.niemCore.x20.AngularSecondType[] longitudeSecondValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(longitudeSecondValueArray, LONGITUDESECONDVALUE$4);
        }
    }
    
    /**
     * Sets ith "LongitudeSecondValue" element
     */
    public void setLongitudeSecondValueArray(int i, gov.niem.niem.niemCore.x20.AngularSecondType longitudeSecondValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LONGITUDESECONDVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(longitudeSecondValue);
        }
    }
    
    /**
     * Nils the ith "LongitudeSecondValue" element
     */
    public void setNilLongitudeSecondValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LONGITUDESECONDVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongitudeSecondValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularSecondType insertNewLongitudeSecondValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().insert_element_user(LONGITUDESECONDVALUE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LongitudeSecondValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularSecondType addNewLongitudeSecondValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().add_element_user(LONGITUDESECONDVALUE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "LongitudeSecondValue" element
     */
    public void removeLongitudeSecondValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LONGITUDESECONDVALUE$4, i);
        }
    }
}
