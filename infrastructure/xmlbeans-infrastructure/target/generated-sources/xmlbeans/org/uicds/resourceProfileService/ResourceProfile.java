/*
 * XML Type:  ResourceProfile
 * Namespace: http://uicds.org/ResourceProfileService
 * Java type: org.uicds.resourceProfileService.ResourceProfile
 *
 * Automatically generated - do not modify.
 */
package org.uicds.resourceProfileService;


/**
 * An XML ResourceProfile(@http://uicds.org/ResourceProfileService).
 *
 * This is a complex type.
 */
public interface ResourceProfile extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceProfile.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("resourceprofile7ad9type");
    
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
     * Gets the "ResourceTyping" element
     */
    org.uicds.resourceProfileService.ResourceProfile.ResourceTyping getResourceTyping();
    
    /**
     * True if has "ResourceTyping" element
     */
    boolean isSetResourceTyping();
    
    /**
     * Sets the "ResourceTyping" element
     */
    void setResourceTyping(org.uicds.resourceProfileService.ResourceProfile.ResourceTyping resourceTyping);
    
    /**
     * Appends and returns a new empty "ResourceTyping" element
     */
    org.uicds.resourceProfileService.ResourceProfile.ResourceTyping addNewResourceTyping();
    
    /**
     * Unsets the "ResourceTyping" element
     */
    void unsetResourceTyping();
    
    /**
     * Gets the "Interests" element
     */
    org.uicds.resourceProfileService.ResourceProfile.Interests getInterests();
    
    /**
     * True if has "Interests" element
     */
    boolean isSetInterests();
    
    /**
     * Sets the "Interests" element
     */
    void setInterests(org.uicds.resourceProfileService.ResourceProfile.Interests interests);
    
    /**
     * Appends and returns a new empty "Interests" element
     */
    org.uicds.resourceProfileService.ResourceProfile.Interests addNewInterests();
    
    /**
     * Unsets the "Interests" element
     */
    void unsetInterests();
    
    /**
     * An XML ResourceTyping(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public interface ResourceTyping extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceTyping.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("resourcetypingcd7aelemtype");
        
        /**
         * Gets array of all "Type" elements
         */
        com.saic.precis.x2009.x06.base.CodespaceValueType[] getTypeArray();
        
        /**
         * Gets ith "Type" element
         */
        com.saic.precis.x2009.x06.base.CodespaceValueType getTypeArray(int i);
        
        /**
         * Returns number of "Type" element
         */
        int sizeOfTypeArray();
        
        /**
         * Sets array of all "Type" element
         */
        void setTypeArray(com.saic.precis.x2009.x06.base.CodespaceValueType[] typeArray);
        
        /**
         * Sets ith "Type" element
         */
        void setTypeArray(int i, com.saic.precis.x2009.x06.base.CodespaceValueType type);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Type" element
         */
        com.saic.precis.x2009.x06.base.CodespaceValueType insertNewType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Type" element
         */
        com.saic.precis.x2009.x06.base.CodespaceValueType addNewType();
        
        /**
         * Removes the ith "Type" element
         */
        void removeType(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.resourceProfileService.ResourceProfile.ResourceTyping newInstance() {
              return (org.uicds.resourceProfileService.ResourceProfile.ResourceTyping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.resourceProfileService.ResourceProfile.ResourceTyping newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.resourceProfileService.ResourceProfile.ResourceTyping) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Interests(@http://uicds.org/ResourceProfileService).
     *
     * This is a complex type.
     */
    public interface Interests extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Interests.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("interests576eelemtype");
        
        /**
         * Gets array of all "Interest" elements
         */
        org.uicds.resourceProfileService.Interest[] getInterestArray();
        
        /**
         * Gets ith "Interest" element
         */
        org.uicds.resourceProfileService.Interest getInterestArray(int i);
        
        /**
         * Returns number of "Interest" element
         */
        int sizeOfInterestArray();
        
        /**
         * Sets array of all "Interest" element
         */
        void setInterestArray(org.uicds.resourceProfileService.Interest[] interestArray);
        
        /**
         * Sets ith "Interest" element
         */
        void setInterestArray(int i, org.uicds.resourceProfileService.Interest interest);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Interest" element
         */
        org.uicds.resourceProfileService.Interest insertNewInterest(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Interest" element
         */
        org.uicds.resourceProfileService.Interest addNewInterest();
        
        /**
         * Removes the ith "Interest" element
         */
        void removeInterest(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.uicds.resourceProfileService.ResourceProfile.Interests newInstance() {
              return (org.uicds.resourceProfileService.ResourceProfile.Interests) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.uicds.resourceProfileService.ResourceProfile.Interests newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.uicds.resourceProfileService.ResourceProfile.Interests) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.uicds.resourceProfileService.ResourceProfile newInstance() {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.uicds.resourceProfileService.ResourceProfile parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.uicds.resourceProfileService.ResourceProfile parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.uicds.resourceProfileService.ResourceProfile parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.resourceProfileService.ResourceProfile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.uicds.resourceProfileService.ResourceProfile parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.uicds.resourceProfileService.ResourceProfile) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
