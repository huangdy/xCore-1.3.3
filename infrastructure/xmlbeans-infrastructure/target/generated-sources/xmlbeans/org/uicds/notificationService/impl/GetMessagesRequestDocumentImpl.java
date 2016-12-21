/*
 * An XML document type.
 * Localname: GetMessagesRequest
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.GetMessagesRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService.impl;
/**
 * A document containing one GetMessagesRequest(@http://uicds.org/NotificationService) element.
 *
 * This is a complex type.
 */
public class GetMessagesRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.GetMessagesRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMessagesRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMESSAGESREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/NotificationService", "GetMessagesRequest");
    
    
    /**
     * Gets the "GetMessagesRequest" element
     */
    public org.uicds.notificationService.GetMessagesRequestDocument.GetMessagesRequest getGetMessagesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetMessagesRequestDocument.GetMessagesRequest target = null;
            target = (org.uicds.notificationService.GetMessagesRequestDocument.GetMessagesRequest)get_store().find_element_user(GETMESSAGESREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMessagesRequest" element
     */
    public void setGetMessagesRequest(org.uicds.notificationService.GetMessagesRequestDocument.GetMessagesRequest getMessagesRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetMessagesRequestDocument.GetMessagesRequest target = null;
            target = (org.uicds.notificationService.GetMessagesRequestDocument.GetMessagesRequest)get_store().find_element_user(GETMESSAGESREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.notificationService.GetMessagesRequestDocument.GetMessagesRequest)get_store().add_element_user(GETMESSAGESREQUEST$0);
            }
            target.set(getMessagesRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMessagesRequest" element
     */
    public org.uicds.notificationService.GetMessagesRequestDocument.GetMessagesRequest addNewGetMessagesRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetMessagesRequestDocument.GetMessagesRequest target = null;
            target = (org.uicds.notificationService.GetMessagesRequestDocument.GetMessagesRequest)get_store().add_element_user(GETMESSAGESREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetMessagesRequest(@http://uicds.org/NotificationService).
     *
     * This is a complex type.
     */
    public static class GetMessagesRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.GetMessagesRequestDocument.GetMessagesRequest
    {
        private static final long serialVersionUID = 1L;
        
        public GetMessagesRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MAXIMUMNUMBER$0 = 
            new javax.xml.namespace.QName("http://uicds.org/NotificationService", "MaximumNumber");
        
        
        /**
         * Gets the "MaximumNumber" element
         */
        public java.math.BigInteger getMaximumNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMNUMBER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "MaximumNumber" element
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetMaximumNumber()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MAXIMUMNUMBER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "MaximumNumber" element
         */
        public void setMaximumNumber(java.math.BigInteger maximumNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAXIMUMNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAXIMUMNUMBER$0);
                }
                target.setBigIntegerValue(maximumNumber);
            }
        }
        
        /**
         * Sets (as xml) the "MaximumNumber" element
         */
        public void xsetMaximumNumber(org.apache.xmlbeans.XmlNonNegativeInteger maximumNumber)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MAXIMUMNUMBER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(MAXIMUMNUMBER$0);
                }
                target.set(maximumNumber);
            }
        }
    }
}
