/*
 * An XML document type.
 * Localname: SetTerminationTime
 * Namespace: http://docs.oasis-open.org/wsrf/rl-2
 * Java type: org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.rl2.impl;
/**
 * A document containing one SetTerminationTime(@http://docs.oasis-open.org/wsrf/rl-2) element.
 *
 * This is a complex type.
 */
public class SetTerminationTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetTerminationTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETTERMINATIONTIME$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "SetTerminationTime");
    
    
    /**
     * Gets the "SetTerminationTime" element
     */
    public org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument.SetTerminationTime getSetTerminationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument.SetTerminationTime target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument.SetTerminationTime)get_store().find_element_user(SETTERMINATIONTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SetTerminationTime" element
     */
    public void setSetTerminationTime(org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument.SetTerminationTime setTerminationTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument.SetTerminationTime target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument.SetTerminationTime)get_store().find_element_user(SETTERMINATIONTIME$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument.SetTerminationTime)get_store().add_element_user(SETTERMINATIONTIME$0);
            }
            target.set(setTerminationTime);
        }
    }
    
    /**
     * Appends and returns a new empty "SetTerminationTime" element
     */
    public org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument.SetTerminationTime addNewSetTerminationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument.SetTerminationTime target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument.SetTerminationTime)get_store().add_element_user(SETTERMINATIONTIME$0);
            return target;
        }
    }
    /**
     * An XML SetTerminationTime(@http://docs.oasis-open.org/wsrf/rl-2).
     *
     * This is a complex type.
     */
    public static class SetTerminationTimeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeDocument.SetTerminationTime
    {
        private static final long serialVersionUID = 1L;
        
        public SetTerminationTimeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUESTEDTERMINATIONTIME$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "RequestedTerminationTime");
        private static final javax.xml.namespace.QName REQUESTEDLIFETIMEDURATION$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "RequestedLifetimeDuration");
        
        
        /**
         * Gets the "RequestedTerminationTime" element
         */
        public java.util.Calendar getRequestedTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTEDTERMINATIONTIME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "RequestedTerminationTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetRequestedTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REQUESTEDTERMINATIONTIME$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "RequestedTerminationTime" element
         */
        public boolean isNilRequestedTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REQUESTEDTERMINATIONTIME$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * True if has "RequestedTerminationTime" element
         */
        public boolean isSetRequestedTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTEDTERMINATIONTIME$0) != 0;
            }
        }
        
        /**
         * Sets the "RequestedTerminationTime" element
         */
        public void setRequestedTerminationTime(java.util.Calendar requestedTerminationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTEDTERMINATIONTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTEDTERMINATIONTIME$0);
                }
                target.setCalendarValue(requestedTerminationTime);
            }
        }
        
        /**
         * Sets (as xml) the "RequestedTerminationTime" element
         */
        public void xsetRequestedTerminationTime(org.apache.xmlbeans.XmlDateTime requestedTerminationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REQUESTEDTERMINATIONTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(REQUESTEDTERMINATIONTIME$0);
                }
                target.set(requestedTerminationTime);
            }
        }
        
        /**
         * Nils the "RequestedTerminationTime" element
         */
        public void setNilRequestedTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(REQUESTEDTERMINATIONTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(REQUESTEDTERMINATIONTIME$0);
                }
                target.setNil();
            }
        }
        
        /**
         * Unsets the "RequestedTerminationTime" element
         */
        public void unsetRequestedTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTEDTERMINATIONTIME$0, 0);
            }
        }
        
        /**
         * Gets the "RequestedLifetimeDuration" element
         */
        public org.apache.xmlbeans.GDuration getRequestedLifetimeDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTEDLIFETIMEDURATION$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getGDurationValue();
            }
        }
        
        /**
         * Gets (as xml) the "RequestedLifetimeDuration" element
         */
        public org.apache.xmlbeans.XmlDuration xgetRequestedLifetimeDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDuration target = null;
                target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(REQUESTEDLIFETIMEDURATION$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "RequestedLifetimeDuration" element
         */
        public boolean isSetRequestedLifetimeDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTEDLIFETIMEDURATION$2) != 0;
            }
        }
        
        /**
         * Sets the "RequestedLifetimeDuration" element
         */
        public void setRequestedLifetimeDuration(org.apache.xmlbeans.GDuration requestedLifetimeDuration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTEDLIFETIMEDURATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTEDLIFETIMEDURATION$2);
                }
                target.setGDurationValue(requestedLifetimeDuration);
            }
        }
        
        /**
         * Sets (as xml) the "RequestedLifetimeDuration" element
         */
        public void xsetRequestedLifetimeDuration(org.apache.xmlbeans.XmlDuration requestedLifetimeDuration)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDuration target = null;
                target = (org.apache.xmlbeans.XmlDuration)get_store().find_element_user(REQUESTEDLIFETIMEDURATION$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDuration)get_store().add_element_user(REQUESTEDLIFETIMEDURATION$2);
                }
                target.set(requestedLifetimeDuration);
            }
        }
        
        /**
         * Unsets the "RequestedLifetimeDuration" element
         */
        public void unsetRequestedLifetimeDuration()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTEDLIFETIMEDURATION$2, 0);
            }
        }
    }
}
