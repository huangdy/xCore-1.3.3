/*
 * An XML document type.
 * Localname: AttachmentLink
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.AttachmentLinkDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one AttachmentLink(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentLinkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.AttachmentLinkDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentLinkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTLINK$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentLink");
    
    
    /**
     * Gets the "AttachmentLink" element
     */
    public x0.messageStructure1.AttachmentLinkType getAttachmentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.AttachmentLinkType target = null;
            target = (x0.messageStructure1.AttachmentLinkType)get_store().find_element_user(ATTACHMENTLINK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentLink" element
     */
    public void setAttachmentLink(x0.messageStructure1.AttachmentLinkType attachmentLink)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.AttachmentLinkType target = null;
            target = (x0.messageStructure1.AttachmentLinkType)get_store().find_element_user(ATTACHMENTLINK$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.AttachmentLinkType)get_store().add_element_user(ATTACHMENTLINK$0);
            }
            target.set(attachmentLink);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentLink" element
     */
    public x0.messageStructure1.AttachmentLinkType addNewAttachmentLink()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.AttachmentLinkType target = null;
            target = (x0.messageStructure1.AttachmentLinkType)get_store().add_element_user(ATTACHMENTLINK$0);
            return target;
        }
    }
}
