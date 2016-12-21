/*
 * An XML document type.
 * Localname: UpdateTaskListResponse
 * Namespace: http://uicds.org/TaskingService
 * Java type: org.uicds.taskingService.UpdateTaskListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.taskingService.impl;
/**
 * A document containing one UpdateTaskListResponse(@http://uicds.org/TaskingService) element.
 *
 * This is a complex type.
 */
public class UpdateTaskListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.UpdateTaskListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateTaskListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATETASKLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "UpdateTaskListResponse");
    
    
    /**
     * Gets the "UpdateTaskListResponse" element
     */
    public org.uicds.taskingService.UpdateTaskListResponseDocument.UpdateTaskListResponse getUpdateTaskListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.UpdateTaskListResponseDocument.UpdateTaskListResponse target = null;
            target = (org.uicds.taskingService.UpdateTaskListResponseDocument.UpdateTaskListResponse)get_store().find_element_user(UPDATETASKLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateTaskListResponse" element
     */
    public void setUpdateTaskListResponse(org.uicds.taskingService.UpdateTaskListResponseDocument.UpdateTaskListResponse updateTaskListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.UpdateTaskListResponseDocument.UpdateTaskListResponse target = null;
            target = (org.uicds.taskingService.UpdateTaskListResponseDocument.UpdateTaskListResponse)get_store().find_element_user(UPDATETASKLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.taskingService.UpdateTaskListResponseDocument.UpdateTaskListResponse)get_store().add_element_user(UPDATETASKLISTRESPONSE$0);
            }
            target.set(updateTaskListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateTaskListResponse" element
     */
    public org.uicds.taskingService.UpdateTaskListResponseDocument.UpdateTaskListResponse addNewUpdateTaskListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.UpdateTaskListResponseDocument.UpdateTaskListResponse target = null;
            target = (org.uicds.taskingService.UpdateTaskListResponseDocument.UpdateTaskListResponse)get_store().add_element_user(UPDATETASKLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateTaskListResponse(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public static class UpdateTaskListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.UpdateTaskListResponseDocument.UpdateTaskListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateTaskListResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
