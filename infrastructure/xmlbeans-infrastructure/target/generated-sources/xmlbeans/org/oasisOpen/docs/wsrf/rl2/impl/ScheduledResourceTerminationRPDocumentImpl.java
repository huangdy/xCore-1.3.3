/*
 * An XML document type.
 * Localname: ScheduledResourceTerminationRP
 * Namespace: http://docs.oasis-open.org/wsrf/rl-2
 * Java type: org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.rl2.impl;
/**
 * A document containing one ScheduledResourceTerminationRP(@http://docs.oasis-open.org/wsrf/rl-2) element.
 *
 * This is a complex type.
 */
public class ScheduledResourceTerminationRPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument
{
    private static final long serialVersionUID = 1L;
    
    public ScheduledResourceTerminationRPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCHEDULEDRESOURCETERMINATIONRP$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "ScheduledResourceTerminationRP");
    
    
    /**
     * Gets the "ScheduledResourceTerminationRP" element
     */
    public org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument.ScheduledResourceTerminationRP getScheduledResourceTerminationRP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument.ScheduledResourceTerminationRP target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument.ScheduledResourceTerminationRP)get_store().find_element_user(SCHEDULEDRESOURCETERMINATIONRP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ScheduledResourceTerminationRP" element
     */
    public void setScheduledResourceTerminationRP(org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument.ScheduledResourceTerminationRP scheduledResourceTerminationRP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument.ScheduledResourceTerminationRP target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument.ScheduledResourceTerminationRP)get_store().find_element_user(SCHEDULEDRESOURCETERMINATIONRP$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument.ScheduledResourceTerminationRP)get_store().add_element_user(SCHEDULEDRESOURCETERMINATIONRP$0);
            }
            target.set(scheduledResourceTerminationRP);
        }
    }
    
    /**
     * Appends and returns a new empty "ScheduledResourceTerminationRP" element
     */
    public org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument.ScheduledResourceTerminationRP addNewScheduledResourceTerminationRP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument.ScheduledResourceTerminationRP target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument.ScheduledResourceTerminationRP)get_store().add_element_user(SCHEDULEDRESOURCETERMINATIONRP$0);
            return target;
        }
    }
    /**
     * An XML ScheduledResourceTerminationRP(@http://docs.oasis-open.org/wsrf/rl-2).
     *
     * This is a complex type.
     */
    public static class ScheduledResourceTerminationRPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.ScheduledResourceTerminationRPDocument.ScheduledResourceTerminationRP
    {
        private static final long serialVersionUID = 1L;
        
        public ScheduledResourceTerminationRPImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CURRENTTIME$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "CurrentTime");
        private static final javax.xml.namespace.QName TERMINATIONTIME$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "TerminationTime");
        
        
        /**
         * Gets the "CurrentTime" element
         */
        public org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime getCurrentTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime target = null;
                target = (org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime)get_store().find_element_user(CURRENTTIME$0, 0);
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
                target = (org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime)get_store().find_element_user(CURRENTTIME$0, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime)get_store().add_element_user(CURRENTTIME$0);
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
                target = (org.oasisOpen.docs.wsrf.rl2.CurrentTimeDocument.CurrentTime)get_store().add_element_user(CURRENTTIME$0);
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
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().find_element_user(TERMINATIONTIME$2, 0);
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
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().find_element_user(TERMINATIONTIME$2, 0);
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
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().find_element_user(TERMINATIONTIME$2, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().add_element_user(TERMINATIONTIME$2);
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
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().add_element_user(TERMINATIONTIME$2);
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
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().find_element_user(TERMINATIONTIME$2, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().add_element_user(TERMINATIONTIME$2);
                }
                target.setNil();
            }
        }
    }
}
