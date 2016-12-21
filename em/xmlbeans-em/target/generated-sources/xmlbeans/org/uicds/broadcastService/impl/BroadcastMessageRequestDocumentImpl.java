/*
 * An XML document type.
 * Localname: BroadcastMessageRequest
 * Namespace: http://uicds.org/BroadcastService
 * Java type: org.uicds.broadcastService.BroadcastMessageRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.broadcastService.impl;
/**
 * A document containing one BroadcastMessageRequest(@http://uicds.org/BroadcastService) element.
 *
 * This is a complex type.
 */
public class BroadcastMessageRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.broadcastService.BroadcastMessageRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public BroadcastMessageRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BROADCASTMESSAGEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/BroadcastService", "BroadcastMessageRequest");
    
    
    /**
     * Gets the "BroadcastMessageRequest" element
     */
    public org.uicds.broadcastService.BroadcastMessageType getBroadcastMessageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.broadcastService.BroadcastMessageType target = null;
            target = (org.uicds.broadcastService.BroadcastMessageType)get_store().find_element_user(BROADCASTMESSAGEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BroadcastMessageRequest" element
     */
    public void setBroadcastMessageRequest(org.uicds.broadcastService.BroadcastMessageType broadcastMessageRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.broadcastService.BroadcastMessageType target = null;
            target = (org.uicds.broadcastService.BroadcastMessageType)get_store().find_element_user(BROADCASTMESSAGEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.broadcastService.BroadcastMessageType)get_store().add_element_user(BROADCASTMESSAGEREQUEST$0);
            }
            target.set(broadcastMessageRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "BroadcastMessageRequest" element
     */
    public org.uicds.broadcastService.BroadcastMessageType addNewBroadcastMessageRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.broadcastService.BroadcastMessageType target = null;
            target = (org.uicds.broadcastService.BroadcastMessageType)get_store().add_element_user(BROADCASTMESSAGEREQUEST$0);
            return target;
        }
    }
}
