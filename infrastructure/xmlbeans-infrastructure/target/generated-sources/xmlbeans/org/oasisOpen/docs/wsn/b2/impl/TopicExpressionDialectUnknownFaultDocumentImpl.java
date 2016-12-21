/*
 * An XML document type.
 * Localname: TopicExpressionDialectUnknownFault
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.TopicExpressionDialectUnknownFaultDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one TopicExpressionDialectUnknownFault(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class TopicExpressionDialectUnknownFaultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.TopicExpressionDialectUnknownFaultDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopicExpressionDialectUnknownFaultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPICEXPRESSIONDIALECTUNKNOWNFAULT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpressionDialectUnknownFault");
    
    
    /**
     * Gets the "TopicExpressionDialectUnknownFault" element
     */
    public org.oasisOpen.docs.wsn.b2.TopicExpressionDialectUnknownFaultType getTopicExpressionDialectUnknownFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicExpressionDialectUnknownFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicExpressionDialectUnknownFaultType)get_store().find_element_user(TOPICEXPRESSIONDIALECTUNKNOWNFAULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopicExpressionDialectUnknownFault" element
     */
    public void setTopicExpressionDialectUnknownFault(org.oasisOpen.docs.wsn.b2.TopicExpressionDialectUnknownFaultType topicExpressionDialectUnknownFault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicExpressionDialectUnknownFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicExpressionDialectUnknownFaultType)get_store().find_element_user(TOPICEXPRESSIONDIALECTUNKNOWNFAULT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.TopicExpressionDialectUnknownFaultType)get_store().add_element_user(TOPICEXPRESSIONDIALECTUNKNOWNFAULT$0);
            }
            target.set(topicExpressionDialectUnknownFault);
        }
    }
    
    /**
     * Appends and returns a new empty "TopicExpressionDialectUnknownFault" element
     */
    public org.oasisOpen.docs.wsn.b2.TopicExpressionDialectUnknownFaultType addNewTopicExpressionDialectUnknownFault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicExpressionDialectUnknownFaultType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicExpressionDialectUnknownFaultType)get_store().add_element_user(TOPICEXPRESSIONDIALECTUNKNOWNFAULT$0);
            return target;
        }
    }
}
