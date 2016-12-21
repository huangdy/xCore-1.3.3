/*
 * XML Type:  CircleByCenterPointType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.CircleByCenterPointType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20.impl;
/**
 * An XML CircleByCenterPointType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public class CircleByCenterPointTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.ucore.ucore.x20.CircleByCenterPointType
{
    private static final long serialVersionUID = 1L;
    
    public CircleByCenterPointTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CIRCLEBYCENTERPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "CircleByCenterPoint");
    
    
    /**
     * Gets the "CircleByCenterPoint" element
     */
    public net.opengis.gml.x32.CircleByCenterPointType getCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CircleByCenterPointType target = null;
            target = (net.opengis.gml.x32.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CircleByCenterPoint" element
     */
    public void setCircleByCenterPoint(net.opengis.gml.x32.CircleByCenterPointType circleByCenterPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CircleByCenterPointType target = null;
            target = (net.opengis.gml.x32.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$0);
            }
            target.set(circleByCenterPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "CircleByCenterPoint" element
     */
    public net.opengis.gml.x32.CircleByCenterPointType addNewCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CircleByCenterPointType target = null;
            target = (net.opengis.gml.x32.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$0);
            return target;
        }
    }
}
