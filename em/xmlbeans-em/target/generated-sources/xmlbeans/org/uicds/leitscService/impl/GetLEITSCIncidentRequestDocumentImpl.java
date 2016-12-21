/*
 * An XML document type.
 * Localname: GetLEITSCIncidentRequest
 * Namespace: http://uicds.org/LEITSCService
 * Java type: org.uicds.leitscService.GetLEITSCIncidentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.leitscService.impl;
/**
 * A document containing one GetLEITSCIncidentRequest(@http://uicds.org/LEITSCService) element.
 *
 * This is a complex type.
 */
public class GetLEITSCIncidentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.leitscService.GetLEITSCIncidentRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetLEITSCIncidentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLEITSCINCIDENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/LEITSCService", "GetLEITSCIncidentRequest");
    
    
    /**
     * Gets the "GetLEITSCIncidentRequest" element
     */
    public org.uicds.leitscService.GetLEITSCIncidentRequestDocument.GetLEITSCIncidentRequest getGetLEITSCIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.leitscService.GetLEITSCIncidentRequestDocument.GetLEITSCIncidentRequest target = null;
            target = (org.uicds.leitscService.GetLEITSCIncidentRequestDocument.GetLEITSCIncidentRequest)get_store().find_element_user(GETLEITSCINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetLEITSCIncidentRequest" element
     */
    public void setGetLEITSCIncidentRequest(org.uicds.leitscService.GetLEITSCIncidentRequestDocument.GetLEITSCIncidentRequest getLEITSCIncidentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.leitscService.GetLEITSCIncidentRequestDocument.GetLEITSCIncidentRequest target = null;
            target = (org.uicds.leitscService.GetLEITSCIncidentRequestDocument.GetLEITSCIncidentRequest)get_store().find_element_user(GETLEITSCINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.leitscService.GetLEITSCIncidentRequestDocument.GetLEITSCIncidentRequest)get_store().add_element_user(GETLEITSCINCIDENTREQUEST$0);
            }
            target.set(getLEITSCIncidentRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetLEITSCIncidentRequest" element
     */
    public org.uicds.leitscService.GetLEITSCIncidentRequestDocument.GetLEITSCIncidentRequest addNewGetLEITSCIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.leitscService.GetLEITSCIncidentRequestDocument.GetLEITSCIncidentRequest target = null;
            target = (org.uicds.leitscService.GetLEITSCIncidentRequestDocument.GetLEITSCIncidentRequest)get_store().add_element_user(GETLEITSCINCIDENTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetLEITSCIncidentRequest(@http://uicds.org/LEITSCService).
     *
     * This is a complex type.
     */
    public static class GetLEITSCIncidentRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.leitscService.GetLEITSCIncidentRequestDocument.GetLEITSCIncidentRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetLEITSCIncidentRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEITSCINCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/LEITSCService", "leitscIncidentID");
        
        
        /**
         * Gets the "leitscIncidentID" element
         */
        public java.lang.String getLeitscIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEITSCINCIDENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leitscIncidentID" element
         */
        public org.apache.xmlbeans.XmlString xgetLeitscIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEITSCINCIDENTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leitscIncidentID" element
         */
        public void setLeitscIncidentID(java.lang.String leitscIncidentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEITSCINCIDENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEITSCINCIDENTID$0);
                }
                target.setStringValue(leitscIncidentID);
            }
        }
        
        /**
         * Sets (as xml) the "leitscIncidentID" element
         */
        public void xsetLeitscIncidentID(org.apache.xmlbeans.XmlString leitscIncidentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEITSCINCIDENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEITSCINCIDENTID$0);
                }
                target.set(leitscIncidentID);
            }
        }
    }
}
