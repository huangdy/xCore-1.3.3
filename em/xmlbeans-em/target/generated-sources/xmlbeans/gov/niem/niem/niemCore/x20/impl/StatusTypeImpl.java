/*
 * XML Type:  StatusType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.StatusType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML StatusType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class StatusTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.StatusType
{
    private static final long serialVersionUID = 1L;
    
    public StatusTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUSDATE$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "StatusDate");
    private static final javax.xml.namespace.QName STATUSDESCRIPTIONTEXT$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "StatusDescriptionText");
    private static final javax.xml.namespace.QName STATUSISSUERIDENTIFICATION$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "StatusIssuerIdentification");
    
    
    /**
     * Gets array of all "StatusDate" elements
     */
    public gov.niem.niem.niemCore.x20.DateType[] getStatusDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATUSDATE$0, targetList);
            gov.niem.niem.niemCore.x20.DateType[] result = new gov.niem.niem.niemCore.x20.DateType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StatusDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType getStatusDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(STATUSDATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "StatusDate" element
     */
    public boolean isNilStatusDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(STATUSDATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "StatusDate" element
     */
    public int sizeOfStatusDateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSDATE$0);
        }
    }
    
    /**
     * Sets array of all "StatusDate" element
     */
    public void setStatusDateArray(gov.niem.niem.niemCore.x20.DateType[] statusDateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(statusDateArray, STATUSDATE$0);
        }
    }
    
    /**
     * Sets ith "StatusDate" element
     */
    public void setStatusDateArray(int i, gov.niem.niem.niemCore.x20.DateType statusDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(STATUSDATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(statusDate);
        }
    }
    
    /**
     * Nils the ith "StatusDate" element
     */
    public void setNilStatusDateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().find_element_user(STATUSDATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatusDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType insertNewStatusDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().insert_element_user(STATUSDATE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StatusDate" element
     */
    public gov.niem.niem.niemCore.x20.DateType addNewStatusDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.DateType target = null;
            target = (gov.niem.niem.niemCore.x20.DateType)get_store().add_element_user(STATUSDATE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "StatusDate" element
     */
    public void removeStatusDate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSDATE$0, i);
        }
    }
    
    /**
     * Gets array of all "StatusDescriptionText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getStatusDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATUSDESCRIPTIONTEXT$2, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StatusDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getStatusDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(STATUSDESCRIPTIONTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "StatusDescriptionText" element
     */
    public boolean isNilStatusDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(STATUSDESCRIPTIONTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "StatusDescriptionText" element
     */
    public int sizeOfStatusDescriptionTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSDESCRIPTIONTEXT$2);
        }
    }
    
    /**
     * Sets array of all "StatusDescriptionText" element
     */
    public void setStatusDescriptionTextArray(gov.niem.niem.niemCore.x20.TextType[] statusDescriptionTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(statusDescriptionTextArray, STATUSDESCRIPTIONTEXT$2);
        }
    }
    
    /**
     * Sets ith "StatusDescriptionText" element
     */
    public void setStatusDescriptionTextArray(int i, gov.niem.niem.niemCore.x20.TextType statusDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(STATUSDESCRIPTIONTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(statusDescriptionText);
        }
    }
    
    /**
     * Nils the ith "StatusDescriptionText" element
     */
    public void setNilStatusDescriptionTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(STATUSDESCRIPTIONTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatusDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewStatusDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(STATUSDESCRIPTIONTEXT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StatusDescriptionText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewStatusDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(STATUSDESCRIPTIONTEXT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "StatusDescriptionText" element
     */
    public void removeStatusDescriptionText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSDESCRIPTIONTEXT$2, i);
        }
    }
    
    /**
     * Gets array of all "StatusIssuerIdentification" elements
     */
    public gov.niem.niem.niemCore.x20.IdentificationType[] getStatusIssuerIdentificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATUSISSUERIDENTIFICATION$4, targetList);
            gov.niem.niem.niemCore.x20.IdentificationType[] result = new gov.niem.niem.niemCore.x20.IdentificationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StatusIssuerIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType getStatusIssuerIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(STATUSISSUERIDENTIFICATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "StatusIssuerIdentification" element
     */
    public boolean isNilStatusIssuerIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(STATUSISSUERIDENTIFICATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "StatusIssuerIdentification" element
     */
    public int sizeOfStatusIssuerIdentificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUSISSUERIDENTIFICATION$4);
        }
    }
    
    /**
     * Sets array of all "StatusIssuerIdentification" element
     */
    public void setStatusIssuerIdentificationArray(gov.niem.niem.niemCore.x20.IdentificationType[] statusIssuerIdentificationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(statusIssuerIdentificationArray, STATUSISSUERIDENTIFICATION$4);
        }
    }
    
    /**
     * Sets ith "StatusIssuerIdentification" element
     */
    public void setStatusIssuerIdentificationArray(int i, gov.niem.niem.niemCore.x20.IdentificationType statusIssuerIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(STATUSISSUERIDENTIFICATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(statusIssuerIdentification);
        }
    }
    
    /**
     * Nils the ith "StatusIssuerIdentification" element
     */
    public void setNilStatusIssuerIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().find_element_user(STATUSISSUERIDENTIFICATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StatusIssuerIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType insertNewStatusIssuerIdentification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().insert_element_user(STATUSISSUERIDENTIFICATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StatusIssuerIdentification" element
     */
    public gov.niem.niem.niemCore.x20.IdentificationType addNewStatusIssuerIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.IdentificationType target = null;
            target = (gov.niem.niem.niemCore.x20.IdentificationType)get_store().add_element_user(STATUSISSUERIDENTIFICATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "StatusIssuerIdentification" element
     */
    public void removeStatusIssuerIdentification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUSISSUERIDENTIFICATION$4, i);
        }
    }
}
