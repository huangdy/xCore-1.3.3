/*
 * An XML document type.
 * Localname: GetResourceInstanceResponse
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one GetResourceInstanceResponse(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class GetResourceInstanceResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetResourceInstanceResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRESOURCEINSTANCERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "GetResourceInstanceResponse");
    
    
    /**
     * Gets the "GetResourceInstanceResponse" element
     */
    public org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse getGetResourceInstanceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse target = null;
            target = (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse)get_store().find_element_user(GETRESOURCEINSTANCERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetResourceInstanceResponse" element
     */
    public void setGetResourceInstanceResponse(org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse getResourceInstanceResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse target = null;
            target = (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse)get_store().find_element_user(GETRESOURCEINSTANCERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse)get_store().add_element_user(GETRESOURCEINSTANCERESPONSE$0);
            }
            target.set(getResourceInstanceResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetResourceInstanceResponse" element
     */
    public org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse addNewGetResourceInstanceResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse target = null;
            target = (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse)get_store().add_element_user(GETRESOURCEINSTANCERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetResourceInstanceResponse(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class GetResourceInstanceResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetResourceInstanceResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCEINSTANCE$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ResourceInstance");
        
        
        /**
         * Gets the "ResourceInstance" element
         */
        public org.uicds.resourceInstanceService.ResourceInstance getResourceInstance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceInstanceService.ResourceInstance target = null;
                target = (org.uicds.resourceInstanceService.ResourceInstance)get_store().find_element_user(RESOURCEINSTANCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ResourceInstance" element
         */
        public void setResourceInstance(org.uicds.resourceInstanceService.ResourceInstance resourceInstance)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceInstanceService.ResourceInstance target = null;
                target = (org.uicds.resourceInstanceService.ResourceInstance)get_store().find_element_user(RESOURCEINSTANCE$0, 0);
                if (target == null)
                {
                    target = (org.uicds.resourceInstanceService.ResourceInstance)get_store().add_element_user(RESOURCEINSTANCE$0);
                }
                target.set(resourceInstance);
            }
        }
        
        /**
         * Appends and returns a new empty "ResourceInstance" element
         */
        public org.uicds.resourceInstanceService.ResourceInstance addNewResourceInstance()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceInstanceService.ResourceInstance target = null;
                target = (org.uicds.resourceInstanceService.ResourceInstance)get_store().add_element_user(RESOURCEINSTANCE$0);
                return target;
            }
        }
    }
}
