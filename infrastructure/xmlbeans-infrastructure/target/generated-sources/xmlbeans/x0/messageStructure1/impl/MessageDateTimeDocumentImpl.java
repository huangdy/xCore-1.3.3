/*
 * An XML document type.
 * Localname: MessageDateTime
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.MessageDateTimeDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one MessageDateTime(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class MessageDateTimeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.MessageDateTimeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageDateTimeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEDATETIME$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "MessageDateTime");
    
    
    /**
     * Gets the "MessageDateTime" element
     */
    public java.util.Calendar getMessageDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDATETIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "MessageDateTime" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetMessageDateTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MESSAGEDATETIME$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MessageDateTime" element
     */
    public void setMessageDateTime(java.util.Calendar messageDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDATETIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEDATETIME$0);
            }
            target.setCalendarValue(messageDateTime);
        }
    }
    
    /**
     * Sets (as xml) the "MessageDateTime" element
     */
    public void xsetMessageDateTime(org.apache.xmlbeans.XmlDateTime messageDateTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MESSAGEDATETIME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(MESSAGEDATETIME$0);
            }
            target.set(messageDateTime);
        }
    }
}
