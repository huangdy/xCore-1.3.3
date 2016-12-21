/*
 * An XML document type.
 * Localname: AttachmentDescriptionText
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.AttachmentDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one AttachmentDescriptionText(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentDescriptionTextDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.AttachmentDescriptionTextDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentDescriptionTextDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTDESCRIPTIONTEXT$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentDescriptionText");
    
    
    /**
     * Gets the "AttachmentDescriptionText" element
     */
    public java.lang.String getAttachmentDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttachmentDescriptionText" element
     */
    public org.apache.xmlbeans.XmlString xgetAttachmentDescriptionText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTACHMENTDESCRIPTIONTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentDescriptionText" element
     */
    public void setAttachmentDescriptionText(java.lang.String attachmentDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENTDESCRIPTIONTEXT$0);
            }
            target.setStringValue(attachmentDescriptionText);
        }
    }
    
    /**
     * Sets (as xml) the "AttachmentDescriptionText" element
     */
    public void xsetAttachmentDescriptionText(org.apache.xmlbeans.XmlString attachmentDescriptionText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTACHMENTDESCRIPTIONTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTACHMENTDESCRIPTIONTEXT$0);
            }
            target.set(attachmentDescriptionText);
        }
    }
}
