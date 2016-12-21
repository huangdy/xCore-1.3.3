/*
 * An XML document type.
 * Localname: SubmitLayerResponse
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.SubmitLayerResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one SubmitLayerResponse(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class SubmitLayerResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.SubmitLayerResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitLayerResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITLAYERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "SubmitLayerResponse");
    
    
    /**
     * Gets the "SubmitLayerResponse" element
     */
    public org.uicds.mapService.SubmitLayerResponseDocument.SubmitLayerResponse getSubmitLayerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitLayerResponseDocument.SubmitLayerResponse target = null;
            target = (org.uicds.mapService.SubmitLayerResponseDocument.SubmitLayerResponse)get_store().find_element_user(SUBMITLAYERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitLayerResponse" element
     */
    public void setSubmitLayerResponse(org.uicds.mapService.SubmitLayerResponseDocument.SubmitLayerResponse submitLayerResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitLayerResponseDocument.SubmitLayerResponse target = null;
            target = (org.uicds.mapService.SubmitLayerResponseDocument.SubmitLayerResponse)get_store().find_element_user(SUBMITLAYERRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.SubmitLayerResponseDocument.SubmitLayerResponse)get_store().add_element_user(SUBMITLAYERRESPONSE$0);
            }
            target.set(submitLayerResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitLayerResponse" element
     */
    public org.uicds.mapService.SubmitLayerResponseDocument.SubmitLayerResponse addNewSubmitLayerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitLayerResponseDocument.SubmitLayerResponse target = null;
            target = (org.uicds.mapService.SubmitLayerResponseDocument.SubmitLayerResponse)get_store().add_element_user(SUBMITLAYERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SubmitLayerResponse(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class SubmitLayerResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.SubmitLayerResponseDocument.SubmitLayerResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitLayerResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
