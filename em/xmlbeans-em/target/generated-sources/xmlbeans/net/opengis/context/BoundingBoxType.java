/*
 * XML Type:  BoundingBoxType
 * Namespace: http://www.opengis.net/context
 * Java type: net.opengis.context.BoundingBoxType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.context;


/**
 * An XML BoundingBoxType(@http://www.opengis.net/context).
 *
 * This is a complex type.
 */
public interface BoundingBoxType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BoundingBoxType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("boundingboxtype1975type");
    
    /**
     * Gets the "SRS" attribute
     */
    java.lang.String getSRS();
    
    /**
     * Gets (as xml) the "SRS" attribute
     */
    org.apache.xmlbeans.XmlString xgetSRS();
    
    /**
     * Sets the "SRS" attribute
     */
    void setSRS(java.lang.String srs);
    
    /**
     * Sets (as xml) the "SRS" attribute
     */
    void xsetSRS(org.apache.xmlbeans.XmlString srs);
    
    /**
     * Gets the "minx" attribute
     */
    java.math.BigDecimal getMinx();
    
    /**
     * Gets (as xml) the "minx" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetMinx();
    
    /**
     * Sets the "minx" attribute
     */
    void setMinx(java.math.BigDecimal minx);
    
    /**
     * Sets (as xml) the "minx" attribute
     */
    void xsetMinx(org.apache.xmlbeans.XmlDecimal minx);
    
    /**
     * Gets the "miny" attribute
     */
    java.math.BigDecimal getMiny();
    
    /**
     * Gets (as xml) the "miny" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetMiny();
    
    /**
     * Sets the "miny" attribute
     */
    void setMiny(java.math.BigDecimal miny);
    
    /**
     * Sets (as xml) the "miny" attribute
     */
    void xsetMiny(org.apache.xmlbeans.XmlDecimal miny);
    
    /**
     * Gets the "maxx" attribute
     */
    java.math.BigDecimal getMaxx();
    
    /**
     * Gets (as xml) the "maxx" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetMaxx();
    
    /**
     * Sets the "maxx" attribute
     */
    void setMaxx(java.math.BigDecimal maxx);
    
    /**
     * Sets (as xml) the "maxx" attribute
     */
    void xsetMaxx(org.apache.xmlbeans.XmlDecimal maxx);
    
    /**
     * Gets the "maxy" attribute
     */
    java.math.BigDecimal getMaxy();
    
    /**
     * Gets (as xml) the "maxy" attribute
     */
    org.apache.xmlbeans.XmlDecimal xgetMaxy();
    
    /**
     * Sets the "maxy" attribute
     */
    void setMaxy(java.math.BigDecimal maxy);
    
    /**
     * Sets (as xml) the "maxy" attribute
     */
    void xsetMaxy(org.apache.xmlbeans.XmlDecimal maxy);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.opengis.context.BoundingBoxType newInstance() {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.opengis.context.BoundingBoxType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.opengis.context.BoundingBoxType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.opengis.context.BoundingBoxType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.opengis.context.BoundingBoxType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.opengis.context.BoundingBoxType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.opengis.context.BoundingBoxType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.opengis.context.BoundingBoxType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.opengis.context.BoundingBoxType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.opengis.context.BoundingBoxType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.opengis.context.BoundingBoxType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.opengis.context.BoundingBoxType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.opengis.context.BoundingBoxType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.opengis.context.BoundingBoxType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.opengis.context.BoundingBoxType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.opengis.context.BoundingBoxType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.context.BoundingBoxType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static net.opengis.context.BoundingBoxType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.opengis.context.BoundingBoxType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
