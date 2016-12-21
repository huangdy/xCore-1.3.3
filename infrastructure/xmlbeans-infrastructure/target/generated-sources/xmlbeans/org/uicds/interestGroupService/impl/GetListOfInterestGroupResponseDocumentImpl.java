/*
 * An XML document type.
 * Localname: GetListOfInterestGroupResponse
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one GetListOfInterestGroupResponse(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class GetListOfInterestGroupResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListOfInterestGroupResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTOFINTERESTGROUPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "GetListOfInterestGroupResponse");
    
    
    /**
     * Gets the "GetListOfInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument.GetListOfInterestGroupResponse getGetListOfInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument.GetListOfInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument.GetListOfInterestGroupResponse)get_store().find_element_user(GETLISTOFINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListOfInterestGroupResponse" element
     */
    public void setGetListOfInterestGroupResponse(org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument.GetListOfInterestGroupResponse getListOfInterestGroupResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument.GetListOfInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument.GetListOfInterestGroupResponse)get_store().find_element_user(GETLISTOFINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument.GetListOfInterestGroupResponse)get_store().add_element_user(GETLISTOFINTERESTGROUPRESPONSE$0);
            }
            target.set(getListOfInterestGroupResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetListOfInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument.GetListOfInterestGroupResponse addNewGetListOfInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument.GetListOfInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument.GetListOfInterestGroupResponse)get_store().add_element_user(GETLISTOFINTERESTGROUPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListOfInterestGroupResponse(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class GetListOfInterestGroupResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.GetListOfInterestGroupResponseDocument.GetListOfInterestGroupResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListOfInterestGroupResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTERESTGROUPLIST$0 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroupList");
        
        
        /**
         * Gets the "InterestGroupList" element
         */
        public org.uicds.interestGroupService.InterestGroupListType getInterestGroupList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.interestGroupService.InterestGroupListType target = null;
                target = (org.uicds.interestGroupService.InterestGroupListType)get_store().find_element_user(INTERESTGROUPLIST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "InterestGroupList" element
         */
        public void setInterestGroupList(org.uicds.interestGroupService.InterestGroupListType interestGroupList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.interestGroupService.InterestGroupListType target = null;
                target = (org.uicds.interestGroupService.InterestGroupListType)get_store().find_element_user(INTERESTGROUPLIST$0, 0);
                if (target == null)
                {
                    target = (org.uicds.interestGroupService.InterestGroupListType)get_store().add_element_user(INTERESTGROUPLIST$0);
                }
                target.set(interestGroupList);
            }
        }
        
        /**
         * Appends and returns a new empty "InterestGroupList" element
         */
        public org.uicds.interestGroupService.InterestGroupListType addNewInterestGroupList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.interestGroupService.InterestGroupListType target = null;
                target = (org.uicds.interestGroupService.InterestGroupListType)get_store().add_element_user(INTERESTGROUPLIST$0);
                return target;
            }
        }
    }
}
