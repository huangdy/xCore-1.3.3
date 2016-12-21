/*
 * An XML document type.
 * Localname: PDMessageMetadataDomainAttribute
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PDMessageMetadataDomainAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one PDMessageMetadataDomainAttribute(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PDMessageMetadataDomainAttributeDocumentImpl extends x0.messageStructure1.impl.PDMessageMetadataExtensionAbstractDocumentImpl implements x0.messageStructure1.PDMessageMetadataDomainAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public PDMessageMetadataDomainAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PDMESSAGEMETADATADOMAINATTRIBUTE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PDMessageMetadataDomainAttribute");
    
    
    /**
     * Gets the "PDMessageMetadataDomainAttribute" element
     */
    public x0.messageStructure1.DomainAttributeType getPDMessageMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().find_element_user(PDMESSAGEMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PDMessageMetadataDomainAttribute" element
     */
    public void setPDMessageMetadataDomainAttribute(x0.messageStructure1.DomainAttributeType pdMessageMetadataDomainAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().find_element_user(PDMESSAGEMETADATADOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.DomainAttributeType)get_store().add_element_user(PDMESSAGEMETADATADOMAINATTRIBUTE$0);
            }
            target.set(pdMessageMetadataDomainAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "PDMessageMetadataDomainAttribute" element
     */
    public x0.messageStructure1.DomainAttributeType addNewPDMessageMetadataDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().add_element_user(PDMESSAGEMETADATADOMAINATTRIBUTE$0);
            return target;
        }
    }
}
