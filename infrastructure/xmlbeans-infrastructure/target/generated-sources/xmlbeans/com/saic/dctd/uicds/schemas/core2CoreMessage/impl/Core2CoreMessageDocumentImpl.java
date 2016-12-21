/*
 * An XML document type.
 * Localname: Core2CoreMessage
 * Namespace: http://uicds.dctd.saic.com/schemas/Core2CoreMessage
 * Java type: com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.dctd.uicds.schemas.core2CoreMessage.impl;
/**
 * A document containing one Core2CoreMessage(@http://uicds.dctd.saic.com/schemas/Core2CoreMessage) element.
 *
 * This is a complex type.
 */
public class Core2CoreMessageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public Core2CoreMessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORE2COREMESSAGE$0 = 
        new javax.xml.namespace.QName("http://uicds.dctd.saic.com/schemas/Core2CoreMessage", "Core2CoreMessage");
    
    
    /**
     * Gets the "Core2CoreMessage" element
     */
    public com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType getCore2CoreMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType target = null;
            target = (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType)get_store().find_element_user(CORE2COREMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Core2CoreMessage" element
     */
    public void setCore2CoreMessage(com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType core2CoreMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType target = null;
            target = (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType)get_store().find_element_user(CORE2COREMESSAGE$0, 0);
            if (target == null)
            {
                target = (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType)get_store().add_element_user(CORE2COREMESSAGE$0);
            }
            target.set(core2CoreMessage);
        }
    }
    
    /**
     * Appends and returns a new empty "Core2CoreMessage" element
     */
    public com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType addNewCore2CoreMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType target = null;
            target = (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType)get_store().add_element_user(CORE2COREMESSAGE$0);
            return target;
        }
    }
}
