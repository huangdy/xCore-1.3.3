/*
 * An XML document type.
 * Localname: SubmitMapResponse
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.SubmitMapResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * A document containing one SubmitMapResponse(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public class SubmitMapResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.SubmitMapResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubmitMapResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBMITMAPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "SubmitMapResponse");
    
    
    /**
     * Gets the "SubmitMapResponse" element
     */
    public org.uicds.mapService.SubmitMapResponseDocument.SubmitMapResponse getSubmitMapResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitMapResponseDocument.SubmitMapResponse target = null;
            target = (org.uicds.mapService.SubmitMapResponseDocument.SubmitMapResponse)get_store().find_element_user(SUBMITMAPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubmitMapResponse" element
     */
    public void setSubmitMapResponse(org.uicds.mapService.SubmitMapResponseDocument.SubmitMapResponse submitMapResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitMapResponseDocument.SubmitMapResponse target = null;
            target = (org.uicds.mapService.SubmitMapResponseDocument.SubmitMapResponse)get_store().find_element_user(SUBMITMAPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.mapService.SubmitMapResponseDocument.SubmitMapResponse)get_store().add_element_user(SUBMITMAPRESPONSE$0);
            }
            target.set(submitMapResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubmitMapResponse" element
     */
    public org.uicds.mapService.SubmitMapResponseDocument.SubmitMapResponse addNewSubmitMapResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.mapService.SubmitMapResponseDocument.SubmitMapResponse target = null;
            target = (org.uicds.mapService.SubmitMapResponseDocument.SubmitMapResponse)get_store().add_element_user(SUBMITMAPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SubmitMapResponse(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public static class SubmitMapResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.SubmitMapResponseDocument.SubmitMapResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SubmitMapResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
