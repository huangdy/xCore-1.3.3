/*
 * An XML document type.
 * Localname: UpdateSOIRequest
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorService.UpdateSOIRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorService;


/**
 * A document containing one UpdateSOIRequest(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public interface UpdateSOIRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateSOIRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("updatesoirequest29aadoctype");
    
    /**
     * Gets the "UpdateSOIRequest" element
     */
    org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest getUpdateSOIRequest();
    
    /**
     * Sets the "UpdateSOIRequest" element
     */
    void setUpdateSOIRequest(org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest updateSOIRequest);
    
    /**
     * Appends and returns a new empty "UpdateSOIRequest" element
     */
    org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest addNewUpdateSOIRequest();
    
    /**
     * An XML UpdateSOIRequest(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public interface UpdateSOIRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UpdateSOIRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("updatesoirequest0491elemtype");
        
        /**
         * Gets the "WorkProductIdentification" element
         */
        com.saic.precis.x2009.x06.base.IdentificationType getWorkProductIdentification();
        
        /**
         * Sets the "WorkProductIdentification" element
         */
        void setWorkProductIdentification(com.saic.precis.x2009.x06.base.IdentificationType workProductIdentification);
        
        /**
         * Appends and returns a new empty "WorkProductIdentification" element
         */
        com.saic.precis.x2009.x06.base.IdentificationType addNewWorkProductIdentification();
        
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
            public static org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest newInstance() {
              return (org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.sensorService.UpdateSOIRequestDocument.UpdateSOIRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.sensorService.UpdateSOIRequestDocument newInstance() {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.sensorService.UpdateSOIRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.sensorService.UpdateSOIRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
