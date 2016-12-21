/*
 * An XML document type.
 * Localname: PublishMessage
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PublishMessageDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one PublishMessage(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PublishMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.PublishMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public PublishMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHMESSAGE$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessage");
    
    
    /**
     * Gets the "PublishMessage" element
     */
    public x0.messageStructure1.PublishMessageType getPublishMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PublishMessageType target = null;
            target = (x0.messageStructure1.PublishMessageType)get_store().find_element_user(PUBLISHMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PublishMessage" element
     */
    public void setPublishMessage(x0.messageStructure1.PublishMessageType publishMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PublishMessageType target = null;
            target = (x0.messageStructure1.PublishMessageType)get_store().find_element_user(PUBLISHMESSAGE$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.PublishMessageType)get_store().add_element_user(PUBLISHMESSAGE$0);
            }
            target.set(publishMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "PublishMessage" element
     */
    public x0.messageStructure1.PublishMessageType addNewPublishMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PublishMessageType target = null;
            target = (x0.messageStructure1.PublishMessageType)get_store().add_element_user(PUBLISHMESSAGE$0);
            return target;
        }
    }
}
