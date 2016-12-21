/*
 * An XML document type.
 * Localname: where
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis
 * Java type: x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument
 *
 * Automatically generated - do not modify.
 */
package x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1;


/**
 * A document containing one where(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0:geo-oasis) element.
 *
 * This is a complex type.
 */
public interface WhereDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(WhereDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("where5065doctype");
    
    /**
     * Gets the "where" element
     */
    x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType getWhere();
    
    /**
     * Sets the "where" element
     */
    void setWhere(x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType where);
    
    /**
     * Appends and returns a new empty "where" element
     */
    x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereType addNewWhere();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument newInstance() {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0GeoOasis.oasisNamesTcEmergencyEDXLHAVE1.WhereDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}