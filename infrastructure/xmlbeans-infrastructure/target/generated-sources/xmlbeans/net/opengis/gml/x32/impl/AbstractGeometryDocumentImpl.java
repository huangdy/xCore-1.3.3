/*
 * An XML document type.
 * Localname: AbstractGeometry
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGeometryDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractGeometry(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractGeometryDocumentImpl extends net.opengis.gml.x32.impl.AbstractGMLDocumentImpl implements net.opengis.gml.x32.AbstractGeometryDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeometryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGEOMETRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometry");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGEOMETRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometry"),
    });
    
    
    /**
     * Gets the "AbstractGeometry" element
     */
    public net.opengis.gml.x32.AbstractGeometryType getAbstractGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometryType target = null;
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().find_element_user(ABSTRACTGEOMETRY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGeometry" element
     */
    public void setAbstractGeometry(net.opengis.gml.x32.AbstractGeometryType abstractGeometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometryType target = null;
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().find_element_user(ABSTRACTGEOMETRY$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGeometryType)get_store().add_element_user(ABSTRACTGEOMETRY$0);
            }
            target.set(abstractGeometry);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGeometry" element
     */
    public net.opengis.gml.x32.AbstractGeometryType addNewAbstractGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometryType target = null;
            target = (net.opengis.gml.x32.AbstractGeometryType)get_store().add_element_user(ABSTRACTGEOMETRY$0);
            return target;
        }
    }
}
