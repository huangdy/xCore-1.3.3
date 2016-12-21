/*
 * An XML document type.
 * Localname: GetAssociatedWorkProductListResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService.impl;
/**
 * A document containing one GetAssociatedWorkProductListResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class GetAssociatedWorkProductListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAssociatedWorkProductListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETASSOCIATEDWORKPRODUCTLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "GetAssociatedWorkProductListResponse");
    
    
    /**
     * Gets the "GetAssociatedWorkProductListResponse" element
     */
    public org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse getGetAssociatedWorkProductListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse target = null;
            target = (org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse)get_store().find_element_user(GETASSOCIATEDWORKPRODUCTLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAssociatedWorkProductListResponse" element
     */
    public void setGetAssociatedWorkProductListResponse(org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse getAssociatedWorkProductListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse target = null;
            target = (org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse)get_store().find_element_user(GETASSOCIATEDWORKPRODUCTLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse)get_store().add_element_user(GETASSOCIATEDWORKPRODUCTLISTRESPONSE$0);
            }
            target.set(getAssociatedWorkProductListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAssociatedWorkProductListResponse" element
     */
    public org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse addNewGetAssociatedWorkProductListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse target = null;
            target = (org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse)get_store().add_element_user(GETASSOCIATEDWORKPRODUCTLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetAssociatedWorkProductListResponse(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class GetAssociatedWorkProductListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.GetAssociatedWorkProductListResponseDocument.GetAssociatedWorkProductListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetAssociatedWorkProductListResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTLIST$0 = 
            new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "WorkProductList");
        
        
        /**
         * Gets the "WorkProductList" element
         */
        public org.uicds.workProductService.WorkProductListDocument.WorkProductList getWorkProductList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workProductService.WorkProductListDocument.WorkProductList target = null;
                target = (org.uicds.workProductService.WorkProductListDocument.WorkProductList)get_store().find_element_user(WORKPRODUCTLIST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductList" element
         */
        public void setWorkProductList(org.uicds.workProductService.WorkProductListDocument.WorkProductList workProductList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workProductService.WorkProductListDocument.WorkProductList target = null;
                target = (org.uicds.workProductService.WorkProductListDocument.WorkProductList)get_store().find_element_user(WORKPRODUCTLIST$0, 0);
                if (target == null)
                {
                    target = (org.uicds.workProductService.WorkProductListDocument.WorkProductList)get_store().add_element_user(WORKPRODUCTLIST$0);
                }
                target.set(workProductList);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductList" element
         */
        public org.uicds.workProductService.WorkProductListDocument.WorkProductList addNewWorkProductList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.workProductService.WorkProductListDocument.WorkProductList target = null;
                target = (org.uicds.workProductService.WorkProductListDocument.WorkProductList)get_store().add_element_user(WORKPRODUCTLIST$0);
                return target;
            }
        }
    }
}
