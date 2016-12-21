/*
 * XML Type:  TopicNamespaceType
 * Namespace: http://docs.oasis-open.org/wsn/t-1
 * Java type: org.oasisOpen.docs.wsn.t1.TopicNamespaceType
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.t1.impl;
/**
 * An XML TopicNamespaceType(@http://docs.oasis-open.org/wsn/t-1).
 *
 * This is a complex type.
 */
public class TopicNamespaceTypeImpl extends org.oasisOpen.docs.wsn.t1.impl.ExtensibleDocumentedImpl implements org.oasisOpen.docs.wsn.t1.TopicNamespaceType
{
    private static final long serialVersionUID = 1L;
    
    public TopicNamespaceTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPIC$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/t-1", "Topic");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName TARGETNAMESPACE$4 = 
        new javax.xml.namespace.QName("", "targetNamespace");
    private static final javax.xml.namespace.QName FINAL$6 = 
        new javax.xml.namespace.QName("", "final");
    
    
    /**
     * Gets array of all "Topic" elements
     */
    public org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic[] getTopicArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TOPIC$0, targetList);
            org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic[] result = new org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Topic" element
     */
    public org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic getTopicArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic)get_store().find_element_user(TOPIC$0, i);
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
            return get_store().count_elements(TOPIC$0);
        }
    }
    
    /**
     * Sets array of all "Topic" element
     */
    public void setTopicArray(org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic[] topicArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(topicArray, TOPIC$0);
        }
    }
    
    /**
     * Sets ith "Topic" element
     */
    public void setTopicArray(int i, org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic topic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic)get_store().find_element_user(TOPIC$0, i);
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
    public org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic insertNewTopic(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic)get_store().insert_element_user(TOPIC$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Topic" element
     */
    public org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic addNewTopic()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic target = null;
            target = (org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic)get_store().add_element_user(TOPIC$0);
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
            get_store().remove_element(TOPIC$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$2);
        }
    }
    
    /**
     * Gets the "targetNamespace" attribute
     */
    public java.lang.String getTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetNamespace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$4);
            return target;
        }
    }
    
    /**
     * Sets the "targetNamespace" attribute
     */
    public void setTargetNamespace(java.lang.String targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETNAMESPACE$4);
            }
            target.setStringValue(targetNamespace);
        }
    }
    
    /**
     * Sets (as xml) the "targetNamespace" attribute
     */
    public void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TARGETNAMESPACE$4);
            }
            target.set(targetNamespace);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FINAL$6);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(FINAL$6);
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
            return get_store().find_attribute_user(FINAL$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FINAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FINAL$6);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(FINAL$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(FINAL$6);
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
            get_store().remove_attribute(FINAL$6);
        }
    }
    /**
     * An XML Topic(@http://docs.oasis-open.org/wsn/t-1).
     *
     * This is a complex type.
     */
    public static class TopicImpl extends org.oasisOpen.docs.wsn.t1.impl.TopicTypeImpl implements org.oasisOpen.docs.wsn.t1.TopicNamespaceType.Topic
    {
        private static final long serialVersionUID = 1L;
        
        public TopicImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName PARENT$0 = 
            new javax.xml.namespace.QName("", "parent");
        
        
        /**
         * Gets the "parent" attribute
         */
        public java.lang.String getParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "parent" attribute
         */
        public org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression xgetParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression target = null;
                target = (org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression)get_store().find_attribute_user(PARENT$0);
                return target;
            }
        }
        
        /**
         * True if has "parent" attribute
         */
        public boolean isSetParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(PARENT$0) != null;
            }
        }
        
        /**
         * Sets the "parent" attribute
         */
        public void setParent(java.lang.String parent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARENT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARENT$0);
                }
                target.setStringValue(parent);
            }
        }
        
        /**
         * Sets (as xml) the "parent" attribute
         */
        public void xsetParent(org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression parent)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression target = null;
                target = (org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression)get_store().find_attribute_user(PARENT$0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsn.t1.ConcreteTopicExpression)get_store().add_attribute_user(PARENT$0);
                }
                target.set(parent);
            }
        }
        
        /**
         * Unsets the "parent" attribute
         */
        public void unsetParent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(PARENT$0);
            }
        }
    }
}
