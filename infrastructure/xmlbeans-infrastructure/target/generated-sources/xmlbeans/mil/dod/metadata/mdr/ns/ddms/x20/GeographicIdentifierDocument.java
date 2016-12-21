/*
 * An XML document type.
 * Localname: geographicIdentifier
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20;


/**
 * A document containing one geographicIdentifier(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public interface GeographicIdentifierDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeographicIdentifierDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("geographicidentifiera4f6doctype");
    
    /**
     * Gets the "geographicIdentifier" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier getGeographicIdentifier();
    
    /**
     * Sets the "geographicIdentifier" element
     */
    void setGeographicIdentifier(mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier geographicIdentifier);
    
    /**
     * Appends and returns a new empty "geographicIdentifier" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier addNewGeographicIdentifier();
    
    /**
     * An XML geographicIdentifier(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
     *
     * This is a complex type.
     */
    public interface GeographicIdentifier extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GeographicIdentifier.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("geographicidentifier2812elemtype");
        
        /**
         * Gets array of all "name" elements
         */
        java.lang.String[] getNameArray();
        
        /**
         * Gets ith "name" element
         */
        java.lang.String getNameArray(int i);
        
        /**
         * Gets (as xml) array of all "name" elements
         */
        org.apache.xmlbeans.XmlString[] xgetNameArray();
        
        /**
         * Gets (as xml) ith "name" element
         */
        org.apache.xmlbeans.XmlString xgetNameArray(int i);
        
        /**
         * Returns number of "name" element
         */
        int sizeOfNameArray();
        
        /**
         * Sets array of all "name" element
         */
        void setNameArray(java.lang.String[] nameArray);
        
        /**
         * Sets ith "name" element
         */
        void setNameArray(int i, java.lang.String name);
        
        /**
         * Sets (as xml) array of all "name" element
         */
        void xsetNameArray(org.apache.xmlbeans.XmlString[] nameArray);
        
        /**
         * Sets (as xml) ith "name" element
         */
        void xsetNameArray(int i, org.apache.xmlbeans.XmlString name);
        
        /**
         * Inserts the value as the ith "name" element
         */
        void insertName(int i, java.lang.String name);
        
        /**
         * Appends the value as the last "name" element
         */
        void addName(java.lang.String name);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "name" element
         */
        org.apache.xmlbeans.XmlString insertNewName(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "name" element
         */
        org.apache.xmlbeans.XmlString addNewName();
        
        /**
         * Removes the ith "name" element
         */
        void removeName(int i);
        
        /**
         * Gets array of all "region" elements
         */
        java.lang.String[] getRegionArray();
        
        /**
         * Gets ith "region" element
         */
        java.lang.String getRegionArray(int i);
        
        /**
         * Gets (as xml) array of all "region" elements
         */
        org.apache.xmlbeans.XmlString[] xgetRegionArray();
        
        /**
         * Gets (as xml) ith "region" element
         */
        org.apache.xmlbeans.XmlString xgetRegionArray(int i);
        
        /**
         * Returns number of "region" element
         */
        int sizeOfRegionArray();
        
        /**
         * Sets array of all "region" element
         */
        void setRegionArray(java.lang.String[] regionArray);
        
        /**
         * Sets ith "region" element
         */
        void setRegionArray(int i, java.lang.String region);
        
        /**
         * Sets (as xml) array of all "region" element
         */
        void xsetRegionArray(org.apache.xmlbeans.XmlString[] regionArray);
        
        /**
         * Sets (as xml) ith "region" element
         */
        void xsetRegionArray(int i, org.apache.xmlbeans.XmlString region);
        
        /**
         * Inserts the value as the ith "region" element
         */
        void insertRegion(int i, java.lang.String region);
        
        /**
         * Appends the value as the last "region" element
         */
        void addRegion(java.lang.String region);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "region" element
         */
        org.apache.xmlbeans.XmlString insertNewRegion(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "region" element
         */
        org.apache.xmlbeans.XmlString addNewRegion();
        
        /**
         * Removes the ith "region" element
         */
        void removeRegion(int i);
        
        /**
         * Gets array of all "countryCode" elements
         */
        mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType[] getCountryCodeArray();
        
        /**
         * Gets ith "countryCode" element
         */
        mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType getCountryCodeArray(int i);
        
        /**
         * Returns number of "countryCode" element
         */
        int sizeOfCountryCodeArray();
        
        /**
         * Sets array of all "countryCode" element
         */
        void setCountryCodeArray(mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType[] countryCodeArray);
        
        /**
         * Sets ith "countryCode" element
         */
        void setCountryCodeArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType countryCode);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "countryCode" element
         */
        mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType insertNewCountryCode(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "countryCode" element
         */
        mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType addNewCountryCode();
        
        /**
         * Removes the ith "countryCode" element
         */
        void removeCountryCode(int i);
        
        /**
         * Gets array of all "facilityIdentifier" elements
         */
        mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType[] getFacilityIdentifierArray();
        
        /**
         * Gets ith "facilityIdentifier" element
         */
        mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType getFacilityIdentifierArray(int i);
        
        /**
         * Returns number of "facilityIdentifier" element
         */
        int sizeOfFacilityIdentifierArray();
        
        /**
         * Sets array of all "facilityIdentifier" element
         */
        void setFacilityIdentifierArray(mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType[] facilityIdentifierArray);
        
        /**
         * Sets ith "facilityIdentifier" element
         */
        void setFacilityIdentifierArray(int i, mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType facilityIdentifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "facilityIdentifier" element
         */
        mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType insertNewFacilityIdentifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "facilityIdentifier" element
         */
        mil.dod.metadata.mdr.ns.ddms.x20.FacilityIdentifierType addNewFacilityIdentifier();
        
        /**
         * Removes the ith "facilityIdentifier" element
         */
        void removeFacilityIdentifier(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier newInstance() {
              return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument.GeographicIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument newInstance() {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.GeographicIdentifierDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
