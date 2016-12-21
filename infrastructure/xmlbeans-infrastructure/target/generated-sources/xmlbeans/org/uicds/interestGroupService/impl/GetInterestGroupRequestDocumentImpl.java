/*
 * An XML document type.
 * Localname: GetInterestGroupRequest
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.GetInterestGroupRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one GetInterestGroupRequest(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class GetInterestGroupRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.GetInterestGroupRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetInterestGroupRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINTERESTGROUPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "GetInterestGroupRequest");
    
    
    /**
     * Gets the "GetInterestGroupRequest" element
     */
    public org.uicds.interestGroupService.GetInterestGroupRequestDocument.GetInterestGroupRequest getGetInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetInterestGroupRequestDocument.GetInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.GetInterestGroupRequestDocument.GetInterestGroupRequest)get_store().find_element_user(GETINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetInterestGroupRequest" element
     */
    public void setGetInterestGroupRequest(org.uicds.interestGroupService.GetInterestGroupRequestDocument.GetInterestGroupRequest getInterestGroupRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetInterestGroupRequestDocument.GetInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.GetInterestGroupRequestDocument.GetInterestGroupRequest)get_store().find_element_user(GETINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.GetInterestGroupRequestDocument.GetInterestGroupRequest)get_store().add_element_user(GETINTERESTGROUPREQUEST$0);
            }
            target.set(getInterestGroupRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetInterestGroupRequest" element
     */
    public org.uicds.interestGroupService.GetInterestGroupRequestDocument.GetInterestGroupRequest addNewGetInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetInterestGroupRequestDocument.GetInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.GetInterestGroupRequestDocument.GetInterestGroupRequest)get_store().add_element_user(GETINTERESTGROUPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetInterestGroupRequest(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class GetInterestGroupRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.GetInterestGroupRequestDocument.GetInterestGroupRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetInterestGroupRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductIdentification" element
         */
        public void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                }
                target.set(workProductIdentification);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                return target;
            }
        }
    }
}
