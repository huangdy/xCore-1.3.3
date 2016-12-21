/*
 * XML Type:  IncidentMedicalAidStationType
 * Namespace: http://uicds.org/ICSForm206
 * Java type: org.uicds.icsForm206.IncidentMedicalAidStationType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm206.impl;
/**
 * An XML IncidentMedicalAidStationType(@http://uicds.org/ICSForm206).
 *
 * This is a complex type.
 */
public class IncidentMedicalAidStationTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm206.IncidentMedicalAidStationType
{
    private static final long serialVersionUID = 1L;
    
    public IncidentMedicalAidStationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDICALAIDSTATION$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "MedicalAidStation");
    private static final javax.xml.namespace.QName LOCATION$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "Location");
    private static final javax.xml.namespace.QName PARAMEDICS$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm206", "Paramedics");
    
    
    /**
     * Gets the "MedicalAidStation" element
     */
    public java.lang.String getMedicalAidStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICALAIDSTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MedicalAidStation" element
     */
    public org.apache.xmlbeans.XmlString xgetMedicalAidStation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDICALAIDSTATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MedicalAidStation" element
     */
    public void setMedicalAidStation(java.lang.String medicalAidStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDICALAIDSTATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDICALAIDSTATION$0);
            }
            target.setStringValue(medicalAidStation);
        }
    }
    
    /**
     * Sets (as xml) the "MedicalAidStation" element
     */
    public void xsetMedicalAidStation(org.apache.xmlbeans.XmlString medicalAidStation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDICALAIDSTATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDICALAIDSTATION$0);
            }
            target.set(medicalAidStation);
        }
    }
    
    /**
     * Gets the "Location" element
     */
    public java.lang.String getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Location" element
     */
    public org.apache.xmlbeans.XmlString xgetLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Location" element
     */
    public void setLocation(java.lang.String location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATION$2);
            }
            target.setStringValue(location);
        }
    }
    
    /**
     * Sets (as xml) the "Location" element
     */
    public void xsetLocation(org.apache.xmlbeans.XmlString location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATION$2);
            }
            target.set(location);
        }
    }
    
    /**
     * Gets the "Paramedics" element
     */
    public boolean getParamedics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMEDICS$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Paramedics" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetParamedics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PARAMEDICS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Paramedics" element
     */
    public void setParamedics(boolean paramedics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMEDICS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMEDICS$4);
            }
            target.setBooleanValue(paramedics);
        }
    }
    
    /**
     * Sets (as xml) the "Paramedics" element
     */
    public void xsetParamedics(org.apache.xmlbeans.XmlBoolean paramedics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PARAMEDICS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PARAMEDICS$4);
            }
            target.set(paramedics);
        }
    }
}
