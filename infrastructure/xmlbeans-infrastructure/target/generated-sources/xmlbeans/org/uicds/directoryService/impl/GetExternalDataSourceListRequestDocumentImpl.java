/*
 * An XML document type.
 * Localname: GetExternalDataSourceListRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetExternalDataSourceListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one GetExternalDataSourceListRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class GetExternalDataSourceListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetExternalDataSourceListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetExternalDataSourceListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEXTERNALDATASOURCELISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "GetExternalDataSourceListRequest");
    
    
    /**
     * Gets the "GetExternalDataSourceListRequest" element
     */
    public org.uicds.directoryService.GetExternalDataSourceListRequestType getGetExternalDataSourceListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetExternalDataSourceListRequestType target = null;
            target = (org.uicds.directoryService.GetExternalDataSourceListRequestType)get_store().find_element_user(GETEXTERNALDATASOURCELISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetExternalDataSourceListRequest" element
     */
    public void setGetExternalDataSourceListRequest(org.uicds.directoryService.GetExternalDataSourceListRequestType getExternalDataSourceListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetExternalDataSourceListRequestType target = null;
            target = (org.uicds.directoryService.GetExternalDataSourceListRequestType)get_store().find_element_user(GETEXTERNALDATASOURCELISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.GetExternalDataSourceListRequestType)get_store().add_element_user(GETEXTERNALDATASOURCELISTREQUEST$0);
            }
            target.set(getExternalDataSourceListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetExternalDataSourceListRequest" element
     */
    public org.uicds.directoryService.GetExternalDataSourceListRequestType addNewGetExternalDataSourceListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetExternalDataSourceListRequestType target = null;
            target = (org.uicds.directoryService.GetExternalDataSourceListRequestType)get_store().add_element_user(GETEXTERNALDATASOURCELISTREQUEST$0);
            return target;
        }
    }
}
