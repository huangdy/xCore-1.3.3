/*
 * An XML document type.
 * Localname: SameAsPayloadReference
 * Namespace: ulex:message:library:1.0
 * Java type: x0.messageLibrary1.SameAsPayloadReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageLibrary1.impl;
/**
 * A document containing one SameAsPayloadReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class SameAsPayloadReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageLibrary1.SameAsPayloadReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SameAsPayloadReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAMEASPAYLOADREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "SameAsPayloadReference");
    
    
    /**
     * Gets the "SameAsPayloadReference" element
     */
    public x0.messageLibrary1.PayloadObjectReferenceType getSameAsPayloadReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.PayloadObjectReferenceType target = null;
            target = (x0.messageLibrary1.PayloadObjectReferenceType)get_store().find_element_user(SAMEASPAYLOADREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SameAsPayloadReference" element
     */
    public void setSameAsPayloadReference(x0.messageLibrary1.PayloadObjectReferenceType sameAsPayloadReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.PayloadObjectReferenceType target = null;
            target = (x0.messageLibrary1.PayloadObjectReferenceType)get_store().find_element_user(SAMEASPAYLOADREFERENCE$0, 0);
            if (target == null)
            {
                target = (x0.messageLibrary1.PayloadObjectReferenceType)get_store().add_element_user(SAMEASPAYLOADREFERENCE$0);
            }
            target.set(sameAsPayloadReference);
        }
    }
    
    /**
     * Appends and returns a new empty "SameAsPayloadReference" element
     */
    public x0.messageLibrary1.PayloadObjectReferenceType addNewSameAsPayloadReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.PayloadObjectReferenceType target = null;
            target = (x0.messageLibrary1.PayloadObjectReferenceType)get_store().add_element_user(SAMEASPAYLOADREFERENCE$0);
            return target;
        }
    }
}
