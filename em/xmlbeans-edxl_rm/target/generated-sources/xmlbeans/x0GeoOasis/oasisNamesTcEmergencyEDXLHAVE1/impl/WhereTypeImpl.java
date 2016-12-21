/*
 * XML Type:  WhereType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis
 * Java type: x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType
 *
 * Automatically generated - do not modify.
 */
package x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.impl;
/**
 * An XML WhereType(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis).
 *
 * This is a complex type.
 */
public class WhereTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType
{
    private static final long serialVersionUID = 1L;
    
    public WhereTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point");
    private static final javax.xml.namespace.QName LINESTRING$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString");
    private static final javax.xml.namespace.QName CIRCLEBYCENTERPOINT$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CircleByCenterPoint");
    private static final javax.xml.namespace.QName POLYGON$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon");
    private static final javax.xml.namespace.QName ENVELOPE$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Envelope");
    private static final javax.xml.namespace.QName FEATURETYPETAG$10 = 
        new javax.xml.namespace.QName("", "featuretypetag");
    private static final javax.xml.namespace.QName RELATIONSHIPTAG$12 = 
        new javax.xml.namespace.QName("", "relationshiptag");
    private static final javax.xml.namespace.QName ELEV$14 = 
        new javax.xml.namespace.QName("", "elev");
    private static final javax.xml.namespace.QName FLOOR$16 = 
        new javax.xml.namespace.QName("", "floor");
    private static final javax.xml.namespace.QName RADIUS$18 = 
        new javax.xml.namespace.QName("", "radius");
    
    
    /**
     * Gets the "Point" element
     */
    public net.opengis.gml.PointType getPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Point" element
     */
    public boolean isSetPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINT$0) != 0;
        }
    }
    
    /**
     * Sets the "Point" element
     */
    public void setPoint(net.opengis.gml.PointType point)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().find_element_user(POINT$0, 0);
            if (target == null)
            {
                target = (net.opengis.gml.PointType)get_store().add_element_user(POINT$0);
            }
            target.set(point);
        }
    }
    
    /**
     * Appends and returns a new empty "Point" element
     */
    public net.opengis.gml.PointType addNewPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PointType target = null;
            target = (net.opengis.gml.PointType)get_store().add_element_user(POINT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "Point" element
     */
    public void unsetPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINT$0, 0);
        }
    }
    
    /**
     * Gets the "LineString" element
     */
    public net.opengis.gml.LineStringType getLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringType target = null;
            target = (net.opengis.gml.LineStringType)get_store().find_element_user(LINESTRING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "LineString" element
     */
    public boolean isSetLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINESTRING$2) != 0;
        }
    }
    
    /**
     * Sets the "LineString" element
     */
    public void setLineString(net.opengis.gml.LineStringType lineString)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringType target = null;
            target = (net.opengis.gml.LineStringType)get_store().find_element_user(LINESTRING$2, 0);
            if (target == null)
            {
                target = (net.opengis.gml.LineStringType)get_store().add_element_user(LINESTRING$2);
            }
            target.set(lineString);
        }
    }
    
    /**
     * Appends and returns a new empty "LineString" element
     */
    public net.opengis.gml.LineStringType addNewLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LineStringType target = null;
            target = (net.opengis.gml.LineStringType)get_store().add_element_user(LINESTRING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "LineString" element
     */
    public void unsetLineString()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINESTRING$2, 0);
        }
    }
    
    /**
     * Gets the "CircleByCenterPoint" element
     */
    public net.opengis.gml.CircleByCenterPointType getCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CircleByCenterPointType target = null;
            target = (net.opengis.gml.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "CircleByCenterPoint" element
     */
    public boolean isSetCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CIRCLEBYCENTERPOINT$4) != 0;
        }
    }
    
    /**
     * Sets the "CircleByCenterPoint" element
     */
    public void setCircleByCenterPoint(net.opengis.gml.CircleByCenterPointType circleByCenterPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CircleByCenterPointType target = null;
            target = (net.opengis.gml.CircleByCenterPointType)get_store().find_element_user(CIRCLEBYCENTERPOINT$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$4);
            }
            target.set(circleByCenterPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "CircleByCenterPoint" element
     */
    public net.opengis.gml.CircleByCenterPointType addNewCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CircleByCenterPointType target = null;
            target = (net.opengis.gml.CircleByCenterPointType)get_store().add_element_user(CIRCLEBYCENTERPOINT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "CircleByCenterPoint" element
     */
    public void unsetCircleByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CIRCLEBYCENTERPOINT$4, 0);
        }
    }
    
    /**
     * Gets the "Polygon" element
     */
    public net.opengis.gml.PolygonType getPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().find_element_user(POLYGON$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Polygon" element
     */
    public boolean isSetPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POLYGON$6) != 0;
        }
    }
    
    /**
     * Sets the "Polygon" element
     */
    public void setPolygon(net.opengis.gml.PolygonType polygon)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().find_element_user(POLYGON$6, 0);
            if (target == null)
            {
                target = (net.opengis.gml.PolygonType)get_store().add_element_user(POLYGON$6);
            }
            target.set(polygon);
        }
    }
    
    /**
     * Appends and returns a new empty "Polygon" element
     */
    public net.opengis.gml.PolygonType addNewPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonType target = null;
            target = (net.opengis.gml.PolygonType)get_store().add_element_user(POLYGON$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Polygon" element
     */
    public void unsetPolygon()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POLYGON$6, 0);
        }
    }
    
    /**
     * Gets the "Envelope" element
     */
    public net.opengis.gml.EnvelopeType getEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(ENVELOPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Envelope" element
     */
    public boolean isSetEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENVELOPE$8) != 0;
        }
    }
    
    /**
     * Sets the "Envelope" element
     */
    public void setEnvelope(net.opengis.gml.EnvelopeType envelope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().find_element_user(ENVELOPE$8, 0);
            if (target == null)
            {
                target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(ENVELOPE$8);
            }
            target.set(envelope);
        }
    }
    
    /**
     * Appends and returns a new empty "Envelope" element
     */
    public net.opengis.gml.EnvelopeType addNewEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EnvelopeType target = null;
            target = (net.opengis.gml.EnvelopeType)get_store().add_element_user(ENVELOPE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Envelope" element
     */
    public void unsetEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENVELOPE$8, 0);
        }
    }
    
    /**
     * Gets the "featuretypetag" attribute
     */
    public java.lang.String getFeaturetypetag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATURETYPETAG$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "featuretypetag" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetFeaturetypetag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(FEATURETYPETAG$10);
            return target;
        }
    }
    
    /**
     * True if has "featuretypetag" attribute
     */
    public boolean isSetFeaturetypetag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FEATURETYPETAG$10) != null;
        }
    }
    
    /**
     * Sets the "featuretypetag" attribute
     */
    public void setFeaturetypetag(java.lang.String featuretypetag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FEATURETYPETAG$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FEATURETYPETAG$10);
            }
            target.setStringValue(featuretypetag);
        }
    }
    
    /**
     * Sets (as xml) the "featuretypetag" attribute
     */
    public void xsetFeaturetypetag(org.apache.xmlbeans.XmlNCName featuretypetag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(FEATURETYPETAG$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(FEATURETYPETAG$10);
            }
            target.set(featuretypetag);
        }
    }
    
    /**
     * Unsets the "featuretypetag" attribute
     */
    public void unsetFeaturetypetag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FEATURETYPETAG$10);
        }
    }
    
    /**
     * Gets the "relationshiptag" attribute
     */
    public java.lang.String getRelationshiptag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIPTAG$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relationshiptag" attribute
     */
    public org.apache.xmlbeans.XmlNCName xgetRelationshiptag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(RELATIONSHIPTAG$12);
            return target;
        }
    }
    
    /**
     * True if has "relationshiptag" attribute
     */
    public boolean isSetRelationshiptag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RELATIONSHIPTAG$12) != null;
        }
    }
    
    /**
     * Sets the "relationshiptag" attribute
     */
    public void setRelationshiptag(java.lang.String relationshiptag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATIONSHIPTAG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATIONSHIPTAG$12);
            }
            target.setStringValue(relationshiptag);
        }
    }
    
    /**
     * Sets (as xml) the "relationshiptag" attribute
     */
    public void xsetRelationshiptag(org.apache.xmlbeans.XmlNCName relationshiptag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(RELATIONSHIPTAG$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(RELATIONSHIPTAG$12);
            }
            target.set(relationshiptag);
        }
    }
    
    /**
     * Unsets the "relationshiptag" attribute
     */
    public void unsetRelationshiptag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RELATIONSHIPTAG$12);
        }
    }
    
    /**
     * Gets the "elev" attribute
     */
    public double getElev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEV$14);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "elev" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetElev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEV$14);
            return target;
        }
    }
    
    /**
     * True if has "elev" attribute
     */
    public boolean isSetElev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ELEV$14) != null;
        }
    }
    
    /**
     * Sets the "elev" attribute
     */
    public void setElev(double elev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ELEV$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ELEV$14);
            }
            target.setDoubleValue(elev);
        }
    }
    
    /**
     * Sets (as xml) the "elev" attribute
     */
    public void xsetElev(org.apache.xmlbeans.XmlDouble elev)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(ELEV$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(ELEV$14);
            }
            target.set(elev);
        }
    }
    
    /**
     * Unsets the "elev" attribute
     */
    public void unsetElev()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ELEV$14);
        }
    }
    
    /**
     * Gets the "floor" attribute
     */
    public double getFloor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOOR$16);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "floor" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetFloor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FLOOR$16);
            return target;
        }
    }
    
    /**
     * True if has "floor" attribute
     */
    public boolean isSetFloor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FLOOR$16) != null;
        }
    }
    
    /**
     * Sets the "floor" attribute
     */
    public void setFloor(double floor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FLOOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FLOOR$16);
            }
            target.setDoubleValue(floor);
        }
    }
    
    /**
     * Sets (as xml) the "floor" attribute
     */
    public void xsetFloor(org.apache.xmlbeans.XmlDouble floor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(FLOOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(FLOOR$16);
            }
            target.set(floor);
        }
    }
    
    /**
     * Unsets the "floor" attribute
     */
    public void unsetFloor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FLOOR$16);
        }
    }
    
    /**
     * Gets the "radius" attribute
     */
    public double getRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUS$18);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "radius" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RADIUS$18);
            return target;
        }
    }
    
    /**
     * True if has "radius" attribute
     */
    public boolean isSetRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RADIUS$18) != null;
        }
    }
    
    /**
     * Sets the "radius" attribute
     */
    public void setRadius(double radius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIUS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RADIUS$18);
            }
            target.setDoubleValue(radius);
        }
    }
    
    /**
     * Sets (as xml) the "radius" attribute
     */
    public void xsetRadius(org.apache.xmlbeans.XmlDouble radius)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RADIUS$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RADIUS$18);
            }
            target.set(radius);
        }
    }
    
    /**
     * Unsets the "radius" attribute
     */
    public void unsetRadius()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RADIUS$18);
        }
    }
}
