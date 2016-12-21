/*
 * An XML document type.
 * Localname: source
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.SourceDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one source(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class SourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.SourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "source");
    
    
    /**
     * Gets the "source" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundSourceIdentifierType getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundSourceIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundSourceIdentifierType)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(mil.dod.metadata.mdr.ns.ddms.x20.CompoundSourceIdentifierType source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundSourceIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundSourceIdentifierType)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundSourceIdentifierType)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
    
    /**
     * Appends and returns a new empty "source" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.CompoundSourceIdentifierType addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.CompoundSourceIdentifierType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.CompoundSourceIdentifierType)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
}
