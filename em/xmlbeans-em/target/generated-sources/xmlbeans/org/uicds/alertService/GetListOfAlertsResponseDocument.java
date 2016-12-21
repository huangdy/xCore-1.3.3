/*
 * An XML document type.
 * Localname: GetListOfAlertsResponse
 * Namespace: http://uicds.org/AlertService
 * Java type: org.uicds.alertService.GetListOfAlertsResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.alertService;


/**
 * A document containing one GetListOfAlertsResponse(@http://uicds.org/AlertService) element.
 *
 * This is a complex type.
 */
public interface GetListOfAlertsResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListOfAlertsResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("getlistofalertsresponseb2f0doctype");
    
    /**
     * Gets the "GetListOfAlertsResponse" element
     */
    org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse getGetListOfAlertsResponse();
    
    /**
     * Sets the "GetListOfAlertsResponse" element
     */
    void setGetListOfAlertsResponse(org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse getListOfAlertsResponse);
    
    /**
     * Appends and returns a new empty "GetListOfAlertsResponse" element
     */
    org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse addNewGetListOfAlertsResponse();
    
    /**
     * An XML GetListOfAlertsResponse(@http://uicds.org/AlertService).
     *
     * This is a complex type.
     */
    public interface GetListOfAlertsResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListOfAlertsResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("getlistofalertsresponse9d1felemtype");
        
        /**
         * Gets the "WorkProductList" element
         */
        org.uicds.workProductService.WorkProductListDocument.WorkProductList getWorkProductList();
        
        /**
         * Sets the "WorkProductList" element
         */
        void setWorkProductList(org.uicds.workProductService.WorkProductListDocument.WorkProductList workProductList);
        
        /**
         * Appends and returns a new empty "WorkProductList" element
         */
        org.uicds.workProductService.WorkProductListDocument.WorkProductList addNewWorkProductList();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse newInstance() {
              return (org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.alertService.GetListOfAlertsResponseDocument.GetListOfAlertsResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.alertService.GetListOfAlertsResponseDocument newInstance() {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.alertService.GetListOfAlertsResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.alertService.GetListOfAlertsResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
