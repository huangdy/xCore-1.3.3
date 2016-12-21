/*
 * An XML document type.
 * Localname: GetIAPResponse
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.GetIAPResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one GetIAPResponse(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class GetIAPResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetIAPResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetIAPResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETIAPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "GetIAPResponse");
    
    
    /**
     * Gets the "GetIAPResponse" element
     */
    public org.uicds.iapService.GetIAPResponseDocument.GetIAPResponse getGetIAPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetIAPResponseDocument.GetIAPResponse target = null;
            target = (org.uicds.iapService.GetIAPResponseDocument.GetIAPResponse)get_store().find_element_user(GETIAPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetIAPResponse" element
     */
    public void setGetIAPResponse(org.uicds.iapService.GetIAPResponseDocument.GetIAPResponse getIAPResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetIAPResponseDocument.GetIAPResponse target = null;
            target = (org.uicds.iapService.GetIAPResponseDocument.GetIAPResponse)get_store().find_element_user(GETIAPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.GetIAPResponseDocument.GetIAPResponse)get_store().add_element_user(GETIAPRESPONSE$0);
            }
            target.set(getIAPResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetIAPResponse" element
     */
    public org.uicds.iapService.GetIAPResponseDocument.GetIAPResponse addNewGetIAPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetIAPResponseDocument.GetIAPResponse target = null;
            target = (org.uicds.iapService.GetIAPResponseDocument.GetIAPResponse)get_store().add_element_user(GETIAPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetIAPResponse(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class GetIAPResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetIAPResponseDocument.GetIAPResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetIAPResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
