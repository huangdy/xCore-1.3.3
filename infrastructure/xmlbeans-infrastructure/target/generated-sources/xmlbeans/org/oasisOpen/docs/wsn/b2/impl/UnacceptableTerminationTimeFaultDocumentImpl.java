/*
 * An XML document type.
 * Localname: UnacceptableTerminationTimeFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one UnacceptableTerminationTimeFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class UnacceptableTerminationTimeFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnacceptableTerminationTimeFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNACCEPTABLETERMINATIONTIMEFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnacceptableTerminationTimeFault");
    
    
    /**
     * Gets the "UnacceptableTerminationTimeFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultType getUnacceptableTerminationTimeFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultType)get_store().find_element_user(UNACCEPTABLETERMINATIONTIMEFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnacceptableTerminationTimeFault" element
     */
    public void setUnacceptableTerminationTimeFault(org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultType unacceptableTerminationTimeFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultType)get_store().find_element_user(UNACCEPTABLETERMINATIONTIMEFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultType)get_store().add_element_user(UNACCEPTABLETERMINATIONTIMEFAULT$0);
            }
            target.set(unacceptableTerminationTimeFault);
        }
    }
    
    /**
     * Appends and returns a new empty "UnacceptableTerminationTimeFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultType addNewUnacceptableTerminationTimeFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnacceptableTerminationTimeFaultType)get_store().add_element_user(UNACCEPTABLETERMINATIONTIMEFAULT$0);
            return target;
        }
    }
}
