/*
 * An XML document type.
 * Localname: type
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.TypeDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one type(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class TypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.TypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public TypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "type");
    
    
    /**
     * Gets the "type" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundTypeIdentifierType getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundTypeIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundTypeIdentifierType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(mil.dod.metadata.mdr.ns.ddms.x20.CompoundTypeIdentifierType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundTypeIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundTypeIdentifierType)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundTypeIdentifierType)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Appends and returns a new empty "type" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundTypeIdentifierType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundTypeIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundTypeIdentifierType)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
}
