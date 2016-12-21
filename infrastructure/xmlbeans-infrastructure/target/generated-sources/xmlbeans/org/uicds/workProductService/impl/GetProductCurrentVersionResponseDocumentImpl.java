/*
 * An XML document type.
 * Localname: GetProductCurrentVersionResponse
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.GetProductCurrentVersionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService.impl;
/**
 * A document containing one GetProductCurrentVersionResponse(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class GetProductCurrentVersionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.GetProductCurrentVersionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProductCurrentVersionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTCURRENTVERSIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "GetProductCurrentVersionResponse");
    
    
    /**
     * Gets the "GetProductCurrentVersionResponse" element
     */
    public org.uicds.workProductService.GetProductCurrentVersionResponseDocument.GetProductCurrentVersionResponse getGetProductCurrentVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.GetProductCurrentVersionResponseDocument.GetProductCurrentVersionResponse target = null;
            target = (org.uicds.workProductService.GetProductCurrentVersionResponseDocument.GetProductCurrentVersionResponse)get_store().find_element_user(GETPRODUCTCURRENTVERSIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductCurrentVersionResponse" element
     */
    public void setGetProductCurrentVersionResponse(org.uicds.workProductService.GetProductCurrentVersionResponseDocument.GetProductCurrentVersionResponse getProductCurrentVersionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.GetProductCurrentVersionResponseDocument.GetProductCurrentVersionResponse target = null;
            target = (org.uicds.workProductService.GetProductCurrentVersionResponseDocument.GetProductCurrentVersionResponse)get_store().find_element_user(GETPRODUCTCURRENTVERSIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.workProductService.GetProductCurrentVersionResponseDocument.GetProductCurrentVersionResponse)get_store().add_element_user(GETPRODUCTCURRENTVERSIONRESPONSE$0);
            }
            target.set(getProductCurrentVersionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductCurrentVersionResponse" element
     */
    public org.uicds.workProductService.GetProductCurrentVersionResponseDocument.GetProductCurrentVersionResponse addNewGetProductCurrentVersionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.GetProductCurrentVersionResponseDocument.GetProductCurrentVersionResponse target = null;
            target = (org.uicds.workProductService.GetProductCurrentVersionResponseDocument.GetProductCurrentVersionResponse)get_store().add_element_user(GETPRODUCTCURRENTVERSIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetProductCurrentVersionResponse(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class GetProductCurrentVersionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.GetProductCurrentVersionResponseDocument.GetProductCurrentVersionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetProductCurrentVersionResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
