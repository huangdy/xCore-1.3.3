/*
 * XML Type:  Core2CoreMessageType
 * Namespace: http://uicds.dctd.saic.com/schemas/Core2CoreMessage
 * Java type: com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType
 *
 * Automatically generated - do not modify.
 */
package com.saic.dctd.uicds.schemas.core2CoreMessage;


/**
 * An XML Core2CoreMessageType(@http://uicds.dctd.saic.com/schemas/Core2CoreMessage).
 *
 * This is a complex type.
 */
public interface Core2CoreMessageType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Core2CoreMessageType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("core2coremessagetypeec21type");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType newInstance() {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.saic.dctd.uicds.schemas.core2CoreMessage.Core2CoreMessageType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
