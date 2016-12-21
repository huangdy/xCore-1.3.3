/*
 * An XML document type.
 * Localname: UnShareInterestGroupRequest
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.UnShareInterestGroupRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one UnShareInterestGroupRequest(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class UnShareInterestGroupRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.UnShareInterestGroupRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnShareInterestGroupRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSHAREINTERESTGROUPREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "UnShareInterestGroupRequest");
    
    
    /**
     * Gets the "UnShareInterestGroupRequest" element
     */
    public org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest getUnShareInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest)get_store().find_element_user(UNSHAREINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnShareInterestGroupRequest" element
     */
    public void setUnShareInterestGroupRequest(org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest unShareInterestGroupRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest)get_store().find_element_user(UNSHAREINTERESTGROUPREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest)get_store().add_element_user(UNSHAREINTERESTGROUPREQUEST$0);
            }
            target.set(unShareInterestGroupRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UnShareInterestGroupRequest" element
     */
    public org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest addNewUnShareInterestGroupRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest target = null;
            target = (org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest)get_store().add_element_user(UNSHAREINTERESTGROUPREQUEST$0);
            return target;
        }
    }
    /**
     * An XML UnShareInterestGroupRequest(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class UnShareInterestGroupRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.UnShareInterestGroupRequestDocument.UnShareInterestGroupRequest
    {
        private static final long serialVersionUID = 1L;
        
        public UnShareInterestGroupRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTERESTGROUPID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroupID");
        private static final javax.xml.namespace.QName CORENAME$2 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "CoreName");
        
        
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
    }
}
