/*
 * An XML document type.
 * Localname: GetListOfWorkProductRequest
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.GetListOfWorkProductRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one GetListOfWorkProductRequest(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class GetListOfWorkProductRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.GetListOfWorkProductRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListOfWorkProductRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTOFWORKPRODUCTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "GetListOfWorkProductRequest");
    
    
    /**
     * Gets the "GetListOfWorkProductRequest" element
     */
    public org.uicds.interestGroupService.GetListOfWorkProductRequestDocument.GetListOfWorkProductRequest getGetListOfWorkProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetListOfWorkProductRequestDocument.GetListOfWorkProductRequest target = null;
            target = (org.uicds.interestGroupService.GetListOfWorkProductRequestDocument.GetListOfWorkProductRequest)get_store().find_element_user(GETLISTOFWORKPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetListOfWorkProductRequest" element
     */
    public void setGetListOfWorkProductRequest(org.uicds.interestGroupService.GetListOfWorkProductRequestDocument.GetListOfWorkProductRequest getListOfWorkProductRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetListOfWorkProductRequestDocument.GetListOfWorkProductRequest target = null;
            target = (org.uicds.interestGroupService.GetListOfWorkProductRequestDocument.GetListOfWorkProductRequest)get_store().find_element_user(GETLISTOFWORKPRODUCTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.GetListOfWorkProductRequestDocument.GetListOfWorkProductRequest)get_store().add_element_user(GETLISTOFWORKPRODUCTREQUEST$0);
            }
            target.set(getListOfWorkProductRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetListOfWorkProductRequest" element
     */
    public org.uicds.interestGroupService.GetListOfWorkProductRequestDocument.GetListOfWorkProductRequest addNewGetListOfWorkProductRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.GetListOfWorkProductRequestDocument.GetListOfWorkProductRequest target = null;
            target = (org.uicds.interestGroupService.GetListOfWorkProductRequestDocument.GetListOfWorkProductRequest)get_store().add_element_user(GETLISTOFWORKPRODUCTREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetListOfWorkProductRequest(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class GetListOfWorkProductRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.GetListOfWorkProductRequestDocument.GetListOfWorkProductRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetListOfWorkProductRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTERESTGROUPID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroupId");
        
        
        /**
         * Gets the "InterestGroupId" element
         */
        public java.lang.String getInterestGroupId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTGROUPID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "InterestGroupId" element
         */
        public org.apache.xmlbeans.XmlString xgetInterestGroupId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERESTGROUPID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "InterestGroupId" element
         */
        public void setInterestGroupId(java.lang.String interestGroupId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTGROUPID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERESTGROUPID$0);
                }
                target.setStringValue(interestGroupId);
            }
        }
        
        /**
         * Sets (as xml) the "InterestGroupId" element
         */
        public void xsetInterestGroupId(org.apache.xmlbeans.XmlString interestGroupId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INTERESTGROUPID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INTERESTGROUPID$0);
                }
                target.set(interestGroupId);
            }
        }
    }
}
