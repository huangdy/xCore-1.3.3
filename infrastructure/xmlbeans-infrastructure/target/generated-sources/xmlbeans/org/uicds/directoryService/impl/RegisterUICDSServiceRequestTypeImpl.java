/*
 * XML Type:  RegisterUICDSServiceRequestType
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.RegisterUICDSServiceRequestType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * An XML RegisterUICDSServiceRequestType(@http://uicds.org/DirectoryService).
 *
 * This is a complex type.
 */
public class RegisterUICDSServiceRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.RegisterUICDSServiceRequestType
{
    private static final long serialVersionUID = 1L;
    
    public RegisterUICDSServiceRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "Service");
    
    
    /**
     * Gets the "Service" element
     */
    public org.uicds.serviceConfig.ServiceConfigType getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigType)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Service" element
     */
    public void setService(org.uicds.serviceConfig.ServiceConfigType service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigType)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                target = (org.uicds.serviceConfig.ServiceConfigType)get_store().add_element_user(SERVICE$0);
            }
            target.set(service);
        }
    }
    
    /**
     * Appends and returns a new empty "Service" element
     */
    public org.uicds.serviceConfig.ServiceConfigType addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.serviceConfig.ServiceConfigType target = null;
            target = (org.uicds.serviceConfig.ServiceConfigType)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
}
