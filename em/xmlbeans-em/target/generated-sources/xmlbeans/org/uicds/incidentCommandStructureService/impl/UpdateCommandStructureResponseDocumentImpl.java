/*
 * An XML document type.
 * Localname: UpdateCommandStructureResponse
 * Namespace: http://uicds.org/IncidentCommandStructureService
 * Java type: org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentCommandStructureService.impl;
/**
 * A document containing one UpdateCommandStructureResponse(@http://uicds.org/IncidentCommandStructureService) element.
 *
 * This is a complex type.
 */
public class UpdateCommandStructureResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateCommandStructureResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATECOMMANDSTRUCTURERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentCommandStructureService", "UpdateCommandStructureResponse");
    
    
    /**
     * Gets the "UpdateCommandStructureResponse" element
     */
    public org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument.UpdateCommandStructureResponse getUpdateCommandStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument.UpdateCommandStructureResponse target = null;
            target = (org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument.UpdateCommandStructureResponse)get_store().find_element_user(UPDATECOMMANDSTRUCTURERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateCommandStructureResponse" element
     */
    public void setUpdateCommandStructureResponse(org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument.UpdateCommandStructureResponse updateCommandStructureResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument.UpdateCommandStructureResponse target = null;
            target = (org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument.UpdateCommandStructureResponse)get_store().find_element_user(UPDATECOMMANDSTRUCTURERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument.UpdateCommandStructureResponse)get_store().add_element_user(UPDATECOMMANDSTRUCTURERESPONSE$0);
            }
            target.set(updateCommandStructureResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateCommandStructureResponse" element
     */
    public org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument.UpdateCommandStructureResponse addNewUpdateCommandStructureResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument.UpdateCommandStructureResponse target = null;
            target = (org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument.UpdateCommandStructureResponse)get_store().add_element_user(UPDATECOMMANDSTRUCTURERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateCommandStructureResponse(@http://uicds.org/IncidentCommandStructureService).
     *
     * This is a complex type.
     */
    public static class UpdateCommandStructureResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.UpdateCommandStructureResponseDocument.UpdateCommandStructureResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateCommandStructureResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
