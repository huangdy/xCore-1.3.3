/*
 * XML Type:  RelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.RelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML RelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class RelationshipTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.RelationshipType
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATA$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Metadata");
    private static final javax.xml.namespace.QName TIME$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Time");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets the "Metadata" element
     */
    public gov.ucore.ucore.x20.ContentMetadataType getMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ContentMetadataType target = null;
            target = (gov.ucore.ucore.x20.ContentMetadataType)get_store().find_element_user(METADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Metadata" element
     */
    public boolean isSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(METADATA$0) != 0;
        }
    }
    
    /**
     * Sets the "Metadata" element
     */
    public void setMetadata(gov.ucore.ucore.x20.ContentMetadataType metadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ContentMetadataType target = null;
            target = (gov.ucore.ucore.x20.ContentMetadataType)get_store().find_element_user(METADATA$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.ContentMetadataType)get_store().add_element_user(METADATA$0);
            }
            target.set(metadata);
        }
    }
    
    /**
     * Appends and returns a new empty "Metadata" element
     */
    public gov.ucore.ucore.x20.ContentMetadataType addNewMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.ContentMetadataType target = null;
            target = (gov.ucore.ucore.x20.ContentMetadataType)get_store().add_element_user(METADATA$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Metadata" element
     */
    public void unsetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(METADATA$0, 0);
        }
    }
    
    /**
     * Gets the "Time" element
     */
    public gov.ucore.ucore.x20.TimeType getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeType target = null;
            target = (gov.ucore.ucore.x20.TimeType)get_store().find_element_user(TIME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Time" element
     */
    public boolean isSetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIME$2) != 0;
        }
    }
    
    /**
     * Sets the "Time" element
     */
    public void setTime(gov.ucore.ucore.x20.TimeType time)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeType target = null;
            target = (gov.ucore.ucore.x20.TimeType)get_store().find_element_user(TIME$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.TimeType)get_store().add_element_user(TIME$2);
            }
            target.set(time);
        }
    }
    
    /**
     * Appends and returns a new empty "Time" element
     */
    public gov.ucore.ucore.x20.TimeType addNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.TimeType target = null;
            target = (gov.ucore.ucore.x20.TimeType)get_store().add_element_user(TIME$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Time" element
     */
    public void unsetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
}
