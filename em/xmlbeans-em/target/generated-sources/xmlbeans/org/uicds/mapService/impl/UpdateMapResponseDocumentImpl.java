/*
 * An XML document type.
 * Localname: UpdateMapResponse
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.UpdateMapResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one UpdateMapResponse(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class UpdateMapResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.UpdateMapResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateMapResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEMAPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "UpdateMapResponse");
    
    
    /**
     * Gets the "UpdateMapResponse" element
     */
    public org.uicds.mapService.UpdateMapResponseDocument.UpdateMapResponse getUpdateMapResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.UpdateMapResponseDocument.UpdateMapResponse target = null;
            target = (org.uicds.mapService.UpdateMapResponseDocument.UpdateMapResponse)get_store().find_element_user(UPDATEMAPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateMapResponse" element
     */
    public void setUpdateMapResponse(org.uicds.mapService.UpdateMapResponseDocument.UpdateMapResponse updateMapResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.UpdateMapResponseDocument.UpdateMapResponse target = null;
            target = (org.uicds.mapService.UpdateMapResponseDocument.UpdateMapResponse)get_store().find_element_user(UPDATEMAPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.UpdateMapResponseDocument.UpdateMapResponse)get_store().add_element_user(UPDATEMAPRESPONSE$0);
            }
            target.set(updateMapResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateMapResponse" element
     */
    public org.uicds.mapService.UpdateMapResponseDocument.UpdateMapResponse addNewUpdateMapResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.UpdateMapResponseDocument.UpdateMapResponse target = null;
            target = (org.uicds.mapService.UpdateMapResponseDocument.UpdateMapResponse)get_store().add_element_user(UPDATEMAPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateMapResponse(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class UpdateMapResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.UpdateMapResponseDocument.UpdateMapResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateMapResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
