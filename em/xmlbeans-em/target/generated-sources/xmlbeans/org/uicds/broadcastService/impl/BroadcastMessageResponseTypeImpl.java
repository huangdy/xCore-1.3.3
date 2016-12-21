/*
 * XML Type:  BroadcastMessageResponseType
 * Namespace: http://uicds.org/BroadcastService
 * Java type: org.uicds.broadcastService.BroadcastMessageResponseType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.broadcastService.impl;
/**
 * An XML BroadcastMessageResponseType(@http://uicds.org/BroadcastService).
 *
 * This is a complex type.
 */
public class BroadcastMessageResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.broadcastService.BroadcastMessageResponseType
{
    private static final long serialVersionUID = 1L;
    
    public BroadcastMessageResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROREXISTS$0 = 
        new javax.xml.namespace.QName("http://uicds.org/BroadcastService", "errorExists");
    private static final javax.xml.namespace.QName ERRORSTRING$2 = 
        new javax.xml.namespace.QName("http://uicds.org/BroadcastService", "errorString");
    private static final javax.xml.namespace.QName COREERROR$4 = 
        new javax.xml.namespace.QName("http://uicds.org/BroadcastService", "coreError");
    
    
    /**
     * Gets the "errorExists" element
     */
    public boolean getErrorExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROREXISTS$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorExists" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetErrorExists()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ERROREXISTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "errorExists" element
     */
    public void setErrorExists(boolean errorExists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROREXISTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROREXISTS$0);
            }
            target.setBooleanValue(errorExists);
        }
    }
    
    /**
     * Sets (as xml) the "errorExists" element
     */
    public void xsetErrorExists(org.apache.xmlbeans.XmlBoolean errorExists)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ERROREXISTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ERROREXISTS$0);
            }
            target.set(errorExists);
        }
    }
    
    /**
     * Gets the "errorString" element
     */
    public java.lang.String getErrorString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORSTRING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "errorString" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORSTRING$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "errorString" element
     */
    public boolean isSetErrorString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORSTRING$2) != 0;
        }
    }
    
    /**
     * Sets the "errorString" element
     */
    public void setErrorString(java.lang.String errorString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORSTRING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORSTRING$2);
            }
            target.setStringValue(errorString);
        }
    }
    
    /**
     * Sets (as xml) the "errorString" element
     */
    public void xsetErrorString(org.apache.xmlbeans.XmlString errorString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORSTRING$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORSTRING$2);
            }
            target.set(errorString);
        }
    }
    
    /**
     * Unsets the "errorString" element
     */
    public void unsetErrorString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORSTRING$2, 0);
        }
    }
    
    /**
     * Gets array of all "coreError" elements
     */
    public org.uicds.broadcastService.BroadcastMessageErrorType[] getCoreErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COREERROR$4, targetList);
            org.uicds.broadcastService.BroadcastMessageErrorType[] result = new org.uicds.broadcastService.BroadcastMessageErrorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "coreError" element
     */
    public org.uicds.broadcastService.BroadcastMessageErrorType getCoreErrorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.broadcastService.BroadcastMessageErrorType target = null;
            target = (org.uicds.broadcastService.BroadcastMessageErrorType)get_store().find_element_user(COREERROR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "coreError" element
     */
    public int sizeOfCoreErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COREERROR$4);
        }
    }
    
    /**
     * Sets array of all "coreError" element
     */
    public void setCoreErrorArray(org.uicds.broadcastService.BroadcastMessageErrorType[] coreErrorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(coreErrorArray, COREERROR$4);
        }
    }
    
    /**
     * Sets ith "coreError" element
     */
    public void setCoreErrorArray(int i, org.uicds.broadcastService.BroadcastMessageErrorType coreError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.broadcastService.BroadcastMessageErrorType target = null;
            target = (org.uicds.broadcastService.BroadcastMessageErrorType)get_store().find_element_user(COREERROR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(coreError);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "coreError" element
     */
    public org.uicds.broadcastService.BroadcastMessageErrorType insertNewCoreError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.broadcastService.BroadcastMessageErrorType target = null;
            target = (org.uicds.broadcastService.BroadcastMessageErrorType)get_store().insert_element_user(COREERROR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coreError" element
     */
    public org.uicds.broadcastService.BroadcastMessageErrorType addNewCoreError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.broadcastService.BroadcastMessageErrorType target = null;
            target = (org.uicds.broadcastService.BroadcastMessageErrorType)get_store().add_element_user(COREERROR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "coreError" element
     */
    public void removeCoreError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COREERROR$4, i);
        }
    }
}
