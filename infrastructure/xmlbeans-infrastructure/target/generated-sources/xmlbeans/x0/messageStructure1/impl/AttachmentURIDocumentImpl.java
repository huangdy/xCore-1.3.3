/*
 * An XML document type.
 * Localname: AttachmentURI
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.AttachmentURIDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one AttachmentURI(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentURIDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.AttachmentURIDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentURIDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTURI$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentURI");
    
    
    /**
     * Gets the "AttachmentURI" element
     */
    public java.lang.String getAttachmentURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTURI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttachmentURI" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetAttachmentURI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ATTACHMENTURI$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentURI" element
     */
    public void setAttachmentURI(java.lang.String attachmentURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENTURI$0);
            }
            target.setStringValue(attachmentURI);
        }
    }
    
    /**
     * Sets (as xml) the "AttachmentURI" element
     */
    public void xsetAttachmentURI(org.apache.xmlbeans.XmlAnyURI attachmentURI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ATTACHMENTURI$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ATTACHMENTURI$0);
            }
            target.set(attachmentURI);
        }
    }
}
