/*
 * XML Type:  CircularRegionType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.CircularRegionType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * An XML CircularRegionType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface CircularRegionType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CircularRegionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("circularregiontype8ee6type");
    
    /**
     * Gets array of all "CircularRegionCenterCoordinate" elements
     */
    gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[] getCircularRegionCenterCoordinateArray();
    
    /**
     * Gets ith "CircularRegionCenterCoordinate" element
     */
    gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType getCircularRegionCenterCoordinateArray(int i);
    
    /**
     * Tests for nil ith "CircularRegionCenterCoordinate" element
     */
    boolean isNilCircularRegionCenterCoordinateArray(int i);
    
    /**
     * Returns number of "CircularRegionCenterCoordinate" element
     */
    int sizeOfCircularRegionCenterCoordinateArray();
    
    /**
     * Sets array of all "CircularRegionCenterCoordinate" element
     */
    void setCircularRegionCenterCoordinateArray(gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType[] circularRegionCenterCoordinateArray);
    
    /**
     * Sets ith "CircularRegionCenterCoordinate" element
     */
    void setCircularRegionCenterCoordinateArray(int i, gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType circularRegionCenterCoordinate);
    
    /**
     * Nils the ith "CircularRegionCenterCoordinate" element
     */
    void setNilCircularRegionCenterCoordinateArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CircularRegionCenterCoordinate" element
     */
    gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType insertNewCircularRegionCenterCoordinate(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CircularRegionCenterCoordinate" element
     */
    gov.niem.niem.niemCore.x20.TwoDimensionalGeographicCoordinateType addNewCircularRegionCenterCoordinate();
    
    /**
     * Removes the ith "CircularRegionCenterCoordinate" element
     */
    void removeCircularRegionCenterCoordinate(int i);
    
    /**
     * Gets array of all "CircularRegionRadiusLengthMeasure" elements
     */
    gov.niem.niem.niemCore.x20.LengthMeasureType[] getCircularRegionRadiusLengthMeasureArray();
    
    /**
     * Gets ith "CircularRegionRadiusLengthMeasure" element
     */
    gov.niem.niem.niemCore.x20.LengthMeasureType getCircularRegionRadiusLengthMeasureArray(int i);
    
    /**
     * Tests for nil ith "CircularRegionRadiusLengthMeasure" element
     */
    boolean isNilCircularRegionRadiusLengthMeasureArray(int i);
    
    /**
     * Returns number of "CircularRegionRadiusLengthMeasure" element
     */
    int sizeOfCircularRegionRadiusLengthMeasureArray();
    
    /**
     * Sets array of all "CircularRegionRadiusLengthMeasure" element
     */
    void setCircularRegionRadiusLengthMeasureArray(gov.niem.niem.niemCore.x20.LengthMeasureType[] circularRegionRadiusLengthMeasureArray);
    
    /**
     * Sets ith "CircularRegionRadiusLengthMeasure" element
     */
    void setCircularRegionRadiusLengthMeasureArray(int i, gov.niem.niem.niemCore.x20.LengthMeasureType circularRegionRadiusLengthMeasure);
    
    /**
     * Nils the ith "CircularRegionRadiusLengthMeasure" element
     */
    void setNilCircularRegionRadiusLengthMeasureArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CircularRegionRadiusLengthMeasure" element
     */
    gov.niem.niem.niemCore.x20.LengthMeasureType insertNewCircularRegionRadiusLengthMeasure(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CircularRegionRadiusLengthMeasure" element
     */
    gov.niem.niem.niemCore.x20.LengthMeasureType addNewCircularRegionRadiusLengthMeasure();
    
    /**
     * Removes the ith "CircularRegionRadiusLengthMeasure" element
     */
    void removeCircularRegionRadiusLengthMeasure(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.CircularRegionType newInstance() {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.CircularRegionType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.CircularRegionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
