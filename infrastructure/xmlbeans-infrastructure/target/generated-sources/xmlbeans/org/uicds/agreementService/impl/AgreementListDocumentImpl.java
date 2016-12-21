/*
 * An XML document type.
 * Localname: AgreementList
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.AgreementListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * A document containing one AgreementList(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public class AgreementListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.AgreementListDocument
{
    private static final long serialVersionUID = 1L;
    
    public AgreementListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGREEMENTLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "AgreementList");
    
    
    /**
     * Gets the "AgreementList" element
     */
    public org.uicds.agreementService.AgreementListType getAgreementList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementListType target = null;
            target = (org.uicds.agreementService.AgreementListType)get_store().find_element_user(AGREEMENTLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AgreementList" element
     */
    public void setAgreementList(org.uicds.agreementService.AgreementListType agreementList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementListType target = null;
            target = (org.uicds.agreementService.AgreementListType)get_store().find_element_user(AGREEMENTLIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.AgreementListType)get_store().add_element_user(AGREEMENTLIST$0);
            }
            target.set(agreementList);
        }
    }
    
    /**
     * Appends and returns a new empty "AgreementList" element
     */
    public org.uicds.agreementService.AgreementListType addNewAgreementList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.AgreementListType target = null;
            target = (org.uicds.agreementService.AgreementListType)get_store().add_element_user(AGREEMENTLIST$0);
            return target;
        }
    }
}
