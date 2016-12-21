/*
 * An XML document type.
 * Localname: GetCoreListResponse
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetCoreListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one GetCoreListResponse(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class GetCoreListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetCoreListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCoreListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCORELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "GetCoreListResponse");
    
    
    /**
     * Gets the "GetCoreListResponse" element
     */
    public org.uicds.directoryService.GetCoreListResponseType getGetCoreListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetCoreListResponseType target = null;
            target = (org.uicds.directoryService.GetCoreListResponseType)get_store().find_element_user(GETCORELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetCoreListResponse" element
     */
    public void setGetCoreListResponse(org.uicds.directoryService.GetCoreListResponseType getCoreListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetCoreListResponseType target = null;
            target = (org.uicds.directoryService.GetCoreListResponseType)get_store().find_element_user(GETCORELISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.GetCoreListResponseType)get_store().add_element_user(GETCORELISTRESPONSE$0);
            }
            target.set(getCoreListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetCoreListResponse" element
     */
    public org.uicds.directoryService.GetCoreListResponseType addNewGetCoreListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetCoreListResponseType target = null;
            target = (org.uicds.directoryService.GetCoreListResponseType)get_store().add_element_user(GETCORELISTRESPONSE$0);
            return target;
        }
    }
}
