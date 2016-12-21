/*
 * An XML document type.
 * Localname: point
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis
 * Java type: x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PointDocument
 *
 * Automatically generated - do not modify.
 */
package x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * A document containing one point(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis) element.
 *
 * This is a complex type.
 */
public class PointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PointDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINT$0 = 
        new javax.xml.namespace.QName("urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis", "point");
    
    
    /**
     * Gets the "point" element
     */
    public x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PointPropertyType getPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PointPropertyType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PointPropertyType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "point" element
     */
    public void setPoint(x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PointPropertyType point)
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PointPropertyType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PointPropertyType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PointPropertyType)get_store().add_element_user(POINT$0);
            }
            target.set(point);
        }
    }
    
    /**
     * Appends and returns a new empty "point" element
     */
    public x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PointPropertyType addNewPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PointPropertyType target = null;
            target = (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.PointPropertyType)get_store().add_element_user(POINT$0);
            return target;
        }
    }
}
