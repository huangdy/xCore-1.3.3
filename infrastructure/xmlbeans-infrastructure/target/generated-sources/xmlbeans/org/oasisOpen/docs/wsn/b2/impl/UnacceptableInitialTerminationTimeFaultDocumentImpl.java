/*
 * An XML document type.
 * Localname: UnacceptableInitialTerminationTimeFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one UnacceptableInitialTerminationTimeFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class UnacceptableInitialTerminationTimeFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnacceptableInitialTerminationTimeFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNACCEPTABLEINITIALTERMINATIONTIMEFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnacceptableInitialTerminationTimeFault");
    
    
    /**
     * Gets the "UnacceptableInitialTerminationTimeFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType getUnacceptableInitialTerminationTimeFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType)get_store().find_element_user(UNACCEPTABLEINITIALTERMINATIONTIMEFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnacceptableInitialTerminationTimeFault" element
     */
    public void setUnacceptableInitialTerminationTimeFault(org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType unacceptableInitialTerminationTimeFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType)get_store().find_element_user(UNACCEPTABLEINITIALTERMINATIONTIMEFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType)get_store().add_element_user(UNACCEPTABLEINITIALTERMINATIONTIMEFAULT$0);
            }
            target.set(unacceptableInitialTerminationTimeFault);
        }
    }
    
    /**
     * Appends and returns a new empty "UnacceptableInitialTerminationTimeFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType addNewUnacceptableInitialTerminationTimeFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnacceptableInitialTerminationTimeFaultType)get_store().add_element_user(UNACCEPTABLEINITIALTERMINATIONTIMEFAULT$0);
            return target;
        }
    }
}
