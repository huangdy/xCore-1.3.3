/*
 * An XML document type.
 * Localname: RegisterUICDSServiceRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.RegisterUICDSServiceRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one RegisterUICDSServiceRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class RegisterUICDSServiceRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.RegisterUICDSServiceRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegisterUICDSServiceRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTERUICDSSERVICEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "RegisterUICDSServiceRequest");
    
    
    /**
     * Gets the "RegisterUICDSServiceRequest" element
     */
    public org.uicds.directoryService.RegisterUICDSServiceRequestType getRegisterUICDSServiceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.RegisterUICDSServiceRequestType target = null;
            target = (org.uicds.directoryService.RegisterUICDSServiceRequestType)get_store().find_element_user(REGISTERUICDSSERVICEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RegisterUICDSServiceRequest" element
     */
    public void setRegisterUICDSServiceRequest(org.uicds.directoryService.RegisterUICDSServiceRequestType registerUICDSServiceRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.RegisterUICDSServiceRequestType target = null;
            target = (org.uicds.directoryService.RegisterUICDSServiceRequestType)get_store().find_element_user(REGISTERUICDSSERVICEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.RegisterUICDSServiceRequestType)get_store().add_element_user(REGISTERUICDSSERVICEREQUEST$0);
            }
            target.set(registerUICDSServiceRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RegisterUICDSServiceRequest" element
     */
    public org.uicds.directoryService.RegisterUICDSServiceRequestType addNewRegisterUICDSServiceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.RegisterUICDSServiceRequestType target = null;
            target = (org.uicds.directoryService.RegisterUICDSServiceRequestType)get_store().add_element_user(REGISTERUICDSSERVICEREQUEST$0);
            return target;
        }
    }
}
