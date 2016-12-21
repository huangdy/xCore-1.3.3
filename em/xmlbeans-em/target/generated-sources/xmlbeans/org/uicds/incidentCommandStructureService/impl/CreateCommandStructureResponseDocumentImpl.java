/*
 * An XML document type.
 * Localname: CreateCommandStructureResponse
 * Namespace: http://uicds.org/IncidentCommandStructureService
 * Java type: org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentCommandStructureService.impl;
/**
 * A document containing one CreateCommandStructureResponse(@http://uicds.org/IncidentCommandStructureService) element.
 *
 * This is a complex type.
 */
public class CreateCommandStructureResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateCommandStructureResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATECOMMANDSTRUCTURERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentCommandStructureService", "CreateCommandStructureResponse");
    
    
    /**
     * Gets the "CreateCommandStructureResponse" element
     */
    public org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument.CreateCommandStructureResponse getCreateCommandStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument.CreateCommandStructureResponse target = null;
            target = (org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument.CreateCommandStructureResponse)get_store().find_element_user(CREATECOMMANDSTRUCTURERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateCommandStructureResponse" element
     */
    public void setCreateCommandStructureResponse(org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument.CreateCommandStructureResponse createCommandStructureResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument.CreateCommandStructureResponse target = null;
            target = (org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument.CreateCommandStructureResponse)get_store().find_element_user(CREATECOMMANDSTRUCTURERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument.CreateCommandStructureResponse)get_store().add_element_user(CREATECOMMANDSTRUCTURERESPONSE$0);
            }
            target.set(createCommandStructureResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateCommandStructureResponse" element
     */
    public org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument.CreateCommandStructureResponse addNewCreateCommandStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument.CreateCommandStructureResponse target = null;
            target = (org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument.CreateCommandStructureResponse)get_store().add_element_user(CREATECOMMANDSTRUCTURERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateCommandStructureResponse(@http://uicds.org/IncidentCommandStructureService).
     *
     * This is a complex type.
     */
    public static class CreateCommandStructureResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.CreateCommandStructureResponseDocument.CreateCommandStructureResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateCommandStructureResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
