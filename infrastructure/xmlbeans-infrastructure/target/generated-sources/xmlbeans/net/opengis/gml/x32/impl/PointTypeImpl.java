/*
 * XML Type:  PointType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.PointType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML PointType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class PointTypeImpl extends net.opengis.gml.x32.impl.AbstractGeometricPrimitiveTypeImpl implements net.opengis.gml.x32.PointType
{
    private static final long serialVersionUID = 1L;
    
    public PointTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pos");
    
    
    /**
     * Gets the "pos" element
     */
    public net.opengis.gml.x32.DirectPositionType getPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pos" element
     */
    public void setPos(net.opengis.gml.x32.DirectPositionType pos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().find_element_user(POS$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.DirectPositionType)get_store().add_element_user(POS$0);
            }
            target.set(pos);
        }
    }
    
    /**
     * Appends and returns a new empty "pos" element
     */
    public net.opengis.gml.x32.DirectPositionType addNewPos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.DirectPositionType target = null;
            target = (net.opengis.gml.x32.DirectPositionType)get_store().add_element_user(POS$0);
            return target;
        }
    }
}
