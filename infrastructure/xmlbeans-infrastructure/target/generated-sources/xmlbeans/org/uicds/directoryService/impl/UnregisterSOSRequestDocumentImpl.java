/*
 * An XML document type.
 * Localname: UnregisterSOSRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.UnregisterSOSRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one UnregisterSOSRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class UnregisterSOSRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.UnregisterSOSRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnregisterSOSRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNREGISTERSOSREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "UnregisterSOSRequest");
    
    
    /**
     * Gets the "UnregisterSOSRequest" element
     */
    public org.uicds.directoryService.UnregisterSOSRequestType getUnregisterSOSRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.UnregisterSOSRequestType target = null;
            target = (org.uicds.directoryService.UnregisterSOSRequestType)get_store().find_element_user(UNREGISTERSOSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnregisterSOSRequest" element
     */
    public void setUnregisterSOSRequest(org.uicds.directoryService.UnregisterSOSRequestType unregisterSOSRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.UnregisterSOSRequestType target = null;
            target = (org.uicds.directoryService.UnregisterSOSRequestType)get_store().find_element_user(UNREGISTERSOSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.UnregisterSOSRequestType)get_store().add_element_user(UNREGISTERSOSREQUEST$0);
            }
            target.set(unregisterSOSRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UnregisterSOSRequest" element
     */
    public org.uicds.directoryService.UnregisterSOSRequestType addNewUnregisterSOSRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.UnregisterSOSRequestType target = null;
            target = (org.uicds.directoryService.UnregisterSOSRequestType)get_store().add_element_user(UNREGISTERSOSREQUEST$0);
            return target;
        }
    }
}
