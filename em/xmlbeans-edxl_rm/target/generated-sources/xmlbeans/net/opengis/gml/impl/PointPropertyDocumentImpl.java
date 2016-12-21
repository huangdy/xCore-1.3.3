/*
 * An XML document type.
 * Localname: pointProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PointPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * A document containing one pointProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PointPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PointPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PointPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINTPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "pointProperty");
    
    
    /**
     * Gets the "pointProperty" element
     */
    public net.opengis.gml.PointPropertyType getPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().find_element_user(POINTPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pointProperty" element
     */
    public void setPointProperty(net.opengis.gml.PointPropertyType pointProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().find_element_user(POINTPROPERTY$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.PointPropertyType)get_store().add_element_user(POINTPROPERTY$0);
            }
            target.set(pointProperty);
        }
    }
    
    /**
     * Appends and returns a new empty "pointProperty" element
     */
    public net.opengis.gml.PointPropertyType addNewPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointPropertyType target = null;
            target = (net.opengis.gml.PointPropertyType)get_store().add_element_user(POINTPROPERTY$0);
            return target;
        }
    }
}
