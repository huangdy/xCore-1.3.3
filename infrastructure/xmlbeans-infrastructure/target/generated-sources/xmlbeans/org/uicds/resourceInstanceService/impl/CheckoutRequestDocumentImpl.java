/*
 * An XML document type.
 * Localname: CheckoutRequest
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.CheckoutRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one CheckoutRequest(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class CheckoutRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.CheckoutRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckoutRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKOUTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "CheckoutRequest");
    
    
    /**
     * Gets the "CheckoutRequest" element
     */
    public org.uicds.resourceInstanceService.CheckoutRequestDocument.CheckoutRequest getCheckoutRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.CheckoutRequestDocument.CheckoutRequest target = null;
            target = (org.uicds.resourceInstanceService.CheckoutRequestDocument.CheckoutRequest)get_store().find_element_user(CHECKOUTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CheckoutRequest" element
     */
    public void setCheckoutRequest(org.uicds.resourceInstanceService.CheckoutRequestDocument.CheckoutRequest checkoutRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.CheckoutRequestDocument.CheckoutRequest target = null;
            target = (org.uicds.resourceInstanceService.CheckoutRequestDocument.CheckoutRequest)get_store().find_element_user(CHECKOUTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.CheckoutRequestDocument.CheckoutRequest)get_store().add_element_user(CHECKOUTREQUEST$0);
            }
            target.set(checkoutRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CheckoutRequest" element
     */
    public org.uicds.resourceInstanceService.CheckoutRequestDocument.CheckoutRequest addNewCheckoutRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.CheckoutRequestDocument.CheckoutRequest target = null;
            target = (org.uicds.resourceInstanceService.CheckoutRequestDocument.CheckoutRequest)get_store().add_element_user(CHECKOUTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CheckoutRequest(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class CheckoutRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.CheckoutRequestDocument.CheckoutRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CheckoutRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
