/*
 * XML Type:  CoreConfigType
 * Namespace: http://uicds.org/CoreConfig
 * Java type: org.uicds.coreConfig.CoreConfigType
 *
 * Automatically generated - do not modify.
 */
package org.uicds.coreConfig.impl;
/**
 * An XML CoreConfigType(@http://uicds.org/CoreConfig).
 *
 * This is a complex type.
 */
public class CoreConfigTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.uicds.coreConfig.CoreConfigType
{
    private static final long serialVersionUID = 1L;
    
    public CoreConfigTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "name");
    private static final javax.xml.namespace.QName URL$2 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "URL");
    private static final javax.xml.namespace.QName ONLINESTATUS$4 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "OnlineStatus");
    private static final javax.xml.namespace.QName LOCALCORE$6 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "localCore");
    private static final javax.xml.namespace.QName LATITUDE$8 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "Latitude");
    private static final javax.xml.namespace.QName LONGITUDE$10 = 
        new javax.xml.namespace.QName("http://uicds.org/CoreConfig", "Longitude");
    
    
    /**
     * Gets the "name" element
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
     * Gets (as xml) the "name" element
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
     * Sets the "name" element
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
     * Sets (as xml) the "name" element
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
     * Gets the "URL" element
     */
    public java.lang.String getURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URL" element
     */
    public org.apache.xmlbeans.XmlString xgetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "URL" element
     */
    public void setURL(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$2);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "URL" element
     */
    public void xsetURL(org.apache.xmlbeans.XmlString url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$2);
            }
            target.set(url);
        }
    }
    
    /**
     * Gets the "OnlineStatus" element
     */
    public org.uicds.coreConfig.CoreStatusType.Enum getOnlineStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ONLINESTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return (org.uicds.coreConfig.CoreStatusType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "OnlineStatus" element
     */
    public org.uicds.coreConfig.CoreStatusType xgetOnlineStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreStatusType target = null;
            target = (org.uicds.coreConfig.CoreStatusType)get_store().find_element_user(ONLINESTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "OnlineStatus" element
     */
    public void setOnlineStatus(org.uicds.coreConfig.CoreStatusType.Enum onlineStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ONLINESTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ONLINESTATUS$4);
            }
            target.setEnumValue(onlineStatus);
        }
    }
    
    /**
     * Sets (as xml) the "OnlineStatus" element
     */
    public void xsetOnlineStatus(org.uicds.coreConfig.CoreStatusType onlineStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.uicds.coreConfig.CoreStatusType target = null;
            target = (org.uicds.coreConfig.CoreStatusType)get_store().find_element_user(ONLINESTATUS$4, 0);
            if (target == null)
            {
                target = (org.uicds.coreConfig.CoreStatusType)get_store().add_element_user(ONLINESTATUS$4);
            }
            target.set(onlineStatus);
        }
    }
    
    /**
     * Gets the "localCore" element
     */
    public boolean getLocalCore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALCORE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "localCore" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetLocalCore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOCALCORE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "localCore" element
     */
    public void setLocalCore(boolean localCore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALCORE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALCORE$6);
            }
            target.setBooleanValue(localCore);
        }
    }
    
    /**
     * Sets (as xml) the "localCore" element
     */
    public void xsetLocalCore(org.apache.xmlbeans.XmlBoolean localCore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(LOCALCORE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(LOCALCORE$6);
            }
            target.set(localCore);
        }
    }
    
    /**
     * Gets the "Latitude" element
     */
    public java.lang.String getLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Latitude" element
     */
    public org.apache.xmlbeans.XmlString xgetLatitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Latitude" element
     */
    public void setLatitude(java.lang.String latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LATITUDE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LATITUDE$8);
            }
            target.setStringValue(latitude);
        }
    }
    
    /**
     * Sets (as xml) the "Latitude" element
     */
    public void xsetLatitude(org.apache.xmlbeans.XmlString latitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LATITUDE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LATITUDE$8);
            }
            target.set(latitude);
        }
    }
    
    /**
     * Gets the "Longitude" element
     */
    public java.lang.String getLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Longitude" element
     */
    public org.apache.xmlbeans.XmlString xgetLongitude()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Longitude" element
     */
    public void setLongitude(java.lang.String longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LONGITUDE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LONGITUDE$10);
            }
            target.setStringValue(longitude);
        }
    }
    
    /**
     * Sets (as xml) the "Longitude" element
     */
    public void xsetLongitude(org.apache.xmlbeans.XmlString longitude)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LONGITUDE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LONGITUDE$10);
            }
            target.set(longitude);
        }
    }
}
