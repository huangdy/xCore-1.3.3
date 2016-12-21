/*
 * An XML document type.
 * Localname: AttachmentDomainAttribute
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.AttachmentDomainAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one AttachmentDomainAttribute(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentDomainAttributeDocumentImpl extends x0.messageStructure1.impl.AttachmentExtensionAbstractDocumentImpl implements x0.messageStructure1.AttachmentDomainAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentDomainAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTDOMAINATTRIBUTE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentDomainAttribute");
    
    
    /**
     * Gets the "AttachmentDomainAttribute" element
     */
    public x0.messageStructure1.DomainAttributeType getAttachmentDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().find_element_user(ATTACHMENTDOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentDomainAttribute" element
     */
    public void setAttachmentDomainAttribute(x0.messageStructure1.DomainAttributeType attachmentDomainAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().find_element_user(ATTACHMENTDOMAINATTRIBUTE$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.DomainAttributeType)get_store().add_element_user(ATTACHMENTDOMAINATTRIBUTE$0);
            }
            target.set(attachmentDomainAttribute);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentDomainAttribute" element
     */
    public x0.messageStructure1.DomainAttributeType addNewAttachmentDomainAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.DomainAttributeType target = null;
            target = (x0.messageStructure1.DomainAttributeType)get_store().add_element_user(ATTACHMENTDOMAINATTRIBUTE$0);
            return target;
        }
    }
}
