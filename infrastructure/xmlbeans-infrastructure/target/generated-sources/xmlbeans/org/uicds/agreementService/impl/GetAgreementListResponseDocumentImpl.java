/*
 * An XML document type.
 * Localname: GetAgreementListResponse
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.GetAgreementListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService.impl;
/**
 * A document containing one GetAgreementListResponse(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public class GetAgreementListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.GetAgreementListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetAgreementListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETAGREEMENTLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/AgreementService", "GetAgreementListResponse");
    
    
    /**
     * Gets the "GetAgreementListResponse" element
     */
    public org.uicds.agreementService.GetAgreementListResponseDocument.GetAgreementListResponse getGetAgreementListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.GetAgreementListResponseDocument.GetAgreementListResponse target = null;
            target = (org.uicds.agreementService.GetAgreementListResponseDocument.GetAgreementListResponse)get_store().find_element_user(GETAGREEMENTLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetAgreementListResponse" element
     */
    public void setGetAgreementListResponse(org.uicds.agreementService.GetAgreementListResponseDocument.GetAgreementListResponse getAgreementListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.GetAgreementListResponseDocument.GetAgreementListResponse target = null;
            target = (org.uicds.agreementService.GetAgreementListResponseDocument.GetAgreementListResponse)get_store().find_element_user(GETAGREEMENTLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.agreementService.GetAgreementListResponseDocument.GetAgreementListResponse)get_store().add_element_user(GETAGREEMENTLISTRESPONSE$0);
            }
            target.set(getAgreementListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetAgreementListResponse" element
     */
    public org.uicds.agreementService.GetAgreementListResponseDocument.GetAgreementListResponse addNewGetAgreementListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.agreementService.GetAgreementListResponseDocument.GetAgreementListResponse target = null;
            target = (org.uicds.agreementService.GetAgreementListResponseDocument.GetAgreementListResponse)get_store().add_element_user(GETAGREEMENTLISTRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetAgreementListResponse(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public static class GetAgreementListResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.agreementService.GetAgreementListResponseDocument.GetAgreementListResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetAgreementListResponseImpl(org.apache.xmlbeans.SchemaType sType)
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
}
