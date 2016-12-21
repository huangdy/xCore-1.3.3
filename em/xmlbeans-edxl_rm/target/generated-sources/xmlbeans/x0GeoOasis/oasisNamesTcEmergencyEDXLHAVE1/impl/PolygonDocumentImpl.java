/*
 * An XML document type.
 * Localname: polygon
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis
 * Java type: x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonDocument
 *
 * Automatically generated - do not modify.
 */
package x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * A document containing one polygon(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis) element.
 *
 * This is a complex type.
 */
public class PolygonDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolygonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGON$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis", "polygon");
    
    
    /**
     * Gets the "polygon" element
     */
    public x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonPropertyType getPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonPropertyType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonPropertyType)get_store().find_element_user(POLYGON$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "polygon" element
     */
    public void setPolygon(x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonPropertyType polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonPropertyType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonPropertyType)get_store().find_element_user(POLYGON$0, 0);
            if (target == null)
            {
                target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonPropertyType)get_store().add_element_user(POLYGON$0);
            }
            target.set(polygon);
        }
    }
    
    /**
     * Appends and returns a new empty "polygon" element
     */
    public x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonPropertyType addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonPropertyType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PolygonPropertyType)get_store().add_element_user(POLYGON$0);
            return target;
        }
    }
}
