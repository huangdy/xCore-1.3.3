/*
 * An XML document type.
 * Localname: TopicExpression
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.TopicExpressionDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one TopicExpression(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class TopicExpressionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.TopicExpressionDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopicExpressionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPICEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpression");
    
    
    /**
     * Gets the "TopicExpression" element
     */
    public org.oasisOpen.docs.wsn.b2.TopicExpressionType getTopicExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().find_element_user(TOPICEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopicExpression" element
     */
    public void setTopicExpression(org.oasisOpen.docs.wsn.b2.TopicExpressionType topicExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().find_element_user(TOPICEXPRESSION$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().add_element_user(TOPICEXPRESSION$0);
            }
            target.set(topicExpression);
        }
    }
    
    /**
     * Appends and returns a new empty "TopicExpression" element
     */
    public org.oasisOpen.docs.wsn.b2.TopicExpressionType addNewTopicExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.TopicExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().add_element_user(TOPICEXPRESSION$0);
            return target;
        }
    }
}
