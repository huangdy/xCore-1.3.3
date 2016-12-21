/*
 * An XML document type.
 * Localname: postEdxlResponseTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/
 * Java type: services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenEDXLDEService;


/**
 * A document containing one postEdxlResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/) element.
 *
 * This is a complex type.
 */
public interface PostEdxlResponseTypeDefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostEdxlResponseTypeDefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("postedxlresponsetypedef1a99doctype");
    
    /**
     * Gets the "postEdxlResponseTypeDef" element
     */
    services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef getPostEdxlResponseTypeDef();
    
    /**
     * Sets the "postEdxlResponseTypeDef" element
     */
    void setPostEdxlResponseTypeDef(services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef postEdxlResponseTypeDef);
    
    /**
     * Appends and returns a new empty "postEdxlResponseTypeDef" element
     */
    services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef addNewPostEdxlResponseTypeDef();
    
    /**
     * An XML postEdxlResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/).
     *
     * This is a complex type.
     */
    public interface PostEdxlResponseTypeDef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostEdxlResponseTypeDef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("postedxlresponsetypedefbedcelemtype");
        
        /**
         * Gets the "postEdxlReturn" element
         */
        java.lang.String getPostEdxlReturn();
        
        /**
         * Gets (as xml) the "postEdxlReturn" element
         */
        org.apache.xmlbeans.XmlString xgetPostEdxlReturn();
        
        /**
         * Sets the "postEdxlReturn" element
         */
        void setPostEdxlReturn(java.lang.String postEdxlReturn);
        
        /**
         * Sets (as xml) the "postEdxlReturn" element
         */
        void xsetPostEdxlReturn(org.apache.xmlbeans.XmlString postEdxlReturn);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef newInstance() {
              return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument.PostEdxlResponseTypeDef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument newInstance() {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.PostEdxlResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
