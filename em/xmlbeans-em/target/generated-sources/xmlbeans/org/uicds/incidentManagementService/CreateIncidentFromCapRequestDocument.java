/*
 * An XML document type.
 * Localname: CreateIncidentFromCapRequest
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService;


/**
 * A document containing one CreateIncidentFromCapRequest(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public interface CreateIncidentFromCapRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateIncidentFromCapRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("createincidentfromcaprequest59c5doctype");
    
    /**
     * Gets the "CreateIncidentFromCapRequest" element
     */
    org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest getCreateIncidentFromCapRequest();
    
    /**
     * Sets the "CreateIncidentFromCapRequest" element
     */
    void setCreateIncidentFromCapRequest(org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest createIncidentFromCapRequest);
    
    /**
     * Appends and returns a new empty "CreateIncidentFromCapRequest" element
     */
    org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest addNewCreateIncidentFromCapRequest();
    
    /**
     * An XML CreateIncidentFromCapRequest(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public interface CreateIncidentFromCapRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateIncidentFromCapRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("createincidentfromcaprequeste476elemtype");
        
        /**
         * Gets the "alert" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert getAlert();
        
        /**
         * Sets the "alert" element
         */
        void setAlert(x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert alert);
        
        /**
         * Appends and returns a new empty "alert" element
         */
        x1.oasisNamesTcEmergencyCap1.AlertDocument.Alert addNewAlert();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest newInstance() {
              return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument.CreateIncidentFromCapRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument newInstance() {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incidentManagementService.CreateIncidentFromCapRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
