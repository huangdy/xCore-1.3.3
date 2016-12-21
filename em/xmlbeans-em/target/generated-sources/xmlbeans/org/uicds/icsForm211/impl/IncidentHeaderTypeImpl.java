/*
 * XML Type:  IncidentHeaderType
 * Namespace: http://uicds.org/ICSForm211
 * Java type: org.uicds.icsForm211.IncidentHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm211.impl;
/**
 * An XML IncidentHeaderType(@http://uicds.org/ICSForm211).
 *
 * This is a complex type.
 */
public class IncidentHeaderTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm211.IncidentHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public IncidentHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTNAME$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "IncidentName");
    private static final javax.xml.namespace.QName BASE$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Base");
    private static final javax.xml.namespace.QName CAMP$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Camp");
    private static final javax.xml.namespace.QName STAGINGAREA$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "StagingArea");
    private static final javax.xml.namespace.QName ICPRESTAT$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "ICPRestat");
    private static final javax.xml.namespace.QName HELIBASE$10 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm211", "Helibase");
    
    
    /**
     * Gets the "IncidentName" element
     */
    public java.lang.String getIncidentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentName" element
     */
    public org.apache.xmlbeans.XmlString xgetIncidentName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNAME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IncidentName" element
     */
    public void setIncidentName(java.lang.String incidentName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTNAME$0);
            }
            target.setStringValue(incidentName);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentName" element
     */
    public void xsetIncidentName(org.apache.xmlbeans.XmlString incidentName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTNAME$0);
            }
            target.set(incidentName);
        }
    }
    
    /**
     * Gets the "Base" element
     */
    public boolean getBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASE$2, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Base" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BASE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Base" element
     */
    public void setBase(boolean base)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BASE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BASE$2);
            }
            target.setBooleanValue(base);
        }
    }
    
    /**
     * Sets (as xml) the "Base" element
     */
    public void xsetBase(org.apache.xmlbeans.XmlBoolean base)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BASE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BASE$2);
            }
            target.set(base);
        }
    }
    
    /**
     * Gets the "Camp" element
     */
    public boolean getCamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMP$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Camp" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetCamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CAMP$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Camp" element
     */
    public void setCamp(boolean camp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAMP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAMP$4);
            }
            target.setBooleanValue(camp);
        }
    }
    
    /**
     * Sets (as xml) the "Camp" element
     */
    public void xsetCamp(org.apache.xmlbeans.XmlBoolean camp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CAMP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CAMP$4);
            }
            target.set(camp);
        }
    }
    
    /**
     * Gets the "StagingArea" element
     */
    public boolean getStagingArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STAGINGAREA$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "StagingArea" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetStagingArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(STAGINGAREA$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "StagingArea" element
     */
    public void setStagingArea(boolean stagingArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STAGINGAREA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STAGINGAREA$6);
            }
            target.setBooleanValue(stagingArea);
        }
    }
    
    /**
     * Sets (as xml) the "StagingArea" element
     */
    public void xsetStagingArea(org.apache.xmlbeans.XmlBoolean stagingArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(STAGINGAREA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(STAGINGAREA$6);
            }
            target.set(stagingArea);
        }
    }
    
    /**
     * Gets the "ICPRestat" element
     */
    public boolean getICPRestat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICPRESTAT$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "ICPRestat" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetICPRestat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ICPRESTAT$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ICPRestat" element
     */
    public void setICPRestat(boolean icpRestat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ICPRESTAT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ICPRESTAT$8);
            }
            target.setBooleanValue(icpRestat);
        }
    }
    
    /**
     * Sets (as xml) the "ICPRestat" element
     */
    public void xsetICPRestat(org.apache.xmlbeans.XmlBoolean icpRestat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ICPRESTAT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ICPRESTAT$8);
            }
            target.set(icpRestat);
        }
    }
    
    /**
     * Gets the "Helibase" element
     */
    public boolean getHelibase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HELIBASE$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "Helibase" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetHelibase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HELIBASE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Helibase" element
     */
    public void setHelibase(boolean helibase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HELIBASE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HELIBASE$10);
            }
            target.setBooleanValue(helibase);
        }
    }
    
    /**
     * Sets (as xml) the "Helibase" element
     */
    public void xsetHelibase(org.apache.xmlbeans.XmlBoolean helibase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HELIBASE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HELIBASE$10);
            }
            target.set(helibase);
        }
    }
}
