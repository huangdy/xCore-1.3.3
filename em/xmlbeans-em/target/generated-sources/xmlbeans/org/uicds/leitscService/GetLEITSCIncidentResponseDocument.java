/*
 * An XML document type.
 * Localname: GetLEITSCIncidentResponse
 * Namespace: http://uicds.org/LEITSCService
 * Java type: org.uicds.leitscService.GetLEITSCIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.leitscService;


/**
 * A document containing one GetLEITSCIncidentResponse(@http://uicds.org/LEITSCService) element.
 *
 * This is a complex type.
 */
public interface GetLEITSCIncidentResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLEITSCIncidentResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("getleitscincidentresponse2db0doctype");
    
    /**
     * Gets the "GetLEITSCIncidentResponse" element
     */
    org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse getGetLEITSCIncidentResponse();
    
    /**
     * Sets the "GetLEITSCIncidentResponse" element
     */
    void setGetLEITSCIncidentResponse(org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse getLEITSCIncidentResponse);
    
    /**
     * Appends and returns a new empty "GetLEITSCIncidentResponse" element
     */
    org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse addNewGetLEITSCIncidentResponse();
    
    /**
     * An XML GetLEITSCIncidentResponse(@http://uicds.org/LEITSCService).
     *
     * This is a complex type.
     */
    public interface GetLEITSCIncidentResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLEITSCIncidentResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("getleitscincidentresponse41e7elemtype");
        
        /**
         * Gets the "WorkProduct" element
         */
        com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct getWorkProduct();
        
        /**
         * Sets the "WorkProduct" element
         */
        void setWorkProduct(com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct workProduct);
        
        /**
         * Appends and returns a new empty "WorkProduct" element
         */
        com.saic.precis.x2009.x06.structures.WorkProductDocument.WorkProduct addNewWorkProduct();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse newInstance() {
              return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument.GetLEITSCIncidentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument newInstance() {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.leitscService.GetLEITSCIncidentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.leitscService.GetLEITSCIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
