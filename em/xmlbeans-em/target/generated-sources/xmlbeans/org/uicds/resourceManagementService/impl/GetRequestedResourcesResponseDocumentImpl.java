/*
 * An XML document type.
 * Localname: GetRequestedResourcesResponse
 * Namespace: http://uicds.org/ResourceManagementService
 * Java type: org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceManagementService.impl;
/**
 * A document containing one GetRequestedResourcesResponse(@http://uicds.org/ResourceManagementService) element.
 *
 * This is a complex type.
 */
public class GetRequestedResourcesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetRequestedResourcesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETREQUESTEDRESOURCESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceManagementService", "GetRequestedResourcesResponse");
    
    
    /**
     * Gets the "GetRequestedResourcesResponse" element
     */
    public org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument.GetRequestedResourcesResponse getGetRequestedResourcesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument.GetRequestedResourcesResponse target = null;
            target = (org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument.GetRequestedResourcesResponse)get_store().find_element_user(GETREQUESTEDRESOURCESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetRequestedResourcesResponse" element
     */
    public void setGetRequestedResourcesResponse(org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument.GetRequestedResourcesResponse getRequestedResourcesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument.GetRequestedResourcesResponse target = null;
            target = (org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument.GetRequestedResourcesResponse)get_store().find_element_user(GETREQUESTEDRESOURCESRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument.GetRequestedResourcesResponse)get_store().add_element_user(GETREQUESTEDRESOURCESRESPONSE$0);
            }
            target.set(getRequestedResourcesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetRequestedResourcesResponse" element
     */
    public org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument.GetRequestedResourcesResponse addNewGetRequestedResourcesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument.GetRequestedResourcesResponse target = null;
            target = (org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument.GetRequestedResourcesResponse)get_store().add_element_user(GETREQUESTEDRESOURCESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetRequestedResourcesResponse(@http://uicds.org/ResourceManagementService).
     *
     * This is a complex type.
     */
    public static class GetRequestedResourcesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceManagementService.GetRequestedResourcesResponseDocument.GetRequestedResourcesResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetRequestedResourcesResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
