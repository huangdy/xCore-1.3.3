/*
 * An XML document type.
 * Localname: IncidentActionPlan
 * Namespace: http://uicds.org/IAPService
 * Java type: org.uicds.iapService.IncidentActionPlanDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.iapService.impl;
/**
 * A document containing one IncidentActionPlan(@http://uicds.org/IAPService) element.
 *
 * This is a complex type.
 */
public class IncidentActionPlanDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.iapService.IncidentActionPlanDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncidentActionPlanDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTACTIONPLAN$0 = 
        new javax.xml.namespace.QName("http://uicds.org/IAPService", "IncidentActionPlan");
    
    
    /**
     * Gets the "IncidentActionPlan" element
     */
    public org.uicds.iapService.IncidentActionPlanType getIncidentActionPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IncidentActionPlanType target = null;
            target = (org.uicds.iapService.IncidentActionPlanType)get_store().find_element_user(INCIDENTACTIONPLAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IncidentActionPlan" element
     */
    public void setIncidentActionPlan(org.uicds.iapService.IncidentActionPlanType incidentActionPlan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IncidentActionPlanType target = null;
            target = (org.uicds.iapService.IncidentActionPlanType)get_store().find_element_user(INCIDENTACTIONPLAN$0, 0);
            if (target == null)
            {
                target = (org.uicds.iapService.IncidentActionPlanType)get_store().add_element_user(INCIDENTACTIONPLAN$0);
            }
            target.set(incidentActionPlan);
        }
    }
    
    /**
     * Appends and returns a new empty "IncidentActionPlan" element
     */
    public org.uicds.iapService.IncidentActionPlanType addNewIncidentActionPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.iapService.IncidentActionPlanType target = null;
            target = (org.uicds.iapService.IncidentActionPlanType)get_store().add_element_user(INCIDENTACTIONPLAN$0);
            return target;
        }
    }
}
