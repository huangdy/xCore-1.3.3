/*
 * XML Type:  xmlContentType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:DE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLDE1;


/**
 * An XML xmlContentType(@urn:oasis:names:tc:emergency:EDXL:DE:1.0).
 *
 * This is a complex type.
 */
public interface XmlContentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(XmlContentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("xmlcontenttypea5f2type");
    
    /**
     * Gets array of all "keyXMLContent" elements
     */
    x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType[] getKeyXMLContentArray();
    
    /**
     * Gets ith "keyXMLContent" element
     */
    x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType getKeyXMLContentArray(int i);
    
    /**
     * Returns number of "keyXMLContent" element
     */
    int sizeOfKeyXMLContentArray();
    
    /**
     * Sets array of all "keyXMLContent" element
     */
    void setKeyXMLContentArray(x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType[] keyXMLContentArray);
    
    /**
     * Sets ith "keyXMLContent" element
     */
    void setKeyXMLContentArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType keyXMLContent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "keyXMLContent" element
     */
    x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType insertNewKeyXMLContent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "keyXMLContent" element
     */
    x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType addNewKeyXMLContent();
    
    /**
     * Removes the ith "keyXMLContent" element
     */
    void removeKeyXMLContent(int i);
    
    /**
     * Gets array of all "embeddedXMLContent" elements
     */
    x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType[] getEmbeddedXMLContentArray();
    
    /**
     * Gets ith "embeddedXMLContent" element
     */
    x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType getEmbeddedXMLContentArray(int i);
    
    /**
     * Returns number of "embeddedXMLContent" element
     */
    int sizeOfEmbeddedXMLContentArray();
    
    /**
     * Sets array of all "embeddedXMLContent" element
     */
    void setEmbeddedXMLContentArray(x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType[] embeddedXMLContentArray);
    
    /**
     * Sets ith "embeddedXMLContent" element
     */
    void setEmbeddedXMLContentArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType embeddedXMLContent);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "embeddedXMLContent" element
     */
    x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType insertNewEmbeddedXMLContent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "embeddedXMLContent" element
     */
    x0.oasisNamesTcEmergencyEDXLDE1.AnyXMLType addNewEmbeddedXMLContent();
    
    /**
     * Removes the ith "embeddedXMLContent" element
     */
    void removeEmbeddedXMLContent(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.XmlContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
