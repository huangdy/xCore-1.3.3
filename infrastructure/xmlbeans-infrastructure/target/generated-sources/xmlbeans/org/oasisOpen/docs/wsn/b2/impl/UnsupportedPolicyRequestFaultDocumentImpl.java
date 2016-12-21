/*
 * An XML document type.
 * Localname: UnsupportedPolicyRequestFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one UnsupportedPolicyRequestFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class UnsupportedPolicyRequestFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnsupportedPolicyRequestFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSUPPORTEDPOLICYREQUESTFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnsupportedPolicyRequestFault");
    
    
    /**
     * Gets the "UnsupportedPolicyRequestFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType getUnsupportedPolicyRequestFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType)get_store().find_element_user(UNSUPPORTEDPOLICYREQUESTFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnsupportedPolicyRequestFault" element
     */
    public void setUnsupportedPolicyRequestFault(org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType unsupportedPolicyRequestFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType)get_store().find_element_user(UNSUPPORTEDPOLICYREQUESTFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType)get_store().add_element_user(UNSUPPORTEDPOLICYREQUESTFAULT$0);
            }
            target.set(unsupportedPolicyRequestFault);
        }
    }
    
    /**
     * Appends and returns a new empty "UnsupportedPolicyRequestFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType addNewUnsupportedPolicyRequestFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnsupportedPolicyRequestFaultType)get_store().add_element_user(UNSUPPORTEDPOLICYREQUESTFAULT$0);
            return target;
        }
    }
}
