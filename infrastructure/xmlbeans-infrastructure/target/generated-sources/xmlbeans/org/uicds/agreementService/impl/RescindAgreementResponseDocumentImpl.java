/*
 * An XML document type.
 * Localname: RescindAgreementResponse
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.RescindAgreementResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * A document containing one RescindAgreementResponse(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public class RescindAgreementResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.RescindAgreementResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RescindAgreementResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESCINDAGREEMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "RescindAgreementResponse");
    
    
    /**
     * Gets the "RescindAgreementResponse" element
     */
    public org.uicds.agreementService.RescindAgreementResponseDocument.RescindAgreementResponse getRescindAgreementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.RescindAgreementResponseDocument.RescindAgreementResponse target = null;
            target = (org.uicds.agreementService.RescindAgreementResponseDocument.RescindAgreementResponse)get_store().find_element_user(RESCINDAGREEMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RescindAgreementResponse" element
     */
    public void setRescindAgreementResponse(org.uicds.agreementService.RescindAgreementResponseDocument.RescindAgreementResponse rescindAgreementResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.RescindAgreementResponseDocument.RescindAgreementResponse target = null;
            target = (org.uicds.agreementService.RescindAgreementResponseDocument.RescindAgreementResponse)get_store().find_element_user(RESCINDAGREEMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.RescindAgreementResponseDocument.RescindAgreementResponse)get_store().add_element_user(RESCINDAGREEMENTRESPONSE$0);
            }
            target.set(rescindAgreementResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RescindAgreementResponse" element
     */
    public org.uicds.agreementService.RescindAgreementResponseDocument.RescindAgreementResponse addNewRescindAgreementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.RescindAgreementResponseDocument.RescindAgreementResponse target = null;
            target = (org.uicds.agreementService.RescindAgreementResponseDocument.RescindAgreementResponse)get_store().add_element_user(RESCINDAGREEMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RescindAgreementResponse(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public static class RescindAgreementResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.RescindAgreementResponseDocument.RescindAgreementResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RescindAgreementResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
