/*
 * An XML document type.
 * Localname: GetSOSListRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetSOSListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one GetSOSListRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class GetSOSListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetSOSListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSOSListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSOSLISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "GetSOSListRequest");
    
    
    /**
     * Gets the "GetSOSListRequest" element
     */
    public org.uicds.directoryService.GetSOSListRequestType getGetSOSListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetSOSListRequestType target = null;
            target = (org.uicds.directoryService.GetSOSListRequestType)get_store().find_element_user(GETSOSLISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSOSListRequest" element
     */
    public void setGetSOSListRequest(org.uicds.directoryService.GetSOSListRequestType getSOSListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetSOSListRequestType target = null;
            target = (org.uicds.directoryService.GetSOSListRequestType)get_store().find_element_user(GETSOSLISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.GetSOSListRequestType)get_store().add_element_user(GETSOSLISTREQUEST$0);
            }
            target.set(getSOSListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetSOSListRequest" element
     */
    public org.uicds.directoryService.GetSOSListRequestType addNewGetSOSListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetSOSListRequestType target = null;
            target = (org.uicds.directoryService.GetSOSListRequestType)get_store().add_element_user(GETSOSLISTREQUEST$0);
            return target;
        }
    }
}
