/*
 * XML Type:  DoPublishType
 * Namespace: ulex:message:pd:1.0
 * Java type: x0.messagePd1.DoPublishType
 *
 * Automatically generated - do not modify.
 */
package x0.messagePd1.impl;
/**
 * An XML DoPublishType(@ulex:message:pd:1.0).
 *
 * This is a complex type.
 */
public class DoPublishTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messagePd1.DoPublishType
{
    private static final long serialVersionUID = 1L;
    
    public DoPublishTypeImpl(org.apache.xmlbeans.SchemaType sType)
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
