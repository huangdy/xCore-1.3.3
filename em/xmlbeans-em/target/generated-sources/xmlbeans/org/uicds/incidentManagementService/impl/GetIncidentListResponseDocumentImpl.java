/*
 * An XML document type.
 * Localname: GetIncidentListResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.GetIncidentListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one GetIncidentListResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class GetIncidentListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.GetIncidentListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetIncidentListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINCIDENTLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "GetIncidentListResponse");
    
    
    /**
     * Gets the "GetIncidentListResponse" element
     */
    public org.uicds.incidentManagementService.GetIncidentListResponseDocument.GetIncidentListResponse getGetIncidentListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.GetIncidentListResponseDocument.GetIncidentListResponse target = null;
            target = (org.uicds.incidentManagementService.GetIncidentListResponseDocument.GetIncidentListResponse)get_store().find_element_user(GETINCIDENTLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetIncidentListResponse" element
     */
    public void setGetIncidentListResponse(org.uicds.incidentManagementService.GetIncidentListResponseDocument.GetIncidentListResponse getIncidentListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.GetIncidentListResponseDocument.GetIncidentListResponse target = null;
            target = (org.uicds.incidentManagementService.GetIncidentListResponseDocument.GetIncidentListResponse)get_store().find_element_user(GETINCIDENTLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.incidentManagementService.GetIncidentListResponseDocument.GetIncidentListResponse)get_store().add_element_user(GETINCIDENTLISTRESPONSE$0);
            }
            target.set(getIncidentListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetIncidentListResponse" element
     */
    public org.uicds.incidentManagementService.GetIncidentListResponseDocument.GetIncidentListResponse addNewGetIncidentListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incidentManagementService.GetIncidentListResponseDocument.GetIncidentListResponse target = null;
            target = (org.uicds.incidentManagementService.GetIncidentListResponseDocument.GetIncidentListResponse)get_store().add_element_user(GETINCIDENTLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetIncidentListResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public static class GetIncidentListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.GetIncidentListResponseDocument.GetIncidentListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetIncidentListResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
