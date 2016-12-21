/*
 * An XML document type.
 * Localname: AbstractObject
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractObjectDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractObject(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractObjectDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.x32.AbstractObjectDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractObjectDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTOBJECT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractObject");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTOBJECT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractObject"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractGML"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurveSegment"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Envelope"),
    });
    
    
    /**
     * Gets the "AbstractObject" element
     */
    public org.apache.xmlbeans.XmlObject getAbstractObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTOBJECT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractObject" element
     */
    public void setAbstractObject(org.apache.xmlbeans.XmlObject abstractObject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(ABSTRACTOBJECT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTOBJECT$0);
            }
            target.set(abstractObject);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractObject" element
     */
    public org.apache.xmlbeans.XmlObject addNewAbstractObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(ABSTRACTOBJECT$0);
            return target;
        }
    }
}
