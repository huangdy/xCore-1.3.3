/*
 * An XML document type.
 * Localname: CreateTaskListResponse
 * Namespace: http://uicds.org/TaskingService
 * Java type: org.uicds.taskingService.CreateTaskListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.taskingService.impl;
/**
 * A document containing one CreateTaskListResponse(@http://uicds.org/TaskingService) element.
 *
 * This is a complex type.
 */
public class CreateTaskListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.CreateTaskListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateTaskListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATETASKLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "CreateTaskListResponse");
    
    
    /**
     * Gets the "CreateTaskListResponse" element
     */
    public org.uicds.taskingService.CreateTaskListResponseDocument.CreateTaskListResponse getCreateTaskListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.CreateTaskListResponseDocument.CreateTaskListResponse target = null;
            target = (org.uicds.taskingService.CreateTaskListResponseDocument.CreateTaskListResponse)get_store().find_element_user(CREATETASKLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateTaskListResponse" element
     */
    public void setCreateTaskListResponse(org.uicds.taskingService.CreateTaskListResponseDocument.CreateTaskListResponse createTaskListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.CreateTaskListResponseDocument.CreateTaskListResponse target = null;
            target = (org.uicds.taskingService.CreateTaskListResponseDocument.CreateTaskListResponse)get_store().find_element_user(CREATETASKLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.taskingService.CreateTaskListResponseDocument.CreateTaskListResponse)get_store().add_element_user(CREATETASKLISTRESPONSE$0);
            }
            target.set(createTaskListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateTaskListResponse" element
     */
    public org.uicds.taskingService.CreateTaskListResponseDocument.CreateTaskListResponse addNewCreateTaskListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.CreateTaskListResponseDocument.CreateTaskListResponse target = null;
            target = (org.uicds.taskingService.CreateTaskListResponseDocument.CreateTaskListResponse)get_store().add_element_user(CREATETASKLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateTaskListResponse(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public static class CreateTaskListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.CreateTaskListResponseDocument.CreateTaskListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateTaskListResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
