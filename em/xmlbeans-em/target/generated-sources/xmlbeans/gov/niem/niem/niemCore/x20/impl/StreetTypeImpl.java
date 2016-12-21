/*
 * XML Type:  StreetType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.StreetType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML StreetType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class StreetTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.StreetType
{
    private static final long serialVersionUID = 1L;
    
    public StreetTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STREETNUMBERTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "StreetNumberText");
    private static final javax.xml.namespace.QName STREETNAME$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "StreetName");
    
    
    /**
     * Gets array of all "StreetNumberText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getStreetNumberTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STREETNUMBERTEXT$0, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StreetNumberText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getStreetNumberTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(STREETNUMBERTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "StreetNumberText" element
     */
    public boolean isNilStreetNumberTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(STREETNUMBERTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "StreetNumberText" element
     */
    public int sizeOfStreetNumberTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETNUMBERTEXT$0);
        }
    }
    
    /**
     * Sets array of all "StreetNumberText" element
     */
    public void setStreetNumberTextArray(gov.niem.niem.niemCore.x20.TextType[] streetNumberTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(streetNumberTextArray, STREETNUMBERTEXT$0);
        }
    }
    
    /**
     * Sets ith "StreetNumberText" element
     */
    public void setStreetNumberTextArray(int i, gov.niem.niem.niemCore.x20.TextType streetNumberText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(STREETNUMBERTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(streetNumberText);
        }
    }
    
    /**
     * Nils the ith "StreetNumberText" element
     */
    public void setNilStreetNumberTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(STREETNUMBERTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StreetNumberText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewStreetNumberText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(STREETNUMBERTEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StreetNumberText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewStreetNumberText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(STREETNUMBERTEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "StreetNumberText" element
     */
    public void removeStreetNumberText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETNUMBERTEXT$0, i);
        }
    }
    
    /**
     * Gets array of all "StreetName" elements
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType[] getStreetNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STREETNAME$2, targetList);
            gov.niem.niem.niemCore.x20.ProperNameTextType[] result = new gov.niem.niem.niemCore.x20.ProperNameTextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "StreetName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType getStreetNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(STREETNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "StreetName" element
     */
    public boolean isNilStreetNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(STREETNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "StreetName" element
     */
    public int sizeOfStreetNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETNAME$2);
        }
    }
    
    /**
     * Sets array of all "StreetName" element
     */
    public void setStreetNameArray(gov.niem.niem.niemCore.x20.ProperNameTextType[] streetNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(streetNameArray, STREETNAME$2);
        }
    }
    
    /**
     * Sets ith "StreetName" element
     */
    public void setStreetNameArray(int i, gov.niem.niem.niemCore.x20.ProperNameTextType streetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(STREETNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(streetName);
        }
    }
    
    /**
     * Nils the ith "StreetName" element
     */
    public void setNilStreetNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().find_element_user(STREETNAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StreetName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType insertNewStreetName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().insert_element_user(STREETNAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StreetName" element
     */
    public gov.niem.niem.niemCore.x20.ProperNameTextType addNewStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.ProperNameTextType target = null;
            target = (gov.niem.niem.niemCore.x20.ProperNameTextType)get_store().add_element_user(STREETNAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "StreetName" element
     */
    public void removeStreetName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETNAME$2, i);
        }
    }
}
