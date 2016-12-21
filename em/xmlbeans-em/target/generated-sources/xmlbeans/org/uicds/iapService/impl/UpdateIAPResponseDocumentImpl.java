/*
 * An XML document type.
 * Localname: UpdateIAPResponse
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.UpdateIAPResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one UpdateIAPResponse(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class UpdateIAPResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.UpdateIAPResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateIAPResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEIAPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "UpdateIAPResponse");
    
    
    /**
     * Gets the "UpdateIAPResponse" element
     */
    public org.uicds.iapService.UpdateIAPResponseDocument.UpdateIAPResponse getUpdateIAPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.UpdateIAPResponseDocument.UpdateIAPResponse target = null;
            target = (org.uicds.iapService.UpdateIAPResponseDocument.UpdateIAPResponse)get_store().find_element_user(UPDATEIAPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateIAPResponse" element
     */
    public void setUpdateIAPResponse(org.uicds.iapService.UpdateIAPResponseDocument.UpdateIAPResponse updateIAPResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.UpdateIAPResponseDocument.UpdateIAPResponse target = null;
            target = (org.uicds.iapService.UpdateIAPResponseDocument.UpdateIAPResponse)get_store().find_element_user(UPDATEIAPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.UpdateIAPResponseDocument.UpdateIAPResponse)get_store().add_element_user(UPDATEIAPRESPONSE$0);
            }
            target.set(updateIAPResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateIAPResponse" element
     */
    public org.uicds.iapService.UpdateIAPResponseDocument.UpdateIAPResponse addNewUpdateIAPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.UpdateIAPResponseDocument.UpdateIAPResponse target = null;
            target = (org.uicds.iapService.UpdateIAPResponseDocument.UpdateIAPResponse)get_store().add_element_user(UPDATEIAPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateIAPResponse(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class UpdateIAPResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.UpdateIAPResponseDocument.UpdateIAPResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateIAPResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
