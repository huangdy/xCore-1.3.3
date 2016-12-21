/*
 * XML Type:  URLType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.URLType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML URLType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class URLTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.URLType
{
    private static final long serialVersionUID = 1L;
    
    public URLTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONLINERESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "OnlineResource");
    private static final javax.xml.namespace.QName WIDTH$2 = 
        new javax.xml.namespace.QName("", "width");
    private static final javax.xml.namespace.QName HEIGHT$4 = 
        new javax.xml.namespace.QName("", "height");
    private static final javax.xml.namespace.QName FORMAT$6 = 
        new javax.xml.namespace.QName("", "format");
    
    
    /**
     * Gets the "OnlineResource" element
     */
    public net.opengis.context.OnlineResourceType getOnlineResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.OnlineResourceType target = null;
            target = (net.opengis.context.OnlineResourceType)get_store().find_element_user(ONLINERESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OnlineResource" element
     */
    public void setOnlineResource(net.opengis.context.OnlineResourceType onlineResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.OnlineResourceType target = null;
            target = (net.opengis.context.OnlineResourceType)get_store().find_element_user(ONLINERESOURCE$0, 0);
            if (target == null)
            {
                target = (net.opengis.context.OnlineResourceType)get_store().add_element_user(ONLINERESOURCE$0);
            }
            target.set(onlineResource);
        }
    }
    
    /**
     * Appends and returns a new empty "OnlineResource" element
     */
    public net.opengis.context.OnlineResourceType addNewOnlineResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.OnlineResourceType target = null;
            target = (net.opengis.context.OnlineResourceType)get_store().add_element_user(ONLINERESOURCE$0);
            return target;
        }
    }
    
    /**
     * Gets the "width" attribute
     */
    public java.math.BigInteger getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "width" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(WIDTH$2);
            return target;
        }
    }
    
    /**
     * True if has "width" attribute
     */
    public boolean isSetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WIDTH$2) != null;
        }
    }
    
    /**
     * Sets the "width" attribute
     */
    public void setWidth(java.math.BigInteger width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$2);
            }
            target.setBigIntegerValue(width);
        }
    }
    
    /**
     * Sets (as xml) the "width" attribute
     */
    public void xsetWidth(org.apache.xmlbeans.XmlInteger width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(WIDTH$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(WIDTH$2);
            }
            target.set(width);
        }
    }
    
    /**
     * Unsets the "width" attribute
     */
    public void unsetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WIDTH$2);
        }
    }
    
    /**
     * Gets the "height" attribute
     */
    public java.math.BigInteger getHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "height" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(HEIGHT$4);
            return target;
        }
    }
    
    /**
     * True if has "height" attribute
     */
    public boolean isSetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEIGHT$4) != null;
        }
    }
    
    /**
     * Sets the "height" attribute
     */
    public void setHeight(java.math.BigInteger height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEIGHT$4);
            }
            target.setBigIntegerValue(height);
        }
    }
    
    /**
     * Sets (as xml) the "height" attribute
     */
    public void xsetHeight(org.apache.xmlbeans.XmlInteger height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(HEIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(HEIGHT$4);
            }
            target.set(height);
        }
    }
    
    /**
     * Unsets the "height" attribute
     */
    public void unsetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEIGHT$4);
        }
    }
    
    /**
     * Gets the "format" attribute
     */
    public java.lang.String getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "format" attribute
     */
    public org.apache.xmlbeans.XmlString xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$6);
            return target;
        }
    }
    
    /**
     * True if has "format" attribute
     */
    public boolean isSetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FORMAT$6) != null;
        }
    }
    
    /**
     * Sets the "format" attribute
     */
    public void setFormat(java.lang.String format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FORMAT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FORMAT$6);
            }
            target.setStringValue(format);
        }
    }
    
    /**
     * Sets (as xml) the "format" attribute
     */
    public void xsetFormat(org.apache.xmlbeans.XmlString format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(FORMAT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(FORMAT$6);
            }
            target.set(format);
        }
    }
    
    /**
     * Unsets the "format" attribute
     */
    public void unsetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FORMAT$6);
        }
    }
}
