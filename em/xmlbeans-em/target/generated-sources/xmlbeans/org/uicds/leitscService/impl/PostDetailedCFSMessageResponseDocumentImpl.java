/*
 * An XML document type.
 * Localname: PostDetailedCFSMessageResponse
 * Namespace: http://uicds.org/LEITSCService
 * Java type: org.uicds.leitscService.PostDetailedCFSMessageResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.leitscService.impl;
/**
 * A document containing one PostDetailedCFSMessageResponse(@http://uicds.org/LEITSCService) element.
 *
 * This is a complex type.
 */
public class PostDetailedCFSMessageResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.leitscService.PostDetailedCFSMessageResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PostDetailedCFSMessageResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTDETAILEDCFSMESSAGERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/LEITSCService", "PostDetailedCFSMessageResponse");
    
    
    /**
     * Gets the "PostDetailedCFSMessageResponse" element
     */
    public org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse getPostDetailedCFSMessageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse target = null;
            target = (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse)get_store().find_element_user(POSTDETAILEDCFSMESSAGERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PostDetailedCFSMessageResponse" element
     */
    public void setPostDetailedCFSMessageResponse(org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse postDetailedCFSMessageResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse target = null;
            target = (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse)get_store().find_element_user(POSTDETAILEDCFSMESSAGERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse)get_store().add_element_user(POSTDETAILEDCFSMESSAGERESPONSE$0);
            }
            target.set(postDetailedCFSMessageResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "PostDetailedCFSMessageResponse" element
     */
    public org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse addNewPostDetailedCFSMessageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse target = null;
            target = (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse)get_store().add_element_user(POSTDETAILEDCFSMESSAGERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML PostDetailedCFSMessageResponse(@http://uicds.org/LEITSCService).
     *
     * This is a complex type.
     */
    public static class PostDetailedCFSMessageResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse
    {
        private static final long serialVersionUID = 1L;
        
        public PostDetailedCFSMessageResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LEITSCINCIDENTID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/LEITSCService", "leitscIncidentID");
        
        
        /**
         * Gets the "leitscIncidentID" element
         */
        public java.lang.String getLeitscIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEITSCINCIDENTID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "leitscIncidentID" element
         */
        public org.apache.xmlbeans.XmlString xgetLeitscIncidentID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEITSCINCIDENTID$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "leitscIncidentID" element
         */
        public void setLeitscIncidentID(java.lang.String leitscIncidentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LEITSCINCIDENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LEITSCINCIDENTID$0);
                }
                target.setStringValue(leitscIncidentID);
            }
        }
        
        /**
         * Sets (as xml) the "leitscIncidentID" element
         */
        public void xsetLeitscIncidentID(org.apache.xmlbeans.XmlString leitscIncidentID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LEITSCINCIDENTID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LEITSCINCIDENTID$0);
                }
                target.set(leitscIncidentID);
            }
        }
    }
}
