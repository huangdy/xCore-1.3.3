/*
 * An XML document type.
 * Localname: postCAPResponseTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_CAPService/
 * Java type: services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenCAPService;


/**
 * A document containing one postCAPResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_CAPService/) element.
 *
 * This is a complex type.
 */
public interface PostCAPResponseTypeDefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostCAPResponseTypeDefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("postcapresponsetypedef382edoctype");
    
    /**
     * Gets the "postCAPResponseTypeDef" element
     */
    services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef getPostCAPResponseTypeDef();
    
    /**
     * Sets the "postCAPResponseTypeDef" element
     */
    void setPostCAPResponseTypeDef(services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef postCAPResponseTypeDef);
    
    /**
     * Appends and returns a new empty "postCAPResponseTypeDef" element
     */
    services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef addNewPostCAPResponseTypeDef();
    
    /**
     * An XML postCAPResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_CAPService/).
     *
     * This is a complex type.
     */
    public interface PostCAPResponseTypeDef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostCAPResponseTypeDef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("postcapresponsetypedef4e42elemtype");
        
        /**
         * Gets the "postCAPReturn" element
         */
        java.lang.String getPostCAPReturn();
        
        /**
         * Gets (as xml) the "postCAPReturn" element
         */
        org.apache.xmlbeans.XmlString xgetPostCAPReturn();
        
        /**
         * Sets the "postCAPReturn" element
         */
        void setPostCAPReturn(java.lang.String postCAPReturn);
        
        /**
         * Sets (as xml) the "postCAPReturn" element
         */
        void xsetPostCAPReturn(org.apache.xmlbeans.XmlString postCAPReturn);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef newInstance() {
              return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument.PostCAPResponseTypeDef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument newInstance() {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
