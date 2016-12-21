/*
 * An XML document type.
 * Localname: GetTaskListRequest
 * Namespace: http://uicds.org/TaskingService
 * Java type: org.uicds.taskingService.GetTaskListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.taskingService.impl;
/**
 * A document containing one GetTaskListRequest(@http://uicds.org/TaskingService) element.
 *
 * This is a complex type.
 */
public class GetTaskListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.GetTaskListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTaskListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTASKLISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/TaskingService", "GetTaskListRequest");
    
    
    /**
     * Gets the "GetTaskListRequest" element
     */
    public org.uicds.taskingService.GetTaskListRequestDocument.GetTaskListRequest getGetTaskListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.GetTaskListRequestDocument.GetTaskListRequest target = null;
            target = (org.uicds.taskingService.GetTaskListRequestDocument.GetTaskListRequest)get_store().find_element_user(GETTASKLISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetTaskListRequest" element
     */
    public void setGetTaskListRequest(org.uicds.taskingService.GetTaskListRequestDocument.GetTaskListRequest getTaskListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.GetTaskListRequestDocument.GetTaskListRequest target = null;
            target = (org.uicds.taskingService.GetTaskListRequestDocument.GetTaskListRequest)get_store().find_element_user(GETTASKLISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.taskingService.GetTaskListRequestDocument.GetTaskListRequest)get_store().add_element_user(GETTASKLISTREQUEST$0);
            }
            target.set(getTaskListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetTaskListRequest" element
     */
    public org.uicds.taskingService.GetTaskListRequestDocument.GetTaskListRequest addNewGetTaskListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.taskingService.GetTaskListRequestDocument.GetTaskListRequest target = null;
            target = (org.uicds.taskingService.GetTaskListRequestDocument.GetTaskListRequest)get_store().add_element_user(GETTASKLISTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetTaskListRequest(@http://uicds.org/TaskingService).
     *
     * This is a complex type.
     */
    public static class GetTaskListRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.taskingService.GetTaskListRequestDocument.GetTaskListRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetTaskListRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductIdentification" element
         */
        public void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                }
                target.set(workProductIdentification);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                return target;
            }
        }
    }
}
