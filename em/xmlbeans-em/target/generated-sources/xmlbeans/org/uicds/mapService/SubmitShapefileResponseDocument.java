/*
 * An XML document type.
 * Localname: SubmitShapefileResponse
 * Namespace: http://uicds.org/MapService
 * Java type: org.uicds.mapService.SubmitShapefileResponseDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.mapService;


/**
 * A document containing one SubmitShapefileResponse(@http://uicds.org/MapService) element.
 *
 * This is a complex type.
 */
public interface SubmitShapefileResponseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmitShapefileResponseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("submitshapefileresponsec213doctype");
    
    /**
     * Gets the "SubmitShapefileResponse" element
     */
    org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse getSubmitShapefileResponse();
    
    /**
     * Sets the "SubmitShapefileResponse" element
     */
    void setSubmitShapefileResponse(org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse submitShapefileResponse);
    
    /**
     * Appends and returns a new empty "SubmitShapefileResponse" element
     */
    org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse addNewSubmitShapefileResponse();
    
    /**
     * An XML SubmitShapefileResponse(@http://uicds.org/MapService).
     *
     * This is a complex type.
     */
    public interface SubmitShapefileResponse extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubmitShapefileResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("submitshapefileresponse6fa5elemtype");
        
        /**
         * Gets array of all "WorkProductPublicationResponse" elements
         */
        org.uicds.workProductService.WorkProductPublicationResponseType[] getWorkProductPublicationResponseArray();
        
        /**
         * Gets ith "WorkProductPublicationResponse" element
         */
        org.uicds.workProductService.WorkProductPublicationResponseType getWorkProductPublicationResponseArray(int i);
        
        /**
         * Returns number of "WorkProductPublicationResponse" element
         */
        int sizeOfWorkProductPublicationResponseArray();
        
        /**
         * Sets array of all "WorkProductPublicationResponse" element
         */
        void setWorkProductPublicationResponseArray(org.uicds.workProductService.WorkProductPublicationResponseType[] workProductPublicationResponseArray);
        
        /**
         * Sets ith "WorkProductPublicationResponse" element
         */
        void setWorkProductPublicationResponseArray(int i, org.uicds.workProductService.WorkProductPublicationResponseType workProductPublicationResponse);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "WorkProductPublicationResponse" element
         */
        org.uicds.workProductService.WorkProductPublicationResponseType insertNewWorkProductPublicationResponse(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "WorkProductPublicationResponse" element
         */
        org.uicds.workProductService.WorkProductPublicationResponseType addNewWorkProductPublicationResponse();
        
        /**
         * Removes the ith "WorkProductPublicationResponse" element
         */
        void removeWorkProductPublicationResponse(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse newInstance() {
              return (org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.mapService.SubmitShapefileResponseDocument.SubmitShapefileResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.mapService.SubmitShapefileResponseDocument newInstance() {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.mapService.SubmitShapefileResponseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.mapService.SubmitShapefileResponseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
