/*
 * An XML document type.
 * Localname: AttachmentViewableIndicator
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.AttachmentViewableIndicatorDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one AttachmentViewableIndicator(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class AttachmentViewableIndicatorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.AttachmentViewableIndicatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttachmentViewableIndicatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTACHMENTVIEWABLEINDICATOR$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "AttachmentViewableIndicator");
    
    
    /**
     * Gets the "AttachmentViewableIndicator" element
     */
    public boolean getAttachmentViewableIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTVIEWABLEINDICATOR$0, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AttachmentViewableIndicator" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetAttachmentViewableIndicator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ATTACHMENTVIEWABLEINDICATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AttachmentViewableIndicator" element
     */
    public void setAttachmentViewableIndicator(boolean attachmentViewableIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENTVIEWABLEINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENTVIEWABLEINDICATOR$0);
            }
            target.setBooleanValue(attachmentViewableIndicator);
        }
    }
    
    /**
     * Sets (as xml) the "AttachmentViewableIndicator" element
     */
    public void xsetAttachmentViewableIndicator(org.apache.xmlbeans.XmlBoolean attachmentViewableIndicator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ATTACHMENTVIEWABLEINDICATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ATTACHMENTVIEWABLEINDICATOR$0);
            }
            target.set(attachmentViewableIndicator);
        }
    }
}
