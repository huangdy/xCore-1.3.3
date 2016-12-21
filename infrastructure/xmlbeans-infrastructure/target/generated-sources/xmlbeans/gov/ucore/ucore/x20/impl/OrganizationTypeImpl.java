/*
 * XML Type:  OrganizationType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.OrganizationType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML OrganizationType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class OrganizationTypeImpl extends gov.ucore.ucore.x20.impl.AgentTypeImpl implements gov.ucore.ucore.x20.OrganizationType
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTERNATENAME$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AlternateName");
    private static final javax.xml.namespace.QName CONTACTINFO$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "ContactInfo");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Name");
    
    
    /**
     * Gets array of all "AlternateName" elements
     */
    public gov.ucore.ucore.x20.ExtendedStringType[] getAlternateNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALTERNATENAME$0, targetList);
            gov.ucore.ucore.x20.ExtendedStringType[] result = new gov.ucore.ucore.x20.ExtendedStringType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AlternateName" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType getAlternateNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().find_element_user(ALTERNATENAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AlternateName" element
     */
    public int sizeOfAlternateNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTERNATENAME$0);
        }
    }
    
    /**
     * Sets array of all "AlternateName" element
     */
    public void setAlternateNameArray(gov.ucore.ucore.x20.ExtendedStringType[] alternateNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alternateNameArray, ALTERNATENAME$0);
        }
    }
    
    /**
     * Sets ith "AlternateName" element
     */
    public void setAlternateNameArray(int i, gov.ucore.ucore.x20.ExtendedStringType alternateName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().find_element_user(ALTERNATENAME$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alternateName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AlternateName" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType insertNewAlternateName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().insert_element_user(ALTERNATENAME$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AlternateName" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType addNewAlternateName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().add_element_user(ALTERNATENAME$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "AlternateName" element
     */
    public void removeAlternateName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTERNATENAME$0, i);
        }
    }
    
    /**
     * Gets the "ContactInfo" element
     */
    public gov.ucore.ucore.x20.ContactInfoType getContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ContactInfoType target = null;
            target = (gov.ucore.ucore.x20.ContactInfoType)get_store().find_element_user(CONTACTINFO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ContactInfo" element
     */
    public boolean isSetContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTINFO$2) != 0;
        }
    }
    
    /**
     * Sets the "ContactInfo" element
     */
    public void setContactInfo(gov.ucore.ucore.x20.ContactInfoType contactInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ContactInfoType target = null;
            target = (gov.ucore.ucore.x20.ContactInfoType)get_store().find_element_user(CONTACTINFO$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.ContactInfoType)get_store().add_element_user(CONTACTINFO$2);
            }
            target.set(contactInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "ContactInfo" element
     */
    public gov.ucore.ucore.x20.ContactInfoType addNewContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ContactInfoType target = null;
            target = (gov.ucore.ucore.x20.ContactInfoType)get_store().add_element_user(CONTACTINFO$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ContactInfo" element
     */
    public void unsetContactInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTINFO$2, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$4) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(gov.ucore.ucore.x20.ExtendedStringType name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().add_element_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "Name" element
     */
    public gov.ucore.ucore.x20.ExtendedStringType addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ExtendedStringType target = null;
            target = (gov.ucore.ucore.x20.ExtendedStringType)get_store().add_element_user(NAME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$4, 0);
        }
    }
}
