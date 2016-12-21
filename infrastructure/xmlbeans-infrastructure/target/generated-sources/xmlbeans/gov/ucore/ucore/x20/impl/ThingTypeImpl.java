/*
 * XML Type:  ThingType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.ThingType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML ThingType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class ThingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.ThingType
{
    private static final long serialVersionUID = 1L;
    
    public ThingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATA$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Metadata");
    private static final javax.xml.namespace.QName DESCRIPTOR$2 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Descriptor");
    private static final javax.xml.namespace.QName IDENTIFIER$4 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Identifier");
    private static final javax.xml.namespace.QName SIMPLEPROPERTY$6 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "SimpleProperty");
    private static final javax.xml.namespace.QName ID$8 = 
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
     * Gets the "Descriptor" element
     */
    public gov.ucore.ucore.x20.StringType getDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().find_element_user(DESCRIPTOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Descriptor" element
     */
    public boolean isSetDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTOR$2) != 0;
        }
    }
    
    /**
     * Sets the "Descriptor" element
     */
    public void setDescriptor(gov.ucore.ucore.x20.StringType descriptor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().find_element_user(DESCRIPTOR$2, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.StringType)get_store().add_element_user(DESCRIPTOR$2);
            }
            target.set(descriptor);
        }
    }
    
    /**
     * Appends and returns a new empty "Descriptor" element
     */
    public gov.ucore.ucore.x20.StringType addNewDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.StringType target = null;
            target = (gov.ucore.ucore.x20.StringType)get_store().add_element_user(DESCRIPTOR$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Descriptor" element
     */
    public void unsetDescriptor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTOR$2, 0);
        }
    }
    
    /**
     * Gets array of all "Identifier" elements
     */
    public gov.ucore.ucore.x20.IdentifierType[] getIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IDENTIFIER$4, targetList);
            gov.ucore.ucore.x20.IdentifierType[] result = new gov.ucore.ucore.x20.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Identifier" element
     */
    public gov.ucore.ucore.x20.IdentifierType getIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.IdentifierType target = null;
            target = (gov.ucore.ucore.x20.IdentifierType)get_store().find_element_user(IDENTIFIER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Identifier" element
     */
    public int sizeOfIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$4);
        }
    }
    
    /**
     * Sets array of all "Identifier" element
     */
    public void setIdentifierArray(gov.ucore.ucore.x20.IdentifierType[] identifierArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(identifierArray, IDENTIFIER$4);
        }
    }
    
    /**
     * Sets ith "Identifier" element
     */
    public void setIdentifierArray(int i, gov.ucore.ucore.x20.IdentifierType identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.IdentifierType target = null;
            target = (gov.ucore.ucore.x20.IdentifierType)get_store().find_element_user(IDENTIFIER$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(identifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
     */
    public gov.ucore.ucore.x20.IdentifierType insertNewIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.IdentifierType target = null;
            target = (gov.ucore.ucore.x20.IdentifierType)get_store().insert_element_user(IDENTIFIER$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Identifier" element
     */
    public gov.ucore.ucore.x20.IdentifierType addNewIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.IdentifierType target = null;
            target = (gov.ucore.ucore.x20.IdentifierType)get_store().add_element_user(IDENTIFIER$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Identifier" element
     */
    public void removeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$4, i);
        }
    }
    
    /**
     * Gets array of all "SimpleProperty" elements
     */
    public gov.ucore.ucore.x20.SimplePropertyType[] getSimplePropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SIMPLEPROPERTY$6, targetList);
            gov.ucore.ucore.x20.SimplePropertyType[] result = new gov.ucore.ucore.x20.SimplePropertyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SimpleProperty" element
     */
    public gov.ucore.ucore.x20.SimplePropertyType getSimplePropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.SimplePropertyType target = null;
            target = (gov.ucore.ucore.x20.SimplePropertyType)get_store().find_element_user(SIMPLEPROPERTY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SimpleProperty" element
     */
    public int sizeOfSimplePropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SIMPLEPROPERTY$6);
        }
    }
    
    /**
     * Sets array of all "SimpleProperty" element
     */
    public void setSimplePropertyArray(gov.ucore.ucore.x20.SimplePropertyType[] simplePropertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(simplePropertyArray, SIMPLEPROPERTY$6);
        }
    }
    
    /**
     * Sets ith "SimpleProperty" element
     */
    public void setSimplePropertyArray(int i, gov.ucore.ucore.x20.SimplePropertyType simpleProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.SimplePropertyType target = null;
            target = (gov.ucore.ucore.x20.SimplePropertyType)get_store().find_element_user(SIMPLEPROPERTY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(simpleProperty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SimpleProperty" element
     */
    public gov.ucore.ucore.x20.SimplePropertyType insertNewSimpleProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.SimplePropertyType target = null;
            target = (gov.ucore.ucore.x20.SimplePropertyType)get_store().insert_element_user(SIMPLEPROPERTY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SimpleProperty" element
     */
    public gov.ucore.ucore.x20.SimplePropertyType addNewSimpleProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.SimplePropertyType target = null;
            target = (gov.ucore.ucore.x20.SimplePropertyType)get_store().add_element_user(SIMPLEPROPERTY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "SimpleProperty" element
     */
    public void removeSimpleProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SIMPLEPROPERTY$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
            }
            target.set(id);
        }
    }
}
