/*
 * An XML document type.
 * Localname: UpdateAgreementRequest
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.UpdateAgreementRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * A document containing one UpdateAgreementRequest(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public class UpdateAgreementRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.UpdateAgreementRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateAgreementRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEAGREEMENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "UpdateAgreementRequest");
    
    
    /**
     * Gets the "UpdateAgreementRequest" element
     */
    public org.uicds.agreementService.UpdateAgreementRequestDocument.UpdateAgreementRequest getUpdateAgreementRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.UpdateAgreementRequestDocument.UpdateAgreementRequest target = null;
            target = (org.uicds.agreementService.UpdateAgreementRequestDocument.UpdateAgreementRequest)get_store().find_element_user(UPDATEAGREEMENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateAgreementRequest" element
     */
    public void setUpdateAgreementRequest(org.uicds.agreementService.UpdateAgreementRequestDocument.UpdateAgreementRequest updateAgreementRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.UpdateAgreementRequestDocument.UpdateAgreementRequest target = null;
            target = (org.uicds.agreementService.UpdateAgreementRequestDocument.UpdateAgreementRequest)get_store().find_element_user(UPDATEAGREEMENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.UpdateAgreementRequestDocument.UpdateAgreementRequest)get_store().add_element_user(UPDATEAGREEMENTREQUEST$0);
            }
            target.set(updateAgreementRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateAgreementRequest" element
     */
    public org.uicds.agreementService.UpdateAgreementRequestDocument.UpdateAgreementRequest addNewUpdateAgreementRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.UpdateAgreementRequestDocument.UpdateAgreementRequest target = null;
            target = (org.uicds.agreementService.UpdateAgreementRequestDocument.UpdateAgreementRequest)get_store().add_element_user(UPDATEAGREEMENTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UpdateAgreementRequest(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public static class UpdateAgreementRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.UpdateAgreementRequestDocument.UpdateAgreementRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateAgreementRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
