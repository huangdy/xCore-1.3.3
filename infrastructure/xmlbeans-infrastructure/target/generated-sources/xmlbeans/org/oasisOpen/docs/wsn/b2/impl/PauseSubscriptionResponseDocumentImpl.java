/*
 * An XML document type.
 * Localname: PauseSubscriptionResponse
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one PauseSubscriptionResponse(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class PauseSubscriptionResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PauseSubscriptionResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAUSESUBSCRIPTIONRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "PauseSubscriptionResponse");
    
    
    /**
     * Gets the "PauseSubscriptionResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument.PauseSubscriptionResponse getPauseSubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument.PauseSubscriptionResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument.PauseSubscriptionResponse)get_store().find_element_user(PAUSESUBSCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PauseSubscriptionResponse" element
     */
    public void setPauseSubscriptionResponse(org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument.PauseSubscriptionResponse pauseSubscriptionResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument.PauseSubscriptionResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument.PauseSubscriptionResponse)get_store().find_element_user(PAUSESUBSCRIPTIONRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument.PauseSubscriptionResponse)get_store().add_element_user(PAUSESUBSCRIPTIONRESPONSE$0);
            }
            target.set(pauseSubscriptionResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "PauseSubscriptionResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument.PauseSubscriptionResponse addNewPauseSubscriptionResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument.PauseSubscriptionResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument.PauseSubscriptionResponse)get_store().add_element_user(PAUSESUBSCRIPTIONRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML PauseSubscriptionResponse(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class PauseSubscriptionResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.PauseSubscriptionResponseDocument.PauseSubscriptionResponse
    {
        private static final long serialVersionUID = 1L;
        
        public PauseSubscriptionResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
