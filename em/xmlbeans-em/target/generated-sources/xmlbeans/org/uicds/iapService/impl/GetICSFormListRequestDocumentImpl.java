/*
 * An XML document type.
 * Localname: GetICSFormListRequest
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.GetICSFormListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one GetICSFormListRequest(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class GetICSFormListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetICSFormListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetICSFormListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETICSFORMLISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "GetICSFormListRequest");
    
    
    /**
     * Gets the "GetICSFormListRequest" element
     */
    public org.uicds.iapService.GetICSFormListRequestDocument.GetICSFormListRequest getGetICSFormListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetICSFormListRequestDocument.GetICSFormListRequest target = null;
            target = (org.uicds.iapService.GetICSFormListRequestDocument.GetICSFormListRequest)get_store().find_element_user(GETICSFORMLISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetICSFormListRequest" element
     */
    public void setGetICSFormListRequest(org.uicds.iapService.GetICSFormListRequestDocument.GetICSFormListRequest getICSFormListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetICSFormListRequestDocument.GetICSFormListRequest target = null;
            target = (org.uicds.iapService.GetICSFormListRequestDocument.GetICSFormListRequest)get_store().find_element_user(GETICSFORMLISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.GetICSFormListRequestDocument.GetICSFormListRequest)get_store().add_element_user(GETICSFORMLISTREQUEST$0);
            }
            target.set(getICSFormListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetICSFormListRequest" element
     */
    public org.uicds.iapService.GetICSFormListRequestDocument.GetICSFormListRequest addNewGetICSFormListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.GetICSFormListRequestDocument.GetICSFormListRequest target = null;
            target = (org.uicds.iapService.GetICSFormListRequestDocument.GetICSFormListRequest)get_store().add_element_user(GETICSFORMLISTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetICSFormListRequest(@http://uicds.org/IAPService).
     *
     * This is a complex type.
     */
    public static class GetICSFormListRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.GetICSFormListRequestDocument.GetICSFormListRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetICSFormListRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/IAPService", "IncidentID");
        
        
        /**
         * Gets the "IncidentID" element
         */
        public java.lang.String getIncidentID()
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
         * Gets (as xml) the "IncidentID" element
         */
        public org.apache.xmlbeans.XmlString xgetIncidentID()
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
         * Sets the "IncidentID" element
         */
        public void setIncidentID(java.lang.String incidentID)
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
                target.setStringValue(incidentID);
            }
        }
        
        /**
         * Sets (as xml) the "IncidentID" element
         */
        public void xsetIncidentID(org.apache.xmlbeans.XmlString incidentID)
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
                target.set(incidentID);
            }
        }
    }
}
