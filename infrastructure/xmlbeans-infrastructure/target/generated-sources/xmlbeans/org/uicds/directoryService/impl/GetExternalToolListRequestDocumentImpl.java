/*
 * An XML document type.
 * Localname: GetExternalToolListRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetExternalToolListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one GetExternalToolListRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class GetExternalToolListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetExternalToolListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetExternalToolListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEXTERNALTOOLLISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "GetExternalToolListRequest");
    
    
    /**
     * Gets the "GetExternalToolListRequest" element
     */
    public org.uicds.directoryService.GetExternalToolListRequestType getGetExternalToolListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetExternalToolListRequestType target = null;
            target = (org.uicds.directoryService.GetExternalToolListRequestType)get_store().find_element_user(GETEXTERNALTOOLLISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetExternalToolListRequest" element
     */
    public void setGetExternalToolListRequest(org.uicds.directoryService.GetExternalToolListRequestType getExternalToolListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetExternalToolListRequestType target = null;
            target = (org.uicds.directoryService.GetExternalToolListRequestType)get_store().find_element_user(GETEXTERNALTOOLLISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.GetExternalToolListRequestType)get_store().add_element_user(GETEXTERNALTOOLLISTREQUEST$0);
            }
            target.set(getExternalToolListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetExternalToolListRequest" element
     */
    public org.uicds.directoryService.GetExternalToolListRequestType addNewGetExternalToolListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetExternalToolListRequestType target = null;
            target = (org.uicds.directoryService.GetExternalToolListRequestType)get_store().add_element_user(GETEXTERNALTOOLLISTREQUEST$0);
            return target;
        }
    }
}
