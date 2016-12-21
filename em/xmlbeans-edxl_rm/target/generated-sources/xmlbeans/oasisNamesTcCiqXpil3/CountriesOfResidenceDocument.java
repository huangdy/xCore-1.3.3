/*
 * An XML document type.
 * Localname: CountriesOfResidence
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.CountriesOfResidenceDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one CountriesOfResidence(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface CountriesOfResidenceDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CountriesOfResidenceDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("countriesofresidence1ad8doctype");
    
    /**
     * Gets the "CountriesOfResidence" element
     */
    oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence getCountriesOfResidence();
    
    /**
     * Sets the "CountriesOfResidence" element
     */
    void setCountriesOfResidence(oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence countriesOfResidence);
    
    /**
     * Appends and returns a new empty "CountriesOfResidence" element
     */
    oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence addNewCountriesOfResidence();
    
    /**
     * An XML CountriesOfResidence(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface CountriesOfResidence extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CountriesOfResidence.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("countriesofresidence7ee1elemtype");
        
        /**
         * Gets array of all "Country" elements
         */
        oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country[] getCountryArray();
        
        /**
         * Gets ith "Country" element
         */
        oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country getCountryArray(int i);
        
        /**
         * Returns number of "Country" element
         */
        int sizeOfCountryArray();
        
        /**
         * Sets array of all "Country" element
         */
        void setCountryArray(oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country[] countryArray);
        
        /**
         * Sets ith "Country" element
         */
        void setCountryArray(int i, oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country country);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Country" element
         */
        oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country insertNewCountry(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Country" element
         */
        oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country addNewCountry();
        
        /**
         * Removes the ith "Country" element
         */
        void removeCountry(int i);
        
        /**
         * An XML Country(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is a complex type.
         */
        public interface Country extends oasisNamesTcCiqXal3.CountryType
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Country.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("country37c3elemtype");
            
            /**
             * Gets the "Type" attribute
             */
            java.lang.String getType();
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            oasisNamesTcCiqXpil3.ResidencyTypeList xgetType();
            
            /**
             * True if has "Type" attribute
             */
            boolean isSetType();
            
            /**
             * Sets the "Type" attribute
             */
            void setType(java.lang.String type);
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            void xsetType(oasisNamesTcCiqXpil3.ResidencyTypeList type);
            
            /**
             * Unsets the "Type" attribute
             */
            void unsetType();
            
            /**
             * Gets the "Status" attribute
             */
            java.lang.String getStatus();
            
            /**
             * Gets (as xml) the "Status" attribute
             */
            oasisNamesTcCiqCt3.StatusList xgetStatus();
            
            /**
             * True if has "Status" attribute
             */
            boolean isSetStatus();
            
            /**
             * Sets the "Status" attribute
             */
            void setStatus(java.lang.String status);
            
            /**
             * Sets (as xml) the "Status" attribute
             */
            void xsetStatus(oasisNamesTcCiqCt3.StatusList status);
            
            /**
             * Unsets the "Status" attribute
             */
            void unsetStatus();
            
            /**
             * Gets the "DateValidFrom" attribute
             */
            java.util.Calendar getDateValidFrom();
            
            /**
             * Gets (as xml) the "DateValidFrom" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetDateValidFrom();
            
            /**
             * True if has "DateValidFrom" attribute
             */
            boolean isSetDateValidFrom();
            
            /**
             * Sets the "DateValidFrom" attribute
             */
            void setDateValidFrom(java.util.Calendar dateValidFrom);
            
            /**
             * Sets (as xml) the "DateValidFrom" attribute
             */
            void xsetDateValidFrom(org.apache.xmlbeans.XmlDateTime dateValidFrom);
            
            /**
             * Unsets the "DateValidFrom" attribute
             */
            void unsetDateValidFrom();
            
            /**
             * Gets the "DateValidTo" attribute
             */
            java.util.Calendar getDateValidTo();
            
            /**
             * Gets (as xml) the "DateValidTo" attribute
             */
            org.apache.xmlbeans.XmlDateTime xgetDateValidTo();
            
            /**
             * True if has "DateValidTo" attribute
             */
            boolean isSetDateValidTo();
            
            /**
             * Sets the "DateValidTo" attribute
             */
            void setDateValidTo(java.util.Calendar dateValidTo);
            
            /**
             * Sets (as xml) the "DateValidTo" attribute
             */
            void xsetDateValidTo(org.apache.xmlbeans.XmlDateTime dateValidTo);
            
            /**
             * Unsets the "DateValidTo" attribute
             */
            void unsetDateValidTo();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country newInstance() {
                  return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence newInstance() {
              return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument.CountriesOfResidence) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument newInstance() {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.CountriesOfResidenceDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.CountriesOfResidenceDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}