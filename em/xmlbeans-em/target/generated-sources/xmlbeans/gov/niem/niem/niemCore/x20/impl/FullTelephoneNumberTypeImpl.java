/*
 * XML Type:  FullTelephoneNumberType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.FullTelephoneNumberType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML FullTelephoneNumberType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class FullTelephoneNumberTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.FullTelephoneNumberType
{
    private static final long serialVersionUID = 1L;
    
    public FullTelephoneNumberTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONENUMBERFULLID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneNumberFullID");
    private static final javax.xml.namespace.QName TELEPHONESUFFIXID$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneSuffixID");
    
    
    /**
     * Gets array of all "TelephoneNumberFullID" elements
     */
    public gov.niem.niem.proxy.xsd.x20.String[] getTelephoneNumberFullIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELEPHONENUMBERFULLID$0, targetList);
            gov.niem.niem.proxy.xsd.x20.String[] result = new gov.niem.niem.proxy.xsd.x20.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TelephoneNumberFullID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneNumberFullIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONENUMBERFULLID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "TelephoneNumberFullID" element
     */
    public boolean isNilTelephoneNumberFullIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONENUMBERFULLID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "TelephoneNumberFullID" element
     */
    public int sizeOfTelephoneNumberFullIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONENUMBERFULLID$0);
        }
    }
    
    /**
     * Sets array of all "TelephoneNumberFullID" element
     */
    public void setTelephoneNumberFullIDArray(gov.niem.niem.proxy.xsd.x20.String[] telephoneNumberFullIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(telephoneNumberFullIDArray, TELEPHONENUMBERFULLID$0);
        }
    }
    
    /**
     * Sets ith "TelephoneNumberFullID" element
     */
    public void setTelephoneNumberFullIDArray(int i, gov.niem.niem.proxy.xsd.x20.String telephoneNumberFullID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONENUMBERFULLID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(telephoneNumberFullID);
        }
    }
    
    /**
     * Nils the ith "TelephoneNumberFullID" element
     */
    public void setNilTelephoneNumberFullIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONENUMBERFULLID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TelephoneNumberFullID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String insertNewTelephoneNumberFullID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(TELEPHONENUMBERFULLID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TelephoneNumberFullID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneNumberFullID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONENUMBERFULLID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "TelephoneNumberFullID" element
     */
    public void removeTelephoneNumberFullID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONENUMBERFULLID$0, i);
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
            get_store().find_all_element_users(TELEPHONESUFFIXID$2, targetList);
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
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$2, i);
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
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$2, i);
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
            return get_store().count_elements(TELEPHONESUFFIXID$2);
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
            arraySetterHelper(telephoneSuffixIDArray, TELEPHONESUFFIXID$2);
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
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$2, i);
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
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$2, i);
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
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(TELEPHONESUFFIXID$2, i);
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
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONESUFFIXID$2);
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
            get_store().remove_element(TELEPHONESUFFIXID$2, i);
        }
    }
}
