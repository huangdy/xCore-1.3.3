/*
 * An XML document type.
 * Localname: CreateICSFormResponse
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.CreateICSFormResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one CreateICSFormResponse(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class CreateICSFormResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.CreateICSFormResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateICSFormResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEICSFORMRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "CreateICSFormResponse");
    
    
    /**
     * Gets the "CreateICSFormResponse" element
     */
    public org.uicds.iapService.CreateICSFormResponseDocument.CreateICSFormResponse getCreateICSFormResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.CreateICSFormResponseDocument.CreateICSFormResponse target = null;
            target = (org.uicds.iapService.CreateICSFormResponseDocument.CreateICSFormResponse)get_store().find_element_user(CREATEICSFORMRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateICSFormResponse" element
     */
    public void setCreateICSFormResponse(org.uicds.iapService.CreateICSFormResponseDocument.CreateICSFormResponse createICSFormResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.CreateICSFormResponseDocument.CreateICSFormResponse target = null;
            target = (org.uicds.iapService.CreateICSFormResponseDocument.CreateICSFormResponse)get_store().find_element_user(CREATEICSFORMRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.CreateICSFormResponseDocument.CreateICSFormResponse)get_store().add_element_user(CREATEICSFORMRESPONSE$0);
            }
            target.set(createICSFormResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateICSFormResponse" element
     */
    public org.uicds.iapService.CreateICSFormResponseDocument.CreateICSFormResponse addNewCreateICSFormResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.CreateICSFormResponseDocument.CreateICSFormResponse target = null;
            target = (org.uicds.iapService.CreateICSFormResponseDocument.CreateICSFormResponse)get_store().add_element_user(CREATEICSFORMRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateICSFormResponse(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class CreateICSFormResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.CreateICSFormResponseDocument.CreateICSFormResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateICSFormResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
