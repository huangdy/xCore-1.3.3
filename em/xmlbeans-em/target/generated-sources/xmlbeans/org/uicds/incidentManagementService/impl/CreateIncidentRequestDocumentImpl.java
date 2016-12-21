/*
 * An XML document type.
 * Localname: CreateIncidentRequest
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.CreateIncidentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one CreateIncidentRequest(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class CreateIncidentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.CreateIncidentRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateIncidentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEINCIDENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "CreateIncidentRequest");
    
    
    /**
     * Gets the "CreateIncidentRequest" element
     */
    public org.uicds.incidentManagementService.CreateIncidentRequestDocument.CreateIncidentRequest getCreateIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CreateIncidentRequestDocument.CreateIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.CreateIncidentRequestDocument.CreateIncidentRequest)get_store().find_element_user(CREATEINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateIncidentRequest" element
     */
    public void setCreateIncidentRequest(org.uicds.incidentManagementService.CreateIncidentRequestDocument.CreateIncidentRequest createIncidentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CreateIncidentRequestDocument.CreateIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.CreateIncidentRequestDocument.CreateIncidentRequest)get_store().find_element_user(CREATEINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.CreateIncidentRequestDocument.CreateIncidentRequest)get_store().add_element_user(CREATEINCIDENTREQUEST$0);
            }
            target.set(createIncidentRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateIncidentRequest" element
     */
    public org.uicds.incidentManagementService.CreateIncidentRequestDocument.CreateIncidentRequest addNewCreateIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CreateIncidentRequestDocument.CreateIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.CreateIncidentRequestDocument.CreateIncidentRequest)get_store().add_element_user(CREATEINCIDENTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateIncidentRequest(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class CreateIncidentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.CreateIncidentRequestDocument.CreateIncidentRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CreateIncidentRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENT$0 = 
            new javax.xml.namespace.QName("http://uicds.org/incident", "Incident");
        
        
        /**
         * Gets the "Incident" element
         */
        public org.uicds.incident.UICDSIncidentType getIncident()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.incident.UICDSIncidentType target = null;
                target = (org.uicds.incident.UICDSIncidentType)get_store().find_element_user(INCIDENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Incident" element
         */
        public void setIncident(org.uicds.incident.UICDSIncidentType incident)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.incident.UICDSIncidentType target = null;
                target = (org.uicds.incident.UICDSIncidentType)get_store().find_element_user(INCIDENT$0, 0);
                if (target == null)
                {
                    target = (org.uicds.incident.UICDSIncidentType)get_store().add_element_user(INCIDENT$0);
                }
                target.set(incident);
            }
        }
        
        /**
         * Appends and returns a new empty "Incident" element
         */
        public org.uicds.incident.UICDSIncidentType addNewIncident()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.incident.UICDSIncidentType target = null;
                target = (org.uicds.incident.UICDSIncidentType)get_store().add_element_user(INCIDENT$0);
                return target;
            }
        }
    }
}
