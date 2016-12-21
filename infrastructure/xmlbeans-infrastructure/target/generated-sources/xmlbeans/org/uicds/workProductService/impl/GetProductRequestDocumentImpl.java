/*
 * An XML document type.
 * Localname: GetProductRequest
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.GetProductRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService.impl;
/**
 * A document containing one GetProductRequest(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class GetProductRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.GetProductRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetProductRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPRODUCTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "GetProductRequest");
    
    
    /**
     * Gets the "GetProductRequest" element
     */
    public org.uicds.workProductService.GetProductRequestDocument.GetProductRequest getGetProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.GetProductRequestDocument.GetProductRequest target = null;
            target = (org.uicds.workProductService.GetProductRequestDocument.GetProductRequest)get_store().find_element_user(GETPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetProductRequest" element
     */
    public void setGetProductRequest(org.uicds.workProductService.GetProductRequestDocument.GetProductRequest getProductRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.GetProductRequestDocument.GetProductRequest target = null;
            target = (org.uicds.workProductService.GetProductRequestDocument.GetProductRequest)get_store().find_element_user(GETPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.workProductService.GetProductRequestDocument.GetProductRequest)get_store().add_element_user(GETPRODUCTREQUEST$0);
            }
            target.set(getProductRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetProductRequest" element
     */
    public org.uicds.workProductService.GetProductRequestDocument.GetProductRequest addNewGetProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.GetProductRequestDocument.GetProductRequest target = null;
            target = (org.uicds.workProductService.GetProductRequestDocument.GetProductRequest)get_store().add_element_user(GETPRODUCTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetProductRequest(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class GetProductRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.GetProductRequestDocument.GetProductRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetProductRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
