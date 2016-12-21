/*
 * An XML document type.
 * Localname: ExternalDataSourceConfig
 * Namespace: http://uicds.org/ExternalDataSourceConfig
 * Java type: org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.externalDataSourceConfig;


/**
 * A document containing one ExternalDataSourceConfig(@http://uicds.org/ExternalDataSourceConfig) element.
 *
 * This is a complex type.
 */
public interface ExternalDataSourceConfigDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExternalDataSourceConfigDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("externaldatasourceconfigd0cadoctype");
    
    /**
     * Gets the "ExternalDataSourceConfig" element
     */
    org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType getExternalDataSourceConfig();
    
    /**
     * Sets the "ExternalDataSourceConfig" element
     */
    void setExternalDataSourceConfig(org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType externalDataSourceConfig);
    
    /**
     * Appends and returns a new empty "ExternalDataSourceConfig" element
     */
    org.uicds.externalDataSourceConfig.ExternalDataSourceConfigType addNewExternalDataSourceConfig();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument newInstance() {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.externalDataSourceConfig.ExternalDataSourceConfigDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
