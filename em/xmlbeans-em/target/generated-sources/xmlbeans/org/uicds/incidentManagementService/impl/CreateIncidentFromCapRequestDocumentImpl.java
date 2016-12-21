/*
 * An XML document type.
 * Localname: CreateIncidentFromCapRequest
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one CreateIncidentFromCapRequest(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class CreateIncidentFromCapRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateIncidentFromCapRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEINCIDENTFROMCAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "CreateIncidentFromCapRequest");
    
    
    /**
     * Gets the "CreateIncidentFromCapRequest" element
     */
    public org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest getCreateIncidentFromCapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest target = null;
            target = (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest)get_store().find_element_user(CREATEINCIDENTFROMCAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateIncidentFromCapRequest" element
     */
    public void setCreateIncidentFromCapRequest(org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest createIncidentFromCapRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest target = null;
            target = (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest)get_store().find_element_user(CREATEINCIDENTFROMCAPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest)get_store().add_element_user(CREATEINCIDENTFROMCAPREQUEST$0);
            }
            target.set(createIncidentFromCapRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateIncidentFromCapRequest" element
     */
    public org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest addNewCreateIncidentFromCapRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest target = null;
            target = (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest)get_store().add_element_user(CREATEINCIDENTFROMCAPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateIncidentFromCapRequest(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class CreateIncidentFromCapRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CreateIncidentFromCapRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ALERT$0 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "alert");
        
        
        /**
         * Gets the "alert" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert getAlert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().find_element_user(ALERT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "alert" element
         */
        public void setAlert(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert alert)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().find_element_user(ALERT$0, 0);
                if (target == null)
                {
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().add_element_user(ALERT$0);
                }
                target.set(alert);
            }
        }
        
        /**
         * Appends and returns a new empty "alert" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert addNewAlert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().add_element_user(ALERT$0);
                return target;
            }
        }
    }
}
