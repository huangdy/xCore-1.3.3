/*
 * An XML document type.
 * Localname: UnregisterRequest
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.UnregisterRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one UnregisterRequest(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class UnregisterRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.UnregisterRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnregisterRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNREGISTERREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "UnregisterRequest");
    
    
    /**
     * Gets the "UnregisterRequest" element
     */
    public org.uicds.resourceInstanceService.UnregisterRequestDocument.UnregisterRequest getUnregisterRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.UnregisterRequestDocument.UnregisterRequest target = null;
            target = (org.uicds.resourceInstanceService.UnregisterRequestDocument.UnregisterRequest)get_store().find_element_user(UNREGISTERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnregisterRequest" element
     */
    public void setUnregisterRequest(org.uicds.resourceInstanceService.UnregisterRequestDocument.UnregisterRequest unregisterRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.UnregisterRequestDocument.UnregisterRequest target = null;
            target = (org.uicds.resourceInstanceService.UnregisterRequestDocument.UnregisterRequest)get_store().find_element_user(UNREGISTERREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.UnregisterRequestDocument.UnregisterRequest)get_store().add_element_user(UNREGISTERREQUEST$0);
            }
            target.set(unregisterRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UnregisterRequest" element
     */
    public org.uicds.resourceInstanceService.UnregisterRequestDocument.UnregisterRequest addNewUnregisterRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.UnregisterRequestDocument.UnregisterRequest target = null;
            target = (org.uicds.resourceInstanceService.UnregisterRequestDocument.UnregisterRequest)get_store().add_element_user(UNREGISTERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UnregisterRequest(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class UnregisterRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.UnregisterRequestDocument.UnregisterRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UnregisterRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
