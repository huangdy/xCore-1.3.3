/*
 * An XML document type.
 * Localname: GetServiceListRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetServiceListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one GetServiceListRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class GetServiceListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetServiceListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetServiceListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSERVICELISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "GetServiceListRequest");
    
    
    /**
     * Gets the "GetServiceListRequest" element
     */
    public org.uicds.directoryService.GetServicetListRequestType getGetServiceListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetServicetListRequestType target = null;
            target = (org.uicds.directoryService.GetServicetListRequestType)get_store().find_element_user(GETSERVICELISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetServiceListRequest" element
     */
    public void setGetServiceListRequest(org.uicds.directoryService.GetServicetListRequestType getServiceListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetServicetListRequestType target = null;
            target = (org.uicds.directoryService.GetServicetListRequestType)get_store().find_element_user(GETSERVICELISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.GetServicetListRequestType)get_store().add_element_user(GETSERVICELISTREQUEST$0);
            }
            target.set(getServiceListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetServiceListRequest" element
     */
    public org.uicds.directoryService.GetServicetListRequestType addNewGetServiceListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetServicetListRequestType target = null;
            target = (org.uicds.directoryService.GetServicetListRequestType)get_store().add_element_user(GETSERVICELISTREQUEST$0);
            return target;
        }
    }
}
