/*
 * An XML document type.
 * Localname: AbstractCurveSegment
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.AbstractCurveSegmentDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * A document containing one AbstractCurveSegment(@http://www.opengis.net/gml/3.2) element.
 *
 * This is a complex type.
 */
public class AbstractCurveSegmentDocumentImpl extends net.opengis.gml.x32.impl.AbstractObjectDocumentImpl implements net.opengis.gml.x32.AbstractCurveSegmentDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCurveSegmentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACTCURVESEGMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurveSegment");
    private static final org.apache.xmlbeans.QNameSet ABSTRACTCURVESEGMENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "ArcByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "AbstractCurveSegment"),
    });
    
    
    /**
     * Gets the "AbstractCurveSegment" element
     */
    public net.opengis.gml.x32.AbstractCurveSegmentType getAbstractCurveSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.x32.AbstractCurveSegmentType)get_store().find_element_user(ABSTRACTCURVESEGMENT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AbstractCurveSegment" element
     */
    public void setAbstractCurveSegment(net.opengis.gml.x32.AbstractCurveSegmentType abstractCurveSegment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.x32.AbstractCurveSegmentType)get_store().find_element_user(ABSTRACTCURVESEGMENT$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.AbstractCurveSegmentType)get_store().add_element_user(ABSTRACTCURVESEGMENT$0);
            }
            target.set(abstractCurveSegment);
        }
    }
    
    /**
     * Appends and returns a new empty "AbstractCurveSegment" element
     */
    public net.opengis.gml.x32.AbstractCurveSegmentType addNewAbstractCurveSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.x32.AbstractCurveSegmentType)get_store().add_element_user(ABSTRACTCURVESEGMENT$0);
            return target;
        }
    }
}
