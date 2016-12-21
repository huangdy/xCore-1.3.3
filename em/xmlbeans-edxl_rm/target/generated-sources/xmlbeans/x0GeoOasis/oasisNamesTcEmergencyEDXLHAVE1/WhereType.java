/*
 * XML Type:  WhereType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis
 * Java type: x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType
 *
 * Automatically generated - do not modify.
 */
package x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1;


/**
 * An XML WhereType(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis).
 *
 * This is a complex type.
 */
public interface WhereType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WhereType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("wheretype525btype");
    
    /**
     * Gets the "Point" element
     */
    net.opengis.gml.PointType getPoint();
    
    /**
     * True if has "Point" element
     */
    boolean isSetPoint();
    
    /**
     * Sets the "Point" element
     */
    void setPoint(net.opengis.gml.PointType point);
    
    /**
     * Appends and returns a new empty "Point" element
     */
    net.opengis.gml.PointType addNewPoint();
    
    /**
     * Unsets the "Point" element
     */
    void unsetPoint();
    
    /**
     * Gets the "LineString" element
     */
    net.opengis.gml.LineStringType getLineString();
    
    /**
     * True if has "LineString" element
     */
    boolean isSetLineString();
    
    /**
     * Sets the "LineString" element
     */
    void setLineString(net.opengis.gml.LineStringType lineString);
    
    /**
     * Appends and returns a new empty "LineString" element
     */
    net.opengis.gml.LineStringType addNewLineString();
    
    /**
     * Unsets the "LineString" element
     */
    void unsetLineString();
    
    /**
     * Gets the "CircleByCenterPoint" element
     */
    net.opengis.gml.CircleByCenterPointType getCircleByCenterPoint();
    
    /**
     * True if has "CircleByCenterPoint" element
     */
    boolean isSetCircleByCenterPoint();
    
    /**
     * Sets the "CircleByCenterPoint" element
     */
    void setCircleByCenterPoint(net.opengis.gml.CircleByCenterPointType circleByCenterPoint);
    
    /**
     * Appends and returns a new empty "CircleByCenterPoint" element
     */
    net.opengis.gml.CircleByCenterPointType addNewCircleByCenterPoint();
    
    /**
     * Unsets the "CircleByCenterPoint" element
     */
    void unsetCircleByCenterPoint();
    
    /**
     * Gets the "Polygon" element
     */
    net.opengis.gml.PolygonType getPolygon();
    
    /**
     * True if has "Polygon" element
     */
    boolean isSetPolygon();
    
    /**
     * Sets the "Polygon" element
     */
    void setPolygon(net.opengis.gml.PolygonType polygon);
    
    /**
     * Appends and returns a new empty "Polygon" element
     */
    net.opengis.gml.PolygonType addNewPolygon();
    
    /**
     * Unsets the "Polygon" element
     */
    void unsetPolygon();
    
    /**
     * Gets the "Envelope" element
     */
    net.opengis.gml.EnvelopeType getEnvelope();
    
    /**
     * True if has "Envelope" element
     */
    boolean isSetEnvelope();
    
    /**
     * Sets the "Envelope" element
     */
    void setEnvelope(net.opengis.gml.EnvelopeType envelope);
    
    /**
     * Appends and returns a new empty "Envelope" element
     */
    net.opengis.gml.EnvelopeType addNewEnvelope();
    
    /**
     * Unsets the "Envelope" element
     */
    void unsetEnvelope();
    
    /**
     * Gets the "featuretypetag" attribute
     */
    java.lang.String getFeaturetypetag();
    
    /**
     * Gets (as xml) the "featuretypetag" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetFeaturetypetag();
    
    /**
     * True if has "featuretypetag" attribute
     */
    boolean isSetFeaturetypetag();
    
    /**
     * Sets the "featuretypetag" attribute
     */
    void setFeaturetypetag(java.lang.String featuretypetag);
    
    /**
     * Sets (as xml) the "featuretypetag" attribute
     */
    void xsetFeaturetypetag(org.apache.xmlbeans.XmlNCName featuretypetag);
    
    /**
     * Unsets the "featuretypetag" attribute
     */
    void unsetFeaturetypetag();
    
    /**
     * Gets the "relationshiptag" attribute
     */
    java.lang.String getRelationshiptag();
    
    /**
     * Gets (as xml) the "relationshiptag" attribute
     */
    org.apache.xmlbeans.XmlNCName xgetRelationshiptag();
    
    /**
     * True if has "relationshiptag" attribute
     */
    boolean isSetRelationshiptag();
    
    /**
     * Sets the "relationshiptag" attribute
     */
    void setRelationshiptag(java.lang.String relationshiptag);
    
    /**
     * Sets (as xml) the "relationshiptag" attribute
     */
    void xsetRelationshiptag(org.apache.xmlbeans.XmlNCName relationshiptag);
    
    /**
     * Unsets the "relationshiptag" attribute
     */
    void unsetRelationshiptag();
    
    /**
     * Gets the "elev" attribute
     */
    double getElev();
    
    /**
     * Gets (as xml) the "elev" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetElev();
    
    /**
     * True if has "elev" attribute
     */
    boolean isSetElev();
    
    /**
     * Sets the "elev" attribute
     */
    void setElev(double elev);
    
    /**
     * Sets (as xml) the "elev" attribute
     */
    void xsetElev(org.apache.xmlbeans.XmlDouble elev);
    
    /**
     * Unsets the "elev" attribute
     */
    void unsetElev();
    
    /**
     * Gets the "floor" attribute
     */
    double getFloor();
    
    /**
     * Gets (as xml) the "floor" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetFloor();
    
    /**
     * True if has "floor" attribute
     */
    boolean isSetFloor();
    
    /**
     * Sets the "floor" attribute
     */
    void setFloor(double floor);
    
    /**
     * Sets (as xml) the "floor" attribute
     */
    void xsetFloor(org.apache.xmlbeans.XmlDouble floor);
    
    /**
     * Unsets the "floor" attribute
     */
    void unsetFloor();
    
    /**
     * Gets the "radius" attribute
     */
    double getRadius();
    
    /**
     * Gets (as xml) the "radius" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetRadius();
    
    /**
     * True if has "radius" attribute
     */
    boolean isSetRadius();
    
    /**
     * Sets the "radius" attribute
     */
    void setRadius(double radius);
    
    /**
     * Sets (as xml) the "radius" attribute
     */
    void xsetRadius(org.apache.xmlbeans.XmlDouble radius);
    
    /**
     * Unsets the "radius" attribute
     */
    void unsetRadius();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType newInstance() {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
