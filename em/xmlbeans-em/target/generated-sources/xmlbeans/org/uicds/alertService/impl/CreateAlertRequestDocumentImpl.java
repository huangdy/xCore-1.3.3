/*
 * An XML document type.
 * Localname: CreateAlertRequest
 * Namespace: http://uicds.org/AlertService
 * Java type: org.uicds.alertService.CreateAlertRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.alertService.impl;
/**
 * A document containing one CreateAlertRequest(@http://uicds.org/AlertService) element.
 *
 * This is a complex type.
 */
public class CreateAlertRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.CreateAlertRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateAlertRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEALERTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AlertService", "CreateAlertRequest");
    
    
    /**
     * Gets the "CreateAlertRequest" element
     */
    public org.uicds.alertService.CreateAlertRequestDocument.CreateAlertRequest getCreateAlertRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.CreateAlertRequestDocument.CreateAlertRequest target = null;
            target = (org.uicds.alertService.CreateAlertRequestDocument.CreateAlertRequest)get_store().find_element_user(CREATEALERTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateAlertRequest" element
     */
    public void setCreateAlertRequest(org.uicds.alertService.CreateAlertRequestDocument.CreateAlertRequest createAlertRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.CreateAlertRequestDocument.CreateAlertRequest target = null;
            target = (org.uicds.alertService.CreateAlertRequestDocument.CreateAlertRequest)get_store().find_element_user(CREATEALERTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.alertService.CreateAlertRequestDocument.CreateAlertRequest)get_store().add_element_user(CREATEALERTREQUEST$0);
            }
            target.set(createAlertRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateAlertRequest" element
     */
    public org.uicds.alertService.CreateAlertRequestDocument.CreateAlertRequest addNewCreateAlertRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.alertService.CreateAlertRequestDocument.CreateAlertRequest target = null;
            target = (org.uicds.alertService.CreateAlertRequestDocument.CreateAlertRequest)get_store().add_element_user(CREATEALERTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateAlertRequest(@http://uicds.org/AlertService).
     *
     * This is a complex type.
     */
    public static class CreateAlertRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.alertService.CreateAlertRequestDocument.CreateAlertRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CreateAlertRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/AlertService", "incidentId");
        private static final javax.xml.namespace.QName ALERT$2 = 
            new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:cap:1.1", "alert");
        
        
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
         * Gets the "alert" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert getAlert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().find_element_user(ALERT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "alert" element
         */
        public void setAlert(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert alert)
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().find_element_user(ALERT$2, 0);
                if (target == null)
                {
                    target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().add_element_user(ALERT$2);
                }
                target.set(alert);
            }
        }
        
        /**
         * Appends and returns a new empty "alert" element
         */
        public x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert addNewAlert()
        {
            synchronized (monitor())
            {
                check_orphaned();
                x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert target = null;
                target = (x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert)get_store().add_element_user(ALERT$2);
                return target;
            }
        }
    }
}
