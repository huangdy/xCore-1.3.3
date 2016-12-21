/*
 * An XML document type.
 * Localname: PackageSecurityMetadata
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.PackageSecurityMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one PackageSecurityMetadata(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class PackageSecurityMetadataDocumentImpl extends x0.messageStructure1.impl.PackageMetadataExtensionAbstractDocumentImpl implements gov.ucore.ucore.x20.PackageSecurityMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public PackageSecurityMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGESECURITYMETADATA$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PackageSecurityMetadata");
    
    
    /**
     * Gets the "PackageSecurityMetadata" element
     */
    public gov.ucore.ucore.x20.PackageSecurityMetadataType getPackageSecurityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PackageSecurityMetadataType target = null;
            target = (gov.ucore.ucore.x20.PackageSecurityMetadataType)get_store().find_element_user(PACKAGESECURITYMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PackageSecurityMetadata" element
     */
    public void setPackageSecurityMetadata(gov.ucore.ucore.x20.PackageSecurityMetadataType packageSecurityMetadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PackageSecurityMetadataType target = null;
            target = (gov.ucore.ucore.x20.PackageSecurityMetadataType)get_store().find_element_user(PACKAGESECURITYMETADATA$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.PackageSecurityMetadataType)get_store().add_element_user(PACKAGESECURITYMETADATA$0);
            }
            target.set(packageSecurityMetadata);
        }
    }
    
    /**
     * Appends and returns a new empty "PackageSecurityMetadata" element
     */
    public gov.ucore.ucore.x20.PackageSecurityMetadataType addNewPackageSecurityMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PackageSecurityMetadataType target = null;
            target = (gov.ucore.ucore.x20.PackageSecurityMetadataType)get_store().add_element_user(PACKAGESECURITYMETADATA$0);
            return target;
        }
    }
}
