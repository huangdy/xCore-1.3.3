/*
 * XML Type:  SOSConfigListType
 * Namespace: http://uicds.org/SOSConfig
 * Java type: org.uicds.sosConfig.SOSConfigListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sosConfig.impl;
/**
 * An XML SOSConfigListType(@http://uicds.org/SOSConfig).
 *
 * This is a complex type.
 */
public class SOSConfigListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sosConfig.SOSConfigListType
{
    private static final long serialVersionUID = 1L;
    
    public SOSConfigListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOS$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SOSConfig", "sos");
    
    
    /**
     * Gets array of all "sos" elements
     */
    public org.uicds.sosConfig.SOSConfigType[] getSosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOS$0, targetList);
            org.uicds.sosConfig.SOSConfigType[] result = new org.uicds.sosConfig.SOSConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sos" element
     */
    public org.uicds.sosConfig.SOSConfigType getSosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigType target = null;
            target = (org.uicds.sosConfig.SOSConfigType)get_store().find_element_user(SOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sos" element
     */
    public int sizeOfSosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOS$0);
        }
    }
    
    /**
     * Sets array of all "sos" element
     */
    public void setSosArray(org.uicds.sosConfig.SOSConfigType[] sosArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sosArray, SOS$0);
        }
    }
    
    /**
     * Sets ith "sos" element
     */
    public void setSosArray(int i, org.uicds.sosConfig.SOSConfigType sos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigType target = null;
            target = (org.uicds.sosConfig.SOSConfigType)get_store().find_element_user(SOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sos);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sos" element
     */
    public org.uicds.sosConfig.SOSConfigType insertNewSos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigType target = null;
            target = (org.uicds.sosConfig.SOSConfigType)get_store().insert_element_user(SOS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sos" element
     */
    public org.uicds.sosConfig.SOSConfigType addNewSos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigType target = null;
            target = (org.uicds.sosConfig.SOSConfigType)get_store().add_element_user(SOS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sos" element
     */
    public void removeSos(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOS$0, i);
        }
    }
}
