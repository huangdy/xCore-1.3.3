/*
 * XML Type:  LongitudeCoordinateType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LongitudeCoordinateType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * An XML LongitudeCoordinateType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface LongitudeCoordinateType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LongitudeCoordinateType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("longitudecoordinatetype6684type");
    
    /**
     * Gets array of all "LongitudeDegreeValue" elements
     */
    gov.niem.niem.niemCore.x20.LongitudeDegreeType[] getLongitudeDegreeValueArray();
    
    /**
     * Gets ith "LongitudeDegreeValue" element
     */
    gov.niem.niem.niemCore.x20.LongitudeDegreeType getLongitudeDegreeValueArray(int i);
    
    /**
     * Tests for nil ith "LongitudeDegreeValue" element
     */
    boolean isNilLongitudeDegreeValueArray(int i);
    
    /**
     * Returns number of "LongitudeDegreeValue" element
     */
    int sizeOfLongitudeDegreeValueArray();
    
    /**
     * Sets array of all "LongitudeDegreeValue" element
     */
    void setLongitudeDegreeValueArray(gov.niem.niem.niemCore.x20.LongitudeDegreeType[] longitudeDegreeValueArray);
    
    /**
     * Sets ith "LongitudeDegreeValue" element
     */
    void setLongitudeDegreeValueArray(int i, gov.niem.niem.niemCore.x20.LongitudeDegreeType longitudeDegreeValue);
    
    /**
     * Nils the ith "LongitudeDegreeValue" element
     */
    void setNilLongitudeDegreeValueArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongitudeDegreeValue" element
     */
    gov.niem.niem.niemCore.x20.LongitudeDegreeType insertNewLongitudeDegreeValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LongitudeDegreeValue" element
     */
    gov.niem.niem.niemCore.x20.LongitudeDegreeType addNewLongitudeDegreeValue();
    
    /**
     * Removes the ith "LongitudeDegreeValue" element
     */
    void removeLongitudeDegreeValue(int i);
    
    /**
     * Gets array of all "LongitudeMinuteValue" elements
     */
    gov.niem.niem.niemCore.x20.AngularMinuteType[] getLongitudeMinuteValueArray();
    
    /**
     * Gets ith "LongitudeMinuteValue" element
     */
    gov.niem.niem.niemCore.x20.AngularMinuteType getLongitudeMinuteValueArray(int i);
    
    /**
     * Tests for nil ith "LongitudeMinuteValue" element
     */
    boolean isNilLongitudeMinuteValueArray(int i);
    
    /**
     * Returns number of "LongitudeMinuteValue" element
     */
    int sizeOfLongitudeMinuteValueArray();
    
    /**
     * Sets array of all "LongitudeMinuteValue" element
     */
    void setLongitudeMinuteValueArray(gov.niem.niem.niemCore.x20.AngularMinuteType[] longitudeMinuteValueArray);
    
    /**
     * Sets ith "LongitudeMinuteValue" element
     */
    void setLongitudeMinuteValueArray(int i, gov.niem.niem.niemCore.x20.AngularMinuteType longitudeMinuteValue);
    
    /**
     * Nils the ith "LongitudeMinuteValue" element
     */
    void setNilLongitudeMinuteValueArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongitudeMinuteValue" element
     */
    gov.niem.niem.niemCore.x20.AngularMinuteType insertNewLongitudeMinuteValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LongitudeMinuteValue" element
     */
    gov.niem.niem.niemCore.x20.AngularMinuteType addNewLongitudeMinuteValue();
    
    /**
     * Removes the ith "LongitudeMinuteValue" element
     */
    void removeLongitudeMinuteValue(int i);
    
    /**
     * Gets array of all "LongitudeSecondValue" elements
     */
    gov.niem.niem.niemCore.x20.AngularSecondType[] getLongitudeSecondValueArray();
    
    /**
     * Gets ith "LongitudeSecondValue" element
     */
    gov.niem.niem.niemCore.x20.AngularSecondType getLongitudeSecondValueArray(int i);
    
    /**
     * Tests for nil ith "LongitudeSecondValue" element
     */
    boolean isNilLongitudeSecondValueArray(int i);
    
    /**
     * Returns number of "LongitudeSecondValue" element
     */
    int sizeOfLongitudeSecondValueArray();
    
    /**
     * Sets array of all "LongitudeSecondValue" element
     */
    void setLongitudeSecondValueArray(gov.niem.niem.niemCore.x20.AngularSecondType[] longitudeSecondValueArray);
    
    /**
     * Sets ith "LongitudeSecondValue" element
     */
    void setLongitudeSecondValueArray(int i, gov.niem.niem.niemCore.x20.AngularSecondType longitudeSecondValue);
    
    /**
     * Nils the ith "LongitudeSecondValue" element
     */
    void setNilLongitudeSecondValueArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LongitudeSecondValue" element
     */
    gov.niem.niem.niemCore.x20.AngularSecondType insertNewLongitudeSecondValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LongitudeSecondValue" element
     */
    gov.niem.niem.niemCore.x20.AngularSecondType addNewLongitudeSecondValue();
    
    /**
     * Removes the ith "LongitudeSecondValue" element
     */
    void removeLongitudeSecondValue(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType newInstance() {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.LongitudeCoordinateType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.LongitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
