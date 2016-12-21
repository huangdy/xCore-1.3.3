/*
 * XML Type:  IncidentCommandAndStaffType
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.IncidentCommandAndStaffType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203.impl;
/**
 * An XML IncidentCommandAndStaffType(@http://uicds.org/ICSForm203).
 *
 * This is a complex type.
 */
public class IncidentCommandAndStaffTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm203.IncidentCommandAndStaffType
{
    private static final long serialVersionUID = 1L;
    
    public IncidentCommandAndStaffTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTCOMMANDER$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "IncidentCommander");
    private static final javax.xml.namespace.QName DEPUTY$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "Deputy");
    private static final javax.xml.namespace.QName SAFETYOFFICER$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "SafetyOfficer");
    private static final javax.xml.namespace.QName INFORMATIONOFFICER$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "InformationOfficer");
    private static final javax.xml.namespace.QName LIASONOFFICER$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "LiasonOfficer");
    
    
    /**
     * Gets the "IncidentCommander" element
     */
    public java.lang.String getIncidentCommander()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTCOMMANDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentCommander" element
     */
    public org.apache.xmlbeans.XmlString xgetIncidentCommander()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTCOMMANDER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IncidentCommander" element
     */
    public void setIncidentCommander(java.lang.String incidentCommander)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTCOMMANDER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTCOMMANDER$0);
            }
            target.setStringValue(incidentCommander);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentCommander" element
     */
    public void xsetIncidentCommander(org.apache.xmlbeans.XmlString incidentCommander)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTCOMMANDER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTCOMMANDER$0);
            }
            target.set(incidentCommander);
        }
    }
    
    /**
     * Gets the "Deputy" element
     */
    public java.lang.String getDeputy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPUTY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Deputy" element
     */
    public org.apache.xmlbeans.XmlString xgetDeputy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPUTY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Deputy" element
     */
    public void setDeputy(java.lang.String deputy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPUTY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPUTY$2);
            }
            target.setStringValue(deputy);
        }
    }
    
    /**
     * Sets (as xml) the "Deputy" element
     */
    public void xsetDeputy(org.apache.xmlbeans.XmlString deputy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DEPUTY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DEPUTY$2);
            }
            target.set(deputy);
        }
    }
    
    /**
     * Gets the "SafetyOfficer" element
     */
    public java.lang.String getSafetyOfficer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAFETYOFFICER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SafetyOfficer" element
     */
    public org.apache.xmlbeans.XmlString xgetSafetyOfficer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAFETYOFFICER$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SafetyOfficer" element
     */
    public void setSafetyOfficer(java.lang.String safetyOfficer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SAFETYOFFICER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SAFETYOFFICER$4);
            }
            target.setStringValue(safetyOfficer);
        }
    }
    
    /**
     * Sets (as xml) the "SafetyOfficer" element
     */
    public void xsetSafetyOfficer(org.apache.xmlbeans.XmlString safetyOfficer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SAFETYOFFICER$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SAFETYOFFICER$4);
            }
            target.set(safetyOfficer);
        }
    }
    
    /**
     * Gets the "InformationOfficer" element
     */
    public java.lang.String getInformationOfficer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMATIONOFFICER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "InformationOfficer" element
     */
    public org.apache.xmlbeans.XmlString xgetInformationOfficer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INFORMATIONOFFICER$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "InformationOfficer" element
     */
    public void setInformationOfficer(java.lang.String informationOfficer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMATIONOFFICER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFORMATIONOFFICER$6);
            }
            target.setStringValue(informationOfficer);
        }
    }
    
    /**
     * Sets (as xml) the "InformationOfficer" element
     */
    public void xsetInformationOfficer(org.apache.xmlbeans.XmlString informationOfficer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INFORMATIONOFFICER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INFORMATIONOFFICER$6);
            }
            target.set(informationOfficer);
        }
    }
    
    /**
     * Gets the "LiasonOfficer" element
     */
    public java.lang.String getLiasonOfficer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIASONOFFICER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LiasonOfficer" element
     */
    public org.apache.xmlbeans.XmlString xgetLiasonOfficer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIASONOFFICER$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LiasonOfficer" element
     */
    public void setLiasonOfficer(java.lang.String liasonOfficer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIASONOFFICER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIASONOFFICER$8);
            }
            target.setStringValue(liasonOfficer);
        }
    }
    
    /**
     * Sets (as xml) the "LiasonOfficer" element
     */
    public void xsetLiasonOfficer(org.apache.xmlbeans.XmlString liasonOfficer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LIASONOFFICER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LIASONOFFICER$8);
            }
            target.set(liasonOfficer);
        }
    }
}
