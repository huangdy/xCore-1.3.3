/*
 * An XML document type.
 * Localname: GetICSFormResponse
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.GetICSFormResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one GetICSFormResponse(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class GetICSFormResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetICSFormResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetICSFormResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETICSFORMRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "GetICSFormResponse");
    
    
    /**
     * Gets the "GetICSFormResponse" element
     */
    public org.uicds.iapService.GetICSFormResponseDocument.GetICSFormResponse getGetICSFormResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetICSFormResponseDocument.GetICSFormResponse target = null;
            target = (org.uicds.iapService.GetICSFormResponseDocument.GetICSFormResponse)get_store().find_element_user(GETICSFORMRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetICSFormResponse" element
     */
    public void setGetICSFormResponse(org.uicds.iapService.GetICSFormResponseDocument.GetICSFormResponse getICSFormResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetICSFormResponseDocument.GetICSFormResponse target = null;
            target = (org.uicds.iapService.GetICSFormResponseDocument.GetICSFormResponse)get_store().find_element_user(GETICSFORMRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.GetICSFormResponseDocument.GetICSFormResponse)get_store().add_element_user(GETICSFORMRESPONSE$0);
            }
            target.set(getICSFormResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetICSFormResponse" element
     */
    public org.uicds.iapService.GetICSFormResponseDocument.GetICSFormResponse addNewGetICSFormResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetICSFormResponseDocument.GetICSFormResponse target = null;
            target = (org.uicds.iapService.GetICSFormResponseDocument.GetICSFormResponse)get_store().add_element_user(GETICSFORMRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetICSFormResponse(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class GetICSFormResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetICSFormResponseDocument.GetICSFormResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetICSFormResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
