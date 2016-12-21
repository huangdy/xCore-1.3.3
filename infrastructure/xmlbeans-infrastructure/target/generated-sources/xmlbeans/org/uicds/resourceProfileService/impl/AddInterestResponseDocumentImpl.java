/*
 * An XML document type.
 * Localname: AddInterestResponse
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.AddInterestResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * A document containing one AddInterestResponse(@http://uicds.org/ResourceProfileService) element.
 *
 * This is a complex type.
 */
public class AddInterestResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.AddInterestResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AddInterestResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDINTERESTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "AddInterestResponse");
    
    
    /**
     * Gets the "AddInterestResponse" element
     */
    public org.uicds.resourceProfileService.AddInterestResponseDocument.AddInterestResponse getAddInterestResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.AddInterestResponseDocument.AddInterestResponse target = null;
            target = (org.uicds.resourceProfileService.AddInterestResponseDocument.AddInterestResponse)get_store().find_element_user(ADDINTERESTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AddInterestResponse" element
     */
    public void setAddInterestResponse(org.uicds.resourceProfileService.AddInterestResponseDocument.AddInterestResponse addInterestResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.AddInterestResponseDocument.AddInterestResponse target = null;
            target = (org.uicds.resourceProfileService.AddInterestResponseDocument.AddInterestResponse)get_store().find_element_user(ADDINTERESTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.AddInterestResponseDocument.AddInterestResponse)get_store().add_element_user(ADDINTERESTRESPONSE$0);
            }
            target.set(addInterestResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AddInterestResponse" element
     */
    public org.uicds.resourceProfileService.AddInterestResponseDocument.AddInterestResponse addNewAddInterestResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.AddInterestResponseDocument.AddInterestResponse target = null;
            target = (org.uicds.resourceProfileService.AddInterestResponseDocument.AddInterestResponse)get_store().add_element_user(ADDINTERESTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AddInterestResponse(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class AddInterestResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.AddInterestResponseDocument.AddInterestResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AddInterestResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
