/*
 * An XML document type.
 * Localname: InvalidTopicExpressionFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.InvalidTopicExpressionFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one InvalidTopicExpressionFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class InvalidTopicExpressionFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.InvalidTopicExpressionFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public InvalidTopicExpressionFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVALIDTOPICEXPRESSIONFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "InvalidTopicExpressionFault");
    
    
    /**
     * Gets the "InvalidTopicExpressionFault" element
     */
    public org.oasisOpen.docs.wsn.b2.InvalidTopicExpressionFaultType getInvalidTopicExpressionFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.InvalidTopicExpressionFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.InvalidTopicExpressionFaultType)get_store().find_element_user(INVALIDTOPICEXPRESSIONFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "InvalidTopicExpressionFault" element
     */
    public void setInvalidTopicExpressionFault(org.oasisOpen.docs.wsn.b2.InvalidTopicExpressionFaultType invalidTopicExpressionFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.InvalidTopicExpressionFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.InvalidTopicExpressionFaultType)get_store().find_element_user(INVALIDTOPICEXPRESSIONFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.InvalidTopicExpressionFaultType)get_store().add_element_user(INVALIDTOPICEXPRESSIONFAULT$0);
            }
            target.set(invalidTopicExpressionFault);
        }
    }
    
    /**
     * Appends and returns a new empty "InvalidTopicExpressionFault" element
     */
    public org.oasisOpen.docs.wsn.b2.InvalidTopicExpressionFaultType addNewInvalidTopicExpressionFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.InvalidTopicExpressionFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.InvalidTopicExpressionFaultType)get_store().add_element_user(INVALIDTOPICEXPRESSIONFAULT$0);
            return target;
        }
    }
}
