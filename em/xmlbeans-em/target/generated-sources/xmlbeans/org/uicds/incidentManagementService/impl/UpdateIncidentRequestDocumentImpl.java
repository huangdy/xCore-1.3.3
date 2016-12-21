/*
 * An XML document type.
 * Localname: UpdateIncidentRequest
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.UpdateIncidentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one UpdateIncidentRequest(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class UpdateIncidentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.UpdateIncidentRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateIncidentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEINCIDENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "UpdateIncidentRequest");
    
    
    /**
     * Gets the "UpdateIncidentRequest" element
     */
    public org.uicds.incidentManagementService.UpdateIncidentRequestDocument.UpdateIncidentRequest getUpdateIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.UpdateIncidentRequestDocument.UpdateIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.UpdateIncidentRequestDocument.UpdateIncidentRequest)get_store().find_element_user(UPDATEINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateIncidentRequest" element
     */
    public void setUpdateIncidentRequest(org.uicds.incidentManagementService.UpdateIncidentRequestDocument.UpdateIncidentRequest updateIncidentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.UpdateIncidentRequestDocument.UpdateIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.UpdateIncidentRequestDocument.UpdateIncidentRequest)get_store().find_element_user(UPDATEINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.UpdateIncidentRequestDocument.UpdateIncidentRequest)get_store().add_element_user(UPDATEINCIDENTREQUEST$0);
            }
            target.set(updateIncidentRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateIncidentRequest" element
     */
    public org.uicds.incidentManagementService.UpdateIncidentRequestDocument.UpdateIncidentRequest addNewUpdateIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.UpdateIncidentRequestDocument.UpdateIncidentRequest target = null;
            target = (org.uicds.incidentManagementService.UpdateIncidentRequestDocument.UpdateIncidentRequest)get_store().add_element_user(UPDATEINCIDENTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UpdateIncidentRequest(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class UpdateIncidentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.UpdateIncidentRequestDocument.UpdateIncidentRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateIncidentRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        private static final javax.xml.namespace.QName INCIDENT$2 = 
            new javax.xml.namespace.QName("http://uicds.org/incident", "Incident");
        
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductIdentification" element
         */
        public void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                }
                target.set(workProductIdentification);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                return target;
            }
        }
        
        /**
         * Gets the "Incident" element
         */
        public org.uicds.incident.UICDSIncidentType getIncident()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.incident.UICDSIncidentType target = null;
                target = (org.uicds.incident.UICDSIncidentType)get_store().find_element_user(INCIDENT$2, 0);
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
                target = (org.uicds.incident.UICDSIncidentType)get_store().find_element_user(INCIDENT$2, 0);
                if (target == null)
                {
                    target = (org.uicds.incident.UICDSIncidentType)get_store().add_element_user(INCIDENT$2);
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
                target = (org.uicds.incident.UICDSIncidentType)get_store().add_element_user(INCIDENT$2);
                return target;
            }
        }
    }
}
