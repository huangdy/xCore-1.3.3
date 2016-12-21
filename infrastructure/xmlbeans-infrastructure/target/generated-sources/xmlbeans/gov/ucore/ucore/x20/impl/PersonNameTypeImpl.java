/*
 * XML Type:  PersonNameType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.PersonNameType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML PersonNameType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class PersonNameTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.PersonNameType
{
    private static final long serialVersionUID = 1L;
    
    public PersonNameTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FULLNAME$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "FullName");
    private static final javax.xml.namespace.QName FAMILYNAME$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "FamilyName");
    private static final javax.xml.namespace.QName GIVENNAME$4 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "GivenName");
    private static final javax.xml.namespace.QName MIDDLENAME$6 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "MiddleName");
    
    
    /**
     * Gets the "FullName" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType getFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().find_element_user(FULLNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FullName" element
     */
    public boolean isSetFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FULLNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "FullName" element
     */
    public void setFullName(gov.ucore.ucore.x20.ExtendedStringType fullName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().find_element_user(FULLNAME$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().add_element_user(FULLNAME$0);
            }
            target.set(fullName);
        }
    }
    
    /**
     * Appends and returns a new empty "FullName" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType addNewFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().add_element_user(FULLNAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "FullName" element
     */
    public void unsetFullName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FULLNAME$0, 0);
        }
    }
    
    /**
     * Gets the "FamilyName" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType getFamilyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().find_element_user(FAMILYNAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FamilyName" element
     */
    public boolean isSetFamilyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAMILYNAME$2) != 0;
        }
    }
    
    /**
     * Sets the "FamilyName" element
     */
    public void setFamilyName(gov.ucore.ucore.x20.ExtendedStringType familyName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().find_element_user(FAMILYNAME$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().add_element_user(FAMILYNAME$2);
            }
            target.set(familyName);
        }
    }
    
    /**
     * Appends and returns a new empty "FamilyName" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType addNewFamilyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().add_element_user(FAMILYNAME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "FamilyName" element
     */
    public void unsetFamilyName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAMILYNAME$2, 0);
        }
    }
    
    /**
     * Gets the "GivenName" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType getGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().find_element_user(GIVENNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "GivenName" element
     */
    public boolean isSetGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GIVENNAME$4) != 0;
        }
    }
    
    /**
     * Sets the "GivenName" element
     */
    public void setGivenName(gov.ucore.ucore.x20.ExtendedStringType givenName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().find_element_user(GIVENNAME$4, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().add_element_user(GIVENNAME$4);
            }
            target.set(givenName);
        }
    }
    
    /**
     * Appends and returns a new empty "GivenName" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType addNewGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().add_element_user(GIVENNAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "GivenName" element
     */
    public void unsetGivenName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GIVENNAME$4, 0);
        }
    }
    
    /**
     * Gets the "MiddleName" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType getMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().find_element_user(MIDDLENAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MiddleName" element
     */
    public boolean isSetMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIDDLENAME$6) != 0;
        }
    }
    
    /**
     * Sets the "MiddleName" element
     */
    public void setMiddleName(gov.ucore.ucore.x20.ExtendedStringType middleName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().find_element_user(MIDDLENAME$6, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().add_element_user(MIDDLENAME$6);
            }
            target.set(middleName);
        }
    }
    
    /**
     * Appends and returns a new empty "MiddleName" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType addNewMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().add_element_user(MIDDLENAME$6);
            return target;
        }
    }
    
    /**
     * Unsets the "MiddleName" element
     */
    public void unsetMiddleName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIDDLENAME$6, 0);
        }
    }
}
