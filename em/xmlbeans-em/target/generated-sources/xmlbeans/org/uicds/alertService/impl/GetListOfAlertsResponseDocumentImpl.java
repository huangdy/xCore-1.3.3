/*
 * An XML document type.
 * Localname: GetListOfAlertsResponse
 * Namespace: http://uicds.org/AlertService
 * Java type: org.uicds.alertService.GetListOfAlertsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.alertService.impl;
/**
 * A document containing one GetListOfAlertsResponse(@http://uicds.org/AlertService) element.
 *
 * This is a complex type.
 */
public class GetListOfAlertsResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.GetListOfAlertsResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListOfAlertsResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTOFALERTSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AlertService", "GetListOfAlertsResponse");
    
    
    /**
     * Gets the "GetListOfAlertsResponse" element
     */
    public org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse getGetListOfAlertsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse target = null;
            target = (org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse)get_store().find_element_user(GETLISTOFALERTSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListOfAlertsResponse" element
     */
    public void setGetListOfAlertsResponse(org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse getListOfAlertsResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse target = null;
            target = (org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse)get_store().find_element_user(GETLISTOFALERTSRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse)get_store().add_element_user(GETLISTOFALERTSRESPONSE$0);
            }
            target.set(getListOfAlertsResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetListOfAlertsResponse" element
     */
    public org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse addNewGetListOfAlertsResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse target = null;
            target = (org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse)get_store().add_element_user(GETLISTOFALERTSRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetListOfAlertsResponse(@http://uicds.org/AlertService).
     *
     * This is a complex type.
     */
    public static class GetListOfAlertsResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetListOfAlertsResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
