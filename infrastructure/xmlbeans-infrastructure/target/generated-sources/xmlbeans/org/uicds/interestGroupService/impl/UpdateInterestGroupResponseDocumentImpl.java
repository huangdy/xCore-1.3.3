/*
 * An XML document type.
 * Localname: UpdateInterestGroupResponse
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.UpdateInterestGroupResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one UpdateInterestGroupResponse(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class UpdateInterestGroupResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.UpdateInterestGroupResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateInterestGroupResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEINTERESTGROUPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "UpdateInterestGroupResponse");
    
    
    /**
     * Gets the "UpdateInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse getUpdateInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse)get_store().find_element_user(UPDATEINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateInterestGroupResponse" element
     */
    public void setUpdateInterestGroupResponse(org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse updateInterestGroupResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse)get_store().find_element_user(UPDATEINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse)get_store().add_element_user(UPDATEINTERESTGROUPRESPONSE$0);
            }
            target.set(updateInterestGroupResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse addNewUpdateInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse)get_store().add_element_user(UPDATEINTERESTGROUPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateInterestGroupResponse(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class UpdateInterestGroupResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.UpdateInterestGroupResponseDocument.UpdateInterestGroupResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateInterestGroupResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTERESTGROUP$0 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroup");
        private static final javax.xml.namespace.QName INTERESTGROUPID$2 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroupId");
        
        
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
         * Gets the "InterestGroupId" element
         */
        public java.lang.String getInterestGroupId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTGROUPID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "InterestGroupId" element
         */
        public org.apache.xmlbeans.XmlString xgetInterestGroupId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERESTGROUPID$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "InterestGroupId" element
         */
        public void setInterestGroupId(java.lang.String interestGroupId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTGROUPID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERESTGROUPID$2);
                }
                target.setStringValue(interestGroupId);
            }
        }
        
        /**
         * Sets (as xml) the "InterestGroupId" element
         */
        public void xsetInterestGroupId(org.apache.xmlbeans.XmlString interestGroupId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERESTGROUPID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERESTGROUPID$2);
                }
                target.set(interestGroupId);
            }
        }
    }
}
