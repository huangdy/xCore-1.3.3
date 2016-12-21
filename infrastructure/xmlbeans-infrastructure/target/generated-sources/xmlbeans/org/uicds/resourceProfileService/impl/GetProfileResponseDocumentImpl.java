/*
 * An XML document type.
 * Localname: GetProfileResponse
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.GetProfileResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * A document containing one GetProfileResponse(@http://uicds.org/ResourceProfileService) element.
 *
 * This is a complex type.
 */
public class GetProfileResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.GetProfileResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProfileResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROFILERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "GetProfileResponse");
    
    
    /**
     * Gets the "GetProfileResponse" element
     */
    public org.uicds.resourceProfileService.GetProfileResponseDocument.GetProfileResponse getGetProfileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.GetProfileResponseDocument.GetProfileResponse target = null;
            target = (org.uicds.resourceProfileService.GetProfileResponseDocument.GetProfileResponse)get_store().find_element_user(GETPROFILERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProfileResponse" element
     */
    public void setGetProfileResponse(org.uicds.resourceProfileService.GetProfileResponseDocument.GetProfileResponse getProfileResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.GetProfileResponseDocument.GetProfileResponse target = null;
            target = (org.uicds.resourceProfileService.GetProfileResponseDocument.GetProfileResponse)get_store().find_element_user(GETPROFILERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.GetProfileResponseDocument.GetProfileResponse)get_store().add_element_user(GETPROFILERESPONSE$0);
            }
            target.set(getProfileResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProfileResponse" element
     */
    public org.uicds.resourceProfileService.GetProfileResponseDocument.GetProfileResponse addNewGetProfileResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.GetProfileResponseDocument.GetProfileResponse target = null;
            target = (org.uicds.resourceProfileService.GetProfileResponseDocument.GetProfileResponse)get_store().add_element_user(GETPROFILERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProfileResponse(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class GetProfileResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.GetProfileResponseDocument.GetProfileResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetProfileResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
