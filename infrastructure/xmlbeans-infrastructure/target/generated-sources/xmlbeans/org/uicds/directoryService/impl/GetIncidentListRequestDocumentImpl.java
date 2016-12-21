/*
 * An XML document type.
 * Localname: GetIncidentListRequest
 * Namespace: http://uicds.org/DirectoryService
 * Java type: org.uicds.directoryService.GetIncidentListRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.directoryService.impl;
/**
 * A document containing one GetIncidentListRequest(@http://uicds.org/DirectoryService) element.
 *
 * This is a complex type.
 */
public class GetIncidentListRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.directoryService.GetIncidentListRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetIncidentListRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETINCIDENTLISTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/DirectoryService", "GetIncidentListRequest");
    
    
    /**
     * Gets the "GetIncidentListRequest" element
     */
    public org.apache.xmlbeans.XmlObject getGetIncidentListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(GETINCIDENTLISTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetIncidentListRequest" element
     */
    public void setGetIncidentListRequest(org.apache.xmlbeans.XmlObject getIncidentListRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(GETINCIDENTLISTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(GETINCIDENTLISTREQUEST$0);
            }
            target.set(getIncidentListRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetIncidentListRequest" element
     */
    public org.apache.xmlbeans.XmlObject addNewGetIncidentListRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(GETINCIDENTLISTREQUEST$0);
            return target;
        }
    }
}
