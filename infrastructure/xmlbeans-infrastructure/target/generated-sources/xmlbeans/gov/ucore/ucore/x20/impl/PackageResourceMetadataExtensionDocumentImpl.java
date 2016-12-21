/*
 * An XML document type.
 * Localname: PackageResourceMetadataExtension
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.PackageResourceMetadataExtensionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one PackageResourceMetadataExtension(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class PackageResourceMetadataExtensionDocumentImpl extends x0.messageStructure1.impl.PackageMetadataExtensionAbstractDocumentImpl implements gov.ucore.ucore.x20.PackageResourceMetadataExtensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public PackageResourceMetadataExtensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGERESOURCEMETADATAEXTENSION$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PackageResourceMetadataExtension");
    
    
    /**
     * Gets the "PackageResourceMetadataExtension" element
     */
    public gov.ucore.ucore.x20.PackageResourceMetadataType getPackageResourceMetadataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PackageResourceMetadataType target = null;
            target = (gov.ucore.ucore.x20.PackageResourceMetadataType)get_store().find_element_user(PACKAGERESOURCEMETADATAEXTENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PackageResourceMetadataExtension" element
     */
    public void setPackageResourceMetadataExtension(gov.ucore.ucore.x20.PackageResourceMetadataType packageResourceMetadataExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PackageResourceMetadataType target = null;
            target = (gov.ucore.ucore.x20.PackageResourceMetadataType)get_store().find_element_user(PACKAGERESOURCEMETADATAEXTENSION$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.PackageResourceMetadataType)get_store().add_element_user(PACKAGERESOURCEMETADATAEXTENSION$0);
            }
            target.set(packageResourceMetadataExtension);
        }
    }
    
    /**
     * Appends and returns a new empty "PackageResourceMetadataExtension" element
     */
    public gov.ucore.ucore.x20.PackageResourceMetadataType addNewPackageResourceMetadataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PackageResourceMetadataType target = null;
            target = (gov.ucore.ucore.x20.PackageResourceMetadataType)get_store().add_element_user(PACKAGERESOURCEMETADATAEXTENSION$0);
            return target;
        }
    }
}
