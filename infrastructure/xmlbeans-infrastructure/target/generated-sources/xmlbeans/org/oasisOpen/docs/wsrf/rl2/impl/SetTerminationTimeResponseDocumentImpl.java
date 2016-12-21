/*
 * An XML document type.
 * Localname: SetTerminationTimeResponse
 * Namespace: http://docs.oasis-open.org/wsrf/rl-2
 * Java type: org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.rl2.impl;
/**
 * A document containing one SetTerminationTimeResponse(@http://docs.oasis-open.org/wsrf/rl-2) element.
 *
 * This is a complex type.
 */
public class SetTerminationTimeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SetTerminationTimeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SETTERMINATIONTIMERESPONSE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "SetTerminationTimeResponse");
    
    
    /**
     * Gets the "SetTerminationTimeResponse" element
     */
    public org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument.SetTerminationTimeResponse getSetTerminationTimeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument.SetTerminationTimeResponse target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument.SetTerminationTimeResponse)get_store().find_element_user(SETTERMINATIONTIMERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SetTerminationTimeResponse" element
     */
    public void setSetTerminationTimeResponse(org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument.SetTerminationTimeResponse setTerminationTimeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument.SetTerminationTimeResponse target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument.SetTerminationTimeResponse)get_store().find_element_user(SETTERMINATIONTIMERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument.SetTerminationTimeResponse)get_store().add_element_user(SETTERMINATIONTIMERESPONSE$0);
            }
            target.set(setTerminationTimeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "SetTerminationTimeResponse" element
     */
    public org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument.SetTerminationTimeResponse addNewSetTerminationTimeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument.SetTerminationTimeResponse target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument.SetTerminationTimeResponse)get_store().add_element_user(SETTERMINATIONTIMERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML SetTerminationTimeResponse(@http://docs.oasis-open.org/wsrf/rl-2).
     *
     * This is a complex type.
     */
    public static class SetTerminationTimeResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.SetTerminationTimeResponseDocument.SetTerminationTimeResponse
    {
        private static final long serialVersionUID = 1L;
        
        public SetTerminationTimeResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NEWTERMINATIONTIME$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "NewTerminationTime");
        private static final javax.xml.namespace.QName CURRENTTIME$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "CurrentTime");
        
        
        /**
         * Gets the "NewTerminationTime" element
         */
        public java.util.Calendar getNewTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWTERMINATIONTIME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "NewTerminationTime" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetNewTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(NEWTERMINATIONTIME$0, 0);
                return target;
            }
        }
        
        /**
         * Tests for nil "NewTerminationTime" element
         */
        public boolean isNilNewTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(NEWTERMINATIONTIME$0, 0);
                if (target == null) return false;
                return target.isNil();
            }
        }
        
        /**
         * Sets the "NewTerminationTime" element
         */
        public void setNewTerminationTime(java.util.Calendar newTerminationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWTERMINATIONTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWTERMINATIONTIME$0);
                }
                target.setCalendarValue(newTerminationTime);
            }
        }
        
        /**
         * Sets (as xml) the "NewTerminationTime" element
         */
        public void xsetNewTerminationTime(org.apache.xmlbeans.XmlDateTime newTerminationTime)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(NEWTERMINATIONTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(NEWTERMINATIONTIME$0);
                }
                target.set(newTerminationTime);
            }
        }
        
        /**
         * Nils the "NewTerminationTime" element
         */
        public void setNilNewTerminationTime()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(NEWTERMINATIONTIME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(NEWTERMINATIONTIME$0);
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
    }
}
