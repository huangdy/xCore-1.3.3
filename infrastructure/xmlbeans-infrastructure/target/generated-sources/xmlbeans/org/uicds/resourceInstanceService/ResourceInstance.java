/*
 * XML Type:  ResourceInstance
 * Namespace: http://uicds.org/ResourceInstanceService
 * Java type: org.uicds.resourceInstanceService.ResourceInstance
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceInstanceService;


/**
 * An XML ResourceInstance(@http://uicds.org/ResourceInstanceService).
 *
 * This is a complex type.
 */
public interface ResourceInstance extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceInstance.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("resourceinstance01f9type");
    
    /**
     * Gets the "ID" element
     */
    com.saic.precis.x2009.x06.base.IdentifierType getID();
    
    /**
     * Sets the "ID" element
     */
    void setID(com.saic.precis.x2009.x06.base.IdentifierType id);
    
    /**
     * Appends and returns a new empty "ID" element
     */
    com.saic.precis.x2009.x06.base.IdentifierType addNewID();
    
    /**
     * Gets the "Description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "Description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Sets the "Description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "Description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Gets the "SourceIdentification" element
     */
    org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification getSourceIdentification();
    
    /**
     * Sets the "SourceIdentification" element
     */
    void setSourceIdentification(org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification sourceIdentification);
    
    /**
     * Appends and returns a new empty "SourceIdentification" element
     */
    org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification addNewSourceIdentification();
    
    /**
     * Gets array of all "Keyword" elements
     */
    com.saic.precis.x2009.x06.base.CodespaceValueType[] getKeywordArray();
    
    /**
     * Gets ith "Keyword" element
     */
    com.saic.precis.x2009.x06.base.CodespaceValueType getKeywordArray(int i);
    
    /**
     * Returns number of "Keyword" element
     */
    int sizeOfKeywordArray();
    
    /**
     * Sets array of all "Keyword" element
     */
    void setKeywordArray(com.saic.precis.x2009.x06.base.CodespaceValueType[] keywordArray);
    
    /**
     * Sets ith "Keyword" element
     */
    void setKeywordArray(int i, com.saic.precis.x2009.x06.base.CodespaceValueType keyword);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Keyword" element
     */
    com.saic.precis.x2009.x06.base.CodespaceValueType insertNewKeyword(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Keyword" element
     */
    com.saic.precis.x2009.x06.base.CodespaceValueType addNewKeyword();
    
    /**
     * Removes the ith "Keyword" element
     */
    void removeKeyword(int i);
    
    /**
     * Gets the "Endpoints" element
     */
    org.uicds.resourceInstanceService.ResourceInstance.Endpoints getEndpoints();
    
    /**
     * True if has "Endpoints" element
     */
    boolean isSetEndpoints();
    
    /**
     * Sets the "Endpoints" element
     */
    void setEndpoints(org.uicds.resourceInstanceService.ResourceInstance.Endpoints endpoints);
    
    /**
     * Appends and returns a new empty "Endpoints" element
     */
    org.uicds.resourceInstanceService.ResourceInstance.Endpoints addNewEndpoints();
    
    /**
     * Unsets the "Endpoints" element
     */
    void unsetEndpoints();
    
    /**
     * Gets the "ProfileIDs" element
     */
    org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs getProfileIDs();
    
    /**
     * True if has "ProfileIDs" element
     */
    boolean isSetProfileIDs();
    
    /**
     * Sets the "ProfileIDs" element
     */
    void setProfileIDs(org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs profileIDs);
    
    /**
     * Appends and returns a new empty "ProfileIDs" element
     */
    org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs addNewProfileIDs();
    
    /**
     * Unsets the "ProfileIDs" element
     */
    void unsetProfileIDs();
    
    /**
     * An XML SourceIdentification(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public interface SourceIdentification extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SourceIdentification.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("sourceidentificatione09eelemtype");
        
        /**
         * Gets the "LocalResourceID" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType getLocalResourceID();
        
        /**
         * Sets the "LocalResourceID" element
         */
        void setLocalResourceID(com.saic.precis.x2009.x06.base.IdentifierType localResourceID);
        
        /**
         * Appends and returns a new empty "LocalResourceID" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType addNewLocalResourceID();
        
        /**
         * Gets the "CoreID" element
         */
        java.lang.String getCoreID();
        
        /**
         * Gets (as xml) the "CoreID" element
         */
        org.apache.xmlbeans.XmlString xgetCoreID();
        
        /**
         * Sets the "CoreID" element
         */
        void setCoreID(java.lang.String coreID);
        
        /**
         * Sets (as xml) the "CoreID" element
         */
        void xsetCoreID(org.apache.xmlbeans.XmlString coreID);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification newInstance() {
              return (org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.resourceInstanceService.ResourceInstance.SourceIdentification) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Endpoints(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public interface Endpoints extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Endpoints.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("endpointsfec3elemtype");
        
        /**
         * Gets array of all "Endpoint" elements
         */
        org.w3.x2005.x08.addressing.EndpointReferenceType[] getEndpointArray();
        
        /**
         * Gets ith "Endpoint" element
         */
        org.w3.x2005.x08.addressing.EndpointReferenceType getEndpointArray(int i);
        
        /**
         * Returns number of "Endpoint" element
         */
        int sizeOfEndpointArray();
        
        /**
         * Sets array of all "Endpoint" element
         */
        void setEndpointArray(org.w3.x2005.x08.addressing.EndpointReferenceType[] endpointArray);
        
        /**
         * Sets ith "Endpoint" element
         */
        void setEndpointArray(int i, org.w3.x2005.x08.addressing.EndpointReferenceType endpoint);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Endpoint" element
         */
        org.w3.x2005.x08.addressing.EndpointReferenceType insertNewEndpoint(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Endpoint" element
         */
        org.w3.x2005.x08.addressing.EndpointReferenceType addNewEndpoint();
        
        /**
         * Removes the ith "Endpoint" element
         */
        void removeEndpoint(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.resourceInstanceService.ResourceInstance.Endpoints newInstance() {
              return (org.uicds.resourceInstanceService.ResourceInstance.Endpoints) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.resourceInstanceService.ResourceInstance.Endpoints newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.resourceInstanceService.ResourceInstance.Endpoints) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ProfileIDs(@http://uicds.org/ResourceInstanceService).
     *
     * This is a complex type.
     */
    public interface ProfileIDs extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProfileIDs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("profileids42a4elemtype");
        
        /**
         * Gets array of all "ProfileID" elements
         */
        com.saic.precis.x2009.x06.base.IdentifierType[] getProfileIDArray();
        
        /**
         * Gets ith "ProfileID" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType getProfileIDArray(int i);
        
        /**
         * Returns number of "ProfileID" element
         */
        int sizeOfProfileIDArray();
        
        /**
         * Sets array of all "ProfileID" element
         */
        void setProfileIDArray(com.saic.precis.x2009.x06.base.IdentifierType[] profileIDArray);
        
        /**
         * Sets ith "ProfileID" element
         */
        void setProfileIDArray(int i, com.saic.precis.x2009.x06.base.IdentifierType profileID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ProfileID" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType insertNewProfileID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ProfileID" element
         */
        com.saic.precis.x2009.x06.base.IdentifierType addNewProfileID();
        
        /**
         * Removes the ith "ProfileID" element
         */
        void removeProfileID(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs newInstance() {
              return (org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.resourceInstanceService.ResourceInstance.ProfileIDs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.resourceInstanceService.ResourceInstance newInstance() {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.resourceInstanceService.ResourceInstance parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.resourceInstanceService.ResourceInstance parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.resourceInstanceService.ResourceInstance parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.resourceInstanceService.ResourceInstance parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.resourceInstanceService.ResourceInstance parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.resourceInstanceService.ResourceInstance) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
