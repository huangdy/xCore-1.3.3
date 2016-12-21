/*
 * An XML document type.
 * Localname: PauseFailedFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.PauseFailedFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one PauseFailedFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class PauseFailedFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.PauseFailedFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public PauseFailedFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAUSEFAILEDFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "PauseFailedFault");
    
    
    /**
     * Gets the "PauseFailedFault" element
     */
    public org.oasisOpen.docs.wsn.b2.PauseFailedFaultType getPauseFailedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.PauseFailedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.PauseFailedFaultType)get_store().find_element_user(PAUSEFAILEDFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PauseFailedFault" element
     */
    public void setPauseFailedFault(org.oasisOpen.docs.wsn.b2.PauseFailedFaultType pauseFailedFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.PauseFailedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.PauseFailedFaultType)get_store().find_element_user(PAUSEFAILEDFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.PauseFailedFaultType)get_store().add_element_user(PAUSEFAILEDFAULT$0);
            }
            target.set(pauseFailedFault);
        }
    }
    
    /**
     * Appends and returns a new empty "PauseFailedFault" element
     */
    public org.oasisOpen.docs.wsn.b2.PauseFailedFaultType addNewPauseFailedFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.PauseFailedFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.PauseFailedFaultType)get_store().add_element_user(PAUSEFAILEDFAULT$0);
            return target;
        }
    }
}
