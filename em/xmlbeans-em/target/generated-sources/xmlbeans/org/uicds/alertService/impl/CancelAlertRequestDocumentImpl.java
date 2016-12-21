/*
 * An XML document type.
 * Localname: CancelAlertRequest
 * Namespace: http://uicds.org/AlertService
 * Java type: org.uicds.alertService.CancelAlertRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.alertService.impl;
/**
 * A document containing one CancelAlertRequest(@http://uicds.org/AlertService) element.
 *
 * This is a complex type.
 */
public class CancelAlertRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.CancelAlertRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CancelAlertRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELALERTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AlertService", "CancelAlertRequest");
    
    
    /**
     * Gets the "CancelAlertRequest" element
     */
    public org.uicds.alertService.CancelAlertRequestDocument.CancelAlertRequest getCancelAlertRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.CancelAlertRequestDocument.CancelAlertRequest target = null;
            target = (org.uicds.alertService.CancelAlertRequestDocument.CancelAlertRequest)get_store().find_element_user(CANCELALERTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CancelAlertRequest" element
     */
    public void setCancelAlertRequest(org.uicds.alertService.CancelAlertRequestDocument.CancelAlertRequest cancelAlertRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.CancelAlertRequestDocument.CancelAlertRequest target = null;
            target = (org.uicds.alertService.CancelAlertRequestDocument.CancelAlertRequest)get_store().find_element_user(CANCELALERTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.alertService.CancelAlertRequestDocument.CancelAlertRequest)get_store().add_element_user(CANCELALERTREQUEST$0);
            }
            target.set(cancelAlertRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CancelAlertRequest" element
     */
    public org.uicds.alertService.CancelAlertRequestDocument.CancelAlertRequest addNewCancelAlertRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.CancelAlertRequestDocument.CancelAlertRequest target = null;
            target = (org.uicds.alertService.CancelAlertRequestDocument.CancelAlertRequest)get_store().add_element_user(CANCELALERTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CancelAlertRequest(@http://uicds.org/AlertService).
     *
     * This is a complex type.
     */
    public static class CancelAlertRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.CancelAlertRequestDocument.CancelAlertRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CancelAlertRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
