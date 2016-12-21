/*
 * An XML document type.
 * Localname: UpdateAgreementResponse
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.UpdateAgreementResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * A document containing one UpdateAgreementResponse(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public class UpdateAgreementResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.UpdateAgreementResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UpdateAgreementResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UPDATEAGREEMENTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "UpdateAgreementResponse");
    
    
    /**
     * Gets the "UpdateAgreementResponse" element
     */
    public org.uicds.agreementService.UpdateAgreementResponseDocument.UpdateAgreementResponse getUpdateAgreementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.UpdateAgreementResponseDocument.UpdateAgreementResponse target = null;
            target = (org.uicds.agreementService.UpdateAgreementResponseDocument.UpdateAgreementResponse)get_store().find_element_user(UPDATEAGREEMENTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UpdateAgreementResponse" element
     */
    public void setUpdateAgreementResponse(org.uicds.agreementService.UpdateAgreementResponseDocument.UpdateAgreementResponse updateAgreementResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.UpdateAgreementResponseDocument.UpdateAgreementResponse target = null;
            target = (org.uicds.agreementService.UpdateAgreementResponseDocument.UpdateAgreementResponse)get_store().find_element_user(UPDATEAGREEMENTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.UpdateAgreementResponseDocument.UpdateAgreementResponse)get_store().add_element_user(UPDATEAGREEMENTRESPONSE$0);
            }
            target.set(updateAgreementResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UpdateAgreementResponse" element
     */
    public org.uicds.agreementService.UpdateAgreementResponseDocument.UpdateAgreementResponse addNewUpdateAgreementResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.UpdateAgreementResponseDocument.UpdateAgreementResponse target = null;
            target = (org.uicds.agreementService.UpdateAgreementResponseDocument.UpdateAgreementResponse)get_store().add_element_user(UPDATEAGREEMENTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UpdateAgreementResponse(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public static class UpdateAgreementResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.UpdateAgreementResponseDocument.UpdateAgreementResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UpdateAgreementResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
