/*
 * An XML document type.
 * Localname: DataOwnerMetadata
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.DataOwnerMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one DataOwnerMetadata(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class DataOwnerMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.DataOwnerMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public DataOwnerMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOWNERMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "DataOwnerMetadata");
    
    
    /**
     * Gets the "DataOwnerMetadata" element
     */
    public x0.messageStructure1.DataOwnerMetadataType getDataOwnerMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataOwnerMetadataType target = null;
            target = (x0.messageStructure1.DataOwnerMetadataType)get_store().find_element_user(DATAOWNERMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DataOwnerMetadata" element
     */
    public void setDataOwnerMetadata(x0.messageStructure1.DataOwnerMetadataType dataOwnerMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataOwnerMetadataType target = null;
            target = (x0.messageStructure1.DataOwnerMetadataType)get_store().find_element_user(DATAOWNERMETADATA$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.DataOwnerMetadataType)get_store().add_element_user(DATAOWNERMETADATA$0);
            }
            target.set(dataOwnerMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "DataOwnerMetadata" element
     */
    public x0.messageStructure1.DataOwnerMetadataType addNewDataOwnerMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DataOwnerMetadataType target = null;
            target = (x0.messageStructure1.DataOwnerMetadataType)get_store().add_element_user(DATAOWNERMETADATA$0);
            return target;
        }
    }
}
