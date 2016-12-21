/*
 * An XML document type.
 * Localname: AbstractGeometricPrimitive
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractGeometricPrimitiveDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractGeometricPrimitive(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractGeometricPrimitiveDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeometryDocumentImpl implements net.opengis.gml.x32.AbstractGeometricPrimitiveDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractGeometricPrimitiveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTGEOMETRICPRIMITIVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTGEOMETRICPRIMITIVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon"),
    });
    
    
    /**
     * Gets the "AbstractGeometricPrimitive" element
     */
    public net.opengis.gml.x32.AbstractGeometricPrimitiveType getAbstractGeometricPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometricPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractGeometricPrimitiveType)get_store().find_element_user(ABSTRACTGEOMETRICPRIMITIVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractGeometricPrimitive" element
     */
    public void setAbstractGeometricPrimitive(net.opengis.gml.x32.AbstractGeometricPrimitiveType abstractGeometricPrimitive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometricPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractGeometricPrimitiveType)get_store().find_element_user(ABSTRACTGEOMETRICPRIMITIVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractGeometricPrimitiveType)get_store().add_element_user(ABSTRACTGEOMETRICPRIMITIVE$0);
            }
            target.set(abstractGeometricPrimitive);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractGeometricPrimitive" element
     */
    public net.opengis.gml.x32.AbstractGeometricPrimitiveType addNewAbstractGeometricPrimitive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractGeometricPrimitiveType target = null;
            target = (net.opengis.gml.x32.AbstractGeometricPrimitiveType)get_store().add_element_user(ABSTRACTGEOMETRICPRIMITIVE$0);
            return target;
        }
    }
}
