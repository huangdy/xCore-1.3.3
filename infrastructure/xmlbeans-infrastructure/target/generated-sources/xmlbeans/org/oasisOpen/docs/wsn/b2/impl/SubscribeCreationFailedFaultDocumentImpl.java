/*
 * An XML document type.
 * Localname: SubscribeCreationFailedFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.SubscribeCreationFailedFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one SubscribeCreationFailedFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class SubscribeCreationFailedFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.SubscribeCreationFailedFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubscribeCreationFailedFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBSCRIBECREATIONFAILEDFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "SubscribeCreationFailedFault");
    
    
    /**
     * Gets the "SubscribeCreationFailedFault" element
     */
    public org.oasisOpen.docs.wsn.b2.SubscribeCreationFailedFaultType getSubscribeCreationFailedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscribeCreationFailedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscribeCreationFailedFaultType)get_store().find_element_user(SUBSCRIBECREATIONFAILEDFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SubscribeCreationFailedFault" element
     */
    public void setSubscribeCreationFailedFault(org.oasisOpen.docs.wsn.b2.SubscribeCreationFailedFaultType subscribeCreationFailedFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscribeCreationFailedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscribeCreationFailedFaultType)get_store().find_element_user(SUBSCRIBECREATIONFAILEDFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.SubscribeCreationFailedFaultType)get_store().add_element_user(SUBSCRIBECREATIONFAILEDFAULT$0);
            }
            target.set(subscribeCreationFailedFault);
        }
    }
    
    /**
     * Appends and returns a new empty "SubscribeCreationFailedFault" element
     */
    public org.oasisOpen.docs.wsn.b2.SubscribeCreationFailedFaultType addNewSubscribeCreationFailedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.SubscribeCreationFailedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.SubscribeCreationFailedFaultType)get_store().add_element_user(SUBSCRIBECREATIONFAILEDFAULT$0);
            return target;
        }
    }
}
