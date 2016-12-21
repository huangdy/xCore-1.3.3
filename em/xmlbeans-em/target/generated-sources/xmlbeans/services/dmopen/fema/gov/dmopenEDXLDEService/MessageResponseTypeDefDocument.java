/*
 * An XML document type.
 * Localname: messageResponseTypeDef
 * Namespace: http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/
 * Java type: services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument
 *
 * Automatically generated - do not modify.
 */
package services.dmopen.fema.gov.dmopenEDXLDEService;


/**
 * A document containing one messageResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/) element.
 *
 * This is a complex type.
 */
public interface MessageResponseTypeDefDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageResponseTypeDefDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("messageresponsetypedef3677doctype");
    
    /**
     * Gets the "messageResponseTypeDef" element
     */
    services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef getMessageResponseTypeDef();
    
    /**
     * Sets the "messageResponseTypeDef" element
     */
    void setMessageResponseTypeDef(services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef messageResponseTypeDef);
    
    /**
     * Appends and returns a new empty "messageResponseTypeDef" element
     */
    services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef addNewMessageResponseTypeDef();
    
    /**
     * An XML messageResponseTypeDef(@http://gov.fema.dmopen.services/DMOPEN_EDXLDEService/).
     *
     * This is a complex type.
     */
    public interface MessageResponseTypeDef extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageResponseTypeDef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("messageresponsetypedefce18elemtype");
        
        /**
         * Gets array of all "EDXLDistribution" elements
         */
        x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution[] getEDXLDistributionArray();
        
        /**
         * Gets ith "EDXLDistribution" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution getEDXLDistributionArray(int i);
        
        /**
         * Returns number of "EDXLDistribution" element
         */
        int sizeOfEDXLDistributionArray();
        
        /**
         * Sets array of all "EDXLDistribution" element
         */
        void setEDXLDistributionArray(x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution[] edxlDistributionArray);
        
        /**
         * Sets ith "EDXLDistribution" element
         */
        void setEDXLDistributionArray(int i, x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution edxlDistribution);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "EDXLDistribution" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution insertNewEDXLDistribution(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "EDXLDistribution" element
         */
        x0.oasisNamesTcEmergencyEDXLDE1.EDXLDistributionDocument.EDXLDistribution addNewEDXLDistribution();
        
        /**
         * Removes the ith "EDXLDistribution" element
         */
        void removeEDXLDistribution(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef newInstance() {
              return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument.MessageResponseTypeDef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument newInstance() {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (services.dmopen.fema.gov.dmopenEDXLDEService.MessageResponseTypeDefDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
