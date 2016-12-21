/*
 * An XML document type.
 * Localname: MessageSequenceNumber
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.MessageSequenceNumberDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one MessageSequenceNumber(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class MessageSequenceNumberDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.MessageSequenceNumberDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageSequenceNumberDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGESEQUENCENUMBER$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "MessageSequenceNumber");
    
    
    /**
     * Gets the "MessageSequenceNumber" element
     */
    public java.math.BigInteger getMessageSequenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGESEQUENCENUMBER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "MessageSequenceNumber" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetMessageSequenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MESSAGESEQUENCENUMBER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "MessageSequenceNumber" element
     */
    public void setMessageSequenceNumber(java.math.BigInteger messageSequenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGESEQUENCENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGESEQUENCENUMBER$0);
            }
            target.setBigIntegerValue(messageSequenceNumber);
        }
    }
    
    /**
     * Sets (as xml) the "MessageSequenceNumber" element
     */
    public void xsetMessageSequenceNumber(org.apache.xmlbeans.XmlNonNegativeInteger messageSequenceNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MESSAGESEQUENCENUMBER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(MESSAGESEQUENCENUMBER$0);
            }
            target.set(messageSequenceNumber);
        }
    }
}
