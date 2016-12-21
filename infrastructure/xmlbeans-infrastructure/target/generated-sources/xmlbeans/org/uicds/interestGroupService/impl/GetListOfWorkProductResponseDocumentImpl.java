/*
 * An XML document type.
 * Localname: GetListOfWorkProductResponse
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.GetListOfWorkProductResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one GetListOfWorkProductResponse(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class GetListOfWorkProductResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.GetListOfWorkProductResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListOfWorkProductResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTOFWORKPRODUCTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "GetListOfWorkProductResponse");
    
    
    /**
     * Gets the "GetListOfWorkProductResponse" element
     */
    public org.uicds.interestGroupService.GetListOfWorkProductResponseDocument.GetListOfWorkProductResponse getGetListOfWorkProductResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetListOfWorkProductResponseDocument.GetListOfWorkProductResponse target = null;
            target = (org.uicds.interestGroupService.GetListOfWorkProductResponseDocument.GetListOfWorkProductResponse)get_store().find_element_user(GETLISTOFWORKPRODUCTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListOfWorkProductResponse" element
     */
    public void setGetListOfWorkProductResponse(org.uicds.interestGroupService.GetListOfWorkProductResponseDocument.GetListOfWorkProductResponse getListOfWorkProductResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetListOfWorkProductResponseDocument.GetListOfWorkProductResponse target = null;
            target = (org.uicds.interestGroupService.GetListOfWorkProductResponseDocument.GetListOfWorkProductResponse)get_store().find_element_user(GETLISTOFWORKPRODUCTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.GetListOfWorkProductResponseDocument.GetListOfWorkProductResponse)get_store().add_element_user(GETLISTOFWORKPRODUCTRESPONSE$0);
            }
            target.set(getListOfWorkProductResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetListOfWorkProductResponse" element
     */
    public org.uicds.interestGroupService.GetListOfWorkProductResponseDocument.GetListOfWorkProductResponse addNewGetListOfWorkProductResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetListOfWorkProductResponseDocument.GetListOfWorkProductResponse target = null;
            target = (org.uicds.interestGroupService.GetListOfWorkProductResponseDocument.GetListOfWorkProductResponse)get_store().add_element_user(GETLISTOFWORKPRODUCTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListOfWorkProductResponse(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class GetListOfWorkProductResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.GetListOfWorkProductResponseDocument.GetListOfWorkProductResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListOfWorkProductResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
