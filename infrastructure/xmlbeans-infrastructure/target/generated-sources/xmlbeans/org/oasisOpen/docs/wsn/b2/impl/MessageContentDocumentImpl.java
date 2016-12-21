/*
 * An XML document type.
 * Localname: MessageContent
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.MessageContentDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2.impl;
/**
 * A document containing one MessageContent(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public class MessageContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.oasisOpen.docs.wsn.b2.MessageContentDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGECONTENT$0 = 
        new javax.xml.namespace.QName("http://docs.oasis-open.org/wsn/b-2", "MessageContent");
    
    
    /**
     * Gets the "MessageContent" element
     */
    public org.oasisOpen.docs.wsn.b2.QueryExpressionType getMessageContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.QueryExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.QueryExpressionType)get_store().find_element_user(MESSAGECONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MessageContent" element
     */
    public void setMessageContent(org.oasisOpen.docs.wsn.b2.QueryExpressionType messageContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.QueryExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.QueryExpressionType)get_store().find_element_user(MESSAGECONTENT$0, 0);
            if (target == null)
            {
                target = (org.oasisOpen.docs.wsn.b2.QueryExpressionType)get_store().add_element_user(MESSAGECONTENT$0);
            }
            target.set(messageContent);
        }
    }
    
    /**
     * Appends and returns a new empty "MessageContent" element
     */
    public org.oasisOpen.docs.wsn.b2.QueryExpressionType addNewMessageContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.oasisOpen.docs.wsn.b2.QueryExpressionType target = null;
            target = (org.oasisOpen.docs.wsn.b2.QueryExpressionType)get_store().add_element_user(MESSAGECONTENT$0);
            return target;
        }
    }
}
