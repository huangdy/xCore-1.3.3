/*
 * An XML document type.
 * Localname: GetProfileListResponse
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.GetProfileListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService.impl;
/**
 * A document containing one GetProfileListResponse(@http://uicds.org/ResourceProfileService) element.
 *
 * This is a complex type.
 */
public class GetProfileListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.GetProfileListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProfileListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROFILELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "GetProfileListResponse");
    
    
    /**
     * Gets the "GetProfileListResponse" element
     */
    public org.uicds.resourceProfileService.GetProfileListResponseDocument.GetProfileListResponse getGetProfileListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.GetProfileListResponseDocument.GetProfileListResponse target = null;
            target = (org.uicds.resourceProfileService.GetProfileListResponseDocument.GetProfileListResponse)get_store().find_element_user(GETPROFILELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProfileListResponse" element
     */
    public void setGetProfileListResponse(org.uicds.resourceProfileService.GetProfileListResponseDocument.GetProfileListResponse getProfileListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.GetProfileListResponseDocument.GetProfileListResponse target = null;
            target = (org.uicds.resourceProfileService.GetProfileListResponseDocument.GetProfileListResponse)get_store().find_element_user(GETPROFILELISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceProfileService.GetProfileListResponseDocument.GetProfileListResponse)get_store().add_element_user(GETPROFILELISTRESPONSE$0);
            }
            target.set(getProfileListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProfileListResponse" element
     */
    public org.uicds.resourceProfileService.GetProfileListResponseDocument.GetProfileListResponse addNewGetProfileListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceProfileService.GetProfileListResponseDocument.GetProfileListResponse target = null;
            target = (org.uicds.resourceProfileService.GetProfileListResponseDocument.GetProfileListResponse)get_store().add_element_user(GETPROFILELISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProfileListResponse(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public static class GetProfileListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceProfileService.GetProfileListResponseDocument.GetProfileListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetProfileListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PROFILELIST$0 = 
            new javax.xml.namespace.QName("http://uicds.org/ResourceProfileService", "ProfileList");
        
        
        /**
         * Gets the "ProfileList" element
         */
        public org.uicds.resourceProfileService.ResourceProfileListType getProfileList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.ResourceProfileListType target = null;
                target = (org.uicds.resourceProfileService.ResourceProfileListType)get_store().find_element_user(PROFILELIST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ProfileList" element
         */
        public void setProfileList(org.uicds.resourceProfileService.ResourceProfileListType profileList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.ResourceProfileListType target = null;
                target = (org.uicds.resourceProfileService.ResourceProfileListType)get_store().find_element_user(PROFILELIST$0, 0);
                if (target == null)
                {
                    target = (org.uicds.resourceProfileService.ResourceProfileListType)get_store().add_element_user(PROFILELIST$0);
                }
                target.set(profileList);
            }
        }
        
        /**
         * Appends and returns a new empty "ProfileList" element
         */
        public org.uicds.resourceProfileService.ResourceProfileListType addNewProfileList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.resourceProfileService.ResourceProfileListType target = null;
                target = (org.uicds.resourceProfileService.ResourceProfileListType)get_store().add_element_user(PROFILELIST$0);
                return target;
            }
        }
    }
}
