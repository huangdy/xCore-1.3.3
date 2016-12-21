/*
 * An XML document type.
 * Localname: GetAgreementListRequest
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.GetAgreementListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * A document containing one GetAgreementListRequest(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public class GetAgreementListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.GetAgreementListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAgreementListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAGREEMENTLISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "GetAgreementListRequest");
    
    
    /**
     * Gets the "GetAgreementListRequest" element
     */
    public org.uicds.agreementService.GetAgreementListRequestDocument.GetAgreementListRequest getGetAgreementListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.GetAgreementListRequestDocument.GetAgreementListRequest target = null;
            target = (org.uicds.agreementService.GetAgreementListRequestDocument.GetAgreementListRequest)get_store().find_element_user(GETAGREEMENTLISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAgreementListRequest" element
     */
    public void setGetAgreementListRequest(org.uicds.agreementService.GetAgreementListRequestDocument.GetAgreementListRequest getAgreementListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.GetAgreementListRequestDocument.GetAgreementListRequest target = null;
            target = (org.uicds.agreementService.GetAgreementListRequestDocument.GetAgreementListRequest)get_store().find_element_user(GETAGREEMENTLISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.GetAgreementListRequestDocument.GetAgreementListRequest)get_store().add_element_user(GETAGREEMENTLISTREQUEST$0);
            }
            target.set(getAgreementListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAgreementListRequest" element
     */
    public org.uicds.agreementService.GetAgreementListRequestDocument.GetAgreementListRequest addNewGetAgreementListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.GetAgreementListRequestDocument.GetAgreementListRequest target = null;
            target = (org.uicds.agreementService.GetAgreementListRequestDocument.GetAgreementListRequest)get_store().add_element_user(GETAGREEMENTLISTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetAgreementListRequest(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public static class GetAgreementListRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.GetAgreementListRequestDocument.GetAgreementListRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetAgreementListRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
