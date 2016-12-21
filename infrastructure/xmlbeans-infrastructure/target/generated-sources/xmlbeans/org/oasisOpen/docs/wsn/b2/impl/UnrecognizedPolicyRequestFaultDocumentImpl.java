/*
 * An XML document type.
 * Localname: UnrecognizedPolicyRequestFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one UnrecognizedPolicyRequestFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class UnrecognizedPolicyRequestFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnrecognizedPolicyRequestFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNRECOGNIZEDPOLICYREQUESTFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "UnrecognizedPolicyRequestFault");
    
    
    /**
     * Gets the "UnrecognizedPolicyRequestFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType getUnrecognizedPolicyRequestFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType)get_store().find_element_user(UNRECOGNIZEDPOLICYREQUESTFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnrecognizedPolicyRequestFault" element
     */
    public void setUnrecognizedPolicyRequestFault(org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType unrecognizedPolicyRequestFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType)get_store().find_element_user(UNRECOGNIZEDPOLICYREQUESTFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType)get_store().add_element_user(UNRECOGNIZEDPOLICYREQUESTFAULT$0);
            }
            target.set(unrecognizedPolicyRequestFault);
        }
    }
    
    /**
     * Appends and returns a new empty "UnrecognizedPolicyRequestFault" element
     */
    public org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType addNewUnrecognizedPolicyRequestFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.UnrecognizedPolicyRequestFaultType)get_store().add_element_user(UNRECOGNIZEDPOLICYREQUESTFAULT$0);
            return target;
        }
    }
}
