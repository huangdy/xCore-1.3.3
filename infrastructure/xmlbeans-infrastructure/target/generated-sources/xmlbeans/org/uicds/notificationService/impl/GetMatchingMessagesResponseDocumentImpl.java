/*
 * An XML document type.
 * Localname: GetMatchingMessagesResponse
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.GetMatchingMessagesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService.impl;
/**
 * A document containing one GetMatchingMessagesResponse(@http://uicds.org/NotificationService) element.
 *
 * This is a complex type.
 */
public class GetMatchingMessagesResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.GetMatchingMessagesResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMatchingMessagesResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMATCHINGMESSAGESRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/NotificationService", "GetMatchingMessagesResponse");
    
    
    /**
     * Gets the "GetMatchingMessagesResponse" element
     */
    public org.uicds.notificationService.GetMatchingMessagesResponseDocument.GetMatchingMessagesResponse getGetMatchingMessagesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetMatchingMessagesResponseDocument.GetMatchingMessagesResponse target = null;
            target = (org.uicds.notificationService.GetMatchingMessagesResponseDocument.GetMatchingMessagesResponse)get_store().find_element_user(GETMATCHINGMESSAGESRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetMatchingMessagesResponse" element
     */
    public void setGetMatchingMessagesResponse(org.uicds.notificationService.GetMatchingMessagesResponseDocument.GetMatchingMessagesResponse getMatchingMessagesResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetMatchingMessagesResponseDocument.GetMatchingMessagesResponse target = null;
            target = (org.uicds.notificationService.GetMatchingMessagesResponseDocument.GetMatchingMessagesResponse)get_store().find_element_user(GETMATCHINGMESSAGESRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.notificationService.GetMatchingMessagesResponseDocument.GetMatchingMessagesResponse)get_store().add_element_user(GETMATCHINGMESSAGESRESPONSE$0);
            }
            target.set(getMatchingMessagesResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetMatchingMessagesResponse" element
     */
    public org.uicds.notificationService.GetMatchingMessagesResponseDocument.GetMatchingMessagesResponse addNewGetMatchingMessagesResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.GetMatchingMessagesResponseDocument.GetMatchingMessagesResponse target = null;
            target = (org.uicds.notificationService.GetMatchingMessagesResponseDocument.GetMatchingMessagesResponse)get_store().add_element_user(GETMATCHINGMESSAGESRESPONSE$0);
            return target;
        }
    }
    /**
     * An XML GetMatchingMessagesResponse(@http://uicds.org/NotificationService).
     *
     * This is a complex type.
     */
    public static class GetMatchingMessagesResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.GetMatchingMessagesResponseDocument.GetMatchingMessagesResponse
    {
        private static final long serialVersionUID = 1L;
        
        public GetMatchingMessagesResponseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATIONLIST$0 = 
            new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentificationList");
        
        
        /**
         * Gets the "WorkProductIdentificationList" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationListType getWorkProductIdentificationList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationListType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationListType)get_store().find_element_user(WORKPRODUCTIDENTIFICATIONLIST$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "WorkProductIdentificationList" element
         */
        public void setWorkProductIdentificationList(com.saic.precis.x2009.x06.base.IdentificationListType workProductIdentificationList)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationListType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationListType)get_store().find_element_user(WORKPRODUCTIDENTIFICATIONLIST$0, 0);
                if (target == null)
                {
                    target = (com.saic.precis.x2009.x06.base.IdentificationListType)get_store().add_element_user(WORKPRODUCTIDENTIFICATIONLIST$0);
                }
                target.set(workProductIdentificationList);
            }
        }
        
        /**
         * Appends and returns a new empty "WorkProductIdentificationList" element
         */
        public com.saic.precis.x2009.x06.base.IdentificationListType addNewWorkProductIdentificationList()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.saic.precis.x2009.x06.base.IdentificationListType target = null;
                target = (com.saic.precis.x2009.x06.base.IdentificationListType)get_store().add_element_user(WORKPRODUCTIDENTIFICATIONLIST$0);
                return target;
            }
        }
    }
}
