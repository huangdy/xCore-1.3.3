/*
 * An XML document type.
 * Localname: Renew
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.RenewDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one Renew(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class RenewDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.RenewDocument
{
    private static final long serialVersionUID = 1L;
    
    public RenewDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENEW$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "Renew");
    
    
    /**
     * Gets the "Renew" element
     */
    public org.oasisOpen.docs.wsn.b2.RenewDocument.Renew getRenew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.RenewDocument.Renew target = null;
            target = (org.oasisOpen.docs.wsn.b2.RenewDocument.Renew)get_store().find_element_user(RENEW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Renew" element
     */
    public void setRenew(org.oasisOpen.docs.wsn.b2.RenewDocument.Renew renew)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.RenewDocument.Renew target = null;
            target = (org.oasisOpen.docs.wsn.b2.RenewDocument.Renew)get_store().find_element_user(RENEW$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.RenewDocument.Renew)get_store().add_element_user(RENEW$0);
            }
            target.set(renew);
        }
    }
    
    /**
     * Appends and returns a new empty "Renew" element
     */
    public org.oasisOpen.docs.wsn.b2.RenewDocument.Renew addNewRenew()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.RenewDocument.Renew target = null;
            target = (org.oasisOpen.docs.wsn.b2.RenewDocument.Renew)get_store().add_element_user(RENEW$0);
            return target;
        }
    }
    /**
     * An XML Renew(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class RenewImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.RenewDocument.Renew
    {
        private static final long serialVersionUID = 1L;
        
        public RenewImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TERMINATIONTIME$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TerminationTime");
        
        
        /**
         * Gets the "TerminationTime" element
         */
        public java.lang.Object getTerminationTime()
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
                return target.getObjectValue();
            }
        }
        
        /**
         * Gets (as xml) the "TerminationTime" element
         */
        public org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType xgetTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType target = null;
                target = (org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType)get_store().find_element_user(TERMINATIONTIME$0, 0);
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
                org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType target = null;
                target = (org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType)get_store().find_element_user(TERMINATIONTIME$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "TerminationTime" element
         */
        public void setTerminationTime(java.lang.Object terminationTime)
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
                target.setObjectValue(terminationTime);
            }
        }
        
        /**
         * Sets (as xml) the "TerminationTime" element
         */
        public void xsetTerminationTime(org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType terminationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType target = null;
                target = (org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType)get_store().find_element_user(TERMINATIONTIME$0, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType)get_store().add_element_user(TERMINATIONTIME$0);
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
                org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType target = null;
                target = (org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType)get_store().find_element_user(TERMINATIONTIME$0, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsn.b2.AbsoluteOrRelativeTimeType)get_store().add_element_user(TERMINATIONTIME$0);
                }
                target.setNil();
            }
        }
    }
}
