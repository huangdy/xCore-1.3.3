/*
 * An XML document type.
 * Localname: ArchiveInterestGroupRequest
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one ArchiveInterestGroupRequest(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class ArchiveInterestGroupRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArchiveInterestGroupRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCHIVEINTERESTGROUPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "ArchiveInterestGroupRequest");
    
    
    /**
     * Gets the "ArchiveInterestGroupRequest" element
     */
    public org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument.ArchiveInterestGroupRequest getArchiveInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument.ArchiveInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument.ArchiveInterestGroupRequest)get_store().find_element_user(ARCHIVEINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArchiveInterestGroupRequest" element
     */
    public void setArchiveInterestGroupRequest(org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument.ArchiveInterestGroupRequest archiveInterestGroupRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument.ArchiveInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument.ArchiveInterestGroupRequest)get_store().find_element_user(ARCHIVEINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument.ArchiveInterestGroupRequest)get_store().add_element_user(ARCHIVEINTERESTGROUPREQUEST$0);
            }
            target.set(archiveInterestGroupRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ArchiveInterestGroupRequest" element
     */
    public org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument.ArchiveInterestGroupRequest addNewArchiveInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument.ArchiveInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument.ArchiveInterestGroupRequest)get_store().add_element_user(ARCHIVEINTERESTGROUPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ArchiveInterestGroupRequest(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class ArchiveInterestGroupRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.ArchiveInterestGroupRequestDocument.ArchiveInterestGroupRequest
    {
        private static final long serialVersionUID = 1L;
        
        public ArchiveInterestGroupRequestImpl(org.apache.xmlbeans.SchemaType sType)
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
