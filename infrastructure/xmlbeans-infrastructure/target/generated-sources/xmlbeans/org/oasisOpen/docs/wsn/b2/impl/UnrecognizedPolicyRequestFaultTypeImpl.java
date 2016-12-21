/*
 * XML Type:  UnrecognizedPolicyRequestFaultType
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * An XML UnrecognizedPolicyRequestFaultType(@http://docs.oasis-open.org/wsn/b-2).
 *
 * This is a complex type.
 */
public class UnrecognizedPolicyRequestFaultTypeImpl extends org.oasisOpen.docs.wsrf.bf2.impl.BaseFaultTypeImpl implements org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType
{
    private static final long serialVersionUID = 1L;
    
    public UnrecognizedPolicyRequestFaultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNRECOGNIZEDPOLICY$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnrecognizedPolicy");
    
    
    /**
     * Gets array of all "UnrecognizedPolicy" elements
     */
    public javax.xml.namespace.QName[] getUnrecognizedPolicyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNRECOGNIZEDPOLICY$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "UnrecognizedPolicy" element
     */
    public javax.xml.namespace.QName getUnrecognizedPolicyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNRECOGNIZEDPOLICY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "UnrecognizedPolicy" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetUnrecognizedPolicyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNRECOGNIZEDPOLICY$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "UnrecognizedPolicy" element
     */
    public org.apache.xmlbeans.XmlQName xgetUnrecognizedPolicyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(UNRECOGNIZEDPOLICY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "UnrecognizedPolicy" element
     */
    public int sizeOfUnrecognizedPolicyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNRECOGNIZEDPOLICY$0);
        }
    }
    
    /**
     * Sets array of all "UnrecognizedPolicy" element
     */
    public void setUnrecognizedPolicyArray(javax.xml.namespace.QName[] unrecognizedPolicyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unrecognizedPolicyArray, UNRECOGNIZEDPOLICY$0);
        }
    }
    
    /**
     * Sets ith "UnrecognizedPolicy" element
     */
    public void setUnrecognizedPolicyArray(int i, javax.xml.namespace.QName unrecognizedPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNRECOGNIZEDPOLICY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(unrecognizedPolicy);
        }
    }
    
    /**
     * Sets (as xml) array of all "UnrecognizedPolicy" element
     */
    public void xsetUnrecognizedPolicyArray(org.apache.xmlbeans.XmlQName[]unrecognizedPolicyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unrecognizedPolicyArray, UNRECOGNIZEDPOLICY$0);
        }
    }
    
    /**
     * Sets (as xml) ith "UnrecognizedPolicy" element
     */
    public void xsetUnrecognizedPolicyArray(int i, org.apache.xmlbeans.XmlQName unrecognizedPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(UNRECOGNIZEDPOLICY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(unrecognizedPolicy);
        }
    }
    
    /**
     * Inserts the value as the ith "UnrecognizedPolicy" element
     */
    public void insertUnrecognizedPolicy(int i, javax.xml.namespace.QName unrecognizedPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UNRECOGNIZEDPOLICY$0, i);
            target.setQNameValue(unrecognizedPolicy);
        }
    }
    
    /**
     * Appends the value as the last "UnrecognizedPolicy" element
     */
    public void addUnrecognizedPolicy(javax.xml.namespace.QName unrecognizedPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNRECOGNIZEDPOLICY$0);
            target.setQNameValue(unrecognizedPolicy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UnrecognizedPolicy" element
     */
    public org.apache.xmlbeans.XmlQName insertNewUnrecognizedPolicy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(UNRECOGNIZEDPOLICY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UnrecognizedPolicy" element
     */
    public org.apache.xmlbeans.XmlQName addNewUnrecognizedPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(UNRECOGNIZEDPOLICY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "UnrecognizedPolicy" element
     */
    public void removeUnrecognizedPolicy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNRECOGNIZEDPOLICY$0, i);
        }
    }
}
