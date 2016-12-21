/*
 * An XML document type.
 * Localname: GetAgreementResponse
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.GetAgreementResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * A document containing one GetAgreementResponse(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public class GetAgreementResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.GetAgreementResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAgreementResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAGREEMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "GetAgreementResponse");
    
    
    /**
     * Gets the "GetAgreementResponse" element
     */
    public org.uicds.agreementService.GetAgreementResponseDocument.GetAgreementResponse getGetAgreementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.GetAgreementResponseDocument.GetAgreementResponse target = null;
            target = (org.uicds.agreementService.GetAgreementResponseDocument.GetAgreementResponse)get_store().find_element_user(GETAGREEMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAgreementResponse" element
     */
    public void setGetAgreementResponse(org.uicds.agreementService.GetAgreementResponseDocument.GetAgreementResponse getAgreementResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.GetAgreementResponseDocument.GetAgreementResponse target = null;
            target = (org.uicds.agreementService.GetAgreementResponseDocument.GetAgreementResponse)get_store().find_element_user(GETAGREEMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.GetAgreementResponseDocument.GetAgreementResponse)get_store().add_element_user(GETAGREEMENTRESPONSE$0);
            }
            target.set(getAgreementResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAgreementResponse" element
     */
    public org.uicds.agreementService.GetAgreementResponseDocument.GetAgreementResponse addNewGetAgreementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.GetAgreementResponseDocument.GetAgreementResponse target = null;
            target = (org.uicds.agreementService.GetAgreementResponseDocument.GetAgreementResponse)get_store().add_element_user(GETAGREEMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetAgreementResponse(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public static class GetAgreementResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.GetAgreementResponseDocument.GetAgreementResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetAgreementResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName AGREEMENT$0 = 
            new javax.xml.namespace.QName("http://uicds.org/AgreementService", "Agreement");
        
        
        /**
         * Gets the "Agreement" element
         */
        public org.uicds.agreementService.AgreementType getAgreement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.agreementService.AgreementType target = null;
                target = (org.uicds.agreementService.AgreementType)get_store().find_element_user(AGREEMENT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Agreement" element
         */
        public void setAgreement(org.uicds.agreementService.AgreementType agreement)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.agreementService.AgreementType target = null;
                target = (org.uicds.agreementService.AgreementType)get_store().find_element_user(AGREEMENT$0, 0);
                if (target == null)
                {
                    target = (org.uicds.agreementService.AgreementType)get_store().add_element_user(AGREEMENT$0);
                }
                target.set(agreement);
            }
        }
        
        /**
         * Appends and returns a new empty "Agreement" element
         */
        public org.uicds.agreementService.AgreementType addNewAgreement()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.uicds.agreementService.AgreementType target = null;
                target = (org.uicds.agreementService.AgreementType)get_store().add_element_user(AGREEMENT$0);
                return target;
            }
        }
    }
}
