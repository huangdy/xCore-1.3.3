/*
 * An XML document type.
 * Localname: GetCommandStructureByIncidentRequest
 * Namespace: http://uicds.org/IncidentCommandStructureService
 * Java type: org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentCommandStructureService.impl;
/**
 * A document containing one GetCommandStructureByIncidentRequest(@http://uicds.org/IncidentCommandStructureService) element.
 *
 * This is a complex type.
 */
public class GetCommandStructureByIncidentRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incidentCommandStructureService.GetCommandStructureByIncidentRequestDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetCommandStructureByIncidentRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETCOMMANDSTRUCTUREBYINCIDENTREQUEST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IncidentCommandStructureService", "GetCommandStructureByIncidentRequest");
    
    
    /**
     * Gets the "GetCommandStructureByIncidentRequest" element
     */
    public java.lang.String getGetCommandStructureByIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETCOMMANDSTRUCTUREBYINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "GetCommandStructureByIncidentRequest" element
     */
    public org.apache.xmlbeans.XmlString xgetGetCommandStructureByIncidentRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETCOMMANDSTRUCTUREBYINCIDENTREQUEST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "GetCommandStructureByIncidentRequest" element
     */
    public void setGetCommandStructureByIncidentRequest(java.lang.String getCommandStructureByIncidentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GETCOMMANDSTRUCTUREBYINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GETCOMMANDSTRUCTUREBYINCIDENTREQUEST$0);
            }
            target.setStringValue(getCommandStructureByIncidentRequest);
        }
    }
    
    /**
     * Sets (as xml) the "GetCommandStructureByIncidentRequest" element
     */
    public void xsetGetCommandStructureByIncidentRequest(org.apache.xmlbeans.XmlString getCommandStructureByIncidentRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GETCOMMANDSTRUCTUREBYINCIDENTREQUEST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GETCOMMANDSTRUCTUREBYINCIDENTREQUEST$0);
            }
            target.set(getCommandStructureByIncidentRequest);
        }
    }
}
