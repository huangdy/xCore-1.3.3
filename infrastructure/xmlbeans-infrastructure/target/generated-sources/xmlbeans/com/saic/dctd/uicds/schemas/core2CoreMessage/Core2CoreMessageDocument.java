/*
 * An XML document type.
 * Localname: Core2CoreMessage
 * Namespace: http://uicds.dctd.saic.com/schemas/Core2CoreMessage
 * Java type: com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument
 *
 * Automatically generated - do not modify.
 */
package com.saic.dctd.uicds.schemas.core2CoreMessage;


/**
 * A document containing one Core2CoreMessage(@http://uicds.dctd.saic.com/schemas/Core2CoreMessage) element.
 *
 * This is a complex type.
 */
public interface Core2CoreMessageDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Core2CoreMessageDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("core2coremessage66d7doctype");
    
    /**
     * Gets the "Core2CoreMessage" element
     */
    com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType getCore2CoreMessage();
    
    /**
     * Sets the "Core2CoreMessage" element
     */
    void setCore2CoreMessage(com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType core2CoreMessage);
    
    /**
     * Appends and returns a new empty "Core2CoreMessage" element
     */
    com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType addNewCore2CoreMessage();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument newInstance() {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
