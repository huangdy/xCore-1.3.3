/*
 * XML Type:  LinePropertyType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis
 * Java type: x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LinePropertyType
 *
 * Automatically generated - do not modify.
 */
package x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * An XML LinePropertyType(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis).
 *
 * This is a complex type.
 */
public class LinePropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.LinePropertyType
{
    private static final long serialVersionUID = 1L;
    
    public LinePropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINESTRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString");
    
    
    /**
     * Gets the "LineString" element
     */
    public net.opengis.gml.LineStringType getLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringType target = null;
            target = (net.opengis.gml.LineStringType)get_store().find_element_user(LINESTRING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LineString" element
     */
    public void setLineString(net.opengis.gml.LineStringType lineString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringType target = null;
            target = (net.opengis.gml.LineStringType)get_store().find_element_user(LINESTRING$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.LineStringType)get_store().add_element_user(LINESTRING$0);
            }
            target.set(lineString);
        }
    }
    
    /**
     * Appends and returns a new empty "LineString" element
     */
    public net.opengis.gml.LineStringType addNewLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringType target = null;
            target = (net.opengis.gml.LineStringType)get_store().add_element_user(LINESTRING$0);
            return target;
        }
    }
}
