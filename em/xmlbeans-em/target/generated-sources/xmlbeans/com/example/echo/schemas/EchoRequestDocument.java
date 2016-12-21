/*
 * An XML document type.
 * Localname: EchoRequest
 * Namespace: http://www.example.com/echo/schemas
 * Java type: com.example.echo.schemas.EchoRequestDocument
 *
 * Automatically generated - do not modify.
 */
package com.example.echo.schemas;


/**
 * A document containing one EchoRequest(@http://www.example.com/echo/schemas) element.
 *
 * This is a complex type.
 */
public interface EchoRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EchoRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("echorequestb414doctype");
    
    /**
     * Gets the "EchoRequest" element
     */
    com.example.echo.schemas.EchoRequestDocument.EchoRequest getEchoRequest();
    
    /**
     * Sets the "EchoRequest" element
     */
    void setEchoRequest(com.example.echo.schemas.EchoRequestDocument.EchoRequest echoRequest);
    
    /**
     * Appends and returns a new empty "EchoRequest" element
     */
    com.example.echo.schemas.EchoRequestDocument.EchoRequest addNewEchoRequest();
    
    /**
     * An XML EchoRequest(@http://www.example.com/echo/schemas).
     *
     * This is a complex type.
     */
    public interface EchoRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EchoRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("echorequest778aelemtype");
        
        /**
         * Gets the "Echo" element
         */
        com.example.echo.schemas.EchoType getEcho();
        
        /**
         * Sets the "Echo" element
         */
        void setEcho(com.example.echo.schemas.EchoType echo);
        
        /**
         * Appends and returns a new empty "Echo" element
         */
        com.example.echo.schemas.EchoType addNewEcho();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.example.echo.schemas.EchoRequestDocument.EchoRequest newInstance() {
              return (com.example.echo.schemas.EchoRequestDocument.EchoRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.example.echo.schemas.EchoRequestDocument.EchoRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.example.echo.schemas.EchoRequestDocument.EchoRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.example.echo.schemas.EchoRequestDocument newInstance() {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.example.echo.schemas.EchoRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.example.echo.schemas.EchoRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.example.echo.schemas.EchoRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.example.echo.schemas.EchoRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.example.echo.schemas.EchoRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.example.echo.schemas.EchoRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.example.echo.schemas.EchoRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.example.echo.schemas.EchoRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.example.echo.schemas.EchoRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.example.echo.schemas.EchoRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.example.echo.schemas.EchoRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.example.echo.schemas.EchoRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.example.echo.schemas.EchoRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.example.echo.schemas.EchoRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.example.echo.schemas.EchoRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.example.echo.schemas.EchoRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.example.echo.schemas.EchoRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.example.echo.schemas.EchoRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
