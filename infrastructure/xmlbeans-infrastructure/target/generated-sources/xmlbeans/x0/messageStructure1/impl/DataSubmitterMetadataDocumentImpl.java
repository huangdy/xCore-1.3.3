/*
 * An XML document type.
 * Localname: DataSubmitterMetadata
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataSubmitterMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataSubmitterMetadata(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataSubmitterMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataSubmitterMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataSubmitterMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASUBMITTERMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataSubmitterMetadata");
    
    
    /**
     * Gets the "DataSubmitterMetadata" element
     */
    public x0.messageStructure1.SystemMetadataType getDataSubmitterMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.SystemMetadataType target = null;
            target = (x0.messageStructure1.SystemMetadataType)get_store().find_element_user(DATASUBMITTERMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataSubmitterMetadata" element
     */
    public void setDataSubmitterMetadata(x0.messageStructure1.SystemMetadataType dataSubmitterMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.SystemMetadataType target = null;
            target = (x0.messageStructure1.SystemMetadataType)get_store().find_element_user(DATASUBMITTERMETADATA$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.SystemMetadataType)get_store().add_element_user(DATASUBMITTERMETADATA$0);
            }
            target.set(dataSubmitterMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "DataSubmitterMetadata" element
     */
    public x0.messageStructure1.SystemMetadataType addNewDataSubmitterMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.SystemMetadataType target = null;
            target = (x0.messageStructure1.SystemMetadataType)get_store().add_element_user(DATASUBMITTERMETADATA$0);
            return target;
        }
    }
}
