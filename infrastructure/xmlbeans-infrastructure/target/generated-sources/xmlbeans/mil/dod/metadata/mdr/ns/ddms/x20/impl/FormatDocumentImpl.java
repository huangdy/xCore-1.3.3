/*
 * An XML document type.
 * Localname: format
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.FormatDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one format(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class FormatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.FormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public FormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "format");
    
    
    /**
     * Gets the "format" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.FormatType getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.FormatType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.FormatType)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "format" element
     */
    public void setFormat(mil.dod.metadata.mdr.ns.ddms.x20.FormatType format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.FormatType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.FormatType)get_store().find_element_user(FORMAT$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.FormatType)get_store().add_element_user(FORMAT$0);
            }
            target.set(format);
        }
    }
    
    /**
     * Appends and returns a new empty "format" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.FormatType addNewFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.FormatType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.FormatType)get_store().add_element_user(FORMAT$0);
            return target;
        }
    }
}
