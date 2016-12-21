/*
 * XML Type:  nonXMLContentType
 * Namespace: urn:oasis:names:tc:emergency:EDXL:DE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLDE1;


/**
 * An XML nonXMLContentType(@urn:oasis:names:tc:emergency:EDXL:DE:1.0).
 *
 * This is a complex type.
 */
public interface NonXMLContentType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NonXMLContentType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("nonxmlcontenttype3e17type");
    
    /**
     * Gets the "mimeType" element
     */
    java.lang.String getMimeType();
    
    /**
     * Gets (as xml) the "mimeType" element
     */
    org.apache.xmlbeans.XmlString xgetMimeType();
    
    /**
     * Sets the "mimeType" element
     */
    void setMimeType(java.lang.String mimeType);
    
    /**
     * Sets (as xml) the "mimeType" element
     */
    void xsetMimeType(org.apache.xmlbeans.XmlString mimeType);
    
    /**
     * Gets the "size" element
     */
    java.math.BigInteger getSize();
    
    /**
     * Gets (as xml) the "size" element
     */
    org.apache.xmlbeans.XmlInteger xgetSize();
    
    /**
     * True if has "size" element
     */
    boolean isSetSize();
    
    /**
     * Sets the "size" element
     */
    void setSize(java.math.BigInteger size);
    
    /**
     * Sets (as xml) the "size" element
     */
    void xsetSize(org.apache.xmlbeans.XmlInteger size);
    
    /**
     * Unsets the "size" element
     */
    void unsetSize();
    
    /**
     * Gets the "digest" element
     */
    java.lang.String getDigest();
    
    /**
     * Gets (as xml) the "digest" element
     */
    org.apache.xmlbeans.XmlString xgetDigest();
    
    /**
     * True if has "digest" element
     */
    boolean isSetDigest();
    
    /**
     * Sets the "digest" element
     */
    void setDigest(java.lang.String digest);
    
    /**
     * Sets (as xml) the "digest" element
     */
    void xsetDigest(org.apache.xmlbeans.XmlString digest);
    
    /**
     * Unsets the "digest" element
     */
    void unsetDigest();
    
    /**
     * Gets the "uri" element
     */
    java.lang.String getUri();
    
    /**
     * Gets (as xml) the "uri" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetUri();
    
    /**
     * True if has "uri" element
     */
    boolean isSetUri();
    
    /**
     * Sets the "uri" element
     */
    void setUri(java.lang.String uri);
    
    /**
     * Sets (as xml) the "uri" element
     */
    void xsetUri(org.apache.xmlbeans.XmlAnyURI uri);
    
    /**
     * Unsets the "uri" element
     */
    void unsetUri();
    
    /**
     * Gets the "contentData" element
     */
    byte[] getContentData();
    
    /**
     * Gets (as xml) the "contentData" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetContentData();
    
    /**
     * True if has "contentData" element
     */
    boolean isSetContentData();
    
    /**
     * Sets the "contentData" element
     */
    void setContentData(byte[] contentData);
    
    /**
     * Sets (as xml) the "contentData" element
     */
    void xsetContentData(org.apache.xmlbeans.XmlBase64Binary contentData);
    
    /**
     * Unsets the "contentData" element
     */
    void unsetContentData();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLDE1.NonXMLContentType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
