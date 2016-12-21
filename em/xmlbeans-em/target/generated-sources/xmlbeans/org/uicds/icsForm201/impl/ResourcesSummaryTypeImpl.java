/*
 * XML Type:  ResourcesSummaryType
 * Namespace: http://uicds.org/ICSForm201
 * Java type: org.uicds.icsForm201.ResourcesSummaryType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.icsForm201.impl;
/**
 * An XML ResourcesSummaryType(@http://uicds.org/ICSForm201).
 *
 * This is a complex type.
 */
public class ResourcesSummaryTypeImpl extends gov.niem.niem.structures.x20.impl.ComplexObjectTypeImpl implements org.uicds.icsForm201.ResourcesSummaryType
{
    private static final long serialVersionUID = 1L;
    
    public ResourcesSummaryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCESORDERED$0 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "ResourcesOrdered");
    private static final javax.xml.namespace.QName RESOURCEIDENTIFICATION$2 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "ResourceIdentification");
    private static final javax.xml.namespace.QName ETA$4 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "ETA");
    private static final javax.xml.namespace.QName ONSCENE$6 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "OnScene");
    private static final javax.xml.namespace.QName LOCATIONASSIGNMENT$8 = 
        new javax.xml.namespace.QName("http://uicds.org/ICSForm201", "LocationAssignment");
    
    
    /**
     * Gets the "ResourcesOrdered" element
     */
    public java.lang.String getResourcesOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCESORDERED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResourcesOrdered" element
     */
    public org.apache.xmlbeans.XmlString xgetResourcesOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCESORDERED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ResourcesOrdered" element
     */
    public void setResourcesOrdered(java.lang.String resourcesOrdered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCESORDERED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCESORDERED$0);
            }
            target.setStringValue(resourcesOrdered);
        }
    }
    
    /**
     * Sets (as xml) the "ResourcesOrdered" element
     */
    public void xsetResourcesOrdered(org.apache.xmlbeans.XmlString resourcesOrdered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCESORDERED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOURCESORDERED$0);
            }
            target.set(resourcesOrdered);
        }
    }
    
    /**
     * Gets the "ResourceIdentification" element
     */
    public java.lang.String getResourceIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEIDENTIFICATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ResourceIdentification" element
     */
    public org.apache.xmlbeans.XmlString xgetResourceIdentification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCEIDENTIFICATION$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ResourceIdentification" element
     */
    public void setResourceIdentification(java.lang.String resourceIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESOURCEIDENTIFICATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESOURCEIDENTIFICATION$2);
            }
            target.setStringValue(resourceIdentification);
        }
    }
    
    /**
     * Sets (as xml) the "ResourceIdentification" element
     */
    public void xsetResourceIdentification(org.apache.xmlbeans.XmlString resourceIdentification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESOURCEIDENTIFICATION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESOURCEIDENTIFICATION$2);
            }
            target.set(resourceIdentification);
        }
    }
    
    /**
     * Gets the "ETA" element
     */
    public java.util.Calendar getETA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "ETA" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetETA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ETA$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ETA" element
     */
    public void setETA(java.util.Calendar eta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ETA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ETA$4);
            }
            target.setCalendarValue(eta);
        }
    }
    
    /**
     * Sets (as xml) the "ETA" element
     */
    public void xsetETA(org.apache.xmlbeans.XmlDateTime eta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ETA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ETA$4);
            }
            target.set(eta);
        }
    }
    
    /**
     * Gets the "OnScene" element
     */
    public boolean getOnScene()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ONSCENE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "OnScene" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOnScene()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ONSCENE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OnScene" element
     */
    public void setOnScene(boolean onScene)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ONSCENE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ONSCENE$6);
            }
            target.setBooleanValue(onScene);
        }
    }
    
    /**
     * Sets (as xml) the "OnScene" element
     */
    public void xsetOnScene(org.apache.xmlbeans.XmlBoolean onScene)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ONSCENE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ONSCENE$6);
            }
            target.set(onScene);
        }
    }
    
    /**
     * Gets the "LocationAssignment" element
     */
    public java.lang.String getLocationAssignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONASSIGNMENT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LocationAssignment" element
     */
    public org.apache.xmlbeans.XmlString xgetLocationAssignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONASSIGNMENT$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LocationAssignment" element
     */
    public void setLocationAssignment(java.lang.String locationAssignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCATIONASSIGNMENT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCATIONASSIGNMENT$8);
            }
            target.setStringValue(locationAssignment);
        }
    }
    
    /**
     * Sets (as xml) the "LocationAssignment" element
     */
    public void xsetLocationAssignment(org.apache.xmlbeans.XmlString locationAssignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LOCATIONASSIGNMENT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LOCATIONASSIGNMENT$8);
            }
            target.set(locationAssignment);
        }
    }
}
