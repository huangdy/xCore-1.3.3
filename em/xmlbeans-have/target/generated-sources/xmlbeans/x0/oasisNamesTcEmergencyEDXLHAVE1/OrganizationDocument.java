/*
 * An XML document type.
 * Localname: Organization
 * Namespace: urn:oasis:names:tc:emergency:EDXL:HAVE:1.0
 * Java type: x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument
 *
 * Automatically generated - do not modify.
 */
package x0.oasisNamesTcEmergencyEDXLHAVE1;


/**
 * A document containing one Organization(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0) element.
 *
 * This is a complex type.
 */
public interface OrganizationDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrganizationDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("organizationdc12doctype");
    
    /**
     * Gets the "Organization" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization getOrganization();
    
    /**
     * Sets the "Organization" element
     */
    void setOrganization(x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization organization);
    
    /**
     * Appends and returns a new empty "Organization" element
     */
    x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization addNewOrganization();
    
    /**
     * An XML Organization(@urn:oasis:names:tc:emergency:EDXL:HAVE:1.0).
     *
     * This is a complex type.
     */
    public interface Organization extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Organization.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF094D4349710D2D25EB7F90F248D9BF6").resolveHandle("organizatione941elemtype");
        
        /**
         * Gets the "OrganizationInformation" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation getOrganizationInformation();
        
        /**
         * Sets the "OrganizationInformation" element
         */
        void setOrganizationInformation(x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation organizationInformation);
        
        /**
         * Appends and returns a new empty "OrganizationInformation" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationInformation addNewOrganizationInformation();
        
        /**
         * Gets the "OrganizationGeoLocation" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation getOrganizationGeoLocation();
        
        /**
         * True if has "OrganizationGeoLocation" element
         */
        boolean isSetOrganizationGeoLocation();
        
        /**
         * Sets the "OrganizationGeoLocation" element
         */
        void setOrganizationGeoLocation(x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation organizationGeoLocation);
        
        /**
         * Appends and returns a new empty "OrganizationGeoLocation" element
         */
        x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationGeoLocation addNewOrganizationGeoLocation();
        
        /**
         * Unsets the "OrganizationGeoLocation" element
         */
        void unsetOrganizationGeoLocation();
        
        /**
         * Gets array of all "CommentText" elements
         */
        java.lang.String[] getCommentTextArray();
        
        /**
         * Gets ith "CommentText" element
         */
        java.lang.String getCommentTextArray(int i);
        
        /**
         * Gets (as xml) array of all "CommentText" elements
         */
        org.apache.xmlbeans.XmlString[] xgetCommentTextArray();
        
        /**
         * Gets (as xml) ith "CommentText" element
         */
        org.apache.xmlbeans.XmlString xgetCommentTextArray(int i);
        
        /**
         * Returns number of "CommentText" element
         */
        int sizeOfCommentTextArray();
        
        /**
         * Sets array of all "CommentText" element
         */
        void setCommentTextArray(java.lang.String[] commentTextArray);
        
        /**
         * Sets ith "CommentText" element
         */
        void setCommentTextArray(int i, java.lang.String commentText);
        
        /**
         * Sets (as xml) array of all "CommentText" element
         */
        void xsetCommentTextArray(org.apache.xmlbeans.XmlString[] commentTextArray);
        
        /**
         * Sets (as xml) ith "CommentText" element
         */
        void xsetCommentTextArray(int i, org.apache.xmlbeans.XmlString commentText);
        
        /**
         * Inserts the value as the ith "CommentText" element
         */
        void insertCommentText(int i, java.lang.String commentText);
        
        /**
         * Appends the value as the last "CommentText" element
         */
        void addCommentText(java.lang.String commentText);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "CommentText" element
         */
        org.apache.xmlbeans.XmlString insertNewCommentText(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "CommentText" element
         */
        org.apache.xmlbeans.XmlString addNewCommentText();
        
        /**
         * Removes the ith "CommentText" element
         */
        void removeCommentText(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization newInstance() {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument.Organization) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument newInstance() {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (x0.oasisNamesTcEmergencyEDXLHAVE1.OrganizationDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
