/*
 * An XML document type.
 * Localname: CreateIAPResponse
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.CreateIAPResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one CreateIAPResponse(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class CreateIAPResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.CreateIAPResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateIAPResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEIAPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "CreateIAPResponse");
    
    
    /**
     * Gets the "CreateIAPResponse" element
     */
    public org.uicds.iapService.CreateIAPResponseDocument.CreateIAPResponse getCreateIAPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.CreateIAPResponseDocument.CreateIAPResponse target = null;
            target = (org.uicds.iapService.CreateIAPResponseDocument.CreateIAPResponse)get_store().find_element_user(CREATEIAPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateIAPResponse" element
     */
    public void setCreateIAPResponse(org.uicds.iapService.CreateIAPResponseDocument.CreateIAPResponse createIAPResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.CreateIAPResponseDocument.CreateIAPResponse target = null;
            target = (org.uicds.iapService.CreateIAPResponseDocument.CreateIAPResponse)get_store().find_element_user(CREATEIAPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.CreateIAPResponseDocument.CreateIAPResponse)get_store().add_element_user(CREATEIAPRESPONSE$0);
            }
            target.set(createIAPResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateIAPResponse" element
     */
    public org.uicds.iapService.CreateIAPResponseDocument.CreateIAPResponse addNewCreateIAPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.CreateIAPResponseDocument.CreateIAPResponse target = null;
            target = (org.uicds.iapService.CreateIAPResponseDocument.CreateIAPResponse)get_store().add_element_user(CREATEIAPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateIAPResponse(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class CreateIAPResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.CreateIAPResponseDocument.CreateIAPResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateIAPResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
