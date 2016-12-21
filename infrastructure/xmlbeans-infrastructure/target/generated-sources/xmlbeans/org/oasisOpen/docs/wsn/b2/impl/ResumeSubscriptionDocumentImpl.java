/*
 * An XML document type.
 * Localname: ResumeSubscription
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one ResumeSubscription(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class ResumeSubscriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResumeSubscriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESUMESUBSCRIPTION$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ResumeSubscription");
    
    
    /**
     * Gets the "ResumeSubscription" element
     */
    public org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument.ResumeSubscription getResumeSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument.ResumeSubscription target = null;
            target = (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument.ResumeSubscription)get_store().find_element_user(RESUMESUBSCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ResumeSubscription" element
     */
    public void setResumeSubscription(org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument.ResumeSubscription resumeSubscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument.ResumeSubscription target = null;
            target = (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument.ResumeSubscription)get_store().find_element_user(RESUMESUBSCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument.ResumeSubscription)get_store().add_element_user(RESUMESUBSCRIPTION$0);
            }
            target.set(resumeSubscription);
        }
    }
    
    /**
     * Appends and returns a new empty "ResumeSubscription" element
     */
    public org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument.ResumeSubscription addNewResumeSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument.ResumeSubscription target = null;
            target = (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument.ResumeSubscription)get_store().add_element_user(RESUMESUBSCRIPTION$0);
            return target;
        }
    }
    /**
     * An XML ResumeSubscription(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class ResumeSubscriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.ResumeSubscriptionDocument.ResumeSubscription
    {
        private static final long serialVersionUID = 1L;
        
        public ResumeSubscriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
