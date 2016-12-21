/*
 * An XML document type.
 * Localname: GetICSFormListResponse
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.GetICSFormListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one GetICSFormListResponse(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class GetICSFormListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetICSFormListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetICSFormListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETICSFORMLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "GetICSFormListResponse");
    
    
    /**
     * Gets the "GetICSFormListResponse" element
     */
    public org.uicds.iapService.GetICSFormListResponseDocument.GetICSFormListResponse getGetICSFormListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetICSFormListResponseDocument.GetICSFormListResponse target = null;
            target = (org.uicds.iapService.GetICSFormListResponseDocument.GetICSFormListResponse)get_store().find_element_user(GETICSFORMLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetICSFormListResponse" element
     */
    public void setGetICSFormListResponse(org.uicds.iapService.GetICSFormListResponseDocument.GetICSFormListResponse getICSFormListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetICSFormListResponseDocument.GetICSFormListResponse target = null;
            target = (org.uicds.iapService.GetICSFormListResponseDocument.GetICSFormListResponse)get_store().find_element_user(GETICSFORMLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.GetICSFormListResponseDocument.GetICSFormListResponse)get_store().add_element_user(GETICSFORMLISTRESPONSE$0);
            }
            target.set(getICSFormListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetICSFormListResponse" element
     */
    public org.uicds.iapService.GetICSFormListResponseDocument.GetICSFormListResponse addNewGetICSFormListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetICSFormListResponseDocument.GetICSFormListResponse target = null;
            target = (org.uicds.iapService.GetICSFormListResponseDocument.GetICSFormListResponse)get_store().add_element_user(GETICSFORMLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetICSFormListResponse(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class GetICSFormListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetICSFormListResponseDocument.GetICSFormListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetICSFormListResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
