/*
 * An XML document type.
 * Localname: PublishMessageContainer
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.PublishMessageContainerDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one PublishMessageContainer(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class PublishMessageContainerDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.PublishMessageContainerDocument
{
    private static final long serialVersionUID = 1L;
    
    public PublishMessageContainerDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHMESSAGECONTAINER$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "PublishMessageContainer");
    
    
    /**
     * Gets the "PublishMessageContainer" element
     */
    public x0.messageStructure1.PublishMessageContainerType getPublishMessageContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PublishMessageContainerType target = null;
            target = (x0.messageStructure1.PublishMessageContainerType)get_store().find_element_user(PUBLISHMESSAGECONTAINER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PublishMessageContainer" element
     */
    public void setPublishMessageContainer(x0.messageStructure1.PublishMessageContainerType publishMessageContainer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PublishMessageContainerType target = null;
            target = (x0.messageStructure1.PublishMessageContainerType)get_store().find_element_user(PUBLISHMESSAGECONTAINER$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.PublishMessageContainerType)get_store().add_element_user(PUBLISHMESSAGECONTAINER$0);
            }
            target.set(publishMessageContainer);
        }
    }
    
    /**
     * Appends and returns a new empty "PublishMessageContainer" element
     */
    public x0.messageStructure1.PublishMessageContainerType addNewPublishMessageContainer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.PublishMessageContainerType target = null;
            target = (x0.messageStructure1.PublishMessageContainerType)get_store().add_element_user(PUBLISHMESSAGECONTAINER$0);
            return target;
        }
    }
}
