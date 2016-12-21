/*
 * XML Type:  PolygonPropertyType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis
 * Java type: x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonPropertyType
 *
 * Automatically generated - do not modify.
 */
package x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * An XML PolygonPropertyType(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis).
 *
 * This is a complex type.
 */
public class PolygonPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public PolygonPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGON$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon");
    
    
    /**
     * Gets the "Polygon" element
     */
    public net.opengis.gml.PolygonType getPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().find_element_user(POLYGON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Polygon" element
     */
    public void setPolygon(net.opengis.gml.PolygonType polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().find_element_user(POLYGON$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.PolygonType)get_store().add_element_user(POLYGON$0);
            }
            target.set(polygon);
        }
    }
    
    /**
     * Appends and returns a new empty "Polygon" element
     */
    public net.opengis.gml.PolygonType addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().add_element_user(POLYGON$0);
            return target;
        }
    }
}
