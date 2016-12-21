/*
 * An XML document type.
 * Localname: AssociateWorkProductToInterestGroupResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService.impl;
/**
 * A document containing one AssociateWorkProductToInterestGroupResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class AssociateWorkProductToInterestGroupResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public AssociateWorkProductToInterestGroupResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ASSOCIATEWORKPRODUCTTOINTERESTGROUPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "AssociateWorkProductToInterestGroupResponse");
    
    
    /**
     * Gets the "AssociateWorkProductToInterestGroupResponse" element
     */
    public org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse getAssociateWorkProductToInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse target = null;
            target = (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse)get_store().find_element_user(ASSOCIATEWORKPRODUCTTOINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AssociateWorkProductToInterestGroupResponse" element
     */
    public void setAssociateWorkProductToInterestGroupResponse(org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse associateWorkProductToInterestGroupResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse target = null;
            target = (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse)get_store().find_element_user(ASSOCIATEWORKPRODUCTTOINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse)get_store().add_element_user(ASSOCIATEWORKPRODUCTTOINTERESTGROUPRESPONSE$0);
            }
            target.set(associateWorkProductToInterestGroupResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "AssociateWorkProductToInterestGroupResponse" element
     */
    public org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse addNewAssociateWorkProductToInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse target = null;
            target = (org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse)get_store().add_element_user(ASSOCIATEWORKPRODUCTTOINTERESTGROUPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML AssociateWorkProductToInterestGroupResponse(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class AssociateWorkProductToInterestGroupResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.AssociateWorkProductToInterestGroupResponseDocument.AssociateWorkProductToInterestGroupResponse
    {
        private static final long serialVersionUID = 1L;
        
        public AssociateWorkProductToInterestGroupResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
