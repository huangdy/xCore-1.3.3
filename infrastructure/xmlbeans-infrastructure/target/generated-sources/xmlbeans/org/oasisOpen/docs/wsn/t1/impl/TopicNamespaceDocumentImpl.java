/*
 * An XML document type.
 * Localname: TopicNamespace
 * Namespace: http://docs.oasis-open.org/wsn/t-1
 * Java type: org.oasisOpen.docs.wsn.t1.TopicNamespaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.t1.impl;
/**
 * A document containing one TopicNamespace(@http://docs.oasis-open.org/wsn/t-1) element.
 *
 * This is a complex type.
 */
public class TopicNamespaceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.t1.TopicNamespaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopicNamespaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPICNAMESPACE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/t-1", "TopicNamespace");
    
    
    /**
     * Gets the "TopicNamespace" element
     */
    public org.oasisOpen.docs.wsn.t1.TopicNamespaceType getTopicNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicNamespaceType target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicNamespaceType)get_store().find_element_user(TOPICNAMESPACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopicNamespace" element
     */
    public void setTopicNamespace(org.oasisOpen.docs.wsn.t1.TopicNamespaceType topicNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicNamespaceType target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicNamespaceType)get_store().find_element_user(TOPICNAMESPACE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.t1.TopicNamespaceType)get_store().add_element_user(TOPICNAMESPACE$0);
            }
            target.set(topicNamespace);
        }
    }
    
    /**
     * Appends and returns a new empty "TopicNamespace" element
     */
    public org.oasisOpen.docs.wsn.t1.TopicNamespaceType addNewTopicNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicNamespaceType target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicNamespaceType)get_store().add_element_user(TOPICNAMESPACE$0);
            return target;
        }
    }
}
