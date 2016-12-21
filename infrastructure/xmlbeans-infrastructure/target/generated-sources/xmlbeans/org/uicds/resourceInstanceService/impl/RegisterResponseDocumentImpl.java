/*
 * An XML document type.
 * Localname: RegisterResponse
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.RegisterResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one RegisterResponse(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class RegisterResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.RegisterResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegisterResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTERRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "RegisterResponse");
    
    
    /**
     * Gets the "RegisterResponse" element
     */
    public org.uicds.resourceInstanceService.RegisterResponseDocument.RegisterResponse getRegisterResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.RegisterResponseDocument.RegisterResponse target = null;
            target = (org.uicds.resourceInstanceService.RegisterResponseDocument.RegisterResponse)get_store().find_element_user(REGISTERRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RegisterResponse" element
     */
    public void setRegisterResponse(org.uicds.resourceInstanceService.RegisterResponseDocument.RegisterResponse registerResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.RegisterResponseDocument.RegisterResponse target = null;
            target = (org.uicds.resourceInstanceService.RegisterResponseDocument.RegisterResponse)get_store().find_element_user(REGISTERRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.RegisterResponseDocument.RegisterResponse)get_store().add_element_user(REGISTERRESPONSE$0);
            }
            target.set(registerResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RegisterResponse" element
     */
    public org.uicds.resourceInstanceService.RegisterResponseDocument.RegisterResponse addNewRegisterResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.RegisterResponseDocument.RegisterResponse target = null;
            target = (org.uicds.resourceInstanceService.RegisterResponseDocument.RegisterResponse)get_store().add_element_user(REGISTERRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RegisterResponse(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class RegisterResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.RegisterResponseDocument.RegisterResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RegisterResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
