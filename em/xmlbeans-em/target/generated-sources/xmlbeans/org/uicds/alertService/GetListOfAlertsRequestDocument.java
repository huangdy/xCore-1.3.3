/*
 * An XML document type.
 * Localname: GetListOfAlertsRequest
 * Namespace: http://uicds.org/AlertService
 * Java type: org.uicds.alertService.GetListOfAlertsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.alertService;


/**
 * A document containing one GetListOfAlertsRequest(@http://uicds.org/AlertService) element.
 *
 * This is a complex type.
 */
public interface GetListOfAlertsRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListOfAlertsRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("getlistofalertsrequesta34cdoctype");
    
    /**
     * Gets the "GetListOfAlertsRequest" element
     */
    org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest getGetListOfAlertsRequest();
    
    /**
     * Sets the "GetListOfAlertsRequest" element
     */
    void setGetListOfAlertsRequest(org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest getListOfAlertsRequest);
    
    /**
     * Appends and returns a new empty "GetListOfAlertsRequest" element
     */
    org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest addNewGetListOfAlertsRequest();
    
    /**
     * An XML GetListOfAlertsRequest(@http://uicds.org/AlertService).
     *
     * This is a complex type.
     */
    public interface GetListOfAlertsRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListOfAlertsRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("getlistofalertsrequesta2c3elemtype");
        
        /**
         * Gets the "QueryString" element
         */
        java.lang.String getQueryString();
        
        /**
         * Gets (as xml) the "QueryString" element
         */
        org.apache.xmlbeans.XmlString xgetQueryString();
        
        /**
         * True if has "QueryString" element
         */
        boolean isSetQueryString();
        
        /**
         * Sets the "QueryString" element
         */
        void setQueryString(java.lang.String queryString);
        
        /**
         * Sets (as xml) the "QueryString" element
         */
        void xsetQueryString(org.apache.xmlbeans.XmlString queryString);
        
        /**
         * Unsets the "QueryString" element
         */
        void unsetQueryString();
        
        /**
         * Gets the "NamespaceMap" element
         */
        com.saic.precis.x2009.x06.base.NamespaceMapType getNamespaceMap();
        
        /**
         * True if has "NamespaceMap" element
         */
        boolean isSetNamespaceMap();
        
        /**
         * Sets the "NamespaceMap" element
         */
        void setNamespaceMap(com.saic.precis.x2009.x06.base.NamespaceMapType namespaceMap);
        
        /**
         * Appends and returns a new empty "NamespaceMap" element
         */
        com.saic.precis.x2009.x06.base.NamespaceMapType addNewNamespaceMap();
        
        /**
         * Unsets the "NamespaceMap" element
         */
        void unsetNamespaceMap();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest newInstance() {
              return (org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.alertService.GetListOfAlertsRequestDocument.GetListOfAlertsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.alertService.GetListOfAlertsRequestDocument newInstance() {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.alertService.GetListOfAlertsRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.alertService.GetListOfAlertsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
