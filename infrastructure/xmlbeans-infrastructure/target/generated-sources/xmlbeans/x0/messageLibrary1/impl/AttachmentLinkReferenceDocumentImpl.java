/*
 * An XML document type.
 * Localname: AttachmentLinkReference
 * Namespace: ulex:message:library:1.0
 * Java type: x0.messageLibrary1.AttachmentLinkReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageLibrary1.impl;
/**
 * A document containing one AttachmentLinkReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentLinkReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageLibrary1.AttachmentLinkReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentLinkReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTLINKREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "AttachmentLinkReference");
    
    
    /**
     * Gets the "AttachmentLinkReference" element
     */
    public x0.messageLibrary1.NonValidatingReferenceType getAttachmentLinkReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.NonValidatingReferenceType target = null;
            target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().find_element_user(ATTACHMENTLINKREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentLinkReference" element
     */
    public void setAttachmentLinkReference(x0.messageLibrary1.NonValidatingReferenceType attachmentLinkReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.NonValidatingReferenceType target = null;
            target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().find_element_user(ATTACHMENTLINKREFERENCE$0, 0);
            if (target == null)
            {
                target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().add_element_user(ATTACHMENTLINKREFERENCE$0);
            }
            target.set(attachmentLinkReference);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentLinkReference" element
     */
    public x0.messageLibrary1.NonValidatingReferenceType addNewAttachmentLinkReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.NonValidatingReferenceType target = null;
            target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().add_element_user(ATTACHMENTLINKREFERENCE$0);
            return target;
        }
    }
}
