/*
 * An XML document type.
 * Localname: ElectronicAddressIdentifiers
 * Namespace: urn:oasis:names:tc:ciq:xpil:3
 * Java type: oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument
 *
 * Automatically generated - do not modify.
 */
package oasisNamesTcCiqXpil3;


/**
 * A document containing one ElectronicAddressIdentifiers(@urn:oasis:names:tc:ciq:xpil:3) element.
 *
 * This is a complex type.
 */
public interface ElectronicAddressIdentifiersDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ElectronicAddressIdentifiersDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("electronicaddressidentifiersb7efdoctype");
    
    /**
     * Gets the "ElectronicAddressIdentifiers" element
     */
    oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers getElectronicAddressIdentifiers();
    
    /**
     * Sets the "ElectronicAddressIdentifiers" element
     */
    void setElectronicAddressIdentifiers(oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers electronicAddressIdentifiers);
    
    /**
     * Appends and returns a new empty "ElectronicAddressIdentifiers" element
     */
    oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers addNewElectronicAddressIdentifiers();
    
    /**
     * An XML ElectronicAddressIdentifiers(@urn:oasis:names:tc:ciq:xpil:3).
     *
     * This is a complex type.
     */
    public interface ElectronicAddressIdentifiers extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ElectronicAddressIdentifiers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("electronicaddressidentifiers3201elemtype");
        
        /**
         * Gets array of all "ElectronicAddressIdentifier" elements
         */
        oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier[] getElectronicAddressIdentifierArray();
        
        /**
         * Gets ith "ElectronicAddressIdentifier" element
         */
        oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier getElectronicAddressIdentifierArray(int i);
        
        /**
         * Returns number of "ElectronicAddressIdentifier" element
         */
        int sizeOfElectronicAddressIdentifierArray();
        
        /**
         * Sets array of all "ElectronicAddressIdentifier" element
         */
        void setElectronicAddressIdentifierArray(oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier[] electronicAddressIdentifierArray);
        
        /**
         * Sets ith "ElectronicAddressIdentifier" element
         */
        void setElectronicAddressIdentifierArray(int i, oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier electronicAddressIdentifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ElectronicAddressIdentifier" element
         */
        oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier insertNewElectronicAddressIdentifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ElectronicAddressIdentifier" element
         */
        oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier addNewElectronicAddressIdentifier();
        
        /**
         * Removes the ith "ElectronicAddressIdentifier" element
         */
        void removeElectronicAddressIdentifier(int i);
        
        /**
         * An XML ElectronicAddressIdentifier(@urn:oasis:names:tc:ciq:xpil:3).
         *
         * This is an atomic type that is a restriction of oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument$ElectronicAddressIdentifiers$ElectronicAddressIdentifier.
         */
        public interface ElectronicAddressIdentifier extends oasisNamesTcCiqCt3.String
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ElectronicAddressIdentifier.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s632F9390BB2A4D50122A50EF442FAFFF").resolveHandle("electronicaddressidentifier0d6eelemtype");
            
            /**
             * Gets the "Type" attribute
             */
            oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList.Enum getType();
            
            /**
             * Gets (as xml) the "Type" attribute
             */
            oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList xgetType();
            
            /**
             * True if has "Type" attribute
             */
            boolean isSetType();
            
            /**
             * Sets the "Type" attribute
             */
            void setType(oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList.Enum type);
            
            /**
             * Sets (as xml) the "Type" attribute
             */
            void xsetType(oasisNamesTcCiqXpil3.ElectronicAddressIdentifierTypeList type);
            
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
             * Gets the "Usage" attribute
             */
            java.lang.String getUsage();
            
            /**
             * Gets (as xml) the "Usage" attribute
             */
            oasisNamesTcCiqXpil3.ElectronicAddressIdentifierUsageList xgetUsage();
            
            /**
             * True if has "Usage" attribute
             */
            boolean isSetUsage();
            
            /**
             * Sets the "Usage" attribute
             */
            void setUsage(java.lang.String usage);
            
            /**
             * Sets (as xml) the "Usage" attribute
             */
            void xsetUsage(oasisNamesTcCiqXpil3.ElectronicAddressIdentifierUsageList usage);
            
            /**
             * Unsets the "Usage" attribute
             */
            void unsetUsage();
            
            /**
             * Gets the "Label" attribute
             */
            java.lang.String getLabel();
            
            /**
             * Gets (as xml) the "Label" attribute
             */
            oasisNamesTcCiqCt3.String xgetLabel();
            
            /**
             * True if has "Label" attribute
             */
            boolean isSetLabel();
            
            /**
             * Sets the "Label" attribute
             */
            void setLabel(java.lang.String label);
            
            /**
             * Sets (as xml) the "Label" attribute
             */
            void xsetLabel(oasisNamesTcCiqCt3.String label);
            
            /**
             * Unsets the "Label" attribute
             */
            void unsetLabel();
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier newInstance() {
                  return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers.ElectronicAddressIdentifier) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers newInstance() {
              return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument.ElectronicAddressIdentifiers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument newInstance() {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (oasisNamesTcCiqXpil3.ElectronicAddressIdentifiersDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
