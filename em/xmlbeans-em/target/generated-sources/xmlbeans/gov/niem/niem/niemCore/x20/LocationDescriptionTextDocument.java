/*
 * An XML document type.
 * Localname: LocationDescriptionText
 * Namespace: http://niem.gov/niem/niem-core/2.0
 * Java type: gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument
 *
 * Automatically generated - do not modify.
 */
package gov.niem.niem.niemCore.x20;


/**
 * A document containing one LocationDescriptionText(@http://niem.gov/niem/niem-core/2.0) element.
 *
 * This is a complex type.
 */
public interface LocationDescriptionTextDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocationDescriptionTextDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("locationdescriptiontext8141doctype");
    
    /**
     * Gets the "LocationDescriptionText" element
     */
    gov.niem.niem.niemCore.x20.TextType getLocationDescriptionText();
    
    /**
     * Tests for nil "LocationDescriptionText" element
     */
    boolean isNilLocationDescriptionText();
    
    /**
     * Sets the "LocationDescriptionText" element
     */
    void setLocationDescriptionText(gov.niem.niem.niemCore.x20.TextType locationDescriptionText);
    
    /**
     * Appends and returns a new empty "LocationDescriptionText" element
     */
    gov.niem.niem.niemCore.x20.TextType addNewLocationDescriptionText();
    
    /**
     * Nils the "LocationDescriptionText" element
     */
    void setNilLocationDescriptionText();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument newInstance() {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.niem.niem.niemCore.x20.LocationDescriptionTextDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
