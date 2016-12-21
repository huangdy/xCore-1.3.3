/*
 * An XML document type.
 * Localname: SubscribeResponse
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one SubscribeResponse(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class SubscribeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "SubscribeResponse");
    
    
    /**
     * Gets the "SubscribeResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument.SubscribeResponse getSubscribeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument.SubscribeResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument.SubscribeResponse)get_store().find_element_user(SUBSCRIBERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubscribeResponse" element
     */
    public void setSubscribeResponse(org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument.SubscribeResponse subscribeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument.SubscribeResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument.SubscribeResponse)get_store().find_element_user(SUBSCRIBERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument.SubscribeResponse)get_store().add_element_user(SUBSCRIBERESPONSE$0);
            }
            target.set(subscribeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SubscribeResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument.SubscribeResponse addNewSubscribeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument.SubscribeResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument.SubscribeResponse)get_store().add_element_user(SUBSCRIBERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SubscribeResponse(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class SubscribeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.SubscribeResponseDocument.SubscribeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SubscribeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SUBSCRIPTIONREFERENCE$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionReference");
        private static final javax.xml.namespace.QName CURRENTTIME$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "CurrentTime");
        private static final javax.xml.namespace.QName TERMINATIONTIME$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TerminationTime");
        
        
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
        
        /**
         * Gets the "CurrentTime" element
         */
        public java.util.Calendar getCurrentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTTIME$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "CurrentTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetCurrentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CURRENTTIME$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "CurrentTime" element
         */
        public boolean isSetCurrentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CURRENTTIME$2) != 0;
            }
        }
        
        /**
         * Sets the "CurrentTime" element
         */
        public void setCurrentTime(java.util.Calendar currentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CURRENTTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CURRENTTIME$2);
                }
                target.setCalendarValue(currentTime);
            }
        }
        
        /**
         * Sets (as xml) the "CurrentTime" element
         */
        public void xsetCurrentTime(org.apache.xmlbeans.XmlDateTime currentTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CURRENTTIME$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CURRENTTIME$2);
                }
                target.set(currentTime);
            }
        }
        
        /**
         * Unsets the "CurrentTime" element
         */
        public void unsetCurrentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CURRENTTIME$2, 0);
            }
        }
        
        /**
         * Gets the "TerminationTime" element
         */
        public java.util.Calendar getTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERMINATIONTIME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "TerminationTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$4, 0);
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
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$4, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "TerminationTime" element
         */
        public boolean isSetTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TERMINATIONTIME$4) != 0;
            }
        }
        
        /**
         * Sets the "TerminationTime" element
         */
        public void setTerminationTime(java.util.Calendar terminationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERMINATIONTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERMINATIONTIME$4);
                }
                target.setCalendarValue(terminationTime);
            }
        }
        
        /**
         * Sets (as xml) the "TerminationTime" element
         */
        public void xsetTerminationTime(org.apache.xmlbeans.XmlDateTime terminationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TERMINATIONTIME$4);
                }
                target.set(terminationTime);
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
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TERMINATIONTIME$4);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "TerminationTime" element
         */
        public void unsetTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TERMINATIONTIME$4, 0);
            }
        }
    }
}
