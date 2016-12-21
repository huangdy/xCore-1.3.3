/*
 * An XML document type.
 * Localname: CancelAlertResponse
 * Namespace: http://uicds.org/AlertService
 * Java type: org.uicds.alertService.CancelAlertResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.alertService.impl;
/**
 * A document containing one CancelAlertResponse(@http://uicds.org/AlertService) element.
 *
 * This is a complex type.
 */
public class CancelAlertResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.CancelAlertResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CancelAlertResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELALERTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AlertService", "CancelAlertResponse");
    
    
    /**
     * Gets the "CancelAlertResponse" element
     */
    public org.uicds.alertService.CancelAlertResponseDocument.CancelAlertResponse getCancelAlertResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.CancelAlertResponseDocument.CancelAlertResponse target = null;
            target = (org.uicds.alertService.CancelAlertResponseDocument.CancelAlertResponse)get_store().find_element_user(CANCELALERTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CancelAlertResponse" element
     */
    public void setCancelAlertResponse(org.uicds.alertService.CancelAlertResponseDocument.CancelAlertResponse cancelAlertResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.CancelAlertResponseDocument.CancelAlertResponse target = null;
            target = (org.uicds.alertService.CancelAlertResponseDocument.CancelAlertResponse)get_store().find_element_user(CANCELALERTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.alertService.CancelAlertResponseDocument.CancelAlertResponse)get_store().add_element_user(CANCELALERTRESPONSE$0);
            }
            target.set(cancelAlertResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CancelAlertResponse" element
     */
    public org.uicds.alertService.CancelAlertResponseDocument.CancelAlertResponse addNewCancelAlertResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.CancelAlertResponseDocument.CancelAlertResponse target = null;
            target = (org.uicds.alertService.CancelAlertResponseDocument.CancelAlertResponse)get_store().add_element_user(CANCELALERTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CancelAlertResponse(@http://uicds.org/AlertService).
     *
     * This is a complex type.
     */
    public static class CancelAlertResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.CancelAlertResponseDocument.CancelAlertResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CancelAlertResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
