/*
 * XML Type:  UnsupportedPolicyRequestFaultType
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * An XML UnsupportedPolicyRequestFaultType(@http://docs.oasis-open.org/wsn/b-2).
 *
 * This is a complex type.
 */
public class UnsupportedPolicyRequestFaultTypeImpl extends org.oasisOpen.docs.wsrf.bf2.impl.BaseFaultTypeImpl implements org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType
{
    private static final long serialVersionUID = 1L;
    
    public UnsupportedPolicyRequestFaultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSUPPORTEDPOLICY$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnsupportedPolicy");
    
    
    /**
     * Gets array of all "UnsupportedPolicy" elements
     */
    public javax.xml.namespace.QName[] getUnsupportedPolicyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNSUPPORTEDPOLICY$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "UnsupportedPolicy" element
     */
    public javax.xml.namespace.QName getUnsupportedPolicyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSUPPORTEDPOLICY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "UnsupportedPolicy" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetUnsupportedPolicyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNSUPPORTEDPOLICY$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "UnsupportedPolicy" element
     */
    public org.apache.xmlbeans.XmlQName xgetUnsupportedPolicyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(UNSUPPORTEDPOLICY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "UnsupportedPolicy" element
     */
    public int sizeOfUnsupportedPolicyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNSUPPORTEDPOLICY$0);
        }
    }
    
    /**
     * Sets array of all "UnsupportedPolicy" element
     */
    public void setUnsupportedPolicyArray(javax.xml.namespace.QName[] unsupportedPolicyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unsupportedPolicyArray, UNSUPPORTEDPOLICY$0);
        }
    }
    
    /**
     * Sets ith "UnsupportedPolicy" element
     */
    public void setUnsupportedPolicyArray(int i, javax.xml.namespace.QName unsupportedPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSUPPORTEDPOLICY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(unsupportedPolicy);
        }
    }
    
    /**
     * Sets (as xml) array of all "UnsupportedPolicy" element
     */
    public void xsetUnsupportedPolicyArray(org.apache.xmlbeans.XmlQName[]unsupportedPolicyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unsupportedPolicyArray, UNSUPPORTEDPOLICY$0);
        }
    }
    
    /**
     * Sets (as xml) ith "UnsupportedPolicy" element
     */
    public void xsetUnsupportedPolicyArray(int i, org.apache.xmlbeans.XmlQName unsupportedPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(UNSUPPORTEDPOLICY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(unsupportedPolicy);
        }
    }
    
    /**
     * Inserts the value as the ith "UnsupportedPolicy" element
     */
    public void insertUnsupportedPolicy(int i, javax.xml.namespace.QName unsupportedPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UNSUPPORTEDPOLICY$0, i);
            target.setQNameValue(unsupportedPolicy);
        }
    }
    
    /**
     * Appends the value as the last "UnsupportedPolicy" element
     */
    public void addUnsupportedPolicy(javax.xml.namespace.QName unsupportedPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSUPPORTEDPOLICY$0);
            target.setQNameValue(unsupportedPolicy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UnsupportedPolicy" element
     */
    public org.apache.xmlbeans.XmlQName insertNewUnsupportedPolicy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(UNSUPPORTEDPOLICY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UnsupportedPolicy" element
     */
    public org.apache.xmlbeans.XmlQName addNewUnsupportedPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(UNSUPPORTEDPOLICY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "UnsupportedPolicy" element
     */
    public void removeUnsupportedPolicy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNSUPPORTEDPOLICY$0, i);
        }
    }
}
