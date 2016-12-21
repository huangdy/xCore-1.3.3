/*
 * An XML document type.
 * Localname: GetCurrentMessageRequest
 * Namespace: http://uicds.org/NotificationService
 * Java type: org.uicds.notificationService.GetCurrentMessageRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.notificationService;


/**
 * A document containing one GetCurrentMessageRequest(@http://uicds.org/NotificationService) element.
 *
 * This is a complex type.
 */
public interface GetCurrentMessageRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCurrentMessageRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("getcurrentmessagerequest6259doctype");
    
    /**
     * Gets the "GetCurrentMessageRequest" element
     */
    org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest getGetCurrentMessageRequest();
    
    /**
     * Sets the "GetCurrentMessageRequest" element
     */
    void setGetCurrentMessageRequest(org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest getCurrentMessageRequest);
    
    /**
     * Appends and returns a new empty "GetCurrentMessageRequest" element
     */
    org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest addNewGetCurrentMessageRequest();
    
    /**
     * An XML GetCurrentMessageRequest(@http://uicds.org/NotificationService).
     *
     * This is a complex type.
     */
    public interface GetCurrentMessageRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetCurrentMessageRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("getcurrentmessagerequest27c0elemtype");
        
        /**
         * Gets the "Topic" element
         */
        org.oasisOpen.docs.wsn.b2.TopicExpressionType getTopic();
        
        /**
         * Sets the "Topic" element
         */
        void setTopic(org.oasisOpen.docs.wsn.b2.TopicExpressionType topic);
        
        /**
         * Appends and returns a new empty "Topic" element
         */
        org.oasisOpen.docs.wsn.b2.TopicExpressionType addNewTopic();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest newInstance() {
              return (org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.notificationService.GetCurrentMessageRequestDocument.GetCurrentMessageRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument newInstance() {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.notificationService.GetCurrentMessageRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.notificationService.GetCurrentMessageRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
