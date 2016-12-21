/*
 * An XML document type.
 * Localname: GetCommittedResourcesResponse
 * Namespace: http://uicds.org/ResourceManagementService
 * Java type: org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceManagementService.impl;
/**
 * A document containing one GetCommittedResourcesResponse(@http://uicds.org/ResourceManagementService) element.
 *
 * This is a complex type.
 */
public class GetCommittedResourcesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCommittedResourcesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOMMITTEDRESOURCESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceManagementService", "GetCommittedResourcesResponse");
    
    
    /**
     * Gets the "GetCommittedResourcesResponse" element
     */
    public org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument.GetCommittedResourcesResponse getGetCommittedResourcesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument.GetCommittedResourcesResponse target = null;
            target = (org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument.GetCommittedResourcesResponse)get_store().find_element_user(GETCOMMITTEDRESOURCESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCommittedResourcesResponse" element
     */
    public void setGetCommittedResourcesResponse(org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument.GetCommittedResourcesResponse getCommittedResourcesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument.GetCommittedResourcesResponse target = null;
            target = (org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument.GetCommittedResourcesResponse)get_store().find_element_user(GETCOMMITTEDRESOURCESRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument.GetCommittedResourcesResponse)get_store().add_element_user(GETCOMMITTEDRESOURCESRESPONSE$0);
            }
            target.set(getCommittedResourcesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCommittedResourcesResponse" element
     */
    public org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument.GetCommittedResourcesResponse addNewGetCommittedResourcesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument.GetCommittedResourcesResponse target = null;
            target = (org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument.GetCommittedResourcesResponse)get_store().add_element_user(GETCOMMITTEDRESOURCESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetCommittedResourcesResponse(@http://uicds.org/ResourceManagementService).
     *
     * This is a complex type.
     */
    public static class GetCommittedResourcesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceManagementService.GetCommittedResourcesResponseDocument.GetCommittedResourcesResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetCommittedResourcesResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
