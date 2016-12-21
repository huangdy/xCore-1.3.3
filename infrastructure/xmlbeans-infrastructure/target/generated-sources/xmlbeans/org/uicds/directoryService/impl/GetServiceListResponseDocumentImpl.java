/*
 * An XML document type.
 * Localname: GetServiceListResponse
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetServiceListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one GetServiceListResponse(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class GetServiceListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetServiceListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetServiceListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSERVICELISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "GetServiceListResponse");
    
    
    /**
     * Gets the "GetServiceListResponse" element
     */
    public org.uicds.directoryService.GetServiceListResponseType getGetServiceListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetServiceListResponseType target = null;
            target = (org.uicds.directoryService.GetServiceListResponseType)get_store().find_element_user(GETSERVICELISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetServiceListResponse" element
     */
    public void setGetServiceListResponse(org.uicds.directoryService.GetServiceListResponseType getServiceListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetServiceListResponseType target = null;
            target = (org.uicds.directoryService.GetServiceListResponseType)get_store().find_element_user(GETSERVICELISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.GetServiceListResponseType)get_store().add_element_user(GETSERVICELISTRESPONSE$0);
            }
            target.set(getServiceListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetServiceListResponse" element
     */
    public org.uicds.directoryService.GetServiceListResponseType addNewGetServiceListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetServiceListResponseType target = null;
            target = (org.uicds.directoryService.GetServiceListResponseType)get_store().add_element_user(GETSERVICELISTRESPONSE$0);
            return target;
        }
    }
}
