/*
 * An XML attribute type.
 * Localname: topic
 * Namespace: http://docs.oasis-open.org/wsn/t-1
 * Java type: org.oasisOpen.docs.wsn.t1.TopicAttribute
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.t1.impl;
/**
 * A document containing one topic(@http://docs.oasis-open.org/wsn/t-1) attribute.
 *
 * This is a complex type.
 */
public class TopicAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.t1.TopicAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TopicAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPIC$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/t-1", "topic");
    
    
    /**
     * Gets the "topic" attribute
     */
    public boolean getTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPIC$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TOPIC$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "topic" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TOPIC$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(TOPIC$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "topic" attribute
     */
    public boolean isSetTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TOPIC$0) != null;
        }
    }
    
    /**
     * Sets the "topic" attribute
     */
    public void setTopic(boolean topic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TOPIC$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TOPIC$0);
            }
            target.setBooleanValue(topic);
        }
    }
    
    /**
     * Sets (as xml) the "topic" attribute
     */
    public void xsetTopic(org.apache.xmlbeans.XmlBoolean topic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(TOPIC$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(TOPIC$0);
            }
            target.set(topic);
        }
    }
    
    /**
     * Unsets the "topic" attribute
     */
    public void unsetTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TOPIC$0);
        }
    }
}
