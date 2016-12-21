/*
 * An XML document type.
 * Localname: GetResourceInstanceResponse
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService;


/**
 * A document containing one GetResourceInstanceResponse(@http://uicds.org/ResourceInstanceService) element.
 *
 * This is a complex type.
 */
public interface GetResourceInstanceResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetResourceInstanceResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("getresourceinstanceresponse8784doctype");
    
    /**
     * Gets the "GetResourceInstanceResponse" element
     */
    org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse getGetResourceInstanceResponse();
    
    /**
     * Sets the "GetResourceInstanceResponse" element
     */
    void setGetResourceInstanceResponse(org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse getResourceInstanceResponse);
    
    /**
     * Appends and returns a new empty "GetResourceInstanceResponse" element
     */
    org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse addNewGetResourceInstanceResponse();
    
    /**
     * An XML GetResourceInstanceResponse(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public interface GetResourceInstanceResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetResourceInstanceResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("getresourceinstanceresponsec2deelemtype");
        
        /**
         * Gets the "ResourceInstance" element
         */
        org.uicds.resourceInstanceService.ResourceInstance getResourceInstance();
        
        /**
         * Sets the "ResourceInstance" element
         */
        void setResourceInstance(org.uicds.resourceInstanceService.ResourceInstance resourceInstance);
        
        /**
         * Appends and returns a new empty "ResourceInstance" element
         */
        org.uicds.resourceInstanceService.ResourceInstance addNewResourceInstance();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse newInstance() {
              return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument.GetResourceInstanceResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument newInstance() {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.resourceInstanceService.GetResourceInstanceResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
