/*
 * An XML document type.
 * Localname: GetApprovedIAPResponse
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.GetApprovedIAPResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one GetApprovedIAPResponse(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class GetApprovedIAPResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetApprovedIAPResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetApprovedIAPResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAPPROVEDIAPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "GetApprovedIAPResponse");
    
    
    /**
     * Gets the "GetApprovedIAPResponse" element
     */
    public org.uicds.iapService.GetApprovedIAPResponseDocument.GetApprovedIAPResponse getGetApprovedIAPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetApprovedIAPResponseDocument.GetApprovedIAPResponse target = null;
            target = (org.uicds.iapService.GetApprovedIAPResponseDocument.GetApprovedIAPResponse)get_store().find_element_user(GETAPPROVEDIAPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetApprovedIAPResponse" element
     */
    public void setGetApprovedIAPResponse(org.uicds.iapService.GetApprovedIAPResponseDocument.GetApprovedIAPResponse getApprovedIAPResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetApprovedIAPResponseDocument.GetApprovedIAPResponse target = null;
            target = (org.uicds.iapService.GetApprovedIAPResponseDocument.GetApprovedIAPResponse)get_store().find_element_user(GETAPPROVEDIAPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.GetApprovedIAPResponseDocument.GetApprovedIAPResponse)get_store().add_element_user(GETAPPROVEDIAPRESPONSE$0);
            }
            target.set(getApprovedIAPResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetApprovedIAPResponse" element
     */
    public org.uicds.iapService.GetApprovedIAPResponseDocument.GetApprovedIAPResponse addNewGetApprovedIAPResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetApprovedIAPResponseDocument.GetApprovedIAPResponse target = null;
            target = (org.uicds.iapService.GetApprovedIAPResponseDocument.GetApprovedIAPResponse)get_store().add_element_user(GETAPPROVEDIAPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetApprovedIAPResponse(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class GetApprovedIAPResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetApprovedIAPResponseDocument.GetApprovedIAPResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetApprovedIAPResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
