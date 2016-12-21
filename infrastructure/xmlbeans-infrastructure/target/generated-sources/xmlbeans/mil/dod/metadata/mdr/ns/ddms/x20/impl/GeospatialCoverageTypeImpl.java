/*
 * XML Type:  GeospatialCoverageType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.GeospatialCoverageType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML GeospatialCoverageType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class GeospatialCoverageTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.GeospatialCoverageType
{
    private static final long serialVersionUID = 1L;
    
    public GeospatialCoverageTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOSPATIALEXTENT$0 = 
        new javax.xml.namespace.QName("http://metadata.dod.mil/mdr/ns/DDMS/2.0/", "GeospatialExtent");
    
    
    /**
     * Gets the "GeospatialExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PlaceType getGeospatialExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PlaceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType)get_store().find_element_user(GEOSPATIALEXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GeospatialExtent" element
     */
    public void setGeospatialExtent(mil.dod.metadata.mdr.ns.ddms.x20.PlaceType geospatialExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PlaceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType)get_store().find_element_user(GEOSPATIALEXTENT$0, 0);
            if (target == null)
            {
                target = (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType)get_store().add_element_user(GEOSPATIALEXTENT$0);
            }
            target.set(geospatialExtent);
        }
    }
    
    /**
     * Appends and returns a new empty "GeospatialExtent" element
     */
    public mil.dod.metadata.mdr.ns.ddms.x20.PlaceType addNewGeospatialExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            mil.dod.metadata.mdr.ns.ddms.x20.PlaceType target = null;
            target = (mil.dod.metadata.mdr.ns.ddms.x20.PlaceType)get_store().add_element_user(GEOSPATIALEXTENT$0);
            return target;
        }
    }
}
