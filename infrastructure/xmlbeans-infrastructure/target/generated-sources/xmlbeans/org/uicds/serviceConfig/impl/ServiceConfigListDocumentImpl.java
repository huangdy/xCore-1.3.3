/*
 * An XML document type.
 * Localname: ServiceConfigList
 * Namespace: http://uicds.org/ServiceConfig
 * Java type: org.uicds.serviceConfig.ServiceConfigListDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.serviceConfig.impl;
/**
 * A document containing one ServiceConfigList(@http://uicds.org/ServiceConfig) element.
 *
 * This is a complex type.
 */
public class ServiceConfigListDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.serviceConfig.ServiceConfigListDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceConfigListDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICECONFIGLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ServiceConfig", "ServiceConfigList");
    
    
    /**
     * Gets the "ServiceConfigList" element
     */
    public org.uicds.serviceConfig.ServiceConfigListType getServiceConfigList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigListType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigListType)get_store().find_element_user(SERVICECONFIGLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ServiceConfigList" element
     */
    public void setServiceConfigList(org.uicds.serviceConfig.ServiceConfigListType serviceConfigList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigListType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigListType)get_store().find_element_user(SERVICECONFIGLIST$0, 0);
            if (target == null)
            {
                target = (org.uicds.serviceConfig.ServiceConfigListType)get_store().add_element_user(SERVICECONFIGLIST$0);
            }
            target.set(serviceConfigList);
        }
    }
    
    /**
     * Appends and returns a new empty "ServiceConfigList" element
     */
    public org.uicds.serviceConfig.ServiceConfigListType addNewServiceConfigList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigListType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigListType)get_store().add_element_user(SERVICECONFIGLIST$0);
            return target;
        }
    }
}
