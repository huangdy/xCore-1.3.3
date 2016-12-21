/*
 * An XML document type.
 * Localname: UnableToSetTerminationTimeFault
 * Namespace: http://docs.oasis-open.org/wsrf/rl-2
 * Java type: org.oasisOpen.docs.wsrf.rl2.UnableToSetTerminationTimeFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsrf.rl2.impl;
/**
 * A document containing one UnableToSetTerminationTimeFault(@http://docs.oasis-open.org/wsrf/rl-2) element.
 *
 * This is a complex type.
 */
public class UnableToSetTerminationTimeFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsrf.rl2.UnableToSetTerminationTimeFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnableToSetTerminationTimeFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNABLETOSETTERMINATIONTIMEFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsrf/rl-2", "UnableToSetTerminationTimeFault");
    
    
    /**
     * Gets the "UnableToSetTerminationTimeFault" element
     */
    public org.oasisOpen.docs.wsrf.rl2.UnableToSetTerminationTimeFaultType getUnableToSetTerminationTimeFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.UnableToSetTerminationTimeFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.UnableToSetTerminationTimeFaultType)get_store().find_element_user(UNABLETOSETTERMINATIONTIMEFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnableToSetTerminationTimeFault" element
     */
    public void setUnableToSetTerminationTimeFault(org.oasisOpen.docs.wsrf.rl2.UnableToSetTerminationTimeFaultType unableToSetTerminationTimeFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.UnableToSetTerminationTimeFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.UnableToSetTerminationTimeFaultType)get_store().find_element_user(UNABLETOSETTERMINATIONTIMEFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsrf.rl2.UnableToSetTerminationTimeFaultType)get_store().add_element_user(UNABLETOSETTERMINATIONTIMEFAULT$0);
            }
            target.set(unableToSetTerminationTimeFault);
        }
    }
    
    /**
     * Appends and returns a new empty "UnableToSetTerminationTimeFault" element
     */
    public org.oasisOpen.docs.wsrf.rl2.UnableToSetTerminationTimeFaultType addNewUnableToSetTerminationTimeFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsrf.rl2.UnableToSetTerminationTimeFaultType target = null;
            target = (org.oasisOpen.docs.wsrf.rl2.UnableToSetTerminationTimeFaultType)get_store().add_element_user(UNABLETOSETTERMINATIONTIMEFAULT$0);
            return target;
        }
    }
}
