/*
 * XML Type:  NotificationMessageHolderType
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * An XML NotificationMessageHolderType(@http://docs.oasis-open.org/wsn/b-2).
 *
 * This is a complex type.
 */
public class NotificationMessageHolderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType
{
    private static final long serialVersionUID = 1L;
    
    public NotificationMessageHolderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONREFERENCE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionReference");
    private static final javax.xml.namespace.QName TOPIC$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "Topic");
    private static final javax.xml.namespace.QName PRODUCERREFERENCE$4 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ProducerReference");
    private static final javax.xml.namespace.QName MESSAGE$6 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "Message");
    
    
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
     * True if has "SubscriptionReference" element
     */
    public boolean isSetSubscriptionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIPTIONREFERENCE$0) != 0;
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
    
    /**
     * Unsets the "SubscriptionReference" element
     */
    public void unsetSubscriptionReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIPTIONREFERENCE$0, 0);
        }
    }
    
    /**
     * Gets the "Topic" element
     */
    public org.oasisOpen.docs.wsn.b2.TopicExpressionType getTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().find_element_user(TOPIC$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Topic" element
     */
    public boolean isSetTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPIC$2) != 0;
        }
    }
    
    /**
     * Sets the "Topic" element
     */
    public void setTopic(org.oasisOpen.docs.wsn.b2.TopicExpressionType topic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().find_element_user(TOPIC$2, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().add_element_user(TOPIC$2);
            }
            target.set(topic);
        }
    }
    
    /**
     * Appends and returns a new empty "Topic" element
     */
    public org.oasisOpen.docs.wsn.b2.TopicExpressionType addNewTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().add_element_user(TOPIC$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Topic" element
     */
    public void unsetTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPIC$2, 0);
        }
    }
    
    /**
     * Gets the "ProducerReference" element
     */
    public org.w3.x2005.x08.addressing.EndpointReferenceType getProducerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
            target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(PRODUCERREFERENCE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ProducerReference" element
     */
    public boolean isSetProducerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCERREFERENCE$4) != 0;
        }
    }
    
    /**
     * Sets the "ProducerReference" element
     */
    public void setProducerReference(org.w3.x2005.x08.addressing.EndpointReferenceType producerReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
            target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(PRODUCERREFERENCE$4, 0);
            if (target == null)
            {
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(PRODUCERREFERENCE$4);
            }
            target.set(producerReference);
        }
    }
    
    /**
     * Appends and returns a new empty "ProducerReference" element
     */
    public org.w3.x2005.x08.addressing.EndpointReferenceType addNewProducerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
            target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(PRODUCERREFERENCE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "ProducerReference" element
     */
    public void unsetProducerReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCERREFERENCE$4, 0);
        }
    }
    
    /**
     * Gets the "Message" element
     */
    public org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message)get_store().find_element_user(MESSAGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message)get_store().find_element_user(MESSAGE$6, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message)get_store().add_element_user(MESSAGE$6);
            }
            target.set(message);
        }
    }
    
    /**
     * Appends and returns a new empty "Message" element
     */
    public org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message addNewMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message)get_store().add_element_user(MESSAGE$6);
            return target;
        }
    }
    /**
     * An XML Message(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class MessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.NotificationMessageHolderType.Message
    {
        private static final long serialVersionUID = 1L;
        
        public MessageImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
