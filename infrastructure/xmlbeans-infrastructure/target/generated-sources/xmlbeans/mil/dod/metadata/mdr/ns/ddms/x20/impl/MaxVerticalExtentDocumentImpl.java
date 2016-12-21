/*
 * An XML document type.
 * Localname: MaxVerticalExtent
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.MaxVerticalExtentDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one MaxVerticalExtent(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class MaxVerticalExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.MaxVerticalExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public MaxVerticalExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXVERTICALEXTENT$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "MaxVerticalExtent");
    
    
    /**
     * Gets the "MaxVerticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType getMaxVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().find_element_user(MAXVERTICALEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MaxVerticalExtent" element
     */
    public void setMaxVerticalExtent(mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType maxVerticalExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().find_element_user(MAXVERTICALEXTENT$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().add_element_user(MAXVERTICALEXTENT$0);
            }
            target.set(maxVerticalExtent);
        }
    }
    
    /**
     * Appends and returns a new empty "MaxVerticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType addNewMaxVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().add_element_user(MAXVERTICALEXTENT$0);
            return target;
        }
    }
}
