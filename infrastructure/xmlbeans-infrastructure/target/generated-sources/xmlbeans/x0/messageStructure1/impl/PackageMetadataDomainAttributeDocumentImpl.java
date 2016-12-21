/*
 * An XML document type.
 * Localname: PackageMetadataDomainAttribute
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PackageMetadataDomainAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one PackageMetadataDomainAttribute(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PackageMetadataDomainAttributeDocumentImpl extends x0.messageStructure1.impl.PackageMetadataExtensionAbstractDocumentImpl implements x0.messageStructure1.PackageMetadataDomainAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public PackageMetadataDomainAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGEMETADATADOMAINATTRIBUTE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadataDomainAttribute");
    
    
    /**
     * Gets the "PackageMetadataDomainAttribute" element
     */
    public x0.messageStructure1.DomainAttributeType getPackageMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().find_element_user(PACKAGEMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PackageMetadataDomainAttribute" element
     */
    public void setPackageMetadataDomainAttribute(x0.messageStructure1.DomainAttributeType packageMetadataDomainAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().find_element_user(PACKAGEMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.DomainAttributeType)get_store().add_element_user(PACKAGEMETADATADOMAINATTRIBUTE$0);
            }
            target.set(packageMetadataDomainAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "PackageMetadataDomainAttribute" element
     */
    public x0.messageStructure1.DomainAttributeType addNewPackageMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().add_element_user(PACKAGEMETADATADOMAINATTRIBUTE$0);
            return target;
        }
    }
}
