/*
 * An XML document type.
 * Localname: ArcByCenterPoint
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ArcByCenterPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one ArcByCenterPoint(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class ArcByCenterPointDocumentImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentDocumentImpl implements net.opengis.gml.x32.ArcByCenterPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcByCenterPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCBYCENTERPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByCenterPoint");
    private static final org.apache.xmlbeans.QNameSet ARCBYCENTERPOINT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByCenterPoint"),
    });
    
    
    /**
     * Gets the "ArcByCenterPoint" element
     */
    public net.opengis.gml.x32.ArcByCenterPointType getArcByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcByCenterPointType target = null;
            target = (net.opengis.gml.x32.ArcByCenterPointType)get_store().find_element_user(ARCBYCENTERPOINT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArcByCenterPoint" element
     */
    public void setArcByCenterPoint(net.opengis.gml.x32.ArcByCenterPointType arcByCenterPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcByCenterPointType target = null;
            target = (net.opengis.gml.x32.ArcByCenterPointType)get_store().find_element_user(ARCBYCENTERPOINT$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.ArcByCenterPointType)get_store().add_element_user(ARCBYCENTERPOINT$0);
            }
            target.set(arcByCenterPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "ArcByCenterPoint" element
     */
    public net.opengis.gml.x32.ArcByCenterPointType addNewArcByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.ArcByCenterPointType target = null;
            target = (net.opengis.gml.x32.ArcByCenterPointType)get_store().add_element_user(ARCBYCENTERPOINT$0);
            return target;
        }
    }
}
