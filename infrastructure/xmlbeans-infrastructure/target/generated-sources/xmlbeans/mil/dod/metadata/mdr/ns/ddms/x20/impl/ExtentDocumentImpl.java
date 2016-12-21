/*
 * An XML document type.
 * Localname: extent
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.ExtentDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * A document containing one extent(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public class ExtentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.ExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENT$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "extent");
    
    
    /**
     * Gets the "extent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    public void setExtent(mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType extent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType)get_store().add_element_user(EXTENT$0);
            }
            target.set(extent);
        }
    }
    
    /**
     * Appends and returns a new empty "extent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType addNewExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.QualifiedExtentValueType)get_store().add_element_user(EXTENT$0);
            return target;
        }
    }
}
