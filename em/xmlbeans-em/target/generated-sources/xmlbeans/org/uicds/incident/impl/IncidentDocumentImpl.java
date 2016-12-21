/*
 * An XML document type.
 * Localname: Incident
 * Namespace: http://uicds.org/incident
 * Java type: org.uicds.incident.IncidentDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incident.impl;
/**
 * A document containing one Incident(@http://uicds.org/incident) element.
 *
 * This is a complex type.
 */
public class IncidentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.incident.IncidentDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncidentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENT$0 = 
        new javax.xml.namespace.QName("http://uicds.org/incident", "Incident");
    
    
    /**
     * Gets the "Incident" element
     */
    public org.uicds.incident.UICDSIncidentType getIncident()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incident.UICDSIncidentType target = null;
            target = (org.uicds.incident.UICDSIncidentType)get_store().find_element_user(INCIDENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Incident" element
     */
    public void setIncident(org.uicds.incident.UICDSIncidentType incident)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incident.UICDSIncidentType target = null;
            target = (org.uicds.incident.UICDSIncidentType)get_store().find_element_user(INCIDENT$0, 0);
            if (target == null)
            {
                target = (org.uicds.incident.UICDSIncidentType)get_store().add_element_user(INCIDENT$0);
            }
            target.set(incident);
        }
    }
    
    /**
     * Appends and returns a new empty "Incident" element
     */
    public org.uicds.incident.UICDSIncidentType addNewIncident()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.incident.UICDSIncidentType target = null;
            target = (org.uicds.incident.UICDSIncidentType)get_store().add_element_user(INCIDENT$0);
            return target;
        }
    }
}
