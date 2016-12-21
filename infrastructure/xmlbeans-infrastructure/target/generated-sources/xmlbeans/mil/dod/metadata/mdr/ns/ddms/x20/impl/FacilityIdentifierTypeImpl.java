/*
 * XML Type:  FacilityIdentifierType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML FacilityIdentifierType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class FacilityIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public FacilityIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BENUMBER$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "beNumber");
    private static final javax.xml.namespace.QName OSUFFIX$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "osuffix");
    
    
    /**
     * Gets the "beNumber" attribute
     */
    public java.lang.String getBeNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BENUMBER$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "beNumber" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBeNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BENUMBER$0);
            return target;
        }
    }
    
    /**
     * Sets the "beNumber" attribute
     */
    public void setBeNumber(java.lang.String beNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BENUMBER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BENUMBER$0);
            }
            target.setStringValue(beNumber);
        }
    }
    
    /**
     * Sets (as xml) the "beNumber" attribute
     */
    public void xsetBeNumber(org.apache.xmlbeans.XmlString beNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BENUMBER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BENUMBER$0);
            }
            target.set(beNumber);
        }
    }
    
    /**
     * Gets the "osuffix" attribute
     */
    public java.lang.String getOsuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSUFFIX$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "osuffix" attribute
     */
    public org.apache.xmlbeans.XmlString xgetOsuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSUFFIX$2);
            return target;
        }
    }
    
    /**
     * True if has "osuffix" attribute
     */
    public boolean isSetOsuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OSUFFIX$2) != null;
        }
    }
    
    /**
     * Sets the "osuffix" attribute
     */
    public void setOsuffix(java.lang.String osuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OSUFFIX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OSUFFIX$2);
            }
            target.setStringValue(osuffix);
        }
    }
    
    /**
     * Sets (as xml) the "osuffix" attribute
     */
    public void xsetOsuffix(org.apache.xmlbeans.XmlString osuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(OSUFFIX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(OSUFFIX$2);
            }
            target.set(osuffix);
        }
    }
    
    /**
     * Unsets the "osuffix" attribute
     */
    public void unsetOsuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OSUFFIX$2);
        }
    }
}
