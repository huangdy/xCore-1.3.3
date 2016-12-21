/*
 * An XML document type.
 * Localname: AttachWorkProductToIAPResponse
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.AttachWorkProductToIAPResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one AttachWorkProductToIAPResponse(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class AttachWorkProductToIAPResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.AttachWorkProductToIAPResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachWorkProductToIAPResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHWORKPRODUCTTOIAPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "AttachWorkProductToIAPResponse");
    
    
    /**
     * Gets the "AttachWorkProductToIAPResponse" element
     */
    public org.uicds.iapService.AttachWorkProductToIAPResponseDocument.AttachWorkProductToIAPResponse getAttachWorkProductToIAPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.AttachWorkProductToIAPResponseDocument.AttachWorkProductToIAPResponse target = null;
            target = (org.uicds.iapService.AttachWorkProductToIAPResponseDocument.AttachWorkProductToIAPResponse)get_store().find_element_user(ATTACHWORKPRODUCTTOIAPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachWorkProductToIAPResponse" element
     */
    public void setAttachWorkProductToIAPResponse(org.uicds.iapService.AttachWorkProductToIAPResponseDocument.AttachWorkProductToIAPResponse attachWorkProductToIAPResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.AttachWorkProductToIAPResponseDocument.AttachWorkProductToIAPResponse target = null;
            target = (org.uicds.iapService.AttachWorkProductToIAPResponseDocument.AttachWorkProductToIAPResponse)get_store().find_element_user(ATTACHWORKPRODUCTTOIAPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.AttachWorkProductToIAPResponseDocument.AttachWorkProductToIAPResponse)get_store().add_element_user(ATTACHWORKPRODUCTTOIAPRESPONSE$0);
            }
            target.set(attachWorkProductToIAPResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachWorkProductToIAPResponse" element
     */
    public org.uicds.iapService.AttachWorkProductToIAPResponseDocument.AttachWorkProductToIAPResponse addNewAttachWorkProductToIAPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.AttachWorkProductToIAPResponseDocument.AttachWorkProductToIAPResponse target = null;
            target = (org.uicds.iapService.AttachWorkProductToIAPResponseDocument.AttachWorkProductToIAPResponse)get_store().add_element_user(ATTACHWORKPRODUCTTOIAPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AttachWorkProductToIAPResponse(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class AttachWorkProductToIAPResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.AttachWorkProductToIAPResponseDocument.AttachWorkProductToIAPResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AttachWorkProductToIAPResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
