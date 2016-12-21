/*
 * An XML document type.
 * Localname: postalAddress
 * Namespace: http://metadata.dod.mil/mdr/ns/DDMS/2.0/
 * Java type: mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument
 *
 * Automatically generated - do not modify.
 */
package mil.dod.metadata.mdr.ns.ddms.x20;


/**
 * A document containing one postalAddress(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/) element.
 *
 * This is a complex type.
 */
public interface PostalAddressDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostalAddressDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("postaladdressca7fdoctype");
    
    /**
     * Gets the "postalAddress" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress getPostalAddress();
    
    /**
     * Sets the "postalAddress" element
     */
    void setPostalAddress(mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress postalAddress);
    
    /**
     * Appends and returns a new empty "postalAddress" element
     */
    mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress addNewPostalAddress();
    
    /**
     * An XML postalAddress(@http://metadata.dod.mil/mdr/ns/DDMS/2.0/).
     *
     * This is a complex type.
     */
    public interface PostalAddress extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PostalAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5B0F287CDBFBFD589D861D6926BCA1B3").resolveHandle("postaladdress150aelemtype");
        
        /**
         * Gets array of all "street" elements
         */
        java.lang.String[] getStreetArray();
        
        /**
         * Gets ith "street" element
         */
        java.lang.String getStreetArray(int i);
        
        /**
         * Gets (as xml) array of all "street" elements
         */
        org.apache.xmlbeans.XmlString[] xgetStreetArray();
        
        /**
         * Gets (as xml) ith "street" element
         */
        org.apache.xmlbeans.XmlString xgetStreetArray(int i);
        
        /**
         * Returns number of "street" element
         */
        int sizeOfStreetArray();
        
        /**
         * Sets array of all "street" element
         */
        void setStreetArray(java.lang.String[] streetArray);
        
        /**
         * Sets ith "street" element
         */
        void setStreetArray(int i, java.lang.String street);
        
        /**
         * Sets (as xml) array of all "street" element
         */
        void xsetStreetArray(org.apache.xmlbeans.XmlString[] streetArray);
        
        /**
         * Sets (as xml) ith "street" element
         */
        void xsetStreetArray(int i, org.apache.xmlbeans.XmlString street);
        
        /**
         * Inserts the value as the ith "street" element
         */
        void insertStreet(int i, java.lang.String street);
        
        /**
         * Appends the value as the last "street" element
         */
        void addStreet(java.lang.String street);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "street" element
         */
        org.apache.xmlbeans.XmlString insertNewStreet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "street" element
         */
        org.apache.xmlbeans.XmlString addNewStreet();
        
        /**
         * Removes the ith "street" element
         */
        void removeStreet(int i);
        
        /**
         * Gets the "city" element
         */
        java.lang.String getCity();
        
        /**
         * Gets (as xml) the "city" element
         */
        org.apache.xmlbeans.XmlString xgetCity();
        
        /**
         * True if has "city" element
         */
        boolean isSetCity();
        
        /**
         * Sets the "city" element
         */
        void setCity(java.lang.String city);
        
        /**
         * Sets (as xml) the "city" element
         */
        void xsetCity(org.apache.xmlbeans.XmlString city);
        
        /**
         * Unsets the "city" element
         */
        void unsetCity();
        
        /**
         * Gets the "state" element
         */
        java.lang.String getState();
        
        /**
         * Gets (as xml) the "state" element
         */
        org.apache.xmlbeans.XmlString xgetState();
        
        /**
         * True if has "state" element
         */
        boolean isSetState();
        
        /**
         * Sets the "state" element
         */
        void setState(java.lang.String state);
        
        /**
         * Sets (as xml) the "state" element
         */
        void xsetState(org.apache.xmlbeans.XmlString state);
        
        /**
         * Unsets the "state" element
         */
        void unsetState();
        
        /**
         * Gets the "province" element
         */
        java.lang.String getProvince();
        
        /**
         * Gets (as xml) the "province" element
         */
        org.apache.xmlbeans.XmlString xgetProvince();
        
        /**
         * True if has "province" element
         */
        boolean isSetProvince();
        
        /**
         * Sets the "province" element
         */
        void setProvince(java.lang.String province);
        
        /**
         * Sets (as xml) the "province" element
         */
        void xsetProvince(org.apache.xmlbeans.XmlString province);
        
        /**
         * Unsets the "province" element
         */
        void unsetProvince();
        
        /**
         * Gets the "postalCode" element
         */
        java.lang.String getPostalCode();
        
        /**
         * Gets (as xml) the "postalCode" element
         */
        org.apache.xmlbeans.XmlString xgetPostalCode();
        
        /**
         * True if has "postalCode" element
         */
        boolean isSetPostalCode();
        
        /**
         * Sets the "postalCode" element
         */
        void setPostalCode(java.lang.String postalCode);
        
        /**
         * Sets (as xml) the "postalCode" element
         */
        void xsetPostalCode(org.apache.xmlbeans.XmlString postalCode);
        
        /**
         * Unsets the "postalCode" element
         */
        void unsetPostalCode();
        
        /**
         * Gets the "countryCode" element
         */
        mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType getCountryCode();
        
        /**
         * True if has "countryCode" element
         */
        boolean isSetCountryCode();
        
        /**
         * Sets the "countryCode" element
         */
        void setCountryCode(mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType countryCode);
        
        /**
         * Appends and returns a new empty "countryCode" element
         */
        mil.dod.metadata.mdr.ns.ddms.x20.CompoundCountryCodeIdentifierType addNewCountryCode();
        
        /**
         * Unsets the "countryCode" element
         */
        void unsetCountryCode();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress newInstance() {
              return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument.PostalAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument newInstance() {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (mil.dod.metadata.mdr.ns.ddms.x20.PostalAddressDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
