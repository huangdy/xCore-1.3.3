/*
 * An XML document type.
 * Localname: Polygon
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.PolygonDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one Polygon(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class PolygonDocumentImpl extends gov.ucore.ucore.x20.impl.GeoLocationAbstractDocumentImpl implements gov.ucore.ucore.x20.PolygonDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolygonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGON$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "Polygon");
    
    
    /**
     * Gets the "Polygon" element
     */
    public gov.ucore.ucore.x20.PolygonType getPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PolygonType target = null;
            target = (gov.ucore.ucore.x20.PolygonType)get_store().find_element_user(POLYGON$0, 0);
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
    public void setPolygon(gov.ucore.ucore.x20.PolygonType polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PolygonType target = null;
            target = (gov.ucore.ucore.x20.PolygonType)get_store().find_element_user(POLYGON$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.PolygonType)get_store().add_element_user(POLYGON$0);
            }
            target.set(polygon);
        }
    }
    
    /**
     * Appends and returns a new empty "Polygon" element
     */
    public gov.ucore.ucore.x20.PolygonType addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.PolygonType target = null;
            target = (gov.ucore.ucore.x20.PolygonType)get_store().add_element_user(POLYGON$0);
            return target;
        }
    }
}
