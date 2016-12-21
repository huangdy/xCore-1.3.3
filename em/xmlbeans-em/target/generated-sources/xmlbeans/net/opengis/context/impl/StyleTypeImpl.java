/*
 * XML Type:  StyleType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.StyleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML StyleType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class StyleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.StyleType
{
    private static final long serialVersionUID = 1L;
    
    public StyleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Name");
    private static final javax.xml.namespace.QName TITLE$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Title");
    private static final javax.xml.namespace.QName ABSTRACT$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "Abstract");
    private static final javax.xml.namespace.QName LEGENDURL$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "LegendURL");
    private static final javax.xml.namespace.QName SLD$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "SLD");
    private static final javax.xml.namespace.QName CURRENT$10 = 
        new javax.xml.namespace.QName("", "current");
    
    
    /**
     * Gets the "Name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "Title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$2) != 0;
        }
    }
    
    /**
     * Sets the "Title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$2);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "Title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$2);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "Title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$2, 0);
        }
    }
    
    /**
     * Gets the "Abstract" element
     */
    public java.lang.String getAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABSTRACT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Abstract" element
     */
    public org.apache.xmlbeans.XmlString xgetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABSTRACT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Abstract" element
     */
    public boolean isSetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABSTRACT$4) != 0;
        }
    }
    
    /**
     * Sets the "Abstract" element
     */
    public void setAbstract(java.lang.String xabstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABSTRACT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABSTRACT$4);
            }
            target.setStringValue(xabstract);
        }
    }
    
    /**
     * Sets (as xml) the "Abstract" element
     */
    public void xsetAbstract(org.apache.xmlbeans.XmlString xabstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABSTRACT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ABSTRACT$4);
            }
            target.set(xabstract);
        }
    }
    
    /**
     * Unsets the "Abstract" element
     */
    public void unsetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABSTRACT$4, 0);
        }
    }
    
    /**
     * Gets the "LegendURL" element
     */
    public net.opengis.context.URLType getLegendURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().find_element_user(LEGENDURL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LegendURL" element
     */
    public boolean isSetLegendURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGENDURL$6) != 0;
        }
    }
    
    /**
     * Sets the "LegendURL" element
     */
    public void setLegendURL(net.opengis.context.URLType legendURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().find_element_user(LEGENDURL$6, 0);
            if (target == null)
            {
                target = (net.opengis.context.URLType)get_store().add_element_user(LEGENDURL$6);
            }
            target.set(legendURL);
        }
    }
    
    /**
     * Appends and returns a new empty "LegendURL" element
     */
    public net.opengis.context.URLType addNewLegendURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.URLType target = null;
            target = (net.opengis.context.URLType)get_store().add_element_user(LEGENDURL$6);
            return target;
        }
    }
    
    /**
     * Unsets the "LegendURL" element
     */
    public void unsetLegendURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGENDURL$6, 0);
        }
    }
    
    /**
     * Gets the "SLD" element
     */
    public net.opengis.context.SLDType getSLD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.SLDType target = null;
            target = (net.opengis.context.SLDType)get_store().find_element_user(SLD$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SLD" element
     */
    public boolean isSetSLD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SLD$8) != 0;
        }
    }
    
    /**
     * Sets the "SLD" element
     */
    public void setSLD(net.opengis.context.SLDType sld)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.SLDType target = null;
            target = (net.opengis.context.SLDType)get_store().find_element_user(SLD$8, 0);
            if (target == null)
            {
                target = (net.opengis.context.SLDType)get_store().add_element_user(SLD$8);
            }
            target.set(sld);
        }
    }
    
    /**
     * Appends and returns a new empty "SLD" element
     */
    public net.opengis.context.SLDType addNewSLD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.SLDType target = null;
            target = (net.opengis.context.SLDType)get_store().add_element_user(SLD$8);
            return target;
        }
    }
    
    /**
     * Unsets the "SLD" element
     */
    public void unsetSLD()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SLD$8, 0);
        }
    }
    
    /**
     * Gets the "current" attribute
     */
    public boolean getCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENT$10);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "current" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CURRENT$10);
            return target;
        }
    }
    
    /**
     * True if has "current" attribute
     */
    public boolean isSetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CURRENT$10) != null;
        }
    }
    
    /**
     * Sets the "current" attribute
     */
    public void setCurrent(boolean current)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENT$10);
            }
            target.setBooleanValue(current);
        }
    }
    
    /**
     * Sets (as xml) the "current" attribute
     */
    public void xsetCurrent(org.apache.xmlbeans.XmlBoolean current)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CURRENT$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CURRENT$10);
            }
            target.set(current);
        }
    }
    
    /**
     * Unsets the "current" attribute
     */
    public void unsetCurrent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CURRENT$10);
        }
    }
}
