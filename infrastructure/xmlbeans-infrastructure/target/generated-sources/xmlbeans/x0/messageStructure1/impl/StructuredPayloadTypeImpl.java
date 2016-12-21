/*
 * XML Type:  StructuredPayloadType
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.StructuredPayloadType
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * An XML StructuredPayloadType(@ulex:message:structure:1.0).
 *
 * This is a complex type.
 */
public class StructuredPayloadTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.StructuredPayloadType
{
    private static final long serialVersionUID = 1L;
    
    public StructuredPayloadTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTUREDPAYLOADMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "StructuredPayloadMetadata");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "id");
    
    
    /**
     * Gets the "StructuredPayloadMetadata" element
     */
    public x0.messageStructure1.StructuredPayloadMetadataType getStructuredPayloadMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.StructuredPayloadMetadataType target = null;
            target = (x0.messageStructure1.StructuredPayloadMetadataType)get_store().find_element_user(STRUCTUREDPAYLOADMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructuredPayloadMetadata" element
     */
    public void setStructuredPayloadMetadata(x0.messageStructure1.StructuredPayloadMetadataType structuredPayloadMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.StructuredPayloadMetadataType target = null;
            target = (x0.messageStructure1.StructuredPayloadMetadataType)get_store().find_element_user(STRUCTUREDPAYLOADMETADATA$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.StructuredPayloadMetadataType)get_store().add_element_user(STRUCTUREDPAYLOADMETADATA$0);
            }
            target.set(structuredPayloadMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuredPayloadMetadata" element
     */
    public x0.messageStructure1.StructuredPayloadMetadataType addNewStructuredPayloadMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.StructuredPayloadMetadataType target = null;
            target = (x0.messageStructure1.StructuredPayloadMetadataType)get_store().add_element_user(STRUCTUREDPAYLOADMETADATA$0);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$2);
        }
    }
}
