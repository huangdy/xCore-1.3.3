/*
 * XML Type:  TopicType
 * Namespace: http://docs.oasis-open.org/wsn/t-1
 * Java type: org.oasisOpen.docs.wsn.t1.TopicType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.t1.impl;
/**
 * An XML TopicType(@http://docs.oasis-open.org/wsn/t-1).
 *
 * This is a complex type.
 */
public class TopicTypeImpl extends org.oasisOpen.docs.wsn.t1.impl.ExtensibleDocumentedImpl implements org.oasisOpen.docs.wsn.t1.TopicType
{
    private static final long serialVersionUID = 1L;
    
    public TopicTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEPATTERN$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/t-1", "MessagePattern");
    private static final javax.xml.namespace.QName TOPIC$2 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/t-1", "Topic");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName MESSAGETYPES$6 = 
        new javax.xml.namespace.QName("", "messageTypes");
    private static final javax.xml.namespace.QName FINAL$8 = 
        new javax.xml.namespace.QName("", "final");
    
    
    /**
     * Gets the "MessagePattern" element
     */
    public org.oasisOpen.docs.wsn.t1.QueryExpressionType getMessagePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.QueryExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.t1.QueryExpressionType)get_store().find_element_user(MESSAGEPATTERN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MessagePattern" element
     */
    public boolean isSetMessagePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEPATTERN$0) != 0;
        }
    }
    
    /**
     * Sets the "MessagePattern" element
     */
    public void setMessagePattern(org.oasisOpen.docs.wsn.t1.QueryExpressionType messagePattern)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.QueryExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.t1.QueryExpressionType)get_store().find_element_user(MESSAGEPATTERN$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.t1.QueryExpressionType)get_store().add_element_user(MESSAGEPATTERN$0);
            }
            target.set(messagePattern);
        }
    }
    
    /**
     * Appends and returns a new empty "MessagePattern" element
     */
    public org.oasisOpen.docs.wsn.t1.QueryExpressionType addNewMessagePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.QueryExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.t1.QueryExpressionType)get_store().add_element_user(MESSAGEPATTERN$0);
            return target;
        }
    }
    
    /**
     * Unsets the "MessagePattern" element
     */
    public void unsetMessagePattern()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEPATTERN$0, 0);
        }
    }
    
    /**
     * Gets array of all "Topic" elements
     */
    public org.oasisOpen.docs.wsn.t1.TopicType[] getTopicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TOPIC$2, targetList);
            org.oasisOpen.docs.wsn.t1.TopicType[] result = new org.oasisOpen.docs.wsn.t1.TopicType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Topic" element
     */
    public org.oasisOpen.docs.wsn.t1.TopicType getTopicArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicType target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicType)get_store().find_element_user(TOPIC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Topic" element
     */
    public int sizeOfTopicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOPIC$2);
        }
    }
    
    /**
     * Sets array of all "Topic" element
     */
    public void setTopicArray(org.oasisOpen.docs.wsn.t1.TopicType[] topicArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(topicArray, TOPIC$2);
        }
    }
    
    /**
     * Sets ith "Topic" element
     */
    public void setTopicArray(int i, org.oasisOpen.docs.wsn.t1.TopicType topic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicType target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicType)get_store().find_element_user(TOPIC$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(topic);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Topic" element
     */
    public org.oasisOpen.docs.wsn.t1.TopicType insertNewTopic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicType target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicType)get_store().insert_element_user(TOPIC$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Topic" element
     */
    public org.oasisOpen.docs.wsn.t1.TopicType addNewTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicType target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicType)get_store().add_element_user(TOPIC$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Topic" element
     */
    public void removeTopic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOPIC$2, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$4);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlNCName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "messageTypes" attribute
     */
    public java.util.List getMessageTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGETYPES$6);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "messageTypes" attribute
     */
    public org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes xgetMessageTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes)get_store().find_attribute_user(MESSAGETYPES$6);
            return target;
        }
    }
    
    /**
     * True if has "messageTypes" attribute
     */
    public boolean isSetMessageTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MESSAGETYPES$6) != null;
        }
    }
    
    /**
     * Sets the "messageTypes" attribute
     */
    public void setMessageTypes(java.util.List messageTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MESSAGETYPES$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MESSAGETYPES$6);
            }
            target.setListValue(messageTypes);
        }
    }
    
    /**
     * Sets (as xml) the "messageTypes" attribute
     */
    public void xsetMessageTypes(org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes messageTypes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes)get_store().find_attribute_user(MESSAGETYPES$6);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes)get_store().add_attribute_user(MESSAGETYPES$6);
            }
            target.set(messageTypes);
        }
    }
    
    /**
     * Unsets the "messageTypes" attribute
     */
    public void unsetMessageTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MESSAGETYPES$6);
        }
    }
    
    /**
     * Gets the "final" attribute
     */
    public boolean getFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FINAL$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "final" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FINAL$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "final" attribute
     */
    public boolean isSetFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FINAL$8) != null;
        }
    }
    
    /**
     * Sets the "final" attribute
     */
    public void setFinal(boolean xfinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINAL$8);
            }
            target.setBooleanValue(xfinal);
        }
    }
    
    /**
     * Sets (as xml) the "final" attribute
     */
    public void xsetFinal(org.apache.xmlbeans.XmlBoolean xfinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FINAL$8);
            }
            target.set(xfinal);
        }
    }
    
    /**
     * Unsets the "final" attribute
     */
    public void unsetFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FINAL$8);
        }
    }
    /**
     * An XML messageTypes(@).
     *
     * This is a list type whose items are org.apache.xmlbeans.XmlQName.
     */
    public static class MessageTypesImpl extends org.apache.xmlbeans.impl.values.XmlListImpl implements org.oasisOpen.docs.wsn.t1.TopicType.MessageTypes
    {
        private static final long serialVersionUID = 1L;
        
        public MessageTypesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MessageTypesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
