/*
 * An XML document type.
 * Localname: ObjectReference
 * Namespace: ulex:message:library:1.0
 * Java type: x0.messageLibrary1.ObjectReferenceDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageLibrary1.impl;
/**
 * A document containing one ObjectReference(@ulex:message:library:1.0) element.
 *
 * This is a complex type.
 */
public class ObjectReferenceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageLibrary1.ObjectReferenceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectReferenceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "ObjectReference");
    
    
    /**
     * Gets the "ObjectReference" element
     */
    public x0.messageLibrary1.ValidatingReferenceType getObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.ValidatingReferenceType target = null;
            target = (x0.messageLibrary1.ValidatingReferenceType)get_store().find_element_user(OBJECTREFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ObjectReference" element
     */
    public void setObjectReference(x0.messageLibrary1.ValidatingReferenceType objectReference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.ValidatingReferenceType target = null;
            target = (x0.messageLibrary1.ValidatingReferenceType)get_store().find_element_user(OBJECTREFERENCE$0, 0);
            if (target == null)
            {
                target = (x0.messageLibrary1.ValidatingReferenceType)get_store().add_element_user(OBJECTREFERENCE$0);
            }
            target.set(objectReference);
        }
    }
    
    /**
     * Appends and returns a new empty "ObjectReference" element
     */
    public x0.messageLibrary1.ValidatingReferenceType addNewObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.ValidatingReferenceType target = null;
            target = (x0.messageLibrary1.ValidatingReferenceType)get_store().add_element_user(OBJECTREFERENCE$0);
            return target;
        }
    }
}
