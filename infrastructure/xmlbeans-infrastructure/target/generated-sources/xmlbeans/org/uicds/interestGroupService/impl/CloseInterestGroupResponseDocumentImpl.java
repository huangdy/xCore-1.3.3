/*
 * An XML document type.
 * Localname: CloseInterestGroupResponse
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.CloseInterestGroupResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one CloseInterestGroupResponse(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class CloseInterestGroupResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.CloseInterestGroupResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseInterestGroupResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEINTERESTGROUPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "CloseInterestGroupResponse");
    
    
    /**
     * Gets the "CloseInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.CloseInterestGroupResponseDocument.CloseInterestGroupResponse getCloseInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.CloseInterestGroupResponseDocument.CloseInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.CloseInterestGroupResponseDocument.CloseInterestGroupResponse)get_store().find_element_user(CLOSEINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CloseInterestGroupResponse" element
     */
    public void setCloseInterestGroupResponse(org.uicds.interestGroupService.CloseInterestGroupResponseDocument.CloseInterestGroupResponse closeInterestGroupResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.CloseInterestGroupResponseDocument.CloseInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.CloseInterestGroupResponseDocument.CloseInterestGroupResponse)get_store().find_element_user(CLOSEINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.CloseInterestGroupResponseDocument.CloseInterestGroupResponse)get_store().add_element_user(CLOSEINTERESTGROUPRESPONSE$0);
            }
            target.set(closeInterestGroupResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CloseInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.CloseInterestGroupResponseDocument.CloseInterestGroupResponse addNewCloseInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.CloseInterestGroupResponseDocument.CloseInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.CloseInterestGroupResponseDocument.CloseInterestGroupResponse)get_store().add_element_user(CLOSEINTERESTGROUPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CloseInterestGroupResponse(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class CloseInterestGroupResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.CloseInterestGroupResponseDocument.CloseInterestGroupResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CloseInterestGroupResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTPROCESSINGSTATUS$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductProcessingStatus");
        
        
        /**
         * Gets the "WorkProductProcessingStatus" element
         */
        public com.saic.precis.x2009.x06.base.ProcessingStatusType getWorkProductProcessingStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.ProcessingStatusType target = null;
                target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().find_element_user(WORKPRODUCTPROCESSINGSTATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductProcessingStatus" element
         */
        public void setWorkProductProcessingStatus(com.saic.precis.x2009.x06.base.ProcessingStatusType workProductProcessingStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.ProcessingStatusType target = null;
                target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().find_element_user(WORKPRODUCTPROCESSINGSTATUS$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().add_element_user(WORKPRODUCTPROCESSINGSTATUS$0);
                }
                target.set(workProductProcessingStatus);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductProcessingStatus" element
         */
        public com.saic.precis.x2009.x06.base.ProcessingStatusType addNewWorkProductProcessingStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.ProcessingStatusType target = null;
                target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().add_element_user(WORKPRODUCTPROCESSINGSTATUS$0);
                return target;
            }
        }
    }
}
