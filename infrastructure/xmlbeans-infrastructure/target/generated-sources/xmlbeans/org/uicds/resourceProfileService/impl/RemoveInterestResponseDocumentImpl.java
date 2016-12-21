/*
 * An XML document type.
 * Localname: RemoveInterestResponse
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.RemoveInterestResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * A document containing one RemoveInterestResponse(@http://uicds.org/ResourceProfileService) element.
 *
 * This is a complex type.
 */
public class RemoveInterestResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.RemoveInterestResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RemoveInterestResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REMOVEINTERESTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "RemoveInterestResponse");
    
    
    /**
     * Gets the "RemoveInterestResponse" element
     */
    public org.uicds.resourceProfileService.RemoveInterestResponseDocument.RemoveInterestResponse getRemoveInterestResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.RemoveInterestResponseDocument.RemoveInterestResponse target = null;
            target = (org.uicds.resourceProfileService.RemoveInterestResponseDocument.RemoveInterestResponse)get_store().find_element_user(REMOVEINTERESTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RemoveInterestResponse" element
     */
    public void setRemoveInterestResponse(org.uicds.resourceProfileService.RemoveInterestResponseDocument.RemoveInterestResponse removeInterestResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.RemoveInterestResponseDocument.RemoveInterestResponse target = null;
            target = (org.uicds.resourceProfileService.RemoveInterestResponseDocument.RemoveInterestResponse)get_store().find_element_user(REMOVEINTERESTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.RemoveInterestResponseDocument.RemoveInterestResponse)get_store().add_element_user(REMOVEINTERESTRESPONSE$0);
            }
            target.set(removeInterestResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RemoveInterestResponse" element
     */
    public org.uicds.resourceProfileService.RemoveInterestResponseDocument.RemoveInterestResponse addNewRemoveInterestResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.RemoveInterestResponseDocument.RemoveInterestResponse target = null;
            target = (org.uicds.resourceProfileService.RemoveInterestResponseDocument.RemoveInterestResponse)get_store().add_element_user(REMOVEINTERESTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RemoveInterestResponse(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class RemoveInterestResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.RemoveInterestResponseDocument.RemoveInterestResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RemoveInterestResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
