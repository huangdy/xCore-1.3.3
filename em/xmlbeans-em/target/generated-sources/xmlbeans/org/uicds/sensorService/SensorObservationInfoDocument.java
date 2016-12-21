/*
 * An XML document type.
 * Localname: SensorObservationInfo
 * Namespace: http://uicds.org/SensorService
 * Java type: org.uicds.sensorService.SensorObservationInfoDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.sensorService;


/**
 * A document containing one SensorObservationInfo(@http://uicds.org/SensorService) element.
 *
 * This is a complex type.
 */
public interface SensorObservationInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorObservationInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("sensorobservationinfo7ce7doctype");
    
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
     * An XML SensorObservationInfo(@http://uicds.org/SensorService).
     *
     * This is a complex type.
     */
    public interface SensorObservationInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SensorObservationInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("sensorobservationinfo713belemtype");
        
        /**
         * Gets the "sosURN" element
         */
        java.lang.String getSosURN();
        
        /**
         * Gets (as xml) the "sosURN" element
         */
        org.apache.xmlbeans.XmlString xgetSosURN();
        
        /**
         * Sets the "sosURN" element
         */
        void setSosURN(java.lang.String sosURN);
        
        /**
         * Sets (as xml) the "sosURN" element
         */
        void xsetSosURN(org.apache.xmlbeans.XmlString sosURN);
        
        /**
         * Gets array of all "SensorInfo" elements
         */
        org.uicds.sensorService.SensorInfoDocument.SensorInfo[] getSensorInfoArray();
        
        /**
         * Gets ith "SensorInfo" element
         */
        org.uicds.sensorService.SensorInfoDocument.SensorInfo getSensorInfoArray(int i);
        
        /**
         * Returns number of "SensorInfo" element
         */
        int sizeOfSensorInfoArray();
        
        /**
         * Sets array of all "SensorInfo" element
         */
        void setSensorInfoArray(org.uicds.sensorService.SensorInfoDocument.SensorInfo[] sensorInfoArray);
        
        /**
         * Sets ith "SensorInfo" element
         */
        void setSensorInfoArray(int i, org.uicds.sensorService.SensorInfoDocument.SensorInfo sensorInfo);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "SensorInfo" element
         */
        org.uicds.sensorService.SensorInfoDocument.SensorInfo insertNewSensorInfo(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "SensorInfo" element
         */
        org.uicds.sensorService.SensorInfoDocument.SensorInfo addNewSensorInfo();
        
        /**
         * Removes the ith "SensorInfo" element
         */
        void removeSensorInfo(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo newInstance() {
              return (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.sensorService.SensorObservationInfoDocument.SensorObservationInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.sensorService.SensorObservationInfoDocument newInstance() {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.sensorService.SensorObservationInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.sensorService.SensorObservationInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
