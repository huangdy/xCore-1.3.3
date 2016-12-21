/*
 * An XML document type.
 * Localname: GetIAPRequest
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.GetIAPRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one GetIAPRequest(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class GetIAPRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetIAPRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetIAPRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETIAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "GetIAPRequest");
    
    
    /**
     * Gets the "GetIAPRequest" element
     */
    public org.uicds.iapService.GetIAPRequestDocument.GetIAPRequest getGetIAPRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetIAPRequestDocument.GetIAPRequest target = null;
            target = (org.uicds.iapService.GetIAPRequestDocument.GetIAPRequest)get_store().find_element_user(GETIAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetIAPRequest" element
     */
    public void setGetIAPRequest(org.uicds.iapService.GetIAPRequestDocument.GetIAPRequest getIAPRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetIAPRequestDocument.GetIAPRequest target = null;
            target = (org.uicds.iapService.GetIAPRequestDocument.GetIAPRequest)get_store().find_element_user(GETIAPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.GetIAPRequestDocument.GetIAPRequest)get_store().add_element_user(GETIAPREQUEST$0);
            }
            target.set(getIAPRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetIAPRequest" element
     */
    public org.uicds.iapService.GetIAPRequestDocument.GetIAPRequest addNewGetIAPRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetIAPRequestDocument.GetIAPRequest target = null;
            target = (org.uicds.iapService.GetIAPRequestDocument.GetIAPRequest)get_store().add_element_user(GETIAPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetIAPRequest(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class GetIAPRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetIAPRequestDocument.GetIAPRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetIAPRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductIdentification" element
         */
        public void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                }
                target.set(workProductIdentification);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductIdentification" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
                return target;
            }
        }
    }
}
