/*
 * An XML document type.
 * Localname: UnregisterExternalDataSourceRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.UnregisterExternalDataSourceRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one UnregisterExternalDataSourceRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class UnregisterExternalDataSourceRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.UnregisterExternalDataSourceRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnregisterExternalDataSourceRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNREGISTEREXTERNALDATASOURCEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "UnregisterExternalDataSourceRequest");
    
    
    /**
     * Gets the "UnregisterExternalDataSourceRequest" element
     */
    public org.uicds.directoryService.UnregisterExternalDataSourceRequestType getUnregisterExternalDataSourceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.UnregisterExternalDataSourceRequestType target = null;
            target = (org.uicds.directoryService.UnregisterExternalDataSourceRequestType)get_store().find_element_user(UNREGISTEREXTERNALDATASOURCEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnregisterExternalDataSourceRequest" element
     */
    public void setUnregisterExternalDataSourceRequest(org.uicds.directoryService.UnregisterExternalDataSourceRequestType unregisterExternalDataSourceRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.UnregisterExternalDataSourceRequestType target = null;
            target = (org.uicds.directoryService.UnregisterExternalDataSourceRequestType)get_store().find_element_user(UNREGISTEREXTERNALDATASOURCEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.UnregisterExternalDataSourceRequestType)get_store().add_element_user(UNREGISTEREXTERNALDATASOURCEREQUEST$0);
            }
            target.set(unregisterExternalDataSourceRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UnregisterExternalDataSourceRequest" element
     */
    public org.uicds.directoryService.UnregisterExternalDataSourceRequestType addNewUnregisterExternalDataSourceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.UnregisterExternalDataSourceRequestType target = null;
            target = (org.uicds.directoryService.UnregisterExternalDataSourceRequestType)get_store().add_element_user(UNREGISTEREXTERNALDATASOURCEREQUEST$0);
            return target;
        }
    }
}
