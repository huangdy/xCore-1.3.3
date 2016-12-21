/*
 * An XML document type.
 * Localname: CreateAlertResponse
 * Namespace: http://uicds.org/AlertService
 * Java type: org.uicds.alertService.CreateAlertResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.alertService.impl;
/**
 * A document containing one CreateAlertResponse(@http://uicds.org/AlertService) element.
 *
 * This is a complex type.
 */
public class CreateAlertResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.CreateAlertResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateAlertResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEALERTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AlertService", "CreateAlertResponse");
    
    
    /**
     * Gets the "CreateAlertResponse" element
     */
    public org.uicds.alertService.CreateAlertResponseDocument.CreateAlertResponse getCreateAlertResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.CreateAlertResponseDocument.CreateAlertResponse target = null;
            target = (org.uicds.alertService.CreateAlertResponseDocument.CreateAlertResponse)get_store().find_element_user(CREATEALERTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateAlertResponse" element
     */
    public void setCreateAlertResponse(org.uicds.alertService.CreateAlertResponseDocument.CreateAlertResponse createAlertResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.CreateAlertResponseDocument.CreateAlertResponse target = null;
            target = (org.uicds.alertService.CreateAlertResponseDocument.CreateAlertResponse)get_store().find_element_user(CREATEALERTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.alertService.CreateAlertResponseDocument.CreateAlertResponse)get_store().add_element_user(CREATEALERTRESPONSE$0);
            }
            target.set(createAlertResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateAlertResponse" element
     */
    public org.uicds.alertService.CreateAlertResponseDocument.CreateAlertResponse addNewCreateAlertResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.CreateAlertResponseDocument.CreateAlertResponse target = null;
            target = (org.uicds.alertService.CreateAlertResponseDocument.CreateAlertResponse)get_store().add_element_user(CREATEALERTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateAlertResponse(@http://uicds.org/AlertService).
     *
     * This is a complex type.
     */
    public static class CreateAlertResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.CreateAlertResponseDocument.CreateAlertResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateAlertResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
