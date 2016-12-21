/*
 * XML Type:  LineStringType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LineStringType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * An XML LineStringType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class LineStringTypeImpl extends net.opengis.gml.impl.AbstractCurveTypeImpl implements net.opengis.gml.LineStringType
{
    private static final long serialVersionUID = 1L;
    
    public LineStringTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POSLIST$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "posList");
    
    
    /**
     * Gets the "posList" element
     */
    public net.opengis.gml.DirectPositionListType getPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionListType target = null;
            target = (net.opengis.gml.DirectPositionListType)get_store().find_element_user(POSLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "posList" element
     */
    public void setPosList(net.opengis.gml.DirectPositionListType posList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionListType target = null;
            target = (net.opengis.gml.DirectPositionListType)get_store().find_element_user(POSLIST$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.DirectPositionListType)get_store().add_element_user(POSLIST$0);
            }
            target.set(posList);
        }
    }
    
    /**
     * Appends and returns a new empty "posList" element
     */
    public net.opengis.gml.DirectPositionListType addNewPosList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectPositionListType target = null;
            target = (net.opengis.gml.DirectPositionListType)get_store().add_element_user(POSLIST$0);
            return target;
        }
    }
}
