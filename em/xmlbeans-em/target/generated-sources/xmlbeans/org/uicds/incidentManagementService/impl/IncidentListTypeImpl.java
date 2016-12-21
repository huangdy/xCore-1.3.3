/*
 * XML Type:  IncidentListType
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.IncidentListType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * An XML IncidentListType(@http://uicds.org/IncidentManagementService).
 *
 * This is a complex type.
 */
public class IncidentListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.IncidentListType
{
    private static final long serialVersionUID = 1L;
    
    public IncidentListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTINFO$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "IncidentInfo");
    
    
    /**
     * Gets array of all "IncidentInfo" elements
     */
    public org.uicds.incidentManagementService.IncidentInfoType[] getIncidentInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INCIDENTINFO$0, targetList);
            org.uicds.incidentManagementService.IncidentInfoType[] result = new org.uicds.incidentManagementService.IncidentInfoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "IncidentInfo" element
     */
    public org.uicds.incidentManagementService.IncidentInfoType getIncidentInfoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.IncidentInfoType target = null;
            target = (org.uicds.incidentManagementService.IncidentInfoType)get_store().find_element_user(INCIDENTINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "IncidentInfo" element
     */
    public int sizeOfIncidentInfoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCIDENTINFO$0);
        }
    }
    
    /**
     * Sets array of all "IncidentInfo" element
     */
    public void setIncidentInfoArray(org.uicds.incidentManagementService.IncidentInfoType[] incidentInfoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(incidentInfoArray, INCIDENTINFO$0);
        }
    }
    
    /**
     * Sets ith "IncidentInfo" element
     */
    public void setIncidentInfoArray(int i, org.uicds.incidentManagementService.IncidentInfoType incidentInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.IncidentInfoType target = null;
            target = (org.uicds.incidentManagementService.IncidentInfoType)get_store().find_element_user(INCIDENTINFO$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(incidentInfo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "IncidentInfo" element
     */
    public org.uicds.incidentManagementService.IncidentInfoType insertNewIncidentInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.IncidentInfoType target = null;
            target = (org.uicds.incidentManagementService.IncidentInfoType)get_store().insert_element_user(INCIDENTINFO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "IncidentInfo" element
     */
    public org.uicds.incidentManagementService.IncidentInfoType addNewIncidentInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.IncidentInfoType target = null;
            target = (org.uicds.incidentManagementService.IncidentInfoType)get_store().add_element_user(INCIDENTINFO$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "IncidentInfo" element
     */
    public void removeIncidentInfo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCIDENTINFO$0, i);
        }
    }
}
