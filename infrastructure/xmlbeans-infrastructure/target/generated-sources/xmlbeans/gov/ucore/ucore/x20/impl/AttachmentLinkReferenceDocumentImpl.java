/*
 * An XML document type.
 * Localname: AttachmentLinkReference
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.AttachmentLinkReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one AttachmentLinkReference(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class AttachmentLinkReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.AttachmentLinkReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentLinkReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTLINKREFERENCE$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AttachmentLinkReference");
    
    
    /**
     * Gets the "AttachmentLinkReference" element
     */
    public x0.messageLibrary1.ValidatingReferenceType getAttachmentLinkReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.ValidatingReferenceType target = null;
            target = (x0.messageLibrary1.ValidatingReferenceType)get_store().find_element_user(ATTACHMENTLINKREFERENCE$0, 0);
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
    public void setAttachmentLinkReference(x0.messageLibrary1.ValidatingReferenceType attachmentLinkReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.ValidatingReferenceType target = null;
            target = (x0.messageLibrary1.ValidatingReferenceType)get_store().find_element_user(ATTACHMENTLINKREFERENCE$0, 0);
            if (target == null)
            {
                target = (x0.messageLibrary1.ValidatingReferenceType)get_store().add_element_user(ATTACHMENTLINKREFERENCE$0);
            }
            target.set(attachmentLinkReference);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentLinkReference" element
     */
    public x0.messageLibrary1.ValidatingReferenceType addNewAttachmentLinkReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.ValidatingReferenceType target = null;
            target = (x0.messageLibrary1.ValidatingReferenceType)get_store().add_element_user(ATTACHMENTLINKREFERENCE$0);
            return target;
        }
    }
}
