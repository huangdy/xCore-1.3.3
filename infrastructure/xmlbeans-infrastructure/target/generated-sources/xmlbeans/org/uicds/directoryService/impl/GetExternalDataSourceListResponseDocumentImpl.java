/*
 * An XML document type.
 * Localname: GetExternalDataSourceListResponse
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetExternalDataSourceListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one GetExternalDataSourceListResponse(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class GetExternalDataSourceListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetExternalDataSourceListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetExternalDataSourceListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEXTERNALDATASOURCELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "GetExternalDataSourceListResponse");
    
    
    /**
     * Gets the "GetExternalDataSourceListResponse" element
     */
    public org.uicds.directoryService.GetExternalDataSourceListResponseType getGetExternalDataSourceListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetExternalDataSourceListResponseType target = null;
            target = (org.uicds.directoryService.GetExternalDataSourceListResponseType)get_store().find_element_user(GETEXTERNALDATASOURCELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetExternalDataSourceListResponse" element
     */
    public void setGetExternalDataSourceListResponse(org.uicds.directoryService.GetExternalDataSourceListResponseType getExternalDataSourceListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetExternalDataSourceListResponseType target = null;
            target = (org.uicds.directoryService.GetExternalDataSourceListResponseType)get_store().find_element_user(GETEXTERNALDATASOURCELISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.GetExternalDataSourceListResponseType)get_store().add_element_user(GETEXTERNALDATASOURCELISTRESPONSE$0);
            }
            target.set(getExternalDataSourceListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetExternalDataSourceListResponse" element
     */
    public org.uicds.directoryService.GetExternalDataSourceListResponseType addNewGetExternalDataSourceListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetExternalDataSourceListResponseType target = null;
            target = (org.uicds.directoryService.GetExternalDataSourceListResponseType)get_store().add_element_user(GETEXTERNALDATASOURCELISTRESPONSE$0);
            return target;
        }
    }
}
