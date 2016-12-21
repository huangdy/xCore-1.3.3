/*
 * An XML document type.
 * Localname: GetAgreementRequest
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.GetAgreementRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * A document containing one GetAgreementRequest(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public class GetAgreementRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.GetAgreementRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAgreementRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAGREEMENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "GetAgreementRequest");
    
    
    /**
     * Gets the "GetAgreementRequest" element
     */
    public org.uicds.agreementService.GetAgreementRequestDocument.GetAgreementRequest getGetAgreementRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.GetAgreementRequestDocument.GetAgreementRequest target = null;
            target = (org.uicds.agreementService.GetAgreementRequestDocument.GetAgreementRequest)get_store().find_element_user(GETAGREEMENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAgreementRequest" element
     */
    public void setGetAgreementRequest(org.uicds.agreementService.GetAgreementRequestDocument.GetAgreementRequest getAgreementRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.GetAgreementRequestDocument.GetAgreementRequest target = null;
            target = (org.uicds.agreementService.GetAgreementRequestDocument.GetAgreementRequest)get_store().find_element_user(GETAGREEMENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.GetAgreementRequestDocument.GetAgreementRequest)get_store().add_element_user(GETAGREEMENTREQUEST$0);
            }
            target.set(getAgreementRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAgreementRequest" element
     */
    public org.uicds.agreementService.GetAgreementRequestDocument.GetAgreementRequest addNewGetAgreementRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.GetAgreementRequestDocument.GetAgreementRequest target = null;
            target = (org.uicds.agreementService.GetAgreementRequestDocument.GetAgreementRequest)get_store().add_element_user(GETAGREEMENTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetAgreementRequest(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public static class GetAgreementRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.GetAgreementRequestDocument.GetAgreementRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetAgreementRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
