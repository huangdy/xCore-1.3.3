/*
 * XML Type:  IAPComponentListType
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.IAPComponentListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * An XML IAPComponentListType(@http://uicds.org/IAPService).
 *
 * This is a complex type.
 */
public class IAPComponentListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.IAPComponentListType
{
    private static final long serialVersionUID = 1L;
    
    public IAPComponentListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENT$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "component");
    
    
    /**
     * Gets array of all "component" elements
     */
    public org.uicds.iapService.IAPComponentType[] getComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMPONENT$0, targetList);
            org.uicds.iapService.IAPComponentType[] result = new org.uicds.iapService.IAPComponentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "component" element
     */
    public org.uicds.iapService.IAPComponentType getComponentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentType target = null;
            target = (org.uicds.iapService.IAPComponentType)get_store().find_element_user(COMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "component" element
     */
    public int sizeOfComponentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENT$0);
        }
    }
    
    /**
     * Sets array of all "component" element
     */
    public void setComponentArray(org.uicds.iapService.IAPComponentType[] componentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(componentArray, COMPONENT$0);
        }
    }
    
    /**
     * Sets ith "component" element
     */
    public void setComponentArray(int i, org.uicds.iapService.IAPComponentType component)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentType target = null;
            target = (org.uicds.iapService.IAPComponentType)get_store().find_element_user(COMPONENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(component);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "component" element
     */
    public org.uicds.iapService.IAPComponentType insertNewComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentType target = null;
            target = (org.uicds.iapService.IAPComponentType)get_store().insert_element_user(COMPONENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "component" element
     */
    public org.uicds.iapService.IAPComponentType addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IAPComponentType target = null;
            target = (org.uicds.iapService.IAPComponentType)get_store().add_element_user(COMPONENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "component" element
     */
    public void removeComponent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENT$0, i);
        }
    }
}
