/*
 * An XML document type.
 * Localname: UnShareInterestGroupResponse
 * Namespace: http://uicds.org/InterestGroupService
 * Java type: org.uicds.interestGroupService.UnShareInterestGroupResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.interestGroupService.impl;
/**
 * A document containing one UnShareInterestGroupResponse(@http://uicds.org/InterestGroupService) element.
 *
 * This is a complex type.
 */
public class UnShareInterestGroupResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.UnShareInterestGroupResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnShareInterestGroupResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSHAREINTERESTGROUPRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "UnShareInterestGroupResponse");
    
    
    /**
     * Gets the "UnShareInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.UnShareInterestGroupResponseDocument.UnShareInterestGroupResponse getUnShareInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.UnShareInterestGroupResponseDocument.UnShareInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.UnShareInterestGroupResponseDocument.UnShareInterestGroupResponse)get_store().find_element_user(UNSHAREINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnShareInterestGroupResponse" element
     */
    public void setUnShareInterestGroupResponse(org.uicds.interestGroupService.UnShareInterestGroupResponseDocument.UnShareInterestGroupResponse unShareInterestGroupResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.UnShareInterestGroupResponseDocument.UnShareInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.UnShareInterestGroupResponseDocument.UnShareInterestGroupResponse)get_store().find_element_user(UNSHAREINTERESTGROUPRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.interestGroupService.UnShareInterestGroupResponseDocument.UnShareInterestGroupResponse)get_store().add_element_user(UNSHAREINTERESTGROUPRESPONSE$0);
            }
            target.set(unShareInterestGroupResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "UnShareInterestGroupResponse" element
     */
    public org.uicds.interestGroupService.UnShareInterestGroupResponseDocument.UnShareInterestGroupResponse addNewUnShareInterestGroupResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.interestGroupService.UnShareInterestGroupResponseDocument.UnShareInterestGroupResponse target = null;
            target = (org.uicds.interestGroupService.UnShareInterestGroupResponseDocument.UnShareInterestGroupResponse)get_store().add_element_user(UNSHAREINTERESTGROUPRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML UnShareInterestGroupResponse(@http://uicds.org/InterestGroupService).
     *
     * This is a complex type.
     */
    public static class UnShareInterestGroupResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.interestGroupService.UnShareInterestGroupResponseDocument.UnShareInterestGroupResponse
    {
        private static final long serialVersionUID = 1L;
        
        public UnShareInterestGroupResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INTERESTGROUPUNSHARESUCESSFUL$0 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "InterestGroupUnShareSucessful");
        private static final javax.xml.namespace.QName ERRORSTRING$2 = 
            new javax.xml.namespace.QName("http://uicds.org/InterestGroupService", "ErrorString");
        
        
        /**
         * Gets the "InterestGroupUnShareSucessful" element
         */
        public boolean getInterestGroupUnShareSucessful()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTGROUPUNSHARESUCESSFUL$0, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "InterestGroupUnShareSucessful" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetInterestGroupUnShareSucessful()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INTERESTGROUPUNSHARESUCESSFUL$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "InterestGroupUnShareSucessful" element
         */
        public void setInterestGroupUnShareSucessful(boolean interestGroupUnShareSucessful)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERESTGROUPUNSHARESUCESSFUL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERESTGROUPUNSHARESUCESSFUL$0);
                }
                target.setBooleanValue(interestGroupUnShareSucessful);
            }
        }
        
        /**
         * Sets (as xml) the "InterestGroupUnShareSucessful" element
         */
        public void xsetInterestGroupUnShareSucessful(org.apache.xmlbeans.XmlBoolean interestGroupUnShareSucessful)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INTERESTGROUPUNSHARESUCESSFUL$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INTERESTGROUPUNSHARESUCESSFUL$0);
                }
                target.set(interestGroupUnShareSucessful);
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
