/*
 * An XML document type.
 * Localname: IncidentInfo
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.IncidentInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one IncidentInfo(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class IncidentInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.IncidentInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncidentInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTINFO$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "IncidentInfo");
    
    
    /**
     * Gets the "IncidentInfo" element
     */
    public org.uicds.incidentManagementService.IncidentInfoType getIncidentInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.IncidentInfoType target = null;
            target = (org.uicds.incidentManagementService.IncidentInfoType)get_store().find_element_user(INCIDENTINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IncidentInfo" element
     */
    public void setIncidentInfo(org.uicds.incidentManagementService.IncidentInfoType incidentInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.IncidentInfoType target = null;
            target = (org.uicds.incidentManagementService.IncidentInfoType)get_store().find_element_user(INCIDENTINFO$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.IncidentInfoType)get_store().add_element_user(INCIDENTINFO$0);
            }
            target.set(incidentInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "IncidentInfo" element
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
}
