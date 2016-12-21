/*
 * An XML document type.
 * Localname: SetApprovedIAPResponse
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.SetApprovedIAPResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one SetApprovedIAPResponse(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class SetApprovedIAPResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.SetApprovedIAPResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetApprovedIAPResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETAPPROVEDIAPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "SetApprovedIAPResponse");
    
    
    /**
     * Gets the "SetApprovedIAPResponse" element
     */
    public org.uicds.iapService.SetApprovedIAPResponseDocument.SetApprovedIAPResponse getSetApprovedIAPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.SetApprovedIAPResponseDocument.SetApprovedIAPResponse target = null;
            target = (org.uicds.iapService.SetApprovedIAPResponseDocument.SetApprovedIAPResponse)get_store().find_element_user(SETAPPROVEDIAPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SetApprovedIAPResponse" element
     */
    public void setSetApprovedIAPResponse(org.uicds.iapService.SetApprovedIAPResponseDocument.SetApprovedIAPResponse setApprovedIAPResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.SetApprovedIAPResponseDocument.SetApprovedIAPResponse target = null;
            target = (org.uicds.iapService.SetApprovedIAPResponseDocument.SetApprovedIAPResponse)get_store().find_element_user(SETAPPROVEDIAPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.SetApprovedIAPResponseDocument.SetApprovedIAPResponse)get_store().add_element_user(SETAPPROVEDIAPRESPONSE$0);
            }
            target.set(setApprovedIAPResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SetApprovedIAPResponse" element
     */
    public org.uicds.iapService.SetApprovedIAPResponseDocument.SetApprovedIAPResponse addNewSetApprovedIAPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.SetApprovedIAPResponseDocument.SetApprovedIAPResponse target = null;
            target = (org.uicds.iapService.SetApprovedIAPResponseDocument.SetApprovedIAPResponse)get_store().add_element_user(SETAPPROVEDIAPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SetApprovedIAPResponse(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class SetApprovedIAPResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.SetApprovedIAPResponseDocument.SetApprovedIAPResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SetApprovedIAPResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
