/*
 * An XML document type.
 * Localname: GetLogByHostnameRequest
 * Namespace: http://uicds.org/LoggingMessage
 * Java type: org.uicds.loggingMessage.GetLogByHostnameRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.loggingMessage;


/**
 * A document containing one GetLogByHostnameRequest(@http://uicds.org/LoggingMessage) element.
 *
 * This is a complex type.
 */
public interface GetLogByHostnameRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLogByHostnameRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("getlogbyhostnamerequest0b53doctype");
    
    /**
     * Gets the "GetLogByHostnameRequest" element
     */
    org.uicds.loggingMessage.GetLogByHostnameRequestDocument.GetLogByHostnameRequest getGetLogByHostnameRequest();
    
    /**
     * Sets the "GetLogByHostnameRequest" element
     */
    void setGetLogByHostnameRequest(org.uicds.loggingMessage.GetLogByHostnameRequestDocument.GetLogByHostnameRequest getLogByHostnameRequest);
    
    /**
     * Appends and returns a new empty "GetLogByHostnameRequest" element
     */
    org.uicds.loggingMessage.GetLogByHostnameRequestDocument.GetLogByHostnameRequest addNewGetLogByHostnameRequest();
    
    /**
     * An XML GetLogByHostnameRequest(@http://uicds.org/LoggingMessage).
     *
     * This is a complex type.
     */
    public interface GetLogByHostnameRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLogByHostnameRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("getlogbyhostnamerequest18f6elemtype");
        
        /**
         * Gets the "hostname" element
         */
        java.lang.String getHostname();
        
        /**
         * Gets (as xml) the "hostname" element
         */
        org.apache.xmlbeans.XmlString xgetHostname();
        
        /**
         * Sets the "hostname" element
         */
        void setHostname(java.lang.String hostname);
        
        /**
         * Sets (as xml) the "hostname" element
         */
        void xsetHostname(org.apache.xmlbeans.XmlString hostname);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument.GetLogByHostnameRequest newInstance() {
              return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument.GetLogByHostnameRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument.GetLogByHostnameRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument.GetLogByHostnameRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument newInstance() {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.loggingMessage.GetLogByHostnameRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.loggingMessage.GetLogByHostnameRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
