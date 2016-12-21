/*
 * XML Type:  CoreConfigListType
 * Namespace: http://uicds.org/CoreConfig
 * Java type: org.uicds.coreConfig.CoreConfigListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.coreConfig.impl;
/**
 * An XML CoreConfigListType(@http://uicds.org/CoreConfig).
 *
 * This is a complex type.
 */
public class CoreConfigListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.coreConfig.CoreConfigListType
{
    private static final long serialVersionUID = 1L;
    
    public CoreConfigListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "Core");
    
    
    /**
     * Gets array of all "Core" elements
     */
    public org.uicds.coreConfig.CoreConfigType[] getCoreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CORE$0, targetList);
            org.uicds.coreConfig.CoreConfigType[] result = new org.uicds.coreConfig.CoreConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Core" element
     */
    public org.uicds.coreConfig.CoreConfigType getCoreArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreConfigType target = null;
            target = (org.uicds.coreConfig.CoreConfigType)get_store().find_element_user(CORE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Core" element
     */
    public int sizeOfCoreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORE$0);
        }
    }
    
    /**
     * Sets array of all "Core" element
     */
    public void setCoreArray(org.uicds.coreConfig.CoreConfigType[] coreArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(coreArray, CORE$0);
        }
    }
    
    /**
     * Sets ith "Core" element
     */
    public void setCoreArray(int i, org.uicds.coreConfig.CoreConfigType core)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreConfigType target = null;
            target = (org.uicds.coreConfig.CoreConfigType)get_store().find_element_user(CORE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(core);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Core" element
     */
    public org.uicds.coreConfig.CoreConfigType insertNewCore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreConfigType target = null;
            target = (org.uicds.coreConfig.CoreConfigType)get_store().insert_element_user(CORE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Core" element
     */
    public org.uicds.coreConfig.CoreConfigType addNewCore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreConfigType target = null;
            target = (org.uicds.coreConfig.CoreConfigType)get_store().add_element_user(CORE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Core" element
     */
    public void removeCore(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORE$0, i);
        }
    }
}
