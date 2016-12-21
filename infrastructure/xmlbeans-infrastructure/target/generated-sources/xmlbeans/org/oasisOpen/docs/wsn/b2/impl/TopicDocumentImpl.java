/*
 * An XML document type.
 * Localname: Topic
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.TopicDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one Topic(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class TopicDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.TopicDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopicDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPIC$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "Topic");
    
    
    /**
     * Gets the "Topic" element
     */
    public org.oasisOpen.docs.wsn.b2.TopicExpressionType getTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().find_element_user(TOPIC$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Topic" element
     */
    public void setTopic(org.oasisOpen.docs.wsn.b2.TopicExpressionType topic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().find_element_user(TOPIC$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().add_element_user(TOPIC$0);
            }
            target.set(topic);
        }
    }
    
    /**
     * Appends and returns a new empty "Topic" element
     */
    public org.oasisOpen.docs.wsn.b2.TopicExpressionType addNewTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().add_element_user(TOPIC$0);
            return target;
        }
    }
}
