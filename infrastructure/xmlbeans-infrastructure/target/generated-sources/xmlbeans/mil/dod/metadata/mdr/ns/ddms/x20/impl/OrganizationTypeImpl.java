/*
 * XML Type:  OrganizationType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML OrganizationType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class OrganizationTypeImpl extends mil.dod.metadata.mdr.ns.ddms.x20.impl.ProducerTypeImpl implements mil.dod.metadata.mdr.ns.ddms.x20.OrganizationType
{
    private static final long serialVersionUID = 1L;
    
    public OrganizationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHONE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "phone");
    private static final javax.xml.namespace.QName EMAIL$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "email");
    
    
    /**
     * Gets array of all "phone" elements
     */
    public java.lang.String[] getPhoneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PHONE$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "phone" element
     */
    public java.lang.String getPhoneArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "phone" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetPhoneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PHONE$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "phone" element
     */
    public org.apache.xmlbeans.XmlString xgetPhoneArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "phone" element
     */
    public int sizeOfPhoneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHONE$0);
        }
    }
    
    /**
     * Sets array of all "phone" element
     */
    public void setPhoneArray(java.lang.String[] phoneArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(phoneArray, PHONE$0);
        }
    }
    
    /**
     * Sets ith "phone" element
     */
    public void setPhoneArray(int i, java.lang.String phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(phone);
        }
    }
    
    /**
     * Sets (as xml) array of all "phone" element
     */
    public void xsetPhoneArray(org.apache.xmlbeans.XmlString[]phoneArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(phoneArray, PHONE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "phone" element
     */
    public void xsetPhoneArray(int i, org.apache.xmlbeans.XmlString phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(phone);
        }
    }
    
    /**
     * Inserts the value as the ith "phone" element
     */
    public void insertPhone(int i, java.lang.String phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PHONE$0, i);
            target.setStringValue(phone);
        }
    }
    
    /**
     * Appends the value as the last "phone" element
     */
    public void addPhone(java.lang.String phone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$0);
            target.setStringValue(phone);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "phone" element
     */
    public org.apache.xmlbeans.XmlString insertNewPhone(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PHONE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "phone" element
     */
    public org.apache.xmlbeans.XmlString addNewPhone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "phone" element
     */
    public void removePhone(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHONE$0, i);
        }
    }
    
    /**
     * Gets array of all "email" elements
     */
    public java.lang.String[] getEmailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMAIL$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "email" element
     */
    public java.lang.String getEmailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "email" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetEmailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EMAIL$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "email" element
     */
    public org.apache.xmlbeans.XmlString xgetEmailArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "email" element
     */
    public int sizeOfEmailArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$2);
        }
    }
    
    /**
     * Sets array of all "email" element
     */
    public void setEmailArray(java.lang.String[] emailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(emailArray, EMAIL$2);
        }
    }
    
    /**
     * Sets ith "email" element
     */
    public void setEmailArray(int i, java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) array of all "email" element
     */
    public void xsetEmailArray(org.apache.xmlbeans.XmlString[]emailArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(emailArray, EMAIL$2);
        }
    }
    
    /**
     * Sets (as xml) ith "email" element
     */
    public void xsetEmailArray(int i, org.apache.xmlbeans.XmlString email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(email);
        }
    }
    
    /**
     * Inserts the value as the ith "email" element
     */
    public void insertEmail(int i, java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EMAIL$2, i);
            target.setStringValue(email);
        }
    }
    
    /**
     * Appends the value as the last "email" element
     */
    public void addEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$2);
            target.setStringValue(email);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "email" element
     */
    public org.apache.xmlbeans.XmlString insertNewEmail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EMAIL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "email" element
     */
    public org.apache.xmlbeans.XmlString addNewEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "email" element
     */
    public void removeEmail(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$2, i);
        }
    }
}
