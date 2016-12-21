/*
 * An XML document type.
 * Localname: AbstractSurface
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractSurfaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractSurface(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractSurfaceDocumentImpl extends net.opengis.gml.x32.impl.AbstractGeometricPrimitiveDocumentImpl implements net.opengis.gml.x32.AbstractSurfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractSurfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTSURFACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurface");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTSURFACE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon"),
    });
    
    
    /**
     * Gets the "AbstractSurface" element
     */
    public net.opengis.gml.x32.AbstractSurfaceType getAbstractSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSurfaceType target = null;
            target = (net.opengis.gml.x32.AbstractSurfaceType)get_store().find_element_user(ABSTRACTSURFACE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractSurface" element
     */
    public void setAbstractSurface(net.opengis.gml.x32.AbstractSurfaceType abstractSurface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSurfaceType target = null;
            target = (net.opengis.gml.x32.AbstractSurfaceType)get_store().find_element_user(ABSTRACTSURFACE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractSurfaceType)get_store().add_element_user(ABSTRACTSURFACE$0);
            }
            target.set(abstractSurface);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractSurface" element
     */
    public net.opengis.gml.x32.AbstractSurfaceType addNewAbstractSurface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractSurfaceType target = null;
            target = (net.opengis.gml.x32.AbstractSurfaceType)get_store().add_element_user(ABSTRACTSURFACE$0);
            return target;
        }
    }
}
