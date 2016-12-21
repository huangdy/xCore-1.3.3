/*
 * An XML document type.
 * Localname: EdxlDeResponse
 * Namespace: http://uicds.org/ResourceManagementService
 * Java type: org.uicds.resourceManagementService.EdxlDeResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceManagementService.impl;
/**
 * A document containing one EdxlDeResponse(@http://uicds.org/ResourceManagementService) element.
 *
 * This is a complex type.
 */
public class EdxlDeResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.resourceManagementService.EdxlDeResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public EdxlDeResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDXLDERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ResourceManagementService", "EdxlDeResponse");
    
    
    /**
     * Gets the "EdxlDeResponse" element
     */
    public org.uicds.resourceManagementService.EdxlDeMessageResponseType getEdxlDeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.EdxlDeMessageResponseType target = null;
            target = (org.uicds.resourceManagementService.EdxlDeMessageResponseType)get_store().find_element_user(EDXLDERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EdxlDeResponse" element
     */
    public void setEdxlDeResponse(org.uicds.resourceManagementService.EdxlDeMessageResponseType edxlDeResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.EdxlDeMessageResponseType target = null;
            target = (org.uicds.resourceManagementService.EdxlDeMessageResponseType)get_store().find_element_user(EDXLDERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.resourceManagementService.EdxlDeMessageResponseType)get_store().add_element_user(EDXLDERESPONSE$0);
            }
            target.set(edxlDeResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "EdxlDeResponse" element
     */
    public org.uicds.resourceManagementService.EdxlDeMessageResponseType addNewEdxlDeResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.resourceManagementService.EdxlDeMessageResponseType target = null;
            target = (org.uicds.resourceManagementService.EdxlDeMessageResponseType)get_store().add_element_user(EDXLDERESPONSE$0);
            return target;
        }
    }
}
