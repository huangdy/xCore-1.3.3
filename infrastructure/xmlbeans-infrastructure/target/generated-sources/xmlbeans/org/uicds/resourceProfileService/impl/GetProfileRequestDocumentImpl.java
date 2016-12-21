/*
 * An XML document type.
 * Localname: GetProfileRequest
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.GetProfileRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * A document containing one GetProfileRequest(@http://uicds.org/ResourceProfileService) element.
 *
 * This is a complex type.
 */
public class GetProfileRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.GetProfileRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProfileRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROFILEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "GetProfileRequest");
    
    
    /**
     * Gets the "GetProfileRequest" element
     */
    public org.uicds.resourceProfileService.GetProfileRequestDocument.GetProfileRequest getGetProfileRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.GetProfileRequestDocument.GetProfileRequest target = null;
            target = (org.uicds.resourceProfileService.GetProfileRequestDocument.GetProfileRequest)get_store().find_element_user(GETPROFILEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProfileRequest" element
     */
    public void setGetProfileRequest(org.uicds.resourceProfileService.GetProfileRequestDocument.GetProfileRequest getProfileRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.GetProfileRequestDocument.GetProfileRequest target = null;
            target = (org.uicds.resourceProfileService.GetProfileRequestDocument.GetProfileRequest)get_store().find_element_user(GETPROFILEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.GetProfileRequestDocument.GetProfileRequest)get_store().add_element_user(GETPROFILEREQUEST$0);
            }
            target.set(getProfileRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProfileRequest" element
     */
    public org.uicds.resourceProfileService.GetProfileRequestDocument.GetProfileRequest addNewGetProfileRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.GetProfileRequestDocument.GetProfileRequest target = null;
            target = (org.uicds.resourceProfileService.GetProfileRequestDocument.GetProfileRequest)get_store().add_element_user(GETPROFILEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetProfileRequest(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class GetProfileRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.GetProfileRequestDocument.GetProfileRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetProfileRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
