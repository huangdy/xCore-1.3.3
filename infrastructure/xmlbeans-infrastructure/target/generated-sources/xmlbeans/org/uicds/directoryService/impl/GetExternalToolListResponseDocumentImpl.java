/*
 * An XML document type.
 * Localname: GetExternalToolListResponse
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetExternalToolListResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one GetExternalToolListResponse(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class GetExternalToolListResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetExternalToolListResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetExternalToolListResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETEXTERNALTOOLLISTRESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "GetExternalToolListResponse");
    
    
    /**
     * Gets the "GetExternalToolListResponse" element
     */
    public org.uicds.directoryService.GetExternalToolListResponseType getGetExternalToolListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetExternalToolListResponseType target = null;
            target = (org.uicds.directoryService.GetExternalToolListResponseType)get_store().find_element_user(GETEXTERNALTOOLLISTRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetExternalToolListResponse" element
     */
    public void setGetExternalToolListResponse(org.uicds.directoryService.GetExternalToolListResponseType getExternalToolListResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetExternalToolListResponseType target = null;
            target = (org.uicds.directoryService.GetExternalToolListResponseType)get_store().find_element_user(GETEXTERNALTOOLLISTRESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.GetExternalToolListResponseType)get_store().add_element_user(GETEXTERNALTOOLLISTRESPONSE$0);
            }
            target.set(getExternalToolListResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "GetExternalToolListResponse" element
     */
    public org.uicds.directoryService.GetExternalToolListResponseType addNewGetExternalToolListResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.GetExternalToolListResponseType target = null;
            target = (org.uicds.directoryService.GetExternalToolListResponseType)get_store().add_element_user(GETEXTERNALTOOLLISTRESPONSE$0);
            return target;
        }
    }
}
