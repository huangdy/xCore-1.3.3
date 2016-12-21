/*
 * An XML document type.
 * Localname: UnableToDestroySubscriptionFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnableToDestroySubscriptionFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one UnableToDestroySubscriptionFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class UnableToDestroySubscriptionFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UnableToDestroySubscriptionFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnableToDestroySubscriptionFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNABLETODESTROYSUBSCRIPTIONFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnableToDestroySubscriptionFault");
    
    
    /**
     * Gets the "UnableToDestroySubscriptionFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnableToDestroySubscriptionFaultType getUnableToDestroySubscriptionFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnableToDestroySubscriptionFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnableToDestroySubscriptionFaultType)get_store().find_element_user(UNABLETODESTROYSUBSCRIPTIONFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnableToDestroySubscriptionFault" element
     */
    public void setUnableToDestroySubscriptionFault(org.oasisOpen.docs.wsn.b2.UnableToDestroySubscriptionFaultType unableToDestroySubscriptionFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnableToDestroySubscriptionFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnableToDestroySubscriptionFaultType)get_store().find_element_user(UNABLETODESTROYSUBSCRIPTIONFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.UnableToDestroySubscriptionFaultType)get_store().add_element_user(UNABLETODESTROYSUBSCRIPTIONFAULT$0);
            }
            target.set(unableToDestroySubscriptionFault);
        }
    }
    
    /**
     * Appends and returns a new empty "UnableToDestroySubscriptionFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnableToDestroySubscriptionFaultType addNewUnableToDestroySubscriptionFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnableToDestroySubscriptionFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnableToDestroySubscriptionFaultType)get_store().add_element_user(UNABLETODESTROYSUBSCRIPTIONFAULT$0);
            return target;
        }
    }
}
