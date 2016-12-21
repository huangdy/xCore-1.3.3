/*
 * An XML document type.
 * Localname: Message
 * Namespace: http://www.saic.com/precis/2009/06/base
 * Java type: com.saic.precis.x2009.x06.base.MessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.precis.x2009.x06.base.impl;
/**
 * A document containing one Message(@http://www.saic.com/precis/2009/06/base) element.
 *
 * This is a complex type.
 */
public class MessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.precis.x2009.x06.base.MessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGE$0 = 
        new javax.xml.namespace.QName("http://www.saic.com/precis/2009/06/base", "Message");
    
    
    /**
     * Gets the "Message" element
     */
    public com.saic.precis.x2009.x06.base.UserMessageType getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.UserMessageType target = null;
            target = (com.saic.precis.x2009.x06.base.UserMessageType)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Message" element
     */
    public void setMessage(com.saic.precis.x2009.x06.base.UserMessageType message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.UserMessageType target = null;
            target = (com.saic.precis.x2009.x06.base.UserMessageType)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                target = (com.saic.precis.x2009.x06.base.UserMessageType)get_store().add_element_user(MESSAGE$0);
            }
            target.set(message);
        }
    }
    
    /**
     * Appends and returns a new empty "Message" element
     */
    public com.saic.precis.x2009.x06.base.UserMessageType addNewMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.precis.x2009.x06.base.UserMessageType target = null;
            target = (com.saic.precis.x2009.x06.base.UserMessageType)get_store().add_element_user(MESSAGE$0);
            return target;
        }
    }
}
