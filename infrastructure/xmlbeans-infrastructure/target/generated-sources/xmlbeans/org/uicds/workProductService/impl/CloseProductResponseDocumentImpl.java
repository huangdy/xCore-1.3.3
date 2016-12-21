/*
 * An XML document type.
 * Localname: CloseProductResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.CloseProductResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService.impl;
/**
 * A document containing one CloseProductResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class CloseProductResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.CloseProductResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseProductResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEPRODUCTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "CloseProductResponse");
    
    
    /**
     * Gets the "CloseProductResponse" element
     */
    public org.uicds.workProductService.CloseProductResponseDocument.CloseProductResponse getCloseProductResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.CloseProductResponseDocument.CloseProductResponse target = null;
            target = (org.uicds.workProductService.CloseProductResponseDocument.CloseProductResponse)get_store().find_element_user(CLOSEPRODUCTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CloseProductResponse" element
     */
    public void setCloseProductResponse(org.uicds.workProductService.CloseProductResponseDocument.CloseProductResponse closeProductResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.CloseProductResponseDocument.CloseProductResponse target = null;
            target = (org.uicds.workProductService.CloseProductResponseDocument.CloseProductResponse)get_store().find_element_user(CLOSEPRODUCTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.workProductService.CloseProductResponseDocument.CloseProductResponse)get_store().add_element_user(CLOSEPRODUCTRESPONSE$0);
            }
            target.set(closeProductResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CloseProductResponse" element
     */
    public org.uicds.workProductService.CloseProductResponseDocument.CloseProductResponse addNewCloseProductResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.CloseProductResponseDocument.CloseProductResponse target = null;
            target = (org.uicds.workProductService.CloseProductResponseDocument.CloseProductResponse)get_store().add_element_user(CLOSEPRODUCTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CloseProductResponse(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class CloseProductResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.CloseProductResponseDocument.CloseProductResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CloseProductResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
