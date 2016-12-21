/*
 * An XML document type.
 * Localname: GetAlertRequest
 * Namespace: http://uicds.org/AlertService
 * Java type: org.uicds.alertService.GetAlertRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.alertService.impl;
/**
 * A document containing one GetAlertRequest(@http://uicds.org/AlertService) element.
 *
 * This is a complex type.
 */
public class GetAlertRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.GetAlertRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAlertRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETALERTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AlertService", "GetAlertRequest");
    
    
    /**
     * Gets the "GetAlertRequest" element
     */
    public org.uicds.alertService.GetAlertRequestDocument.GetAlertRequest getGetAlertRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetAlertRequestDocument.GetAlertRequest target = null;
            target = (org.uicds.alertService.GetAlertRequestDocument.GetAlertRequest)get_store().find_element_user(GETALERTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAlertRequest" element
     */
    public void setGetAlertRequest(org.uicds.alertService.GetAlertRequestDocument.GetAlertRequest getAlertRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetAlertRequestDocument.GetAlertRequest target = null;
            target = (org.uicds.alertService.GetAlertRequestDocument.GetAlertRequest)get_store().find_element_user(GETALERTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.alertService.GetAlertRequestDocument.GetAlertRequest)get_store().add_element_user(GETALERTREQUEST$0);
            }
            target.set(getAlertRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAlertRequest" element
     */
    public org.uicds.alertService.GetAlertRequestDocument.GetAlertRequest addNewGetAlertRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.GetAlertRequestDocument.GetAlertRequest target = null;
            target = (org.uicds.alertService.GetAlertRequestDocument.GetAlertRequest)get_store().add_element_user(GETALERTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetAlertRequest(@http://uicds.org/AlertService).
     *
     * This is a complex type.
     */
    public static class GetAlertRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.GetAlertRequestDocument.GetAlertRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetAlertRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
