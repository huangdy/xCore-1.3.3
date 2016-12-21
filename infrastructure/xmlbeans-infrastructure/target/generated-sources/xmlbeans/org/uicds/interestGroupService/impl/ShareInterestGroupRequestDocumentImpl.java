/*
 * An XML document type.
 * Localname: ShareInterestGroupRequest
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.ShareInterestGroupRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one ShareInterestGroupRequest(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class ShareInterestGroupRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.ShareInterestGroupRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShareInterestGroupRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAREINTERESTGROUPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "ShareInterestGroupRequest");
    
    
    /**
     * Gets the "ShareInterestGroupRequest" element
     */
    public org.uicds.interestGroupService.ShareInterestGroupRequestDocument.ShareInterestGroupRequest getShareInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.ShareInterestGroupRequestDocument.ShareInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.ShareInterestGroupRequestDocument.ShareInterestGroupRequest)get_store().find_element_user(SHAREINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ShareInterestGroupRequest" element
     */
    public void setShareInterestGroupRequest(org.uicds.interestGroupService.ShareInterestGroupRequestDocument.ShareInterestGroupRequest shareInterestGroupRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.ShareInterestGroupRequestDocument.ShareInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.ShareInterestGroupRequestDocument.ShareInterestGroupRequest)get_store().find_element_user(SHAREINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.ShareInterestGroupRequestDocument.ShareInterestGroupRequest)get_store().add_element_user(SHAREINTERESTGROUPREQUEST$0);
            }
            target.set(shareInterestGroupRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ShareInterestGroupRequest" element
     */
    public org.uicds.interestGroupService.ShareInterestGroupRequestDocument.ShareInterestGroupRequest addNewShareInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.ShareInterestGroupRequestDocument.ShareInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.ShareInterestGroupRequestDocument.ShareInterestGroupRequest)get_store().add_element_user(SHAREINTERESTGROUPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ShareInterestGroupRequest(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class ShareInterestGroupRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.ShareInterestGroupRequestDocument.ShareInterestGroupRequest
    {
        private static final long serialVersionUID = 1L;
        
        public ShareInterestGroupRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTERESTGROUPID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroupID");
        private static final javax.xml.namespace.QName CORENAME$2 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "CoreName");
        private static final javax.xml.namespace.QName DETAILEDINFO$4 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "DetailedInfo");
        
        
        /**
         * Gets the "InterestGroupID" element
         */
        public java.lang.String getInterestGroupID()
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
         * Gets (as xml) the "InterestGroupID" element
         */
        public org.apache.xmlbeans.XmlString xgetInterestGroupID()
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
         * Sets the "InterestGroupID" element
         */
        public void setInterestGroupID(java.lang.String interestGroupID)
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
                target.setStringValue(interestGroupID);
            }
        }
        
        /**
         * Sets (as xml) the "InterestGroupID" element
         */
        public void xsetInterestGroupID(org.apache.xmlbeans.XmlString interestGroupID)
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
                target.set(interestGroupID);
            }
        }
        
        /**
         * Gets the "CoreName" element
         */
        public java.lang.String getCoreName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORENAME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "CoreName" element
         */
        public org.apache.xmlbeans.XmlString xgetCoreName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORENAME$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "CoreName" element
         */
        public void setCoreName(java.lang.String coreName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORENAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORENAME$2);
                }
                target.setStringValue(coreName);
            }
        }
        
        /**
         * Sets (as xml) the "CoreName" element
         */
        public void xsetCoreName(org.apache.xmlbeans.XmlString coreName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CORENAME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CORENAME$2);
                }
                target.set(coreName);
            }
        }
        
        /**
         * Gets the "DetailedInfo" element
         */
        public java.lang.String getDetailedInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAILEDINFO$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "DetailedInfo" element
         */
        public org.apache.xmlbeans.XmlString xgetDetailedInfo()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETAILEDINFO$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "DetailedInfo" element
         */
        public void setDetailedInfo(java.lang.String detailedInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETAILEDINFO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETAILEDINFO$4);
                }
                target.setStringValue(detailedInfo);
            }
        }
        
        /**
         * Sets (as xml) the "DetailedInfo" element
         */
        public void xsetDetailedInfo(org.apache.xmlbeans.XmlString detailedInfo)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETAILEDINFO$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETAILEDINFO$4);
                }
                target.set(detailedInfo);
            }
        }
    }
}
