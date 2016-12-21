/*
 * An XML document type.
 * Localname: PostDetailedCFSMessageRequest
 * Namespace: http://uicds.org/LEITSCService
 * Java type: org.uicds.leitscService.PostDetailedCFSMessageRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.leitscService.impl;
/**
 * A document containing one PostDetailedCFSMessageRequest(@http://uicds.org/LEITSCService) element.
 *
 * This is a complex type.
 */
public class PostDetailedCFSMessageRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.leitscService.PostDetailedCFSMessageRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public PostDetailedCFSMessageRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSTDETAILEDCFSMESSAGEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/LEITSCService", "PostDetailedCFSMessageRequest");
    
    
    /**
     * Gets the "PostDetailedCFSMessageRequest" element
     */
    public org.uicds.leitscService.PostDetailedCFSMessageRequestDocument.PostDetailedCFSMessageRequest getPostDetailedCFSMessageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.leitscService.PostDetailedCFSMessageRequestDocument.PostDetailedCFSMessageRequest target = null;
            target = (org.uicds.leitscService.PostDetailedCFSMessageRequestDocument.PostDetailedCFSMessageRequest)get_store().find_element_user(POSTDETAILEDCFSMESSAGEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PostDetailedCFSMessageRequest" element
     */
    public void setPostDetailedCFSMessageRequest(org.uicds.leitscService.PostDetailedCFSMessageRequestDocument.PostDetailedCFSMessageRequest postDetailedCFSMessageRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.leitscService.PostDetailedCFSMessageRequestDocument.PostDetailedCFSMessageRequest target = null;
            target = (org.uicds.leitscService.PostDetailedCFSMessageRequestDocument.PostDetailedCFSMessageRequest)get_store().find_element_user(POSTDETAILEDCFSMESSAGEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.leitscService.PostDetailedCFSMessageRequestDocument.PostDetailedCFSMessageRequest)get_store().add_element_user(POSTDETAILEDCFSMESSAGEREQUEST$0);
            }
            target.set(postDetailedCFSMessageRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "PostDetailedCFSMessageRequest" element
     */
    public org.uicds.leitscService.PostDetailedCFSMessageRequestDocument.PostDetailedCFSMessageRequest addNewPostDetailedCFSMessageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.leitscService.PostDetailedCFSMessageRequestDocument.PostDetailedCFSMessageRequest target = null;
            target = (org.uicds.leitscService.PostDetailedCFSMessageRequestDocument.PostDetailedCFSMessageRequest)get_store().add_element_user(POSTDETAILEDCFSMESSAGEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML PostDetailedCFSMessageRequest(@http://uicds.org/LEITSCService).
     *
     * This is a complex type.
     */
    public static class PostDetailedCFSMessageRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.leitscService.PostDetailedCFSMessageRequestDocument.PostDetailedCFSMessageRequest
    {
        private static final long serialVersionUID = 1L;
        
        public PostDetailedCFSMessageRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
