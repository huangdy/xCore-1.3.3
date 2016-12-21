/*
 * An XML document type.
 * Localname: PayloadReference
 * Namespace: ulex:message:library:1.0
 * Java type: x0.messageLibrary1.PayloadReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageLibrary1.impl;
/**
 * A document containing one PayloadReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class PayloadReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageLibrary1.PayloadReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public PayloadReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYLOADREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "PayloadReference");
    
    
    /**
     * Gets the "PayloadReference" element
     */
    public x0.messageLibrary1.ValidatingReferenceType getPayloadReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.ValidatingReferenceType target = null;
            target = (x0.messageLibrary1.ValidatingReferenceType)get_store().find_element_user(PAYLOADREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PayloadReference" element
     */
    public void setPayloadReference(x0.messageLibrary1.ValidatingReferenceType payloadReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.ValidatingReferenceType target = null;
            target = (x0.messageLibrary1.ValidatingReferenceType)get_store().find_element_user(PAYLOADREFERENCE$0, 0);
            if (target == null)
            {
                target = (x0.messageLibrary1.ValidatingReferenceType)get_store().add_element_user(PAYLOADREFERENCE$0);
            }
            target.set(payloadReference);
        }
    }
    
    /**
     * Appends and returns a new empty "PayloadReference" element
     */
    public x0.messageLibrary1.ValidatingReferenceType addNewPayloadReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.ValidatingReferenceType target = null;
            target = (x0.messageLibrary1.ValidatingReferenceType)get_store().add_element_user(PAYLOADREFERENCE$0);
            return target;
        }
    }
}
