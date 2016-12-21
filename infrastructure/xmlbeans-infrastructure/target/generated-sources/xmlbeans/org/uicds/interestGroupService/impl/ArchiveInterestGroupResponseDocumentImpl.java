/*
 * An XML document type.
 * Localname: ArchiveInterestGroupResponse
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one ArchiveInterestGroupResponse(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class ArchiveInterestGroupResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArchiveInterestGroupResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCHIVEINTERESTGROUPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "ArchiveInterestGroupResponse");
    
    
    /**
     * Gets the "ArchiveInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument.ArchiveInterestGroupResponse getArchiveInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument.ArchiveInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument.ArchiveInterestGroupResponse)get_store().find_element_user(ARCHIVEINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArchiveInterestGroupResponse" element
     */
    public void setArchiveInterestGroupResponse(org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument.ArchiveInterestGroupResponse archiveInterestGroupResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument.ArchiveInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument.ArchiveInterestGroupResponse)get_store().find_element_user(ARCHIVEINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument.ArchiveInterestGroupResponse)get_store().add_element_user(ARCHIVEINTERESTGROUPRESPONSE$0);
            }
            target.set(archiveInterestGroupResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ArchiveInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument.ArchiveInterestGroupResponse addNewArchiveInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument.ArchiveInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument.ArchiveInterestGroupResponse)get_store().add_element_user(ARCHIVEINTERESTGROUPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ArchiveInterestGroupResponse(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class ArchiveInterestGroupResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.ArchiveInterestGroupResponseDocument.ArchiveInterestGroupResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ArchiveInterestGroupResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
