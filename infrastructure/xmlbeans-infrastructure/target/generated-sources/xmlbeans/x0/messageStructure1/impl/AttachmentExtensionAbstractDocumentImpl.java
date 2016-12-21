/*
 * An XML document type.
 * Localname: AttachmentExtensionAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.AttachmentExtensionAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one AttachmentExtensionAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentExtensionAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.AttachmentExtensionAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentExtensionAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTEXTENSIONABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentExtensionAbstract");
    private static final org.apache.xmlbeans.QNameSet ATTACHMENTEXTENSIONABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AttachmentResourceMetadataExtension"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentDomainAttribute"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "AttachmentSecurityMetadata"),
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentExtensionAbstract"),
    });
    
    
    /**
     * Gets the "AttachmentExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getAttachmentExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ATTACHMENTEXTENSIONABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentExtensionAbstract" element
     */
    public void setAttachmentExtensionAbstract(org.apache.xmlbeans.XmlObject attachmentExtensionAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ATTACHMENTEXTENSIONABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ATTACHMENTEXTENSIONABSTRACT$0);
            }
            target.set(attachmentExtensionAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentExtensionAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewAttachmentExtensionAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ATTACHMENTEXTENSIONABSTRACT$0);
            return target;
        }
    }
}
