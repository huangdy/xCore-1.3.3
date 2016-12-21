/*
 * An XML document type.
 * Localname: GetTaskListResponse
 * Namespace: http://uicds.org/TaskingService
 * Java type: org.uicds.taskingService.GetTaskListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.taskingService.impl;
/**
 * A document containing one GetTaskListResponse(@http://uicds.org/TaskingService) element.
 *
 * This is a complex type.
 */
public class GetTaskListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.GetTaskListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTaskListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "GetTaskListResponse");
    
    
    /**
     * Gets the "GetTaskListResponse" element
     */
    public org.uicds.taskingService.GetTaskListResponseDocument.GetTaskListResponse getGetTaskListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.GetTaskListResponseDocument.GetTaskListResponse target = null;
            target = (org.uicds.taskingService.GetTaskListResponseDocument.GetTaskListResponse)get_store().find_element_user(GETTASKLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetTaskListResponse" element
     */
    public void setGetTaskListResponse(org.uicds.taskingService.GetTaskListResponseDocument.GetTaskListResponse getTaskListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.GetTaskListResponseDocument.GetTaskListResponse target = null;
            target = (org.uicds.taskingService.GetTaskListResponseDocument.GetTaskListResponse)get_store().find_element_user(GETTASKLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.taskingService.GetTaskListResponseDocument.GetTaskListResponse)get_store().add_element_user(GETTASKLISTRESPONSE$0);
            }
            target.set(getTaskListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetTaskListResponse" element
     */
    public org.uicds.taskingService.GetTaskListResponseDocument.GetTaskListResponse addNewGetTaskListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.GetTaskListResponseDocument.GetTaskListResponse target = null;
            target = (org.uicds.taskingService.GetTaskListResponseDocument.GetTaskListResponse)get_store().add_element_user(GETTASKLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetTaskListResponse(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public static class GetTaskListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.GetTaskListResponseDocument.GetTaskListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetTaskListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCT$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProduct");
        
        
        /**
         * Gets the "WorkProduct" element
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct getWorkProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProduct" element
         */
        public void setWorkProduct(com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$0);
                }
                target.set(workProduct);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProduct" element
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct addNewWorkProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$0);
                return target;
            }
        }
    }
}
