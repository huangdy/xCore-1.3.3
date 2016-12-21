/*
 * An XML document type.
 * Localname: AttachmentContentAbstract
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.AttachmentContentAbstractDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one AttachmentContentAbstract(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentContentAbstractDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.AttachmentContentAbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentContentAbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTCONTENTABSTRACT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentContentAbstract");
    private static final org.apache.xmlbeans.QNameSet ATTACHMENTCONTENTABSTRACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentContentAbstract"),
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "BinaryAttachment"),
    });
    
    
    /**
     * Gets the "AttachmentContentAbstract" element
     */
    public org.apache.xmlbeans.XmlObject getAttachmentContentAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ATTACHMENTCONTENTABSTRACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentContentAbstract" element
     */
    public void setAttachmentContentAbstract(org.apache.xmlbeans.XmlObject attachmentContentAbstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ATTACHMENTCONTENTABSTRACT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ATTACHMENTCONTENTABSTRACT$0);
            }
            target.set(attachmentContentAbstract);
        }
    }
    
    /**
     * Appends and returns a new empty "AttachmentContentAbstract" element
     */
    public org.apache.xmlbeans.XmlObject addNewAttachmentContentAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ATTACHMENTCONTENTABSTRACT$0);
            return target;
        }
    }
}
