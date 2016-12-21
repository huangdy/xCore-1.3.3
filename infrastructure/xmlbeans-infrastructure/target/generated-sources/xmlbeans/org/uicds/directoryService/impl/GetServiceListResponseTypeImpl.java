/*
 * XML Type:  GetServiceListResponseType
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetServiceListResponseType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * An XML GetServiceListResponseType(@http://uicds.org/DirectoryService).
 *
 * This is a complex type.
 */
public class GetServiceListResponseTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetServiceListResponseType
{
    private static final long serialVersionUID = 1L;
    
    public GetServiceListResponseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICELIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "serviceList");
    
    
    /**
     * Gets the "serviceList" element
     */
    public org.uicds.serviceConfig.ServiceConfigListType getServiceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigListType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigListType)get_store().find_element_user(SERVICELIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serviceList" element
     */
    public void setServiceList(org.uicds.serviceConfig.ServiceConfigListType serviceList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigListType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigListType)get_store().find_element_user(SERVICELIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.serviceConfig.ServiceConfigListType)get_store().add_element_user(SERVICELIST$0);
            }
            target.set(serviceList);
        }
    }
    
    /**
     * Appends and returns a new empty "serviceList" element
     */
    public org.uicds.serviceConfig.ServiceConfigListType addNewServiceList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigListType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigListType)get_store().add_element_user(SERVICELIST$0);
            return target;
        }
    }
}
