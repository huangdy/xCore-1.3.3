/*
 * An XML document type.
 * Localname: BirthInfo
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.BirthInfoDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one BirthInfo(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface BirthInfoDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BirthInfoDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("birthinfo0eb8doctype");
    
    /**
     * Gets the "BirthInfo" element
     */
    oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo getBirthInfo();
    
    /**
     * Sets the "BirthInfo" element
     */
    void setBirthInfo(oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo birthInfo);
    
    /**
     * Appends and returns a new empty "BirthInfo" element
     */
    oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo addNewBirthInfo();
    
    /**
     * An XML BirthInfo(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface BirthInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BirthInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("birthinfoa7d1elemtype");
        
        /**
         * Gets array of all "BirthInfoElement" elements
         */
        oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement[] getBirthInfoElementArray();
        
        /**
         * Gets ith "BirthInfoElement" element
         */
        oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement getBirthInfoElementArray(int i);
        
        /**
         * Returns number of "BirthInfoElement" element
         */
        int sizeOfBirthInfoElementArray();
        
        /**
         * Sets array of all "BirthInfoElement" element
         */
        void setBirthInfoElementArray(oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement[] birthInfoElementArray);
        
        /**
         * Sets ith "BirthInfoElement" element
         */
        void setBirthInfoElementArray(int i, oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement birthInfoElement);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "BirthInfoElement" element
         */
        oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement insertNewBirthInfoElement(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "BirthInfoElement" element
         */
        oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement addNewBirthInfoElement();
        
        /**
         * Removes the ith "BirthInfoElement" element
         */
        void removeBirthInfoElement(int i);
        
        /**
         * Gets the "BirthPlaceDetails" element
         */
        oasisNamesTcCiqXal3.AddressType getBirthPlaceDetails();
        
        /**
         * True if has "BirthPlaceDetails" element
         */
        boolean isSetBirthPlaceDetails();
        
        /**
         * Sets the "BirthPlaceDetails" element
         */
        void setBirthPlaceDetails(oasisNamesTcCiqXal3.AddressType birthPlaceDetails);
        
        /**
         * Appends and returns a new empty "BirthPlaceDetails" element
         */
        oasisNamesTcCiqXal3.AddressType addNewBirthPlaceDetails();
        
        /**
         * Unsets the "BirthPlaceDetails" element
         */
        void unsetBirthPlaceDetails();
        
        /**
         * Gets the "BirthDateTime" attribute
         */
        java.util.Calendar getBirthDateTime();
        
        /**
         * Gets (as xml) the "BirthDateTime" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetBirthDateTime();
        
        /**
         * True if has "BirthDateTime" attribute
         */
        boolean isSetBirthDateTime();
        
        /**
         * Sets the "BirthDateTime" attribute
         */
        void setBirthDateTime(java.util.Calendar birthDateTime);
        
        /**
         * Sets (as xml) the "BirthDateTime" attribute
         */
        void xsetBirthDateTime(org.apache.xmlbeans.XmlDateTime birthDateTime);
        
        /**
         * Unsets the "BirthDateTime" attribute
         */
        void unsetBirthDateTime();
        
        /**
         * Gets the "BirthDateTimePrecision" attribute
         */
        org.apache.xmlbeans.GDuration getBirthDateTimePrecision();
        
        /**
         * Gets (as xml) the "BirthDateTimePrecision" attribute
         */
        org.apache.xmlbeans.XmlDuration xgetBirthDateTimePrecision();
        
        /**
         * True if has "BirthDateTimePrecision" attribute
         */
        boolean isSetBirthDateTimePrecision();
        
        /**
         * Sets the "BirthDateTimePrecision" attribute
         */
        void setBirthDateTimePrecision(org.apache.xmlbeans.GDuration birthDateTimePrecision);
        
        /**
         * Sets (as xml) the "BirthDateTimePrecision" attribute
         */
        void xsetBirthDateTimePrecision(org.apache.xmlbeans.XmlDuration birthDateTimePrecision);
        
        /**
         * Unsets the "BirthDateTimePrecision" attribute
         */
        void unsetBirthDateTimePrecision();
        
        /**
         * Gets the "DataQualityType" attribute
         */
        oasisNamesTcCiqCt3.DataQualityTypeList.Enum getDataQualityType();
        
        /**
         * Gets (as xml) the "DataQualityType" attribute
         */
        oasisNamesTcCiqCt3.DataQualityTypeList xgetDataQualityType();
        
        /**
         * True if has "DataQualityType" attribute
         */
        boolean isSetDataQualityType();
        
        /**
         * Sets the "DataQualityType" attribute
         */
        void setDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList.Enum dataQualityType);
        
        /**
         * Sets (as xml) the "DataQualityType" attribute
         */
        void xsetDataQualityType(oasisNamesTcCiqCt3.DataQualityTypeList dataQualityType);
        
        /**
         * Unsets the "DataQualityType" attribute
         */
        void unsetDataQualityType();
        
        /**
         * Gets the "ValidFrom" attribute
         */
        java.util.Calendar getValidFrom();
        
        /**
         * Gets (as xml) the "ValidFrom" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetValidFrom();
        
        /**
         * True if has "ValidFrom" attribute
         */
        boolean isSetValidFrom();
        
        /**
         * Sets the "ValidFrom" attribute
         */
        void setValidFrom(java.util.Calendar validFrom);
        
        /**
         * Sets (as xml) the "ValidFrom" attribute
         */
        void xsetValidFrom(org.apache.xmlbeans.XmlDateTime validFrom);
        
        /**
         * Unsets the "ValidFrom" attribute
         */
        void unsetValidFrom();
        
        /**
         * Gets the "ValidTo" attribute
         */
        java.util.Calendar getValidTo();
        
        /**
         * Gets (as xml) the "ValidTo" attribute
         */
        org.apache.xmlbeans.XmlDateTime xgetValidTo();
        
        /**
         * True if has "ValidTo" attribute
         */
        boolean isSetValidTo();
        
        /**
         * Sets the "ValidTo" attribute
         */
        void setValidTo(java.util.Calendar validTo);
        
        /**
         * Sets (as xml) the "ValidTo" attribute
         */
        void xsetValidTo(org.apache.xmlbeans.XmlDateTime validTo);
        
        /**
         * Unsets the "ValidTo" attribute
         */
        void unsetValidTo();
        
        /**
         * An XML BirthInfoElement(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.BirthInfoDocument$BirthInfo$BirthInfoElement.
         */
        public interface BirthInfoElement extends oasisNamesTcCiqCt3.String
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BirthInfoElement.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("birthinfoelement6e7celemtype");
            
            /**
             * Gets the "Type" attribute
             */
            oasisNamesTcCiqXpil3.BirthInfoElementList.Enum getType();
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            oasisNamesTcCiqXpil3.BirthInfoElementList xgetType();
            
            /**
             * True if has "Type" attribute
             */
            boolean isSetType();
            
            /**
             * Sets the "Type" attribute
             */
            void setType(oasisNamesTcCiqXpil3.BirthInfoElementList.Enum type);
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            void xsetType(oasisNamesTcCiqXpil3.BirthInfoElementList type);
            
            /**
             * Unsets the "Type" attribute
             */
            void unsetType();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement newInstance() {
                  return (oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo.BirthInfoElement) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo newInstance() {
              return (oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.BirthInfoDocument.BirthInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.BirthInfoDocument newInstance() {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.BirthInfoDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.BirthInfoDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
