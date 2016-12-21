/*
 * XML Type:  ArcByCenterPointType
 * Namespace: http://www.opengis.net/gml/3.2
 * Java type: net.opengis.gml.x32.ArcByCenterPointType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.x32.impl;
/**
 * An XML ArcByCenterPointType(@http://www.opengis.net/gml/3.2).
 *
 * This is a complex type.
 */
public class ArcByCenterPointTypeImpl extends net.opengis.gml.x32.impl.AbstractCurveSegmentTypeImpl implements net.opengis.gml.x32.ArcByCenterPointType
{
    private static final long serialVersionUID = 1L;
    
    public ArcByCenterPointTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "pos");
    private static final javax.xml.namespace.QName RADIUS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml/3.2", "radius");
    private static final javax.xml.namespace.QName INTERPOLATION$4 = 
        new javax.xml.namespace.QName("", "interpolation");
    private static final javax.xml.namespace.QName NUMARC$6 = 
        new javax.xml.namespace.QName("", "numArc");
    
    
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
    
    /**
     * Gets the "radius" element
     */
    public net.opengis.gml.x32.LengthType getRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().find_element_user(RADIUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "radius" element
     */
    public void setRadius(net.opengis.gml.x32.LengthType radius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().find_element_user(RADIUS$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.x32.LengthType)get_store().add_element_user(RADIUS$2);
            }
            target.set(radius);
        }
    }
    
    /**
     * Appends and returns a new empty "radius" element
     */
    public net.opengis.gml.x32.LengthType addNewRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.LengthType target = null;
            target = (net.opengis.gml.x32.LengthType)get_store().add_element_user(RADIUS$2);
            return target;
        }
    }
    
    /**
     * Gets the "interpolation" attribute
     */
    public net.opengis.gml.x32.CurveInterpolationType.Enum getInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTERPOLATION$4);
            }
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.x32.CurveInterpolationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "interpolation" attribute
     */
    public net.opengis.gml.x32.CurveInterpolationType xgetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveInterpolationType target = null;
            target = (net.opengis.gml.x32.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$4);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CurveInterpolationType)get_default_attribute_value(INTERPOLATION$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "interpolation" attribute
     */
    public boolean isSetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTERPOLATION$4) != null;
        }
    }
    
    /**
     * Sets the "interpolation" attribute
     */
    public void setInterpolation(net.opengis.gml.x32.CurveInterpolationType.Enum interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTERPOLATION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTERPOLATION$4);
            }
            target.setEnumValue(interpolation);
        }
    }
    
    /**
     * Sets (as xml) the "interpolation" attribute
     */
    public void xsetInterpolation(net.opengis.gml.x32.CurveInterpolationType interpolation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.x32.CurveInterpolationType target = null;
            target = (net.opengis.gml.x32.CurveInterpolationType)get_store().find_attribute_user(INTERPOLATION$4);
            if (target == null)
            {
                target = (net.opengis.gml.x32.CurveInterpolationType)get_store().add_attribute_user(INTERPOLATION$4);
            }
            target.set(interpolation);
        }
    }
    
    /**
     * Unsets the "interpolation" attribute
     */
    public void unsetInterpolation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTERPOLATION$4);
        }
    }
    
    /**
     * Gets the "numArc" attribute
     */
    public java.math.BigInteger getNumArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMARC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(NUMARC$6);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "numArc" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetNumArc()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMARC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(NUMARC$6);
            }
            return target;
        }
    }
    
    /**
     * Sets the "numArc" attribute
     */
    public void setNumArc(java.math.BigInteger numArc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NUMARC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NUMARC$6);
            }
            target.setBigIntegerValue(numArc);
        }
    }
    
    /**
     * Sets (as xml) the "numArc" attribute
     */
    public void xsetNumArc(org.apache.xmlbeans.XmlInteger numArc)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(NUMARC$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(NUMARC$6);
            }
            target.set(numArc);
        }
    }
}
