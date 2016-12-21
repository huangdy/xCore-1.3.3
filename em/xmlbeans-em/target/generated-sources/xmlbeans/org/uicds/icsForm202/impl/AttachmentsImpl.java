/*
 * XML Type:  Attachments
 * Namespace: http://uicds.org/ICSForm202
 * Java type: org.uicds.icsForm202.Attachments
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm202.impl;
/**
 * An XML Attachments(@http://uicds.org/ICSForm202).
 *
 * This is a complex type.
 */
public class AttachmentsImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm202.Attachments
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORGANIZATIONLIST$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "OrganizationList");
    private static final javax.xml.namespace.QName ASSIGNMENTLIST$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "AssignmentList");
    private static final javax.xml.namespace.QName COMMUNICATIONSPLAN$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "CommunicationsPlan");
    private static final javax.xml.namespace.QName MEDICALPLAN$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "MedicalPlan");
    private static final javax.xml.namespace.QName INCIDENTMAP$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "IncidentMap");
    private static final javax.xml.namespace.QName TRAFFICPLAN$10 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "TrafficPlan");
    private static final javax.xml.namespace.QName WEATHERFORECAST$12 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm202", "WeatherForecast");
    
    
    /**
     * Gets the "OrganizationList" element
     */
    public boolean getOrganizationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONLIST$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "OrganizationList" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOrganizationList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORGANIZATIONLIST$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OrganizationList" element
     */
    public void setOrganizationList(boolean organizationList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATIONLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATIONLIST$0);
            }
            target.setBooleanValue(organizationList);
        }
    }
    
    /**
     * Sets (as xml) the "OrganizationList" element
     */
    public void xsetOrganizationList(org.apache.xmlbeans.XmlBoolean organizationList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORGANIZATIONLIST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ORGANIZATIONLIST$0);
            }
            target.set(organizationList);
        }
    }
    
    /**
     * Gets the "AssignmentList" element
     */
    public boolean getAssignmentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNMENTLIST$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AssignmentList" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAssignmentList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ASSIGNMENTLIST$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AssignmentList" element
     */
    public void setAssignmentList(boolean assignmentList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNMENTLIST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNMENTLIST$2);
            }
            target.setBooleanValue(assignmentList);
        }
    }
    
    /**
     * Sets (as xml) the "AssignmentList" element
     */
    public void xsetAssignmentList(org.apache.xmlbeans.XmlBoolean assignmentList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ASSIGNMENTLIST$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ASSIGNMENTLIST$2);
            }
            target.set(assignmentList);
        }
    }
    
    /**
     * Gets the "CommunicationsPlan" element
     */
    public boolean getCommunicationsPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNICATIONSPLAN$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "CommunicationsPlan" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCommunicationsPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMMUNICATIONSPLAN$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CommunicationsPlan" element
     */
    public void setCommunicationsPlan(boolean communicationsPlan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMUNICATIONSPLAN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMUNICATIONSPLAN$4);
            }
            target.setBooleanValue(communicationsPlan);
        }
    }
    
    /**
     * Sets (as xml) the "CommunicationsPlan" element
     */
    public void xsetCommunicationsPlan(org.apache.xmlbeans.XmlBoolean communicationsPlan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(COMMUNICATIONSPLAN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(COMMUNICATIONSPLAN$4);
            }
            target.set(communicationsPlan);
        }
    }
    
    /**
     * Gets the "MedicalPlan" element
     */
    public boolean getMedicalPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICALPLAN$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "MedicalPlan" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetMedicalPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MEDICALPLAN$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MedicalPlan" element
     */
    public void setMedicalPlan(boolean medicalPlan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICALPLAN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDICALPLAN$6);
            }
            target.setBooleanValue(medicalPlan);
        }
    }
    
    /**
     * Sets (as xml) the "MedicalPlan" element
     */
    public void xsetMedicalPlan(org.apache.xmlbeans.XmlBoolean medicalPlan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(MEDICALPLAN$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(MEDICALPLAN$6);
            }
            target.set(medicalPlan);
        }
    }
    
    /**
     * Gets the "IncidentMap" element
     */
    public boolean getIncidentMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTMAP$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentMap" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetIncidentMap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCIDENTMAP$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IncidentMap" element
     */
    public void setIncidentMap(boolean incidentMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTMAP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTMAP$8);
            }
            target.setBooleanValue(incidentMap);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentMap" element
     */
    public void xsetIncidentMap(org.apache.xmlbeans.XmlBoolean incidentMap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCIDENTMAP$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCIDENTMAP$8);
            }
            target.set(incidentMap);
        }
    }
    
    /**
     * Gets the "TrafficPlan" element
     */
    public boolean getTrafficPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAFFICPLAN$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "TrafficPlan" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetTrafficPlan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRAFFICPLAN$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TrafficPlan" element
     */
    public void setTrafficPlan(boolean trafficPlan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRAFFICPLAN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRAFFICPLAN$10);
            }
            target.setBooleanValue(trafficPlan);
        }
    }
    
    /**
     * Sets (as xml) the "TrafficPlan" element
     */
    public void xsetTrafficPlan(org.apache.xmlbeans.XmlBoolean trafficPlan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(TRAFFICPLAN$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(TRAFFICPLAN$10);
            }
            target.set(trafficPlan);
        }
    }
    
    /**
     * Gets the "WeatherForecast" element
     */
    public boolean getWeatherForecast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEATHERFORECAST$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "WeatherForecast" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetWeatherForecast()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WEATHERFORECAST$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "WeatherForecast" element
     */
    public void setWeatherForecast(boolean weatherForecast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEATHERFORECAST$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEATHERFORECAST$12);
            }
            target.setBooleanValue(weatherForecast);
        }
    }
    
    /**
     * Sets (as xml) the "WeatherForecast" element
     */
    public void xsetWeatherForecast(org.apache.xmlbeans.XmlBoolean weatherForecast)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(WEATHERFORECAST$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(WEATHERFORECAST$12);
            }
            target.set(weatherForecast);
        }
    }
}
