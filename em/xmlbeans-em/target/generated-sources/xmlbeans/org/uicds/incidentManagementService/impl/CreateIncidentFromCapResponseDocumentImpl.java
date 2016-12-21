/*
 * An XML document type.
 * Localname: CreateIncidentFromCapResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one CreateIncidentFromCapResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class CreateIncidentFromCapResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateIncidentFromCapResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEINCIDENTFROMCAPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "CreateIncidentFromCapResponse");
    
    
    /**
     * Gets the "CreateIncidentFromCapResponse" element
     */
    public org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse getCreateIncidentFromCapResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse target = null;
            target = (org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse)get_store().find_element_user(CREATEINCIDENTFROMCAPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateIncidentFromCapResponse" element
     */
    public void setCreateIncidentFromCapResponse(org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse createIncidentFromCapResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse target = null;
            target = (org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse)get_store().find_element_user(CREATEINCIDENTFROMCAPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse)get_store().add_element_user(CREATEINCIDENTFROMCAPRESPONSE$0);
            }
            target.set(createIncidentFromCapResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateIncidentFromCapResponse" element
     */
    public org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse addNewCreateIncidentFromCapResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse target = null;
            target = (org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse)get_store().add_element_user(CREATEINCIDENTFROMCAPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateIncidentFromCapResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class CreateIncidentFromCapResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.CreateIncidentFromCapResponseDocument.CreateIncidentFromCapResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateIncidentFromCapResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
