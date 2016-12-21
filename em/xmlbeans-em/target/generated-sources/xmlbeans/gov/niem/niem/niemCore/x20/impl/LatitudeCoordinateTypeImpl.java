/*
 * XML Type:  LatitudeCoordinateType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LatitudeCoordinateType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML LatitudeCoordinateType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class LatitudeCoordinateTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.LatitudeCoordinateType
{
    private static final long serialVersionUID = 1L;
    
    public LatitudeCoordinateTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LATITUDEDEGREEVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LatitudeDegreeValue");
    private static final javax.xml.namespace.QName LATITUDEMINUTEVALUE$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LatitudeMinuteValue");
    private static final javax.xml.namespace.QName LATITUDESECONDVALUE$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "LatitudeSecondValue");
    
    
    /**
     * Gets array of all "LatitudeDegreeValue" elements
     */
    public gov.niem.niem.niemCore.x20.LatitudeDegreeType[] getLatitudeDegreeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LATITUDEDEGREEVALUE$0, targetList);
            gov.niem.niem.niemCore.x20.LatitudeDegreeType[] result = new gov.niem.niem.niemCore.x20.LatitudeDegreeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LatitudeDegreeValue" element
     */
    public gov.niem.niem.niemCore.x20.LatitudeDegreeType getLatitudeDegreeValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().find_element_user(LATITUDEDEGREEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LatitudeDegreeValue" element
     */
    public boolean isNilLatitudeDegreeValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().find_element_user(LATITUDEDEGREEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LatitudeDegreeValue" element
     */
    public int sizeOfLatitudeDegreeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATITUDEDEGREEVALUE$0);
        }
    }
    
    /**
     * Sets array of all "LatitudeDegreeValue" element
     */
    public void setLatitudeDegreeValueArray(gov.niem.niem.niemCore.x20.LatitudeDegreeType[] latitudeDegreeValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(latitudeDegreeValueArray, LATITUDEDEGREEVALUE$0);
        }
    }
    
    /**
     * Sets ith "LatitudeDegreeValue" element
     */
    public void setLatitudeDegreeValueArray(int i, gov.niem.niem.niemCore.x20.LatitudeDegreeType latitudeDegreeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().find_element_user(LATITUDEDEGREEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(latitudeDegreeValue);
        }
    }
    
    /**
     * Nils the ith "LatitudeDegreeValue" element
     */
    public void setNilLatitudeDegreeValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().find_element_user(LATITUDEDEGREEVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LatitudeDegreeValue" element
     */
    public gov.niem.niem.niemCore.x20.LatitudeDegreeType insertNewLatitudeDegreeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().insert_element_user(LATITUDEDEGREEVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LatitudeDegreeValue" element
     */
    public gov.niem.niem.niemCore.x20.LatitudeDegreeType addNewLatitudeDegreeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LatitudeDegreeType target = null;
            target = (gov.niem.niem.niemCore.x20.LatitudeDegreeType)get_store().add_element_user(LATITUDEDEGREEVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "LatitudeDegreeValue" element
     */
    public void removeLatitudeDegreeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATITUDEDEGREEVALUE$0, i);
        }
    }
    
    /**
     * Gets array of all "LatitudeMinuteValue" elements
     */
    public gov.niem.niem.niemCore.x20.AngularMinuteType[] getLatitudeMinuteValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LATITUDEMINUTEVALUE$2, targetList);
            gov.niem.niem.niemCore.x20.AngularMinuteType[] result = new gov.niem.niem.niemCore.x20.AngularMinuteType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LatitudeMinuteValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularMinuteType getLatitudeMinuteValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LATITUDEMINUTEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LatitudeMinuteValue" element
     */
    public boolean isNilLatitudeMinuteValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LATITUDEMINUTEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LatitudeMinuteValue" element
     */
    public int sizeOfLatitudeMinuteValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATITUDEMINUTEVALUE$2);
        }
    }
    
    /**
     * Sets array of all "LatitudeMinuteValue" element
     */
    public void setLatitudeMinuteValueArray(gov.niem.niem.niemCore.x20.AngularMinuteType[] latitudeMinuteValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(latitudeMinuteValueArray, LATITUDEMINUTEVALUE$2);
        }
    }
    
    /**
     * Sets ith "LatitudeMinuteValue" element
     */
    public void setLatitudeMinuteValueArray(int i, gov.niem.niem.niemCore.x20.AngularMinuteType latitudeMinuteValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LATITUDEMINUTEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(latitudeMinuteValue);
        }
    }
    
    /**
     * Nils the ith "LatitudeMinuteValue" element
     */
    public void setNilLatitudeMinuteValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().find_element_user(LATITUDEMINUTEVALUE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LatitudeMinuteValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularMinuteType insertNewLatitudeMinuteValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().insert_element_user(LATITUDEMINUTEVALUE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LatitudeMinuteValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularMinuteType addNewLatitudeMinuteValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularMinuteType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularMinuteType)get_store().add_element_user(LATITUDEMINUTEVALUE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "LatitudeMinuteValue" element
     */
    public void removeLatitudeMinuteValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATITUDEMINUTEVALUE$2, i);
        }
    }
    
    /**
     * Gets array of all "LatitudeSecondValue" elements
     */
    public gov.niem.niem.niemCore.x20.AngularSecondType[] getLatitudeSecondValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LATITUDESECONDVALUE$4, targetList);
            gov.niem.niem.niemCore.x20.AngularSecondType[] result = new gov.niem.niem.niemCore.x20.AngularSecondType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "LatitudeSecondValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularSecondType getLatitudeSecondValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LATITUDESECONDVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "LatitudeSecondValue" element
     */
    public boolean isNilLatitudeSecondValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LATITUDESECONDVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "LatitudeSecondValue" element
     */
    public int sizeOfLatitudeSecondValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATITUDESECONDVALUE$4);
        }
    }
    
    /**
     * Sets array of all "LatitudeSecondValue" element
     */
    public void setLatitudeSecondValueArray(gov.niem.niem.niemCore.x20.AngularSecondType[] latitudeSecondValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(latitudeSecondValueArray, LATITUDESECONDVALUE$4);
        }
    }
    
    /**
     * Sets ith "LatitudeSecondValue" element
     */
    public void setLatitudeSecondValueArray(int i, gov.niem.niem.niemCore.x20.AngularSecondType latitudeSecondValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LATITUDESECONDVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(latitudeSecondValue);
        }
    }
    
    /**
     * Nils the ith "LatitudeSecondValue" element
     */
    public void setNilLatitudeSecondValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().find_element_user(LATITUDESECONDVALUE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LatitudeSecondValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularSecondType insertNewLatitudeSecondValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().insert_element_user(LATITUDESECONDVALUE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LatitudeSecondValue" element
     */
    public gov.niem.niem.niemCore.x20.AngularSecondType addNewLatitudeSecondValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.AngularSecondType target = null;
            target = (gov.niem.niem.niemCore.x20.AngularSecondType)get_store().add_element_user(LATITUDESECONDVALUE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "LatitudeSecondValue" element
     */
    public void removeLatitudeSecondValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATITUDESECONDVALUE$4, i);
        }
    }
}
