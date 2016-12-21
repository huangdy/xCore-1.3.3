/*
 * XML Type:  ContactRadioType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.ContactRadioType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML ContactRadioType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class ContactRadioTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.ContactRadioType
{
    private static final long serialVersionUID = 1L;
    
    public ContactRadioTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTACTRADIOCATEGORYTEXT$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactRadioCategoryText");
    private static final javax.xml.namespace.QName CONTACTRADIOCHANNELTEXT$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactRadioChannelText");
    private static final javax.xml.namespace.QName CONTACTRADIOCALLSIGNID$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "ContactRadioCallSignID");
    
    
    /**
     * Gets array of all "ContactRadioCategoryText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getContactRadioCategoryTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACTRADIOCATEGORYTEXT$0, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ContactRadioCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getContactRadioCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCATEGORYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ContactRadioCategoryText" element
     */
    public boolean isNilContactRadioCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCATEGORYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ContactRadioCategoryText" element
     */
    public int sizeOfContactRadioCategoryTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTRADIOCATEGORYTEXT$0);
        }
    }
    
    /**
     * Sets array of all "ContactRadioCategoryText" element
     */
    public void setContactRadioCategoryTextArray(gov.niem.niem.niemCore.x20.TextType[] contactRadioCategoryTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contactRadioCategoryTextArray, CONTACTRADIOCATEGORYTEXT$0);
        }
    }
    
    /**
     * Sets ith "ContactRadioCategoryText" element
     */
    public void setContactRadioCategoryTextArray(int i, gov.niem.niem.niemCore.x20.TextType contactRadioCategoryText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCATEGORYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contactRadioCategoryText);
        }
    }
    
    /**
     * Nils the ith "ContactRadioCategoryText" element
     */
    public void setNilContactRadioCategoryTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCATEGORYTEXT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContactRadioCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewContactRadioCategoryText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(CONTACTRADIOCATEGORYTEXT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContactRadioCategoryText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewContactRadioCategoryText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CONTACTRADIOCATEGORYTEXT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ContactRadioCategoryText" element
     */
    public void removeContactRadioCategoryText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTRADIOCATEGORYTEXT$0, i);
        }
    }
    
    /**
     * Gets array of all "ContactRadioChannelText" elements
     */
    public gov.niem.niem.niemCore.x20.TextType[] getContactRadioChannelTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACTRADIOCHANNELTEXT$2, targetList);
            gov.niem.niem.niemCore.x20.TextType[] result = new gov.niem.niem.niemCore.x20.TextType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ContactRadioChannelText" element
     */
    public gov.niem.niem.niemCore.x20.TextType getContactRadioChannelTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCHANNELTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ContactRadioChannelText" element
     */
    public boolean isNilContactRadioChannelTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCHANNELTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ContactRadioChannelText" element
     */
    public int sizeOfContactRadioChannelTextArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTRADIOCHANNELTEXT$2);
        }
    }
    
    /**
     * Sets array of all "ContactRadioChannelText" element
     */
    public void setContactRadioChannelTextArray(gov.niem.niem.niemCore.x20.TextType[] contactRadioChannelTextArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contactRadioChannelTextArray, CONTACTRADIOCHANNELTEXT$2);
        }
    }
    
    /**
     * Sets ith "ContactRadioChannelText" element
     */
    public void setContactRadioChannelTextArray(int i, gov.niem.niem.niemCore.x20.TextType contactRadioChannelText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCHANNELTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contactRadioChannelText);
        }
    }
    
    /**
     * Nils the ith "ContactRadioChannelText" element
     */
    public void setNilContactRadioChannelTextArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().find_element_user(CONTACTRADIOCHANNELTEXT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContactRadioChannelText" element
     */
    public gov.niem.niem.niemCore.x20.TextType insertNewContactRadioChannelText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().insert_element_user(CONTACTRADIOCHANNELTEXT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContactRadioChannelText" element
     */
    public gov.niem.niem.niemCore.x20.TextType addNewContactRadioChannelText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.niemCore.x20.TextType target = null;
            target = (gov.niem.niem.niemCore.x20.TextType)get_store().add_element_user(CONTACTRADIOCHANNELTEXT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "ContactRadioChannelText" element
     */
    public void removeContactRadioChannelText(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTRADIOCHANNELTEXT$2, i);
        }
    }
    
    /**
     * Gets array of all "ContactRadioCallSignID" elements
     */
    public gov.niem.niem.proxy.xsd.x20.String[] getContactRadioCallSignIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTACTRADIOCALLSIGNID$4, targetList);
            gov.niem.niem.proxy.xsd.x20.String[] result = new gov.niem.niem.proxy.xsd.x20.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ContactRadioCallSignID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getContactRadioCallSignIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(CONTACTRADIOCALLSIGNID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "ContactRadioCallSignID" element
     */
    public boolean isNilContactRadioCallSignIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(CONTACTRADIOCALLSIGNID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "ContactRadioCallSignID" element
     */
    public int sizeOfContactRadioCallSignIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACTRADIOCALLSIGNID$4);
        }
    }
    
    /**
     * Sets array of all "ContactRadioCallSignID" element
     */
    public void setContactRadioCallSignIDArray(gov.niem.niem.proxy.xsd.x20.String[] contactRadioCallSignIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contactRadioCallSignIDArray, CONTACTRADIOCALLSIGNID$4);
        }
    }
    
    /**
     * Sets ith "ContactRadioCallSignID" element
     */
    public void setContactRadioCallSignIDArray(int i, gov.niem.niem.proxy.xsd.x20.String contactRadioCallSignID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(CONTACTRADIOCALLSIGNID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contactRadioCallSignID);
        }
    }
    
    /**
     * Nils the ith "ContactRadioCallSignID" element
     */
    public void setNilContactRadioCallSignIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(CONTACTRADIOCALLSIGNID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ContactRadioCallSignID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String insertNewContactRadioCallSignID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(CONTACTRADIOCALLSIGNID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ContactRadioCallSignID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewContactRadioCallSignID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(CONTACTRADIOCALLSIGNID$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ContactRadioCallSignID" element
     */
    public void removeContactRadioCallSignID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACTRADIOCALLSIGNID$4, i);
        }
    }
}
