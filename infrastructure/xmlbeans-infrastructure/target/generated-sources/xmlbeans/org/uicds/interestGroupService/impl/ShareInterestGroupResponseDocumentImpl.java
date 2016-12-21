/*
 * An XML document type.
 * Localname: ShareInterestGroupResponse
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.ShareInterestGroupResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one ShareInterestGroupResponse(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class ShareInterestGroupResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.ShareInterestGroupResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ShareInterestGroupResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SHAREINTERESTGROUPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "ShareInterestGroupResponse");
    
    
    /**
     * Gets the "ShareInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.ShareInterestGroupResponseDocument.ShareInterestGroupResponse getShareInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.ShareInterestGroupResponseDocument.ShareInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.ShareInterestGroupResponseDocument.ShareInterestGroupResponse)get_store().find_element_user(SHAREINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ShareInterestGroupResponse" element
     */
    public void setShareInterestGroupResponse(org.uicds.interestGroupService.ShareInterestGroupResponseDocument.ShareInterestGroupResponse shareInterestGroupResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.ShareInterestGroupResponseDocument.ShareInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.ShareInterestGroupResponseDocument.ShareInterestGroupResponse)get_store().find_element_user(SHAREINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.ShareInterestGroupResponseDocument.ShareInterestGroupResponse)get_store().add_element_user(SHAREINTERESTGROUPRESPONSE$0);
            }
            target.set(shareInterestGroupResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ShareInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.ShareInterestGroupResponseDocument.ShareInterestGroupResponse addNewShareInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.ShareInterestGroupResponseDocument.ShareInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.ShareInterestGroupResponseDocument.ShareInterestGroupResponse)get_store().add_element_user(SHAREINTERESTGROUPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ShareInterestGroupResponse(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class ShareInterestGroupResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.ShareInterestGroupResponseDocument.ShareInterestGroupResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ShareInterestGroupResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTERESTGROUPSHARESUCESSFUL$0 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroupShareSucessful");
        private static final javax.xml.namespace.QName ERRORSTRING$2 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "ErrorString");
        
        
        /**
         * Gets the "InterestGroupShareSucessful" element
         */
        public boolean getInterestGroupShareSucessful()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTGROUPSHARESUCESSFUL$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "InterestGroupShareSucessful" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetInterestGroupShareSucessful()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INTERESTGROUPSHARESUCESSFUL$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "InterestGroupShareSucessful" element
         */
        public void setInterestGroupShareSucessful(boolean interestGroupShareSucessful)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTGROUPSHARESUCESSFUL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERESTGROUPSHARESUCESSFUL$0);
                }
                target.setBooleanValue(interestGroupShareSucessful);
            }
        }
        
        /**
         * Sets (as xml) the "InterestGroupShareSucessful" element
         */
        public void xsetInterestGroupShareSucessful(org.apache.xmlbeans.XmlBoolean interestGroupShareSucessful)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INTERESTGROUPSHARESUCESSFUL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INTERESTGROUPSHARESUCESSFUL$0);
                }
                target.set(interestGroupShareSucessful);
            }
        }
        
        /**
         * Gets the "ErrorString" element
         */
        public java.lang.String getErrorString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORSTRING$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "ErrorString" element
         */
        public org.apache.xmlbeans.XmlString xgetErrorString()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORSTRING$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "ErrorString" element
         */
        public void setErrorString(java.lang.String errorString)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORSTRING$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORSTRING$2);
                }
                target.setStringValue(errorString);
            }
        }
        
        /**
         * Sets (as xml) the "ErrorString" element
         */
        public void xsetErrorString(org.apache.xmlbeans.XmlString errorString)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORSTRING$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORSTRING$2);
                }
                target.set(errorString);
            }
        }
    }
}
