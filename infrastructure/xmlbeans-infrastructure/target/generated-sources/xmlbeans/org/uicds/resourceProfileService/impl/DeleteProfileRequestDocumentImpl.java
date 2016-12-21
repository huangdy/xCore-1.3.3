/*
 * An XML document type.
 * Localname: DeleteProfileRequest
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.DeleteProfileRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * A document containing one DeleteProfileRequest(@http://uicds.org/ResourceProfileService) element.
 *
 * This is a complex type.
 */
public class DeleteProfileRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.DeleteProfileRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public DeleteProfileRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELETEPROFILEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "DeleteProfileRequest");
    
    
    /**
     * Gets the "DeleteProfileRequest" element
     */
    public org.uicds.resourceProfileService.DeleteProfileRequestDocument.DeleteProfileRequest getDeleteProfileRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.DeleteProfileRequestDocument.DeleteProfileRequest target = null;
            target = (org.uicds.resourceProfileService.DeleteProfileRequestDocument.DeleteProfileRequest)get_store().find_element_user(DELETEPROFILEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DeleteProfileRequest" element
     */
    public void setDeleteProfileRequest(org.uicds.resourceProfileService.DeleteProfileRequestDocument.DeleteProfileRequest deleteProfileRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.DeleteProfileRequestDocument.DeleteProfileRequest target = null;
            target = (org.uicds.resourceProfileService.DeleteProfileRequestDocument.DeleteProfileRequest)get_store().find_element_user(DELETEPROFILEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.DeleteProfileRequestDocument.DeleteProfileRequest)get_store().add_element_user(DELETEPROFILEREQUEST$0);
            }
            target.set(deleteProfileRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "DeleteProfileRequest" element
     */
    public org.uicds.resourceProfileService.DeleteProfileRequestDocument.DeleteProfileRequest addNewDeleteProfileRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.DeleteProfileRequestDocument.DeleteProfileRequest target = null;
            target = (org.uicds.resourceProfileService.DeleteProfileRequestDocument.DeleteProfileRequest)get_store().add_element_user(DELETEPROFILEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML DeleteProfileRequest(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class DeleteProfileRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.DeleteProfileRequestDocument.DeleteProfileRequest
    {
        private static final long serialVersionUID = 1L;
        
        public DeleteProfileRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "ID");
        
        
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
