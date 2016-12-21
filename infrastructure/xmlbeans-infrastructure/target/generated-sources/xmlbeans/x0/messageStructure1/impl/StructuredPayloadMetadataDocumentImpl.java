/*
 * An XML document type.
 * Localname: StructuredPayloadMetadata
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.StructuredPayloadMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one StructuredPayloadMetadata(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class StructuredPayloadMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.StructuredPayloadMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructuredPayloadMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTUREDPAYLOADMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "StructuredPayloadMetadata");
    
    
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
}
