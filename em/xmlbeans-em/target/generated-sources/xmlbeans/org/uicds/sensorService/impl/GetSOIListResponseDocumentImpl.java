/*
 * An XML document type.
 * Localname: GetSOIListResponse
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorService.GetSOIListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorService.impl;
/**
 * A document containing one GetSOIListResponse(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public class GetSOIListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.GetSOIListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSOIListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSOILISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/SensorService", "GetSOIListResponse");
    
    
    /**
     * Gets the "GetSOIListResponse" element
     */
    public org.uicds.sensorService.GetSOIListResponseDocument.GetSOIListResponse getGetSOIListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.GetSOIListResponseDocument.GetSOIListResponse target = null;
            target = (org.uicds.sensorService.GetSOIListResponseDocument.GetSOIListResponse)get_store().find_element_user(GETSOILISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSOIListResponse" element
     */
    public void setGetSOIListResponse(org.uicds.sensorService.GetSOIListResponseDocument.GetSOIListResponse getSOIListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.GetSOIListResponseDocument.GetSOIListResponse target = null;
            target = (org.uicds.sensorService.GetSOIListResponseDocument.GetSOIListResponse)get_store().find_element_user(GETSOILISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.sensorService.GetSOIListResponseDocument.GetSOIListResponse)get_store().add_element_user(GETSOILISTRESPONSE$0);
            }
            target.set(getSOIListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetSOIListResponse" element
     */
    public org.uicds.sensorService.GetSOIListResponseDocument.GetSOIListResponse addNewGetSOIListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sensorService.GetSOIListResponseDocument.GetSOIListResponse target = null;
            target = (org.uicds.sensorService.GetSOIListResponseDocument.GetSOIListResponse)get_store().add_element_user(GETSOILISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetSOIListResponse(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public static class GetSOIListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.sensorService.GetSOIListResponseDocument.GetSOIListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetSOIListResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
