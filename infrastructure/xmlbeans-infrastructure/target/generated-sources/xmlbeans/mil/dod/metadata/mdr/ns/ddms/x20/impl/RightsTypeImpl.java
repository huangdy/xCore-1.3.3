/*
 * XML Type:  RightsType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.RightsType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML RightsType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class RightsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.RightsType
{
    private static final long serialVersionUID = 1L;
    
    public RightsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIVACYACT$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "privacyAct");
    private static final javax.xml.namespace.QName INTELLECTUALPROPERTY$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "intellectualProperty");
    private static final javax.xml.namespace.QName COPYRIGHT$4 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "copyright");
    
    
    /**
     * Gets the "privacyAct" attribute
     */
    public boolean getPrivacyAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIVACYACT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PRIVACYACT$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "privacyAct" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetPrivacyAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRIVACYACT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PRIVACYACT$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "privacyAct" attribute
     */
    public boolean isSetPrivacyAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PRIVACYACT$0) != null;
        }
    }
    
    /**
     * Sets the "privacyAct" attribute
     */
    public void setPrivacyAct(boolean privacyAct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PRIVACYACT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PRIVACYACT$0);
            }
            target.setBooleanValue(privacyAct);
        }
    }
    
    /**
     * Sets (as xml) the "privacyAct" attribute
     */
    public void xsetPrivacyAct(org.apache.xmlbeans.XmlBoolean privacyAct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PRIVACYACT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PRIVACYACT$0);
            }
            target.set(privacyAct);
        }
    }
    
    /**
     * Unsets the "privacyAct" attribute
     */
    public void unsetPrivacyAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PRIVACYACT$0);
        }
    }
    
    /**
     * Gets the "intellectualProperty" attribute
     */
    public boolean getIntellectualProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTELLECTUALPROPERTY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTELLECTUALPROPERTY$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "intellectualProperty" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIntellectualProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INTELLECTUALPROPERTY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(INTELLECTUALPROPERTY$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "intellectualProperty" attribute
     */
    public boolean isSetIntellectualProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTELLECTUALPROPERTY$2) != null;
        }
    }
    
    /**
     * Sets the "intellectualProperty" attribute
     */
    public void setIntellectualProperty(boolean intellectualProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTELLECTUALPROPERTY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTELLECTUALPROPERTY$2);
            }
            target.setBooleanValue(intellectualProperty);
        }
    }
    
    /**
     * Sets (as xml) the "intellectualProperty" attribute
     */
    public void xsetIntellectualProperty(org.apache.xmlbeans.XmlBoolean intellectualProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(INTELLECTUALPROPERTY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(INTELLECTUALPROPERTY$2);
            }
            target.set(intellectualProperty);
        }
    }
    
    /**
     * Unsets the "intellectualProperty" attribute
     */
    public void unsetIntellectualProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTELLECTUALPROPERTY$2);
        }
    }
    
    /**
     * Gets the "copyright" attribute
     */
    public boolean getCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPYRIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COPYRIGHT$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "copyright" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COPYRIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COPYRIGHT$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "copyright" attribute
     */
    public boolean isSetCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COPYRIGHT$4) != null;
        }
    }
    
    /**
     * Sets the "copyright" attribute
     */
    public void setCopyright(boolean copyright)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COPYRIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COPYRIGHT$4);
            }
            target.setBooleanValue(copyright);
        }
    }
    
    /**
     * Sets (as xml) the "copyright" attribute
     */
    public void xsetCopyright(org.apache.xmlbeans.XmlBoolean copyright)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COPYRIGHT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COPYRIGHT$4);
            }
            target.set(copyright);
        }
    }
    
    /**
     * Unsets the "copyright" attribute
     */
    public void unsetCopyright()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COPYRIGHT$4);
        }
    }
}
