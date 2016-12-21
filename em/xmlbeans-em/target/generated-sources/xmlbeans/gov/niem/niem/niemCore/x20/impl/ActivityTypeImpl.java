/*
 * XML Type:  ActivityType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ActivityType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML ActivityType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class ActivityTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.ActivityType
{
    private static final long serialVersionUID = 1L;
    
    public ActivityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACTIVITYIDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityIdentification");
    private static final javax.xml.namespace.QName ACTIVITYCATEGORYTEXT$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityCategoryText");
    private static final javax.xml.namespace.QName ACTIVITYDATEREPRESENTATION$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityDateRepresentation");
    private static final org.apache.xmlbeans.QNameSet ACTIVITYDATEREPRESENTATION$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityDateRepresentation"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityDate"),
    });
    private static final javax.xml.namespace.QName ACTIVITYDESCRIPTIONTEXT$6 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityDescriptionText");
    private static final javax.xml.namespace.QName ACTIVITYNAME$8 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityName");
    private static final javax.xml.namespace.QName ACTIVITYSTATUS$10 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityStatus");
    private static final javax.xml.namespace.QName ACTIVITYREASONTEXT$12 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityReasonText");
    private static final javax.xml.namespace.QName ACTIVITYDISPOSITION$14 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ActivityDisposition");
    
    
    /**
     * Gets array of all "ActivityIdentification" elements
     */
    public gov.niem.niem.niemCore.x20.IdentificationType[] getActivityIdentificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYIDENTIFICATION$0, targetList);
            gov.niem.niem.niemCore.x20.IdentificationType[] result = new gov.niem.niem.niemCore.x20.IdentificationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ActivityIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType getActivityIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ACTIVITYIDENTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ActivityIdentification" element
     */
    public boolean isNilActivityIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ACTIVITYIDENTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ActivityIdentification" element
     */
    public int sizeOfActivityIdentificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYIDENTIFICATION$0);
        }
    }
    
    /**
     * Sets array of all "ActivityIdentification" element
     */
    public void setActivityIdentificationArray(gov.niem.niem.niemCore.x20.IdentificationType[] activityIdentificationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityIdentificationArray, ACTIVITYIDENTIFICATION$0);
        }
    }
    
    /**
     * Sets ith "ActivityIdentification" element
     */
    public void setActivityIdentificationArray(int i, gov.niem.niem.niemCore.x20.IdentificationType activityIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ACTIVITYIDENTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityIdentification);
        }
    }
    
    /**
     * Nils the ith "ActivityIdentification" element
     */
    public void setNilActivityIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(ACTIVITYIDENTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType insertNewActivityIdentification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().insert_element_user(ACTIVITYIDENTIFICATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType addNewActivityIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(ACTIVITYIDENTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ActivityIdentification" element
     */
    public void removeActivityIdentification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYIDENTIFICATION$0, i);
        }
    }
    
    /**
     * Gets array of all "ActivityCategoryText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getActivityCategoryTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYCATEGORYTEXT$2, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ActivityCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getActivityCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYCATEGORYTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ActivityCategoryText" element
     */
    public boolean isNilActivityCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYCATEGORYTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ActivityCategoryText" element
     */
    public int sizeOfActivityCategoryTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYCATEGORYTEXT$2);
        }
    }
    
    /**
     * Sets array of all "ActivityCategoryText" element
     */
    public void setActivityCategoryTextArray(gov.niem.niem.niemCore.x20.TextType[] activityCategoryTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityCategoryTextArray, ACTIVITYCATEGORYTEXT$2);
        }
    }
    
    /**
     * Sets ith "ActivityCategoryText" element
     */
    public void setActivityCategoryTextArray(int i, gov.niem.niem.niemCore.x20.TextType activityCategoryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYCATEGORYTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityCategoryText);
        }
    }
    
    /**
     * Nils the ith "ActivityCategoryText" element
     */
    public void setNilActivityCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYCATEGORYTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewActivityCategoryText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(ACTIVITYCATEGORYTEXT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewActivityCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYCATEGORYTEXT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ActivityCategoryText" element
     */
    public void removeActivityCategoryText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYCATEGORYTEXT$2, i);
        }
    }
    
    /**
     * Gets array of all "ActivityDateRepresentation" elements
     */
    public org.apache.xmlbeans.XmlObject[] getActivityDateRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYDATEREPRESENTATION$5, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ActivityDateRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject getActivityDateRepresentationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ACTIVITYDATEREPRESENTATION$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ActivityDateRepresentation" element
     */
    public int sizeOfActivityDateRepresentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYDATEREPRESENTATION$5);
        }
    }
    
    /**
     * Sets array of all "ActivityDateRepresentation" element
     */
    public void setActivityDateRepresentationArray(org.apache.xmlbeans.XmlObject[] activityDateRepresentationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityDateRepresentationArray, ACTIVITYDATEREPRESENTATION$4, ACTIVITYDATEREPRESENTATION$5);
        }
    }
    
    /**
     * Sets ith "ActivityDateRepresentation" element
     */
    public void setActivityDateRepresentationArray(int i, org.apache.xmlbeans.XmlObject activityDateRepresentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ACTIVITYDATEREPRESENTATION$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityDateRepresentation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityDateRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject insertNewActivityDateRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(ACTIVITYDATEREPRESENTATION$5, ACTIVITYDATEREPRESENTATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityDateRepresentation" element
     */
    public org.apache.xmlbeans.XmlObject addNewActivityDateRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ACTIVITYDATEREPRESENTATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ActivityDateRepresentation" element
     */
    public void removeActivityDateRepresentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYDATEREPRESENTATION$5, i);
        }
    }
    
    /**
     * Gets array of all "ActivityDescriptionText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getActivityDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYDESCRIPTIONTEXT$6, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ActivityDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getActivityDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYDESCRIPTIONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ActivityDescriptionText" element
     */
    public boolean isNilActivityDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYDESCRIPTIONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ActivityDescriptionText" element
     */
    public int sizeOfActivityDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYDESCRIPTIONTEXT$6);
        }
    }
    
    /**
     * Sets array of all "ActivityDescriptionText" element
     */
    public void setActivityDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] activityDescriptionTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityDescriptionTextArray, ACTIVITYDESCRIPTIONTEXT$6);
        }
    }
    
    /**
     * Sets ith "ActivityDescriptionText" element
     */
    public void setActivityDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType activityDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYDESCRIPTIONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityDescriptionText);
        }
    }
    
    /**
     * Nils the ith "ActivityDescriptionText" element
     */
    public void setNilActivityDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYDESCRIPTIONTEXT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewActivityDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(ACTIVITYDESCRIPTIONTEXT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewActivityDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYDESCRIPTIONTEXT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "ActivityDescriptionText" element
     */
    public void removeActivityDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYDESCRIPTIONTEXT$6, i);
        }
    }
    
    /**
     * Gets array of all "ActivityName" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getActivityNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYNAME$8, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ActivityName" element
     */
    public gov.niem.niem.niemCore.x20.TextType getActivityNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYNAME$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ActivityName" element
     */
    public boolean isNilActivityNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYNAME$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ActivityName" element
     */
    public int sizeOfActivityNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYNAME$8);
        }
    }
    
    /**
     * Sets array of all "ActivityName" element
     */
    public void setActivityNameArray(gov.niem.niem.niemCore.x20.TextType[] activityNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityNameArray, ACTIVITYNAME$8);
        }
    }
    
    /**
     * Sets ith "ActivityName" element
     */
    public void setActivityNameArray(int i, gov.niem.niem.niemCore.x20.TextType activityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYNAME$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityName);
        }
    }
    
    /**
     * Nils the ith "ActivityName" element
     */
    public void setNilActivityNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYNAME$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityName" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewActivityName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(ACTIVITYNAME$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityName" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewActivityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYNAME$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "ActivityName" element
     */
    public void removeActivityName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYNAME$8, i);
        }
    }
    
    /**
     * Gets array of all "ActivityStatus" elements
     */
    public gov.niem.niem.niemCore.x20.StatusType[] getActivityStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYSTATUS$10, targetList);
            gov.niem.niem.niemCore.x20.StatusType[] result = new gov.niem.niem.niemCore.x20.StatusType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ActivityStatus" element
     */
    public gov.niem.niem.niemCore.x20.StatusType getActivityStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ACTIVITYSTATUS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ActivityStatus" element
     */
    public boolean isNilActivityStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ACTIVITYSTATUS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ActivityStatus" element
     */
    public int sizeOfActivityStatusArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYSTATUS$10);
        }
    }
    
    /**
     * Sets array of all "ActivityStatus" element
     */
    public void setActivityStatusArray(gov.niem.niem.niemCore.x20.StatusType[] activityStatusArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityStatusArray, ACTIVITYSTATUS$10);
        }
    }
    
    /**
     * Sets ith "ActivityStatus" element
     */
    public void setActivityStatusArray(int i, gov.niem.niem.niemCore.x20.StatusType activityStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ACTIVITYSTATUS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityStatus);
        }
    }
    
    /**
     * Nils the ith "ActivityStatus" element
     */
    public void setNilActivityStatusArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().find_element_user(ACTIVITYSTATUS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityStatus" element
     */
    public gov.niem.niem.niemCore.x20.StatusType insertNewActivityStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().insert_element_user(ACTIVITYSTATUS$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityStatus" element
     */
    public gov.niem.niem.niemCore.x20.StatusType addNewActivityStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.StatusType target = null;
            target = (gov.niem.niem.niemCore.x20.StatusType)get_store().add_element_user(ACTIVITYSTATUS$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "ActivityStatus" element
     */
    public void removeActivityStatus(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYSTATUS$10, i);
        }
    }
    
    /**
     * Gets array of all "ActivityReasonText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getActivityReasonTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYREASONTEXT$12, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ActivityReasonText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getActivityReasonTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYREASONTEXT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ActivityReasonText" element
     */
    public boolean isNilActivityReasonTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYREASONTEXT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ActivityReasonText" element
     */
    public int sizeOfActivityReasonTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYREASONTEXT$12);
        }
    }
    
    /**
     * Sets array of all "ActivityReasonText" element
     */
    public void setActivityReasonTextArray(gov.niem.niem.niemCore.x20.TextType[] activityReasonTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityReasonTextArray, ACTIVITYREASONTEXT$12);
        }
    }
    
    /**
     * Sets ith "ActivityReasonText" element
     */
    public void setActivityReasonTextArray(int i, gov.niem.niem.niemCore.x20.TextType activityReasonText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYREASONTEXT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityReasonText);
        }
    }
    
    /**
     * Nils the ith "ActivityReasonText" element
     */
    public void setNilActivityReasonTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(ACTIVITYREASONTEXT$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityReasonText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewActivityReasonText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(ACTIVITYREASONTEXT$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityReasonText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewActivityReasonText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(ACTIVITYREASONTEXT$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "ActivityReasonText" element
     */
    public void removeActivityReasonText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYREASONTEXT$12, i);
        }
    }
    
    /**
     * Gets array of all "ActivityDisposition" elements
     */
    public gov.niem.niem.niemCore.x20.DispositionType[] getActivityDispositionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYDISPOSITION$14, targetList);
            gov.niem.niem.niemCore.x20.DispositionType[] result = new gov.niem.niem.niemCore.x20.DispositionType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ActivityDisposition" element
     */
    public gov.niem.niem.niemCore.x20.DispositionType getActivityDispositionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DispositionType target = null;
            target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().find_element_user(ACTIVITYDISPOSITION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ActivityDisposition" element
     */
    public boolean isNilActivityDispositionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DispositionType target = null;
            target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().find_element_user(ACTIVITYDISPOSITION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ActivityDisposition" element
     */
    public int sizeOfActivityDispositionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYDISPOSITION$14);
        }
    }
    
    /**
     * Sets array of all "ActivityDisposition" element
     */
    public void setActivityDispositionArray(gov.niem.niem.niemCore.x20.DispositionType[] activityDispositionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityDispositionArray, ACTIVITYDISPOSITION$14);
        }
    }
    
    /**
     * Sets ith "ActivityDisposition" element
     */
    public void setActivityDispositionArray(int i, gov.niem.niem.niemCore.x20.DispositionType activityDisposition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DispositionType target = null;
            target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().find_element_user(ACTIVITYDISPOSITION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityDisposition);
        }
    }
    
    /**
     * Nils the ith "ActivityDisposition" element
     */
    public void setNilActivityDispositionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DispositionType target = null;
            target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().find_element_user(ACTIVITYDISPOSITION$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ActivityDisposition" element
     */
    public gov.niem.niem.niemCore.x20.DispositionType insertNewActivityDisposition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DispositionType target = null;
            target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().insert_element_user(ACTIVITYDISPOSITION$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ActivityDisposition" element
     */
    public gov.niem.niem.niemCore.x20.DispositionType addNewActivityDisposition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DispositionType target = null;
            target = (gov.niem.niem.niemCore.x20.DispositionType)get_store().add_element_user(ACTIVITYDISPOSITION$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "ActivityDisposition" element
     */
    public void removeActivityDisposition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYDISPOSITION$14, i);
        }
    }
}
