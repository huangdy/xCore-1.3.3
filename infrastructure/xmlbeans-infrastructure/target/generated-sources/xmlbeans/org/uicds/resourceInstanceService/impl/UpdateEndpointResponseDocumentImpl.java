/*
 * An XML document type.
 * Localname: UpdateEndpointResponse
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.UpdateEndpointResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one UpdateEndpointResponse(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class UpdateEndpointResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.UpdateEndpointResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateEndpointResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEENDPOINTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "UpdateEndpointResponse");
    
    
    /**
     * Gets the "UpdateEndpointResponse" element
     */
    public org.uicds.resourceInstanceService.UpdateEndpointResponseDocument.UpdateEndpointResponse getUpdateEndpointResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.UpdateEndpointResponseDocument.UpdateEndpointResponse target = null;
            target = (org.uicds.resourceInstanceService.UpdateEndpointResponseDocument.UpdateEndpointResponse)get_store().find_element_user(UPDATEENDPOINTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateEndpointResponse" element
     */
    public void setUpdateEndpointResponse(org.uicds.resourceInstanceService.UpdateEndpointResponseDocument.UpdateEndpointResponse updateEndpointResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.UpdateEndpointResponseDocument.UpdateEndpointResponse target = null;
            target = (org.uicds.resourceInstanceService.UpdateEndpointResponseDocument.UpdateEndpointResponse)get_store().find_element_user(UPDATEENDPOINTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.UpdateEndpointResponseDocument.UpdateEndpointResponse)get_store().add_element_user(UPDATEENDPOINTRESPONSE$0);
            }
            target.set(updateEndpointResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateEndpointResponse" element
     */
    public org.uicds.resourceInstanceService.UpdateEndpointResponseDocument.UpdateEndpointResponse addNewUpdateEndpointResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.UpdateEndpointResponseDocument.UpdateEndpointResponse target = null;
            target = (org.uicds.resourceInstanceService.UpdateEndpointResponseDocument.UpdateEndpointResponse)get_store().add_element_user(UPDATEENDPOINTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateEndpointResponse(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class UpdateEndpointResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.UpdateEndpointResponseDocument.UpdateEndpointResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateEndpointResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
