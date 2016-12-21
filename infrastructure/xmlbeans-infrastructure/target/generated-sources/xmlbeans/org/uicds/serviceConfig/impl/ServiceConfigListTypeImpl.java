/*
 * XML Type:  ServiceConfigListType
 * Namespace: http://uicds.org/ServiceConfig
 * Java type: org.uicds.serviceConfig.ServiceConfigListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.serviceConfig.impl;
/**
 * An XML ServiceConfigListType(@http://uicds.org/ServiceConfig).
 *
 * This is a complex type.
 */
public class ServiceConfigListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.serviceConfig.ServiceConfigListType
{
    private static final long serialVersionUID = 1L;
    
    public ServiceConfigListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ServiceConfig", "Service");
    
    
    /**
     * Gets array of all "Service" elements
     */
    public org.uicds.serviceConfig.ServiceConfigType[] getServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICE$0, targetList);
            org.uicds.serviceConfig.ServiceConfigType[] result = new org.uicds.serviceConfig.ServiceConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Service" element
     */
    public org.uicds.serviceConfig.ServiceConfigType getServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigType)get_store().find_element_user(SERVICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Service" element
     */
    public int sizeOfServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE$0);
        }
    }
    
    /**
     * Sets array of all "Service" element
     */
    public void setServiceArray(org.uicds.serviceConfig.ServiceConfigType[] serviceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceArray, SERVICE$0);
        }
    }
    
    /**
     * Sets ith "Service" element
     */
    public void setServiceArray(int i, org.uicds.serviceConfig.ServiceConfigType service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigType)get_store().find_element_user(SERVICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(service);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Service" element
     */
    public org.uicds.serviceConfig.ServiceConfigType insertNewService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigType)get_store().insert_element_user(SERVICE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Service" element
     */
    public org.uicds.serviceConfig.ServiceConfigType addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigType)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Service" element
     */
    public void removeService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE$0, i);
        }
    }
}
