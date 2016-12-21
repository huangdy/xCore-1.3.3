/*
 * XML Type:  IdentificationListType
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.IdentificationListType
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * An XML IdentificationListType(@http://www.saic.com/precis/2009/06/base).
 *
 * This is a complex type.
 */
public class IdentificationListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.IdentificationListType
{
    private static final long serialVersionUID = 1L;
    
    public IdentificationListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Identification");
    
    
    /**
     * Gets array of all "Identification" elements
     */
    public com.saic.precis.x2009.x06.base.IdentificationType[] getIdentificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFICATION$0, targetList);
            com.saic.precis.x2009.x06.base.IdentificationType[] result = new com.saic.precis.x2009.x06.base.IdentificationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Identification" element
     */
    public com.saic.precis.x2009.x06.base.IdentificationType getIdentificationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(IDENTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Identification" element
     */
    public int sizeOfIdentificationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFICATION$0);
        }
    }
    
    /**
     * Sets array of all "Identification" element
     */
    public void setIdentificationArray(com.saic.precis.x2009.x06.base.IdentificationType[] identificationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identificationArray, IDENTIFICATION$0);
        }
    }
    
    /**
     * Sets ith "Identification" element
     */
    public void setIdentificationArray(int i, com.saic.precis.x2009.x06.base.IdentificationType identification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(IDENTIFICATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identification);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Identification" element
     */
    public com.saic.precis.x2009.x06.base.IdentificationType insertNewIdentification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().insert_element_user(IDENTIFICATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Identification" element
     */
    public com.saic.precis.x2009.x06.base.IdentificationType addNewIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(IDENTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Identification" element
     */
    public void removeIdentification(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFICATION$0, i);
        }
    }
}
