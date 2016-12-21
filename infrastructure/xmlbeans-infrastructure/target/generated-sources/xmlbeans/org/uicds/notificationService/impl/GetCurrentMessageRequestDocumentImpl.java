/*
 * An XML document type.
 * Localname: GetCurrentMessageRequest
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.GetCurrentMessageRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService.impl;
/**
 * A document containing one GetCurrentMessageRequest(@http://uicds.org/NotificationService) element.
 *
 * This is a complex type.
 */
public class GetCurrentMessageRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.GetCurrentMessageRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCurrentMessageRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCURRENTMESSAGEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/NotificationService", "GetCurrentMessageRequest");
    
    
    /**
     * Gets the "GetCurrentMessageRequest" element
     */
    public org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest getGetCurrentMessageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest target = null;
            target = (org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest)get_store().find_element_user(GETCURRENTMESSAGEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCurrentMessageRequest" element
     */
    public void setGetCurrentMessageRequest(org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest getCurrentMessageRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest target = null;
            target = (org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest)get_store().find_element_user(GETCURRENTMESSAGEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest)get_store().add_element_user(GETCURRENTMESSAGEREQUEST$0);
            }
            target.set(getCurrentMessageRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCurrentMessageRequest" element
     */
    public org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest addNewGetCurrentMessageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest target = null;
            target = (org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest)get_store().add_element_user(GETCURRENTMESSAGEREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetCurrentMessageRequest(@http://uicds.org/NotificationService).
     *
     * This is a complex type.
     */
    public static class GetCurrentMessageRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetCurrentMessageRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TOPIC$0 = 
            new javax.xml.namespace.QName("http://uicds.org/NotificationService", "Topic");
        
        
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
