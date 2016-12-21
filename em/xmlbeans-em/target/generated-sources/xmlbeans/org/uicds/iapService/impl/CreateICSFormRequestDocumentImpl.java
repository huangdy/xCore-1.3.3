/*
 * An XML document type.
 * Localname: CreateICSFormRequest
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.CreateICSFormRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one CreateICSFormRequest(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class CreateICSFormRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.CreateICSFormRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateICSFormRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEICSFORMREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "CreateICSFormRequest");
    
    
    /**
     * Gets the "CreateICSFormRequest" element
     */
    public org.uicds.iapService.CreateICSFormRequestDocument.CreateICSFormRequest getCreateICSFormRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.CreateICSFormRequestDocument.CreateICSFormRequest target = null;
            target = (org.uicds.iapService.CreateICSFormRequestDocument.CreateICSFormRequest)get_store().find_element_user(CREATEICSFORMREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateICSFormRequest" element
     */
    public void setCreateICSFormRequest(org.uicds.iapService.CreateICSFormRequestDocument.CreateICSFormRequest createICSFormRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.CreateICSFormRequestDocument.CreateICSFormRequest target = null;
            target = (org.uicds.iapService.CreateICSFormRequestDocument.CreateICSFormRequest)get_store().find_element_user(CREATEICSFORMREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.CreateICSFormRequestDocument.CreateICSFormRequest)get_store().add_element_user(CREATEICSFORMREQUEST$0);
            }
            target.set(createICSFormRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateICSFormRequest" element
     */
    public org.uicds.iapService.CreateICSFormRequestDocument.CreateICSFormRequest addNewCreateICSFormRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.CreateICSFormRequestDocument.CreateICSFormRequest target = null;
            target = (org.uicds.iapService.CreateICSFormRequestDocument.CreateICSFormRequest)get_store().add_element_user(CREATEICSFORMREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateICSFormRequest(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class CreateICSFormRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.CreateICSFormRequestDocument.CreateICSFormRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CreateICSFormRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/IAPService", "incidentId");
        private static final javax.xml.namespace.QName ICSFORM$2 = 
            new javax.xml.namespace.QName("http://uicds.org/IAPService", "ICSForm");
        
        
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
