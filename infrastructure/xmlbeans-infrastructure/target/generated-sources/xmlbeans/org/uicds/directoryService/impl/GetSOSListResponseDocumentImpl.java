/*
 * An XML document type.
 * Localname: GetSOSListResponse
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetSOSListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one GetSOSListResponse(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class GetSOSListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetSOSListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSOSListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSOSLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "GetSOSListResponse");
    
    
    /**
     * Gets the "GetSOSListResponse" element
     */
    public org.uicds.directoryService.GetSOSListResponseType getGetSOSListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetSOSListResponseType target = null;
            target = (org.uicds.directoryService.GetSOSListResponseType)get_store().find_element_user(GETSOSLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetSOSListResponse" element
     */
    public void setGetSOSListResponse(org.uicds.directoryService.GetSOSListResponseType getSOSListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetSOSListResponseType target = null;
            target = (org.uicds.directoryService.GetSOSListResponseType)get_store().find_element_user(GETSOSLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.GetSOSListResponseType)get_store().add_element_user(GETSOSLISTRESPONSE$0);
            }
            target.set(getSOSListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetSOSListResponse" element
     */
    public org.uicds.directoryService.GetSOSListResponseType addNewGetSOSListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetSOSListResponseType target = null;
            target = (org.uicds.directoryService.GetSOSListResponseType)get_store().add_element_user(GETSOSLISTRESPONSE$0);
            return target;
        }
    }
}
