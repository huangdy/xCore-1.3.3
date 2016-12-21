/*
 * XML Type:  ExternalToolConfigListType
 * Namespace: http://uicds.org/ExternalToolConfig
 * Java type: org.uicds.externalToolConfig.ExternalToolConfigListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.externalToolConfig.impl;
/**
 * An XML ExternalToolConfigListType(@http://uicds.org/ExternalToolConfig).
 *
 * This is a complex type.
 */
public class ExternalToolConfigListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.externalToolConfig.ExternalToolConfigListType
{
    private static final long serialVersionUID = 1L;
    
    public ExternalToolConfigListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTERNALTOOL$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ExternalToolConfig", "ExternalTool");
    
    
    /**
     * Gets array of all "ExternalTool" elements
     */
    public org.uicds.externalToolConfig.ExternalToolConfigType[] getExternalToolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTERNALTOOL$0, targetList);
            org.uicds.externalToolConfig.ExternalToolConfigType[] result = new org.uicds.externalToolConfig.ExternalToolConfigType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ExternalTool" element
     */
    public org.uicds.externalToolConfig.ExternalToolConfigType getExternalToolArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigType)get_store().find_element_user(EXTERNALTOOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ExternalTool" element
     */
    public int sizeOfExternalToolArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALTOOL$0);
        }
    }
    
    /**
     * Sets array of all "ExternalTool" element
     */
    public void setExternalToolArray(org.uicds.externalToolConfig.ExternalToolConfigType[] externalToolArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(externalToolArray, EXTERNALTOOL$0);
        }
    }
    
    /**
     * Sets ith "ExternalTool" element
     */
    public void setExternalToolArray(int i, org.uicds.externalToolConfig.ExternalToolConfigType externalTool)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigType)get_store().find_element_user(EXTERNALTOOL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(externalTool);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExternalTool" element
     */
    public org.uicds.externalToolConfig.ExternalToolConfigType insertNewExternalTool(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigType)get_store().insert_element_user(EXTERNALTOOL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExternalTool" element
     */
    public org.uicds.externalToolConfig.ExternalToolConfigType addNewExternalTool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.externalToolConfig.ExternalToolConfigType target = null;
            target = (org.uicds.externalToolConfig.ExternalToolConfigType)get_store().add_element_user(EXTERNALTOOL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ExternalTool" element
     */
    public void removeExternalTool(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALTOOL$0, i);
        }
    }
}
