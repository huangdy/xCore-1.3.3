/*
 * An XML document type.
 * Localname: Metadata
 * Namespace: http://niem.gov/niem/structures/2.0
 * Java type: gov.niem.niem.structures.x20.MetadataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.structures.x20.impl;
/**
 * A document containing one Metadata(@http://niem.gov/niem/structures/2.0) element.
 *
 * This is a complex type.
 */
public class MetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.niem.niem.structures.x20.MetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public MetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName METADATA$0 = 
        new javax.xml.namespace.QName("http://niem.gov/niem/structures/2.0", "Metadata");
    
    
    /**
     * Gets the "Metadata" element
     */
    public gov.niem.niem.structures.x20.MetadataType getMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.structures.x20.MetadataType target = null;
            target = (gov.niem.niem.structures.x20.MetadataType)get_store().find_element_user(METADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Metadata" element
     */
    public void setMetadata(gov.niem.niem.structures.x20.MetadataType metadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.structures.x20.MetadataType target = null;
            target = (gov.niem.niem.structures.x20.MetadataType)get_store().find_element_user(METADATA$0, 0);
            if (target == null)
            {
                target = (gov.niem.niem.structures.x20.MetadataType)get_store().add_element_user(METADATA$0);
            }
            target.set(metadata);
        }
    }
    
    /**
     * Appends and returns a new empty "Metadata" element
     */
    public gov.niem.niem.structures.x20.MetadataType addNewMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.niem.niem.structures.x20.MetadataType target = null;
            target = (gov.niem.niem.structures.x20.MetadataType)get_store().add_element_user(METADATA$0);
            return target;
        }
    }
}
