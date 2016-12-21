/*
 * XML Type:  BasicRadioChannelUtilizationType
 * Namespace: http://uicds.org/ICSForm205
 * Java type: org.uicds.icsForm205.BasicRadioChannelUtilizationType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm205.impl;
/**
 * An XML BasicRadioChannelUtilizationType(@http://uicds.org/ICSForm205).
 *
 * This is a complex type.
 */
public class BasicRadioChannelUtilizationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.icsForm205.BasicRadioChannelUtilizationType
{
    private static final long serialVersionUID = 1L;
    
    public BasicRadioChannelUtilizationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMCACHE$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm205", "SystemCache");
    private static final javax.xml.namespace.QName CHANNEL$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm205", "Channel");
    private static final javax.xml.namespace.QName FUNCTION$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm205", "Function");
    private static final javax.xml.namespace.QName FREQUENCYTONE$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm205", "FrequencyTone");
    private static final javax.xml.namespace.QName ASSIGNMENT$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm205", "Assignment");
    private static final javax.xml.namespace.QName REMARKS$10 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm205", "Remarks");
    
    
    /**
     * Gets the "SystemCache" element
     */
    public java.lang.String getSystemCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMCACHE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SystemCache" element
     */
    public org.apache.xmlbeans.XmlString xgetSystemCache()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYSTEMCACHE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SystemCache" element
     */
    public void setSystemCache(java.lang.String systemCache)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMCACHE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMCACHE$0);
            }
            target.setStringValue(systemCache);
        }
    }
    
    /**
     * Sets (as xml) the "SystemCache" element
     */
    public void xsetSystemCache(org.apache.xmlbeans.XmlString systemCache)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYSTEMCACHE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYSTEMCACHE$0);
            }
            target.set(systemCache);
        }
    }
    
    /**
     * Gets the "Channel" element
     */
    public java.lang.String getChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNEL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Channel" element
     */
    public org.apache.xmlbeans.XmlString xgetChannel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANNEL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Channel" element
     */
    public void setChannel(java.lang.String channel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHANNEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHANNEL$2);
            }
            target.setStringValue(channel);
        }
    }
    
    /**
     * Sets (as xml) the "Channel" element
     */
    public void xsetChannel(org.apache.xmlbeans.XmlString channel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHANNEL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHANNEL$2);
            }
            target.set(channel);
        }
    }
    
    /**
     * Gets the "Function" element
     */
    public java.lang.String getFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNCTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Function" element
     */
    public org.apache.xmlbeans.XmlString xgetFunction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FUNCTION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Function" element
     */
    public void setFunction(java.lang.String function)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FUNCTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FUNCTION$4);
            }
            target.setStringValue(function);
        }
    }
    
    /**
     * Sets (as xml) the "Function" element
     */
    public void xsetFunction(org.apache.xmlbeans.XmlString function)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FUNCTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FUNCTION$4);
            }
            target.set(function);
        }
    }
    
    /**
     * Gets the "FrequencyTone" element
     */
    public java.lang.String getFrequencyTone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREQUENCYTONE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FrequencyTone" element
     */
    public org.apache.xmlbeans.XmlString xgetFrequencyTone()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREQUENCYTONE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FrequencyTone" element
     */
    public void setFrequencyTone(java.lang.String frequencyTone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FREQUENCYTONE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FREQUENCYTONE$6);
            }
            target.setStringValue(frequencyTone);
        }
    }
    
    /**
     * Sets (as xml) the "FrequencyTone" element
     */
    public void xsetFrequencyTone(org.apache.xmlbeans.XmlString frequencyTone)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FREQUENCYTONE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FREQUENCYTONE$6);
            }
            target.set(frequencyTone);
        }
    }
    
    /**
     * Gets the "Assignment" element
     */
    public java.lang.String getAssignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNMENT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Assignment" element
     */
    public org.apache.xmlbeans.XmlString xgetAssignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNMENT$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Assignment" element
     */
    public void setAssignment(java.lang.String assignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ASSIGNMENT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ASSIGNMENT$8);
            }
            target.setStringValue(assignment);
        }
    }
    
    /**
     * Sets (as xml) the "Assignment" element
     */
    public void xsetAssignment(org.apache.xmlbeans.XmlString assignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ASSIGNMENT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ASSIGNMENT$8);
            }
            target.set(assignment);
        }
    }
    
    /**
     * Gets the "Remarks" element
     */
    public java.lang.String getRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMARKS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Remarks" element
     */
    public org.apache.xmlbeans.XmlString xgetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REMARKS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Remarks" element
     */
    public boolean isSetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMARKS$10) != 0;
        }
    }
    
    /**
     * Sets the "Remarks" element
     */
    public void setRemarks(java.lang.String remarks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REMARKS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REMARKS$10);
            }
            target.setStringValue(remarks);
        }
    }
    
    /**
     * Sets (as xml) the "Remarks" element
     */
    public void xsetRemarks(org.apache.xmlbeans.XmlString remarks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REMARKS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REMARKS$10);
            }
            target.set(remarks);
        }
    }
    
    /**
     * Unsets the "Remarks" element
     */
    public void unsetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMARKS$10, 0);
        }
    }
}
