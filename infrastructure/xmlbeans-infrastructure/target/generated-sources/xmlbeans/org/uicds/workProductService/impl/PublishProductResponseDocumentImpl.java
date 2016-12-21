/*
 * An XML document type.
 * Localname: PublishProductResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.PublishProductResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService.impl;
/**
 * A document containing one PublishProductResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class PublishProductResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.PublishProductResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PublishProductResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHPRODUCTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "PublishProductResponse");
    
    
    /**
     * Gets the "PublishProductResponse" element
     */
    public org.uicds.workProductService.PublishProductResponseDocument.PublishProductResponse getPublishProductResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.PublishProductResponseDocument.PublishProductResponse target = null;
            target = (org.uicds.workProductService.PublishProductResponseDocument.PublishProductResponse)get_store().find_element_user(PUBLISHPRODUCTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PublishProductResponse" element
     */
    public void setPublishProductResponse(org.uicds.workProductService.PublishProductResponseDocument.PublishProductResponse publishProductResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.PublishProductResponseDocument.PublishProductResponse target = null;
            target = (org.uicds.workProductService.PublishProductResponseDocument.PublishProductResponse)get_store().find_element_user(PUBLISHPRODUCTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.workProductService.PublishProductResponseDocument.PublishProductResponse)get_store().add_element_user(PUBLISHPRODUCTRESPONSE$0);
            }
            target.set(publishProductResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "PublishProductResponse" element
     */
    public org.uicds.workProductService.PublishProductResponseDocument.PublishProductResponse addNewPublishProductResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.PublishProductResponseDocument.PublishProductResponse target = null;
            target = (org.uicds.workProductService.PublishProductResponseDocument.PublishProductResponse)get_store().add_element_user(PUBLISHPRODUCTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML PublishProductResponse(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class PublishProductResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.PublishProductResponseDocument.PublishProductResponse
    {
        private static final long serialVersionUID = 1L;
        
        public PublishProductResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
