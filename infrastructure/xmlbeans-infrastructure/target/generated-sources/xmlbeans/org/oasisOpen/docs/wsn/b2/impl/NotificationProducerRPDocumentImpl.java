/*
 * An XML document type.
 * Localname: NotificationProducerRP
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one NotificationProducerRP(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class NotificationProducerRPDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument
{
    private static final long serialVersionUID = 1L;
    
    public NotificationProducerRPDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOTIFICATIONPRODUCERRP$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "NotificationProducerRP");
    
    
    /**
     * Gets the "NotificationProducerRP" element
     */
    public org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP getNotificationProducerRP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP)get_store().find_element_user(NOTIFICATIONPRODUCERRP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "NotificationProducerRP" element
     */
    public void setNotificationProducerRP(org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP notificationProducerRP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP)get_store().find_element_user(NOTIFICATIONPRODUCERRP$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP)get_store().add_element_user(NOTIFICATIONPRODUCERRP$0);
            }
            target.set(notificationProducerRP);
        }
    }
    
    /**
     * Appends and returns a new empty "NotificationProducerRP" element
     */
    public org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP addNewNotificationProducerRP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP target = null;
            target = (org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP)get_store().add_element_user(NOTIFICATIONPRODUCERRP$0);
            return target;
        }
    }
    /**
     * An XML NotificationProducerRP(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class NotificationProducerRPImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.NotificationProducerRPDocument.NotificationProducerRP
    {
        private static final long serialVersionUID = 1L;
        
        public NotificationProducerRPImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TOPICEXPRESSION$0 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpression");
        private static final javax.xml.namespace.QName FIXEDTOPICSET$2 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "FixedTopicSet");
        private static final javax.xml.namespace.QName TOPICEXPRESSIONDIALECT$4 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpressionDialect");
        private static final javax.xml.namespace.QName TOPICSET$6 = 
            new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/t-1", "TopicSet");
        
        
        /**
         * Gets array of all "TopicExpression" elements
         */
        public org.oasisOpen.docs.wsn.b2.TopicExpressionType[] getTopicExpressionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TOPICEXPRESSION$0, targetList);
                org.oasisOpen.docs.wsn.b2.TopicExpressionType[] result = new org.oasisOpen.docs.wsn.b2.TopicExpressionType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TopicExpression" element
         */
        public org.oasisOpen.docs.wsn.b2.TopicExpressionType getTopicExpressionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.TopicExpressionType target = null;
                target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().find_element_user(TOPICEXPRESSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TopicExpression" element
         */
        public int sizeOfTopicExpressionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TOPICEXPRESSION$0);
            }
        }
        
        /**
         * Sets array of all "TopicExpression" element
         */
        public void setTopicExpressionArray(org.oasisOpen.docs.wsn.b2.TopicExpressionType[] topicExpressionArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(topicExpressionArray, TOPICEXPRESSION$0);
            }
        }
        
        /**
         * Sets ith "TopicExpression" element
         */
        public void setTopicExpressionArray(int i, org.oasisOpen.docs.wsn.b2.TopicExpressionType topicExpression)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.TopicExpressionType target = null;
                target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().find_element_user(TOPICEXPRESSION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(topicExpression);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TopicExpression" element
         */
        public org.oasisOpen.docs.wsn.b2.TopicExpressionType insertNewTopicExpression(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.b2.TopicExpressionType target = null;
                target = (org.oasisOpen.docs.wsn.b2.TopicExpressionType)get_store().insert_element_user(TOPICEXPRESSION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TopicExpression" element
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
        
        /**
         * Removes the ith "TopicExpression" element
         */
        public void removeTopicExpression(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TOPICEXPRESSION$0, i);
            }
        }
        
        /**
         * Gets the "FixedTopicSet" element
         */
        public boolean getFixedTopicSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIXEDTOPICSET$2, 0);
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "FixedTopicSet" element
         */
        public org.apache.xmlbeans.XmlBoolean xgetFixedTopicSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FIXEDTOPICSET$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "FixedTopicSet" element
         */
        public boolean isSetFixedTopicSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIXEDTOPICSET$2) != 0;
            }
        }
        
        /**
         * Sets the "FixedTopicSet" element
         */
        public void setFixedTopicSet(boolean fixedTopicSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FIXEDTOPICSET$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FIXEDTOPICSET$2);
                }
                target.setBooleanValue(fixedTopicSet);
            }
        }
        
        /**
         * Sets (as xml) the "FixedTopicSet" element
         */
        public void xsetFixedTopicSet(org.apache.xmlbeans.XmlBoolean fixedTopicSet)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlBoolean target = null;
                target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(FIXEDTOPICSET$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(FIXEDTOPICSET$2);
                }
                target.set(fixedTopicSet);
            }
        }
        
        /**
         * Unsets the "FixedTopicSet" element
         */
        public void unsetFixedTopicSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIXEDTOPICSET$2, 0);
            }
        }
        
        /**
         * Gets array of all "TopicExpressionDialect" elements
         */
        public java.lang.String[] getTopicExpressionDialectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TOPICEXPRESSIONDIALECT$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "TopicExpressionDialect" element
         */
        public java.lang.String getTopicExpressionDialectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPICEXPRESSIONDIALECT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "TopicExpressionDialect" elements
         */
        public org.apache.xmlbeans.XmlAnyURI[] xgetTopicExpressionDialectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TOPICEXPRESSIONDIALECT$4, targetList);
                org.apache.xmlbeans.XmlAnyURI[] result = new org.apache.xmlbeans.XmlAnyURI[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "TopicExpressionDialect" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetTopicExpressionDialectArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TOPICEXPRESSIONDIALECT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlAnyURI)target;
            }
        }
        
        /**
         * Returns number of "TopicExpressionDialect" element
         */
        public int sizeOfTopicExpressionDialectArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TOPICEXPRESSIONDIALECT$4);
            }
        }
        
        /**
         * Sets array of all "TopicExpressionDialect" element
         */
        public void setTopicExpressionDialectArray(java.lang.String[] topicExpressionDialectArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(topicExpressionDialectArray, TOPICEXPRESSIONDIALECT$4);
            }
        }
        
        /**
         * Sets ith "TopicExpressionDialect" element
         */
        public void setTopicExpressionDialectArray(int i, java.lang.String topicExpressionDialect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPICEXPRESSIONDIALECT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(topicExpressionDialect);
            }
        }
        
        /**
         * Sets (as xml) array of all "TopicExpressionDialect" element
         */
        public void xsetTopicExpressionDialectArray(org.apache.xmlbeans.XmlAnyURI[]topicExpressionDialectArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(topicExpressionDialectArray, TOPICEXPRESSIONDIALECT$4);
            }
        }
        
        /**
         * Sets (as xml) ith "TopicExpressionDialect" element
         */
        public void xsetTopicExpressionDialectArray(int i, org.apache.xmlbeans.XmlAnyURI topicExpressionDialect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(TOPICEXPRESSIONDIALECT$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(topicExpressionDialect);
            }
        }
        
        /**
         * Inserts the value as the ith "TopicExpressionDialect" element
         */
        public void insertTopicExpressionDialect(int i, java.lang.String topicExpressionDialect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TOPICEXPRESSIONDIALECT$4, i);
                target.setStringValue(topicExpressionDialect);
            }
        }
        
        /**
         * Appends the value as the last "TopicExpressionDialect" element
         */
        public void addTopicExpressionDialect(java.lang.String topicExpressionDialect)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOPICEXPRESSIONDIALECT$4);
                target.setStringValue(topicExpressionDialect);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TopicExpressionDialect" element
         */
        public org.apache.xmlbeans.XmlAnyURI insertNewTopicExpressionDialect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(TOPICEXPRESSIONDIALECT$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TopicExpressionDialect" element
         */
        public org.apache.xmlbeans.XmlAnyURI addNewTopicExpressionDialect()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(TOPICEXPRESSIONDIALECT$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "TopicExpressionDialect" element
         */
        public void removeTopicExpressionDialect(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TOPICEXPRESSIONDIALECT$4, i);
            }
        }
        
        /**
         * Gets the "TopicSet" element
         */
        public org.oasisOpen.docs.wsn.t1.TopicSetType getTopicSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.oasisOpen.docs.wsn.t1.TopicSetType target = null;
                target = (org.oasisOpen.docs.wsn.t1.TopicSetType)get_store().find_element_user(TOPICSET$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "TopicSet" element
         */
        public boolean isSetTopicSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TOPICSET$6) != 0;
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
                target = (org.oasisOpen.docs.wsn.t1.TopicSetType)get_store().find_element_user(TOPICSET$6, 0);
                if (target == null)
                {
                    target = (org.oasisOpen.docs.wsn.t1.TopicSetType)get_store().add_element_user(TOPICSET$6);
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
                target = (org.oasisOpen.docs.wsn.t1.TopicSetType)get_store().add_element_user(TOPICSET$6);
                return target;
            }
        }
        
        /**
         * Unsets the "TopicSet" element
         */
        public void unsetTopicSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TOPICSET$6, 0);
            }
        }
    }
}
