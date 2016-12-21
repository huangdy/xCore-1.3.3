/*
 * An XML document type.
 * Localname: PayloadObjectReference
 * Namespace: ulex:message:library:1.0
 * Java type: x0.messageLibrary1.PayloadObjectReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageLibrary1.impl;
/**
 * A document containing one PayloadObjectReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class PayloadObjectReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageLibrary1.PayloadObjectReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public PayloadObjectReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYLOADOBJECTREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "PayloadObjectReference");
    
    
    /**
     * Gets the "PayloadObjectReference" element
     */
    public x0.messageLibrary1.NonValidatingReferenceType getPayloadObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.NonValidatingReferenceType target = null;
            target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().find_element_user(PAYLOADOBJECTREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PayloadObjectReference" element
     */
    public void setPayloadObjectReference(x0.messageLibrary1.NonValidatingReferenceType payloadObjectReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.NonValidatingReferenceType target = null;
            target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().find_element_user(PAYLOADOBJECTREFERENCE$0, 0);
            if (target == null)
            {
                target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().add_element_user(PAYLOADOBJECTREFERENCE$0);
            }
            target.set(payloadObjectReference);
        }
    }
    
    /**
     * Appends and returns a new empty "PayloadObjectReference" element
     */
    public x0.messageLibrary1.NonValidatingReferenceType addNewPayloadObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.NonValidatingReferenceType target = null;
            target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().add_element_user(PAYLOADOBJECTREFERENCE$0);
            return target;
        }
    }
}
