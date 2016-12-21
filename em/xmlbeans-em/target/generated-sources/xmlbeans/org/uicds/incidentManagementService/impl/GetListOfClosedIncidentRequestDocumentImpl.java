/*
 * An XML document type.
 * Localname: GetListOfClosedIncidentRequest
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.GetListOfClosedIncidentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService.impl;
/**
 * A document containing one GetListOfClosedIncidentRequest(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public class GetListOfClosedIncidentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentManagementService.GetListOfClosedIncidentRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetListOfClosedIncidentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLISTOFCLOSEDINCIDENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentManagementService", "GetListOfClosedIncidentRequest");
    
    
    /**
     * Gets the "GetListOfClosedIncidentRequest" element
     */
    public boolean getGetListOfClosedIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETLISTOFCLOSEDINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "GetListOfClosedIncidentRequest" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetGetListOfClosedIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(GETLISTOFCLOSEDINCIDENTREQUEST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GetListOfClosedIncidentRequest" element
     */
    public void setGetListOfClosedIncidentRequest(boolean getListOfClosedIncidentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETLISTOFCLOSEDINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GETLISTOFCLOSEDINCIDENTREQUEST$0);
            }
            target.setBooleanValue(getListOfClosedIncidentRequest);
        }
    }
    
    /**
     * Sets (as xml) the "GetListOfClosedIncidentRequest" element
     */
    public void xsetGetListOfClosedIncidentRequest(org.apache.xmlbeans.XmlBoolean getListOfClosedIncidentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(GETLISTOFCLOSEDINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(GETLISTOFCLOSEDINCIDENTREQUEST$0);
            }
            target.set(getListOfClosedIncidentRequest);
        }
    }
}
