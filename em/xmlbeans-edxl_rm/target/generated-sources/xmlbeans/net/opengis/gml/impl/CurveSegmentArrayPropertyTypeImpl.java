/*
 * XML Type:  CurveSegmentArrayPropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CurveSegmentArrayPropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl;
/**
 * An XML CurveSegmentArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CurveSegmentArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CurveSegmentArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public CurveSegmentArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVESEGMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CurveSegment");
    private static final org.apache.xmlbeans.QNameSet CURVESEGMENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CircleByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CurveSegment"),
    });
    
    
    /**
     * Gets array of all "_CurveSegment" elements
     */
    public net.opengis.gml.AbstractCurveSegmentType[] getCurveSegmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CURVESEGMENT$1, targetList);
            net.opengis.gml.AbstractCurveSegmentType[] result = new net.opengis.gml.AbstractCurveSegmentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_CurveSegment" element
     */
    public net.opengis.gml.AbstractCurveSegmentType getCurveSegmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.AbstractCurveSegmentType)get_store().find_element_user(CURVESEGMENT$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_CurveSegment" element
     */
    public int sizeOfCurveSegmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CURVESEGMENT$1);
        }
    }
    
    /**
     * Sets array of all "_CurveSegment" element
     */
    public void setCurveSegmentArray(net.opengis.gml.AbstractCurveSegmentType[] curveSegmentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(curveSegmentArray, CURVESEGMENT$0, CURVESEGMENT$1);
        }
    }
    
    /**
     * Sets ith "_CurveSegment" element
     */
    public void setCurveSegmentArray(int i, net.opengis.gml.AbstractCurveSegmentType curveSegment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.AbstractCurveSegmentType)get_store().find_element_user(CURVESEGMENT$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(curveSegment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_CurveSegment" element
     */
    public net.opengis.gml.AbstractCurveSegmentType insertNewCurveSegment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.AbstractCurveSegmentType)get_store().insert_element_user(CURVESEGMENT$1, CURVESEGMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_CurveSegment" element
     */
    public net.opengis.gml.AbstractCurveSegmentType addNewCurveSegment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveSegmentType target = null;
            target = (net.opengis.gml.AbstractCurveSegmentType)get_store().add_element_user(CURVESEGMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "_CurveSegment" element
     */
    public void removeCurveSegment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CURVESEGMENT$1, i);
        }
    }
}
