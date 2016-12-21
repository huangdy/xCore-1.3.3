/*
 * XML Type:  PersonNameType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.PersonNameType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML PersonNameType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class PersonNameTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.PersonNameType
{
    private static final long serialVersionUID = 1L;
    
    public PersonNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERSONNAMEPREFIXTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonNamePrefixText");
    private static final javax.xml.namespace.QName PERSONGIVENNAME$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonGivenName");
    private static final javax.xml.namespace.QName PERSONMIDDLENAME$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonMiddleName");
    private static final javax.xml.namespace.QName PERSONSURNAME$6 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonSurName");
    private static final javax.xml.namespace.QName PERSONNAMESUFFIXTEXT$8 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonNameSuffixText");
    private static final javax.xml.namespace.QName PERSONMAIDENNAME$10 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonMaidenName");
    private static final javax.xml.namespace.QName PERSONFULLNAME$12 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "PersonFullName");
    private static final javax.xml.namespace.QName PERSONNAMECOMMENTTEXT$14 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "personNameCommentText");
    
    
    /**
     * Gets array of all "PersonNamePrefixText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getPersonNamePrefixTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSONNAMEPREFIXTEXT$0, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PersonNamePrefixText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getPersonNamePrefixTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMEPREFIXTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PersonNamePrefixText" element
     */
    public boolean isNilPersonNamePrefixTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMEPREFIXTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PersonNamePrefixText" element
     */
    public int sizeOfPersonNamePrefixTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONNAMEPREFIXTEXT$0);
        }
    }
    
    /**
     * Sets array of all "PersonNamePrefixText" element
     */
    public void setPersonNamePrefixTextArray(gov.niem.niem.niemCore.x20.TextType[] personNamePrefixTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personNamePrefixTextArray, PERSONNAMEPREFIXTEXT$0);
        }
    }
    
    /**
     * Sets ith "PersonNamePrefixText" element
     */
    public void setPersonNamePrefixTextArray(int i, gov.niem.niem.niemCore.x20.TextType personNamePrefixText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMEPREFIXTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(personNamePrefixText);
        }
    }
    
    /**
     * Nils the ith "PersonNamePrefixText" element
     */
    public void setNilPersonNamePrefixTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMEPREFIXTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonNamePrefixText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewPersonNamePrefixText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(PERSONNAMEPREFIXTEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonNamePrefixText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewPersonNamePrefixText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(PERSONNAMEPREFIXTEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "PersonNamePrefixText" element
     */
    public void removePersonNamePrefixText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONNAMEPREFIXTEXT$0, i);
        }
    }
    
    /**
     * Gets array of all "PersonGivenName" elements
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType[] getPersonGivenNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSONGIVENNAME$2, targetList);
            gov.niem.niem.niemCore.x20.PersonNameTextType[] result = new gov.niem.niem.niemCore.x20.PersonNameTextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PersonGivenName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType getPersonGivenNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONGIVENNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PersonGivenName" element
     */
    public boolean isNilPersonGivenNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONGIVENNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PersonGivenName" element
     */
    public int sizeOfPersonGivenNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONGIVENNAME$2);
        }
    }
    
    /**
     * Sets array of all "PersonGivenName" element
     */
    public void setPersonGivenNameArray(gov.niem.niem.niemCore.x20.PersonNameTextType[] personGivenNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personGivenNameArray, PERSONGIVENNAME$2);
        }
    }
    
    /**
     * Sets ith "PersonGivenName" element
     */
    public void setPersonGivenNameArray(int i, gov.niem.niem.niemCore.x20.PersonNameTextType personGivenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONGIVENNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(personGivenName);
        }
    }
    
    /**
     * Nils the ith "PersonGivenName" element
     */
    public void setNilPersonGivenNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONGIVENNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonGivenName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType insertNewPersonGivenName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().insert_element_user(PERSONGIVENNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonGivenName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType addNewPersonGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONGIVENNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "PersonGivenName" element
     */
    public void removePersonGivenName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONGIVENNAME$2, i);
        }
    }
    
    /**
     * Gets array of all "PersonMiddleName" elements
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType[] getPersonMiddleNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSONMIDDLENAME$4, targetList);
            gov.niem.niem.niemCore.x20.PersonNameTextType[] result = new gov.niem.niem.niemCore.x20.PersonNameTextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PersonMiddleName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType getPersonMiddleNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMIDDLENAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PersonMiddleName" element
     */
    public boolean isNilPersonMiddleNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMIDDLENAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PersonMiddleName" element
     */
    public int sizeOfPersonMiddleNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONMIDDLENAME$4);
        }
    }
    
    /**
     * Sets array of all "PersonMiddleName" element
     */
    public void setPersonMiddleNameArray(gov.niem.niem.niemCore.x20.PersonNameTextType[] personMiddleNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personMiddleNameArray, PERSONMIDDLENAME$4);
        }
    }
    
    /**
     * Sets ith "PersonMiddleName" element
     */
    public void setPersonMiddleNameArray(int i, gov.niem.niem.niemCore.x20.PersonNameTextType personMiddleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMIDDLENAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(personMiddleName);
        }
    }
    
    /**
     * Nils the ith "PersonMiddleName" element
     */
    public void setNilPersonMiddleNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMIDDLENAME$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonMiddleName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType insertNewPersonMiddleName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().insert_element_user(PERSONMIDDLENAME$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonMiddleName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType addNewPersonMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONMIDDLENAME$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "PersonMiddleName" element
     */
    public void removePersonMiddleName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONMIDDLENAME$4, i);
        }
    }
    
    /**
     * Gets array of all "PersonSurName" elements
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType[] getPersonSurNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSONSURNAME$6, targetList);
            gov.niem.niem.niemCore.x20.PersonNameTextType[] result = new gov.niem.niem.niemCore.x20.PersonNameTextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PersonSurName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType getPersonSurNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONSURNAME$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PersonSurName" element
     */
    public boolean isNilPersonSurNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONSURNAME$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PersonSurName" element
     */
    public int sizeOfPersonSurNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONSURNAME$6);
        }
    }
    
    /**
     * Sets array of all "PersonSurName" element
     */
    public void setPersonSurNameArray(gov.niem.niem.niemCore.x20.PersonNameTextType[] personSurNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personSurNameArray, PERSONSURNAME$6);
        }
    }
    
    /**
     * Sets ith "PersonSurName" element
     */
    public void setPersonSurNameArray(int i, gov.niem.niem.niemCore.x20.PersonNameTextType personSurName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONSURNAME$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(personSurName);
        }
    }
    
    /**
     * Nils the ith "PersonSurName" element
     */
    public void setNilPersonSurNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONSURNAME$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonSurName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType insertNewPersonSurName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().insert_element_user(PERSONSURNAME$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonSurName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType addNewPersonSurName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONSURNAME$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "PersonSurName" element
     */
    public void removePersonSurName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONSURNAME$6, i);
        }
    }
    
    /**
     * Gets array of all "PersonNameSuffixText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getPersonNameSuffixTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSONNAMESUFFIXTEXT$8, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PersonNameSuffixText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getPersonNameSuffixTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMESUFFIXTEXT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PersonNameSuffixText" element
     */
    public boolean isNilPersonNameSuffixTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMESUFFIXTEXT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PersonNameSuffixText" element
     */
    public int sizeOfPersonNameSuffixTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONNAMESUFFIXTEXT$8);
        }
    }
    
    /**
     * Sets array of all "PersonNameSuffixText" element
     */
    public void setPersonNameSuffixTextArray(gov.niem.niem.niemCore.x20.TextType[] personNameSuffixTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personNameSuffixTextArray, PERSONNAMESUFFIXTEXT$8);
        }
    }
    
    /**
     * Sets ith "PersonNameSuffixText" element
     */
    public void setPersonNameSuffixTextArray(int i, gov.niem.niem.niemCore.x20.TextType personNameSuffixText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMESUFFIXTEXT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(personNameSuffixText);
        }
    }
    
    /**
     * Nils the ith "PersonNameSuffixText" element
     */
    public void setNilPersonNameSuffixTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(PERSONNAMESUFFIXTEXT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonNameSuffixText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewPersonNameSuffixText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(PERSONNAMESUFFIXTEXT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonNameSuffixText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewPersonNameSuffixText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(PERSONNAMESUFFIXTEXT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "PersonNameSuffixText" element
     */
    public void removePersonNameSuffixText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONNAMESUFFIXTEXT$8, i);
        }
    }
    
    /**
     * Gets array of all "PersonMaidenName" elements
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType[] getPersonMaidenNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSONMAIDENNAME$10, targetList);
            gov.niem.niem.niemCore.x20.PersonNameTextType[] result = new gov.niem.niem.niemCore.x20.PersonNameTextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PersonMaidenName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType getPersonMaidenNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMAIDENNAME$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PersonMaidenName" element
     */
    public boolean isNilPersonMaidenNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMAIDENNAME$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PersonMaidenName" element
     */
    public int sizeOfPersonMaidenNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONMAIDENNAME$10);
        }
    }
    
    /**
     * Sets array of all "PersonMaidenName" element
     */
    public void setPersonMaidenNameArray(gov.niem.niem.niemCore.x20.PersonNameTextType[] personMaidenNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personMaidenNameArray, PERSONMAIDENNAME$10);
        }
    }
    
    /**
     * Sets ith "PersonMaidenName" element
     */
    public void setPersonMaidenNameArray(int i, gov.niem.niem.niemCore.x20.PersonNameTextType personMaidenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMAIDENNAME$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(personMaidenName);
        }
    }
    
    /**
     * Nils the ith "PersonMaidenName" element
     */
    public void setNilPersonMaidenNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONMAIDENNAME$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonMaidenName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType insertNewPersonMaidenName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().insert_element_user(PERSONMAIDENNAME$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonMaidenName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType addNewPersonMaidenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONMAIDENNAME$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "PersonMaidenName" element
     */
    public void removePersonMaidenName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONMAIDENNAME$10, i);
        }
    }
    
    /**
     * Gets array of all "PersonFullName" elements
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType[] getPersonFullNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERSONFULLNAME$12, targetList);
            gov.niem.niem.niemCore.x20.PersonNameTextType[] result = new gov.niem.niem.niemCore.x20.PersonNameTextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PersonFullName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType getPersonFullNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONFULLNAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "PersonFullName" element
     */
    public boolean isNilPersonFullNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONFULLNAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "PersonFullName" element
     */
    public int sizeOfPersonFullNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERSONFULLNAME$12);
        }
    }
    
    /**
     * Sets array of all "PersonFullName" element
     */
    public void setPersonFullNameArray(gov.niem.niem.niemCore.x20.PersonNameTextType[] personFullNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(personFullNameArray, PERSONFULLNAME$12);
        }
    }
    
    /**
     * Sets ith "PersonFullName" element
     */
    public void setPersonFullNameArray(int i, gov.niem.niem.niemCore.x20.PersonNameTextType personFullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONFULLNAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(personFullName);
        }
    }
    
    /**
     * Nils the ith "PersonFullName" element
     */
    public void setNilPersonFullNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().find_element_user(PERSONFULLNAME$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PersonFullName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType insertNewPersonFullName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().insert_element_user(PERSONFULLNAME$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PersonFullName" element
     */
    public gov.niem.niem.niemCore.x20.PersonNameTextType addNewPersonFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.PersonNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.PersonNameTextType)get_store().add_element_user(PERSONFULLNAME$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "PersonFullName" element
     */
    public void removePersonFullName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERSONFULLNAME$12, i);
        }
    }
    
    /**
     * Gets the "personNameCommentText" attribute
     */
    public java.lang.String getPersonNameCommentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONNAMECOMMENTTEXT$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "personNameCommentText" attribute
     */
    public org.apache.xmlbeans.XmlString xgetPersonNameCommentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERSONNAMECOMMENTTEXT$14);
            return target;
        }
    }
    
    /**
     * True if has "personNameCommentText" attribute
     */
    public boolean isSetPersonNameCommentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PERSONNAMECOMMENTTEXT$14) != null;
        }
    }
    
    /**
     * Sets the "personNameCommentText" attribute
     */
    public void setPersonNameCommentText(java.lang.String personNameCommentText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERSONNAMECOMMENTTEXT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERSONNAMECOMMENTTEXT$14);
            }
            target.setStringValue(personNameCommentText);
        }
    }
    
    /**
     * Sets (as xml) the "personNameCommentText" attribute
     */
    public void xsetPersonNameCommentText(org.apache.xmlbeans.XmlString personNameCommentText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PERSONNAMECOMMENTTEXT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PERSONNAMECOMMENTTEXT$14);
            }
            target.set(personNameCommentText);
        }
    }
    
    /**
     * Unsets the "personNameCommentText" attribute
     */
    public void unsetPersonNameCommentText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PERSONNAMECOMMENTTEXT$14);
        }
    }
}
