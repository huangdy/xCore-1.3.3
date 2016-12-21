/*
 * An XML document type.
 * Localname: CreateIAPRequest
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.CreateIAPRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one CreateIAPRequest(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class CreateIAPRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.CreateIAPRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateIAPRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEIAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "CreateIAPRequest");
    
    
    /**
     * Gets the "CreateIAPRequest" element
     */
    public org.uicds.iapService.CreateIAPRequestDocument.CreateIAPRequest getCreateIAPRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.CreateIAPRequestDocument.CreateIAPRequest target = null;
            target = (org.uicds.iapService.CreateIAPRequestDocument.CreateIAPRequest)get_store().find_element_user(CREATEIAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateIAPRequest" element
     */
    public void setCreateIAPRequest(org.uicds.iapService.CreateIAPRequestDocument.CreateIAPRequest createIAPRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.CreateIAPRequestDocument.CreateIAPRequest target = null;
            target = (org.uicds.iapService.CreateIAPRequestDocument.CreateIAPRequest)get_store().find_element_user(CREATEIAPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.CreateIAPRequestDocument.CreateIAPRequest)get_store().add_element_user(CREATEIAPREQUEST$0);
            }
            target.set(createIAPRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateIAPRequest" element
     */
    public org.uicds.iapService.CreateIAPRequestDocument.CreateIAPRequest addNewCreateIAPRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.CreateIAPRequestDocument.CreateIAPRequest target = null;
            target = (org.uicds.iapService.CreateIAPRequestDocument.CreateIAPRequest)get_store().add_element_user(CREATEIAPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateIAPRequest(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class CreateIAPRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.CreateIAPRequestDocument.CreateIAPRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CreateIAPRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/IAPService", "incidentId");
        private static final javax.xml.namespace.QName INCIDENTACTIONPLAN$2 = 
            new javax.xml.namespace.QName("http://uicds.org/IAPService", "IncidentActionPlan");
        
        
        /**
         * Gets the "incidentId" element
         */
        public java.lang.String getIncidentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "incidentId" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "incidentId" element
         */
        public boolean isSetIncidentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INCIDENTID$0) != 0;
            }
        }
        
        /**
         * Sets the "incidentId" element
         */
        public void setIncidentId(java.lang.String incidentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTID$0);
                }
                target.setStringValue(incidentId);
            }
        }
        
        /**
         * Sets (as xml) the "incidentId" element
         */
        public void xsetIncidentId(org.apache.xmlbeans.XmlString incidentId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTID$0);
                }
                target.set(incidentId);
            }
        }
        
        /**
         * Unsets the "incidentId" element
         */
        public void unsetIncidentId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INCIDENTID$0, 0);
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
