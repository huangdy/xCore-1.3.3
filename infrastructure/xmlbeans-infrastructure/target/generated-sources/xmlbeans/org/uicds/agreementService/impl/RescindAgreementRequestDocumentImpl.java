/*
 * An XML document type.
 * Localname: RescindAgreementRequest
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.RescindAgreementRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * A document containing one RescindAgreementRequest(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public class RescindAgreementRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.RescindAgreementRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RescindAgreementRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESCINDAGREEMENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "RescindAgreementRequest");
    
    
    /**
     * Gets the "RescindAgreementRequest" element
     */
    public org.uicds.agreementService.RescindAgreementRequestDocument.RescindAgreementRequest getRescindAgreementRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.RescindAgreementRequestDocument.RescindAgreementRequest target = null;
            target = (org.uicds.agreementService.RescindAgreementRequestDocument.RescindAgreementRequest)get_store().find_element_user(RESCINDAGREEMENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RescindAgreementRequest" element
     */
    public void setRescindAgreementRequest(org.uicds.agreementService.RescindAgreementRequestDocument.RescindAgreementRequest rescindAgreementRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.RescindAgreementRequestDocument.RescindAgreementRequest target = null;
            target = (org.uicds.agreementService.RescindAgreementRequestDocument.RescindAgreementRequest)get_store().find_element_user(RESCINDAGREEMENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.RescindAgreementRequestDocument.RescindAgreementRequest)get_store().add_element_user(RESCINDAGREEMENTREQUEST$0);
            }
            target.set(rescindAgreementRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RescindAgreementRequest" element
     */
    public org.uicds.agreementService.RescindAgreementRequestDocument.RescindAgreementRequest addNewRescindAgreementRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.RescindAgreementRequestDocument.RescindAgreementRequest target = null;
            target = (org.uicds.agreementService.RescindAgreementRequestDocument.RescindAgreementRequest)get_store().add_element_user(RESCINDAGREEMENTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML RescindAgreementRequest(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public static class RescindAgreementRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.RescindAgreementRequestDocument.RescindAgreementRequest
    {
        private static final long serialVersionUID = 1L;
        
        public RescindAgreementRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName COREID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/AgreementService", "CoreID");
        
        
        /**
         * Gets the "CoreID" element
         */
        public java.lang.String getCoreID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COREID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CoreID" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetCoreID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COREID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CoreID" element
         */
        public void setCoreID(java.lang.String coreID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COREID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COREID$0);
                }
                target.setStringValue(coreID);
            }
        }
        
        /**
         * Sets (as xml) the "CoreID" element
         */
        public void xsetCoreID(org.apache.xmlbeans.XmlAnyURI coreID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(COREID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(COREID$0);
                }
                target.set(coreID);
            }
        }
    }
}
