/*
 * XML Type:  PersonType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.PersonType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML PersonType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class PersonTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.PersonType
{
    private static final long serialVersionUID = 1L;
    
    public PersonTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONCAPABILITY$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonCapability");
    private static final javax.xml.namespace.QName PERSONNAME$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonName");
    
    
    /**
     * Gets array of all "PersonCapability" elements
     */
    public gov.niem.niem.niemCore.x20.CapabilityType[] getPersonCapabilityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSONCAPABILITY$0, targetList);
            gov.niem.niem.niemCore.x20.CapabilityType[] result = new gov.niem.niem.niemCore.x20.CapabilityType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PersonCapability" element
     */
    public gov.niem.niem.niemCore.x20.CapabilityType getPersonCapabilityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CapabilityType target = null;
            target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().find_element_user(PERSONCAPABILITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PersonCapability" element
     */
    public boolean isNilPersonCapabilityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CapabilityType target = null;
            target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().find_element_user(PERSONCAPABILITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PersonCapability" element
     */
    public int sizeOfPersonCapabilityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONCAPABILITY$0);
        }
    }
    
    /**
     * Sets array of all "PersonCapability" element
     */
    public void setPersonCapabilityArray(gov.niem.niem.niemCore.x20.CapabilityType[] personCapabilityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personCapabilityArray, PERSONCAPABILITY$0);
        }
    }
    
    /**
     * Sets ith "PersonCapability" element
     */
    public void setPersonCapabilityArray(int i, gov.niem.niem.niemCore.x20.CapabilityType personCapability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CapabilityType target = null;
            target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().find_element_user(PERSONCAPABILITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(personCapability);
        }
    }
    
    /**
     * Nils the ith "PersonCapability" element
     */
    public void setNilPersonCapabilityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CapabilityType target = null;
            target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().find_element_user(PERSONCAPABILITY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonCapability" element
     */
    public gov.niem.niem.niemCore.x20.CapabilityType insertNewPersonCapability(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CapabilityType target = null;
            target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().insert_element_user(PERSONCAPABILITY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonCapability" element
     */
    public gov.niem.niem.niemCore.x20.CapabilityType addNewPersonCapability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.CapabilityType target = null;
            target = (gov.niem.niem.niemCore.x20.CapabilityType)get_store().add_element_user(PERSONCAPABILITY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PersonCapability" element
     */
    public void removePersonCapability(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONCAPABILITY$0, i);
        }
    }
    
    /**
     * Gets array of all "PersonName" elements
     */
    public gov.niem.niem.niemCore.x20.PersonNameType[] getPersonNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSONNAME$2, targetList);
            gov.niem.niem.niemCore.x20.PersonNameType[] result = new gov.niem.niem.niemCore.x20.PersonNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PersonName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameType getPersonNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().find_element_user(PERSONNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PersonName" element
     */
    public boolean isNilPersonNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().find_element_user(PERSONNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PersonName" element
     */
    public int sizeOfPersonNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONNAME$2);
        }
    }
    
    /**
     * Sets array of all "PersonName" element
     */
    public void setPersonNameArray(gov.niem.niem.niemCore.x20.PersonNameType[] personNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personNameArray, PERSONNAME$2);
        }
    }
    
    /**
     * Sets ith "PersonName" element
     */
    public void setPersonNameArray(int i, gov.niem.niem.niemCore.x20.PersonNameType personName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().find_element_user(PERSONNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(personName);
        }
    }
    
    /**
     * Nils the ith "PersonName" element
     */
    public void setNilPersonNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().find_element_user(PERSONNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameType insertNewPersonName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().insert_element_user(PERSONNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameType addNewPersonName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameType)get_store().add_element_user(PERSONNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "PersonName" element
     */
    public void removePersonName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONNAME$2, i);
        }
    }
}
