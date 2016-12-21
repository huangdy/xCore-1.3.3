/*
 * An XML document type.
 * Localname: AttachmentResourceMetadataExtension
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.AttachmentResourceMetadataExtensionDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one AttachmentResourceMetadataExtension(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class AttachmentResourceMetadataExtensionDocumentImpl extends x0.messageStructure1.impl.AttachmentExtensionAbstractDocumentImpl implements gov.ucore.ucore.x20.AttachmentResourceMetadataExtensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentResourceMetadataExtensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTRESOURCEMETADATAEXTENSION$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AttachmentResourceMetadataExtension");
    
    
    /**
     * Gets the "AttachmentResourceMetadataExtension" element
     */
    public gov.ucore.ucore.x20.AttachmentResourceMetadataType getAttachmentResourceMetadataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AttachmentResourceMetadataType target = null;
            target = (gov.ucore.ucore.x20.AttachmentResourceMetadataType)get_store().find_element_user(ATTACHMENTRESOURCEMETADATAEXTENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentResourceMetadataExtension" element
     */
    public void setAttachmentResourceMetadataExtension(gov.ucore.ucore.x20.AttachmentResourceMetadataType attachmentResourceMetadataExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AttachmentResourceMetadataType target = null;
            target = (gov.ucore.ucore.x20.AttachmentResourceMetadataType)get_store().find_element_user(ATTACHMENTRESOURCEMETADATAEXTENSION$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.AttachmentResourceMetadataType)get_store().add_element_user(ATTACHMENTRESOURCEMETADATAEXTENSION$0);
            }
            target.set(attachmentResourceMetadataExtension);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentResourceMetadataExtension" element
     */
    public gov.ucore.ucore.x20.AttachmentResourceMetadataType addNewAttachmentResourceMetadataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.AttachmentResourceMetadataType target = null;
            target = (gov.ucore.ucore.x20.AttachmentResourceMetadataType)get_store().add_element_user(ATTACHMENTRESOURCEMETADATAEXTENSION$0);
            return target;
        }
    }
}
