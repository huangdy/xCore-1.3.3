/*
 * XML Type:  RegisterSOSRequestType
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.RegisterSOSRequestType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * An XML RegisterSOSRequestType(@http://uicds.org/DirectoryService).
 *
 * This is a complex type.
 */
public class RegisterSOSRequestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.RegisterSOSRequestType
{
    private static final long serialVersionUID = 1L;
    
    public RegisterSOSRequestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOS$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "sos");
    
    
    /**
     * Gets the "sos" element
     */
    public org.uicds.sosConfig.SOSConfigType getSos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigType target = null;
            target = (org.uicds.sosConfig.SOSConfigType)get_store().find_element_user(SOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sos" element
     */
    public void setSos(org.uicds.sosConfig.SOSConfigType sos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigType target = null;
            target = (org.uicds.sosConfig.SOSConfigType)get_store().find_element_user(SOS$0, 0);
            if (target == null)
            {
                target = (org.uicds.sosConfig.SOSConfigType)get_store().add_element_user(SOS$0);
            }
            target.set(sos);
        }
    }
    
    /**
     * Appends and returns a new empty "sos" element
     */
    public org.uicds.sosConfig.SOSConfigType addNewSos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.sosConfig.SOSConfigType target = null;
            target = (org.uicds.sosConfig.SOSConfigType)get_store().add_element_user(SOS$0);
            return target;
        }
    }
}
