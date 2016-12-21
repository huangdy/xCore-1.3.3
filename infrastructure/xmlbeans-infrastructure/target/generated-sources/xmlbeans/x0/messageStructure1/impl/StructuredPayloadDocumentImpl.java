/*
 * An XML document type.
 * Localname: StructuredPayload
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.StructuredPayloadDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one StructuredPayload(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class StructuredPayloadDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.StructuredPayloadDocument
{
    private static final long serialVersionUID = 1L;
    
    public StructuredPayloadDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STRUCTUREDPAYLOAD$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "StructuredPayload");
    
    
    /**
     * Gets the "StructuredPayload" element
     */
    public x0.messageStructure1.StructuredPayloadType getStructuredPayload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.StructuredPayloadType target = null;
            target = (x0.messageStructure1.StructuredPayloadType)get_store().find_element_user(STRUCTUREDPAYLOAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "StructuredPayload" element
     */
    public void setStructuredPayload(x0.messageStructure1.StructuredPayloadType structuredPayload)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.StructuredPayloadType target = null;
            target = (x0.messageStructure1.StructuredPayloadType)get_store().find_element_user(STRUCTUREDPAYLOAD$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.StructuredPayloadType)get_store().add_element_user(STRUCTUREDPAYLOAD$0);
            }
            target.set(structuredPayload);
        }
    }
    
    /**
     * Appends and returns a new empty "StructuredPayload" element
     */
    public x0.messageStructure1.StructuredPayloadType addNewStructuredPayload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.StructuredPayloadType target = null;
            target = (x0.messageStructure1.StructuredPayloadType)get_store().add_element_user(STRUCTUREDPAYLOAD$0);
            return target;
        }
    }
}
