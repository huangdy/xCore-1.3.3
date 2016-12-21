/*
 * An XML document type.
 * Localname: CreateInterestGroupRequest
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.CreateInterestGroupRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one CreateInterestGroupRequest(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class CreateInterestGroupRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.CreateInterestGroupRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateInterestGroupRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEINTERESTGROUPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "CreateInterestGroupRequest");
    
    
    /**
     * Gets the "CreateInterestGroupRequest" element
     */
    public org.uicds.interestGroupService.CreateInterestGroupRequestDocument.CreateInterestGroupRequest getCreateInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.CreateInterestGroupRequestDocument.CreateInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.CreateInterestGroupRequestDocument.CreateInterestGroupRequest)get_store().find_element_user(CREATEINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateInterestGroupRequest" element
     */
    public void setCreateInterestGroupRequest(org.uicds.interestGroupService.CreateInterestGroupRequestDocument.CreateInterestGroupRequest createInterestGroupRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.CreateInterestGroupRequestDocument.CreateInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.CreateInterestGroupRequestDocument.CreateInterestGroupRequest)get_store().find_element_user(CREATEINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.CreateInterestGroupRequestDocument.CreateInterestGroupRequest)get_store().add_element_user(CREATEINTERESTGROUPREQUEST$0);
            }
            target.set(createInterestGroupRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateInterestGroupRequest" element
     */
    public org.uicds.interestGroupService.CreateInterestGroupRequestDocument.CreateInterestGroupRequest addNewCreateInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.CreateInterestGroupRequestDocument.CreateInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.CreateInterestGroupRequestDocument.CreateInterestGroupRequest)get_store().add_element_user(CREATEINTERESTGROUPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateInterestGroupRequest(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class CreateInterestGroupRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.CreateInterestGroupRequestDocument.CreateInterestGroupRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CreateInterestGroupRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTERESTGROUP$0 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroup");
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATIONLIST$2 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentificationList");
        
        
        /**
         * Gets the "InterestGroup" element
         */
        public com.saic.precis.x2009.x06.structures.InterestGroupType getInterestGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.InterestGroupType target = null;
                target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().find_element_user(INTERESTGROUP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "InterestGroup" element
         */
        public void setInterestGroup(com.saic.precis.x2009.x06.structures.InterestGroupType interestGroup)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.InterestGroupType target = null;
                target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().find_element_user(INTERESTGROUP$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().add_element_user(INTERESTGROUP$0);
                }
                target.set(interestGroup);
            }
        }
        
        /**
         * Appends and returns a new empty "InterestGroup" element
         */
        public com.saic.precis.x2009.x06.structures.InterestGroupType addNewInterestGroup()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.InterestGroupType target = null;
                target = (com.saic.precis.x2009.x06.structures.InterestGroupType)get_store().add_element_user(INTERESTGROUP$0);
                return target;
            }
        }
        
        /**
         * Gets the "WorkProductIdentificationList" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationListType getWorkProductIdentificationList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationListType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationListType)get_store().find_element_user(WORKPRODUCTIDENTIFICATIONLIST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductIdentificationList" element
         */
        public void setWorkProductIdentificationList(com.saic.precis.x2009.x06.base.IdentificationListType workProductIdentificationList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationListType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationListType)get_store().find_element_user(WORKPRODUCTIDENTIFICATIONLIST$2, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationListType)get_store().add_element_user(WORKPRODUCTIDENTIFICATIONLIST$2);
                }
                target.set(workProductIdentificationList);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductIdentificationList" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationListType addNewWorkProductIdentificationList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationListType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationListType)get_store().add_element_user(WORKPRODUCTIDENTIFICATIONLIST$2);
                return target;
            }
        }
    }
}
