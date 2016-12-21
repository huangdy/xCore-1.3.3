/*
 * An XML document type.
 * Localname: WorkProductDeletedNotification
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.WorkProductDeletedNotificationDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService.impl;
/**
 * A document containing one WorkProductDeletedNotification(@http://uicds.org/NotificationService) element.
 *
 * This is a complex type.
 */
public class WorkProductDeletedNotificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.WorkProductDeletedNotificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkProductDeletedNotificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCTDELETEDNOTIFICATION$0 = 
        new javax.xml.namespace.QName("http://uicds.org/NotificationService", "WorkProductDeletedNotification");
    
    
    /**
     * Gets the "WorkProductDeletedNotification" element
     */
    public org.uicds.notificationService.WorkProductDeletedNotificationType getWorkProductDeletedNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.WorkProductDeletedNotificationType target = null;
            target = (org.uicds.notificationService.WorkProductDeletedNotificationType)get_store().find_element_user(WORKPRODUCTDELETEDNOTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductDeletedNotification" element
     */
    public void setWorkProductDeletedNotification(org.uicds.notificationService.WorkProductDeletedNotificationType workProductDeletedNotification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.WorkProductDeletedNotificationType target = null;
            target = (org.uicds.notificationService.WorkProductDeletedNotificationType)get_store().find_element_user(WORKPRODUCTDELETEDNOTIFICATION$0, 0);
            if (target == null)
            {
                target = (org.uicds.notificationService.WorkProductDeletedNotificationType)get_store().add_element_user(WORKPRODUCTDELETEDNOTIFICATION$0);
            }
            target.set(workProductDeletedNotification);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductDeletedNotification" element
     */
    public org.uicds.notificationService.WorkProductDeletedNotificationType addNewWorkProductDeletedNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.WorkProductDeletedNotificationType target = null;
            target = (org.uicds.notificationService.WorkProductDeletedNotificationType)get_store().add_element_user(WORKPRODUCTDELETEDNOTIFICATION$0);
            return target;
        }
    }
}
