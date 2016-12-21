/*
 * An XML document type.
 * Localname: UnregisterUICDSServiceRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.UnregisterUICDSServiceRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one UnregisterUICDSServiceRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class UnregisterUICDSServiceRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.UnregisterUICDSServiceRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnregisterUICDSServiceRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNREGISTERUICDSSERVICEREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "UnregisterUICDSServiceRequest");
    
    
    /**
     * Gets the "UnregisterUICDSServiceRequest" element
     */
    public org.uicds.directoryService.UnregisterUICDSServiceRequestType getUnregisterUICDSServiceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.UnregisterUICDSServiceRequestType target = null;
            target = (org.uicds.directoryService.UnregisterUICDSServiceRequestType)get_store().find_element_user(UNREGISTERUICDSSERVICEREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnregisterUICDSServiceRequest" element
     */
    public void setUnregisterUICDSServiceRequest(org.uicds.directoryService.UnregisterUICDSServiceRequestType unregisterUICDSServiceRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.UnregisterUICDSServiceRequestType target = null;
            target = (org.uicds.directoryService.UnregisterUICDSServiceRequestType)get_store().find_element_user(UNREGISTERUICDSSERVICEREQUEST$0, 0);
            if (target == null)
            {
                target = (org.uicds.directoryService.UnregisterUICDSServiceRequestType)get_store().add_element_user(UNREGISTERUICDSSERVICEREQUEST$0);
            }
            target.set(unregisterUICDSServiceRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "UnregisterUICDSServiceRequest" element
     */
    public org.uicds.directoryService.UnregisterUICDSServiceRequestType addNewUnregisterUICDSServiceRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.directoryService.UnregisterUICDSServiceRequestType target = null;
            target = (org.uicds.directoryService.UnregisterUICDSServiceRequestType)get_store().add_element_user(UNREGISTERUICDSSERVICEREQUEST$0);
            return target;
        }
    }
}
