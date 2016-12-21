/*
 * An XML document type.
 * Localname: Agreement
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.AgreementDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * A document containing one Agreement(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public class AgreementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.AgreementDocument
{
    private static final long serialVersionUID = 1L;
    
    public AgreementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
