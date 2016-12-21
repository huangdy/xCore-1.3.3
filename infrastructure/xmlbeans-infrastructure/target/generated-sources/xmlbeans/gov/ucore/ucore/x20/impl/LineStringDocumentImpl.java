/*
 * An XML document type.
 * Localname: LineString
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.LineStringDocument
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * A document containing one LineString(@http://ucore.gov/ucore/2.0) element.
 *
 * This is a complex type.
 */
public class LineStringDocumentImpl extends gov.ucore.ucore.x20.impl.GeoLocationAbstractDocumentImpl implements gov.ucore.ucore.x20.LineStringDocument
{
    private static final long serialVersionUID = 1L;
    
    public LineStringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINESTRING$0 = 
        new javax.xml.namespace.QName("http://ucore.gov/ucore/2.0", "LineString");
    
    
    /**
     * Gets the "LineString" element
     */
    public gov.ucore.ucore.x20.LineStringType getLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.LineStringType target = null;
            target = (gov.ucore.ucore.x20.LineStringType)get_store().find_element_user(LINESTRING$0, 0);
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
    public void setLineString(gov.ucore.ucore.x20.LineStringType lineString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.LineStringType target = null;
            target = (gov.ucore.ucore.x20.LineStringType)get_store().find_element_user(LINESTRING$0, 0);
            if (target == null)
            {
                target = (gov.ucore.ucore.x20.LineStringType)get_store().add_element_user(LINESTRING$0);
            }
            target.set(lineString);
        }
    }
    
    /**
     * Appends and returns a new empty "LineString" element
     */
    public gov.ucore.ucore.x20.LineStringType addNewLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.ucore.ucore.x20.LineStringType target = null;
            target = (gov.ucore.ucore.x20.LineStringType)get_store().add_element_user(LINESTRING$0);
            return target;
        }
    }
}
