/*
 * An XML document type.
 * Localname: EdxlDeRequest
 * Namespace: http://uicds.org/ResourceManagementService
 * Java type: org.uicds.resourceManagementService.EdxlDeRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceManagementService;


/**
 * A document containing one EdxlDeRequest(@http://uicds.org/ResourceManagementService) element.
 *
 * This is a complex type.
 */
public interface EdxlDeRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EdxlDeRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("edxlderequestcd95doctype");
    
    /**
     * Gets the "EdxlDeRequest" element
     */
    org.uicds.resourceManagementService.EdxlDeRequestDocument.EdxlDeRequest getEdxlDeRequest();
    
    /**
     * Sets the "EdxlDeRequest" element
     */
    void setEdxlDeRequest(org.uicds.resourceManagementService.EdxlDeRequestDocument.EdxlDeRequest edxlDeRequest);
    
    /**
     * Appends and returns a new empty "EdxlDeRequest" element
     */
    org.uicds.resourceManagementService.EdxlDeRequestDocument.EdxlDeRequest addNewEdxlDeRequest();
    
    /**
     * An XML EdxlDeRequest(@http://uicds.org/ResourceManagementService).
     *
     * This is a complex type.
     */
    public interface EdxlDeRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EdxlDeRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("edxlderequest06aeelemtype");
        
        /**
         * Gets the "EDXLDistribution" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution getEDXLDistribution();
        
        /**
         * Sets the "EDXLDistribution" element
         */
        void setEDXLDistribution(x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution edxlDistribution);
        
        /**
         * Appends and returns a new empty "EDXLDistribution" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution addNewEDXLDistribution();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.resourceManagementService.EdxlDeRequestDocument.EdxlDeRequest newInstance() {
              return (org.uicds.resourceManagementService.EdxlDeRequestDocument.EdxlDeRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.resourceManagementService.EdxlDeRequestDocument.EdxlDeRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.resourceManagementService.EdxlDeRequestDocument.EdxlDeRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument newInstance() {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.resourceManagementService.EdxlDeRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.resourceManagementService.EdxlDeRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
