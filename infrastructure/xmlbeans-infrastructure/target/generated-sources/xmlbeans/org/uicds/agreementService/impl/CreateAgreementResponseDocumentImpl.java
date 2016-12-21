/*
 * An XML document type.
 * Localname: CreateAgreementResponse
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.CreateAgreementResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * A document containing one CreateAgreementResponse(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public class CreateAgreementResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.CreateAgreementResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateAgreementResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEAGREEMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "CreateAgreementResponse");
    
    
    /**
     * Gets the "CreateAgreementResponse" element
     */
    public org.uicds.agreementService.CreateAgreementResponseDocument.CreateAgreementResponse getCreateAgreementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.CreateAgreementResponseDocument.CreateAgreementResponse target = null;
            target = (org.uicds.agreementService.CreateAgreementResponseDocument.CreateAgreementResponse)get_store().find_element_user(CREATEAGREEMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateAgreementResponse" element
     */
    public void setCreateAgreementResponse(org.uicds.agreementService.CreateAgreementResponseDocument.CreateAgreementResponse createAgreementResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.CreateAgreementResponseDocument.CreateAgreementResponse target = null;
            target = (org.uicds.agreementService.CreateAgreementResponseDocument.CreateAgreementResponse)get_store().find_element_user(CREATEAGREEMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.CreateAgreementResponseDocument.CreateAgreementResponse)get_store().add_element_user(CREATEAGREEMENTRESPONSE$0);
            }
            target.set(createAgreementResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateAgreementResponse" element
     */
    public org.uicds.agreementService.CreateAgreementResponseDocument.CreateAgreementResponse addNewCreateAgreementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.CreateAgreementResponseDocument.CreateAgreementResponse target = null;
            target = (org.uicds.agreementService.CreateAgreementResponseDocument.CreateAgreementResponse)get_store().add_element_user(CREATEAGREEMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML CreateAgreementResponse(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public static class CreateAgreementResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.CreateAgreementResponseDocument.CreateAgreementResponse
    {
        private static final long serialVersionUID = 1L;
        
        public CreateAgreementResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
