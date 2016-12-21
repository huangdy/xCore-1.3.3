/*
 * An XML document type.
 * Localname: PackageMetadata
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PackageMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one PackageMetadata(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PackageMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.PackageMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public PackageMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGEMETADATA$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadata");
    
    
    /**
     * Gets the "PackageMetadata" element
     */
    public x0.messageStructure1.PackageMetadataType getPackageMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PackageMetadataType target = null;
            target = (x0.messageStructure1.PackageMetadataType)get_store().find_element_user(PACKAGEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PackageMetadata" element
     */
    public void setPackageMetadata(x0.messageStructure1.PackageMetadataType packageMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PackageMetadataType target = null;
            target = (x0.messageStructure1.PackageMetadataType)get_store().find_element_user(PACKAGEMETADATA$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.PackageMetadataType)get_store().add_element_user(PACKAGEMETADATA$0);
            }
            target.set(packageMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "PackageMetadata" element
     */
    public x0.messageStructure1.PackageMetadataType addNewPackageMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PackageMetadataType target = null;
            target = (x0.messageStructure1.PackageMetadataType)get_store().add_element_user(PACKAGEMETADATA$0);
            return target;
        }
    }
}
