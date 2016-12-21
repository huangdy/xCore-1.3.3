/*
 * An XML document type.
 * Localname: RegisterExternalToolRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.RegisterExternalToolRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one RegisterExternalToolRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class RegisterExternalToolRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.RegisterExternalToolRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegisterExternalToolRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTEREXTERNALTOOLREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "RegisterExternalToolRequest");
    
    
    /**
     * Gets the "RegisterExternalToolRequest" element
     */
    public org.uicds.directoryService.RegisterExternalToolRequestType getRegisterExternalToolRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.RegisterExternalToolRequestType target = null;
            target = (org.uicds.directoryService.RegisterExternalToolRequestType)get_store().find_element_user(REGISTEREXTERNALTOOLREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RegisterExternalToolRequest" element
     */
    public void setRegisterExternalToolRequest(org.uicds.directoryService.RegisterExternalToolRequestType registerExternalToolRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.RegisterExternalToolRequestType target = null;
            target = (org.uicds.directoryService.RegisterExternalToolRequestType)get_store().find_element_user(REGISTEREXTERNALTOOLREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.RegisterExternalToolRequestType)get_store().add_element_user(REGISTEREXTERNALTOOLREQUEST$0);
            }
            target.set(registerExternalToolRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RegisterExternalToolRequest" element
     */
    public org.uicds.directoryService.RegisterExternalToolRequestType addNewRegisterExternalToolRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.RegisterExternalToolRequestType target = null;
            target = (org.uicds.directoryService.RegisterExternalToolRequestType)get_store().add_element_user(REGISTEREXTERNALTOOLREQUEST$0);
            return target;
        }
    }
}
