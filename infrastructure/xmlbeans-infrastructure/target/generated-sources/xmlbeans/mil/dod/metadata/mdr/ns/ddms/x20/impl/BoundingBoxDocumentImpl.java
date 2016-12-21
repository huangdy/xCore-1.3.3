/*
 * An XML document type.
 * Localname: boundingBox
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one boundingBox(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class BoundingBoxDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxDocument
{
    private static final long serialVersionUID = 1L;
    
    public BoundingBoxDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOUNDINGBOX$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "boundingBox");
    
    
    /**
     * Gets the "boundingBox" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType getBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType)get_store().find_element_user(BOUNDINGBOX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "boundingBox" element
     */
    public void setBoundingBox(mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType boundingBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType)get_store().find_element_user(BOUNDINGBOX$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType)get_store().add_element_user(BOUNDINGBOX$0);
            }
            target.set(boundingBox);
        }
    }
    
    /**
     * Appends and returns a new empty "boundingBox" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType addNewBoundingBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.BoundingBoxType)get_store().add_element_user(BOUNDINGBOX$0);
            return target;
        }
    }
}
