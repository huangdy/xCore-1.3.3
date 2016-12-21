/*
 * XML Type:  SameAsPayloadAssociationType
 * Namespace: ulex:message:library:1.0
 * Java type: x0.messageLibrary1.SameAsPayloadAssociationType
 *
 * Automatically generated - do not modify.
 */
package x0.messageLibrary1.impl;
/**
 * An XML SameAsPayloadAssociationType(@ulex:message:library:1.0).
 *
 * This is a complex type.
 */
public class SameAsPayloadAssociationTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageLibrary1.SameAsPayloadAssociationType
{
    private static final long serialVersionUID = 1L;
    
    public SameAsPayloadAssociationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTREFERENCE$0 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "ObjectReference");
    private static final javax.xml.namespace.QName PAYLOADOBJECTREFERENCE$2 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "PayloadObjectReference");
    private static final javax.xml.namespace.QName PAYLOADREFERENCE$4 = 
        new javax.xml.namespace.QName("ulex:message:library:1.0", "PayloadReference");
    
    
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
    
    /**
     * Gets the "PayloadObjectReference" element
     */
    public x0.messageLibrary1.NonValidatingReferenceType getPayloadObjectReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.NonValidatingReferenceType target = null;
            target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().find_element_user(PAYLOADOBJECTREFERENCE$2, 0);
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
            target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().find_element_user(PAYLOADOBJECTREFERENCE$2, 0);
            if (target == null)
            {
                target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().add_element_user(PAYLOADOBJECTREFERENCE$2);
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
            target = (x0.messageLibrary1.NonValidatingReferenceType)get_store().add_element_user(PAYLOADOBJECTREFERENCE$2);
            return target;
        }
    }
    
    /**
     * Gets the "PayloadReference" element
     */
    public x0.messageLibrary1.ValidatingReferenceType getPayloadReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageLibrary1.ValidatingReferenceType target = null;
            target = (x0.messageLibrary1.ValidatingReferenceType)get_store().find_element_user(PAYLOADREFERENCE$4, 0);
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
            target = (x0.messageLibrary1.ValidatingReferenceType)get_store().find_element_user(PAYLOADREFERENCE$4, 0);
            if (target == null)
            {
                target = (x0.messageLibrary1.ValidatingReferenceType)get_store().add_element_user(PAYLOADREFERENCE$4);
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
            target = (x0.messageLibrary1.ValidatingReferenceType)get_store().add_element_user(PAYLOADREFERENCE$4);
            return target;
        }
    }
}
