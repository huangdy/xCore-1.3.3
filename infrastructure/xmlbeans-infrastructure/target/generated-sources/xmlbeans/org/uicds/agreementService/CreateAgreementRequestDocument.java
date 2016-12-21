/*
 * An XML document type.
 * Localname: CreateAgreementRequest
 * Namespace: http://uicds.org/AgreementService
 * Java type: org.uicds.agreementService.CreateAgreementRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.agreementService;


/**
 * A document containing one CreateAgreementRequest(@http://uicds.org/AgreementService) element.
 *
 * This is a complex type.
 */
public interface CreateAgreementRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateAgreementRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("createagreementrequest4ef2doctype");
    
    /**
     * Gets the "CreateAgreementRequest" element
     */
    org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest getCreateAgreementRequest();
    
    /**
     * Sets the "CreateAgreementRequest" element
     */
    void setCreateAgreementRequest(org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest createAgreementRequest);
    
    /**
     * Appends and returns a new empty "CreateAgreementRequest" element
     */
    org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest addNewCreateAgreementRequest();
    
    /**
     * An XML CreateAgreementRequest(@http://uicds.org/AgreementService).
     *
     * This is a complex type.
     */
    public interface CreateAgreementRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateAgreementRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("createagreementrequest73d5elemtype");
        
        /**
         * Gets the "Agreement" element
         */
        org.uicds.agreementService.AgreementType getAgreement();
        
        /**
         * Sets the "Agreement" element
         */
        void setAgreement(org.uicds.agreementService.AgreementType agreement);
        
        /**
         * Appends and returns a new empty "Agreement" element
         */
        org.uicds.agreementService.AgreementType addNewAgreement();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest newInstance() {
              return (org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.agreementService.CreateAgreementRequestDocument.CreateAgreementRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.agreementService.CreateAgreementRequestDocument newInstance() {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.agreementService.CreateAgreementRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.agreementService.CreateAgreementRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}