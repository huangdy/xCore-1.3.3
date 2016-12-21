/*
 * An XML document type.
 * Localname: SubscriptionManagerRP
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one SubscriptionManagerRP(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class SubscriptionManagerRPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscriptionManagerRPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIPTIONMANAGERRP$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionManagerRP");
    
    
    /**
     * Gets the "SubscriptionManagerRP" element
     */
    public org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP getSubscriptionManagerRP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP)get_store().find_element_user(SUBSCRIPTIONMANAGERRP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubscriptionManagerRP" element
     */
    public void setSubscriptionManagerRP(org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP subscriptionManagerRP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP)get_store().find_element_user(SUBSCRIPTIONMANAGERRP$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP)get_store().add_element_user(SUBSCRIPTIONMANAGERRP$0);
            }
            target.set(subscriptionManagerRP);
        }
    }
    
    /**
     * Appends and returns a new empty "SubscriptionManagerRP" element
     */
    public org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP addNewSubscriptionManagerRP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP)get_store().add_element_user(SUBSCRIPTIONMANAGERRP$0);
            return target;
        }
    }
    /**
     * An XML SubscriptionManagerRP(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class SubscriptionManagerRPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.SubscriptionManagerRPDocument.SubscriptionManagerRP
    {
        private static final long serialVersionUID = 1L;
        
        public SubscriptionManagerRPImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONSUMERREFERENCE$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "ConsumerReference");
        private static final javax.xml.namespace.QName FILTER$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "Filter");
        private static final javax.xml.namespace.QName SUBSCRIPTIONPOLICY$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionPolicy");
        private static final javax.xml.namespace.QName CREATIONTIME$6 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "CreationTime");
        private static final javax.xml.namespace.QName CURRENTTIME$8 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "CurrentTime");
        private static final javax.xml.namespace.QName TERMINATIONTIME$10 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "TerminationTime");
        
        
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
         * Gets the "SubscriptionPolicy" element
         */
        public org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType getSubscriptionPolicy()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType target = null;
                target = (org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType)get_store().find_element_user(SUBSCRIPTIONPOLICY$4, 0);
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
                return get_store().count_elements(SUBSCRIPTIONPOLICY$4) != 0;
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
                target = (org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType)get_store().find_element_user(SUBSCRIPTIONPOLICY$4, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType)get_store().add_element_user(SUBSCRIPTIONPOLICY$4);
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
                target = (org.oasisOpen.docs.wsn.b2.SubscriptionPolicyType)get_store().add_element_user(SUBSCRIPTIONPOLICY$4);
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
                get_store().remove_element(SUBSCRIPTIONPOLICY$4, 0);
            }
        }
        
        /**
         * Gets the "CreationTime" element
         */
        public java.util.Calendar getCreationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONTIME$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "CreationTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetCreationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONTIME$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "CreationTime" element
         */
        public boolean isSetCreationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CREATIONTIME$6) != 0;
            }
        }
        
        /**
         * Sets the "CreationTime" element
         */
        public void setCreationTime(java.util.Calendar creationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATIONTIME$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATIONTIME$6);
                }
                target.setCalendarValue(creationTime);
            }
        }
        
        /**
         * Sets (as xml) the "CreationTime" element
         */
        public void xsetCreationTime(org.apache.xmlbeans.XmlDateTime creationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATIONTIME$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATIONTIME$6);
                }
                target.set(creationTime);
            }
        }
        
        /**
         * Unsets the "CreationTime" element
         */
        public void unsetCreationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CREATIONTIME$6, 0);
            }
        }
        
        /**
         * Gets the "CurrentTime" element
         */
        public org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime getCurrentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime target = null;
                target = (org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime)get_store().find_element_user(CURRENTTIME$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CurrentTime" element
         */
        public void setCurrentTime(org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime currentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime target = null;
                target = (org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime)get_store().find_element_user(CURRENTTIME$8, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime)get_store().add_element_user(CURRENTTIME$8);
                }
                target.set(currentTime);
            }
        }
        
        /**
         * Appends and returns a new empty "CurrentTime" element
         */
        public org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime addNewCurrentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime target = null;
                target = (org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime)get_store().add_element_user(CURRENTTIME$8);
                return target;
            }
        }
        
        /**
         * Gets the "TerminationTime" element
         */
        public org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime getTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime target = null;
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().find_element_user(TERMINATIONTIME$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Tests for nil "TerminationTime" element
         */
        public boolean isNilTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime target = null;
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().find_element_user(TERMINATIONTIME$10, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "TerminationTime" element
         */
        public void setTerminationTime(org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime terminationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime target = null;
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().find_element_user(TERMINATIONTIME$10, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().add_element_user(TERMINATIONTIME$10);
                }
                target.set(terminationTime);
            }
        }
        
        /**
         * Appends and returns a new empty "TerminationTime" element
         */
        public org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime addNewTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime target = null;
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().add_element_user(TERMINATIONTIME$10);
                return target;
            }
        }
        
        /**
         * Nils the "TerminationTime" element
         */
        public void setNilTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime target = null;
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().find_element_user(TERMINATIONTIME$10, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().add_element_user(TERMINATIONTIME$10);
                }
                target.setNil();
            }
        }
    }
}
