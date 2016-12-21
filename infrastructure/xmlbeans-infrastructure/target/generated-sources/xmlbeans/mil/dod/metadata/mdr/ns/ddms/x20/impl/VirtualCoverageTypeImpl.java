/*
 * XML Type:  VirtualCoverageType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML VirtualCoverageType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class VirtualCoverageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.VirtualCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public VirtualCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROTOCOL$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "protocol");
    private static final javax.xml.namespace.QName ADDRESS$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "address");
    
    
    /**
     * Gets the "protocol" attribute
     */
    public java.lang.String getProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROTOCOL$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "protocol" attribute
     */
    public org.apache.xmlbeans.XmlString xgetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROTOCOL$0);
            return target;
        }
    }
    
    /**
     * True if has "protocol" attribute
     */
    public boolean isSetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROTOCOL$0) != null;
        }
    }
    
    /**
     * Sets the "protocol" attribute
     */
    public void setProtocol(java.lang.String protocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROTOCOL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROTOCOL$0);
            }
            target.setStringValue(protocol);
        }
    }
    
    /**
     * Sets (as xml) the "protocol" attribute
     */
    public void xsetProtocol(org.apache.xmlbeans.XmlString protocol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(PROTOCOL$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(PROTOCOL$0);
            }
            target.set(protocol);
        }
    }
    
    /**
     * Unsets the "protocol" attribute
     */
    public void unsetProtocol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROTOCOL$0);
        }
    }
    
    /**
     * Gets the "address" attribute
     */
    public java.lang.String getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESS$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESS$2);
            return target;
        }
    }
    
    /**
     * True if has "address" attribute
     */
    public boolean isSetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ADDRESS$2) != null;
        }
    }
    
    /**
     * Sets the "address" attribute
     */
    public void setAddress(java.lang.String address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ADDRESS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ADDRESS$2);
            }
            target.setStringValue(address);
        }
    }
    
    /**
     * Sets (as xml) the "address" attribute
     */
    public void xsetAddress(org.apache.xmlbeans.XmlString address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ADDRESS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ADDRESS$2);
            }
            target.set(address);
        }
    }
    
    /**
     * Unsets the "address" attribute
     */
    public void unsetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ADDRESS$2);
        }
    }
}
