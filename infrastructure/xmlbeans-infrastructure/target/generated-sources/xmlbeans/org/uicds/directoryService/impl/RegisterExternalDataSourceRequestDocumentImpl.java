/*
 * An XML document type.
 * Localname: RegisterExternalDataSourceRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.RegisterExternalDataSourceRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one RegisterExternalDataSourceRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class RegisterExternalDataSourceRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.RegisterExternalDataSourceRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegisterExternalDataSourceRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTEREXTERNALDATASOURCEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "RegisterExternalDataSourceRequest");
    
    
    /**
     * Gets the "RegisterExternalDataSourceRequest" element
     */
    public org.uicds.directoryService.RegisterExternalDataSourceRequestType getRegisterExternalDataSourceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.RegisterExternalDataSourceRequestType target = null;
            target = (org.uicds.directoryService.RegisterExternalDataSourceRequestType)get_store().find_element_user(REGISTEREXTERNALDATASOURCEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RegisterExternalDataSourceRequest" element
     */
    public void setRegisterExternalDataSourceRequest(org.uicds.directoryService.RegisterExternalDataSourceRequestType registerExternalDataSourceRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.RegisterExternalDataSourceRequestType target = null;
            target = (org.uicds.directoryService.RegisterExternalDataSourceRequestType)get_store().find_element_user(REGISTEREXTERNALDATASOURCEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.RegisterExternalDataSourceRequestType)get_store().add_element_user(REGISTEREXTERNALDATASOURCEREQUEST$0);
            }
            target.set(registerExternalDataSourceRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "RegisterExternalDataSourceRequest" element
     */
    public org.uicds.directoryService.RegisterExternalDataSourceRequestType addNewRegisterExternalDataSourceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.RegisterExternalDataSourceRequestType target = null;
            target = (org.uicds.directoryService.RegisterExternalDataSourceRequestType)get_store().add_element_user(REGISTEREXTERNALDATASOURCEREQUEST$0);
            return target;
        }
    }
}
