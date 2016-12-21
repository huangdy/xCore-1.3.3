/*
 * XML Type:  WorkProductDeletedNotificationType
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.WorkProductDeletedNotificationType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService.impl;
/**
 * An XML WorkProductDeletedNotificationType(@http://uicds.org/NotificationService).
 *
 * This is a complex type.
 */
public class WorkProductDeletedNotificationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.WorkProductDeletedNotificationType
{
    private static final long serialVersionUID = 1L;
    
    public WorkProductDeletedNotificationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCTIDENTIFICATION$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification");
    private static final javax.xml.namespace.QName WORKPRODUCTPROPERTIES$2 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductProperties");
    
    
    /**
     * Gets the "WorkProductIdentification" element
     */
    public com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductIdentification" element
     */
    public void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().find_element_user(WORKPRODUCTIDENTIFICATION$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
            }
            target.set(workProductIdentification);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductIdentification" element
     */
    public com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.IdentificationType target = null;
            target = (com.saic.precis.x2009.x06.base.IdentificationType)get_store().add_element_user(WORKPRODUCTIDENTIFICATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "WorkProductProperties" element
     */
    public com.saic.precis.x2009.x06.base.PropertiesType getWorkProductProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.PropertiesType target = null;
            target = (com.saic.precis.x2009.x06.base.PropertiesType)get_store().find_element_user(WORKPRODUCTPROPERTIES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "WorkProductProperties" element
     */
    public void setWorkProductProperties(com.saic.precis.x2009.x06.base.PropertiesType workProductProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.PropertiesType target = null;
            target = (com.saic.precis.x2009.x06.base.PropertiesType)get_store().find_element_user(WORKPRODUCTPROPERTIES$2, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.PropertiesType)get_store().add_element_user(WORKPRODUCTPROPERTIES$2);
            }
            target.set(workProductProperties);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductProperties" element
     */
    public com.saic.precis.x2009.x06.base.PropertiesType addNewWorkProductProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.PropertiesType target = null;
            target = (com.saic.precis.x2009.x06.base.PropertiesType)get_store().add_element_user(WORKPRODUCTPROPERTIES$2);
            return target;
        }
    }
}
