/*
 * An XML document type.
 * Localname: PauseSubscription
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one PauseSubscription(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class PauseSubscriptionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument
{
    private static final long serialVersionUID = 1L;
    
    public PauseSubscriptionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAUSESUBSCRIPTION$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "PauseSubscription");
    
    
    /**
     * Gets the "PauseSubscription" element
     */
    public org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument.PauseSubscription getPauseSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument.PauseSubscription target = null;
            target = (org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument.PauseSubscription)get_store().find_element_user(PAUSESUBSCRIPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PauseSubscription" element
     */
    public void setPauseSubscription(org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument.PauseSubscription pauseSubscription)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument.PauseSubscription target = null;
            target = (org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument.PauseSubscription)get_store().find_element_user(PAUSESUBSCRIPTION$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument.PauseSubscription)get_store().add_element_user(PAUSESUBSCRIPTION$0);
            }
            target.set(pauseSubscription);
        }
    }
    
    /**
     * Appends and returns a new empty "PauseSubscription" element
     */
    public org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument.PauseSubscription addNewPauseSubscription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument.PauseSubscription target = null;
            target = (org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument.PauseSubscription)get_store().add_element_user(PAUSESUBSCRIPTION$0);
            return target;
        }
    }
    /**
     * An XML PauseSubscription(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class PauseSubscriptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.PauseSubscriptionDocument.PauseSubscription
    {
        private static final long serialVersionUID = 1L;
        
        public PauseSubscriptionImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
