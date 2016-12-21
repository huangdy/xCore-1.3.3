/*
 * An XML document type.
 * Localname: SameAsDigestReference
 * Namespace: ulex:message:library:1.0
 * Java type: x0.messageLibrary1.SameAsDigestReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageLibrary1.impl;
/**
 * A document containing one SameAsDigestReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class SameAsDigestReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageLibrary1.SameAsDigestReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SameAsDigestReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SAMEASDIGESTREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "SameAsDigestReference");
    
    
    /**
     * Gets the "SameAsDigestReference" element
     */
    public x0.messageLibrary1.NonValidatingReferenceType getSameAsDigestReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.NonValidatingReferenceType target = null;
            target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().find_element_user(SAMEASDIGESTREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SameAsDigestReference" element
     */
    public void setSameAsDigestReference(x0.messageLibrary1.NonValidatingReferenceType sameAsDigestReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.NonValidatingReferenceType target = null;
            target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().find_element_user(SAMEASDIGESTREFERENCE$0, 0);
            if (target == null)
            {
                target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().add_element_user(SAMEASDIGESTREFERENCE$0);
            }
            target.set(sameAsDigestReference);
        }
    }
    
    /**
     * Appends and returns a new empty "SameAsDigestReference" element
     */
    public x0.messageLibrary1.NonValidatingReferenceType addNewSameAsDigestReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.NonValidatingReferenceType target = null;
            target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().add_element_user(SAMEASDIGESTREFERENCE$0);
            return target;
        }
    }
}
