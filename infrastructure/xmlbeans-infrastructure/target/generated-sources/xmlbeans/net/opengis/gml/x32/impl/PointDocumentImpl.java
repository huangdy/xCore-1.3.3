/*
 * An XML document type.
 * Localname: Point
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one Point(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class PointDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeometricPrimitiveDocumentImpl implements net.opengis.gml.x32.PointDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point");
    
    
    /**
     * Gets the "Point" element
     */
    public net.opengis.gml.x32.PointType getPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointType target = null;
            target = (net.opengis.gml.x32.PointType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Point" element
     */
    public void setPoint(net.opengis.gml.x32.PointType point)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointType target = null;
            target = (net.opengis.gml.x32.PointType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.PointType)get_store().add_element_user(POINT$0);
            }
            target.set(point);
        }
    }
    
    /**
     * Appends and returns a new empty "Point" element
     */
    public net.opengis.gml.x32.PointType addNewPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointType target = null;
            target = (net.opengis.gml.x32.PointType)get_store().add_element_user(POINT$0);
            return target;
        }
    }
}
