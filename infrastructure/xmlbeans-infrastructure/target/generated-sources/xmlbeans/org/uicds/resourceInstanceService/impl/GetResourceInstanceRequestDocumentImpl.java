/*
 * An XML document type.
 * Localname: GetResourceInstanceRequest
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one GetResourceInstanceRequest(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class GetResourceInstanceRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetResourceInstanceRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRESOURCEINSTANCEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "GetResourceInstanceRequest");
    
    
    /**
     * Gets the "GetResourceInstanceRequest" element
     */
    public org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument.GetResourceInstanceRequest getGetResourceInstanceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument.GetResourceInstanceRequest target = null;
            target = (org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument.GetResourceInstanceRequest)get_store().find_element_user(GETRESOURCEINSTANCEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetResourceInstanceRequest" element
     */
    public void setGetResourceInstanceRequest(org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument.GetResourceInstanceRequest getResourceInstanceRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument.GetResourceInstanceRequest target = null;
            target = (org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument.GetResourceInstanceRequest)get_store().find_element_user(GETRESOURCEINSTANCEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument.GetResourceInstanceRequest)get_store().add_element_user(GETRESOURCEINSTANCEREQUEST$0);
            }
            target.set(getResourceInstanceRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetResourceInstanceRequest" element
     */
    public org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument.GetResourceInstanceRequest addNewGetResourceInstanceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument.GetResourceInstanceRequest target = null;
            target = (org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument.GetResourceInstanceRequest)get_store().add_element_user(GETRESOURCEINSTANCEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetResourceInstanceRequest(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class GetResourceInstanceRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.GetResourceInstanceRequestDocument.GetResourceInstanceRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetResourceInstanceRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ID");
        
        
        /**
         * Gets the "ID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ID" element
         */
        public void setID(com.saic.precis.x2009.x06.base.IdentifierType id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "ID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(ID$0);
                return target;
            }
        }
    }
}
