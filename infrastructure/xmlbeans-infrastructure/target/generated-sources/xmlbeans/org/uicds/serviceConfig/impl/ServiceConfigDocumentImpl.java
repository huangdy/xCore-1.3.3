/*
 * An XML document type.
 * Localname: ServiceConfig
 * Namespace: http://uicds.org/ServiceConfig
 * Java type: org.uicds.serviceConfig.ServiceConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.serviceConfig.impl;
/**
 * A document containing one ServiceConfig(@http://uicds.org/ServiceConfig) element.
 *
 * This is a complex type.
 */
public class ServiceConfigDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.serviceConfig.ServiceConfigDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceConfigDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICECONFIG$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ServiceConfig", "ServiceConfig");
    
    
    /**
     * Gets the "ServiceConfig" element
     */
    public org.uicds.serviceConfig.ServiceConfigType getServiceConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigType)get_store().find_element_user(SERVICECONFIG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ServiceConfig" element
     */
    public void setServiceConfig(org.uicds.serviceConfig.ServiceConfigType serviceConfig)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigType)get_store().find_element_user(SERVICECONFIG$0, 0);
            if (target == null)
            {
                target = (org.uicds.serviceConfig.ServiceConfigType)get_store().add_element_user(SERVICECONFIG$0);
            }
            target.set(serviceConfig);
        }
    }
    
    /**
     * Appends and returns a new empty "ServiceConfig" element
     */
    public org.uicds.serviceConfig.ServiceConfigType addNewServiceConfig()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigType)get_store().add_element_user(SERVICECONFIG$0);
            return target;
        }
    }
}
