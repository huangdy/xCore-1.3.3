/*
 * An XML document type.
 * Localname: PackageMetadataExtensionAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PackageMetadataExtensionAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one PackageMetadataExtensionAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PackageMetadataExtensionAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.PackageMetadataExtensionAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public PackageMetadataExtensionAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGEMETADATAEXTENSIONABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadataExtensionAbstract");
    private static final org.apache.xmlbeans.QNameSet PACKAGEMETADATAEXTENSIONABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PackageResourceMetadataExtension"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "PackageSecurityMetadata"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadataDomainAttribute"),
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductIdentification"),
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/structures", "WorkProductProperties"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PackageMetadataExtensionAbstract"),
    });
    
    
    /**
     * Gets the "PackageMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getPackageMetadataExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PACKAGEMETADATAEXTENSIONABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PackageMetadataExtensionAbstract" element
     */
    public void setPackageMetadataExtensionAbstract(org.apache.xmlbeans.XmlObject packageMetadataExtensionAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PACKAGEMETADATAEXTENSIONABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PACKAGEMETADATAEXTENSIONABSTRACT$0);
            }
            target.set(packageMetadataExtensionAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "PackageMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewPackageMetadataExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PACKAGEMETADATAEXTENSIONABSTRACT$0);
            return target;
        }
    }
}
