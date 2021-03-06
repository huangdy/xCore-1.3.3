/*
 * An XML document type.
 * Localname: GetHAVEMessagesResponse
 * Namespace: http://uicds.org/HAVEService
 * Java type: org.uicds.haveService.GetHAVEMessagesResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.haveService;


/**
 * A document containing one GetHAVEMessagesResponse(@http://uicds.org/HAVEService) element.
 *
 * This is a complex type.
 */
public interface GetHAVEMessagesResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetHAVEMessagesResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("gethavemessagesresponsed48edoctype");
    
    /**
     * Gets the "GetHAVEMessagesResponse" element
     */
    org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse getGetHAVEMessagesResponse();
    
    /**
     * Sets the "GetHAVEMessagesResponse" element
     */
    void setGetHAVEMessagesResponse(org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse getHAVEMessagesResponse);
    
    /**
     * Appends and returns a new empty "GetHAVEMessagesResponse" element
     */
    org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse addNewGetHAVEMessagesResponse();
    
    /**
     * An XML GetHAVEMessagesResponse(@http://uicds.org/HAVEService).
     *
     * This is a complex type.
     */
    public interface GetHAVEMessagesResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetHAVEMessagesResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("gethavemessagesresponsec6d7elemtype");
        
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
            public static org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse newInstance() {
              return (org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.haveService.GetHAVEMessagesResponseDocument.GetHAVEMessagesResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument newInstance() {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.haveService.GetHAVEMessagesResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.haveService.GetHAVEMessagesResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
