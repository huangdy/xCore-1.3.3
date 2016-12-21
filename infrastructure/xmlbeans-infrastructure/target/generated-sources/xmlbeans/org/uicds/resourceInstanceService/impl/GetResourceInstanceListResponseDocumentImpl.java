/*
 * An XML document type.
 * Localname: GetResourceInstanceListResponse
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one GetResourceInstanceListResponse(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class GetResourceInstanceListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetResourceInstanceListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRESOURCEINSTANCELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "GetResourceInstanceListResponse");
    
    
    /**
     * Gets the "GetResourceInstanceListResponse" element
     */
    public org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument.GetResourceInstanceListResponse getGetResourceInstanceListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument.GetResourceInstanceListResponse target = null;
            target = (org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument.GetResourceInstanceListResponse)get_store().find_element_user(GETRESOURCEINSTANCELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetResourceInstanceListResponse" element
     */
    public void setGetResourceInstanceListResponse(org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument.GetResourceInstanceListResponse getResourceInstanceListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument.GetResourceInstanceListResponse target = null;
            target = (org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument.GetResourceInstanceListResponse)get_store().find_element_user(GETRESOURCEINSTANCELISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument.GetResourceInstanceListResponse)get_store().add_element_user(GETRESOURCEINSTANCELISTRESPONSE$0);
            }
            target.set(getResourceInstanceListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetResourceInstanceListResponse" element
     */
    public org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument.GetResourceInstanceListResponse addNewGetResourceInstanceListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument.GetResourceInstanceListResponse target = null;
            target = (org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument.GetResourceInstanceListResponse)get_store().add_element_user(GETRESOURCEINSTANCELISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetResourceInstanceListResponse(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class GetResourceInstanceListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.GetResourceInstanceListResponseDocument.GetResourceInstanceListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetResourceInstanceListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCEINSTANCELIST$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ResourceInstanceList");
        
        
        /**
         * Gets the "ResourceInstanceList" element
         */
        public org.uicds.resourceInstanceService.ResourceInstanceListType getResourceInstanceList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceInstanceService.ResourceInstanceListType target = null;
                target = (org.uicds.resourceInstanceService.ResourceInstanceListType)get_store().find_element_user(RESOURCEINSTANCELIST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ResourceInstanceList" element
         */
        public void setResourceInstanceList(org.uicds.resourceInstanceService.ResourceInstanceListType resourceInstanceList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceInstanceService.ResourceInstanceListType target = null;
                target = (org.uicds.resourceInstanceService.ResourceInstanceListType)get_store().find_element_user(RESOURCEINSTANCELIST$0, 0);
                if (target == null)
                {
                    target = (org.uicds.resourceInstanceService.ResourceInstanceListType)get_store().add_element_user(RESOURCEINSTANCELIST$0);
                }
                target.set(resourceInstanceList);
            }
        }
        
        /**
         * Appends and returns a new empty "ResourceInstanceList" element
         */
        public org.uicds.resourceInstanceService.ResourceInstanceListType addNewResourceInstanceList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceInstanceService.ResourceInstanceListType target = null;
                target = (org.uicds.resourceInstanceService.ResourceInstanceListType)get_store().add_element_user(RESOURCEINSTANCELIST$0);
                return target;
            }
        }
    }
}
