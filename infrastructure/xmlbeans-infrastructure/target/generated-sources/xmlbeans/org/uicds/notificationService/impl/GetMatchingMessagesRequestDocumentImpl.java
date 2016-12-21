/*
 * An XML document type.
 * Localname: GetMatchingMessagesRequest
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.GetMatchingMessagesRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService.impl;
/**
 * A document containing one GetMatchingMessagesRequest(@http://uicds.org/NotificationService) element.
 *
 * This is a complex type.
 */
public class GetMatchingMessagesRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.GetMatchingMessagesRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMatchingMessagesRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMATCHINGMESSAGESREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/NotificationService", "GetMatchingMessagesRequest");
    
    
    /**
     * Gets the "GetMatchingMessagesRequest" element
     */
    public org.uicds.notificationService.GetMatchingMessagesRequestDocument.GetMatchingMessagesRequest getGetMatchingMessagesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetMatchingMessagesRequestDocument.GetMatchingMessagesRequest target = null;
            target = (org.uicds.notificationService.GetMatchingMessagesRequestDocument.GetMatchingMessagesRequest)get_store().find_element_user(GETMATCHINGMESSAGESREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMatchingMessagesRequest" element
     */
    public void setGetMatchingMessagesRequest(org.uicds.notificationService.GetMatchingMessagesRequestDocument.GetMatchingMessagesRequest getMatchingMessagesRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetMatchingMessagesRequestDocument.GetMatchingMessagesRequest target = null;
            target = (org.uicds.notificationService.GetMatchingMessagesRequestDocument.GetMatchingMessagesRequest)get_store().find_element_user(GETMATCHINGMESSAGESREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.notificationService.GetMatchingMessagesRequestDocument.GetMatchingMessagesRequest)get_store().add_element_user(GETMATCHINGMESSAGESREQUEST$0);
            }
            target.set(getMatchingMessagesRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMatchingMessagesRequest" element
     */
    public org.uicds.notificationService.GetMatchingMessagesRequestDocument.GetMatchingMessagesRequest addNewGetMatchingMessagesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetMatchingMessagesRequestDocument.GetMatchingMessagesRequest target = null;
            target = (org.uicds.notificationService.GetMatchingMessagesRequestDocument.GetMatchingMessagesRequest)get_store().add_element_user(GETMATCHINGMESSAGESREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetMatchingMessagesRequest(@http://uicds.org/NotificationService).
     *
     * This is a complex type.
     */
    public static class GetMatchingMessagesRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.GetMatchingMessagesRequestDocument.GetMatchingMessagesRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetMatchingMessagesRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("http://uicds.org/NotificationService", "ID");
        
        
        /**
         * Gets the "ID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType getID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "ID" element
         */
        public void setID(com.saic.precis.x2009.x06.base.IdentifierType id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().find_element_user(ID$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(ID$0);
                }
                target.set(id);
            }
        }
        
        /**
         * Appends and returns a new empty "ID" element
         */
        public com.saic.precis.x2009.x06.base.IdentifierType addNewID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentifierType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentifierType)get_store().add_element_user(ID$0);
                return target;
            }
        }
    }
}
