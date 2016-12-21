/*
 * An XML document type.
 * Localname: SubscriptionPolicy
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.SubscriptionPolicyDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one SubscriptionPolicy(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class SubscriptionPolicyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.SubscriptionPolicyDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscriptionPolicyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONPOLICY$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionPolicy");
    
    
    /**
     * Gets the "SubscriptionPolicy" element
     */
    public org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType getSubscriptionPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType)get_store().find_element_user(SUBSCRIPTIONPOLICY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubscriptionPolicy" element
     */
    public void setSubscriptionPolicy(org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType subscriptionPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType)get_store().find_element_user(SUBSCRIPTIONPOLICY$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType)get_store().add_element_user(SUBSCRIPTIONPOLICY$0);
            }
            target.set(subscriptionPolicy);
        }
    }
    
    /**
     * Appends and returns a new empty "SubscriptionPolicy" element
     */
    public org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType addNewSubscriptionPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType)get_store().add_element_user(SUBSCRIPTIONPOLICY$0);
            return target;
        }
    }
}
