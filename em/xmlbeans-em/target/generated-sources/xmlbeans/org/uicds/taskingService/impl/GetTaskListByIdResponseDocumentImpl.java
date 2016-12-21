/*
 * An XML document type.
 * Localname: GetTaskListByIdResponse
 * Namespace: http://uicds.org/TaskingService
 * Java type: org.uicds.taskingService.GetTaskListByIdResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.taskingService.impl;
/**
 * A document containing one GetTaskListByIdResponse(@http://uicds.org/TaskingService) element.
 *
 * This is a complex type.
 */
public class GetTaskListByIdResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.GetTaskListByIdResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTaskListByIdResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKLISTBYIDRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "GetTaskListByIdResponse");
    
    
    /**
     * Gets the "GetTaskListByIdResponse" element
     */
    public org.uicds.taskingService.GetTaskListByIdResponseDocument.GetTaskListByIdResponse getGetTaskListByIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.GetTaskListByIdResponseDocument.GetTaskListByIdResponse target = null;
            target = (org.uicds.taskingService.GetTaskListByIdResponseDocument.GetTaskListByIdResponse)get_store().find_element_user(GETTASKLISTBYIDRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetTaskListByIdResponse" element
     */
    public void setGetTaskListByIdResponse(org.uicds.taskingService.GetTaskListByIdResponseDocument.GetTaskListByIdResponse getTaskListByIdResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.GetTaskListByIdResponseDocument.GetTaskListByIdResponse target = null;
            target = (org.uicds.taskingService.GetTaskListByIdResponseDocument.GetTaskListByIdResponse)get_store().find_element_user(GETTASKLISTBYIDRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.taskingService.GetTaskListByIdResponseDocument.GetTaskListByIdResponse)get_store().add_element_user(GETTASKLISTBYIDRESPONSE$0);
            }
            target.set(getTaskListByIdResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetTaskListByIdResponse" element
     */
    public org.uicds.taskingService.GetTaskListByIdResponseDocument.GetTaskListByIdResponse addNewGetTaskListByIdResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.GetTaskListByIdResponseDocument.GetTaskListByIdResponse target = null;
            target = (org.uicds.taskingService.GetTaskListByIdResponseDocument.GetTaskListByIdResponse)get_store().add_element_user(GETTASKLISTBYIDRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetTaskListByIdResponse(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public static class GetTaskListByIdResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.GetTaskListByIdResponseDocument.GetTaskListByIdResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetTaskListByIdResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
