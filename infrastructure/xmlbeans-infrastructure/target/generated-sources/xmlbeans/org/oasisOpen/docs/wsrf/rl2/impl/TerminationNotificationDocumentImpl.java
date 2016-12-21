/*
 * An XML document type.
 * Localname: TerminationNotification
 * Namespace: http://docs.oasis-open.org/wsrf/rl-2
 * Java type: org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.rl2.impl;
/**
 * A document containing one TerminationNotification(@http://docs.oasis-open.org/wsrf/rl-2) element.
 *
 * This is a complex type.
 */
public class TerminationNotificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public TerminationNotificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERMINATIONNOTIFICATION$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "TerminationNotification");
    
    
    /**
     * Gets the "TerminationNotification" element
     */
    public org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument.TerminationNotification getTerminationNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument.TerminationNotification target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument.TerminationNotification)get_store().find_element_user(TERMINATIONNOTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TerminationNotification" element
     */
    public void setTerminationNotification(org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument.TerminationNotification terminationNotification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument.TerminationNotification target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument.TerminationNotification)get_store().find_element_user(TERMINATIONNOTIFICATION$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument.TerminationNotification)get_store().add_element_user(TERMINATIONNOTIFICATION$0);
            }
            target.set(terminationNotification);
        }
    }
    
    /**
     * Appends and returns a new empty "TerminationNotification" element
     */
    public org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument.TerminationNotification addNewTerminationNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument.TerminationNotification target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument.TerminationNotification)get_store().add_element_user(TERMINATIONNOTIFICATION$0);
            return target;
        }
    }
    /**
     * An XML TerminationNotification(@http://docs.oasis-open.org/wsrf/rl-2).
     *
     * This is a complex type.
     */
    public static class TerminationNotificationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.TerminationNotificationDocument.TerminationNotification
    {
        private static final long serialVersionUID = 1L;
        
        public TerminationNotificationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TERMINATIONTIME$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "TerminationTime");
        private static final javax.xml.namespace.QName TERMINATIONREASON$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "TerminationReason");
        
        
        /**
         * Gets the "TerminationTime" element
         */
        public java.util.Calendar getTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERMINATIONTIME$0, 0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$0, 0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$0, 0);
                if (target == null) return false;
                return target.isNil();
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERMINATIONTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERMINATIONTIME$0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TERMINATIONTIME$0);
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
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TERMINATIONTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TERMINATIONTIME$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Gets the "TerminationReason" element
         */
        public org.apache.xmlbeans.XmlObject getTerminationReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(TERMINATIONREASON$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "TerminationReason" element
         */
        public boolean isSetTerminationReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TERMINATIONREASON$2) != 0;
            }
        }
        
        /**
         * Sets the "TerminationReason" element
         */
        public void setTerminationReason(org.apache.xmlbeans.XmlObject terminationReason)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(TERMINATIONREASON$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(TERMINATIONREASON$2);
                }
                target.set(terminationReason);
            }
        }
        
        /**
         * Appends and returns a new empty "TerminationReason" element
         */
        public org.apache.xmlbeans.XmlObject addNewTerminationReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlObject target = null;
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(TERMINATIONREASON$2);
                return target;
            }
        }
        
        /**
         * Unsets the "TerminationReason" element
         */
        public void unsetTerminationReason()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TERMINATIONREASON$2, 0);
            }
        }
    }
}
