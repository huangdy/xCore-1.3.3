/*
 * An XML document type.
 * Localname: RegisterRequest
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.RegisterRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService.impl;
/**
 * A document containing one RegisterRequest(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public class RegisterRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.RegisterRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegisterRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTERREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "RegisterRequest");
    
    
    /**
     * Gets the "RegisterRequest" element
     */
    public org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest getRegisterRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest target = null;
            target = (org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest)get_store().find_element_user(REGISTERREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RegisterRequest" element
     */
    public void setRegisterRequest(org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest registerRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest target = null;
            target = (org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest)get_store().find_element_user(REGISTERREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest)get_store().add_element_user(REGISTERREQUEST$0);
            }
            target.set(registerRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RegisterRequest" element
     */
    public org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest addNewRegisterRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest target = null;
            target = (org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest)get_store().add_element_user(REGISTERREQUEST$0);
            return target;
        }
    }
    /**
     * An XML RegisterRequest(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public static class RegisterRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest
    {
        private static final long serialVersionUID = 1L;
        
        public RegisterRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ID");
        private static final javax.xml.namespace.QName LOCALRESOURCEID$2 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "LocalResourceID");
        private static final javax.xml.namespace.QName RESOURCEPROFILEID$4 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceInstanceService", "ResourceProfileID");
        
        
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
        
        /**
         * Gets the "LocalResourceID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getLocalResourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(LOCALRESOURCEID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "LocalResourceID" element
         */
        public void setLocalResourceID(com.saic.precis.x2009.x06.base.IdentifierType localResourceID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(LOCALRESOURCEID$2, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(LOCALRESOURCEID$2);
                }
                target.set(localResourceID);
            }
        }
        
        /**
         * Appends and returns a new empty "LocalResourceID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewLocalResourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(LOCALRESOURCEID$2);
                return target;
            }
        }
        
        /**
         * Gets the "ResourceProfileID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getResourceProfileID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(RESOURCEPROFILEID$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ResourceProfileID" element
         */
        public void setResourceProfileID(com.saic.precis.x2009.x06.base.IdentifierType resourceProfileID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(RESOURCEPROFILEID$4, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(RESOURCEPROFILEID$4);
                }
                target.set(resourceProfileID);
            }
        }
        
        /**
         * Appends and returns a new empty "ResourceProfileID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewResourceProfileID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(RESOURCEPROFILEID$4);
                return target;
            }
        }
    }
}
