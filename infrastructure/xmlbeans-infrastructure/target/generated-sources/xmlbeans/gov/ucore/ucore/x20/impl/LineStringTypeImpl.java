/*
 * XML Type:  LineStringType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.LineStringType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML LineStringType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class LineStringTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.LineStringType
{
    private static final long serialVersionUID = 1L;
    
    public LineStringTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINESTRING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineString");
    
    
    /**
     * Gets the "LineString" element
     */
    public net.opengis.gml.x32.LineStringType getLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringType target = null;
            target = (net.opengis.gml.x32.LineStringType)get_store().find_element_user(LINESTRING$0, 0);
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
    public void setLineString(net.opengis.gml.x32.LineStringType lineString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringType target = null;
            target = (net.opengis.gml.x32.LineStringType)get_store().find_element_user(LINESTRING$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.LineStringType)get_store().add_element_user(LINESTRING$0);
            }
            target.set(lineString);
        }
    }
    
    /**
     * Appends and returns a new empty "LineString" element
     */
    public net.opengis.gml.x32.LineStringType addNewLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LineStringType target = null;
            target = (net.opengis.gml.x32.LineStringType)get_store().add_element_user(LINESTRING$0);
            return target;
        }
    }
}
