/*
 * An XML document type.
 * Localname: SubscriptionReference
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.SubscriptionReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one SubscriptionReference(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class SubscriptionReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.SubscriptionReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscriptionReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONREFERENCE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionReference");
    
    
    /**
     * Gets the "SubscriptionReference" element
     */
    public org.w3.x2005.x08.addressing.EndpointReferenceType getSubscriptionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
            target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(SUBSCRIPTIONREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubscriptionReference" element
     */
    public void setSubscriptionReference(org.w3.x2005.x08.addressing.EndpointReferenceType subscriptionReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
            target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(SUBSCRIPTIONREFERENCE$0, 0);
            if (target == null)
            {
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(SUBSCRIPTIONREFERENCE$0);
            }
            target.set(subscriptionReference);
        }
    }
    
    /**
     * Appends and returns a new empty "SubscriptionReference" element
     */
    public org.w3.x2005.x08.addressing.EndpointReferenceType addNewSubscriptionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
            target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(SUBSCRIPTIONREFERENCE$0);
            return target;
        }
    }
}
