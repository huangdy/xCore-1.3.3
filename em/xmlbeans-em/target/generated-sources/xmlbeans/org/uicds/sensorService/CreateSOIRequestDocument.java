/*
 * An XML document type.
 * Localname: CreateSOIRequest
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorService.CreateSOIRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorService;


/**
 * A document containing one CreateSOIRequest(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public interface CreateSOIRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateSOIRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("createsoirequest56d7doctype");
    
    /**
     * Gets the "CreateSOIRequest" element
     */
    org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest getCreateSOIRequest();
    
    /**
     * Sets the "CreateSOIRequest" element
     */
    void setCreateSOIRequest(org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest createSOIRequest);
    
    /**
     * Appends and returns a new empty "CreateSOIRequest" element
     */
    org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest addNewCreateSOIRequest();
    
    /**
     * An XML CreateSOIRequest(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public interface CreateSOIRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateSOIRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("createsoirequest9371elemtype");
        
        /**
         * Gets the "incidentID" element
         */
        java.lang.String getIncidentID();
        
        /**
         * Gets (as xml) the "incidentID" element
         */
        org.apache.xmlbeans.XmlString xgetIncidentID();
        
        /**
         * True if has "incidentID" element
         */
        boolean isSetIncidentID();
        
        /**
         * Sets the "incidentID" element
         */
        void setIncidentID(java.lang.String incidentID);
        
        /**
         * Sets (as xml) the "incidentID" element
         */
        void xsetIncidentID(org.apache.xmlbeans.XmlString incidentID);
        
        /**
         * Unsets the "incidentID" element
         */
        void unsetIncidentID();
        
        /**
         * Gets the "SensorObservationInfo" element
         */
        org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo getSensorObservationInfo();
        
        /**
         * Sets the "SensorObservationInfo" element
         */
        void setSensorObservationInfo(org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo sensorObservationInfo);
        
        /**
         * Appends and returns a new empty "SensorObservationInfo" element
         */
        org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo addNewSensorObservationInfo();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest newInstance() {
              return (org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.sensorService.CreateSOIRequestDocument.CreateSOIRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.sensorService.CreateSOIRequestDocument newInstance() {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.sensorService.CreateSOIRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.sensorService.CreateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
