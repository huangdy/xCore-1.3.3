/*
 * An XML document type.
 * Localname: IncidentList
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.IncidentListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one IncidentList(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class IncidentListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.IncidentListDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncidentListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "IncidentList");
    
    
    /**
     * Gets the "IncidentList" element
     */
    public org.uicds.incidentManagementService.IncidentListType getIncidentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.IncidentListType target = null;
            target = (org.uicds.incidentManagementService.IncidentListType)get_store().find_element_user(INCIDENTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IncidentList" element
     */
    public void setIncidentList(org.uicds.incidentManagementService.IncidentListType incidentList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.IncidentListType target = null;
            target = (org.uicds.incidentManagementService.IncidentListType)get_store().find_element_user(INCIDENTLIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.IncidentListType)get_store().add_element_user(INCIDENTLIST$0);
            }
            target.set(incidentList);
        }
    }
    
    /**
     * Appends and returns a new empty "IncidentList" element
     */
    public org.uicds.incidentManagementService.IncidentListType addNewIncidentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.IncidentListType target = null;
            target = (org.uicds.incidentManagementService.IncidentListType)get_store().add_element_user(INCIDENTLIST$0);
            return target;
        }
    }
}
