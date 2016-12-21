/*
 * An XML document type.
 * Localname: CreateAgreementRequest
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.CreateAgreementRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * A document containing one CreateAgreementRequest(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public class CreateAgreementRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.CreateAgreementRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreateAgreementRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATEAGREEMENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "CreateAgreementRequest");
    
    
    /**
     * Gets the "CreateAgreementRequest" element
     */
    public org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest getCreateAgreementRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest target = null;
            target = (org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest)get_store().find_element_user(CREATEAGREEMENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CreateAgreementRequest" element
     */
    public void setCreateAgreementRequest(org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest createAgreementRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest target = null;
            target = (org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest)get_store().find_element_user(CREATEAGREEMENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest)get_store().add_element_user(CREATEAGREEMENTREQUEST$0);
            }
            target.set(createAgreementRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CreateAgreementRequest" element
     */
    public org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest addNewCreateAgreementRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest target = null;
            target = (org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest)get_store().add_element_user(CREATEAGREEMENTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CreateAgreementRequest(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public static class CreateAgreementRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CreateAgreementRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
