/*
 * An XML document type.
 * Localname: GetLogByLoggerResponse
 * Namespace: http://uicds.org/LoggingService
 * Java type: org.uicds.loggingService.GetLogByLoggerResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.loggingService;


/**
 * A document containing one GetLogByLoggerResponse(@http://uicds.org/LoggingService) element.
 *
 * This is a complex type.
 */
public interface GetLogByLoggerResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLogByLoggerResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("getlogbyloggerresponseadd2doctype");
    
    /**
     * Gets the "GetLogByLoggerResponse" element
     */
    org.uicds.loggingService.GetLogByLoggerResponseDocument.GetLogByLoggerResponse getGetLogByLoggerResponse();
    
    /**
     * Sets the "GetLogByLoggerResponse" element
     */
    void setGetLogByLoggerResponse(org.uicds.loggingService.GetLogByLoggerResponseDocument.GetLogByLoggerResponse getLogByLoggerResponse);
    
    /**
     * Appends and returns a new empty "GetLogByLoggerResponse" element
     */
    org.uicds.loggingService.GetLogByLoggerResponseDocument.GetLogByLoggerResponse addNewGetLogByLoggerResponse();
    
    /**
     * An XML GetLogByLoggerResponse(@http://uicds.org/LoggingService).
     *
     * This is a complex type.
     */
    public interface GetLogByLoggerResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetLogByLoggerResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("getlogbyloggerresponse2d00elemtype");
        
        /**
         * Gets the "logger" element
         */
        java.lang.String getLogger();
        
        /**
         * Gets (as xml) the "logger" element
         */
        org.apache.xmlbeans.XmlString xgetLogger();
        
        /**
         * Sets the "logger" element
         */
        void setLogger(java.lang.String logger);
        
        /**
         * Sets (as xml) the "logger" element
         */
        void xsetLogger(org.apache.xmlbeans.XmlString logger);
        
        /**
         * Gets the "numberOfRecords" element
         */
        int getNumberOfRecords();
        
        /**
         * Gets (as xml) the "numberOfRecords" element
         */
        org.apache.xmlbeans.XmlInt xgetNumberOfRecords();
        
        /**
         * Sets the "numberOfRecords" element
         */
        void setNumberOfRecords(int numberOfRecords);
        
        /**
         * Sets (as xml) the "numberOfRecords" element
         */
        void xsetNumberOfRecords(org.apache.xmlbeans.XmlInt numberOfRecords);
        
        /**
         * Gets array of all "logRecord" elements
         */
        org.uicds.loggingService.LogType[] getLogRecordArray();
        
        /**
         * Gets ith "logRecord" element
         */
        org.uicds.loggingService.LogType getLogRecordArray(int i);
        
        /**
         * Returns number of "logRecord" element
         */
        int sizeOfLogRecordArray();
        
        /**
         * Sets array of all "logRecord" element
         */
        void setLogRecordArray(org.uicds.loggingService.LogType[] logRecordArray);
        
        /**
         * Sets ith "logRecord" element
         */
        void setLogRecordArray(int i, org.uicds.loggingService.LogType logRecord);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "logRecord" element
         */
        org.uicds.loggingService.LogType insertNewLogRecord(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "logRecord" element
         */
        org.uicds.loggingService.LogType addNewLogRecord();
        
        /**
         * Removes the ith "logRecord" element
         */
        void removeLogRecord(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.loggingService.GetLogByLoggerResponseDocument.GetLogByLoggerResponse newInstance() {
              return (org.uicds.loggingService.GetLogByLoggerResponseDocument.GetLogByLoggerResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.loggingService.GetLogByLoggerResponseDocument.GetLogByLoggerResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.loggingService.GetLogByLoggerResponseDocument.GetLogByLoggerResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument newInstance() {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.loggingService.GetLogByLoggerResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.loggingService.GetLogByLoggerResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
