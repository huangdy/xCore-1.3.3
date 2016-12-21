/*
 * XML Type:  LatitudeCoordinateType
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LatitudeCoordinateType
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * An XML LatitudeCoordinateType(@http://niem.gov/niem/niem-core/2.0).
 *
 * This is a complex type.
 */
public interface LatitudeCoordinateType extends gov.niem.niem.structures.x20.ComplexObjectType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LatitudeCoordinateType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("latitudecoordinatetype99b5type");
    
    /**
     * Gets array of all "LatitudeDegreeValue" elements
     */
    gov.niem.niem.niemCore.x20.LatitudeDegreeType[] getLatitudeDegreeValueArray();
    
    /**
     * Gets ith "LatitudeDegreeValue" element
     */
    gov.niem.niem.niemCore.x20.LatitudeDegreeType getLatitudeDegreeValueArray(int i);
    
    /**
     * Tests for nil ith "LatitudeDegreeValue" element
     */
    boolean isNilLatitudeDegreeValueArray(int i);
    
    /**
     * Returns number of "LatitudeDegreeValue" element
     */
    int sizeOfLatitudeDegreeValueArray();
    
    /**
     * Sets array of all "LatitudeDegreeValue" element
     */
    void setLatitudeDegreeValueArray(gov.niem.niem.niemCore.x20.LatitudeDegreeType[] latitudeDegreeValueArray);
    
    /**
     * Sets ith "LatitudeDegreeValue" element
     */
    void setLatitudeDegreeValueArray(int i, gov.niem.niem.niemCore.x20.LatitudeDegreeType latitudeDegreeValue);
    
    /**
     * Nils the ith "LatitudeDegreeValue" element
     */
    void setNilLatitudeDegreeValueArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LatitudeDegreeValue" element
     */
    gov.niem.niem.niemCore.x20.LatitudeDegreeType insertNewLatitudeDegreeValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LatitudeDegreeValue" element
     */
    gov.niem.niem.niemCore.x20.LatitudeDegreeType addNewLatitudeDegreeValue();
    
    /**
     * Removes the ith "LatitudeDegreeValue" element
     */
    void removeLatitudeDegreeValue(int i);
    
    /**
     * Gets array of all "LatitudeMinuteValue" elements
     */
    gov.niem.niem.niemCore.x20.AngularMinuteType[] getLatitudeMinuteValueArray();
    
    /**
     * Gets ith "LatitudeMinuteValue" element
     */
    gov.niem.niem.niemCore.x20.AngularMinuteType getLatitudeMinuteValueArray(int i);
    
    /**
     * Tests for nil ith "LatitudeMinuteValue" element
     */
    boolean isNilLatitudeMinuteValueArray(int i);
    
    /**
     * Returns number of "LatitudeMinuteValue" element
     */
    int sizeOfLatitudeMinuteValueArray();
    
    /**
     * Sets array of all "LatitudeMinuteValue" element
     */
    void setLatitudeMinuteValueArray(gov.niem.niem.niemCore.x20.AngularMinuteType[] latitudeMinuteValueArray);
    
    /**
     * Sets ith "LatitudeMinuteValue" element
     */
    void setLatitudeMinuteValueArray(int i, gov.niem.niem.niemCore.x20.AngularMinuteType latitudeMinuteValue);
    
    /**
     * Nils the ith "LatitudeMinuteValue" element
     */
    void setNilLatitudeMinuteValueArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LatitudeMinuteValue" element
     */
    gov.niem.niem.niemCore.x20.AngularMinuteType insertNewLatitudeMinuteValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LatitudeMinuteValue" element
     */
    gov.niem.niem.niemCore.x20.AngularMinuteType addNewLatitudeMinuteValue();
    
    /**
     * Removes the ith "LatitudeMinuteValue" element
     */
    void removeLatitudeMinuteValue(int i);
    
    /**
     * Gets array of all "LatitudeSecondValue" elements
     */
    gov.niem.niem.niemCore.x20.AngularSecondType[] getLatitudeSecondValueArray();
    
    /**
     * Gets ith "LatitudeSecondValue" element
     */
    gov.niem.niem.niemCore.x20.AngularSecondType getLatitudeSecondValueArray(int i);
    
    /**
     * Tests for nil ith "LatitudeSecondValue" element
     */
    boolean isNilLatitudeSecondValueArray(int i);
    
    /**
     * Returns number of "LatitudeSecondValue" element
     */
    int sizeOfLatitudeSecondValueArray();
    
    /**
     * Sets array of all "LatitudeSecondValue" element
     */
    void setLatitudeSecondValueArray(gov.niem.niem.niemCore.x20.AngularSecondType[] latitudeSecondValueArray);
    
    /**
     * Sets ith "LatitudeSecondValue" element
     */
    void setLatitudeSecondValueArray(int i, gov.niem.niem.niemCore.x20.AngularSecondType latitudeSecondValue);
    
    /**
     * Nils the ith "LatitudeSecondValue" element
     */
    void setNilLatitudeSecondValueArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "LatitudeSecondValue" element
     */
    gov.niem.niem.niemCore.x20.AngularSecondType insertNewLatitudeSecondValue(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "LatitudeSecondValue" element
     */
    gov.niem.niem.niemCore.x20.AngularSecondType addNewLatitudeSecondValue();
    
    /**
     * Removes the ith "LatitudeSecondValue" element
     */
    void removeLatitudeSecondValue(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType newInstance() {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.LatitudeCoordinateType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.LatitudeCoordinateType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
