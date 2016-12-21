/*
 * XML Type:  ExternalDataSourceConfigListType
 * Namespace: http://uicds.org/ExternalDataSourceConfig
 * Java type: org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.externalDataSourceConfig.impl;
/**
 * An XML ExternalDataSourceConfigListType(@http://uicds.org/ExternalDataSourceConfig).
 *
 * This is a complex type.
 */
public class ExternalDataSourceConfigListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.externalDataSourceConfig.ExternalDataSourceConfigListType
{
    private static final long serialVersionUID = 1L;
    
    public ExternalDataSourceConfigListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALDATASOURCE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalDataSourceConfig", "ExternalDataSource");
    
    
    /**
     * Gets array of all "ExternalDataSource" elements
     */
    public org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType[] getExternalDataSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTERNALDATASOURCE$0, targetList);
            org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType[] result = new org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ExternalDataSource" element
     */
    public org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType getExternalDataSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType target = null;
            target = (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType)get_store().find_element_user(EXTERNALDATASOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ExternalDataSource" element
     */
    public int sizeOfExternalDataSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALDATASOURCE$0);
        }
    }
    
    /**
     * Sets array of all "ExternalDataSource" element
     */
    public void setExternalDataSourceArray(org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType[] externalDataSourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(externalDataSourceArray, EXTERNALDATASOURCE$0);
        }
    }
    
    /**
     * Sets ith "ExternalDataSource" element
     */
    public void setExternalDataSourceArray(int i, org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType externalDataSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType target = null;
            target = (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType)get_store().find_element_user(EXTERNALDATASOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(externalDataSource);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExternalDataSource" element
     */
    public org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType insertNewExternalDataSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType target = null;
            target = (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType)get_store().insert_element_user(EXTERNALDATASOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExternalDataSource" element
     */
    public org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType addNewExternalDataSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType target = null;
            target = (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType)get_store().add_element_user(EXTERNALDATASOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ExternalDataSource" element
     */
    public void removeExternalDataSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALDATASOURCE$0, i);
        }
    }
}
