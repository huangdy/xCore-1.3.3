/*
 * XML Type:  IncidentHeaderType
 * Namespace: http://uicds.org/ICSForm203
 * Java type: org.uicds.icsForm203.IncidentHeaderType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm203.impl;
/**
 * An XML IncidentHeaderType(@http://uicds.org/ICSForm203).
 *
 * This is a complex type.
 */
public class IncidentHeaderTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm203.IncidentHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public IncidentHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTNAME$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "IncidentName");
    private static final javax.xml.namespace.QName DATETIMEPREPARED$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "DateTimePrepared");
    private static final javax.xml.namespace.QName TIMEPREPARED$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm203", "TimePrepared");
    
    
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
     * Gets the "DateTimePrepared" element
     */
    public java.util.Calendar getDateTimePrepared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEPREPARED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DateTimePrepared" element
     */
    public org.apache.xmlbeans.XmlDate xgetDateTimePrepared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATETIMEPREPARED$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DateTimePrepared" element
     */
    public void setDateTimePrepared(java.util.Calendar dateTimePrepared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATETIMEPREPARED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATETIMEPREPARED$2);
            }
            target.setCalendarValue(dateTimePrepared);
        }
    }
    
    /**
     * Sets (as xml) the "DateTimePrepared" element
     */
    public void xsetDateTimePrepared(org.apache.xmlbeans.XmlDate dateTimePrepared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATETIMEPREPARED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATETIMEPREPARED$2);
            }
            target.set(dateTimePrepared);
        }
    }
    
    /**
     * Gets the "TimePrepared" element
     */
    public java.util.Calendar getTimePrepared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEPREPARED$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "TimePrepared" element
     */
    public org.apache.xmlbeans.XmlTime xgetTimePrepared()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIMEPREPARED$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TimePrepared" element
     */
    public void setTimePrepared(java.util.Calendar timePrepared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEPREPARED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEPREPARED$4);
            }
            target.setCalendarValue(timePrepared);
        }
    }
    
    /**
     * Sets (as xml) the "TimePrepared" element
     */
    public void xsetTimePrepared(org.apache.xmlbeans.XmlTime timePrepared)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(TIMEPREPARED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(TIMEPREPARED$4);
            }
            target.set(timePrepared);
        }
    }
}
