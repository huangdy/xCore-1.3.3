/*
 * An XML document type.
 * Localname: CreateIncidentResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.CreateIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one CreateIncidentResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class CreateIncidentResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.CreateIncidentResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateIncidentResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEINCIDENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "CreateIncidentResponse");
    
    
    /**
     * Gets the "CreateIncidentResponse" element
     */
    public org.uicds.incidentManagementService.CreateIncidentResponseDocument.CreateIncidentResponse getCreateIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CreateIncidentResponseDocument.CreateIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.CreateIncidentResponseDocument.CreateIncidentResponse)get_store().find_element_user(CREATEINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateIncidentResponse" element
     */
    public void setCreateIncidentResponse(org.uicds.incidentManagementService.CreateIncidentResponseDocument.CreateIncidentResponse createIncidentResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CreateIncidentResponseDocument.CreateIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.CreateIncidentResponseDocument.CreateIncidentResponse)get_store().find_element_user(CREATEINCIDENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.CreateIncidentResponseDocument.CreateIncidentResponse)get_store().add_element_user(CREATEINCIDENTRESPONSE$0);
            }
            target.set(createIncidentResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateIncidentResponse" element
     */
    public org.uicds.incidentManagementService.CreateIncidentResponseDocument.CreateIncidentResponse addNewCreateIncidentResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CreateIncidentResponseDocument.CreateIncidentResponse target = null;
            target = (org.uicds.incidentManagementService.CreateIncidentResponseDocument.CreateIncidentResponse)get_store().add_element_user(CREATEINCIDENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateIncidentResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class CreateIncidentResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.CreateIncidentResponseDocument.CreateIncidentResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateIncidentResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
