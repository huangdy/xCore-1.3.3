/*
 * An XML document type.
 * Localname: MinVerticalExtent
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.MinVerticalExtentDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one MinVerticalExtent(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class MinVerticalExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.MinVerticalExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public MinVerticalExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MINVERTICALEXTENT$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "MinVerticalExtent");
    
    
    /**
     * Gets the "MinVerticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType getMinVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().find_element_user(MINVERTICALEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MinVerticalExtent" element
     */
    public void setMinVerticalExtent(mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType minVerticalExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().find_element_user(MINVERTICALEXTENT$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().add_element_user(MINVERTICALEXTENT$0);
            }
            target.set(minVerticalExtent);
        }
    }
    
    /**
     * Appends and returns a new empty "MinVerticalExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType addNewMinVerticalExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.VerticalDistanceType)get_store().add_element_user(MINVERTICALEXTENT$0);
            return target;
        }
    }
}
