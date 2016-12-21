/*
 * An XML document type.
 * Localname: CreateProfileResponse
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.CreateProfileResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * A document containing one CreateProfileResponse(@http://uicds.org/ResourceProfileService) element.
 *
 * This is a complex type.
 */
public class CreateProfileResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.CreateProfileResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateProfileResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEPROFILERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "CreateProfileResponse");
    
    
    /**
     * Gets the "CreateProfileResponse" element
     */
    public org.uicds.resourceProfileService.CreateProfileResponseDocument.CreateProfileResponse getCreateProfileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.CreateProfileResponseDocument.CreateProfileResponse target = null;
            target = (org.uicds.resourceProfileService.CreateProfileResponseDocument.CreateProfileResponse)get_store().find_element_user(CREATEPROFILERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateProfileResponse" element
     */
    public void setCreateProfileResponse(org.uicds.resourceProfileService.CreateProfileResponseDocument.CreateProfileResponse createProfileResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.CreateProfileResponseDocument.CreateProfileResponse target = null;
            target = (org.uicds.resourceProfileService.CreateProfileResponseDocument.CreateProfileResponse)get_store().find_element_user(CREATEPROFILERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.CreateProfileResponseDocument.CreateProfileResponse)get_store().add_element_user(CREATEPROFILERESPONSE$0);
            }
            target.set(createProfileResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateProfileResponse" element
     */
    public org.uicds.resourceProfileService.CreateProfileResponseDocument.CreateProfileResponse addNewCreateProfileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.CreateProfileResponseDocument.CreateProfileResponse target = null;
            target = (org.uicds.resourceProfileService.CreateProfileResponseDocument.CreateProfileResponse)get_store().add_element_user(CREATEPROFILERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateProfileResponse(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class CreateProfileResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.CreateProfileResponseDocument.CreateProfileResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateProfileResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
