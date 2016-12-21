/*
 * An XML document type.
 * Localname: GetCurrentMessageResponse
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.GetCurrentMessageResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService.impl;
/**
 * A document containing one GetCurrentMessageResponse(@http://uicds.org/NotificationService) element.
 *
 * This is a complex type.
 */
public class GetCurrentMessageResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.GetCurrentMessageResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCurrentMessageResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCURRENTMESSAGERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/NotificationService", "GetCurrentMessageResponse");
    
    
    /**
     * Gets the "GetCurrentMessageResponse" element
     */
    public org.uicds.notificationService.GetCurrentMessageResponseDocument.GetCurrentMessageResponse getGetCurrentMessageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetCurrentMessageResponseDocument.GetCurrentMessageResponse target = null;
            target = (org.uicds.notificationService.GetCurrentMessageResponseDocument.GetCurrentMessageResponse)get_store().find_element_user(GETCURRENTMESSAGERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCurrentMessageResponse" element
     */
    public void setGetCurrentMessageResponse(org.uicds.notificationService.GetCurrentMessageResponseDocument.GetCurrentMessageResponse getCurrentMessageResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetCurrentMessageResponseDocument.GetCurrentMessageResponse target = null;
            target = (org.uicds.notificationService.GetCurrentMessageResponseDocument.GetCurrentMessageResponse)get_store().find_element_user(GETCURRENTMESSAGERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.notificationService.GetCurrentMessageResponseDocument.GetCurrentMessageResponse)get_store().add_element_user(GETCURRENTMESSAGERESPONSE$0);
            }
            target.set(getCurrentMessageResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCurrentMessageResponse" element
     */
    public org.uicds.notificationService.GetCurrentMessageResponseDocument.GetCurrentMessageResponse addNewGetCurrentMessageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetCurrentMessageResponseDocument.GetCurrentMessageResponse target = null;
            target = (org.uicds.notificationService.GetCurrentMessageResponseDocument.GetCurrentMessageResponse)get_store().add_element_user(GETCURRENTMESSAGERESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetCurrentMessageResponse(@http://uicds.org/NotificationService).
     *
     * This is a complex type.
     */
    public static class GetCurrentMessageResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.GetCurrentMessageResponseDocument.GetCurrentMessageResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetCurrentMessageResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
