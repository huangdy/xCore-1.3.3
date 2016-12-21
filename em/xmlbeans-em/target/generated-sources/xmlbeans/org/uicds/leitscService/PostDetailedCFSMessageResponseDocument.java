/*
 * An XML document type.
 * Localname: PostDetailedCFSMessageResponse
 * Namespace: http://uicds.org/LEITSCService
 * Java type: org.uicds.leitscService.PostDetailedCFSMessageResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.leitscService;


/**
 * A document containing one PostDetailedCFSMessageResponse(@http://uicds.org/LEITSCService) element.
 *
 * This is a complex type.
 */
public interface PostDetailedCFSMessageResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostDetailedCFSMessageResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("postdetailedcfsmessageresponsee433doctype");
    
    /**
     * Gets the "PostDetailedCFSMessageResponse" element
     */
    org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse getPostDetailedCFSMessageResponse();
    
    /**
     * Sets the "PostDetailedCFSMessageResponse" element
     */
    void setPostDetailedCFSMessageResponse(org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse postDetailedCFSMessageResponse);
    
    /**
     * Appends and returns a new empty "PostDetailedCFSMessageResponse" element
     */
    org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse addNewPostDetailedCFSMessageResponse();
    
    /**
     * An XML PostDetailedCFSMessageResponse(@http://uicds.org/LEITSCService).
     *
     * This is a complex type.
     */
    public interface PostDetailedCFSMessageResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostDetailedCFSMessageResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("postdetailedcfsmessageresponse7f57elemtype");
        
        /**
         * Gets the "leitscIncidentID" element
         */
        java.lang.String getLeitscIncidentID();
        
        /**
         * Gets (as xml) the "leitscIncidentID" element
         */
        org.apache.xmlbeans.XmlString xgetLeitscIncidentID();
        
        /**
         * Sets the "leitscIncidentID" element
         */
        void setLeitscIncidentID(java.lang.String leitscIncidentID);
        
        /**
         * Sets (as xml) the "leitscIncidentID" element
         */
        void xsetLeitscIncidentID(org.apache.xmlbeans.XmlString leitscIncidentID);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse newInstance() {
              return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument.PostDetailedCFSMessageResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument newInstance() {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.leitscService.PostDetailedCFSMessageResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.leitscService.PostDetailedCFSMessageResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
