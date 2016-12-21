/*
 * XML Type:  BoundingGeometryType
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20.impl;
/**
 * An XML BoundingGeometryType(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
 *
 * This is a complex type.
 */
public class BoundingGeometryTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements mil.dod.metadata.mdr.ns.ddms.x20.BoundingGeometryType
{
    private static final long serialVersionUID = 1L;
    
    public BoundingGeometryTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGON$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Polygon");
    private static final javax.xml.namespace.QName POINT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "Point");
    
    
    /**
     * Gets array of all "Polygon" elements
     */
    public net.opengis.gml.x32.PolygonType[] getPolygonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POLYGON$0, targetList);
            net.opengis.gml.x32.PolygonType[] result = new net.opengis.gml.x32.PolygonType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Polygon" element
     */
    public net.opengis.gml.x32.PolygonType getPolygonArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolygonType target = null;
            target = (net.opengis.gml.x32.PolygonType)get_store().find_element_user(POLYGON$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Polygon" element
     */
    public int sizeOfPolygonArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLYGON$0);
        }
    }
    
    /**
     * Sets array of all "Polygon" element
     */
    public void setPolygonArray(net.opengis.gml.x32.PolygonType[] polygonArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(polygonArray, POLYGON$0);
        }
    }
    
    /**
     * Sets ith "Polygon" element
     */
    public void setPolygonArray(int i, net.opengis.gml.x32.PolygonType polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolygonType target = null;
            target = (net.opengis.gml.x32.PolygonType)get_store().find_element_user(POLYGON$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(polygon);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Polygon" element
     */
    public net.opengis.gml.x32.PolygonType insertNewPolygon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolygonType target = null;
            target = (net.opengis.gml.x32.PolygonType)get_store().insert_element_user(POLYGON$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Polygon" element
     */
    public net.opengis.gml.x32.PolygonType addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PolygonType target = null;
            target = (net.opengis.gml.x32.PolygonType)get_store().add_element_user(POLYGON$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Polygon" element
     */
    public void removePolygon(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLYGON$0, i);
        }
    }
    
    /**
     * Gets array of all "Point" elements
     */
    public net.opengis.gml.x32.PointType[] getPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POINT$2, targetList);
            net.opengis.gml.x32.PointType[] result = new net.opengis.gml.x32.PointType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Point" element
     */
    public net.opengis.gml.x32.PointType getPointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointType target = null;
            target = (net.opengis.gml.x32.PointType)get_store().find_element_user(POINT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Point" element
     */
    public int sizeOfPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINT$2);
        }
    }
    
    /**
     * Sets array of all "Point" element
     */
    public void setPointArray(net.opengis.gml.x32.PointType[] pointArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(pointArray, POINT$2);
        }
    }
    
    /**
     * Sets ith "Point" element
     */
    public void setPointArray(int i, net.opengis.gml.x32.PointType point)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointType target = null;
            target = (net.opengis.gml.x32.PointType)get_store().find_element_user(POINT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(point);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Point" element
     */
    public net.opengis.gml.x32.PointType insertNewPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointType target = null;
            target = (net.opengis.gml.x32.PointType)get_store().insert_element_user(POINT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Point" element
     */
    public net.opengis.gml.x32.PointType addNewPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.PointType target = null;
            target = (net.opengis.gml.x32.PointType)get_store().add_element_user(POINT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Point" element
     */
    public void removePoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINT$2, i);
        }
    }
}
