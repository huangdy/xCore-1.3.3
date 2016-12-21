/*
 * An XML document type.
 * Localname: Subscribe
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.SubscribeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one Subscribe(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class SubscribeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.SubscribeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "Subscribe");
    
    
    /**
     * Gets the "Subscribe" element
     */
    public org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe getSubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe)get_store().find_element_user(SUBSCRIBE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Subscribe" element
     */
    public void setSubscribe(org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe subscribe)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe)get_store().find_element_user(SUBSCRIBE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe)get_store().add_element_user(SUBSCRIBE$0);
            }
            target.set(subscribe);
        }
    }
    
    /**
     * Appends and returns a new empty "Subscribe" element
     */
    public org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe addNewSubscribe()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe)get_store().add_element_user(SUBSCRIBE$0);
            return target;
        }
    }
    /**
     * An XML Subscribe(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class SubscribeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe
    {
        private static final long serialVersionUID = 1L;
        
        public SubscribeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONSUMERREFERENCE$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ConsumerReference");
        private static final javax.xml.namespace.QName FILTER$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "Filter");
        private static final javax.xml.namespace.QName INITIALTERMINATIONTIME$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "InitialTerminationTime");
        private static final javax.xml.namespace.QName SUBSCRIPTIONPOLICY$6 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionPolicy");
        
        
        /**
         * Gets the "ConsumerReference" element
         */
        public org.w3.x2005.x08.addressing.EndpointReferenceType getConsumerReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(CONSUMERREFERENCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ConsumerReference" element
         */
        public void setConsumerReference(org.w3.x2005.x08.addressing.EndpointReferenceType consumerReference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().find_element_user(CONSUMERREFERENCE$0, 0);
                if (target == null)
                {
                    target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(CONSUMERREFERENCE$0);
                }
                target.set(consumerReference);
            }
        }
        
        /**
         * Appends and returns a new empty "ConsumerReference" element
         */
        public org.w3.x2005.x08.addressing.EndpointReferenceType addNewConsumerReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.w3.x2005.x08.addressing.EndpointReferenceType target = null;
                target = (org.w3.x2005.x08.addressing.EndpointReferenceType)get_store().add_element_user(CONSUMERREFERENCE$0);
                return target;
            }
        }
        
        /**
         * Gets the "Filter" element
         */
        public org.oasisOpen.docs.wsn.b2.FilterType getFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.FilterType target = null;
                target = (org.oasisOpen.docs.wsn.b2.FilterType)get_store().find_element_user(FILTER$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Filter" element
         */
        public boolean isSetFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FILTER$2) != 0;
            }
        }
        
        /**
         * Sets the "Filter" element
         */
        public void setFilter(org.oasisOpen.docs.wsn.b2.FilterType filter)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.FilterType target = null;
                target = (org.oasisOpen.docs.wsn.b2.FilterType)get_store().find_element_user(FILTER$2, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsn.b2.FilterType)get_store().add_element_user(FILTER$2);
                }
                target.set(filter);
            }
        }
        
        /**
         * Appends and returns a new empty "Filter" element
         */
        public org.oasisOpen.docs.wsn.b2.FilterType addNewFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.FilterType target = null;
                target = (org.oasisOpen.docs.wsn.b2.FilterType)get_store().add_element_user(FILTER$2);
                return target;
            }
        }
        
        /**
         * Unsets the "Filter" element
         */
        public void unsetFilter()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FILTER$2, 0);
            }
        }
        
        /**
         * Gets the "InitialTerminationTime" element
         */
        public java.lang.Object getInitialTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALTERMINATIONTIME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getObjectValue();
            }
        }
        
        /**
         * Gets (as xml) the "InitialTerminationTime" element
         */
        public org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType xgetInitialTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType target = null;
                target = (org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType)get_store().find_element_user(INITIALTERMINATIONTIME$4, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "InitialTerminationTime" element
         */
        public boolean isNilInitialTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType target = null;
                target = (org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType)get_store().find_element_user(INITIALTERMINATIONTIME$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "InitialTerminationTime" element
         */
        public boolean isSetInitialTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INITIALTERMINATIONTIME$4) != 0;
            }
        }
        
        /**
         * Sets the "InitialTerminationTime" element
         */
        public void setInitialTerminationTime(java.lang.Object initialTerminationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALTERMINATIONTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INITIALTERMINATIONTIME$4);
                }
                target.setObjectValue(initialTerminationTime);
            }
        }
        
        /**
         * Sets (as xml) the "InitialTerminationTime" element
         */
        public void xsetInitialTerminationTime(org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType initialTerminationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType target = null;
                target = (org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType)get_store().find_element_user(INITIALTERMINATIONTIME$4, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType)get_store().add_element_user(INITIALTERMINATIONTIME$4);
                }
                target.set(initialTerminationTime);
            }
        }
        
        /**
         * Nils the "InitialTerminationTime" element
         */
        public void setNilInitialTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType target = null;
                target = (org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType)get_store().find_element_user(INITIALTERMINATIONTIME$4, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType)get_store().add_element_user(INITIALTERMINATIONTIME$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "InitialTerminationTime" element
         */
        public void unsetInitialTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INITIALTERMINATIONTIME$4, 0);
            }
        }
        
        /**
         * Gets the "SubscriptionPolicy" element
         */
        public org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy getSubscriptionPolicy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy target = null;
                target = (org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy)get_store().find_element_user(SUBSCRIPTIONPOLICY$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "SubscriptionPolicy" element
         */
        public boolean isSetSubscriptionPolicy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBSCRIPTIONPOLICY$6) != 0;
            }
        }
        
        /**
         * Sets the "SubscriptionPolicy" element
         */
        public void setSubscriptionPolicy(org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy subscriptionPolicy)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy target = null;
                target = (org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy)get_store().find_element_user(SUBSCRIPTIONPOLICY$6, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy)get_store().add_element_user(SUBSCRIPTIONPOLICY$6);
                }
                target.set(subscriptionPolicy);
            }
        }
        
        /**
         * Appends and returns a new empty "SubscriptionPolicy" element
         */
        public org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy addNewSubscriptionPolicy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy target = null;
                target = (org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy)get_store().add_element_user(SUBSCRIPTIONPOLICY$6);
                return target;
            }
        }
        
        /**
         * Unsets the "SubscriptionPolicy" element
         */
        public void unsetSubscriptionPolicy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBSCRIPTIONPOLICY$6, 0);
            }
        }
        /**
         * An XML SubscriptionPolicy(@http://docs.oasis-open.org/wsn/b-2).
         *
         * This is a complex type.
         */
        public static class SubscriptionPolicyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.SubscribeDocument.Subscribe.SubscriptionPolicy
        {
            private static final long serialVersionUID = 1L;
            
            public SubscriptionPolicyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            
        }
    }
}
