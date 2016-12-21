/*
 * An XML document type.
 * Localname: ResumeSubscriptionResponse
 * Namespace: http://docs.oasis-open.org/wsn/b-2
 * Java type: org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.oasisOpen.docs.wsn.b2;


/**
 * A document containing one ResumeSubscriptionResponse(@http://docs.oasis-open.org/wsn/b-2) element.
 *
 * This is a complex type.
 */
public interface ResumeSubscriptionResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResumeSubscriptionResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("resumesubscriptionresponse82dadoctype");
    
    /**
     * Gets the "ResumeSubscriptionResponse" element
     */
    org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse getResumeSubscriptionResponse();
    
    /**
     * Sets the "ResumeSubscriptionResponse" element
     */
    void setResumeSubscriptionResponse(org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse resumeSubscriptionResponse);
    
    /**
     * Appends and returns a new empty "ResumeSubscriptionResponse" element
     */
    org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse addNewResumeSubscriptionResponse();
    
    /**
     * An XML ResumeSubscriptionResponse(@http://docs.oasis-open.org/wsn/b-2).
     *
     * This is a complex type.
     */
    public interface ResumeSubscriptionResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResumeSubscriptionResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("resumesubscriptionresponsee9e1elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse newInstance() {
              return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument.ResumeSubscriptionResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument newInstance() {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.oasisOpen.docs.wsn.b2.ResumeSubscriptionResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}