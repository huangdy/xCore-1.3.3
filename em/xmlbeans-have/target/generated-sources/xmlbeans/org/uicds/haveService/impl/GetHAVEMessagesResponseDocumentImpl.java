/*
 * An XML document type.
 * Localname: GetHAVEMessagesResponse
 * Namespace: http://uicds.org/HAVEService
 * Java type: org.uicds.haveService.GetHAVEMessagesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.haveService.impl;
/**
 * A document containing one GetHAVEMessagesResponse(@http://uicds.org/HAVEService) element.
 *
 * This is a complex type.
 */
public class GetHAVEMessagesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.haveService.GetHAVEMessagesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetHAVEMessagesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETHAVEMESSAGESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/HAVEService", "GetHAVEMessagesResponse");
    
    
    /**
     * Gets the "GetHAVEMessagesResponse" element
     */
    public org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse getGetHAVEMessagesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse target = null;
            target = (org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse)get_store().find_element_user(GETHAVEMESSAGESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetHAVEMessagesResponse" element
     */
    public void setGetHAVEMessagesResponse(org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse getHAVEMessagesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse target = null;
            target = (org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse)get_store().find_element_user(GETHAVEMESSAGESRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse)get_store().add_element_user(GETHAVEMESSAGESRESPONSE$0);
            }
            target.set(getHAVEMessagesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetHAVEMessagesResponse" element
     */
    public org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse addNewGetHAVEMessagesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse target = null;
            target = (org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse)get_store().add_element_user(GETHAVEMESSAGESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetHAVEMessagesResponse(@http://uicds.org/HAVEService).
     *
     * This is a complex type.
     */
    public static class GetHAVEMessagesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetHAVEMessagesResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
