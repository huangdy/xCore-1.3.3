/*
 * An XML document type.
 * Localname: CreateProfileRequest
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.CreateProfileRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * A document containing one CreateProfileRequest(@http://uicds.org/ResourceProfileService) element.
 *
 * This is a complex type.
 */
public class CreateProfileRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.CreateProfileRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateProfileRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEPROFILEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "CreateProfileRequest");
    
    
    /**
     * Gets the "CreateProfileRequest" element
     */
    public org.uicds.resourceProfileService.CreateProfileRequestDocument.CreateProfileRequest getCreateProfileRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.CreateProfileRequestDocument.CreateProfileRequest target = null;
            target = (org.uicds.resourceProfileService.CreateProfileRequestDocument.CreateProfileRequest)get_store().find_element_user(CREATEPROFILEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateProfileRequest" element
     */
    public void setCreateProfileRequest(org.uicds.resourceProfileService.CreateProfileRequestDocument.CreateProfileRequest createProfileRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.CreateProfileRequestDocument.CreateProfileRequest target = null;
            target = (org.uicds.resourceProfileService.CreateProfileRequestDocument.CreateProfileRequest)get_store().find_element_user(CREATEPROFILEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.CreateProfileRequestDocument.CreateProfileRequest)get_store().add_element_user(CREATEPROFILEREQUEST$0);
            }
            target.set(createProfileRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateProfileRequest" element
     */
    public org.uicds.resourceProfileService.CreateProfileRequestDocument.CreateProfileRequest addNewCreateProfileRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.CreateProfileRequestDocument.CreateProfileRequest target = null;
            target = (org.uicds.resourceProfileService.CreateProfileRequestDocument.CreateProfileRequest)get_store().add_element_user(CREATEPROFILEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateProfileRequest(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class CreateProfileRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.CreateProfileRequestDocument.CreateProfileRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CreateProfileRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROFILE$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "Profile");
        
        
        /**
         * Gets the "Profile" element
         */
        public org.uicds.resourceProfileService.ResourceProfile getProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.ResourceProfile target = null;
                target = (org.uicds.resourceProfileService.ResourceProfile)get_store().find_element_user(PROFILE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Profile" element
         */
        public void setProfile(org.uicds.resourceProfileService.ResourceProfile profile)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.ResourceProfile target = null;
                target = (org.uicds.resourceProfileService.ResourceProfile)get_store().find_element_user(PROFILE$0, 0);
                if (target == null)
                {
                    target = (org.uicds.resourceProfileService.ResourceProfile)get_store().add_element_user(PROFILE$0);
                }
                target.set(profile);
            }
        }
        
        /**
         * Appends and returns a new empty "Profile" element
         */
        public org.uicds.resourceProfileService.ResourceProfile addNewProfile()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.ResourceProfile target = null;
                target = (org.uicds.resourceProfileService.ResourceProfile)get_store().add_element_user(PROFILE$0);
                return target;
            }
        }
    }
}
