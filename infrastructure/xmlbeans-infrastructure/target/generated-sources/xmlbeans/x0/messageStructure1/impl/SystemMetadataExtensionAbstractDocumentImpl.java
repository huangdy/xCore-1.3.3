/*
 * An XML document type.
 * Localname: SystemMetadataExtensionAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.SystemMetadataExtensionAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one SystemMetadataExtensionAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class SystemMetadataExtensionAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.SystemMetadataExtensionAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public SystemMetadataExtensionAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMMETADATAEXTENSIONABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemMetadataExtensionAbstract");
    private static final org.apache.xmlbeans.QNameSet SYSTEMMETADATAEXTENSIONABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemMetadataExtensionAbstract"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemMetadataDomainAttribute"),
    });
    
    
    /**
     * Gets the "SystemMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getSystemMetadataExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SYSTEMMETADATAEXTENSIONABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystemMetadataExtensionAbstract" element
     */
    public void setSystemMetadataExtensionAbstract(org.apache.xmlbeans.XmlObject systemMetadataExtensionAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(SYSTEMMETADATAEXTENSIONABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SYSTEMMETADATAEXTENSIONABSTRACT$0);
            }
            target.set(systemMetadataExtensionAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "SystemMetadataExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewSystemMetadataExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(SYSTEMMETADATAEXTENSIONABSTRACT$0);
            return target;
        }
    }
}
