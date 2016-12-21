/*
 * XML Type:  RelativeLocationType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.RelativeLocationType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML RelativeLocationType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class RelativeLocationTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.RelativeLocationType
{
    private static final long serialVersionUID = 1L;
    
    public RelativeLocationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIVELOCATIONDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "RelativeLocationDescriptionText");
    private static final javax.xml.namespace.QName RELATIVELOCATIONDIRECTION$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "RelativeLocationDirection");
    private static final javax.xml.namespace.QName RELATIVELOCATIONDISTANCETEXT$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "RelativeLocationDistanceText");
    private static final javax.xml.namespace.QName RELATIVELOCATIONHEADINGVALUE$6 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "RelativeLocationHeadingValue");
    private static final javax.xml.namespace.QName RELATIVELOCATIONREFERENCEPOINT$8 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "RelativeLocationReferencePoint");
    
    
    /**
     * Gets array of all "RelativeLocationDescriptionText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getRelativeLocationDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIVELOCATIONDESCRIPTIONTEXT$0, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelativeLocationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getRelativeLocationDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "RelativeLocationDescriptionText" element
     */
    public boolean isNilRelativeLocationDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "RelativeLocationDescriptionText" element
     */
    public int sizeOfRelativeLocationDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIVELOCATIONDESCRIPTIONTEXT$0);
        }
    }
    
    /**
     * Sets array of all "RelativeLocationDescriptionText" element
     */
    public void setRelativeLocationDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] relativeLocationDescriptionTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relativeLocationDescriptionTextArray, RELATIVELOCATIONDESCRIPTIONTEXT$0);
        }
    }
    
    /**
     * Sets ith "RelativeLocationDescriptionText" element
     */
    public void setRelativeLocationDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType relativeLocationDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relativeLocationDescriptionText);
        }
    }
    
    /**
     * Nils the ith "RelativeLocationDescriptionText" element
     */
    public void setNilRelativeLocationDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelativeLocationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewRelativeLocationDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelativeLocationDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewRelativeLocationDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(RELATIVELOCATIONDESCRIPTIONTEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelativeLocationDescriptionText" element
     */
    public void removeRelativeLocationDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIVELOCATIONDESCRIPTIONTEXT$0, i);
        }
    }
    
    /**
     * Gets array of all "RelativeLocationDirection" elements
     */
    public org.apache.xmlbeans.XmlObject[] getRelativeLocationDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIVELOCATIONDIRECTION$2, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelativeLocationDirection" element
     */
    public org.apache.xmlbeans.XmlObject getRelativeLocationDirectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(RELATIVELOCATIONDIRECTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RelativeLocationDirection" element
     */
    public int sizeOfRelativeLocationDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIVELOCATIONDIRECTION$2);
        }
    }
    
    /**
     * Sets array of all "RelativeLocationDirection" element
     */
    public void setRelativeLocationDirectionArray(org.apache.xmlbeans.XmlObject[] relativeLocationDirectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relativeLocationDirectionArray, RELATIVELOCATIONDIRECTION$2);
        }
    }
    
    /**
     * Sets ith "RelativeLocationDirection" element
     */
    public void setRelativeLocationDirectionArray(int i, org.apache.xmlbeans.XmlObject relativeLocationDirection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(RELATIVELOCATIONDIRECTION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relativeLocationDirection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelativeLocationDirection" element
     */
    public org.apache.xmlbeans.XmlObject insertNewRelativeLocationDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(RELATIVELOCATIONDIRECTION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelativeLocationDirection" element
     */
    public org.apache.xmlbeans.XmlObject addNewRelativeLocationDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(RELATIVELOCATIONDIRECTION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelativeLocationDirection" element
     */
    public void removeRelativeLocationDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIVELOCATIONDIRECTION$2, i);
        }
    }
    
    /**
     * Gets array of all "RelativeLocationDistanceText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getRelativeLocationDistanceTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIVELOCATIONDISTANCETEXT$4, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelativeLocationDistanceText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getRelativeLocationDistanceTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(RELATIVELOCATIONDISTANCETEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "RelativeLocationDistanceText" element
     */
    public boolean isNilRelativeLocationDistanceTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(RELATIVELOCATIONDISTANCETEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "RelativeLocationDistanceText" element
     */
    public int sizeOfRelativeLocationDistanceTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIVELOCATIONDISTANCETEXT$4);
        }
    }
    
    /**
     * Sets array of all "RelativeLocationDistanceText" element
     */
    public void setRelativeLocationDistanceTextArray(gov.niem.niem.niemCore.x20.TextType[] relativeLocationDistanceTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relativeLocationDistanceTextArray, RELATIVELOCATIONDISTANCETEXT$4);
        }
    }
    
    /**
     * Sets ith "RelativeLocationDistanceText" element
     */
    public void setRelativeLocationDistanceTextArray(int i, gov.niem.niem.niemCore.x20.TextType relativeLocationDistanceText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(RELATIVELOCATIONDISTANCETEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relativeLocationDistanceText);
        }
    }
    
    /**
     * Nils the ith "RelativeLocationDistanceText" element
     */
    public void setNilRelativeLocationDistanceTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(RELATIVELOCATIONDISTANCETEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelativeLocationDistanceText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewRelativeLocationDistanceText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(RELATIVELOCATIONDISTANCETEXT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelativeLocationDistanceText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewRelativeLocationDistanceText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(RELATIVELOCATIONDISTANCETEXT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelativeLocationDistanceText" element
     */
    public void removeRelativeLocationDistanceText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIVELOCATIONDISTANCETEXT$4, i);
        }
    }
    
    /**
     * Gets array of all "RelativeLocationHeadingValue" elements
     */
    public gov.niem.niem.niemCore.x20.RelativeLocationHeadingType[] getRelativeLocationHeadingValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIVELOCATIONHEADINGVALUE$6, targetList);
            gov.niem.niem.niemCore.x20.RelativeLocationHeadingType[] result = new gov.niem.niem.niemCore.x20.RelativeLocationHeadingType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelativeLocationHeadingValue" element
     */
    public gov.niem.niem.niemCore.x20.RelativeLocationHeadingType getRelativeLocationHeadingValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationHeadingType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().find_element_user(RELATIVELOCATIONHEADINGVALUE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "RelativeLocationHeadingValue" element
     */
    public boolean isNilRelativeLocationHeadingValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationHeadingType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().find_element_user(RELATIVELOCATIONHEADINGVALUE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "RelativeLocationHeadingValue" element
     */
    public int sizeOfRelativeLocationHeadingValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIVELOCATIONHEADINGVALUE$6);
        }
    }
    
    /**
     * Sets array of all "RelativeLocationHeadingValue" element
     */
    public void setRelativeLocationHeadingValueArray(gov.niem.niem.niemCore.x20.RelativeLocationHeadingType[] relativeLocationHeadingValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relativeLocationHeadingValueArray, RELATIVELOCATIONHEADINGVALUE$6);
        }
    }
    
    /**
     * Sets ith "RelativeLocationHeadingValue" element
     */
    public void setRelativeLocationHeadingValueArray(int i, gov.niem.niem.niemCore.x20.RelativeLocationHeadingType relativeLocationHeadingValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationHeadingType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().find_element_user(RELATIVELOCATIONHEADINGVALUE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relativeLocationHeadingValue);
        }
    }
    
    /**
     * Nils the ith "RelativeLocationHeadingValue" element
     */
    public void setNilRelativeLocationHeadingValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationHeadingType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().find_element_user(RELATIVELOCATIONHEADINGVALUE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelativeLocationHeadingValue" element
     */
    public gov.niem.niem.niemCore.x20.RelativeLocationHeadingType insertNewRelativeLocationHeadingValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationHeadingType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().insert_element_user(RELATIVELOCATIONHEADINGVALUE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelativeLocationHeadingValue" element
     */
    public gov.niem.niem.niemCore.x20.RelativeLocationHeadingType addNewRelativeLocationHeadingValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.RelativeLocationHeadingType target = null;
            target = (gov.niem.niem.niemCore.x20.RelativeLocationHeadingType)get_store().add_element_user(RELATIVELOCATIONHEADINGVALUE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelativeLocationHeadingValue" element
     */
    public void removeRelativeLocationHeadingValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIVELOCATIONHEADINGVALUE$6, i);
        }
    }
    
    /**
     * Gets array of all "RelativeLocationReferencePoint" elements
     */
    public gov.niem.niem.niemCore.x20.LocationType[] getRelativeLocationReferencePointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIVELOCATIONREFERENCEPOINT$8, targetList);
            gov.niem.niem.niemCore.x20.LocationType[] result = new gov.niem.niem.niemCore.x20.LocationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelativeLocationReferencePoint" element
     */
    public gov.niem.niem.niemCore.x20.LocationType getRelativeLocationReferencePointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(RELATIVELOCATIONREFERENCEPOINT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "RelativeLocationReferencePoint" element
     */
    public boolean isNilRelativeLocationReferencePointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(RELATIVELOCATIONREFERENCEPOINT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "RelativeLocationReferencePoint" element
     */
    public int sizeOfRelativeLocationReferencePointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIVELOCATIONREFERENCEPOINT$8);
        }
    }
    
    /**
     * Sets array of all "RelativeLocationReferencePoint" element
     */
    public void setRelativeLocationReferencePointArray(gov.niem.niem.niemCore.x20.LocationType[] relativeLocationReferencePointArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relativeLocationReferencePointArray, RELATIVELOCATIONREFERENCEPOINT$8);
        }
    }
    
    /**
     * Sets ith "RelativeLocationReferencePoint" element
     */
    public void setRelativeLocationReferencePointArray(int i, gov.niem.niem.niemCore.x20.LocationType relativeLocationReferencePoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(RELATIVELOCATIONREFERENCEPOINT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relativeLocationReferencePoint);
        }
    }
    
    /**
     * Nils the ith "RelativeLocationReferencePoint" element
     */
    public void setNilRelativeLocationReferencePointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().find_element_user(RELATIVELOCATIONREFERENCEPOINT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelativeLocationReferencePoint" element
     */
    public gov.niem.niem.niemCore.x20.LocationType insertNewRelativeLocationReferencePoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().insert_element_user(RELATIVELOCATIONREFERENCEPOINT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelativeLocationReferencePoint" element
     */
    public gov.niem.niem.niemCore.x20.LocationType addNewRelativeLocationReferencePoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.LocationType target = null;
            target = (gov.niem.niem.niemCore.x20.LocationType)get_store().add_element_user(RELATIVELOCATIONREFERENCEPOINT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelativeLocationReferencePoint" element
     */
    public void removeRelativeLocationReferencePoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIVELOCATIONREFERENCEPOINT$8, i);
        }
    }
}
