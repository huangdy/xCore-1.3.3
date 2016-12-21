/*
 * An XML document type.
 * Localname: CheckoutResponse
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.CheckoutResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one CheckoutResponse(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class CheckoutResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.CheckoutResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CheckoutResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHECKOUTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "CheckoutResponse");
    
    
    /**
     * Gets the "CheckoutResponse" element
     */
    public org.uicds.resourceInstanceService.CheckoutResponseDocument.CheckoutResponse getCheckoutResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.CheckoutResponseDocument.CheckoutResponse target = null;
            target = (org.uicds.resourceInstanceService.CheckoutResponseDocument.CheckoutResponse)get_store().find_element_user(CHECKOUTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CheckoutResponse" element
     */
    public void setCheckoutResponse(org.uicds.resourceInstanceService.CheckoutResponseDocument.CheckoutResponse checkoutResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.CheckoutResponseDocument.CheckoutResponse target = null;
            target = (org.uicds.resourceInstanceService.CheckoutResponseDocument.CheckoutResponse)get_store().find_element_user(CHECKOUTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.CheckoutResponseDocument.CheckoutResponse)get_store().add_element_user(CHECKOUTRESPONSE$0);
            }
            target.set(checkoutResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CheckoutResponse" element
     */
    public org.uicds.resourceInstanceService.CheckoutResponseDocument.CheckoutResponse addNewCheckoutResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.CheckoutResponseDocument.CheckoutResponse target = null;
            target = (org.uicds.resourceInstanceService.CheckoutResponseDocument.CheckoutResponse)get_store().add_element_user(CHECKOUTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CheckoutResponse(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class CheckoutResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.CheckoutResponseDocument.CheckoutResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CheckoutResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
