/*
 * XML Type:  ServerType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.ServerType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context.impl;
/**
 * An XML ServerType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public class ServerTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.context.ServerType
{
    private static final long serialVersionUID = 1L;
    
    public ServerTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ONLINERESOURCE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/context", "OnlineResource");
    private static final javax.xml.namespace.QName SERVICE$2 = 
        new javax.xml.namespace.QName("", "service");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("", "version");
    private static final javax.xml.namespace.QName TITLE$6 = 
        new javax.xml.namespace.QName("", "title");
    
    
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
     * Gets the "service" attribute
     */
    public net.opengis.context.ServiceType.Enum getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICE$2);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.context.ServiceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "service" attribute
     */
    public net.opengis.context.ServiceType xgetService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ServiceType target = null;
            target = (net.opengis.context.ServiceType)get_store().find_attribute_user(SERVICE$2);
            return target;
        }
    }
    
    /**
     * Sets the "service" attribute
     */
    public void setService(net.opengis.context.ServiceType.Enum service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICE$2);
            }
            target.setEnumValue(service);
        }
    }
    
    /**
     * Sets (as xml) the "service" attribute
     */
    public void xsetService(net.opengis.context.ServiceType service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.context.ServiceType target = null;
            target = (net.opengis.context.ServiceType)get_store().find_attribute_user(SERVICE$2);
            if (target == null)
            {
                target = (net.opengis.context.ServiceType)get_store().add_attribute_user(SERVICE$2);
            }
            target.set(service);
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
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$6);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$6) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$6);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$6);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$6);
        }
    }
}
