/*
 * XML Type:  NamespaceMapType
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.NamespaceMapType
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * An XML NamespaceMapType(@http://www.saic.com/precis/2009/06/base).
 *
 * This is a complex type.
 */
public class NamespaceMapTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.NamespaceMapType
{
    private static final long serialVersionUID = 1L;
    
    public NamespaceMapTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ITEM$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Item");
    
    
    /**
     * Gets array of all "Item" elements
     */
    public com.saic.precis.x2009.x06.base.NamespaceMapItemType[] getItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEM$0, targetList);
            com.saic.precis.x2009.x06.base.NamespaceMapItemType[] result = new com.saic.precis.x2009.x06.base.NamespaceMapItemType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Item" element
     */
    public com.saic.precis.x2009.x06.base.NamespaceMapItemType getItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.NamespaceMapItemType target = null;
            target = (com.saic.precis.x2009.x06.base.NamespaceMapItemType)get_store().find_element_user(ITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Item" element
     */
    public int sizeOfItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEM$0);
        }
    }
    
    /**
     * Sets array of all "Item" element
     */
    public void setItemArray(com.saic.precis.x2009.x06.base.NamespaceMapItemType[] itemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(itemArray, ITEM$0);
        }
    }
    
    /**
     * Sets ith "Item" element
     */
    public void setItemArray(int i, com.saic.precis.x2009.x06.base.NamespaceMapItemType item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.NamespaceMapItemType target = null;
            target = (com.saic.precis.x2009.x06.base.NamespaceMapItemType)get_store().find_element_user(ITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(item);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Item" element
     */
    public com.saic.precis.x2009.x06.base.NamespaceMapItemType insertNewItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.NamespaceMapItemType target = null;
            target = (com.saic.precis.x2009.x06.base.NamespaceMapItemType)get_store().insert_element_user(ITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Item" element
     */
    public com.saic.precis.x2009.x06.base.NamespaceMapItemType addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.NamespaceMapItemType target = null;
            target = (com.saic.precis.x2009.x06.base.NamespaceMapItemType)get_store().add_element_user(ITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Item" element
     */
    public void removeItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEM$0, i);
        }
    }
}
