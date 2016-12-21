/*
 * An XML document type.
 * Localname: boundingGeometry
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one boundingGeometry(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class BoundingGeometryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoundingGeometryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDINGGEOMETRY$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "boundingGeometry");
    
    
    /**
     * Gets the "boundingGeometry" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType getBoundingGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType)get_store().find_element_user(BOUNDINGGEOMETRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "boundingGeometry" element
     */
    public void setBoundingGeometry(mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType boundingGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType)get_store().find_element_user(BOUNDINGGEOMETRY$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType)get_store().add_element_user(BOUNDINGGEOMETRY$0);
            }
            target.set(boundingGeometry);
        }
    }
    
    /**
     * Appends and returns a new empty "boundingGeometry" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType addNewBoundingGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType)get_store().add_element_user(BOUNDINGGEOMETRY$0);
            return target;
        }
    }
}
