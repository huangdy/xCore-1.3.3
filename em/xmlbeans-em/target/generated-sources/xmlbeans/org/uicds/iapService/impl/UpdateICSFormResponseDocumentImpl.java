/*
 * An XML document type.
 * Localname: UpdateICSFormResponse
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.UpdateICSFormResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one UpdateICSFormResponse(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class UpdateICSFormResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.UpdateICSFormResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateICSFormResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEICSFORMRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "UpdateICSFormResponse");
    
    
    /**
     * Gets the "UpdateICSFormResponse" element
     */
    public org.uicds.iapService.UpdateICSFormResponseDocument.UpdateICSFormResponse getUpdateICSFormResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.UpdateICSFormResponseDocument.UpdateICSFormResponse target = null;
            target = (org.uicds.iapService.UpdateICSFormResponseDocument.UpdateICSFormResponse)get_store().find_element_user(UPDATEICSFORMRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateICSFormResponse" element
     */
    public void setUpdateICSFormResponse(org.uicds.iapService.UpdateICSFormResponseDocument.UpdateICSFormResponse updateICSFormResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.UpdateICSFormResponseDocument.UpdateICSFormResponse target = null;
            target = (org.uicds.iapService.UpdateICSFormResponseDocument.UpdateICSFormResponse)get_store().find_element_user(UPDATEICSFORMRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.UpdateICSFormResponseDocument.UpdateICSFormResponse)get_store().add_element_user(UPDATEICSFORMRESPONSE$0);
            }
            target.set(updateICSFormResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateICSFormResponse" element
     */
    public org.uicds.iapService.UpdateICSFormResponseDocument.UpdateICSFormResponse addNewUpdateICSFormResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.UpdateICSFormResponseDocument.UpdateICSFormResponse target = null;
            target = (org.uicds.iapService.UpdateICSFormResponseDocument.UpdateICSFormResponse)get_store().add_element_user(UPDATEICSFORMRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateICSFormResponse(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class UpdateICSFormResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.UpdateICSFormResponseDocument.UpdateICSFormResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateICSFormResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
