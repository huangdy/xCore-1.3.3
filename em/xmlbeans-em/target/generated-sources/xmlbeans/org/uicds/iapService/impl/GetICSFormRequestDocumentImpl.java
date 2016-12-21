/*
 * An XML document type.
 * Localname: GetICSFormRequest
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.GetICSFormRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one GetICSFormRequest(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class GetICSFormRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetICSFormRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetICSFormRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETICSFORMREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "GetICSFormRequest");
    
    
    /**
     * Gets the "GetICSFormRequest" element
     */
    public org.uicds.iapService.GetICSFormRequestDocument.GetICSFormRequest getGetICSFormRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetICSFormRequestDocument.GetICSFormRequest target = null;
            target = (org.uicds.iapService.GetICSFormRequestDocument.GetICSFormRequest)get_store().find_element_user(GETICSFORMREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetICSFormRequest" element
     */
    public void setGetICSFormRequest(org.uicds.iapService.GetICSFormRequestDocument.GetICSFormRequest getICSFormRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetICSFormRequestDocument.GetICSFormRequest target = null;
            target = (org.uicds.iapService.GetICSFormRequestDocument.GetICSFormRequest)get_store().find_element_user(GETICSFORMREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.GetICSFormRequestDocument.GetICSFormRequest)get_store().add_element_user(GETICSFORMREQUEST$0);
            }
            target.set(getICSFormRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetICSFormRequest" element
     */
    public org.uicds.iapService.GetICSFormRequestDocument.GetICSFormRequest addNewGetICSFormRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetICSFormRequestDocument.GetICSFormRequest target = null;
            target = (org.uicds.iapService.GetICSFormRequestDocument.GetICSFormRequest)get_store().add_element_user(GETICSFORMREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetICSFormRequest(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class GetICSFormRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetICSFormRequestDocument.GetICSFormRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetICSFormRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
