/*
 * An XML document type.
 * Localname: UpdateIncidentResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.UpdateIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one UpdateIncidentResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class UpdateIncidentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.UpdateIncidentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateIncidentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEINCIDENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "UpdateIncidentResponse");
    
    
    /**
     * Gets the "UpdateIncidentResponse" element
     */
    public org.uicds.incidentManagementService.UpdateIncidentResponseDocument.UpdateIncidentResponse getUpdateIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.UpdateIncidentResponseDocument.UpdateIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.UpdateIncidentResponseDocument.UpdateIncidentResponse)get_store().find_element_user(UPDATEINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateIncidentResponse" element
     */
    public void setUpdateIncidentResponse(org.uicds.incidentManagementService.UpdateIncidentResponseDocument.UpdateIncidentResponse updateIncidentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.UpdateIncidentResponseDocument.UpdateIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.UpdateIncidentResponseDocument.UpdateIncidentResponse)get_store().find_element_user(UPDATEINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.UpdateIncidentResponseDocument.UpdateIncidentResponse)get_store().add_element_user(UPDATEINCIDENTRESPONSE$0);
            }
            target.set(updateIncidentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateIncidentResponse" element
     */
    public org.uicds.incidentManagementService.UpdateIncidentResponseDocument.UpdateIncidentResponse addNewUpdateIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.UpdateIncidentResponseDocument.UpdateIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.UpdateIncidentResponseDocument.UpdateIncidentResponse)get_store().add_element_user(UPDATEINCIDENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateIncidentResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class UpdateIncidentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.UpdateIncidentResponseDocument.UpdateIncidentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateIncidentResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTPUBLICATIONRESPONSE$0 = 
            new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductPublicationResponse");
        
        
        /**
         * Gets the "WorkProductPublicationResponse" element
         */
        public org.uicds.workProductService.WorkProductPublicationResponseType getWorkProductPublicationResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workProductService.WorkProductPublicationResponseType target = null;
                target = (org.uicds.workProductService.WorkProductPublicationResponseType)get_store().find_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductPublicationResponse" element
         */
        public void setWorkProductPublicationResponse(org.uicds.workProductService.WorkProductPublicationResponseType workProductPublicationResponse)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workProductService.WorkProductPublicationResponseType target = null;
                target = (org.uicds.workProductService.WorkProductPublicationResponseType)get_store().find_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0, 0);
                if (target == null)
                {
                    target = (org.uicds.workProductService.WorkProductPublicationResponseType)get_store().add_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0);
                }
                target.set(workProductPublicationResponse);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductPublicationResponse" element
         */
        public org.uicds.workProductService.WorkProductPublicationResponseType addNewWorkProductPublicationResponse()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workProductService.WorkProductPublicationResponseType target = null;
                target = (org.uicds.workProductService.WorkProductPublicationResponseType)get_store().add_element_user(WORKPRODUCTPUBLICATIONRESPONSE$0);
                return target;
            }
        }
    }
}
