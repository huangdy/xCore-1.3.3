/*
 * An XML document type.
 * Localname: RenewResponse
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.RenewResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one RenewResponse(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class RenewResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.RenewResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public RenewResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENEWRESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "RenewResponse");
    
    
    /**
     * Gets the "RenewResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.RenewResponseDocument.RenewResponse getRenewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.RenewResponseDocument.RenewResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.RenewResponseDocument.RenewResponse)get_store().find_element_user(RENEWRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RenewResponse" element
     */
    public void setRenewResponse(org.oasisOpen.docs.wsn.b2.RenewResponseDocument.RenewResponse renewResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.RenewResponseDocument.RenewResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.RenewResponseDocument.RenewResponse)get_store().find_element_user(RENEWRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.RenewResponseDocument.RenewResponse)get_store().add_element_user(RENEWRESPONSE$0);
            }
            target.set(renewResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "RenewResponse" element
     */
    public org.oasisOpen.docs.wsn.b2.RenewResponseDocument.RenewResponse addNewRenewResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.RenewResponseDocument.RenewResponse target = null;
            target = (org.oasisOpen.docs.wsn.b2.RenewResponseDocument.RenewResponse)get_store().add_element_user(RENEWRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML RenewResponse(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class RenewResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.RenewResponseDocument.RenewResponse
    {
        private static final long serialVersionUID = 1L;
        
        public RenewResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TERMINATIONTIME$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TerminationTime");
        private static final javax.xml.namespace.QName CURRENTTIME$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "CurrentTime");
        
        
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
    }
}
