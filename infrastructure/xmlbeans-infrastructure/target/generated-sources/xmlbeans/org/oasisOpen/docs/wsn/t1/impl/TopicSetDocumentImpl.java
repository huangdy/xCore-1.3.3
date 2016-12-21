/*
 * An XML document type.
 * Localname: TopicSet
 * Namespace: http://docs.oasis-open.org/wsn/t-1
 * Java type: org.oasisOpen.docs.wsn.t1.TopicSetDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.t1.impl;
/**
 * A document containing one TopicSet(@http://docs.oasis-open.org/wsn/t-1) element.
 *
 * This is a complex type.
 */
public class TopicSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.t1.TopicSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopicSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPICSET$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/t-1", "TopicSet");
    
    
    /**
     * Gets the "TopicSet" element
     */
    public org.oasisOpen.docs.wsn.t1.TopicSetType getTopicSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicSetType target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicSetType)get_store().find_element_user(TOPICSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopicSet" element
     */
    public void setTopicSet(org.oasisOpen.docs.wsn.t1.TopicSetType topicSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicSetType target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicSetType)get_store().find_element_user(TOPICSET$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.t1.TopicSetType)get_store().add_element_user(TOPICSET$0);
            }
            target.set(topicSet);
        }
    }
    
    /**
     * Appends and returns a new empty "TopicSet" element
     */
    public org.oasisOpen.docs.wsn.t1.TopicSetType addNewTopicSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicSetType target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicSetType)get_store().add_element_user(TOPICSET$0);
            return target;
        }
    }
}
