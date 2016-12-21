/*
 * XML Type:  PersonType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.PersonType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML PersonType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class PersonTypeImpl extends mil.dod.metadata.mdr.ns.ddms.x20.impl.ProducerTypeImpl implements mil.dod.metadata.mdr.ns.ddms.x20.PersonType
{
    private static final long serialVersionUID = 1L;
    
    public PersonTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SURNAME$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "surname");
    private static final javax.xml.namespace.QName USERID$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "userID");
    private static final javax.xml.namespace.QName AFFILIATION$4 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "affiliation");
    private static final javax.xml.namespace.QName PHONE$6 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "phone");
    private static final javax.xml.namespace.QName EMAIL$8 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "email");
    
    
    /**
     * Gets the "surname" element
     */
    public java.lang.String getSurname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "surname" element
     */
    public org.apache.xmlbeans.XmlString xgetSurname()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SURNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "surname" element
     */
    public void setSurname(java.lang.String surname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SURNAME$0);
            }
            target.setStringValue(surname);
        }
    }
    
    /**
     * Sets (as xml) the "surname" element
     */
    public void xsetSurname(org.apache.xmlbeans.XmlString surname)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SURNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SURNAME$0);
            }
            target.set(surname);
        }
    }
    
    /**
     * Gets the "userID" element
     */
    public java.lang.String getUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "userID" element
     */
    public org.apache.xmlbeans.XmlString xgetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "userID" element
     */
    public boolean isSetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERID$2) != 0;
        }
    }
    
    /**
     * Sets the "userID" element
     */
    public void setUserID(java.lang.String userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$2);
            }
            target.setStringValue(userID);
        }
    }
    
    /**
     * Sets (as xml) the "userID" element
     */
    public void xsetUserID(org.apache.xmlbeans.XmlString userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERID$2);
            }
            target.set(userID);
        }
    }
    
    /**
     * Unsets the "userID" element
     */
    public void unsetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERID$2, 0);
        }
    }
    
    /**
     * Gets the "affiliation" element
     */
    public java.lang.String getAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AFFILIATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "affiliation" element
     */
    public org.apache.xmlbeans.XmlString xgetAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AFFILIATION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "affiliation" element
     */
    public boolean isSetAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AFFILIATION$4) != 0;
        }
    }
    
    /**
     * Sets the "affiliation" element
     */
    public void setAffiliation(java.lang.String affiliation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AFFILIATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AFFILIATION$4);
            }
            target.setStringValue(affiliation);
        }
    }
    
    /**
     * Sets (as xml) the "affiliation" element
     */
    public void xsetAffiliation(org.apache.xmlbeans.XmlString affiliation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AFFILIATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AFFILIATION$4);
            }
            target.set(affiliation);
        }
    }
    
    /**
     * Unsets the "affiliation" element
     */
    public void unsetAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AFFILIATION$4, 0);
        }
    }
    
    /**
     * Gets array of all "phone" elements
     */
    public java.lang.String[] getPhoneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PHONE$6, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$6, i);
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
            get_store().find_all_element_users(PHONE$6, targetList);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$6, i);
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
            return get_store().count_elements(PHONE$6);
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
            arraySetterHelper(phoneArray, PHONE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PHONE$6, i);
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
            arraySetterHelper(phoneArray, PHONE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PHONE$6, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PHONE$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PHONE$6);
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
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PHONE$6, i);
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
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PHONE$6);
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
            get_store().remove_element(PHONE$6, i);
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
            get_store().find_all_element_users(EMAIL$8, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$8, i);
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
            get_store().find_all_element_users(EMAIL$8, targetList);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$8, i);
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
            return get_store().count_elements(EMAIL$8);
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
            arraySetterHelper(emailArray, EMAIL$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$8, i);
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
            arraySetterHelper(emailArray, EMAIL$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAIL$8, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EMAIL$8, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(EMAIL$8, i);
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
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAIL$8);
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
            get_store().remove_element(EMAIL$8, i);
        }
    }
}
