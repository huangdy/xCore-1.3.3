/*
 * An XML document type.
 * Localname: UpdateIAPRequest
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.UpdateIAPRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one UpdateIAPRequest(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class UpdateIAPRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.UpdateIAPRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateIAPRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEIAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "UpdateIAPRequest");
    
    
    /**
     * Gets the "UpdateIAPRequest" element
     */
    public org.uicds.iapService.UpdateIAPRequestDocument.UpdateIAPRequest getUpdateIAPRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.UpdateIAPRequestDocument.UpdateIAPRequest target = null;
            target = (org.uicds.iapService.UpdateIAPRequestDocument.UpdateIAPRequest)get_store().find_element_user(UPDATEIAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateIAPRequest" element
     */
    public void setUpdateIAPRequest(org.uicds.iapService.UpdateIAPRequestDocument.UpdateIAPRequest updateIAPRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.UpdateIAPRequestDocument.UpdateIAPRequest target = null;
            target = (org.uicds.iapService.UpdateIAPRequestDocument.UpdateIAPRequest)get_store().find_element_user(UPDATEIAPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.UpdateIAPRequestDocument.UpdateIAPRequest)get_store().add_element_user(UPDATEIAPREQUEST$0);
            }
            target.set(updateIAPRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateIAPRequest" element
     */
    public org.uicds.iapService.UpdateIAPRequestDocument.UpdateIAPRequest addNewUpdateIAPRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.UpdateIAPRequestDocument.UpdateIAPRequest target = null;
            target = (org.uicds.iapService.UpdateIAPRequestDocument.UpdateIAPRequest)get_store().add_element_user(UPDATEIAPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UpdateIAPRequest(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class UpdateIAPRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.UpdateIAPRequestDocument.UpdateIAPRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateIAPRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
        private static final javax.xml.namespace.QName INCIDENTACTIONPLAN$2 = 
            new javax.xml.namespace.QName("http://uicds.org/IAPService", "IncidentActionPlan");
        
        
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
         * Gets the "IncidentActionPlan" element
         */
        public org.uicds.iapService.IncidentActionPlanType getIncidentActionPlan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.iapService.IncidentActionPlanType target = null;
                target = (org.uicds.iapService.IncidentActionPlanType)get_store().find_element_user(INCIDENTACTIONPLAN$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "IncidentActionPlan" element
         */
        public void setIncidentActionPlan(org.uicds.iapService.IncidentActionPlanType incidentActionPlan)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.iapService.IncidentActionPlanType target = null;
                target = (org.uicds.iapService.IncidentActionPlanType)get_store().find_element_user(INCIDENTACTIONPLAN$2, 0);
                if (target == null)
                {
                    target = (org.uicds.iapService.IncidentActionPlanType)get_store().add_element_user(INCIDENTACTIONPLAN$2);
                }
                target.set(incidentActionPlan);
            }
        }
        
        /**
         * Appends and returns a new empty "IncidentActionPlan" element
         */
        public org.uicds.iapService.IncidentActionPlanType addNewIncidentActionPlan()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.iapService.IncidentActionPlanType target = null;
                target = (org.uicds.iapService.IncidentActionPlanType)get_store().add_element_user(INCIDENTACTIONPLAN$2);
                return target;
            }
        }
    }
}
