/*
 * XML Type:  CompoundSourceIdentifierType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.CompoundSourceIdentifierType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML CompoundSourceIdentifierType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class CompoundSourceIdentifierTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.CompoundSourceIdentifierType
{
    private static final long serialVersionUID = 1L;
    
    public CompoundSourceIdentifierTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUALIFIER$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "qualifier");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "value");
    private static final javax.xml.namespace.QName SCHEMAQUALIFIER$4 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "schemaQualifier");
    private static final javax.xml.namespace.QName SCHEMAHREF$6 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "schemaHref");
    
    
    /**
     * Gets the "qualifier" attribute
     */
    public java.lang.String getQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "qualifier" attribute
     */
    public org.apache.xmlbeans.XmlString xgetQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUALIFIER$0);
            return target;
        }
    }
    
    /**
     * True if has "qualifier" attribute
     */
    public boolean isSetQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QUALIFIER$0) != null;
        }
    }
    
    /**
     * Sets the "qualifier" attribute
     */
    public void setQualifier(java.lang.String qualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QUALIFIER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QUALIFIER$0);
            }
            target.setStringValue(qualifier);
        }
    }
    
    /**
     * Sets (as xml) the "qualifier" attribute
     */
    public void xsetQualifier(org.apache.xmlbeans.XmlString qualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(QUALIFIER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(QUALIFIER$0);
            }
            target.set(qualifier);
        }
    }
    
    /**
     * Unsets the "qualifier" attribute
     */
    public void unsetQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QUALIFIER$0);
        }
    }
    
    /**
     * Gets the "value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * True if has "value" attribute
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUE$2) != null;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
            }
            target.set(value);
        }
    }
    
    /**
     * Unsets the "value" attribute
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUE$2);
        }
    }
    
    /**
     * Gets the "schemaQualifier" attribute
     */
    public java.lang.String getSchemaQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMAQUALIFIER$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "schemaQualifier" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSchemaQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCHEMAQUALIFIER$4);
            return target;
        }
    }
    
    /**
     * True if has "schemaQualifier" attribute
     */
    public boolean isSetSchemaQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCHEMAQUALIFIER$4) != null;
        }
    }
    
    /**
     * Sets the "schemaQualifier" attribute
     */
    public void setSchemaQualifier(java.lang.String schemaQualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMAQUALIFIER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMAQUALIFIER$4);
            }
            target.setStringValue(schemaQualifier);
        }
    }
    
    /**
     * Sets (as xml) the "schemaQualifier" attribute
     */
    public void xsetSchemaQualifier(org.apache.xmlbeans.XmlString schemaQualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SCHEMAQUALIFIER$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SCHEMAQUALIFIER$4);
            }
            target.set(schemaQualifier);
        }
    }
    
    /**
     * Unsets the "schemaQualifier" attribute
     */
    public void unsetSchemaQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCHEMAQUALIFIER$4);
        }
    }
    
    /**
     * Gets the "schemaHref" attribute
     */
    public java.lang.String getSchemaHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMAHREF$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "schemaHref" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetSchemaHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SCHEMAHREF$6);
            return target;
        }
    }
    
    /**
     * True if has "schemaHref" attribute
     */
    public boolean isSetSchemaHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCHEMAHREF$6) != null;
        }
    }
    
    /**
     * Sets the "schemaHref" attribute
     */
    public void setSchemaHref(java.lang.String schemaHref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCHEMAHREF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCHEMAHREF$6);
            }
            target.setStringValue(schemaHref);
        }
    }
    
    /**
     * Sets (as xml) the "schemaHref" attribute
     */
    public void xsetSchemaHref(org.apache.xmlbeans.XmlAnyURI schemaHref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SCHEMAHREF$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SCHEMAHREF$6);
            }
            target.set(schemaHref);
        }
    }
    
    /**
     * Unsets the "schemaHref" attribute
     */
    public void unsetSchemaHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCHEMAHREF$6);
        }
    }
}
