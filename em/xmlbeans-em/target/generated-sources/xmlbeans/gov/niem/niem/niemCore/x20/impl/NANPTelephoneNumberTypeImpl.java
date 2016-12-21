/*
 * XML Type:  NANPTelephoneNumberType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.NANPTelephoneNumberType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20.impl;
/**
 * An XML NANPTelephoneNumberType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public class NANPTelephoneNumberTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements gov.niem.niem.niemCore.x20.NANPTelephoneNumberType
{
    private static final long serialVersionUID = 1L;
    
    public NANPTelephoneNumberTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEPHONEAREACODEID$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneAreaCodeID");
    private static final javax.xml.namespace.QName TELEPHONEEXCHANGEID$2 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneExchangeID");
    private static final javax.xml.namespace.QName TELEPHONELINEID$4 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneLineID");
    private static final javax.xml.namespace.QName TELEPHONESUFFIXID$6 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/niem-core/2.0", "TelephoneSuffixID");
    
    
    /**
     * Gets array of all "TelephoneAreaCodeID" elements
     */
    public gov.niem.niem.proxy.xsd.x20.String[] getTelephoneAreaCodeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELEPHONEAREACODEID$0, targetList);
            gov.niem.niem.proxy.xsd.x20.String[] result = new gov.niem.niem.proxy.xsd.x20.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TelephoneAreaCodeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneAreaCodeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEAREACODEID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "TelephoneAreaCodeID" element
     */
    public boolean isNilTelephoneAreaCodeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEAREACODEID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "TelephoneAreaCodeID" element
     */
    public int sizeOfTelephoneAreaCodeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONEAREACODEID$0);
        }
    }
    
    /**
     * Sets array of all "TelephoneAreaCodeID" element
     */
    public void setTelephoneAreaCodeIDArray(gov.niem.niem.proxy.xsd.x20.String[] telephoneAreaCodeIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(telephoneAreaCodeIDArray, TELEPHONEAREACODEID$0);
        }
    }
    
    /**
     * Sets ith "TelephoneAreaCodeID" element
     */
    public void setTelephoneAreaCodeIDArray(int i, gov.niem.niem.proxy.xsd.x20.String telephoneAreaCodeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEAREACODEID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(telephoneAreaCodeID);
        }
    }
    
    /**
     * Nils the ith "TelephoneAreaCodeID" element
     */
    public void setNilTelephoneAreaCodeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEAREACODEID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TelephoneAreaCodeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String insertNewTelephoneAreaCodeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(TELEPHONEAREACODEID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TelephoneAreaCodeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneAreaCodeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONEAREACODEID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "TelephoneAreaCodeID" element
     */
    public void removeTelephoneAreaCodeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONEAREACODEID$0, i);
        }
    }
    
    /**
     * Gets array of all "TelephoneExchangeID" elements
     */
    public gov.niem.niem.proxy.xsd.x20.String[] getTelephoneExchangeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELEPHONEEXCHANGEID$2, targetList);
            gov.niem.niem.proxy.xsd.x20.String[] result = new gov.niem.niem.proxy.xsd.x20.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TelephoneExchangeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneExchangeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEEXCHANGEID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "TelephoneExchangeID" element
     */
    public boolean isNilTelephoneExchangeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEEXCHANGEID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "TelephoneExchangeID" element
     */
    public int sizeOfTelephoneExchangeIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONEEXCHANGEID$2);
        }
    }
    
    /**
     * Sets array of all "TelephoneExchangeID" element
     */
    public void setTelephoneExchangeIDArray(gov.niem.niem.proxy.xsd.x20.String[] telephoneExchangeIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(telephoneExchangeIDArray, TELEPHONEEXCHANGEID$2);
        }
    }
    
    /**
     * Sets ith "TelephoneExchangeID" element
     */
    public void setTelephoneExchangeIDArray(int i, gov.niem.niem.proxy.xsd.x20.String telephoneExchangeID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEEXCHANGEID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(telephoneExchangeID);
        }
    }
    
    /**
     * Nils the ith "TelephoneExchangeID" element
     */
    public void setNilTelephoneExchangeIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONEEXCHANGEID$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TelephoneExchangeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String insertNewTelephoneExchangeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(TELEPHONEEXCHANGEID$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TelephoneExchangeID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneExchangeID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONEEXCHANGEID$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "TelephoneExchangeID" element
     */
    public void removeTelephoneExchangeID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONEEXCHANGEID$2, i);
        }
    }
    
    /**
     * Gets array of all "TelephoneLineID" elements
     */
    public gov.niem.niem.proxy.xsd.x20.String[] getTelephoneLineIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELEPHONELINEID$4, targetList);
            gov.niem.niem.proxy.xsd.x20.String[] result = new gov.niem.niem.proxy.xsd.x20.String[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "TelephoneLineID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String getTelephoneLineIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONELINEID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "TelephoneLineID" element
     */
    public boolean isNilTelephoneLineIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONELINEID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "TelephoneLineID" element
     */
    public int sizeOfTelephoneLineIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEPHONELINEID$4);
        }
    }
    
    /**
     * Sets array of all "TelephoneLineID" element
     */
    public void setTelephoneLineIDArray(gov.niem.niem.proxy.xsd.x20.String[] telephoneLineIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(telephoneLineIDArray, TELEPHONELINEID$4);
        }
    }
    
    /**
     * Sets ith "TelephoneLineID" element
     */
    public void setTelephoneLineIDArray(int i, gov.niem.niem.proxy.xsd.x20.String telephoneLineID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONELINEID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(telephoneLineID);
        }
    }
    
    /**
     * Nils the ith "TelephoneLineID" element
     */
    public void setNilTelephoneLineIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONELINEID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "TelephoneLineID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String insertNewTelephoneLineID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(TELEPHONELINEID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "TelephoneLineID" element
     */
    public gov.niem.niem.proxy.xsd.x20.String addNewTelephoneLineID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.proxy.xsd.x20.String target = null;
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONELINEID$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "TelephoneLineID" element
     */
    public void removeTelephoneLineID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEPHONELINEID$4, i);
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
            get_store().find_all_element_users(TELEPHONESUFFIXID$6, targetList);
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
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$6, i);
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
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$6, i);
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
            return get_store().count_elements(TELEPHONESUFFIXID$6);
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
            arraySetterHelper(telephoneSuffixIDArray, TELEPHONESUFFIXID$6);
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
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$6, i);
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
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().find_element_user(TELEPHONESUFFIXID$6, i);
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
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().insert_element_user(TELEPHONESUFFIXID$6, i);
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
            target = (gov.niem.niem.proxy.xsd.x20.String)get_store().add_element_user(TELEPHONESUFFIXID$6);
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
            get_store().remove_element(TELEPHONESUFFIXID$6, i);
        }
    }
}
