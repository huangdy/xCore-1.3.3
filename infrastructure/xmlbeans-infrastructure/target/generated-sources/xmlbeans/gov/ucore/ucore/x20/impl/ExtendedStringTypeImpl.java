/*
 * XML Type:  ExtendedStringType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.ExtendedStringType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML ExtendedStringType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class ExtendedStringTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.ExtendedStringType
{
    private static final long serialVersionUID = 1L;
    
    public ExtendedStringTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Value");
    private static final javax.xml.namespace.QName ALTSPELLING$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AltSpelling");
    
    
    /**
     * Gets the "Value" element
     */
    public gov.ucore.ucore.x20.StringType getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Value" element
     */
    public void setValue(gov.ucore.ucore.x20.StringType value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.StringType)get_store().add_element_user(VALUE$0);
            }
            target.set(value);
        }
    }
    
    /**
     * Appends and returns a new empty "Value" element
     */
    public gov.ucore.ucore.x20.StringType addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().add_element_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "AltSpelling" elements
     */
    public gov.ucore.ucore.x20.StringType[] getAltSpellingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALTSPELLING$2, targetList);
            gov.ucore.ucore.x20.StringType[] result = new gov.ucore.ucore.x20.StringType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AltSpelling" element
     */
    public gov.ucore.ucore.x20.StringType getAltSpellingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().find_element_user(ALTSPELLING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AltSpelling" element
     */
    public int sizeOfAltSpellingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTSPELLING$2);
        }
    }
    
    /**
     * Sets array of all "AltSpelling" element
     */
    public void setAltSpellingArray(gov.ucore.ucore.x20.StringType[] altSpellingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(altSpellingArray, ALTSPELLING$2);
        }
    }
    
    /**
     * Sets ith "AltSpelling" element
     */
    public void setAltSpellingArray(int i, gov.ucore.ucore.x20.StringType altSpelling)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().find_element_user(ALTSPELLING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(altSpelling);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AltSpelling" element
     */
    public gov.ucore.ucore.x20.StringType insertNewAltSpelling(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().insert_element_user(ALTSPELLING$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AltSpelling" element
     */
    public gov.ucore.ucore.x20.StringType addNewAltSpelling()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().add_element_user(ALTSPELLING$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "AltSpelling" element
     */
    public void removeAltSpelling(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTSPELLING$2, i);
        }
    }
}
