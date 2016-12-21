/*
 * XML Type:  ViewContextType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.ViewContextType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML ViewContextType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class ViewContextTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.ViewContextType
{
    private static final long serialVersionUID = 1L;
    
    public ViewContextTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERAL$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "General");
    private static final javax.xml.namespace.QName LAYERLIST$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "LayerList");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "General" element
     */
    public net.opengis.context.GeneralType getGeneral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.GeneralType target = null;
            target = (net.opengis.context.GeneralType)get_store().find_element_user(GENERAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "General" element
     */
    public void setGeneral(net.opengis.context.GeneralType general)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.GeneralType target = null;
            target = (net.opengis.context.GeneralType)get_store().find_element_user(GENERAL$0, 0);
            if (target == null)
            {
                target = (net.opengis.context.GeneralType)get_store().add_element_user(GENERAL$0);
            }
            target.set(general);
        }
    }
    
    /**
     * Appends and returns a new empty "General" element
     */
    public net.opengis.context.GeneralType addNewGeneral()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.GeneralType target = null;
            target = (net.opengis.context.GeneralType)get_store().add_element_user(GENERAL$0);
            return target;
        }
    }
    
    /**
     * Gets the "LayerList" element
     */
    public net.opengis.context.LayerListType getLayerList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.LayerListType target = null;
            target = (net.opengis.context.LayerListType)get_store().find_element_user(LAYERLIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LayerList" element
     */
    public void setLayerList(net.opengis.context.LayerListType layerList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.LayerListType target = null;
            target = (net.opengis.context.LayerListType)get_store().find_element_user(LAYERLIST$2, 0);
            if (target == null)
            {
                target = (net.opengis.context.LayerListType)get_store().add_element_user(LAYERLIST$2);
            }
            target.set(layerList);
        }
    }
    
    /**
     * Appends and returns a new empty "LayerList" element
     */
    public net.opengis.context.LayerListType addNewLayerList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.LayerListType target = null;
            target = (net.opengis.context.LayerListType)get_store().add_element_user(LAYERLIST$2);
            return target;
        }
    }
    
    /**
     * Gets the "version" attribute
     */
    public java.lang.String getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public org.apache.xmlbeans.XmlString xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(VERSION$4);
            }
            return target;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.lang.String version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$4);
            }
            target.setStringValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(org.apache.xmlbeans.XmlString version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VERSION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VERSION$4);
            }
            target.set(version);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$6);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
}
