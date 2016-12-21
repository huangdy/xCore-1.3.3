/*
 * An XML document type.
 * Localname: RegisterSOSRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.RegisterSOSRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one RegisterSOSRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class RegisterSOSRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.RegisterSOSRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegisterSOSRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTERSOSREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "RegisterSOSRequest");
    
    
    /**
     * Gets the "RegisterSOSRequest" element
     */
    public org.uicds.directoryService.RegisterSOSRequestType getRegisterSOSRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.RegisterSOSRequestType target = null;
            target = (org.uicds.directoryService.RegisterSOSRequestType)get_store().find_element_user(REGISTERSOSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RegisterSOSRequest" element
     */
    public void setRegisterSOSRequest(org.uicds.directoryService.RegisterSOSRequestType registerSOSRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.RegisterSOSRequestType target = null;
            target = (org.uicds.directoryService.RegisterSOSRequestType)get_store().find_element_user(REGISTERSOSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.RegisterSOSRequestType)get_store().add_element_user(REGISTERSOSREQUEST$0);
            }
            target.set(registerSOSRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RegisterSOSRequest" element
     */
    public org.uicds.directoryService.RegisterSOSRequestType addNewRegisterSOSRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.RegisterSOSRequestType target = null;
            target = (org.uicds.directoryService.RegisterSOSRequestType)get_store().add_element_user(REGISTERSOSREQUEST$0);
            return target;
        }
    }
}
