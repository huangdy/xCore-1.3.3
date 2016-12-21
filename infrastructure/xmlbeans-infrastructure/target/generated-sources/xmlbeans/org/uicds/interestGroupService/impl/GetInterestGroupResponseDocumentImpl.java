/*
 * An XML document type.
 * Localname: GetInterestGroupResponse
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.GetInterestGroupResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one GetInterestGroupResponse(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class GetInterestGroupResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.GetInterestGroupResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetInterestGroupResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINTERESTGROUPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "GetInterestGroupResponse");
    
    
    /**
     * Gets the "GetInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse getGetInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse)get_store().find_element_user(GETINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetInterestGroupResponse" element
     */
    public void setGetInterestGroupResponse(org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse getInterestGroupResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse)get_store().find_element_user(GETINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse)get_store().add_element_user(GETINTERESTGROUPRESPONSE$0);
            }
            target.set(getInterestGroupResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse addNewGetInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse)get_store().add_element_user(GETINTERESTGROUPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetInterestGroupResponse(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class GetInterestGroupResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.GetInterestGroupResponseDocument.GetInterestGroupResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetInterestGroupResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCT$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProduct");
        
        
        /**
         * Gets the "WorkProduct" element
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct getWorkProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProduct" element
         */
        public void setWorkProduct(com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$0);
                }
                target.set(workProduct);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProduct" element
         */
        public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct addNewWorkProduct()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$0);
                return target;
            }
        }
    }
}
