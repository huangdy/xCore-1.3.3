/*
 * XML Type:  StringListType
 * Namespace: http://uicds.org/UICDSCommon
 * Java type: org.uicds.uicdsCommon.StringListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.uicdsCommon.impl;
/**
 * An XML StringListType(@http://uicds.org/UICDSCommon).
 *
 * This is a complex type.
 */
public class StringListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.uicdsCommon.StringListType
{
    private static final long serialVersionUID = 1L;
    
    public StringListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRINGVALUE1$0 = 
        new javax.xml.namespace.QName("http://uicds.org/UICDSCommon", "StringValue");
    
    
    /**
     * Gets array of all "StringValue" elements
     */
    public java.lang.String[] getStringValue1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRINGVALUE1$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "StringValue" element
     */
    public java.lang.String getStringValue1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGVALUE1$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "StringValue" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetStringValue1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STRINGVALUE1$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "StringValue" element
     */
    public org.apache.xmlbeans.XmlString xgetStringValue1Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALUE1$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "StringValue" element
     */
    public int sizeOfStringValue1Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STRINGVALUE1$0);
        }
    }
    
    /**
     * Sets array of all "StringValue" element
     */
    public void setStringValue1Array(java.lang.String[] stringValue1Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stringValue1Array, STRINGVALUE1$0);
        }
    }
    
    /**
     * Sets ith "StringValue" element
     */
    public void setStringValue1Array(int i, java.lang.String stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STRINGVALUE1$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(stringValue1);
        }
    }
    
    /**
     * Sets (as xml) array of all "StringValue" element
     */
    public void xsetStringValue1Array(org.apache.xmlbeans.XmlString[]stringValue1Array)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stringValue1Array, STRINGVALUE1$0);
        }
    }
    
    /**
     * Sets (as xml) ith "StringValue" element
     */
    public void xsetStringValue1Array(int i, org.apache.xmlbeans.XmlString stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STRINGVALUE1$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(stringValue1);
        }
    }
    
    /**
     * Inserts the value as the ith "StringValue" element
     */
    public void insertStringValue1(int i, java.lang.String stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(STRINGVALUE1$0, i);
            target.setStringValue(stringValue1);
        }
    }
    
    /**
     * Appends the value as the last "StringValue" element
     */
    public void addStringValue1(java.lang.String stringValue1)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STRINGVALUE1$0);
            target.setStringValue(stringValue1);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "StringValue" element
     */
    public org.apache.xmlbeans.XmlString insertNewStringValue1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(STRINGVALUE1$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "StringValue" element
     */
    public org.apache.xmlbeans.XmlString addNewStringValue1()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STRINGVALUE1$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "StringValue" element
     */
    public void removeStringValue1(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STRINGVALUE1$0, i);
        }
    }
}
