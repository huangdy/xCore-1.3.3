/*
 * XML Type:  EdxlDeMessageResponseType
 * Namespace: http://uicds.org/ResourceManagementService
 * Java type: org.uicds.resourceManagementService.EdxlDeMessageResponseType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceManagementService.impl;
/**
 * An XML EdxlDeMessageResponseType(@http://uicds.org/ResourceManagementService).
 *
 * This is a complex type.
 */
public class EdxlDeMessageResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceManagementService.EdxlDeMessageResponseType
{
    private static final long serialVersionUID = 1L;
    
    public EdxlDeMessageResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROREXISTS$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceManagementService", "errorExists");
    private static final javax.xml.namespace.QName DIGEST$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Digest");
    private static final javax.xml.namespace.QName ERRORSTRING$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceManagementService", "errorString");
    private static final javax.xml.namespace.QName COREERROR$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceManagementService", "coreError");
    
    
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
     * Gets the "Digest" element
     */
    public gov.ucore.ucore.x20.DigestType getDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.DigestType target = null;
            target = (gov.ucore.ucore.x20.DigestType)get_store().find_element_user(DIGEST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Digest" element
     */
    public boolean isSetDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIGEST$2) != 0;
        }
    }
    
    /**
     * Sets the "Digest" element
     */
    public void setDigest(gov.ucore.ucore.x20.DigestType digest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.DigestType target = null;
            target = (gov.ucore.ucore.x20.DigestType)get_store().find_element_user(DIGEST$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.DigestType)get_store().add_element_user(DIGEST$2);
            }
            target.set(digest);
        }
    }
    
    /**
     * Appends and returns a new empty "Digest" element
     */
    public gov.ucore.ucore.x20.DigestType addNewDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.DigestType target = null;
            target = (gov.ucore.ucore.x20.DigestType)get_store().add_element_user(DIGEST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Digest" element
     */
    public void unsetDigest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIGEST$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORSTRING$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORSTRING$4, 0);
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
            return get_store().count_elements(ERRORSTRING$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORSTRING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORSTRING$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORSTRING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORSTRING$4);
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
            get_store().remove_element(ERRORSTRING$4, 0);
        }
    }
    
    /**
     * Gets array of all "coreError" elements
     */
    public org.uicds.resourceManagementService.EdxlDeMessageErrorType[] getCoreErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COREERROR$6, targetList);
            org.uicds.resourceManagementService.EdxlDeMessageErrorType[] result = new org.uicds.resourceManagementService.EdxlDeMessageErrorType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "coreError" element
     */
    public org.uicds.resourceManagementService.EdxlDeMessageErrorType getCoreErrorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.EdxlDeMessageErrorType target = null;
            target = (org.uicds.resourceManagementService.EdxlDeMessageErrorType)get_store().find_element_user(COREERROR$6, i);
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
            return get_store().count_elements(COREERROR$6);
        }
    }
    
    /**
     * Sets array of all "coreError" element
     */
    public void setCoreErrorArray(org.uicds.resourceManagementService.EdxlDeMessageErrorType[] coreErrorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(coreErrorArray, COREERROR$6);
        }
    }
    
    /**
     * Sets ith "coreError" element
     */
    public void setCoreErrorArray(int i, org.uicds.resourceManagementService.EdxlDeMessageErrorType coreError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.EdxlDeMessageErrorType target = null;
            target = (org.uicds.resourceManagementService.EdxlDeMessageErrorType)get_store().find_element_user(COREERROR$6, i);
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
    public org.uicds.resourceManagementService.EdxlDeMessageErrorType insertNewCoreError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.EdxlDeMessageErrorType target = null;
            target = (org.uicds.resourceManagementService.EdxlDeMessageErrorType)get_store().insert_element_user(COREERROR$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coreError" element
     */
    public org.uicds.resourceManagementService.EdxlDeMessageErrorType addNewCoreError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.EdxlDeMessageErrorType target = null;
            target = (org.uicds.resourceManagementService.EdxlDeMessageErrorType)get_store().add_element_user(COREERROR$6);
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
            get_store().remove_element(COREERROR$6, i);
        }
    }
}
