/*
 * An XML document type.
 * Localname: GetCurrentMessage
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one GetCurrentMessage(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class GetCurrentMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCurrentMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCURRENTMESSAGE$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "GetCurrentMessage");
    
    
    /**
     * Gets the "GetCurrentMessage" element
     */
    public org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument.GetCurrentMessage getGetCurrentMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument.GetCurrentMessage target = null;
            target = (org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument.GetCurrentMessage)get_store().find_element_user(GETCURRENTMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCurrentMessage" element
     */
    public void setGetCurrentMessage(org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument.GetCurrentMessage getCurrentMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument.GetCurrentMessage target = null;
            target = (org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument.GetCurrentMessage)get_store().find_element_user(GETCURRENTMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument.GetCurrentMessage)get_store().add_element_user(GETCURRENTMESSAGE$0);
            }
            target.set(getCurrentMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCurrentMessage" element
     */
    public org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument.GetCurrentMessage addNewGetCurrentMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument.GetCurrentMessage target = null;
            target = (org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument.GetCurrentMessage)get_store().add_element_user(GETCURRENTMESSAGE$0);
            return target;
        }
    }
    /**
     * An XML GetCurrentMessage(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public static class GetCurrentMessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.GetCurrentMessageDocument.GetCurrentMessage
    {
        private static final long serialVersionUID = 1L;
        
        public GetCurrentMessageImpl(org.apache.xmlbeans.SchemaType sType)
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
}
