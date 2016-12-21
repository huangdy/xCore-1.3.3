/*
 * XML Type:  MeasureType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.MeasureType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML MeasureType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class MeasureTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.MeasureType
{
    private static final long serialVersionUID = 1L;
    
    public MeasureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREVALUE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasureValue");
    private static final org.apache.xmlbeans.QNameSet MEASUREVALUE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasureValue"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasurePointValue"),
    });
    private static final javax.xml.namespace.QName MEASUREUNITTEXT$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasureUnitText");
    private static final javax.xml.namespace.QName MEASURECATEGORYTEXT$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasureCategoryText");
    private static final javax.xml.namespace.QName MEASUREESTIMATEDINDICATOR$6 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "MeasureEstimatedIndicator");
    
    
    /**
     * Gets array of all "MeasureValue" elements
     */
    public org.apache.xmlbeans.XmlObject[] getMeasureValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEASUREVALUE$1, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MeasureValue" element
     */
    public org.apache.xmlbeans.XmlObject getMeasureValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(MEASUREVALUE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "MeasureValue" element
     */
    public int sizeOfMeasureValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREVALUE$1);
        }
    }
    
    /**
     * Sets array of all "MeasureValue" element
     */
    public void setMeasureValueArray(org.apache.xmlbeans.XmlObject[] measureValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(measureValueArray, MEASUREVALUE$0, MEASUREVALUE$1);
        }
    }
    
    /**
     * Sets ith "MeasureValue" element
     */
    public void setMeasureValueArray(int i, org.apache.xmlbeans.XmlObject measureValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(MEASUREVALUE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(measureValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MeasureValue" element
     */
    public org.apache.xmlbeans.XmlObject insertNewMeasureValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(MEASUREVALUE$1, MEASUREVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MeasureValue" element
     */
    public org.apache.xmlbeans.XmlObject addNewMeasureValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(MEASUREVALUE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "MeasureValue" element
     */
    public void removeMeasureValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREVALUE$1, i);
        }
    }
    
    /**
     * Gets array of all "MeasureUnitText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getMeasureUnitTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEASUREUNITTEXT$2, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MeasureUnitText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getMeasureUnitTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASUREUNITTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "MeasureUnitText" element
     */
    public boolean isNilMeasureUnitTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASUREUNITTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "MeasureUnitText" element
     */
    public int sizeOfMeasureUnitTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREUNITTEXT$2);
        }
    }
    
    /**
     * Sets array of all "MeasureUnitText" element
     */
    public void setMeasureUnitTextArray(gov.niem.niem.niemCore.x20.TextType[] measureUnitTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(measureUnitTextArray, MEASUREUNITTEXT$2);
        }
    }
    
    /**
     * Sets ith "MeasureUnitText" element
     */
    public void setMeasureUnitTextArray(int i, gov.niem.niem.niemCore.x20.TextType measureUnitText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASUREUNITTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(measureUnitText);
        }
    }
    
    /**
     * Nils the ith "MeasureUnitText" element
     */
    public void setNilMeasureUnitTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASUREUNITTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MeasureUnitText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewMeasureUnitText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(MEASUREUNITTEXT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MeasureUnitText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewMeasureUnitText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(MEASUREUNITTEXT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "MeasureUnitText" element
     */
    public void removeMeasureUnitText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREUNITTEXT$2, i);
        }
    }
    
    /**
     * Gets array of all "MeasureCategoryText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getMeasureCategoryTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEASURECATEGORYTEXT$4, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MeasureCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getMeasureCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASURECATEGORYTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "MeasureCategoryText" element
     */
    public boolean isNilMeasureCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASURECATEGORYTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "MeasureCategoryText" element
     */
    public int sizeOfMeasureCategoryTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASURECATEGORYTEXT$4);
        }
    }
    
    /**
     * Sets array of all "MeasureCategoryText" element
     */
    public void setMeasureCategoryTextArray(gov.niem.niem.niemCore.x20.TextType[] measureCategoryTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(measureCategoryTextArray, MEASURECATEGORYTEXT$4);
        }
    }
    
    /**
     * Sets ith "MeasureCategoryText" element
     */
    public void setMeasureCategoryTextArray(int i, gov.niem.niem.niemCore.x20.TextType measureCategoryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASURECATEGORYTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(measureCategoryText);
        }
    }
    
    /**
     * Nils the ith "MeasureCategoryText" element
     */
    public void setNilMeasureCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(MEASURECATEGORYTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MeasureCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewMeasureCategoryText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(MEASURECATEGORYTEXT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MeasureCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewMeasureCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(MEASURECATEGORYTEXT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "MeasureCategoryText" element
     */
    public void removeMeasureCategoryText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASURECATEGORYTEXT$4, i);
        }
    }
    
    /**
     * Gets array of all "MeasureEstimatedIndicator" elements
     */
    public gov.niem.niem.proxy.xsd.x20.Boolean[] getMeasureEstimatedIndicatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MEASUREESTIMATEDINDICATOR$6, targetList);
            gov.niem.niem.proxy.xsd.x20.Boolean[] result = new gov.niem.niem.proxy.xsd.x20.Boolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "MeasureEstimatedIndicator" element
     */
    public gov.niem.niem.proxy.xsd.x20.Boolean getMeasureEstimatedIndicatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(MEASUREESTIMATEDINDICATOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "MeasureEstimatedIndicator" element
     */
    public boolean isNilMeasureEstimatedIndicatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(MEASUREESTIMATEDINDICATOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "MeasureEstimatedIndicator" element
     */
    public int sizeOfMeasureEstimatedIndicatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREESTIMATEDINDICATOR$6);
        }
    }
    
    /**
     * Sets array of all "MeasureEstimatedIndicator" element
     */
    public void setMeasureEstimatedIndicatorArray(gov.niem.niem.proxy.xsd.x20.Boolean[] measureEstimatedIndicatorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(measureEstimatedIndicatorArray, MEASUREESTIMATEDINDICATOR$6);
        }
    }
    
    /**
     * Sets ith "MeasureEstimatedIndicator" element
     */
    public void setMeasureEstimatedIndicatorArray(int i, gov.niem.niem.proxy.xsd.x20.Boolean measureEstimatedIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(MEASUREESTIMATEDINDICATOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(measureEstimatedIndicator);
        }
    }
    
    /**
     * Nils the ith "MeasureEstimatedIndicator" element
     */
    public void setNilMeasureEstimatedIndicatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().find_element_user(MEASUREESTIMATEDINDICATOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "MeasureEstimatedIndicator" element
     */
    public gov.niem.niem.proxy.xsd.x20.Boolean insertNewMeasureEstimatedIndicator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().insert_element_user(MEASUREESTIMATEDINDICATOR$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "MeasureEstimatedIndicator" element
     */
    public gov.niem.niem.proxy.xsd.x20.Boolean addNewMeasureEstimatedIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.Boolean target = null;
            target = (gov.niem.niem.proxy.xsd.x20.Boolean)get_store().add_element_user(MEASUREESTIMATEDINDICATOR$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "MeasureEstimatedIndicator" element
     */
    public void removeMeasureEstimatedIndicator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREESTIMATEDINDICATOR$6, i);
        }
    }
}
