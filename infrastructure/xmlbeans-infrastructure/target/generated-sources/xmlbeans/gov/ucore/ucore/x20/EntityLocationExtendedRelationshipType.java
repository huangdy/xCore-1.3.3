/*
 * XML Type:  EntityLocationExtendedRelationshipType
 * Namespace: http://ucore.gov/ucore/2.0
 * Java type: gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType
 *
 * Automatically generated - do not modify.
 */
package gov.ucore.ucore.x20;


/**
 * An XML EntityLocationExtendedRelationshipType(@http://ucore.gov/ucore/2.0).
 *
 * This is a complex type.
 */
public interface EntityLocationExtendedRelationshipType extends gov.ucore.ucore.x20.EntityLocationRelationshipType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityLocationExtendedRelationshipType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("entitylocationextendedrelationshiptypec740type");
    
    /**
     * Gets the "CourseOverGround" element
     */
    gov.ucore.ucore.x20.AngleMeasureType getCourseOverGround();
    
    /**
     * True if has "CourseOverGround" element
     */
    boolean isSetCourseOverGround();
    
    /**
     * Sets the "CourseOverGround" element
     */
    void setCourseOverGround(gov.ucore.ucore.x20.AngleMeasureType courseOverGround);
    
    /**
     * Appends and returns a new empty "CourseOverGround" element
     */
    gov.ucore.ucore.x20.AngleMeasureType addNewCourseOverGround();
    
    /**
     * Unsets the "CourseOverGround" element
     */
    void unsetCourseOverGround();
    
    /**
     * Gets the "Heading" element
     */
    gov.ucore.ucore.x20.AngleMeasureType getHeading();
    
    /**
     * True if has "Heading" element
     */
    boolean isSetHeading();
    
    /**
     * Sets the "Heading" element
     */
    void setHeading(gov.ucore.ucore.x20.AngleMeasureType heading);
    
    /**
     * Appends and returns a new empty "Heading" element
     */
    gov.ucore.ucore.x20.AngleMeasureType addNewHeading();
    
    /**
     * Unsets the "Heading" element
     */
    void unsetHeading();
    
    /**
     * Gets the "SpeedOverGround" element
     */
    gov.ucore.ucore.x20.VelocityMeasureType getSpeedOverGround();
    
    /**
     * True if has "SpeedOverGround" element
     */
    boolean isSetSpeedOverGround();
    
    /**
     * Sets the "SpeedOverGround" element
     */
    void setSpeedOverGround(gov.ucore.ucore.x20.VelocityMeasureType speedOverGround);
    
    /**
     * Appends and returns a new empty "SpeedOverGround" element
     */
    gov.ucore.ucore.x20.VelocityMeasureType addNewSpeedOverGround();
    
    /**
     * Unsets the "SpeedOverGround" element
     */
    void unsetSpeedOverGround();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType newInstance() {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.ucore.ucore.x20.EntityLocationExtendedRelationshipType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
