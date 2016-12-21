/*
 * An XML document type.
 * Localname: BroadcastMessageResponse
 * Namespace: http://uicds.org/BroadcastService
 * Java type: org.uicds.broadcastService.BroadcastMessageResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.broadcastService.impl;
/**
 * A document containing one BroadcastMessageResponse(@http://uicds.org/BroadcastService) element.
 *
 * This is a complex type.
 */
public class BroadcastMessageResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.broadcastService.BroadcastMessageResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public BroadcastMessageResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BROADCASTMESSAGERESPONSE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/BroadcastService", "BroadcastMessageResponse");
    
    
    /**
     * Gets the "BroadcastMessageResponse" element
     */
    public org.uicds.broadcastService.BroadcastMessageResponseType getBroadcastMessageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.broadcastService.BroadcastMessageResponseType target = null;
            target = (org.uicds.broadcastService.BroadcastMessageResponseType)get_store().find_element_user(BROADCASTMESSAGERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BroadcastMessageResponse" element
     */
    public void setBroadcastMessageResponse(org.uicds.broadcastService.BroadcastMessageResponseType broadcastMessageResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.broadcastService.BroadcastMessageResponseType target = null;
            target = (org.uicds.broadcastService.BroadcastMessageResponseType)get_store().find_element_user(BROADCASTMESSAGERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.uicds.broadcastService.BroadcastMessageResponseType)get_store().add_element_user(BROADCASTMESSAGERESPONSE$0);
            }
            target.set(broadcastMessageResponse);
        }
    }
    
    /**
     * Appends and returns a new empty "BroadcastMessageResponse" element
     */
    public org.uicds.broadcastService.BroadcastMessageResponseType addNewBroadcastMessageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.broadcastService.BroadcastMessageResponseType target = null;
            target = (org.uicds.broadcastService.BroadcastMessageResponseType)get_store().add_element_user(BROADCASTMESSAGERESPONSE$0);
            return target;
        }
    }
}
