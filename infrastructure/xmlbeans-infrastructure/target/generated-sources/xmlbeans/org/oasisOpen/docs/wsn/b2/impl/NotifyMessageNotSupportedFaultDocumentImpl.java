/*
 * An XML document type.
 * Localname: NotifyMessageNotSupportedFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.NotifyMessageNotSupportedFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one NotifyMessageNotSupportedFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class NotifyMessageNotSupportedFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.NotifyMessageNotSupportedFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotifyMessageNotSupportedFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFYMESSAGENOTSUPPORTEDFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "NotifyMessageNotSupportedFault");
    
    
    /**
     * Gets the "NotifyMessageNotSupportedFault" element
     */
    public org.oasisOpen.docs.wsn.b2.NotifyMessageNotSupportedFaultType getNotifyMessageNotSupportedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotifyMessageNotSupportedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotifyMessageNotSupportedFaultType)get_store().find_element_user(NOTIFYMESSAGENOTSUPPORTEDFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NotifyMessageNotSupportedFault" element
     */
    public void setNotifyMessageNotSupportedFault(org.oasisOpen.docs.wsn.b2.NotifyMessageNotSupportedFaultType notifyMessageNotSupportedFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotifyMessageNotSupportedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotifyMessageNotSupportedFaultType)get_store().find_element_user(NOTIFYMESSAGENOTSUPPORTEDFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.NotifyMessageNotSupportedFaultType)get_store().add_element_user(NOTIFYMESSAGENOTSUPPORTEDFAULT$0);
            }
            target.set(notifyMessageNotSupportedFault);
        }
    }
    
    /**
     * Appends and returns a new empty "NotifyMessageNotSupportedFault" element
     */
    public org.oasisOpen.docs.wsn.b2.NotifyMessageNotSupportedFaultType addNewNotifyMessageNotSupportedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotifyMessageNotSupportedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotifyMessageNotSupportedFaultType)get_store().add_element_user(NOTIFYMESSAGENOTSUPPORTEDFAULT$0);
            return target;
        }
    }
}
