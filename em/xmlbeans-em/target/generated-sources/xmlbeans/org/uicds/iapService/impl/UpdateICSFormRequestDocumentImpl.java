/*
 * An XML document type.
 * Localname: UpdateICSFormRequest
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.UpdateICSFormRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one UpdateICSFormRequest(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class UpdateICSFormRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.UpdateICSFormRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateICSFormRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEICSFORMREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "UpdateICSFormRequest");
    
    
    /**
     * Gets the "UpdateICSFormRequest" element
     */
    public org.uicds.iapService.UpdateICSFormRequestDocument.UpdateICSFormRequest getUpdateICSFormRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.UpdateICSFormRequestDocument.UpdateICSFormRequest target = null;
            target = (org.uicds.iapService.UpdateICSFormRequestDocument.UpdateICSFormRequest)get_store().find_element_user(UPDATEICSFORMREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateICSFormRequest" element
     */
    public void setUpdateICSFormRequest(org.uicds.iapService.UpdateICSFormRequestDocument.UpdateICSFormRequest updateICSFormRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.UpdateICSFormRequestDocument.UpdateICSFormRequest target = null;
            target = (org.uicds.iapService.UpdateICSFormRequestDocument.UpdateICSFormRequest)get_store().find_element_user(UPDATEICSFORMREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.UpdateICSFormRequestDocument.UpdateICSFormRequest)get_store().add_element_user(UPDATEICSFORMREQUEST$0);
            }
            target.set(updateICSFormRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateICSFormRequest" element
     */
    public org.uicds.iapService.UpdateICSFormRequestDocument.UpdateICSFormRequest addNewUpdateICSFormRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.UpdateICSFormRequestDocument.UpdateICSFormRequest target = null;
            target = (org.uicds.iapService.UpdateICSFormRequestDocument.UpdateICSFormRequest)get_store().add_element_user(UPDATEICSFORMREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UpdateICSFormRequest(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class UpdateICSFormRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.UpdateICSFormRequestDocument.UpdateICSFormRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateICSFormRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        private static final javax.xml.namespace.QName ICSFORM$2 = 
            new javax.xml.namespace.QName("http://uicds.org/IAPService", "ICSForm");
        
        
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
        
        /**
         * Gets the "ICSForm" element
         */
        public org.uicds.icsFormCommon.ICSFormDocumentType getICSForm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsFormCommon.ICSFormDocumentType target = null;
                target = (org.uicds.icsFormCommon.ICSFormDocumentType)get_store().find_element_user(ICSFORM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ICSForm" element
         */
        public void setICSForm(org.uicds.icsFormCommon.ICSFormDocumentType icsForm)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsFormCommon.ICSFormDocumentType target = null;
                target = (org.uicds.icsFormCommon.ICSFormDocumentType)get_store().find_element_user(ICSFORM$2, 0);
                if (target == null)
                {
                    target = (org.uicds.icsFormCommon.ICSFormDocumentType)get_store().add_element_user(ICSFORM$2);
                }
                target.set(icsForm);
            }
        }
        
        /**
         * Appends and returns a new empty "ICSForm" element
         */
        public org.uicds.icsFormCommon.ICSFormDocumentType addNewICSForm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.icsFormCommon.ICSFormDocumentType target = null;
                target = (org.uicds.icsFormCommon.ICSFormDocumentType)get_store().add_element_user(ICSFORM$2);
                return target;
            }
        }
    }
}
