/*
 * An XML document type.
 * Localname: UnregisterExternalToolRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.UnregisterExternalToolRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one UnregisterExternalToolRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class UnregisterExternalToolRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.UnregisterExternalToolRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnregisterExternalToolRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNREGISTEREXTERNALTOOLREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "UnregisterExternalToolRequest");
    
    
    /**
     * Gets the "UnregisterExternalToolRequest" element
     */
    public org.uicds.directoryService.UnregisterExternalToolRequestType getUnregisterExternalToolRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.UnregisterExternalToolRequestType target = null;
            target = (org.uicds.directoryService.UnregisterExternalToolRequestType)get_store().find_element_user(UNREGISTEREXTERNALTOOLREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnregisterExternalToolRequest" element
     */
    public void setUnregisterExternalToolRequest(org.uicds.directoryService.UnregisterExternalToolRequestType unregisterExternalToolRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.UnregisterExternalToolRequestType target = null;
            target = (org.uicds.directoryService.UnregisterExternalToolRequestType)get_store().find_element_user(UNREGISTEREXTERNALTOOLREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.UnregisterExternalToolRequestType)get_store().add_element_user(UNREGISTEREXTERNALTOOLREQUEST$0);
            }
            target.set(unregisterExternalToolRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UnregisterExternalToolRequest" element
     */
    public org.uicds.directoryService.UnregisterExternalToolRequestType addNewUnregisterExternalToolRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.UnregisterExternalToolRequestType target = null;
            target = (org.uicds.directoryService.UnregisterExternalToolRequestType)get_store().add_element_user(UNREGISTEREXTERNALTOOLREQUEST$0);
            return target;
        }
    }
}
