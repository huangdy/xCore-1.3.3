/*
 * XML Type:  DatesType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.DatesType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML DatesType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class DatesTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.DatesType
{
    private static final long serialVersionUID = 1L;
    
    public DatesTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATED$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "created");
    private static final javax.xml.namespace.QName POSTED$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "posted");
    private static final javax.xml.namespace.QName VALIDTIL$4 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "validTil");
    private static final javax.xml.namespace.QName INFOCUTOFF$6 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "infoCutOff");
    
    
    /**
     * Gets the "created" attribute
     */
    public java.util.Calendar getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATED$0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "created" attribute
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType xgetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType)get_store().find_attribute_user(CREATED$0);
            return target;
        }
    }
    
    /**
     * True if has "created" attribute
     */
    public boolean isSetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CREATED$0) != null;
        }
    }
    
    /**
     * Sets the "created" attribute
     */
    public void setCreated(java.util.Calendar created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CREATED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CREATED$0);
            }
            target.setCalendarValue(created);
        }
    }
    
    /**
     * Sets (as xml) the "created" attribute
     */
    public void xsetCreated(mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType)get_store().find_attribute_user(CREATED$0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType)get_store().add_attribute_user(CREATED$0);
            }
            target.set(created);
        }
    }
    
    /**
     * Unsets the "created" attribute
     */
    public void unsetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CREATED$0);
        }
    }
    
    /**
     * Gets the "posted" attribute
     */
    public java.util.Calendar getPosted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTED$2);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "posted" attribute
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType xgetPosted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType)get_store().find_attribute_user(POSTED$2);
            return target;
        }
    }
    
    /**
     * True if has "posted" attribute
     */
    public boolean isSetPosted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSTED$2) != null;
        }
    }
    
    /**
     * Sets the "posted" attribute
     */
    public void setPosted(java.util.Calendar posted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSTED$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSTED$2);
            }
            target.setCalendarValue(posted);
        }
    }
    
    /**
     * Sets (as xml) the "posted" attribute
     */
    public void xsetPosted(mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType posted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType)get_store().find_attribute_user(POSTED$2);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType)get_store().add_attribute_user(POSTED$2);
            }
            target.set(posted);
        }
    }
    
    /**
     * Unsets the "posted" attribute
     */
    public void unsetPosted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSTED$2);
        }
    }
    
    /**
     * Gets the "validTil" attribute
     */
    public java.util.Calendar getValidTil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTIL$4);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "validTil" attribute
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType xgetValidTil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType)get_store().find_attribute_user(VALIDTIL$4);
            return target;
        }
    }
    
    /**
     * True if has "validTil" attribute
     */
    public boolean isSetValidTil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIDTIL$4) != null;
        }
    }
    
    /**
     * Sets the "validTil" attribute
     */
    public void setValidTil(java.util.Calendar validTil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIDTIL$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIDTIL$4);
            }
            target.setCalendarValue(validTil);
        }
    }
    
    /**
     * Sets (as xml) the "validTil" attribute
     */
    public void xsetValidTil(mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType validTil)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType)get_store().find_attribute_user(VALIDTIL$4);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType)get_store().add_attribute_user(VALIDTIL$4);
            }
            target.set(validTil);
        }
    }
    
    /**
     * Unsets the "validTil" attribute
     */
    public void unsetValidTil()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIDTIL$4);
        }
    }
    
    /**
     * Gets the "infoCutOff" attribute
     */
    public java.util.Calendar getInfoCutOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INFOCUTOFF$6);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "infoCutOff" attribute
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType xgetInfoCutOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType)get_store().find_attribute_user(INFOCUTOFF$6);
            return target;
        }
    }
    
    /**
     * True if has "infoCutOff" attribute
     */
    public boolean isSetInfoCutOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INFOCUTOFF$6) != null;
        }
    }
    
    /**
     * Sets the "infoCutOff" attribute
     */
    public void setInfoCutOff(java.util.Calendar infoCutOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INFOCUTOFF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INFOCUTOFF$6);
            }
            target.setCalendarValue(infoCutOff);
        }
    }
    
    /**
     * Sets (as xml) the "infoCutOff" attribute
     */
    public void xsetInfoCutOff(mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType infoCutOff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType)get_store().find_attribute_user(INFOCUTOFF$6);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CombinedDateType)get_store().add_attribute_user(INFOCUTOFF$6);
            }
            target.set(infoCutOff);
        }
    }
    
    /**
     * Unsets the "infoCutOff" attribute
     */
    public void unsetInfoCutOff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INFOCUTOFF$6);
        }
    }
}
