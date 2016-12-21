/*
 * XML Type:  InternationalTelephoneNumberType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML InternationalTelephoneNumberType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class InternationalTelephoneNumberTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.InternationalTelephoneNumberType
{
    private static final long serialVersionUID = 1L;
    
    public InternationalTelephoneNumberTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONECOUNTRYCODEID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneCountryCodeID");
    private static final javax.xml.namespace.QName TELEPHONENUMBERID$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneNumberID");
    private static final javax.xml.namespace.QName TELEPHONESUFFIXID$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneSuffixID");
    
    
    /**
     * Gets array of all "TelephoneCountryCodeID" elements
     */
    public gov.niem.niem.proxy.xsd.x20.String[] getTelephoneCountryCodeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELEPHONECOUNTRYCODEID$0, targetList);
            gov.niem.niem.proxy.xsd.x20.String[] result = new gov.niem.niem.proxy.xsd.x20.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TelephoneCountryCodeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneCountryCodeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONECOUNTRYCODEID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "TelephoneCountryCodeID" element
     */
    public boolean isNilTelephoneCountryCodeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONECOUNTRYCODEID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "TelephoneCountryCodeID" element
     */
    public int sizeOfTelephoneCountryCodeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONECOUNTRYCODEID$0);
        }
    }
    
    /**
     * Sets array of all "TelephoneCountryCodeID" element
     */
    public void setTelephoneCountryCodeIDArray(gov.niem.niem.proxy.xsd.x20.String[] telephoneCountryCodeIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(telephoneCountryCodeIDArray, TELEPHONECOUNTRYCODEID$0);
        }
    }
    
    /**
     * Sets ith "TelephoneCountryCodeID" element
     */
    public void setTelephoneCountryCodeIDArray(int i, gov.niem.niem.proxy.xsd.x20.String telephoneCountryCodeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONECOUNTRYCODEID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(telephoneCountryCodeID);
        }
    }
    
    /**
     * Nils the ith "TelephoneCountryCodeID" element
     */
    public void setNilTelephoneCountryCodeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONECOUNTRYCODEID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TelephoneCountryCodeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String insertNewTelephoneCountryCodeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(TELEPHONECOUNTRYCODEID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TelephoneCountryCodeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneCountryCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONECOUNTRYCODEID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "TelephoneCountryCodeID" element
     */
    public void removeTelephoneCountryCodeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONECOUNTRYCODEID$0, i);
        }
    }
    
    /**
     * Gets array of all "TelephoneNumberID" elements
     */
    public gov.niem.niem.proxy.xsd.x20.String[] getTelephoneNumberIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELEPHONENUMBERID$2, targetList);
            gov.niem.niem.proxy.xsd.x20.String[] result = new gov.niem.niem.proxy.xsd.x20.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TelephoneNumberID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneNumberIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONENUMBERID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "TelephoneNumberID" element
     */
    public boolean isNilTelephoneNumberIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONENUMBERID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "TelephoneNumberID" element
     */
    public int sizeOfTelephoneNumberIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONENUMBERID$2);
        }
    }
    
    /**
     * Sets array of all "TelephoneNumberID" element
     */
    public void setTelephoneNumberIDArray(gov.niem.niem.proxy.xsd.x20.String[] telephoneNumberIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(telephoneNumberIDArray, TELEPHONENUMBERID$2);
        }
    }
    
    /**
     * Sets ith "TelephoneNumberID" element
     */
    public void setTelephoneNumberIDArray(int i, gov.niem.niem.proxy.xsd.x20.String telephoneNumberID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONENUMBERID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(telephoneNumberID);
        }
    }
    
    /**
     * Nils the ith "TelephoneNumberID" element
     */
    public void setNilTelephoneNumberIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONENUMBERID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TelephoneNumberID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String insertNewTelephoneNumberID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(TELEPHONENUMBERID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TelephoneNumberID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneNumberID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONENUMBERID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "TelephoneNumberID" element
     */
    public void removeTelephoneNumberID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONENUMBERID$2, i);
        }
    }
    
    /**
     * Gets array of all "TelephoneSuffixID" elements
     */
    public gov.niem.niem.proxy.xsd.x20.String[] getTelephoneSuffixIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELEPHONESUFFIXID$4, targetList);
            gov.niem.niem.proxy.xsd.x20.String[] result = new gov.niem.niem.proxy.xsd.x20.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TelephoneSuffixID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneSuffixIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "TelephoneSuffixID" element
     */
    public boolean isNilTelephoneSuffixIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "TelephoneSuffixID" element
     */
    public int sizeOfTelephoneSuffixIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONESUFFIXID$4);
        }
    }
    
    /**
     * Sets array of all "TelephoneSuffixID" element
     */
    public void setTelephoneSuffixIDArray(gov.niem.niem.proxy.xsd.x20.String[] telephoneSuffixIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(telephoneSuffixIDArray, TELEPHONESUFFIXID$4);
        }
    }
    
    /**
     * Sets ith "TelephoneSuffixID" element
     */
    public void setTelephoneSuffixIDArray(int i, gov.niem.niem.proxy.xsd.x20.String telephoneSuffixID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(telephoneSuffixID);
        }
    }
    
    /**
     * Nils the ith "TelephoneSuffixID" element
     */
    public void setNilTelephoneSuffixIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TelephoneSuffixID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String insertNewTelephoneSuffixID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(TELEPHONESUFFIXID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TelephoneSuffixID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneSuffixID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONESUFFIXID$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "TelephoneSuffixID" element
     */
    public void removeTelephoneSuffixID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONESUFFIXID$4, i);
        }
    }
}
