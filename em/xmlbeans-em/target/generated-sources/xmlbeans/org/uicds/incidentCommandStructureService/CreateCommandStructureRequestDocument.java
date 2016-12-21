/*
 * An XML document type.
 * Localname: CreateCommandStructureRequest
 * Namespace: http://uicds.org/IncidentCommandStructureService
 * Java type: org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.uicds.incidentCommandStructureService;


/**
 * A document containing one CreateCommandStructureRequest(@http://uicds.org/IncidentCommandStructureService) element.
 *
 * This is a complex type.
 */
public interface CreateCommandStructureRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateCommandStructureRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("createcommandstructurerequest3a1cdoctype");
    
    /**
     * Gets the "CreateCommandStructureRequest" element
     */
    org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest getCreateCommandStructureRequest();
    
    /**
     * Sets the "CreateCommandStructureRequest" element
     */
    void setCreateCommandStructureRequest(org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest createCommandStructureRequest);
    
    /**
     * Appends and returns a new empty "CreateCommandStructureRequest" element
     */
    org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest addNewCreateCommandStructureRequest();
    
    /**
     * An XML CreateCommandStructureRequest(@http://uicds.org/IncidentCommandStructureService).
     *
     * This is a complex type.
     */
    public interface CreateCommandStructureRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CreateCommandStructureRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s88E0BAFB56DF7B926B55FFA41A52F5BA").resolveHandle("createcommandstructurerequest5a45elemtype");
        
        /**
         * Gets the "OrganizationElement" element
         */
        org.uicds.organizationElement.OrganizationElementType getOrganizationElement();
        
        /**
         * Sets the "OrganizationElement" element
         */
        void setOrganizationElement(org.uicds.organizationElement.OrganizationElementType organizationElement);
        
        /**
         * Appends and returns a new empty "OrganizationElement" element
         */
        org.uicds.organizationElement.OrganizationElementType addNewOrganizationElement();
        
        /**
         * Gets the "IncidentID" element
         */
        java.lang.String getIncidentID();
        
        /**
         * Gets (as xml) the "IncidentID" element
         */
        org.apache.xmlbeans.XmlString xgetIncidentID();
        
        /**
         * True if has "IncidentID" element
         */
        boolean isSetIncidentID();
        
        /**
         * Sets the "IncidentID" element
         */
        void setIncidentID(java.lang.String incidentID);
        
        /**
         * Sets (as xml) the "IncidentID" element
         */
        void xsetIncidentID(org.apache.xmlbeans.XmlString incidentID);
        
        /**
         * Unsets the "IncidentID" element
         */
        void unsetIncidentID();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest newInstance() {
              return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument.CreateCommandStructureRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument newInstance() {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.incidentCommandStructureService.CreateCommandStructureRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
