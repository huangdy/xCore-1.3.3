/*
 * An XML document type.
 * Localname: InvalidMessageContentExpressionFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.InvalidMessageContentExpressionFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one InvalidMessageContentExpressionFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class InvalidMessageContentExpressionFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.InvalidMessageContentExpressionFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvalidMessageContentExpressionFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVALIDMESSAGECONTENTEXPRESSIONFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "InvalidMessageContentExpressionFault");
    
    
    /**
     * Gets the "InvalidMessageContentExpressionFault" element
     */
    public org.oasisOpen.docs.wsn.b2.InvalidMessageContentExpressionFaultType getInvalidMessageContentExpressionFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.InvalidMessageContentExpressionFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.InvalidMessageContentExpressionFaultType)get_store().find_element_user(INVALIDMESSAGECONTENTEXPRESSIONFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InvalidMessageContentExpressionFault" element
     */
    public void setInvalidMessageContentExpressionFault(org.oasisOpen.docs.wsn.b2.InvalidMessageContentExpressionFaultType invalidMessageContentExpressionFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.InvalidMessageContentExpressionFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.InvalidMessageContentExpressionFaultType)get_store().find_element_user(INVALIDMESSAGECONTENTEXPRESSIONFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.InvalidMessageContentExpressionFaultType)get_store().add_element_user(INVALIDMESSAGECONTENTEXPRESSIONFAULT$0);
            }
            target.set(invalidMessageContentExpressionFault);
        }
    }
    
    /**
     * Appends and returns a new empty "InvalidMessageContentExpressionFault" element
     */
    public org.oasisOpen.docs.wsn.b2.InvalidMessageContentExpressionFaultType addNewInvalidMessageContentExpressionFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.InvalidMessageContentExpressionFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.InvalidMessageContentExpressionFaultType)get_store().add_element_user(INVALIDMESSAGECONTENTEXPRESSIONFAULT$0);
            return target;
        }
    }
}
