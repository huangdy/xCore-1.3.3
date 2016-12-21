/*
 * XML Type:  InvalidFilterFaultType
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.InvalidFilterFaultType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * An XML InvalidFilterFaultType(@http://docs.oasis-open.org/wsn/b-2).
 *
 * This is a complex type.
 */
public class InvalidFilterFaultTypeImpl extends org.oasisOpen.docs.wsrf.bf2.impl.BaseFaultTypeImpl implements org.oasisOpen.docs.wsn.b2.InvalidFilterFaultType
{
    private static final long serialVersionUID = 1L;
    
    public InvalidFilterFaultTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNKNOWNFILTER$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnknownFilter");
    
    
    /**
     * Gets array of all "UnknownFilter" elements
     */
    public javax.xml.namespace.QName[] getUnknownFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNKNOWNFILTER$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "UnknownFilter" element
     */
    public javax.xml.namespace.QName getUnknownFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNKNOWNFILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "UnknownFilter" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetUnknownFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNKNOWNFILTER$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "UnknownFilter" element
     */
    public org.apache.xmlbeans.XmlQName xgetUnknownFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(UNKNOWNFILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "UnknownFilter" element
     */
    public int sizeOfUnknownFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNKNOWNFILTER$0);
        }
    }
    
    /**
     * Sets array of all "UnknownFilter" element
     */
    public void setUnknownFilterArray(javax.xml.namespace.QName[] unknownFilterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unknownFilterArray, UNKNOWNFILTER$0);
        }
    }
    
    /**
     * Sets ith "UnknownFilter" element
     */
    public void setUnknownFilterArray(int i, javax.xml.namespace.QName unknownFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNKNOWNFILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(unknownFilter);
        }
    }
    
    /**
     * Sets (as xml) array of all "UnknownFilter" element
     */
    public void xsetUnknownFilterArray(org.apache.xmlbeans.XmlQName[]unknownFilterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unknownFilterArray, UNKNOWNFILTER$0);
        }
    }
    
    /**
     * Sets (as xml) ith "UnknownFilter" element
     */
    public void xsetUnknownFilterArray(int i, org.apache.xmlbeans.XmlQName unknownFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(UNKNOWNFILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(unknownFilter);
        }
    }
    
    /**
     * Inserts the value as the ith "UnknownFilter" element
     */
    public void insertUnknownFilter(int i, javax.xml.namespace.QName unknownFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(UNKNOWNFILTER$0, i);
            target.setQNameValue(unknownFilter);
        }
    }
    
    /**
     * Appends the value as the last "UnknownFilter" element
     */
    public void addUnknownFilter(javax.xml.namespace.QName unknownFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNKNOWNFILTER$0);
            target.setQNameValue(unknownFilter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "UnknownFilter" element
     */
    public org.apache.xmlbeans.XmlQName insertNewUnknownFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(UNKNOWNFILTER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "UnknownFilter" element
     */
    public org.apache.xmlbeans.XmlQName addNewUnknownFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(UNKNOWNFILTER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "UnknownFilter" element
     */
    public void removeUnknownFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNKNOWNFILTER$0, i);
        }
    }
}
