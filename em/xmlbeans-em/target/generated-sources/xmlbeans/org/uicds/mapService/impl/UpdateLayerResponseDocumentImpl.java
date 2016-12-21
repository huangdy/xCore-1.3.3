/*
 * An XML document type.
 * Localname: UpdateLayerResponse
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.UpdateLayerResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one UpdateLayerResponse(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class UpdateLayerResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.UpdateLayerResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateLayerResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATELAYERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "UpdateLayerResponse");
    
    
    /**
     * Gets the "UpdateLayerResponse" element
     */
    public org.uicds.mapService.UpdateLayerResponseDocument.UpdateLayerResponse getUpdateLayerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.UpdateLayerResponseDocument.UpdateLayerResponse target = null;
            target = (org.uicds.mapService.UpdateLayerResponseDocument.UpdateLayerResponse)get_store().find_element_user(UPDATELAYERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateLayerResponse" element
     */
    public void setUpdateLayerResponse(org.uicds.mapService.UpdateLayerResponseDocument.UpdateLayerResponse updateLayerResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.UpdateLayerResponseDocument.UpdateLayerResponse target = null;
            target = (org.uicds.mapService.UpdateLayerResponseDocument.UpdateLayerResponse)get_store().find_element_user(UPDATELAYERRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.UpdateLayerResponseDocument.UpdateLayerResponse)get_store().add_element_user(UPDATELAYERRESPONSE$0);
            }
            target.set(updateLayerResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateLayerResponse" element
     */
    public org.uicds.mapService.UpdateLayerResponseDocument.UpdateLayerResponse addNewUpdateLayerResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.UpdateLayerResponseDocument.UpdateLayerResponse target = null;
            target = (org.uicds.mapService.UpdateLayerResponseDocument.UpdateLayerResponse)get_store().add_element_user(UPDATELAYERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateLayerResponse(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class UpdateLayerResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.UpdateLayerResponseDocument.UpdateLayerResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateLayerResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
