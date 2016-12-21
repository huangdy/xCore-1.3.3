/*
 * An XML document type.
 * Localname: ULEXImplementation
 * Namespace: ulex:message:structure:1.0
 * Java type: x0.messageStructure1.ULEXImplementationDocument
 *
 * Automatically generated - do not modify.
 */
package x0.messageStructure1.impl;
/**
 * A document containing one ULEXImplementation(@ulex:message:structure:1.0) element.
 *
 * This is a complex type.
 */
public class ULEXImplementationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0.messageStructure1.ULEXImplementationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ULEXImplementationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ULEXIMPLEMENTATION$0 = 
        new javax.xml.namespace.QName("ulex:message:structure:1.0", "ULEXImplementation");
    
    
    /**
     * Gets the "ULEXImplementation" element
     */
    public x0.messageStructure1.ULEXImplementationType getULEXImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.ULEXImplementationType target = null;
            target = (x0.messageStructure1.ULEXImplementationType)get_store().find_element_user(ULEXIMPLEMENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ULEXImplementation" element
     */
    public void setULEXImplementation(x0.messageStructure1.ULEXImplementationType ulexImplementation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.ULEXImplementationType target = null;
            target = (x0.messageStructure1.ULEXImplementationType)get_store().find_element_user(ULEXIMPLEMENTATION$0, 0);
            if (target == null)
            {
                target = (x0.messageStructure1.ULEXImplementationType)get_store().add_element_user(ULEXIMPLEMENTATION$0);
            }
            target.set(ulexImplementation);
        }
    }
    
    /**
     * Appends and returns a new empty "ULEXImplementation" element
     */
    public x0.messageStructure1.ULEXImplementationType addNewULEXImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0.messageStructure1.ULEXImplementationType target = null;
            target = (x0.messageStructure1.ULEXImplementationType)get_store().add_element_user(ULEXIMPLEMENTATION$0);
            return target;
        }
    }
}
