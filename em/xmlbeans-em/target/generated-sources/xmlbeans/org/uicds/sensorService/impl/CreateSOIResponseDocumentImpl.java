/*
 * An XML document type.
 * Localname: CreateSOIResponse
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorService.CreateSOIResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorService.impl;
/**
 * A document containing one CreateSOIResponse(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public class CreateSOIResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.CreateSOIResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateSOIResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATESOIRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SensorService", "CreateSOIResponse");
    
    
    /**
     * Gets the "CreateSOIResponse" element
     */
    public org.uicds.sensorService.CreateSOIResponseDocument.CreateSOIResponse getCreateSOIResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.CreateSOIResponseDocument.CreateSOIResponse target = null;
            target = (org.uicds.sensorService.CreateSOIResponseDocument.CreateSOIResponse)get_store().find_element_user(CREATESOIRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateSOIResponse" element
     */
    public void setCreateSOIResponse(org.uicds.sensorService.CreateSOIResponseDocument.CreateSOIResponse createSOIResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.CreateSOIResponseDocument.CreateSOIResponse target = null;
            target = (org.uicds.sensorService.CreateSOIResponseDocument.CreateSOIResponse)get_store().find_element_user(CREATESOIRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.sensorService.CreateSOIResponseDocument.CreateSOIResponse)get_store().add_element_user(CREATESOIRESPONSE$0);
            }
            target.set(createSOIResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateSOIResponse" element
     */
    public org.uicds.sensorService.CreateSOIResponseDocument.CreateSOIResponse addNewCreateSOIResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.CreateSOIResponseDocument.CreateSOIResponse target = null;
            target = (org.uicds.sensorService.CreateSOIResponseDocument.CreateSOIResponse)get_store().add_element_user(CREATESOIRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateSOIResponse(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public static class CreateSOIResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.CreateSOIResponseDocument.CreateSOIResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateSOIResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
