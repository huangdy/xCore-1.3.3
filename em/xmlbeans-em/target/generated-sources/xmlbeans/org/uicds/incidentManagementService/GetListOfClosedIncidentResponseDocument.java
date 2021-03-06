/*
 * An XML document type.
 * Localname: GetListOfClosedIncidentResponse
 * Namespace: http://uicds.org/IncidentManagementService
 * Java type: org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentManagementService;


/**
 * A document containing one GetListOfClosedIncidentResponse(@http://uicds.org/IncidentManagementService) element.
 *
 * This is a complex type.
 */
public interface GetListOfClosedIncidentResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListOfClosedIncidentResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("getlistofclosedincidentresponse2942doctype");
    
    /**
     * Gets the "GetListOfClosedIncidentResponse" element
     */
    org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse getGetListOfClosedIncidentResponse();
    
    /**
     * Sets the "GetListOfClosedIncidentResponse" element
     */
    void setGetListOfClosedIncidentResponse(org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse getListOfClosedIncidentResponse);
    
    /**
     * Appends and returns a new empty "GetListOfClosedIncidentResponse" element
     */
    org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse addNewGetListOfClosedIncidentResponse();
    
    /**
     * An XML GetListOfClosedIncidentResponse(@http://uicds.org/IncidentManagementService).
     *
     * This is a complex type.
     */
    public interface GetListOfClosedIncidentResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetListOfClosedIncidentResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("getlistofclosedincidentresponseb40celemtype");
        
        /**
         * Gets array of all "Identifier" elements
         */
        com.saic.precis.x2009.x06.base.IdentifierType[] getIdentifierArray();
        
        /**
         * Gets ith "Identifier" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType getIdentifierArray(int i);
        
        /**
         * Returns number of "Identifier" element
         */
        int sizeOfIdentifierArray();
        
        /**
         * Sets array of all "Identifier" element
         */
        void setIdentifierArray(com.saic.precis.x2009.x06.base.IdentifierType[] identifierArray);
        
        /**
         * Sets ith "Identifier" element
         */
        void setIdentifierArray(int i, com.saic.precis.x2009.x06.base.IdentifierType identifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Identifier" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType insertNewIdentifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Identifier" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType addNewIdentifier();
        
        /**
         * Removes the ith "Identifier" element
         */
        void removeIdentifier(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse newInstance() {
              return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument.GetListOfClosedIncidentResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument newInstance() {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incidentManagementService.GetListOfClosedIncidentResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
