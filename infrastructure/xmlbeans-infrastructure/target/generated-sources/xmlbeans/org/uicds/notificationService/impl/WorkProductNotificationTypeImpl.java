/*
 * XML Type:  WorkProductNotificationType
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.WorkProductNotificationType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService.impl;
/**
 * An XML WorkProductNotificationType(@http://uicds.org/NotificationService).
 *
 * This is a complex type.
 */
public class WorkProductNotificationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.notificationService.WorkProductNotificationType
{
    private static final long serialVersionUID = 1L;
    
    public WorkProductNotificationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WORKPRODUCTPROCESSINGSTATUS$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductProcessingStatus");
    private static final javax.xml.namespace.QName WORKPRODUCT$2 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProduct");
    
    
    /**
     * Gets the "WorkProductProcessingStatus" element
     */
    public com.saic.precis.x2009.x06.base.ProcessingStatusType getWorkProductProcessingStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ProcessingStatusType target = null;
            target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().find_element_user(WORKPRODUCTPROCESSINGSTATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "WorkProductProcessingStatus" element
     */
    public boolean isSetWorkProductProcessingStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKPRODUCTPROCESSINGSTATUS$0) != 0;
        }
    }
    
    /**
     * Sets the "WorkProductProcessingStatus" element
     */
    public void setWorkProductProcessingStatus(com.saic.precis.x2009.x06.base.ProcessingStatusType workProductProcessingStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ProcessingStatusType target = null;
            target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().find_element_user(WORKPRODUCTPROCESSINGSTATUS$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().add_element_user(WORKPRODUCTPROCESSINGSTATUS$0);
            }
            target.set(workProductProcessingStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProductProcessingStatus" element
     */
    public com.saic.precis.x2009.x06.base.ProcessingStatusType addNewWorkProductProcessingStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.ProcessingStatusType target = null;
            target = (com.saic.precis.x2009.x06.base.ProcessingStatusType)get_store().add_element_user(WORKPRODUCTPROCESSINGSTATUS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "WorkProductProcessingStatus" element
     */
    public void unsetWorkProductProcessingStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKPRODUCTPROCESSINGSTATUS$0, 0);
        }
    }
    
    /**
     * Gets the "WorkProduct" element
     */
    public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct getWorkProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
            target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "WorkProduct" element
     */
    public boolean isSetWorkProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WORKPRODUCT$2) != 0;
        }
    }
    
    /**
     * Sets the "WorkProduct" element
     */
    public void setWorkProduct(com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
            target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().find_element_user(WORKPRODUCT$2, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$2);
            }
            target.set(workProduct);
        }
    }
    
    /**
     * Appends and returns a new empty "WorkProduct" element
     */
    public com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct addNewWorkProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct target = null;
            target = (com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct)get_store().add_element_user(WORKPRODUCT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "WorkProduct" element
     */
    public void unsetWorkProduct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WORKPRODUCT$2, 0);
        }
    }
}
