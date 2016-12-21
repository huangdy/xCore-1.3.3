/*
 * An XML document type.
 * Localname: WorkProductNotification
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.WorkProductNotificationDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService.impl;
/**
 * A document containing one WorkProductNotification(@http://uicds.org/NotificationService) element.
 *
 * This is a complex type.
 */
public class WorkProductNotificationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.WorkProductNotificationDocument
{
    private static final long serialVersionUID = 1L;
    
    public WorkProductNotificationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCTNOTIFICATION$0 = 
        new javax.xml.namespace.QName("http://uicds.org/NotificationService", "WorkProductNotification");
    
    
    /**
     * Gets the "WorkProductNotification" element
     */
    public org.uicds.notificationService.WorkProductNotificationType getWorkProductNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.WorkProductNotificationType target = null;
            target = (org.uicds.notificationService.WorkProductNotificationType)get_store().find_element_user(WORKPRODUCTNOTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductNotification" element
     */
    public void setWorkProductNotification(org.uicds.notificationService.WorkProductNotificationType workProductNotification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.WorkProductNotificationType target = null;
            target = (org.uicds.notificationService.WorkProductNotificationType)get_store().find_element_user(WORKPRODUCTNOTIFICATION$0, 0);
            if (target == null)
            {
                target = (org.uicds.notificationService.WorkProductNotificationType)get_store().add_element_user(WORKPRODUCTNOTIFICATION$0);
            }
            target.set(workProductNotification);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductNotification" element
     */
    public org.uicds.notificationService.WorkProductNotificationType addNewWorkProductNotification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.notificationService.WorkProductNotificationType target = null;
            target = (org.uicds.notificationService.WorkProductNotificationType)get_store().add_element_user(WORKPRODUCTNOTIFICATION$0);
            return target;
        }
    }
}
