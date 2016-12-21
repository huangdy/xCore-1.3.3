/*
 * An XML document type.
 * Localname: Attachment
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.AttachmentDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one Attachment(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentDocumentImpl extends x0.messageStructure1.impl.PublishMessageItemAbstractDocumentImpl implements x0.messageStructure1.AttachmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "Attachment");
    
    
    /**
     * Gets the "Attachment" element
     */
    public x0.messageStructure1.AttachmentType getAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.AttachmentType target = null;
            target = (x0.messageStructure1.AttachmentType)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Attachment" element
     */
    public void setAttachment(x0.messageStructure1.AttachmentType attachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.AttachmentType target = null;
            target = (x0.messageStructure1.AttachmentType)get_store().find_element_user(ATTACHMENT$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.AttachmentType)get_store().add_element_user(ATTACHMENT$0);
            }
            target.set(attachment);
        }
    }
    
    /**
     * Appends and returns a new empty "Attachment" element
     */
    public x0.messageStructure1.AttachmentType addNewAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.AttachmentType target = null;
            target = (x0.messageStructure1.AttachmentType)get_store().add_element_user(ATTACHMENT$0);
            return target;
        }
    }
}
