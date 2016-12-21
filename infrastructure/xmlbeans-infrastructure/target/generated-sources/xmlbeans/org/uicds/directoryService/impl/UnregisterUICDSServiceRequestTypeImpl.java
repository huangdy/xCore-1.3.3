/*
 * XML Type:  UnregisterUICDSServiceRequestType
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.UnregisterUICDSServiceRequestType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * An XML UnregisterUICDSServiceRequestType(@http://uicds.org/DirectoryService).
 *
 * This is a complex type.
 */
public class UnregisterUICDSServiceRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.UnregisterUICDSServiceRequestType
{
    private static final long serialVersionUID = 1L;
    
    public UnregisterUICDSServiceRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICENAME$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "serviceName");
    
    
    /**
     * Gets the "serviceName" element
     */
    public java.lang.String getServiceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "serviceName" element
     */
    public org.apache.xmlbeans.XmlString xgetServiceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICENAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "serviceName" element
     */
    public void setServiceName(java.lang.String serviceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERVICENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERVICENAME$0);
            }
            target.setStringValue(serviceName);
        }
    }
    
    /**
     * Sets (as xml) the "serviceName" element
     */
    public void xsetServiceName(org.apache.xmlbeans.XmlString serviceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERVICENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERVICENAME$0);
            }
            target.set(serviceName);
        }
    }
}
