/*
 * XML Type:  IdentificationType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.IdentificationType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML IdentificationType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class IdentificationTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.IdentificationType
{
    private static final long serialVersionUID = 1L;
    
    public IdentificationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFICATIONID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationID");
    private static final javax.xml.namespace.QName IDENTIFICATIONCATEGORY$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationCategory");
    private static final org.apache.xmlbeans.QNameSet IDENTIFICATIONCATEGORY$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationCategoryText"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationCategory"),
    });
    private static final javax.xml.namespace.QName IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationCategoryDescriptionText");
    private static final javax.xml.namespace.QName IDENTIFICATIONEFFECTIVEDATE$6 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationEffectiveDate");
    private static final javax.xml.namespace.QName IDENTIFICATIONEXPIRATIONDATE$8 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationExpirationDate");
    private static final javax.xml.namespace.QName IDENTIFICATIONJURISDICTION$10 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationJurisdiction");
    private static final org.apache.xmlbeans.QNameSet IDENTIFICATIONJURISDICTION$11 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationJurisdictionText"),
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "IdentificationJurisdiction"),
    });
    
    
    /**
     * Gets array of all "IdentificationID" elements
     */
    public gov.niem.niem.proxy.xsd.x20.String[] getIdentificationIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFICATIONID$0, targetList);
            gov.niem.niem.proxy.xsd.x20.String[] result = new gov.niem.niem.proxy.xsd.x20.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdentificationID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getIdentificationIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(IDENTIFICATIONID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "IdentificationID" element
     */
    public boolean isNilIdentificationIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(IDENTIFICATIONID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "IdentificationID" element
     */
    public int sizeOfIdentificationIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFICATIONID$0);
        }
    }
    
    /**
     * Sets array of all "IdentificationID" element
     */
    public void setIdentificationIDArray(gov.niem.niem.proxy.xsd.x20.String[] identificationIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identificationIDArray, IDENTIFICATIONID$0);
        }
    }
    
    /**
     * Sets ith "IdentificationID" element
     */
    public void setIdentificationIDArray(int i, gov.niem.niem.proxy.xsd.x20.String identificationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(IDENTIFICATIONID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identificationID);
        }
    }
    
    /**
     * Nils the ith "IdentificationID" element
     */
    public void setNilIdentificationIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(IDENTIFICATIONID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentificationID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String insertNewIdentificationID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(IDENTIFICATIONID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentificationID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewIdentificationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(IDENTIFICATIONID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdentificationID" element
     */
    public void removeIdentificationID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFICATIONID$0, i);
        }
    }
    
    /**
     * Gets array of all "IdentificationCategory" elements
     */
    public org.apache.xmlbeans.XmlObject[] getIdentificationCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFICATIONCATEGORY$3, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdentificationCategory" element
     */
    public org.apache.xmlbeans.XmlObject getIdentificationCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IDENTIFICATIONCATEGORY$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IdentificationCategory" element
     */
    public int sizeOfIdentificationCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFICATIONCATEGORY$3);
        }
    }
    
    /**
     * Sets array of all "IdentificationCategory" element
     */
    public void setIdentificationCategoryArray(org.apache.xmlbeans.XmlObject[] identificationCategoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identificationCategoryArray, IDENTIFICATIONCATEGORY$2, IDENTIFICATIONCATEGORY$3);
        }
    }
    
    /**
     * Sets ith "IdentificationCategory" element
     */
    public void setIdentificationCategoryArray(int i, org.apache.xmlbeans.XmlObject identificationCategory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IDENTIFICATIONCATEGORY$3, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identificationCategory);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentificationCategory" element
     */
    public org.apache.xmlbeans.XmlObject insertNewIdentificationCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(IDENTIFICATIONCATEGORY$3, IDENTIFICATIONCATEGORY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentificationCategory" element
     */
    public org.apache.xmlbeans.XmlObject addNewIdentificationCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IDENTIFICATIONCATEGORY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdentificationCategory" element
     */
    public void removeIdentificationCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFICATIONCATEGORY$3, i);
        }
    }
    
    /**
     * Gets array of all "IdentificationCategoryDescriptionText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getIdentificationCategoryDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$4, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdentificationCategoryDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getIdentificationCategoryDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "IdentificationCategoryDescriptionText" element
     */
    public boolean isNilIdentificationCategoryDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "IdentificationCategoryDescriptionText" element
     */
    public int sizeOfIdentificationCategoryDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$4);
        }
    }
    
    /**
     * Sets array of all "IdentificationCategoryDescriptionText" element
     */
    public void setIdentificationCategoryDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] identificationCategoryDescriptionTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identificationCategoryDescriptionTextArray, IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$4);
        }
    }
    
    /**
     * Sets ith "IdentificationCategoryDescriptionText" element
     */
    public void setIdentificationCategoryDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType identificationCategoryDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identificationCategoryDescriptionText);
        }
    }
    
    /**
     * Nils the ith "IdentificationCategoryDescriptionText" element
     */
    public void setNilIdentificationCategoryDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentificationCategoryDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewIdentificationCategoryDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentificationCategoryDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewIdentificationCategoryDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdentificationCategoryDescriptionText" element
     */
    public void removeIdentificationCategoryDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFICATIONCATEGORYDESCRIPTIONTEXT$4, i);
        }
    }
    
    /**
     * Gets array of all "IdentificationEffectiveDate" elements
     */
    public gov.niem.niem.niemCore.x20.DateType[] getIdentificationEffectiveDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFICATIONEFFECTIVEDATE$6, targetList);
            gov.niem.niem.niemCore.x20.DateType[] result = new gov.niem.niem.niemCore.x20.DateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdentificationEffectiveDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType getIdentificationEffectiveDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEFFECTIVEDATE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "IdentificationEffectiveDate" element
     */
    public boolean isNilIdentificationEffectiveDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEFFECTIVEDATE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "IdentificationEffectiveDate" element
     */
    public int sizeOfIdentificationEffectiveDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFICATIONEFFECTIVEDATE$6);
        }
    }
    
    /**
     * Sets array of all "IdentificationEffectiveDate" element
     */
    public void setIdentificationEffectiveDateArray(gov.niem.niem.niemCore.x20.DateType[] identificationEffectiveDateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identificationEffectiveDateArray, IDENTIFICATIONEFFECTIVEDATE$6);
        }
    }
    
    /**
     * Sets ith "IdentificationEffectiveDate" element
     */
    public void setIdentificationEffectiveDateArray(int i, gov.niem.niem.niemCore.x20.DateType identificationEffectiveDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEFFECTIVEDATE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identificationEffectiveDate);
        }
    }
    
    /**
     * Nils the ith "IdentificationEffectiveDate" element
     */
    public void setNilIdentificationEffectiveDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEFFECTIVEDATE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentificationEffectiveDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType insertNewIdentificationEffectiveDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().insert_element_user(IDENTIFICATIONEFFECTIVEDATE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentificationEffectiveDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType addNewIdentificationEffectiveDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(IDENTIFICATIONEFFECTIVEDATE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdentificationEffectiveDate" element
     */
    public void removeIdentificationEffectiveDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFICATIONEFFECTIVEDATE$6, i);
        }
    }
    
    /**
     * Gets array of all "IdentificationExpirationDate" elements
     */
    public gov.niem.niem.niemCore.x20.DateType[] getIdentificationExpirationDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFICATIONEXPIRATIONDATE$8, targetList);
            gov.niem.niem.niemCore.x20.DateType[] result = new gov.niem.niem.niemCore.x20.DateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdentificationExpirationDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType getIdentificationExpirationDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEXPIRATIONDATE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "IdentificationExpirationDate" element
     */
    public boolean isNilIdentificationExpirationDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEXPIRATIONDATE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "IdentificationExpirationDate" element
     */
    public int sizeOfIdentificationExpirationDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFICATIONEXPIRATIONDATE$8);
        }
    }
    
    /**
     * Sets array of all "IdentificationExpirationDate" element
     */
    public void setIdentificationExpirationDateArray(gov.niem.niem.niemCore.x20.DateType[] identificationExpirationDateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identificationExpirationDateArray, IDENTIFICATIONEXPIRATIONDATE$8);
        }
    }
    
    /**
     * Sets ith "IdentificationExpirationDate" element
     */
    public void setIdentificationExpirationDateArray(int i, gov.niem.niem.niemCore.x20.DateType identificationExpirationDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEXPIRATIONDATE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identificationExpirationDate);
        }
    }
    
    /**
     * Nils the ith "IdentificationExpirationDate" element
     */
    public void setNilIdentificationExpirationDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(IDENTIFICATIONEXPIRATIONDATE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentificationExpirationDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType insertNewIdentificationExpirationDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().insert_element_user(IDENTIFICATIONEXPIRATIONDATE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentificationExpirationDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType addNewIdentificationExpirationDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(IDENTIFICATIONEXPIRATIONDATE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdentificationExpirationDate" element
     */
    public void removeIdentificationExpirationDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFICATIONEXPIRATIONDATE$8, i);
        }
    }
    
    /**
     * Gets array of all "IdentificationJurisdiction" elements
     */
    public org.apache.xmlbeans.XmlObject[] getIdentificationJurisdictionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFICATIONJURISDICTION$11, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IdentificationJurisdiction" element
     */
    public org.apache.xmlbeans.XmlObject getIdentificationJurisdictionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IDENTIFICATIONJURISDICTION$11, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IdentificationJurisdiction" element
     */
    public int sizeOfIdentificationJurisdictionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFICATIONJURISDICTION$11);
        }
    }
    
    /**
     * Sets array of all "IdentificationJurisdiction" element
     */
    public void setIdentificationJurisdictionArray(org.apache.xmlbeans.XmlObject[] identificationJurisdictionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identificationJurisdictionArray, IDENTIFICATIONJURISDICTION$10, IDENTIFICATIONJURISDICTION$11);
        }
    }
    
    /**
     * Sets ith "IdentificationJurisdiction" element
     */
    public void setIdentificationJurisdictionArray(int i, org.apache.xmlbeans.XmlObject identificationJurisdiction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IDENTIFICATIONJURISDICTION$11, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identificationJurisdiction);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IdentificationJurisdiction" element
     */
    public org.apache.xmlbeans.XmlObject insertNewIdentificationJurisdiction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(IDENTIFICATIONJURISDICTION$11, IDENTIFICATIONJURISDICTION$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IdentificationJurisdiction" element
     */
    public org.apache.xmlbeans.XmlObject addNewIdentificationJurisdiction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IDENTIFICATIONJURISDICTION$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "IdentificationJurisdiction" element
     */
    public void removeIdentificationJurisdiction(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFICATIONJURISDICTION$11, i);
        }
    }
}
