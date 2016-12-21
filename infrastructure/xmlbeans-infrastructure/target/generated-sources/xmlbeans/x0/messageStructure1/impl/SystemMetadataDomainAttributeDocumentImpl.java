/*
 * An XML document type.
 * Localname: SystemMetadataDomainAttribute
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.SystemMetadataDomainAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one SystemMetadataDomainAttribute(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class SystemMetadataDomainAttributeDocumentImpl extends x0.messageStructure1.impl.SystemMetadataExtensionAbstractDocumentImpl implements x0.messageStructure1.SystemMetadataDomainAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public SystemMetadataDomainAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYSTEMMETADATADOMAINATTRIBUTE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "SystemMetadataDomainAttribute");
    
    
    /**
     * Gets the "SystemMetadataDomainAttribute" element
     */
    public x0.messageStructure1.DomainAttributeType getSystemMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().find_element_user(SYSTEMMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SystemMetadataDomainAttribute" element
     */
    public void setSystemMetadataDomainAttribute(x0.messageStructure1.DomainAttributeType systemMetadataDomainAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().find_element_user(SYSTEMMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.DomainAttributeType)get_store().add_element_user(SYSTEMMETADATADOMAINATTRIBUTE$0);
            }
            target.set(systemMetadataDomainAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "SystemMetadataDomainAttribute" element
     */
    public x0.messageStructure1.DomainAttributeType addNewSystemMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().add_element_user(SYSTEMMETADATADOMAINATTRIBUTE$0);
            return target;
        }
    }
}
