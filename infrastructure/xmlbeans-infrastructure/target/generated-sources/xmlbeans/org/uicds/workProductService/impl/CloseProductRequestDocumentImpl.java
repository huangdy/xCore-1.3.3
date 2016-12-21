/*
 * An XML document type.
 * Localname: CloseProductRequest
 * Namespace: http://uicds.org/WorkProductService
 * Java type: org.uicds.workProductService.CloseProductRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.workProductService.impl;
/**
 * A document containing one CloseProductRequest(@http://uicds.org/WorkProductService) element.
 *
 * This is a complex type.
 */
public class CloseProductRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.CloseProductRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseProductRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEPRODUCTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/WorkProductService", "CloseProductRequest");
    
    
    /**
     * Gets the "CloseProductRequest" element
     */
    public org.uicds.workProductService.CloseProductRequestDocument.CloseProductRequest getCloseProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.CloseProductRequestDocument.CloseProductRequest target = null;
            target = (org.uicds.workProductService.CloseProductRequestDocument.CloseProductRequest)get_store().find_element_user(CLOSEPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CloseProductRequest" element
     */
    public void setCloseProductRequest(org.uicds.workProductService.CloseProductRequestDocument.CloseProductRequest closeProductRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.CloseProductRequestDocument.CloseProductRequest target = null;
            target = (org.uicds.workProductService.CloseProductRequestDocument.CloseProductRequest)get_store().find_element_user(CLOSEPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.workProductService.CloseProductRequestDocument.CloseProductRequest)get_store().add_element_user(CLOSEPRODUCTREQUEST$0);
            }
            target.set(closeProductRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CloseProductRequest" element
     */
    public org.uicds.workProductService.CloseProductRequestDocument.CloseProductRequest addNewCloseProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.workProductService.CloseProductRequestDocument.CloseProductRequest target = null;
            target = (org.uicds.workProductService.CloseProductRequestDocument.CloseProductRequest)get_store().add_element_user(CLOSEPRODUCTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CloseProductRequest(@http://uicds.org/WorkProductService).
     *
     * This is a complex type.
     */
    public static class CloseProductRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.workProductService.CloseProductRequestDocument.CloseProductRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CloseProductRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
