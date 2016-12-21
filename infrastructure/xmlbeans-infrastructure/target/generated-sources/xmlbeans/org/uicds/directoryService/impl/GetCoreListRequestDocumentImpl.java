/*
 * An XML document type.
 * Localname: GetCoreListRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetCoreListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one GetCoreListRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class GetCoreListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetCoreListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCoreListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCORELISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "GetCoreListRequest");
    
    
    /**
     * Gets the "GetCoreListRequest" element
     */
    public org.uicds.directoryService.GetCoreListRequestType getGetCoreListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetCoreListRequestType target = null;
            target = (org.uicds.directoryService.GetCoreListRequestType)get_store().find_element_user(GETCORELISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCoreListRequest" element
     */
    public void setGetCoreListRequest(org.uicds.directoryService.GetCoreListRequestType getCoreListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetCoreListRequestType target = null;
            target = (org.uicds.directoryService.GetCoreListRequestType)get_store().find_element_user(GETCORELISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.GetCoreListRequestType)get_store().add_element_user(GETCORELISTREQUEST$0);
            }
            target.set(getCoreListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCoreListRequest" element
     */
    public org.uicds.directoryService.GetCoreListRequestType addNewGetCoreListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetCoreListRequestType target = null;
            target = (org.uicds.directoryService.GetCoreListRequestType)get_store().add_element_user(GETCORELISTREQUEST$0);
            return target;
        }
    }
}
