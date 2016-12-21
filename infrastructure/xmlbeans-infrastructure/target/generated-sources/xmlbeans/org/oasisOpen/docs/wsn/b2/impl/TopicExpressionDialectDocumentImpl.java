/*
 * An XML document type.
 * Localname: TopicExpressionDialect
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.TopicExpressionDialectDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one TopicExpressionDialect(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class TopicExpressionDialectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.TopicExpressionDialectDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopicExpressionDialectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPICEXPRESSIONDIALECT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpressionDialect");
    
    
    /**
     * Gets the "TopicExpressionDialect" element
     */
    public java.lang.String getTopicExpressionDialect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPICEXPRESSIONDIALECT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TopicExpressionDialect" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTopicExpressionDialect()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TOPICEXPRESSIONDIALECT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TopicExpressionDialect" element
     */
    public void setTopicExpressionDialect(java.lang.String topicExpressionDialect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPICEXPRESSIONDIALECT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOPICEXPRESSIONDIALECT$0);
            }
            target.setStringValue(topicExpressionDialect);
        }
    }
    
    /**
     * Sets (as xml) the "TopicExpressionDialect" element
     */
    public void xsetTopicExpressionDialect(org.apache.xmlbeans.XmlAnyURI topicExpressionDialect)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TOPICEXPRESSIONDIALECT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(TOPICEXPRESSIONDIALECT$0);
            }
            target.set(topicExpressionDialect);
        }
    }
}
