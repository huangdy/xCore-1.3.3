/*
 * An XML document type.
 * Localname: CloseInterestGroupRequest
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.CloseInterestGroupRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one CloseInterestGroupRequest(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class CloseInterestGroupRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.CloseInterestGroupRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public CloseInterestGroupRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOSEINTERESTGROUPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "CloseInterestGroupRequest");
    
    
    /**
     * Gets the "CloseInterestGroupRequest" element
     */
    public org.uicds.interestGroupService.CloseInterestGroupRequestDocument.CloseInterestGroupRequest getCloseInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.CloseInterestGroupRequestDocument.CloseInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.CloseInterestGroupRequestDocument.CloseInterestGroupRequest)get_store().find_element_user(CLOSEINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CloseInterestGroupRequest" element
     */
    public void setCloseInterestGroupRequest(org.uicds.interestGroupService.CloseInterestGroupRequestDocument.CloseInterestGroupRequest closeInterestGroupRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.CloseInterestGroupRequestDocument.CloseInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.CloseInterestGroupRequestDocument.CloseInterestGroupRequest)get_store().find_element_user(CLOSEINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.CloseInterestGroupRequestDocument.CloseInterestGroupRequest)get_store().add_element_user(CLOSEINTERESTGROUPREQUEST$0);
            }
            target.set(closeInterestGroupRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "CloseInterestGroupRequest" element
     */
    public org.uicds.interestGroupService.CloseInterestGroupRequestDocument.CloseInterestGroupRequest addNewCloseInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.CloseInterestGroupRequestDocument.CloseInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.CloseInterestGroupRequestDocument.CloseInterestGroupRequest)get_store().add_element_user(CLOSEINTERESTGROUPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML CloseInterestGroupRequest(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class CloseInterestGroupRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.CloseInterestGroupRequestDocument.CloseInterestGroupRequest
    {
        private static final long serialVersionUID = 1L;
        
        public CloseInterestGroupRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
