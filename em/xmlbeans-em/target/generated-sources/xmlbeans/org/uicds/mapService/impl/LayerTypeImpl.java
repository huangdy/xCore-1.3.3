/*
 * XML Type:  LayerType
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.LayerType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService.impl;
/**
 * An XML LayerType(@http://uicds.org/MapService).
 *
 * This is a complex type.
 */
public class LayerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.mapService.LayerType
{
    private static final long serialVersionUID = 1L;
    
    public LayerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCIDENTID$0 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "IncidentId");
    private static final javax.xml.namespace.QName LAYERID$2 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "LayerId");
    private static final javax.xml.namespace.QName LAYER$4 = 
        new javax.xml.namespace.QName("http://uicds.org/MapService", "Layer");
    
    
    /**
     * Gets the "IncidentId" element
     */
    public java.lang.String getIncidentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IncidentId" element
     */
    public org.apache.xmlbeans.XmlString xgetIncidentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IncidentId" element
     */
    public void setIncidentId(java.lang.String incidentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCIDENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCIDENTID$0);
            }
            target.setStringValue(incidentId);
        }
    }
    
    /**
     * Sets (as xml) the "IncidentId" element
     */
    public void xsetIncidentId(org.apache.xmlbeans.XmlString incidentId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INCIDENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INCIDENTID$0);
            }
            target.set(incidentId);
        }
    }
    
    /**
     * Gets the "LayerId" element
     */
    public java.lang.String getLayerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAYERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "LayerId" element
     */
    public org.apache.xmlbeans.XmlString xgetLayerId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAYERID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LayerId" element
     */
    public void setLayerId(java.lang.String layerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LAYERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LAYERID$2);
            }
            target.setStringValue(layerId);
        }
    }
    
    /**
     * Sets (as xml) the "LayerId" element
     */
    public void xsetLayerId(org.apache.xmlbeans.XmlString layerId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LAYERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LAYERID$2);
            }
            target.set(layerId);
        }
    }
    
    /**
     * Gets the "Layer" element
     */
    public net.opengis.context.LayerType getLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.LayerType target = null;
            target = (net.opengis.context.LayerType)get_store().find_element_user(LAYER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Layer" element
     */
    public void setLayer(net.opengis.context.LayerType layer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.LayerType target = null;
            target = (net.opengis.context.LayerType)get_store().find_element_user(LAYER$4, 0);
            if (target == null)
            {
                target = (net.opengis.context.LayerType)get_store().add_element_user(LAYER$4);
            }
            target.set(layer);
        }
    }
    
    /**
     * Appends and returns a new empty "Layer" element
     */
    public net.opengis.context.LayerType addNewLayer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.LayerType target = null;
            target = (net.opengis.context.LayerType)get_store().add_element_user(LAYER$4);
            return target;
        }
    }
}
