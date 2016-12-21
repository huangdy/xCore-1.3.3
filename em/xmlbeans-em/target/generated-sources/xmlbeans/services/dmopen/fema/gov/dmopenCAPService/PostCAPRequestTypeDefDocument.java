/*
 * An XML document type.
 * Localname: postCAPRequestTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_CAPService/
 * Java type: services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenCAPService;


/**
 * A document containing one postCAPRequestTypeDef(@http://gov.fema.dmopen.services/DMOPEN_CAPService/) element.
 *
 * This is a complex type.
 */
public interface PostCAPRequestTypeDefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostCAPRequestTypeDefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("postcaprequesttypedefad2adoctype");
    
    /**
     * Gets the "postCAPRequestTypeDef" element
     */
    services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef getPostCAPRequestTypeDef();
    
    /**
     * Sets the "postCAPRequestTypeDef" element
     */
    void setPostCAPRequestTypeDef(services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef postCAPRequestTypeDef);
    
    /**
     * Appends and returns a new empty "postCAPRequestTypeDef" element
     */
    services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef addNewPostCAPRequestTypeDef();
    
    /**
     * An XML postCAPRequestTypeDef(@http://gov.fema.dmopen.services/DMOPEN_CAPService/).
     *
     * This is a complex type.
     */
    public interface PostCAPRequestTypeDef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostCAPRequestTypeDef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("postcaprequesttypedefd9f0elemtype");
        
        /**
         * Gets the "alert" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert getAlert();
        
        /**
         * Sets the "alert" element
         */
        void setAlert(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert alert);
        
        /**
         * Appends and returns a new empty "alert" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert addNewAlert();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef newInstance() {
              return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument.PostCAPRequestTypeDef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument newInstance() {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.dmopenCAPService.PostCAPRequestTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
