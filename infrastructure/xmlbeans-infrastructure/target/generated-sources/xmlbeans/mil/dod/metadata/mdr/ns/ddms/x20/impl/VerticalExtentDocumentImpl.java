/*
 * An XML document type.
 * Localname: verticalExtent
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one verticalExtent(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class VerticalExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public VerticalExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERTICALEXTENT$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "verticalExtent");
    
    
    /**
     * Gets the "verticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType getVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType)get_store().find_element_user(VERTICALEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "verticalExtent" element
     */
    public void setVerticalExtent(mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType verticalExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType)get_store().find_element_user(VERTICALEXTENT$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType)get_store().add_element_user(VERTICALEXTENT$0);
            }
            target.set(verticalExtent);
        }
    }
    
    /**
     * Appends and returns a new empty "verticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType addNewVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalExtentType)get_store().add_element_user(VERTICALEXTENT$0);
            return target;
        }
    }
}
