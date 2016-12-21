/*
 * An XML document type.
 * Localname: TerminationTime
 * Namespace: http://docs.oasis-open.org/wsrf/rl-2
 * Java type: org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.rl2.impl;
/**
 * A document containing one TerminationTime(@http://docs.oasis-open.org/wsrf/rl-2) element.
 *
 * This is a complex type.
 */
public class TerminationTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TerminationTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERMINATIONTIME$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "TerminationTime");
    
    
    /**
     * Gets the "TerminationTime" element
     */
    public org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime getTerminationTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().find_element_user(TERMINATIONTIME$0, 0);
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
            target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().find_element_user(TERMINATIONTIME$0, 0);
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
            target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().find_element_user(TERMINATIONTIME$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().add_element_user(TERMINATIONTIME$0);
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
            target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().add_element_user(TERMINATIONTIME$0);
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
            target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().find_element_user(TERMINATIONTIME$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime)get_store().add_element_user(TERMINATIONTIME$0);
            }
            target.setNil();
        }
    }
    /**
     * An XML TerminationTime(@http://docs.oasis-open.org/wsrf/rl-2).
     *
     * This is an atomic type that is a restriction of org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument$TerminationTime.
     */
    public static class TerminationTimeImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements org.oasisOpen.docs.wsrf.rl2.TerminationTimeDocument.TerminationTime
    {
        private static final long serialVersionUID = 1L;
        
        public TerminationTimeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected TerminationTimeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        
    }
}
