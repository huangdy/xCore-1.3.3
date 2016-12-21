/*
 * An XML document type.
 * Localname: GetApprovedIAPRequest
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.GetApprovedIAPRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one GetApprovedIAPRequest(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class GetApprovedIAPRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetApprovedIAPRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetApprovedIAPRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAPPROVEDIAPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "GetApprovedIAPRequest");
    
    
    /**
     * Gets the "GetApprovedIAPRequest" element
     */
    public org.uicds.iapService.GetApprovedIAPRequestDocument.GetApprovedIAPRequest getGetApprovedIAPRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetApprovedIAPRequestDocument.GetApprovedIAPRequest target = null;
            target = (org.uicds.iapService.GetApprovedIAPRequestDocument.GetApprovedIAPRequest)get_store().find_element_user(GETAPPROVEDIAPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetApprovedIAPRequest" element
     */
    public void setGetApprovedIAPRequest(org.uicds.iapService.GetApprovedIAPRequestDocument.GetApprovedIAPRequest getApprovedIAPRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetApprovedIAPRequestDocument.GetApprovedIAPRequest target = null;
            target = (org.uicds.iapService.GetApprovedIAPRequestDocument.GetApprovedIAPRequest)get_store().find_element_user(GETAPPROVEDIAPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.GetApprovedIAPRequestDocument.GetApprovedIAPRequest)get_store().add_element_user(GETAPPROVEDIAPREQUEST$0);
            }
            target.set(getApprovedIAPRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetApprovedIAPRequest" element
     */
    public org.uicds.iapService.GetApprovedIAPRequestDocument.GetApprovedIAPRequest addNewGetApprovedIAPRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetApprovedIAPRequestDocument.GetApprovedIAPRequest target = null;
            target = (org.uicds.iapService.GetApprovedIAPRequestDocument.GetApprovedIAPRequest)get_store().add_element_user(GETAPPROVEDIAPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetApprovedIAPRequest(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class GetApprovedIAPRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetApprovedIAPRequestDocument.GetApprovedIAPRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetApprovedIAPRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/IAPService", "incidentId");
        
        
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
    }
}
