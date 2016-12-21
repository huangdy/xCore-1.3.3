/*
 * An XML document type.
 * Localname: ResumeSubscriptionResponse
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one ResumeSubscriptionResponse(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class ResumeSubscriptionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResumeSubscriptionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESUMESUBSCRIPTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ResumeSubscriptionResponse");
    
    
    /**
     * Gets the "ResumeSubscriptionResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse getResumeSubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse)get_store().find_element_user(RESUMESUBSCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResumeSubscriptionResponse" element
     */
    public void setResumeSubscriptionResponse(org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse resumeSubscriptionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse)get_store().find_element_user(RESUMESUBSCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse)get_store().add_element_user(RESUMESUBSCRIPTIONRESPONSE$0);
            }
            target.set(resumeSubscriptionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "ResumeSubscriptionResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse addNewResumeSubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse)get_store().add_element_user(RESUMESUBSCRIPTIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML ResumeSubscriptionResponse(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class ResumeSubscriptionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public ResumeSubscriptionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
