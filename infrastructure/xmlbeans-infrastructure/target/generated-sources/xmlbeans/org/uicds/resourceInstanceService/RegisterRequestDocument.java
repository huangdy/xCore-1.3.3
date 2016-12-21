/*
 * An XML document type.
 * Localname: RegisterRequest
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.RegisterRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService;


/**
 * A document containing one RegisterRequest(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public interface RegisterRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RegisterRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("registerrequestf072doctype");
    
    /**
     * Gets the "RegisterRequest" element
     */
    org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest getRegisterRequest();
    
    /**
     * Sets the "RegisterRequest" element
     */
    void setRegisterRequest(org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest registerRequest);
    
    /**
     * Appends and returns a new empty "RegisterRequest" element
     */
    org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest addNewRegisterRequest();
    
    /**
     * An XML RegisterRequest(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public interface RegisterRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RegisterRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("registerrequest42baelemtype");
        
        /**
         * Gets the "ID" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType getID();
        
        /**
         * Sets the "ID" element
         */
        void setID(com.saic.precis.x2009.x06.base.IdentifierType id);
        
        /**
         * Appends and returns a new empty "ID" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType addNewID();
        
        /**
         * Gets the "LocalResourceID" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType getLocalResourceID();
        
        /**
         * Sets the "LocalResourceID" element
         */
        void setLocalResourceID(com.saic.precis.x2009.x06.base.IdentifierType localResourceID);
        
        /**
         * Appends and returns a new empty "LocalResourceID" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType addNewLocalResourceID();
        
        /**
         * Gets the "ResourceProfileID" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType getResourceProfileID();
        
        /**
         * Sets the "ResourceProfileID" element
         */
        void setResourceProfileID(com.saic.precis.x2009.x06.base.IdentifierType resourceProfileID);
        
        /**
         * Appends and returns a new empty "ResourceProfileID" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType addNewResourceProfileID();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest newInstance() {
              return (org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.resourceInstanceService.RegisterRequestDocument.RegisterRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.resourceInstanceService.RegisterRequestDocument newInstance() {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.resourceInstanceService.RegisterRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.resourceInstanceService.RegisterRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
