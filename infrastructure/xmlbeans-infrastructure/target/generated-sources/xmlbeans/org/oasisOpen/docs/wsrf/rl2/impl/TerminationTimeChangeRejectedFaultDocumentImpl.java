/*
 * An XML document type.
 * Localname: TerminationTimeChangeRejectedFault
 * Namespace: http://docs.oasis-open.org/wsrf/rl-2
 * Java type: org.oasisOpen.docs.wsrf.rl2.TerminationTimeChangeRejectedFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.rl2.impl;
/**
 * A document containing one TerminationTimeChangeRejectedFault(@http://docs.oasis-open.org/wsrf/rl-2) element.
 *
 * This is a complex type.
 */
public class TerminationTimeChangeRejectedFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.TerminationTimeChangeRejectedFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public TerminationTimeChangeRejectedFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERMINATIONTIMECHANGEREJECTEDFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "TerminationTimeChangeRejectedFault");
    
    
    /**
     * Gets the "TerminationTimeChangeRejectedFault" element
     */
    public org.oasisOpen.docs.wsrf.rl2.TerminationTimeChangeRejectedFaultType getTerminationTimeChangeRejectedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.TerminationTimeChangeRejectedFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeChangeRejectedFaultType)get_store().find_element_user(TERMINATIONTIMECHANGEREJECTEDFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TerminationTimeChangeRejectedFault" element
     */
    public void setTerminationTimeChangeRejectedFault(org.oasisOpen.docs.wsrf.rl2.TerminationTimeChangeRejectedFaultType terminationTimeChangeRejectedFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.TerminationTimeChangeRejectedFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeChangeRejectedFaultType)get_store().find_element_user(TERMINATIONTIMECHANGEREJECTEDFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeChangeRejectedFaultType)get_store().add_element_user(TERMINATIONTIMECHANGEREJECTEDFAULT$0);
            }
            target.set(terminationTimeChangeRejectedFault);
        }
    }
    
    /**
     * Appends and returns a new empty "TerminationTimeChangeRejectedFault" element
     */
    public org.oasisOpen.docs.wsrf.rl2.TerminationTimeChangeRejectedFaultType addNewTerminationTimeChangeRejectedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.TerminationTimeChangeRejectedFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.TerminationTimeChangeRejectedFaultType)get_store().add_element_user(TERMINATIONTIMECHANGEREJECTEDFAULT$0);
            return target;
        }
    }
}
