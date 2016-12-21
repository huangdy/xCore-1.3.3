/*
 * An XML document type.
 * Localname: Polygon
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PolygonDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Polygon(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PolygonDocumentImpl extends net.opengis.gml.x32.impl.AbstractSurfaceDocumentImpl implements net.opengis.gml.x32.PolygonDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolygonDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGON$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon");
    
    
    /**
     * Gets the "Polygon" element
     */
    public net.opengis.gml.x32.PolygonType getPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolygonType target = null;
            target = (net.opengis.gml.x32.PolygonType)get_store().find_element_user(POLYGON$0, 0);
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
    public void setPolygon(net.opengis.gml.x32.PolygonType polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolygonType target = null;
            target = (net.opengis.gml.x32.PolygonType)get_store().find_element_user(POLYGON$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.PolygonType)get_store().add_element_user(POLYGON$0);
            }
            target.set(polygon);
        }
    }
    
    /**
     * Appends and returns a new empty "Polygon" element
     */
    public net.opengis.gml.x32.PolygonType addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolygonType target = null;
            target = (net.opengis.gml.x32.PolygonType)get_store().add_element_user(POLYGON$0);
            return target;
        }
    }
}
