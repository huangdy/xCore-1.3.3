/*
 * XML Type:  TwoDimensionalGeographicCoordinateType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * An XML TwoDimensionalGeographicCoordinateType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface TwoDimensionalGeographicCoordinateType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TwoDimensionalGeographicCoordinateType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("twodimensionalgeographiccoordinatetypebba5type");
    
    /**
     * Gets the "GeographicDatumCode" element
     */
    gov.niem.niem.nga.x20.DatumCodeType getGeographicDatumCode();
    
    /**
     * Tests for nil "GeographicDatumCode" element
     */
    boolean isNilGeographicDatumCode();
    
    /**
     * True if has "GeographicDatumCode" element
     */
    boolean isSetGeographicDatumCode();
    
    /**
     * Sets the "GeographicDatumCode" element
     */
    void setGeographicDatumCode(gov.niem.niem.nga.x20.DatumCodeType geographicDatumCode);
    
    /**
     * Appends and returns a new empty "GeographicDatumCode" element
     */
    gov.niem.niem.nga.x20.DatumCodeType addNewGeographicDatumCode();
    
    /**
     * Nils the "GeographicDatumCode" element
     */
    void setNilGeographicDatumCode();
    
    /**
     * Unsets the "GeographicDatumCode" element
     */
    void unsetGeographicDatumCode();
    
    /**
     * Gets the "GeographicCoordinateLatitude" element
     */
    gov.niem.niem.niemCore.x20.LatitudeCoordinateType getGeographicCoordinateLatitude();
    
    /**
     * Tests for nil "GeographicCoordinateLatitude" element
     */
    boolean isNilGeographicCoordinateLatitude();
    
    /**
     * Sets the "GeographicCoordinateLatitude" element
     */
    void setGeographicCoordinateLatitude(gov.niem.niem.niemCore.x20.LatitudeCoordinateType geographicCoordinateLatitude);
    
    /**
     * Appends and returns a new empty "GeographicCoordinateLatitude" element
     */
    gov.niem.niem.niemCore.x20.LatitudeCoordinateType addNewGeographicCoordinateLatitude();
    
    /**
     * Nils the "GeographicCoordinateLatitude" element
     */
    void setNilGeographicCoordinateLatitude();
    
    /**
     * Gets the "GeographicCoordinateLongitude" element
     */
    gov.niem.niem.niemCore.x20.LongitudeCoordinateType getGeographicCoordinateLongitude();
    
    /**
     * Tests for nil "GeographicCoordinateLongitude" element
     */
    boolean isNilGeographicCoordinateLongitude();
    
    /**
     * Sets the "GeographicCoordinateLongitude" element
     */
    void setGeographicCoordinateLongitude(gov.niem.niem.niemCore.x20.LongitudeCoordinateType geographicCoordinateLongitude);
    
    /**
     * Appends and returns a new empty "GeographicCoordinateLongitude" element
     */
    gov.niem.niem.niemCore.x20.LongitudeCoordinateType addNewGeographicCoordinateLongitude();
    
    /**
     * Nils the "GeographicCoordinateLongitude" element
     */
    void setNilGeographicCoordinateLongitude();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType newInstance() {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
